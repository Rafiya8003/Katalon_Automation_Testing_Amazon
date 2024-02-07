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

CustomKeywords.'com.test.demo.AmazonPage.loginToAmazon'(username, password)

WebUI.setText(findTestObject('Object Repository/Amazon_Add_To_Cart/input_field-keywords'), 'Da Vinci')

WebUI.click(findTestObject('Object Repository/Amazon_Add_To_Cart/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_Add_To_Cart/img_s-image'))

WebUI.switchToWindowTitle('Buy Leonardo da Vinci Book Online at Low Prices in India | Leonardo da Vinci Reviews & Ratings - Amazon.in')

WebUI.click(findTestObject('Object Repository/Amazon_Add_To_Cart/input_submit.add-to-cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_Add_To_Cart/span_Added to Cart'), 'Added to Cart')

WebUI.closeBrowser()

