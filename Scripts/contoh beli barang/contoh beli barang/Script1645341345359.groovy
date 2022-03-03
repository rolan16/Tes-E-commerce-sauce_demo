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

WebUI.callTestCase(findTestCase('login/valid user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('add and remove button/sauce labs backpack/add sauce labs backpack'))

WebUI.click(findTestObject('shopping cart button/shopping cart button'))

currenturl = WebUI.getUrl()

WebUI.verifyMatch(currenturl, 'https://www.saucedemo.com/cart.html', false)

WebUI.click(findTestObject('button/checkout button'))

currenturl = WebUI.getUrl()

WebUI.verifyMatch(currenturl, 'https://www.saucedemo.com/checkout-step-one.html', false)

WebUI.setText(findTestObject('input data/input first name'), 'Rolan')

WebUI.setText(findTestObject('input data/input last name'), 'Fransiskus')

WebUI.setText(findTestObject('input data/input post code'), '17610')

WebUI.click(findTestObject('button/continue button'))

currenturl = WebUI.getUrl()

WebUI.verifyMatch(currenturl, 'https://www.saucedemo.com/checkout-step-two.html', false)

WebUI.click(findTestObject('button/finish button'))

currenturl = WebUI.getUrl()

WebUI.verifyMatch(currenturl, 'https://www.saucedemo.com/checkout-complete.html', false)

WebUI.click(findTestObject('button/back home button'))

currenturl = WebUI.getUrl()

WebUI.verifyMatch(currenturl, 'https://www.saucedemo.com/inventory.html', false)

