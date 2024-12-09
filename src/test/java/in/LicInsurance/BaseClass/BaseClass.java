package in.LicInsurance.BaseClass;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.LicInsurance.ObjectRepository.LicLoctors;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  implements IBaseClass {
public static BaseClass base=null;
	public static BaseClass getInstance() {
		if(base==null) {
			
			base=new BaseClass();
		}
		return base;
	}
	
	private BaseClass() {}
	public static Actions ac;
	public static WebDriver driver;
	public static JavascriptExecutor js;
	//sc-1
	public void UserLaunchbrowser() {
		WebDriverManager.edgedriver().setup();
	    EdgeOptions options = new EdgeOptions();
//	    options.addArguments("disable-notifications");
//	    options.addArguments("disable-popups");
	    options.addArguments("start-maximized");
	    driver = new EdgeDriver(options);
	    //js=(JavascriptExecutor)driver;
	}
	
	public void inputKeys(WebElement ele, String value) {
          ele.sendKeys(value);		
	}
	
	public void launchApplication(String url) {
		driver.get(url);
	}

	public void button(WebElement ele) {
          ele.click();		
	}
	public void buttons(WebElement ele) {
         ele.click();	
	}
	
	//sc-2
	public void select(WebElement le) {
        le.click();		
	}
	public void inputKey(WebElement el, String value) {
        el.sendKeys(value);		
	}
	public boolean displayed(WebElement m) {
		boolean display=m.isDisplayed();
		return display;
	}
	public void submit(WebElement a) {
        a.click();		
	}
	public String returnText(WebElement ele) {
		String text=ele.getText();
		return text;
	}
	public WebDriverWait waits() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		return wait;
	}
	
	//sc-3
	public void buttonss(WebElement po) {
        po.click();		
	}
	public void elements(WebElement se) {
        se.click();		
	}
	public void element(WebElement qp) {
        qp.click();		
	}
	public void find(WebElement act) {
		 ac=new Actions(driver);
		 ac.click(act).perform();
	}

	public void UserLaunchbrowsers(String string) {
		// TODO Auto-generated method stub
		
	}
		 
	//sc-4
	public void findout(WebElement fo) {
       fo.click();		
	}	 
	public void clickknow(WebElement ck) {
        ck.click();		
	}

    public void policydocument(WebElement pd) {
    	pd.click();
    }

    //sc-5
    public void branch(WebElement br) {
    	br.click();
    }
    public boolean display(WebElement zx) {
		boolean display=zx.isDisplayed();
		return display;
	}
    public void searchbox(WebElement ser) {
    	ser.click();
    }
    public void inputKeyss(WebElement che, String value) {
        che.sendKeys(value);		
	}
    public void distinctiveCode(WebElement dis) {
    	dis.click();
    }
    public void nextoption(WebElement next) {
    	next.click();
    }
    public String returnvalues(WebElement table) {
		String text=table.getText();
		return text;
	}
    
}