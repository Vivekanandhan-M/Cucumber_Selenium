$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ADMIN/eclipse-workspace/RestAssuredAPI/CucumberGradle/src/test/java/com/qa/Feature/Google.feature");
formatter.feature({
  "name": "Verifying the acme-test account details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To get the details of Work Items",
  "description": "",
  "keyword": "Scenario"
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
});