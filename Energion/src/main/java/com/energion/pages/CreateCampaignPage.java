package com.energion.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.energion.GenericLib.BaseTest;

public class CreateCampaignPage {

	@FindBy(xpath = "//input[@name=\"property(Campaign Name)\"]") private WebElement campaignTb;
	
	@FindBy(xpath = "(//input[@value=\"Save\"])[2]") private WebElement saveBtn;
	
	@FindBy(xpath = "//select[@name=\"property(Type)\"]") private WebElement typeBtn;
	
	@FindBy(xpath = "//select[@name=\"property(Status)\"]") private WebElement statusBtn;
	
	@FindBy(xpath = "//img[@onclick=\"showCal('property(Start Date)')\"]") private WebElement startDateBtn;
	
	@FindBy(xpath = "(//a[@class=\"calDay\"])[3]") private WebElement selectDate;
	
	@FindBy(xpath = "//img[@onclick=\"showCal('property(End Date)')\"]") private WebElement endDateBtn;
	
	@FindBy(xpath = "//input[@name=\"property(Expected Revenue)\"]") private WebElement expRevenueTb;
	
	@FindBy(xpath = "//input[@name=\"property(Budgeted Cost)\"]") private WebElement budgetCostTb;	
	
	@FindBy(xpath = "//input[@name=\"property(Actual Cost)\"]") private WebElement actualCostTb;
	
	@FindBy(xpath = "//input[@name=\"property(Expected Response)\"]") private WebElement expectedResponseTb;
	
	@FindBy(xpath = "//input[@name=\"property(Num sent)\"]") private WebElement numSentTb;
	
	@FindBy(xpath = "//textarea[@name=\"property(Description)\"]") private WebElement descriptionTb;
	
	
	public CreateCampaignPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void CreateCampaignWithMandatoryFields(String campaignName) throws InterruptedException
	{
		campaignTb.sendKeys("Digital Marketing");
		
		Select sel = new Select(typeBtn);
		sel.selectByVisibleText("Telemarketing");
		typeBtn.click();
		
		Select sel1 = new Select(statusBtn);
		sel1.selectByIndex(1);
		statusBtn.click();
		
//		startDateBtn.click();
//		selectDate.click();
		
		saveBtn.click();
	}
	
}
