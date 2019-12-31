$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ADMIN/eclipse-workspace/RestAssuredAPI/CucumberGradle_git/Cucumber_Selenium/src/test/java/com/qa/Feature/acme-test.feature");
formatter.feature({
  "name": "Verifying the acme-test account details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To get the details of Work Items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logins into acme_test site",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkItem.user_logins_into_acme_test_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Work Items tab",
  "keyword": "When "
});
formatter.match({
  "location": "WorkItem.user_navigates_to_Work_Items_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User collects the details of following workItems",
  "rows": [
    {
      "cells": [
        "570571"
      ]
    },
    {
      "cells": [
        "413055"
      ]
    },
    {
      "cells": [
        "666221"
      ]
    },
    {
      "cells": [
        "478262"
      ]
    },
    {
      "cells": [
        "902554"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WorkItem.collects_details_of_workitems(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "compare the workItems results with expected one",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkItem.compare_the_workitems_results_with_expected_one()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To download the monthly report",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user navigates to monthly reports screen",
  "keyword": "When "
});
formatter.step({
  "name": "user download the monthly reposts based on \"\u003cVendor\u003e\" and \"\u003cMonth\u003e\" and \"\u003cYear\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Vendor",
        "Month",
        "Year"
      ]
    },
    {
      "cells": [
        "DE763212",
        "January",
        "2018"
      ]
    },
    {
      "cells": [
        "IT754893",
        "March",
        "2018"
      ]
    },
    {
      "cells": [
        "RO123456",
        "February",
        "2018"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To download the monthly report",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkItem.user_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to monthly reports screen",
  "keyword": "When "
});
formatter.match({
  "location": "WorkItem.user_navigates_to_monthly_reports_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user download the monthly reposts based on \"DE763212\" and \"January\" and \"2018\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkItem.user_download_the_monthly_reposts_based_on_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To download the monthly report",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkItem.user_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to monthly reports screen",
  "keyword": "When "
});
formatter.match({
  "location": "WorkItem.user_navigates_to_monthly_reports_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user download the monthly reposts based on \"IT754893\" and \"March\" and \"2018\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkItem.user_download_the_monthly_reposts_based_on_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To download the monthly report",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WorkItem.user_navigates_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to monthly reports screen",
  "keyword": "When "
});
formatter.match({
  "location": "WorkItem.user_navigates_to_monthly_reports_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user download the monthly reposts based on \"RO123456\" and \"February\" and \"2018\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkItem.user_download_the_monthly_reposts_based_on_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Quite the browser",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Last"
    }
  ]
});
formatter.step({
  "name": "Quit the browser completely",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkItem.quit_the_browser_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});