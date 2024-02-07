package com.test.demo

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
public class AmazonPage {

	@Keyword
	def static void loginToAmazon(String username, String password) {
		// Open browser and navigate to Amazon website
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.amazon.in/')

		// Click on the sign-in link
		WebUI.click(findTestObject('Object Repository/Amazon_Login_001/Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, sign in'))

		// Enter email and click continue
		WebUI.setText(findTestObject('Object Repository/Amazon_Login_001/Page_Amazon Sign In/input_email'), username)
		WebUI.click(findTestObject('Object Repository/Amazon_Login_001/Page_Amazon Sign In/inputcontinue'))

		// Enter password and click sign in
		WebUI.setText(findTestObject('Object Repository/Amazon_Login_001/Page_Amazon Sign In/input_password'), password)
		WebUI.click(findTestObject('Object Repository/Amazon_Login_001/Page_Amazon Sign In/inputsignInSubmit'))

		// Verify successful login
		WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon_Login_001/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign Out'), 0)
	}
}
