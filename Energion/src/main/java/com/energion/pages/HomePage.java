package com.energion.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.energion.GenericLib.BaseTest;

public class HomePage {
	
	@FindBy(xpath = "//a[text() = 'Leads']") private WebElement leadsTab;
	
	@FindBy(xpath = "//a[text() = \"Campaigns\"]") private WebElement campaignsTab;
	
	public HomePage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickLeadstab()
	{
		leadsTab.click();
	}
	
	public void clickCampaignsTab()
	{
		campaignsTab.click();
	}
}
