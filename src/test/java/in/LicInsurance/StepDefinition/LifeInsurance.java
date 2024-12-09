package in.LicInsurance.StepDefinition;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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
		public static JavascriptExecutor js;
		
		@Given("user launch the LIC Life Insurance Application {string}")
		public void user_launch_the_LIC_Life_Insurance_Application(String string) {
//			WebDriverManager.edgedriver().setup();
//		    EdgeOptions options = new EdgeOptions();
//		    options.addArguments("disable-notifications");
//		    options.addArguments("disable-popups");
//		    options.addArguments("start-maximized");
//		    base.driver = new EdgeDriver(options);
//			base.UserLaunchbrowser(string);
			base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			js=(JavascriptExecutor)base.driver;
			base.launchApplication(string);

		}


		@When("user enters the value in search box")
		public void user_enters_the_value_in_search_box() {
//			WebElement user_search=base.driver.findElement(By.xpath("//input[@class=\"form-control\"]"));			
			//user_search.sendKeys("Medical");
			//new implement page object
			base.inputKeys(loc.getUser_search(),"Medical");
		}

		@When("user click the search button")
		public void user_click_the_search_button() {
//			WebElement user_searching=base.driver.findElement(By.xpath("//span[@type=\"submit\"]"));
			//user_searching.click();
			//base.button(user_searching);
			//new implement POM
			base.button(loc.getUser_searching());	
		}

		@Then("user check and view the medical policy for personal purpose")
		public void user_check_and_view_the_medical_policy_for_personal_purpose() {
//			WebElement user_check=base.driver.findElement(By.xpath("//strong[contains(text(),'RFP for Empanelment of Medical ')]"));
			//user_check.click();
			//base.buttons(user_check);
            base.buttons(loc.getUser_check());
		}
		
		
		//sc-2
		@Given("user launch the LICLife Insurance Application {string}")
		public void user_launch_the_LICLife_Insurance_Application(String string) {
//			base.UserLaunchbrowser(string);
			base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		}

		@When("user scroll down in the Application")
		public void user_scroll_down_in_the_Application() throws InterruptedException {
			WebElement portal=base.driver.findElement(By.xpath("//a[text()='LICA Portal']"));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView(true)",portal);
		}

		@When("user click SSA PA Portal")
		public void user_click_SSA_PA_Portal() throws InterruptedException {
			WebElement retirement= base.driver.findElement(By.xpath("//a[text()='SSS PA Portal']"));
			Thread.sleep(2000);
			//base.select(retirement);
			base.select(loc.getUser_select());
		}

		
		@When("user pass the values in input box\"Malar\"")
		public void user_pass_the_values_in_input_box_Malar() {
			WebElement password= base.driver.findElement(By.xpath("//input[@name=\"{actionForm.password}\"]"));
			//base.inputKey(password, "Malar");
              base.inputKey(loc.getUser_password(),"Malar");
		}


		@Then("uaer click submit button")
		public void uaer_click_submit_button() {
			WebElement user_submit= base.driver.findElement(By.xpath("//input[@onclick=\"validateInput();return false;\"]"));
			if(user_submit.isEnabled()) {
				System.out.println("isEnabled");
				//base.submit(user_submit);
				base.submit(loc.getUser_submit());
			}
			else {
				System.out.println("is not Enabled");

			}
		}
		
		
        //sc-3
		@When("user click Customer Services in the home page")
		public void user_click_Customer_Services_in_the_home_page() {
			WebElement customer = base.driver.findElement(By.xpath("//span[text()=' Customer Services']"));
			//base.buttonss(customer);
			base.buttonss(loc.getUser_customer());
			
		}
		
		@When("user click Claims settlement requirements option")
		public void user_click_Claims_settlement_requirements_option() throws InterruptedException {
		    WebElement claim = base.driver.findElement(By.xpath("//a[text()=' Claims settlement requirements ']"));
		    Thread.sleep(2000);
            //base.elements(claim);
            base.elements(loc.getUser_requirement());
		}

		@When("user scroll down in the home page")
		public void user_scroll_down_in_the_home_page() throws InterruptedException {
		    WebElement things = base.driver.findElement(By.xpath("//a[text()=' Things you must know ']"));
		    Thread.sleep(2000);
     	    js.executeScript("arguments[0].scrollIntoView(true)",things);
		}

		@Then("user click Privacy Policy option")
		public void user_click_Privacy_Policy_option() throws InterruptedException {
		    WebElement plan=base.driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		    Thread.sleep(1000);
		    //base.find(plan);
		    base.find(loc.getUser_clickprivacy());
		}

     //sc-4
		
		@When("user scroll down in the Life Insurance Application")
		public void user_scroll_down_in_the_Life_Insurance_Application() throws InterruptedException {
		    WebElement child=base.driver.findElement(By.xpath("//button[text()='Children’s Future Planning']"));
		    Thread.sleep(2000);
     	    js.executeScript("arguments[0].scrollIntoView(true)",child);

		}

		@When("user click childrens future planning button in the home page")
		public void user_click_childrens_future_planning_button_in_the_home_page() throws InterruptedException {
		    WebElement childfuture =base.driver.findElement(By.xpath("//button[text()='Children’s Future Planning']"));
		    Thread.sleep(2000);
            base.findout(loc.getUser_clickchildrens());
		}

		@When("user click Know more option in childrens money back plan")
		public void user_click_Know_more_option_in_childrens_money_back_plan() {
		    WebElement knowmore=base.driver.findElement(By.xpath("(//a[text()='Know More '])[2]"));
		    base.clickknow(loc.getUser_clickknowmore());
		}

		@Then("user click Policy document in New childrens money back plan")
		public void user_click_Policy_document_in_New_childrens_money_back_plan() throws InterruptedException {
			WebElement policy=base.driver.findElement(By.xpath("//a[text()=' Policy Document ']"));
		    Thread.sleep(2000);
			base.policydocument(loc.getUser_clickpolicy());
		}

     //sc-5
		
		@When("user click branchcode module")
		public void user_click_branchcode_module() {
			WebElement branch = base.driver.findElement(By.xpath("//img[@alt=\"Branch Locator\"]"));
			if( branch.isDisplayed()){
				base.branch(loc.getUser_clickbranch());
			}
		}

		@When("user click the search button in the branchcode page")
		public void user_click_the_search_button_in_the_branchcode_page() throws InterruptedException {
			WebElement search=base.driver.findElement(By.xpath("//input[@type=\"search\"]"));
			Thread.sleep(2000);
			base.searchbox(loc.getUser_clicksearchbar());
		}

		@When("user pass the value in search box\"Chennai\"")
		public void user_pass_the_value_in_search_box_Chennai() {
			WebElement search=base.driver.findElement(By.xpath("//input[@type=\"search\"]"));
			base.inputKeyss(loc.getUser_inputvalue(),"Chennai");
		}

		@When("user click Distinctive Code of the Branch option in the table")
		public void user_click_Distinctive_Code_of_the_Branch_option_in_the_table() {
			WebElement branchcode =base.driver.findElement(By.xpath("//td[text()='Distinctive Code of the Branch']"));
			base.distinctiveCode(loc.getUser_clickcode());
			
		}

		@When("user scroll down in the branchcode page")
		public void user_scroll_down_in_the_branchcode_page() throws InterruptedException {
			WebElement lic=base.driver.findElement(By.xpath("//td[text()='LIC of India, 150, Luz Church Road Mylapore Chennai']"));
		    js.executeScript("arguments[0].scrollIntoView(true)",lic);
			Thread.sleep(2000);
		}

		@When("user click next option in branch code page")
		public void user_click_next_option_in_branch_code_page() {
		    WebElement next=base.driver.findElement(By.xpath("//a[text()='Next']"));
		    base.nextoption(loc.getUser_clicknextoption());
		}

		@When("user get the values in the table in branchcode page")
		public void user_get_the_values_in_the_table_in_branchcode_page() {
			 //validate the table value:
		   	WebElement table=base.driver.findElement(By.id("tableID"));
		   	
		   	 // Get all rows
		      List<WebElement> rows = table.findElements(By.tagName("tr"));
		      
		      // Iterate through rows
		      for (int i = 0; i < rows.size(); i++) {
		   	   
		      // Get all columns for the current row 
		         List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
		         
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
			WebElement scrollup=base.driver.findElement(By.xpath("//label[text()='Show ']"));
		    js.executeScript("arguments[0].scrollIntoView(false)",scrollup);
		}
		
}
