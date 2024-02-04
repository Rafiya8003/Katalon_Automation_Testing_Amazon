import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.setText(findTestObject('Object Repository/Amazon_Search/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    'Da Vinci')

WebUI.click(findTestObject('Object Repository/Amazon_Search/Page_Online Shopping site in India Shop Onl_10c5f3/inputnav-search-submit-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_Search/Page_Amazon.in  Da Vinci/span_Da Vinci'), '"Da Vinci"')

WebUI.setText(findTestObject('Object Repository/Amazon_Search/Page_Amazon.in  Da Vinci/input_field-keywords'), 'Mobile Phones')

WebUI.click(findTestObject('Object Repository/Amazon_Search/Page_Amazon.in  Da Vinci/inputnav-search-submit-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_Search/Page_Amazon.in  Mobile Phones/span_Mobile Phones'), 
    '"Mobile Phones"')

WebUI.setText(findTestObject('Object Repository/Amazon_Search/Page_Amazon.in  Mobile Phones/input_field-keywords'), 'Laptop')

WebUI.click(findTestObject('Object Repository/Amazon_Search/Page_Amazon.in  Da Vinci/inputnav-search-submit-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_Search/Page_Amazon.in  Laptop/span_Laptop'), '"Laptop"')

WebUI.closeBrowser()

