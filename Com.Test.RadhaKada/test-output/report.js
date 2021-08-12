$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Orders.feature");
formatter.feature({
  "name": "Order an Item",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are common login steps for every scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to signin page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.navigate_to_signin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter emailId and password",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_emailId_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page landed to My account on successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_landed_to_My_account_on_successful_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Order T-Shirt",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user clicks on T-shirt menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_clicks_on_T_shirt_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on T-shirt item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_T_shirt_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Add to Cart",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_clicks_on_Add_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view cart success message",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_cart_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Proceed to Checkout",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_clicks_on_Proceed_to_Checkout()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //span[normalize-space()\u003d\u0027Proceed to checkout\u0027] (tried for 30 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027INFORADHAK\u0027, ip: \u0027192.168.1.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 92.0.4515.131, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\INFOMA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:62064}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 381f6e22cd951bffe67b2465f46fc212\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utilities.WaitHelper.WaitForElement(WaitHelper.java:26)\r\n\tat pageObjects.OrdersPage.clickonProccedtoCheckoutbtn_cart(OrdersPage.java:86)\r\n\tat stepDefinitions.Steps.user_clicks_on_Proceed_to_Checkout(Steps.java:145)\r\n\tat ✽.user clicks on Proceed to Checkout(file:Features/Orders.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user can view Shopping-Cart Summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Shopping_Cart_Summary_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Proceed to Checkout from Shopping-Cart Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_clicks_on_Proceed_to_Checkout_from_Shopping_Cart_Summary_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Proceed to Checkout from Addresses page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_Proceed_to_Checkout_from_Addresses_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Terms and Conditions checkbox from Shipping page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_Terms_and_Conditions_checkbox_from_Shipping_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Proceed to Checkout from Shipping page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_Proceed_to_Checkout_from_Shipping_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Pay by Check mode of payment from Payment page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_Pay_by_Check_mode_of_payment_from_Payment_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Confirm order",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_Confirm_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can view Order Confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Order_Confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can view Order completion message",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_can_view_Order_completion_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user get an order reference code from order confirmation page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_get_an_order_reference_code_from_order_confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on back to orders",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_back_to_orders()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can view Order history page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Order_history_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "order is displayed in order history table",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.order_is_displayed_in_order_history_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on WINDOWS (381f6e22cd951bffe67b2465f46fc212)] -\u003e xpath: //a[@class \u003d \u0027logout\u0027 and @title \u003d \u0027Log me out\u0027]] (tried for 30 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027INFORADHAK\u0027, ip: \u0027192.168.1.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 92.0.4515.131, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\INFOMA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:62064}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 381f6e22cd951bffe67b2465f46fc212\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utilities.WaitHelper.WaitForElement(WaitHelper.java:20)\r\n\tat pageObjects.LoginPage.clickSignout(LoginPage.java:71)\r\n\tat stepDefinitions.Steps.teardown(Steps.java:63)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:126)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:66)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:156)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
});