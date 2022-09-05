package com.challenge;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;
import io.appium.java_client.MobileElement;

public class FeatureEntrar {
	LocalDate dateObj = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
    String currentDateString = dateObj.format(formatter);
    
	@Test
	public void signUp() throws MalformedURLException {
		AppiumDriverConfig driver = new AppiumDriverConfig();

		MobileElement botaoCadastrar = (MobileElement)driver.driver.findElementByAccessibilityId("Cadastrar");
		botaoCadastrar .click();
		
		MobileElement signUpButton = (MobileElement) driver.driver.findElementByAccessibilityId("Cadastrar");
		signUpButton.click();
		
		MobileElement phoneNumber = (MobileElement) driver.driver.findElementByAccessibilityId("insira o numero de celular");
		phoneNumber.sendKeys("47999991234");
		
		MobileElement nextButton = (MobileElement) driver.driver.findElementByAccessibilityId("Botao Avancar");
		nextButton.click();
		
		MobileElement nameField = (MobileElement) driver.driver.findElementByAccessibilityId("Insira o nome completo");
		nameField.sendKeys("nome completo");
		
		MobileElement confirmButton = (MobileElement) driver.driver.findElementByAccessibilityId("Botao Avancar");
		confirmButton.click();
		
		MobileElement localization = (MobileElement) driver.driver.findElementByAccessibilityId("LOCALIZAÇÃO AUTOMÁTICA");
		localization.click();
		
		MobileElement yesButton = (MobileElement) driver.driver.findElementByAccessibilityId("Sim");
		yesButton.click();
		
		MobileElement currentDate = (MobileElement) driver.driver.findElementByAccessibilityId("09/05/22");
		assertTrue(currentDate.isDisplayed());
	}
	
}
