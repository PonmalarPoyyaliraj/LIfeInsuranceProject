package in.LicInsurance.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.LicInsurance.BaseClass.BaseClass;


public class LicLoctors {
	BaseClass base=BaseClass.getInstance();
	
	 public LicLoctors() {
		 
			PageFactory.initElements(base.driver, this);
	 }
	 @FindBy(xpath = "//input[@class=\"form-control\"]")
	 private WebElement user_search;
	 
	 
	 @FindBy(xpath = "//span[@type=\"submit\"]")
	 private WebElement user_searching;

	 
	 
	 @FindBy(xpath = "//strong[contains(text(),'RFP for Empanelment of Medical')]")
	 private WebElement user_check;

	public BaseClass getBase() {
		return base;
	}



	public WebElement getUser_search() {
		return user_search;
	}



	public WebElement getUser_searching() {
		return user_searching;
	}



	public WebElement getUser_check() {
		return user_check;
	}

	//sc-2
	
	 @FindBy(xpath = "//a[text()='SSS PA Portal']")
	 WebElement user_select;
	 
	 @FindBy(xpath = "//input[@name=\"{actionForm.password}\"]")
	 WebElement user_password;
	 
	 @FindBy(xpath = "//input[@onclick=\"validateInput();return false;\"]")
	 WebElement user_submit;

	public WebElement getUser_select() {
		return user_select;
	}



	public WebElement getUser_password() {
		return user_password;
	}



	public WebElement getUser_submit() {
		return user_submit;
	}
	 
	//sc-3
	
	@FindBy(xpath = "//span[text()=' Customer Services']")
	WebElement user_customer;
	
	
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	WebElement user_clickprivacy;
    
	@FindBy(xpath = "//a[text()=' Claims settlement requirements ']")
	WebElement user_requirement;
	
	public WebElement getUser_customer() {
		return user_customer;
	}

	

	public WebElement getUser_clickprivacy() {
		return user_clickprivacy;
	}



	public WebElement getUser_requirement() {
		return user_requirement;
	}
	

	//sc-4
	@FindBy(xpath = "//button[text()='Children’s Future Planning']")
	WebElement user_clickchildrens;
	
	@FindBy(xpath = "(//a[text()='Know More '])[2]")
	WebElement user_clickknowmore;

	@FindBy(xpath = "//a[text()=' Policy Document ']")
	WebElement user_clickpolicy;

	public WebElement getUser_clickchildrens() {
		return user_clickchildrens;
	}



	public WebElement getUser_clickknowmore() {
		return user_clickknowmore;
	}



	public WebElement getUser_clickpolicy() {
		return user_clickpolicy;
	}
	
	//sc-5
	@FindBy(xpath = "//img[@alt=\"Branch Locator\"]")
	WebElement user_clickbranch;

	@FindBy(xpath = "//input[@type=\"search\"]")
	WebElement user_clicksearchbar;

	@FindBy(xpath = "//input[@type=\"search\"]")
	WebElement user_inputvalue;

	@FindBy(xpath = "//td[text()='Distinctive Code of the Branch']")
	WebElement user_clickcode;
	
	@FindBy(xpath = "//a[text()='Next']")
	WebElement user_clicknextoption;

	public final WebElement getUser_clickbranch() {
		return user_clickbranch;
	}



	public final WebElement getUser_clicksearchbar() {
		return user_clicksearchbar;
	}



	public final WebElement getUser_inputvalue() {
		return user_inputvalue;
	}



	public final WebElement getUser_clickcode() {
		return user_clickcode;
	}



	public final WebElement getUser_clicknextoption() {
		return user_clicknextoption;
	}

}