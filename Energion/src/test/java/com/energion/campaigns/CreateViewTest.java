package com.energion.campaigns;

import org.testng.annotations.Test;

import com.energion.GenericLib.BaseTest;
import com.energion.GenericLib.FileLib;
import com.energion.GenericLib.WebDriverCommonLib;
import com.energion.pages.CustomViewPage;
import com.energion.pages.HomePage;
import com.energion.pages.LoginPage;

public class CreateViewTest extends BaseTest {

@Test
public static void createview() throws Throwable {
		
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
		cv.getCreateViewBtn();
}

}