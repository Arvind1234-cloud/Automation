package com.d.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.d.basePage.BasePage;

public class CustomerRegistration extends BasePage{
	
	@FindBy(linkText="Sign in")WebElement linkSignin;
	@FindBy(id="email_create")WebElement txtEmail;
	@FindBy(id="SubmitCreate")WebElement btnCreateanAccount;
	@FindBy(xpath="//h1[text()='Create an account']")WebElement txtCreateanAccount;
	@FindBy(id="id_gender1")WebElement radioMr;
	@FindBy(id="customer_firstname")WebElement txtFirstName;
	@FindBy(id="customer_lastname")WebElement txtLastName;
	@FindBy(id="passwd")WebElement txtPassword;
	@FindBy(id="days")WebElement dropdownDays;
	@FindBy(id="months")WebElement dropdownMonths;
	@FindBy(id="years")WebElement dropdownYears;
	@FindBy(id="address1")WebElement txtAddress;
	@FindBy(id="city")WebElement txtCity;
	@FindBy(id="id_state")WebElement dropdownState;
	@FindBy(id="postcode")WebElement txtZipcode;
	@FindBy(id="id_country")WebElement dropdownCountry;
	@FindBy(id="phone_mobile")WebElement txtMobilenumber;
	@FindBy(id="alias")WebElement txtAliasAddress;
	@FindBy(id="submitAccount")WebElement btnRegister;
	
	public CustomerRegistration(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

public void CreateLoginAccount() throws Exception{
	linkSignin.click();
	txtEmail.sendKeys(getData("firstName")+getData("lastName")+randomnumber()+getData("domainName"));
	btnCreateanAccount.click();
	Thread.sleep(5000);
	radioMr.click();
	txtFirstName.sendKeys("arvind");
	txtLastName.sendKeys("bp");
	txtPassword.sendKeys("arv@1234");
	selectOption(dropdownDays, 4);
	selectOption(dropdownMonths, 5);
	selectOption(dropdownYears, 8);
	txtAddress.sendKeys("BSR");
	txtCity.sendKeys("Hyderabad");
	selectOption(dropdownState, 2);
	txtZipcode.sendKeys("12345");
	selectOption(dropdownCountry, 1);
	txtMobilenumber.sendKeys("0987654321");
	txtAliasAddress.sendKeys("Bangalore");
	Thread.sleep(2000);
	btnRegister.click();
	}

}