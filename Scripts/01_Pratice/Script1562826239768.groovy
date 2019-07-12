import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Page_easyTravel - One step to happiness/a_Home'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_easyTravel - One step to happiness/a_Special Offers'))

WebUI.click(findTestObject('Object Repository/Page_Special Offers - Landing Page/a_About'))

WebUI.click(findTestObject('Object Repository/Page_easyTravel - About/a_Contact'))

WebUI.click(findTestObject('Object Repository/Page_easyTravel - Contact/a_Terms of Use'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_easyTravel - Terms of Use/a_Privacy Policy'))

WebUI.closeBrowser()

