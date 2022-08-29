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

WebUI.navigateToUrl('https://dev.p2p.alamisharia.co.id/')

WebUI.click(findTestObject('Daftar/Daftar_disini'))

WebUI.verifyElementClickable(findTestObject('Daftar/verifyelement_pageRegister'))

WebUI.delay(3)

WebUI.click(findTestObject('Daftar/Click_pemberiDana'))

WebUI.delay(3)

WebUI.setText(findTestObject('Daftar/InputName'), 'Rendi Eduardi')

WebUI.setText(findTestObject('Daftar/Email'), 'rendy.ardy51@gmail.com')

WebUI.setText(findTestObject('Daftar/Phone'), '08973211139')

WebUI.setText(findTestObject('Daftar/Password'), 'tester123456')

WebUI.click(findTestObject('Daftar/see_password'))

WebUI.click(findTestObject('Daftar/Pilih_JenisAkun'))

WebUI.selectOptionByValue(findTestObject('Daftar/Picklist_TauAlami'), '2', false)

WebUI.delay(3)

WebUI.click(findTestObject('Daftar/Btn_Lanjutkan1'))

WebUI.scrollToElement(findTestObject('Daftar/Scroll_kebijakan'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Daftar/checkbox_Langgan'))

WebUI.click(findTestObject('Daftar/checkbox_setujukebijakan'))

WebUI.click(findTestObject('Daftar/Btn_lanjutkan2'))

