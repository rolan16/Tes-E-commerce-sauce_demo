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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.setText(findTestObject('login/input username'), 'standard_user')

WebUI.setText(findTestObject('login/input password'), 'secret_sauce')

WebUI.click(findTestObject('button/button login'))

currenturl = WebUI.getUrl()

WebUI.verifyMatch(currenturl, 'https://www.saucedemo.com/inventory.html', false)

WebUI.click(findTestObject('add and remove button/sauce labs backpack/add sauce labs backpack'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('add and remove button/sauce labs bike light/add sauce labs bike light'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('add and remove button/sauce labs bolt tshirt/add sauce labs bolt tshirt'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('add and remove button/sauce labs backpack/remove sauce labs backpack'))

