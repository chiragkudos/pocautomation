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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sapolice.portal.ccms.demo.genixclouds.com/index.html')

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_About Fines'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Whos involved'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h3_Whos involved'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_About Fines'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_The fines lifecycle'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h3_The fines lifecycle'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_About Fines'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_What happens if you dont pay'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h3_What happens if you dont pay'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_About Fines'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Authorise another person'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h3_Authorise another person'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_About Fines'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Changes to the fines system'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h3_Changes to the fines system'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_About Fines'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Excessive speed, drug and alcohol offences'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h3_Excessive speed, drug and alcohol offences'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_About Fines'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Family Violence Scheme'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h3_Family Violence Scheme'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_About Fines'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Work and Development Permit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_South Australia Police Force/h3_Work and Development Permit'), 0)

WebUI.closeBrowser()

