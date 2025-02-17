package in.LicInsurance.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.LicInsurance.BaseClass.BaseClass;


public class LicLoctors {
	BaseClass base=BaseClass.getInstance();
	
	 public LicLoctors() {
		 
			PageFactory.initElements(base.driver, this);
	 }
	 
	 @FindBy(xpath = "//button[text()='Close']")
	 private WebElement user_closeadd;
	 
	 public final WebElement getUser_closeadd() {
		return user_closeadd;
	}
	 
	 @FindBy(xpath = "//input[@placeholder=\"Search\" and @type=\"text\"]")
	 private WebElement user_search;

	 @FindBy(xpath = "//span[@type=\"submit\"]")
	 private WebElement user_searching;

	 
	 @FindBy(xpath = "//strong[contains(text(),'RFP for Empanelment of Medical')]")
	 private WebElement user_check;
	 
	 @FindBy(xpath = "//a[text()='LICA Portal']")
	 private WebElement user_scroll;

	



	public final BaseClass getBase() {
		return base;
	}



	public final void setUser_closeadd(WebElement user_closeadd) {
		this.user_closeadd = user_closeadd;
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
	 
	 @FindBy(xpath = "//a[text()='Dev Officer Portal']")
	 WebElement user_scrollssa;


	public final WebElement getUser_scrollssa() {
		return user_scrollssa;
	}

	public WebElement getUser_password() {
		return user_password;
	}


	public final WebElement getUser_select() {
		return user_select;
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
	
	@FindBy(xpath = "//a[text()=' Things you must know ']")
	WebElement user_scrolldownthings;
	
	public final WebElement getUser_scrolldownthings() {
		return user_scrolldownthings;
	}


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
	
	@FindBy(xpath = "(//a[text()='View All'])[4]")
	WebElement user_clickknowmore;

	@FindBy(xpath = "//button[text()=' Jeevan Tarun ']")
	WebElement user_clickpolicy;
	
	@FindBy(xpath = "(//td//following::a)[2]")
	WebElement user_clickjeevantharun;
	
	@FindBy(xpath = "//a[text()=' Policy Document ']")
	WebElement user_clickjeevanpolicydocument;
	


	public final WebElement getUser_clickjeevanpolicydocument() {
		return user_clickjeevanpolicydocument;
	}



	public final WebElement getUser_clickjeevantharun() {
		return user_clickjeevantharun;
	}



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
	
	@FindBy(id = "tableID")
	WebElement user_tableid;
	
	@FindBy(tagName = "tr")
	List<WebElement> user_tablerow;
	
	@FindBy(tagName = "td")
	List<WebElement> user_tabledata;
	
	@FindBy(xpath = "//a[text()='Next']")
	WebElement user_clicknextoption;
	
	@FindBy(xpath = "//td[text()='LIC of India, 150, Luz Church Road Mylapore Chennai']")
	WebElement user_scrolldowntable;

	@FindBy(xpath = "//label[text()='Show ']")
	WebElement user_scrollupintable;
	
	public final WebElement getUser_scrollupintable() {
		return user_scrollupintable;
	}



	public final WebElement getUser_scrolldowntable() {
		return user_scrolldowntable;
	}



	public final List<WebElement> getUser_tablerow() {
		return user_tablerow;
	}


	public final List<WebElement> getUser_tabledata() {
		return user_tabledata;
	}
	
	
	public final WebElement getUser_tableid() {
		return user_tableid;
	}



	
	
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



	public final WebElement getUser_scroll() {
		return user_scroll;
	}

}