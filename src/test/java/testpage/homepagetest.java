package testpage;

import org.testng.annotations.Test;
import org.testng.Assert;

import application.BasePage;
import application.homepage;

public class homepagetest {
	homepage homepage;
	BasePage bp;
	
	public homepagetest(){
	 homepage=new homepage();
	 bp=new BasePage();	
	}
	@Test
	
    public  void verifywomen(String name){
		homepage.clickwomen();
		Assert.assertTrue(homepage.getTitle().contains("women"), "failed: women page is not navigated");
		homepage.clickdresses();
		Assert.assertTrue(homepage.getTitle().contains("dresses"), "failed: dress page is not navigated");
		homepage.clicktshirt();;
		Assert.assertTrue(homepage.getTitle().contains("tshirt"),"failed : tshirt page is not navigated");
	   
	  
    }
  }
















