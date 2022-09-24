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

String URL = 'https://www.salezcrm.com/testing/public/admin/Settings?Module=CompanyDetails&parent=Setting&view=index&fieldid=18'

String Company_Name = 'DBTESTONE'

String Username = 'rsoft'

String Password = 'RSoft!@345'



WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(URL)

WebUI.click(findTestObject('Login Page Screen/Company Name'))

WebUI.setText(findTestObject('Login Page Screen/Company Name'), Company_Name)

WebUI.click(findTestObject('Login Page Screen/Username'))

WebUI.setText(findTestObject('Login Page Screen/Username'), Username)

WebUI.click(findTestObject('Login Page Screen/Password'))

WebUI.setText(findTestObject('Login Page Screen/Password'), Password)

WebUI.click(findTestObject('Login Page Screen/Login Button'))

for ( def r = 1 ; r<= findTestData('Company Details').getRowNumbers() ; r++)
	
{

println('Getting Values in Company Settings Detail View')

String Address_Detail = WebUI.getText(findTestObject('Company Details/Address Detail'))

String City_Detail = WebUI.getText(findTestObject('Company Details/City Detail'))

String State_Detail = WebUI.getText(findTestObject('Company Details/State Detail'))

String PostalCode_Detail = WebUI.getText(findTestObject('Company Details/Postal Code Detail'))

String Country_Detail = WebUI.getText(findTestObject('Company Details/Country Detail'))

String Phone_Detail = WebUI.getText(findTestObject('Company Details/Phone Detail'))

String Fax_Detail = WebUI.getText(findTestObject('Company Details/Fax Detail'))

String Website_Detail = WebUI.getText(findTestObject('Company Details/Website Detail'))

String GST_Detail = WebUI.getText(findTestObject('Company Details/GST Detail'))

WebUI.click(findTestObject('Company Details/Edit Button'))

println('Getting Values in Company Settings Edit View')

String Address_Edit = WebUI.getAttribute(findTestObject('Company Details/Address Edit'), 'value')

String City_Edit = WebUI.getAttribute(findTestObject('Company Details/City Edit'), 'value')

String State_Edit = WebUI.getAttribute(findTestObject('Company Details/State Edit'), 'value')

String PostalCode_Edit = WebUI.getAttribute(findTestObject('Company Details/Postal Code Edit'), 'value')

String Country_Edit = WebUI.getAttribute(findTestObject('Company Details/Country Edit'), 'value')

String Phone_Edit = WebUI.getAttribute(findTestObject('Company Details/Phone Edit'), 'value')

String Fax_Edit = WebUI.getAttribute(findTestObject('Company Details/Fax Edit'), 'value')

String Website_Edit = WebUI.getAttribute(findTestObject('Company Details/Website Edit'), 'value')

String GST_Edit = WebUI.getAttribute(findTestObject('Company Details/GST Edit'), 'value')

println('Comparing Values in Company Settings between Detil View and Edit view')

WebUI.verifyEqual(Address_Detail, Address_Edit)

WebUI.verifyEqual(City_Detail, City_Edit)

WebUI.verifyEqual(State_Detail, State_Edit)

WebUI.verifyEqual(PostalCode_Detail, PostalCode_Edit)

WebUI.verifyEqual(Country_Detail, Country_Edit)

WebUI.verifyEqual(Phone_Detail, Phone_Edit)

WebUI.verifyEqual(Fax_Detail, Fax_Edit)

WebUI.verifyEqual(Website_Detail, Website_Edit)

WebUI.verifyEqual(GST_Detail, GST_Edit)

println('Updating New Values in Company Settings Edit View')

WebUI.setText(findTestObject('Company Details/Address Edit'), findTestData('Company Details').getValue(1, r))

WebUI.setText(findTestObject('Company Details/City Edit'), findTestData('Company Details').getValue(2, r))

WebUI.setText(findTestObject('Company Details/State Edit'), findTestData('Company Details').getValue(3, r))

WebUI.setText(findTestObject('Company Details/Postal Code Edit'), findTestData('Company Details').getValue(4, r))

WebUI.setText(findTestObject('Company Details/Country Edit'), findTestData('Company Details').getValue(5, r))

WebUI.setText(findTestObject('Company Details/Phone Edit'), findTestData('Company Details').getValue(6, r))

WebUI.setText(findTestObject('Company Details/Fax Edit'), findTestData('Company Details').getValue(7, r))

WebUI.setText(findTestObject('Company Details/Website Edit'), findTestData('Company Details').getValue(8, r))

WebUI.setText(findTestObject('Company Details/GST Edit'), findTestData('Company Details').getValue(9, r))

println('Getting newly updated values in Company Settings Edit View')

String Address_Edit_Updated = WebUI.getAttribute(findTestObject('Company Details/Address Edit'), 'value')

String City_Edit_Updated = WebUI.getAttribute(findTestObject('Company Details/City Edit'), 'value')

String State_Edit_Updated = WebUI.getAttribute(findTestObject('Company Details/State Edit'), 'value')

String PostalCode_Edit_Updated = WebUI.getAttribute(findTestObject('Company Details/Postal Code Edit'), 'value')

String Country_Edit_Updated = WebUI.getAttribute(findTestObject('Company Details/Country Edit'), 'value')

String Phone_Edit_Updated = WebUI.getAttribute(findTestObject('Company Details/Phone Edit'), 'value')

String Fax_Edit_Updated = WebUI.getAttribute(findTestObject('Company Details/Fax Edit'), 'value')

String Website_Edit_Updated = WebUI.getAttribute(findTestObject('Company Details/Website Edit'), 'value')

String GST_Edit_Updated = WebUI.getAttribute(findTestObject('Company Details/GST Edit'), 'value')

/*

println('Comparing Values in Company Settings between Original Values and Updated Values in Edit view')

WebUI.verifyEqual(Address_Edit_Original, Address_Edit_Updated)

WebUI.verifyEqual(City_Edit_Original, City_Edit_Updated)

WebUI.verifyEqual(State_Edit_Original, State_Edit_Updated)

WebUI.verifyEqual(PostalCode_Edit_Original, PostalCode_Edit_Updated)

WebUI.verifyEqual(Country_Edit_Original, Country_Edit_Updated)

WebUI.verifyEqual(Phone_Edit_Original, Phone_Edit_Updated)

WebUI.verifyEqual(Fax_Edit_Original, Fax_Edit_Updated)

WebUI.verifyEqual(Website_Edit_Original, Website_Edit_Updated)

WebUI.verifyEqual(GST_Edit_Original, GST_Edit_Updated)

*/

WebUI.click(findTestObject('Company Details/Save Button'))

println('Getting newly updated values in Company Settings Detail View')

String Address_Detail_Updated = WebUI.getText(findTestObject('Company Details/Address Detail'))

String City_Detail_Updated = WebUI.getText(findTestObject('Company Details/City Detail'))

String State_Detail_Updated = WebUI.getText(findTestObject('Company Details/State Detail'))

String PostalCode_Detail_Updated = WebUI.getText(findTestObject('Company Details/Postal Code Detail'))

String Country_Detail_Updated = WebUI.getText(findTestObject('Company Details/Country Detail'))

String Phone_Detail_Updated = WebUI.getText(findTestObject('Company Details/Phone Detail'))

String Fax_Detail_Updated = WebUI.getText(findTestObject('Company Details/Fax Detail'))

String Website_Detail_Updated = WebUI.getText(findTestObject('Company Details/Website Detail'))

String GST_Detail_Updated = WebUI.getText(findTestObject('Company Details/GST Detail'))

println('Comparing Values in Company Settings between Detail View Updated and Edit View Updated Values')

WebUI.verifyEqual(Address_Detail_Updated, Address_Edit_Updated)

WebUI.verifyEqual(City_Detail_Updated, City_Edit_Updated)

WebUI.verifyEqual(State_Detail_Updated, State_Edit_Updated)

WebUI.verifyEqual(PostalCode_Detail_Updated, PostalCode_Edit_Updated)

WebUI.verifyEqual(Country_Detail_Updated, Country_Edit_Updated)

WebUI.verifyEqual(Phone_Detail_Updated, Phone_Edit_Updated)

WebUI.verifyEqual(Fax_Detail_Updated, Fax_Edit_Updated)

WebUI.verifyEqual(Website_Detail_Updated, Website_Edit_Updated)

WebUI.verifyEqual(GST_Detail_Updated, GST_Edit_Updated)

}

WebUI.click(findTestObject('Company Details/Profile Icon'))

WebUI.click(findTestObject('Company Details/Logout Button'))

WebUI.closeBrowser()

