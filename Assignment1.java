package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
//login page
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
//to update username, password and login page
		 
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
//To click CRM/SFA, lead and createlead
	     
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.linkText("Create Lead")).click();
	     
//enter all the text fields in create lead page
	     
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SBI ");	
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidhya ");
	     driver.findElement(By.name("dataSourceId")).sendKeys("Employee ");
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vidhu");     
	     driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
	     driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Payment services");   
	     driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10 lac ");	
	     driver.findElement(By.name("industryEnumId")).sendKeys("Finance ");
	     driver.findElement(By.name("ownershipEnumId")).sendKeys("Partnership ");	
	     driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("4568 ");
	     driver.findElement(By.name("description")).sendKeys("Sbi i a payment services company deals with the payment section, dispute and loan services ");	
	     driver.findElement(By.name("importantNote")).sendKeys("Payment company ");
	     driver.findElement(By.name("marketingCampaignId")).sendKeys(" Automobile");
	     driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("vidhuu");	
	     driver.findElement(By.name("birthDate")).sendKeys("08/22/1992 ");
	     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Loan");	
	     driver.findElement(By.name("currencyUomId")).sendKeys("INR-Indian Rupee ");
	     driver.findElement(By.name("numberEmployees")).sendKeys("300");	
	     driver.findElement(By.name("tickerSymbol")).sendKeys("HUUY58996 ");
	     
// enter all the text fields in the contact information
	     
	     driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1 ");	
	     driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("202 ");
	     driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044 ");
	     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vidhyam291@gmail.com ");	
	     driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8939193073 ");
	     driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Vidhya ");	
	     driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.sbi.com ");
	     
  // enter all the text fields in the primary address:


	     driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vidhya  ");	
	     driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Thandalam Thiruporur ");
	     driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chengalpat ");
	     driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603110 ");	
	     driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("00005 ");
	     driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vidhya Madasamy ");	
	     driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("same as adrress1 ");
	     driver.findElement(By.name("generalStateProvinceGeoId")).sendKeys("Tamilnadu");
	     driver.findElement(By.name("generalCountryGeoId")).sendKeys("India ");
	    


	}

}
