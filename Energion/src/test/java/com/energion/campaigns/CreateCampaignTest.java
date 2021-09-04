package com.energion.campaigns;

import org.testng.annotations.Test;

import com.energion.GenericLib.BaseTest;
import com.energion.GenericLib.FileLib;
import com.energion.GenericLib.WebDriverCommonLib;
import com.energion.pages.CreateCampaignPage;
import com.energion.pages.CustomViewPage;
import com.energion.pages.HomePage;
import com.energion.pages.LoginPage;

public class CreateCampaignTest extends BaseTest{


@Test
	public void createCampaigns() throws Throwable
	{
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPage lp = new LoginPage();
		
		FileLib flib = new FileLib();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Home Page");
		
		HomePage hp = new HomePage();
		hp.clickCampaignsTab();
		
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customViewTitle"), "Custom View Page");
		
		CustomViewPage cv = new CustomViewPage();
		cv.clickCamapaignsBtn();
		
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "createCampaignTitle"), "Create Campaign Page");
		
		CreateCampaignPage cp = new CreateCampaignPage();
		cp.CreateCampaignWithMandatoryFields(flib.readExcelData(EXCEL_PATH, "Campaigns", 0, 1));
		
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "campaignDetailsTitle"), "Campaign Details Page");
		
		wlib.getFullPageScreenshot(SCREENSHOTS_PATH);
	
}
	
}
