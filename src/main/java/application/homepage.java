package application;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends BasePage{
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement women;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement Tshirt;
	
	/*@FindBy(id="newsletter-input")
	private WebElement Email;
	
	@FindBy(className="alert alert-success")
	private WebElement registermsg;*/
	

	public homepage(){
		PageFactory.initElements(driver,this);	
	}
	public void clickwomen(){
		women.click();
	}
	public void clickdresses(){
		dresses.click();;
	}
   public void clicktshirt(){
    	Tshirt.click();
    }
  }
   
   
   

