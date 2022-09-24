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

WebUI.maximizeWindow()

for (def r=1;r<=findTestData('Company Name').getRowNumbers();r++)
{
WebUI.navigateToUrl('https://www.salezcrm.com/testing/public/admin/Settings?Module=CompanyDetails&parent=Setting&view=index&fieldid=18')

WebUI.click(findTestObject('Login Page Screen/Company Name'))

WebUI.setText(findTestObject('Login Page Screen/Company Name'), 'DBTESTONE')

WebUI.click(findTestObject('Login Page Screen/Username'))

WebUI.setText(findTestObject('Login Page Screen/Username'), 'rsoft')

WebUI.click(findTestObject('Login Page Screen/Password'))

WebUI.setText(findTestObject('Login Page Screen/Password'), 'RSoft!@345')

WebUI.click(findTestObject('Login Page Screen/Login Button'))

String header_value = WebUI.getText(findTestObject('Company Details/Company Name Header'))

String detail_value = WebUI.getText(findTestObject('Company Details/Company Name Detail'))

WebUI.verifyEqual(header_value, detail_value)

WebUI.click(findTestObject('Company Details/Edit Button'))

String edit_value = WebUI.getAttribute(findTestObject('Company Details/Company Name Edit'), 'value')

WebUI.verifyEqual(detail_value, edit_value)

WebUI.setText(findTestObject('Company Details/Company Name Edit'), findTestData('Company Name').getValue(1, r))

String edit_value_updated = WebUI.getAttribute(findTestObject('Company Details/Company Name Edit'), 'value')

WebUI.click(findTestObject('Company Details/Save Button'))

String detail_value_updated = WebUI.getText(findTestObject('Company Details/Company Name Detail'))

WebUI.verifyEqual(edit_value_updated, detail_value_updated)

String header_value_updated = WebUI.getText(findTestObject('Company Details/Company Name Header'))

WebUI.verifyEqual(header_value_updated, detail_value_updated)

WebUI.click(findTestObject('Company Details/Profile Icon'))

WebUI.click(findTestObject('Company Details/Logout Button'))

}
WebUI.closeBrowser()

