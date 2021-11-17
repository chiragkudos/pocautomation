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

WebUI.mouseOver(findTestObject('Page_South Australia Police Force/a_Your Options'))

WebUI.click(findTestObject('Page_South Australia Police Force/span_Pay your fine'))

WebUI.click(findTestObject('Object Repository/Page_South Australia Police Force/a_Get Started'))

WebUI.setText(findTestObject('Object Repository/Page_South Australia Police Force/input_Infringement number_Identifier'), 
    'GENIX1234')

WebUI.setText(findTestObject('Object Repository/Page_South Australia Police Force/input_Vehicle Registration Number_VRN'), 
    'AUS10NX105')

WebUI.setText(findTestObject('Object Repository/Page_South Australia Police Force/input_Alleged Offence Date_btn'), '10-12-2020')

WebUI.click(findTestObject('Page_South Australia Police Force/btn_Next'))

