package com.qa.Stepdefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.thoughtworks.selenium.Wait;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class WorkItem {

	public static WebDriver driver;
	HashMap<String, ArrayList<String>> expectedWorkList = new HashMap<String, ArrayList<String>>();
	HashMap<String, ArrayList<String>> actualdWorkList = new HashMap<String, ArrayList<String>>();
	
@Before("@First")
public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver","E:\\Software\\Selenium\\Browser Driver\\GC_Driver\\79\\chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.get("http://www.acme-test.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("mvivekeie2009@gmail.com");
	driver.findElement(By.id("password")).sendKeys("10aer025");
	driver.findElement(By.id("buttonLogin")).click();
}
	
@SuppressWarnings("deprecation")
@Given("^User logins into acme_test site$")
public void user_logins_into_acme_test_site() {
	
	/*driver.get("http://www.acme-test.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("mvivekeie2009@gmail.com");
	driver.findElement(By.id("password")).sendKeys("10aer025");
	driver.findElement(By.id("buttonLogin")).click();*/
	String title = driver.getTitle();
	Assert.assertEquals("ACME System 1 - Account - Log In", title);
}


@When("^User navigates to Work Items tab$")
public void user_navigates_to_Work_Items_tab() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", driver.findElement(By.xpath(".//*[contains(@id,'dashmenu')]/div[2]/a/button")));
	String pageTitle = driver.getTitle().trim();

}

@Then("^User collects the details of following workItems$")
public void collects_details_of_workitems(DataTable data){
	expectedWorkList.put("570571", new ArrayList<String>(Arrays.asList("570571","Verify Account Position","WI1","2019-03-23")));
	expectedWorkList.put("413055", new ArrayList<String>(Arrays.asList("413055","Calculate Client Security Hash","WI5","2017-08-24")));
	expectedWorkList.put("666221", new ArrayList<String>(Arrays.asList("666221","Verify Account Position","WI1","2017-02-20")));
	expectedWorkList.put("478262", new ArrayList<String>(Arrays.asList("478262","Research Client Check Copy","WI2","2018-03-21")));
	expectedWorkList.put("902554", new ArrayList<String>(Arrays.asList("902554","Generate Yearly Report for Vendor","WI4","2017-07-10")));

	List<List<String>> dataList = data.raw();
	List<String> wiList = new ArrayList<String>();
	
	
	wiList.add(dataList.get(0).get(0));
	wiList.add(dataList.get(1).get(0));
	wiList.add(dataList.get(2).get(0));
	wiList.add(dataList.get(3).get(0));
	wiList.add(dataList.get(4).get(0));
	
	for(String workItem :wiList ) {
		ArrayList<String> wiDetails = new ArrayList<String>();
		wiDetails.add(driver.findElement(By.xpath(".//td[contains(text(),'"+workItem+"')]/../td[2]")).getText());
		wiDetails.add(driver.findElement(By.xpath(".//td[contains(text(),'"+workItem+"')]/../td[3]")).getText());
		wiDetails.add(driver.findElement(By.xpath(".//td[contains(text(),'"+workItem+"')]/../td[4]")).getText());
		wiDetails.add(driver.findElement(By.xpath(".//td[contains(text(),'"+workItem+"')]/../td[6]")).getText());
		actualdWorkList.put(workItem, wiDetails);
	}

	
}


@SuppressWarnings("deprecation")
@Then("^compare the workItems results with expected one$")
public void compare_the_workitems_results_with_expected_one() {
	
	for(Map.Entry<String, ArrayList<String>> entry : actualdWorkList.entrySet()) {
		ArrayList<String> actualList = entry.getValue();
		ArrayList<String> expectedList = expectedWorkList.get(actualList.get(0));
		
		
		System.out.println("actualList = > "+actualList);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("expectedList = > "+expectedList);
		System.out.println("-----------------------------------------------------------------------");
		Assert.assertEquals(expectedList, actualList);
	}
}



@Given("^User navigates to home page$")
public void user_navigates_to_home_page() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//a[contains(text(),'Home')]")).click();
}

@When("^user navigates to monthly reports screen$")
public void user_navigates_to_monthly_reports_screen() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement reports = driver.findElement(By.xpath(".//div[contains(@id,'dashmenu')]//div[8]//button"));
	WebElement monthlyReport =  driver.findElement(By.xpath(".//div[contains(@id,'dashmenu')]//div[8]//a[contains(text(),'Download Monthly Report')]"));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Actions action = new Actions(driver);
	action.moveToElement(reports).moveToElement(monthlyReport).click().build().perform();
}

@Then("^user download the monthly reposts based on \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_download_the_monthly_reposts_based_on_and_and(String Vendor, String Month, String Year) {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("vendorTaxID")).sendKeys(Vendor);
	driver.findElement(By.xpath(".//*[contains(@data-id,'reportMonth')]")).click();
	WebElement monthList = driver.findElement(By.id("reportMonth"));
	Select selectMonth = new Select(monthList);
	selectMonth.selectByVisibleText(Month);
	driver.findElement(By.xpath(".//*[contains(@data-id,'reportYear')]")).click();
	WebElement yearList = driver.findElement(By.id("reportYear"));
	Select selectYear = new Select(yearList);
	selectYear.selectByVisibleText(Year);
	driver.findElement(By.id("buttonDownload")).click();	
}

@Then("^Quit the browser completely$")
public void quit_the_browser_completely() {
	driver.close();
}

@After("@Last")
public void afterTheExecution() {
	driver.quit();
}

}
