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

WebUI.navigateToUrl('https://sapolice.portal.ccms.demo.genixclouds.com/index.html')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_Your Options'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Pay your fine'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/h2_Pay your fine'))

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_Your Options'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_View image'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h2_View image'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_Your Options'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_My notice history'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h2_My notice history'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_Your Options'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Payment extension'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h2_Payment extension'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_Your Options'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Nominate'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h2_Nominate'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_Your Options'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Request a review'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h2_Request a review'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_South Australia Police Force/a_Your Options'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/span_Go to court'))

WebUI.verifyElementPresent(findTestObject('Page_South Australia Police Force/h2_Go to court'), 0)

WebUI.closeBrowser()

