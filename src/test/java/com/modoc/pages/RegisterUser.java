package com.modoc.pages;

import com.modoc.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {


    public RegisterUser(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(xpath = "//a[@href='/login']")
    public WebElement  signupLoginBtn;

    @FindBy(xpath = "//div[@class='signup-form']/h2")
    public WebElement newUserSignupIsVisible;

    @FindBy(name = "name")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement singUpButton;


    @FindBy(xpath = "//div[@class='login-form']/h2/b")
    public WebElement enterAccountInformation;
}
