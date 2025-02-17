package in.LicInsurance.BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	public static WebDriver driver;
	public static Actions ac;
	public static JavascriptExecutor js;
	
	
	public void UserLaunchbrowser() {
		WebDriverManager.edgedriver().setup();
	    EdgeOptions options = new EdgeOptions();
	    options.addArguments("disable-notifications");
	    options.addArguments("disable-popups");
	    options.addArguments("start-maximized");
	    driver = new EdgeDriver(options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    js=(JavascriptExecutor)driver;
	}
	
	//for sendKeys
	public void inputKeys(WebElement ele, String value) {
          ele.sendKeys(value);		
	}
	public void action()
	{
		ac=new Actions(driver);
	}
	//for launch
	public void launchApplication(String url) {
		driver.get(url);
	}
   //for click
	public void button(WebElement el) {
          el.click();		
	}
	//for element visiblity checking
	public boolean displayed(WebElement m) {
		boolean display=m.isDisplayed();
		return display;
	}
    //for getText
	public String returnText(WebElement ele) {
		String text=ele.getText();
		return text;
	}
	//for waits
	public WebDriverWait waits() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		return wait;
	}
	//for Actions 
	public void click(WebElement act) {
		ac=new Actions(driver);
		ac.click(act).build().perform();
		 
	}
	
	public void actionClick(WebElement elem, String value) {
		 ac=new Actions(driver);
			switch(value)
			{
			case "double":
			ac.doubleClick(elem).perform();;
			case "rightclick":
			ac.contextClick(elem).perform();;
			}
	}
	//Actions moveToElement
		public void scrollToElement(WebElement ele) {
			ac.moveToElement(ele).build().perform();
		}

	public void UserLaunchbrowsers(String string) {
		// TODO Auto-generated method stub
		
	}
	//JavaScriptExecutorClick
	 public void javascriptexecutorclick(WebElement element) {
	    	js.executeScript("arguments[0].click()",element);
	    }
	 
	//for JavaScriptexecutor scrolldown
    public void javascriptscrolldown(WebElement element) {
    	js.executeScript("arguments[0].scrollIntoView()",element);

    }
    
   //for JavaScriptExecutor scrollUp
    public void javascriptscrollup(WebElement element) {
    	js.executeScript("arguments[0].scrollIntoView()",element);
    }
    
   //for explicit wait 
    public void waitForelementToBeClickable(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    

    public void waitForvisible(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
         wait.until(ExpectedConditions.visibilityOf(element));   
    }
    
    //for navigate
    public void moveForward() {
        driver.navigate().forward();		
 	}

 	public void moveBackward() {
 	  driver.navigate().back();		

 	}
 	//for getAttribute
 	public String returnAttribute(WebElement elemt, String attribute) {
		String attribute2=elemt.getAttribute(attribute);
		return attribute2;
	}
   //for getCssvalue
	public String returnCssValue(WebElement eles, String cssName) {
		String cssvalue=eles.getCssValue(cssName);
		return cssvalue;
	}
	//select class 
	public void valueSelect(WebElement elew, String value) {
        Select s =new Select(elew);
        s.selectByValue(value);      
	}

	public void indexSelect(WebElement elep, int i) {
      Select sv =new Select(elep);
      sv.deselectByIndex(i);
	}

	public List<WebElement> returnOptions(WebElement elez) {
		Select sl =new Select(elez);
      List<WebElement> options=sl.getOptions();
      return options;
	}
    //windowhandling
	public void parentWindow() {
		String parentWindow=driver.getWindowHandle();
		driver.switchTo().window(parentWindow);	
	}

	public void childWindow() {
		String parentWindows=driver.getWindowHandle();
		Set<String> childwindow=driver.getWindowHandles();
		for(String x:childwindow) {
			if(!parentWindows.equals(x)) {
				driver.switchTo().window(x);
			}
		}	
	}
	
	//Frames
	public void enterFrame(String value, int i, String frame) {
		switch((value).toLowerCase())
		{
		case "name":
		driver.switchTo().frame(frame);
		break;
		case "i":
		driver.switchTo().frame(i);
		break;
		}	
	}
    //Alert
	public void inputkeys(Alert a, String value) {
		 	Alert al=driver.switchTo().alert();
		 	if(value.equals("ok")) {
		 		al.accept();
		 	}else {
		 		al.dismiss();
		 	}
		 	
		 	System.getenv("Username");
	}
  //TakesScreenshot
	public void screenshot(String imageName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File f1=new File("C:\\Users\\balap\\eclipse-workspace\\browser\\LicInsurance\\target"+imageName+".png");
		FileUtils.copyFile(f, f1);
	}
  //close 
	public void browserClose() {
       	driver.close();	
	}

	
	public String pageTitle() {
		String text = driver.getTitle();
		return text;		
	}

	public String pageUrl() {
		String text = driver.getCurrentUrl();
		return text;
     				
	}

	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
}