package com.energion.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.energion.GenericLib.BaseTest;

public class CustomViewPage {
	
	@FindBy(xpath = "//input[@value = 'New Lead']") private WebElement newLeadsBtn;
	
	@FindBy(xpath = "//input[@value=\"New Campaign\"]") private WebElement newCampaignsBtn;
	
	@FindBy(xpath = "//input[@name=\"searchString\"]")  private WebElement findCampaignTB;
	
	@FindBy(xpath = "//input[@name=\"Go\"]") private WebElement GoBtn;
	
	@FindBy(xpath = "//select[@name=\"cvid\"]") private WebElement ViewDropDownBtn;
	
	@FindBy(xpath = "//a[text()=\"Create View\"]") private WebElement createViewBtn;
	
	@FindBy(xpath = "//input[@value=\"Create Task\"]") private WebElement createTaskBtn;
	
	public WebElement getCreateTaskBtn() {
		createTaskBtn.click();
		return createTaskBtn;
	}

	public void setCreateTaskBtn(WebElement createTaskBtn) {
		this.createTaskBtn = createTaskBtn;
	}

	public CustomViewPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickNewLeadBtn()
	{
		newLeadsBtn.click();
	}

	public void clickCamapaignsBtn()
	{
		newCampaignsBtn.click();
	}
	
	public void findCampaign(String searchWord)
	{
		findCampaignTB.sendKeys(searchWord);
		GoBtn.click();
	}

	public WebElement getViewDropDownBtn() {
		return ViewDropDownBtn;
	}

	public void setViewDropDownBtn(WebElement viewDropDownBtn) {
		ViewDropDownBtn = viewDropDownBtn;
	}

	public WebElement getCreateViewBtn() {
		createViewBtn.click();
		return createViewBtn;
	}

	public void setCreateViewBtn(WebElement createViewBtn) {
		this.createViewBtn = createViewBtn;
	}
	
	
}

