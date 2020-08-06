package registroUsuario
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegistroUsuario {


	@Given("que he ingresado a la página principal de Registro")
	def IngresoPaginaPrincipal() {
		println "Ingresar páina principal de Registro"

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://thetestingworld.com/testings/')

		WebUI.maximizeWindow()
	}


	@And("he ingresado en el campo Usename (.*)")
	def IngresarCampoUsename(String Username) {
		println "Ingresar campo Username"

		WebUI.setText(findTestObject('Object Repository/RegistroUsuario/Username'), Username)
	}


	@And("he ingresado en el campo Email (.*)")
	def IngresarCampoEmail(String Email) {
		println "Ingresar campo Username"

		WebUI.setText(findTestObject('Object Repository/RegistroUsuario/Email'), Email)
	}


	@And("he ingresado en el campo Password (.*)")
	def IngresarCampoPassword(String Password1) {
		println "Ingresar campo Password"

		WebUI.setEncryptedText(findTestObject('Object Repository/RegistroUsuario/Password1'), Password1)
	}


	@And("he ingresado en el campo Confirm Password (.*)")
	def IngresarCampoConfirmPassword(String Password2) {
		println "Ingresar campo Confirm Password"

		WebUI.setEncryptedText(findTestObject('Object Repository/RegistroUsuario/Password2'), Password2)
	}


	@And("he seleccionado en el campo Date")
	def SeleccionarCampoDate() {
		println "Ingresar campo Date"


		WebUI.click(findTestObject('Object Repository/RegistroUsuario/HomeOffice_dob'))

		WebUI.click(findTestObject('Object Repository/RegistroUsuario/a_3'))
	}


	@And("he ingresado en el campo Phone (.*)")
	def IngresarCampoPhone(String Phone) {
		println "Ingresar campo Phone"

		WebUI.setText(findTestObject('Object Repository/RegistroUsuario/Phone'), Phone)
	}


	@And("he seleccionado en el campo Choose Gender")
	def SeleccionarCampoChoose() {
		println "Ingresar campo Choose Gender"

		WebUI.selectOptionByValue(findTestObject('Object Repository/RegistroUsuario/ChooseGender'), '1', true)
	}


	@And("he seleccionado en el campo Terms and Conditions")
	def SeleccionarCampoTerms() {
		println "Ingresar campo Terms and conditions"


		WebUI.click(findTestObject('Object Repository/RegistroUsuario/input_Address type HomeOffice_terms'))
	}



	@When("seleccione el botón SignUp")
	def SeleccionarBotonSignUp() {
		println "Seleccionar el botón Signup"


		WebUI.click(findTestObject('Object Repository/RegistroUsuario/btnSign'))
	}


	@Then("Debería visualizar el registro limpio")
	def VisualizarRegistro() {
		println "Visualizar la creación del Registro"


		WebUI.click(findTestObject('RegistroUsuario/RegistroExitoso_Limpiado'))

		WebUI.closeBrowser()
	}
}