package com.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	WebDriver driver;

	public Pages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ico-register']")

	private WebElement Register;

	@FindBy(id = "gender-male")

	private WebElement Gender;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getSave() {
		return save;
	}

	@FindBy(id = "FirstName")

	private WebElement firstname;

	@FindBy(id = "LastName")

	private WebElement lastname;

	@FindBy(id = "Email")

	private WebElement email;

	@FindBy(id = "Password")

	private WebElement password;

	@FindBy(id = "ConfirmPassword")

	private WebElement confirmpassword;

	@FindBy(id = "register-button")

	private WebElement save;
	
	@FindBy(xpath = "//a[text()='Log in']")

	private WebElement Login;

	@FindBy(xpath = "//input[@value='Log in']")

	private WebElement LoginMail;


	@FindBy(xpath="(//a[contains(text(),'Electronics')])[3]")
	
	private WebElement ElecButton;
	
	@FindBy(xpath="(//input[@type='button'])[3]")
	
	private WebElement AddToCart;
	
	@FindBy(xpath="(//a[contains(text(),'Cell phones')])[3]")
			
	private WebElement CellLink;
	
	@FindBy(xpath="//img[@title='Show products in category Cell phones']")
	private WebElement  phoneLink;
	
	
	
	public WebElement getPhoneLink() {
		return phoneLink;

	}

	public WebElement getLogin() {
		return Login;
	}


	public WebElement getElecButton() {
		return ElecButton;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getCellLink() {
		return CellLink;
	}

	public WebElement getLoginMail() {
		return LoginMail;
	}


			

}
