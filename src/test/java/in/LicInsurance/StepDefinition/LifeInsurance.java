package in.LicInsurance.StepDefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.LicInsurance.BaseClass.BaseClass;
import in.LicInsurance.ObjectRepository.LicLoctors;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LifeInsurance {
	//public static WebDriver driver;
		public static BaseClass base = BaseClass.getInstance();
		
		public static LifeInsurance li=new LifeInsurance();
		LicLoctors loc = new LicLoctors();
		
		@Given("user launch the LIC Life Insurance Application {string}")
		public void user_launch_the_LIC_Life_Insurance_Application(String string) {
//			WebDriverManager.edgedriver().setup();
//		    EdgeOptions options = new EdgeOptions();
//		    options.addArguments("disable-notifications");
//		    options.addArguments("disable-popups");
//		    options.addArguments("start-maximized");
//		    base.driver = new EdgeDriver(options);
//			base.UserLaunchbrowser(string);
			
			base.launchApplication(string);

		}


		@When("user enters the value in search box")
		public void user_enters_the_value_in_search_box() {
			
			base.click(loc.getUser_closeadd());
		    base.inputKeys(loc.getUser_search(),"Medical");

		}

		@When("user click the search button")
		public void user_click_the_search_button() {
//			WebElement user_searching=base.driver.findElement(By.xpath("//span[@type=\"submit\"]"));
			base.button(loc.getUser_searching());
			
		}

		@Then("user check and view the medical policy for personal purpose")
		public void user_check_and_view_the_medical_policy_for_personal_purpose() throws IOException {
//			WebElement user_check=base.driver.findElement(By.xpath("//strong[contains(text(),'RFP for Empanelment of Medical ')]"));
            base.button(loc.getUser_check());
           // base.screenshot("LIC");
		}
		
		
		//sc-2
		@Given("user launch the LICLife Insurance Application {string}")
		public void user_launch_the_LICLife_Insurance_Application(String string) {
			
//			base.UserLaunchbrowser(string);
			
		}

		@When("user scroll down in the Application")
		public void user_scroll_down_in_the_Application()     {
	        //base.waitForvisible(loc.getUser_scrollssa());
	        //base.scrollToElement(loc.getUser_scrollssa());
		}
		
		@When("user click SSA PA Portal")
		public void user_click_SSA_PA_Portal()  {
			
            base.click(loc.getUser_closeadd());
	        base.waitForvisible(loc.getUser_select());
			base.click(loc.getUser_select());
		}

		
		@When("user pass the values in input box\"Malar\"")
		public void user_pass_the_values_in_input_box_Malar()  {
			//WebElement password= base.driver.findElement(By.xpath("//input[@name=\"{actionForm.password}\"]"));
			//base.inputKey(password, "Malar");
            base.inputKeys(loc.getUser_password(),"Malar");
		}


		@Then("uaer click submit button")
		public void uaer_click_submit_button() {
			WebElement user_submit = loc.getUser_submit();
			//WebElement user_submit= base.driver.findElement(By.xpath("//input[@onclick=\"validateInput();return false;\"]"));
			if(user_submit.isEnabled()) {
				base.button(loc.getUser_submit());
				System.out.println("Submit option is enabled");
			}
			else {
				System.out.println("Submit option is not Enabled");

			}
		}
		
	
        //sc-3
		
		@When("user click Customer Services in the home page")
		public void user_click_Customer_Services_in_the_home_page() {
			base.button(loc.getUser_closeadd());
			base.button(loc.getUser_customer());
			
		}
		
		@When("user click Claims settlement requirements option")
		public void user_click_Claims_settlement_requirements_option()  {
		    //WebElement claim = base.driver.findElement(By.xpath("//a[text()=' Claims settlement requirements ']"));
	        base.waitForelementToBeClickable(loc.getUser_requirement());
            base.button(loc.getUser_requirement());
		}

		@When("user scroll down in the home page")
		public void user_scroll_down_in_the_home_page()  {
		    //WebElement things = base.driver.findElement(By.xpath("//a[text()=' Things you must know ']"));
              
		}

		@Then("user click Privacy Policy option")
		public void user_click_Privacy_Policy_option()  {
		    //WebElement plan=base.driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
			base.click(loc.getUser_clickprivacy());
		    
		}

     //sc-4
		
		@When("user scroll down in the Life Insurance Application")
		public void user_scroll_down_in_the_Life_Insurance_Application()  {
			
//		    WebElement child=base.driver.findElement(By.xpath("//button[text()='Children’s Future Planning']"));
			base.button(loc.getUser_closeadd());

		}

		@When("user click childrens future planning button in the home page")
		public void user_click_childrens_future_planning_button_in_the_home_page()  {
			
           base.waitForelementToBeClickable(loc.getUser_clickchildrens());
           base.click(loc.getUser_clickchildrens());
		
		}

		@When("user click Know more option in childrens money back plan")
		public void user_click_Know_more_option_in_childrens_money_back_plan()  {
			
			//WebElement knowmore=base.driver.findElement(By.xpath("(//a[text()='View All'])[4]"));
	        base.waitForelementToBeClickable(loc.getUser_clickknowmore());
		    //base.click(loc.getUser_clickknowmore());
		}

		@Then("user click Policy document in New childrens money back plan")
		public void user_click_Policy_document_in_New_childrens_money_back_plan()  {
			
			try {
			base.button(loc.getUser_clickpolicy());
			} 
			catch(Exception w) {
				w.getMessage();
			}
		}

       @Then("user scroll up in the viewall option")
       public void user_scroll_up_in_the_viewall_option() {
    	   base.waitForelementToBeClickable(loc.getUser_clickknowmore());
    	   base.click(loc.getUser_clickknowmore());
    	 
       }


        @Then("user click Licjeevantharun option")
       public void user_click_Licjeevantharun_option() throws InterruptedException {
        	
            base.waitForelementToBeClickable(loc.getUser_clickpolicy());

        	WebElement user_clickpolicy = loc.getUser_clickpolicy();
        	
        	if(user_clickpolicy.isDisplayed()) {
        	try {
        	base.waitForelementToBeClickable(loc.getUser_clickpolicy());
        	base.button(loc.getUser_clickpolicy());
        	}
        	
        	catch(Exception e) {
        		e.printStackTrace();
        	}
            
        	System.out.println("Policy option is Displayed");
        	}
        	else {
        		System.out.println("Policy option is not displayed");
        	}
        }

        @Then("user click LicJeevan policy link")
        public void user_click_LicJeevan_policy_link() {
        
        	base.button(loc.getUser_clickjeevantharun());	
        }
        
        @Then("user click jeevanpolicydocumentlink")
        public void user_click_jeevanpolicydocumentlink() {
        	
        	base.button(loc.getUser_clickjeevanpolicydocument());
        }

        
     //sc-5
		
		@When("user click branchcode module")
		public void user_click_branchcode_module() {
			
			base.button(loc.getUser_closeadd());
			
			WebElement branch = loc.getUser_clickbranch();
			if( branch.isDisplayed()){
				branch.click();
				System.out.println("Branch option is displayed");
			}
			else {
				System.out.println("Branch option is not displayed");
			}
		}

		@When("user click the search button in the branchcode page")
		public void user_click_the_search_button_in_the_branchcode_page()  {
			//WebElement search=base.driver.findElement(By.xpath("//input[@type=\"search\"]"));
			base.waitForelementToBeClickable(loc.getUser_clicksearchbar());
			base.button(loc.getUser_clicksearchbar());
		}

		@When("user pass the value in search box\"Chennai\"")
		public void user_pass_the_value_in_search_box_Chennai() {
			//WebElement search=base.driver.findElement(By.xpath("//input[@type=\"search\"]"));
			base.inputKeys(loc.getUser_inputvalue(),"Chennai");
		}

		@When("user click Distinctive Code of the Branch option in the table")
		public void user_click_Distinctive_Code_of_the_Branch_option_in_the_table() {
			//WebElement branchcode =base.driver.findElement(By.xpath("//td[text()='Distinctive Code of the Branch']"));
			base.button(loc.getUser_clickcode());
			
		}

		@When("user scroll down in the branchcode page")
		public void user_scroll_down_in_the_branchcode_page()  {
			//WebElement lic=base.driver.findElement(By.xpath("//td[text()='LIC of India, 150, Luz Church Road Mylapore Chennai']"));
		   // js.executeScript("arguments[0].scrollIntoView(true)",loc.getUser_scrolldowntable());
		}

		@When("user click next option in branch code page")
		public void user_click_next_option_in_branch_code_page() {
		    //WebElement next=base.driver.findElement(By.xpath("//a[text()='Next']"));
		    base.click(loc.getUser_clicknextoption());
		}

		@When("user get the values in the table in branchcode page")
		public void user_get_the_values_in_the_table_in_branchcode_page() {
			 //validate the table value:
			WebElement table = loc.getUser_tableid();
		   	
		   	 // Get all rows
			 List<WebElement> rows = loc.getUser_tablerow();
		      
		      // Iterate through rows
		      for (int i = 0; i < rows.size(); i++) {
		   	   
		      // Get all columns for the current row 
		    	 List<WebElement> columns = loc.getUser_tabledata();
		         
		      // Print each cell value
		      for(int j =0; j<columns.size(); j++) {
		       System.out.println(columns.get(j).getText());
		      
		      //validate
		      Assert.assertEquals("columns","columns" );     //doubt
		      System.out.println(true);
		      //Assert.assertEquals("Validate table column text", "Distinctive Code of the branch", actualText);
		      }
		      }
		    
		}

		@Then("user scroll up and view the values in the branchcode page")
		public void user_scroll_up_and_view_the_values_in_the_branchcode_page() {
			//WebElement scrollup=base.driver.findElement(By.xpath("//label[text()='Show ']"));
			base.javascriptscrollup(loc.getUser_scrollupintable());
		}
		
}


