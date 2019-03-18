package com.wt.Automation.pages;





import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wt.Automation.utils.DriverFactory;



public class WeeklyTrackerHomePage {


private static Logger logger = Logger.getLogger(WeeklyTrackerHomePage.class);
public static WebDriver driver;
public CommonBase commonsteps;

 //*********** XPath's for Cohert Creation

 @FindBy(xpath = "//img[@src='app/common/images/icon-new-cohort.png']")
 WebElement newReport;

 @FindBy(xpath = "//a[@href='/cb/#/initPanel?appId=WT']")
 WebElement newCohort;

 @FindBy(xpath = "//input[@id='input_2']")
 WebElement cohortTitle;

 @FindBy(xpath = "//input[@id='input_3']")
 WebElement therapeuticArea;

 @FindBy(xpath = "//input[@id='input_4']")
 WebElement cohortDescription;

 @FindBy(xpath = "//button[@class='nextButton md-button ng-scope md-ink-ripple']")
 WebElement nextButton;

 //*********** XPath's for Integrated Weekly Selection

 //@FindBy(xpath=".//*[@id='radio_94']/div[@class='md-container md-ink-ripple']/div[@class='md-off']") WebElement integratedWeeklySource;

 @FindBy(xpath = "//div[4]/md-card-content/div/div[2]/div[2]/div[2]/div/div/div/div[3]/button/span[contains(text(),'Select')]")
 WebElement Date1;

 //@FindBy(xpath=".//md-card-actions/span/button[2]") WebElement  NexttoCriteria;

 @FindBy(xpath = "//button[@type='button'])[17]")
 WebElement NexttoCriteria;

 @FindBy(xpath = "//span[contains(text(),'Select')]")
 WebElement dateSelect;

 @FindBy(xpath = "//span[contains(text(),'Next')]")
 WebElement cohortNext;

 //*********** XPath's for Coverage Selection	

 
 @FindBy(xpath="//*[@id='mainBody']/div[5]/div/div[3]/div/div/div/div[1]/div[2]/div[1]/div[3]/div")
 WebElement selectMEDS;
 
@FindBy(xpath="//*[@id='criteriaAdd']/div[1]/div[2]/div/p")
WebElement selectarea;
 
 @FindBy(xpath = "//md-fab-speed-dial[@id='covFabSpeedDial']/md-fab-trigger/div")
 WebElement COV;

 @FindBy(xpath = "//div[@class='coverageContainer']/div/div[1]/following::button")
 WebElement covEditButton;

 @FindBy(xpath = "//p[text()='Coverages ']")
 WebElement covCoverageHeading;

 @FindBy(xpath = "//p[text()='Medical ']")
 WebElement covMedEdit;

 @FindBy(xpath = "//div[@class='cohortFields widthDragDropPanel']/following::p[text()='Medical']")
 WebElement covMedHeading;

 @FindBy(xpath = "//p[text()='YES ']") 
 WebElement covMedEditOption;

 @FindBy(xpath = "//p[text()='Pharmacy ']") 
 WebElement covPharEdit;

 @FindBy(xpath = "//div[@class='cohortFields widthDragDropPanel']/following::p[text()='Pharmacy']") 
 WebElement covPharHeading;

 @FindBy(xpath = "//p[text()='YES ']") 
 WebElement covPharEditOption;

 @FindBy(xpath = "//img[@id='updateIcon']") 
 WebElement covSelect;

 //*********** XPath's for Continuous Activity Selection

 @FindBy(xpath = "//div[@class='coverageItems']/div[7]/div/div[2]/md-fab-speed-dial/md-fab-trigger/div") 
 WebElement CONT;

 @FindBy(xpath = "//div[@class='coverageContainer']/div/div[6]/following::button") 
 WebElement contEditButton;

 @FindBy(xpath = "//p[text()='Continuous Activity ']") 
 WebElement contContinuousActivityHeading;

 @FindBy(xpath = "//p[text()='Claims Eligibility ']") 
 WebElement contClaimEdit;

 @FindBy(xpath = "//div[@class='cohortFields widthDragDropPanel']/following::p[text()='Claims Eligibility']") 
 WebElement contClaimHeading;

 @FindBy(xpath = "//p[text()='YES ']") 
 WebElement contClaimEditOption;

 @FindBy(xpath = "//p[text()='Clinical Activity ']") 
 WebElement contClinicalEdit;

 @FindBy(xpath = "//div[@class='cohortFields widthDragDropPanel']/following::p[text()='Clinical Activity']") 
 WebElement contClinicalHeading;

 @FindBy(xpath = "//p[text()='YES ']") 
 WebElement contClinicalEditOption;

 @FindBy(xpath = "//img[@id='updateIcon']") 
 WebElement contSelect;


 //*********** XPath's for MEDS Selection

 //@FindBy(xpath = "//div[@class='div-drag MEDS']/div/h1") WebElement MedSrc;

 @FindBy(xpath = "//div[@class='drag-container pull-left']//div[@class='div-drag MEDS']") 
 WebElement MedSrc;

 @FindBy(xpath = "//md-list-item[2]/div[@class='md-button md-no-style']")
 WebElement MedsSearch;

 @FindBy(xpath = ".//div[@class='searchInput ng-scope']/div[1]/md-input-container/input") 
 WebElement MedsSearchFor;

 @FindBy(xpath = ".//span/button[@class='btn btn-default'][2]") 
 WebElement MedsSearchButton;

 @FindBy(xpath = ".//div[@class='row pageSectionHeight addTopMargin']//div[@class='col-md-1']/span[@class='glyphicon glyphicon-plus add5Padding']") 
 WebElement MedsAddbutton;

 @FindBy(xpath = ".//div[@class='drop-row ng-scope']//div[@class='div-drop']") 
 WebElement indexDest;

 @FindBy(xpath = ".//span[1]/img[@id='closeIcon']") 
 WebElement tickMark;

 @FindBy(xpath="//div[@class='headerGenCohortIconText']") 
 WebElement generateCohort;
 
 @FindBy(xpath="//*[@id='mainBody']/div[6]/div[1]/div/div/div/div/div[4]/section/div/md-card[1]/md-card-content/button/md-icon")
 WebElement repgenerateCohort;

 @FindBy(xpath = ".//span[@class='input-group-btn']//button[@class='btn btn-default'][1]") 
 WebElement MedsCancel;

 //*********** XPath's for WT icon Selection

 @FindBy(xpath = "//*[@id='mainBody']//md-card-content/button[@class='pull-right pj-icon md-button ng-scope md-ink-ripple']") 
 WebElement WTIcon;

@FindBy(xpath="//img[@class='imgSelection'][2]")
WebElement initalPanelNext;

@FindBy(xpath="html/body/wt-root/div/reportlist/div/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[1]")
WebElement complete;

/*@FindBy(xpath="html/body/wt-root/div/reportlist/div/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[1]")
WebElement reportIcon;
*/
@FindBy(xpath="//span[@class='ui-cell-data']//img[@src='app/common/images/admin.png']")
WebElement reportIcon;

/*@FindBy(xpath="html/body/wt-root/div/reportlist/div/p-overlaypanel/div/div/div/div[1]/div[2]/div[1]/img")
WebElement WTReportIcon;*/

@FindBy(xpath="//img[@src='app/wtui/images/icon-fillex-rx.png']")
WebElement WTReportIcon;


//@FindBy(xpath="//*[@id='*lK36*kW128*x1*t1519496060798']/div/a/img")

@FindBy(xpath="//img[@src='/wt/app/common/images/export.png']")

WebElement download;

 public WeeklyTrackerHomePage(DriverFactory driverfactory) throws Exception {
  driver = driverfactory.getDriver();
  PageFactory.initElements(driver, this);

 }

 public void Initiatecohort()  {
  CommonBase.waitForElementToLoad(newReport, driver);
  newReport.click();
  CommonBase.waitForElementToLoad(newCohort, driver);
  newCohort.click();
  CommonBase.waitForElementToLoad(cohortTitle, driver);
  cohortTitle.click();
  cohortTitle.sendKeys("CohortAuto0411");
  CommonBase.waitForElementToLoad(therapeuticArea, driver);
  therapeuticArea.click();
  therapeuticArea.sendKeys("WT Automation cohort demo");
  nextButton.click();
  CommonBase.waitforsecond(1);
  datasource();
  CommonBase.waitForElementToLoad(Date1, driver);
  Date1.click();
  cohorttype();
  CoverageSelections();
 }

/**
 * This method will click on NewReport Icon in WT page
 */

 public void clickonNewReport() {
  CommonBase.waitforsecond(10);
  if (driver.getCurrentUrl().contains("wt"));
  CommonBase.waitForElementToLoad(newReport, driver);
   CommonBase.waitforsecond(10);
  newReport.click();
 }
 
 /**
  * This method will click on new existing report link in WT page
  */

 public void clickonNewCohort() {
    CommonBase.waitForElementToLoad(newCohort, driver);
    newCohort.click();
  
 }
 
 /**
  * This method enter title in cohortTitlePage
  * @throws InterruptedException
  */
  
 public void enterTitle(String title){
	 CommonBase.waitForElementToLoad(cohortTitle, driver);
	 cohortTitle.sendKeys(title);
 }
 
 public void enterTherapeuticArea(String therapeutic){
	 CommonBase.waitForElementToLoad(therapeuticArea, driver);
	 therapeuticArea.sendKeys(therapeutic);
 }
 
 
 public void enterDescription(String description){
	 CommonBase.waitForElementToLoad(cohortDescription, driver);
	 cohortDescription.sendKeys(description);
 }
 
 
 public void clickOnNextButton(){
	 CommonBase.waitForElementToLoad(nextButton, driver);
	 nextButton.click();
 }

 
 public void datasource() {
  
  String Datasource = "IntegratedWeekly";
  String IntegratedWeekly = "IntegratedWeekly";

  if (Datasource.equals(IntegratedWeekly)) {
   CommonBase.waitforsecond(5);
   driver.findElement(By.xpath(".//*[@id='radio_15']")).click();
   CommonBase.waitforsecond(1);
  }
 }


 public void cohorttype()  {
  
  String Cohortype = "Population";
  String Population = "Population";
  if(Cohortype.equals(Population)){
  CommonBase.waitforsecond(10);
  CommonBase.waitForElementToLoad(NexttoCriteria, driver);
  NexttoCriteria.click();
  //driver.findElement(By.xpath("(//button[@type='button'])[17]")).click();
  CommonBase.waitforsecond(10);
  }
 }
 
 public void cohertNextButton(){
	 CommonBase.waitforsecond(10);
	 CommonBase.waitForElementToLoad(cohortNext, driver);
	 cohortNext.click();
 }


 public void IndexMed() throws InterruptedException {
  PageFactory.initElements(driver, this);
  Actions act = new Actions(driver);
  CommonBase.waitForElementToLoad(MedSrc, driver);
  act.dragAndDrop(MedSrc, indexDest).build().perform();
  MedSelections();
  GenerateCohort();
  CommonBase.waitforsecond(5);

 }


 public void MedSelections()  {
     CommonBase.waitForElementToLoad(selectMEDS, driver);
	 CommonBase.waitForElementToLoad(selectarea, driver);
	 (new Actions(driver)).dragAndDrop(selectMEDS, selectarea).perform();
  CommonBase.waitforsecond(10);
  CommonBase.sleep();
  MedsSearch.click();
  CommonBase.waitforsecond(10);
  MedsSearchFor.clear();
  MedsSearchFor.sendKeys("Lipitor");
  CommonBase.waitforsecond(10);
  CommonBase.sleep();
  MedsSearchButton.click();
  CommonBase.waitforsecond(10);
  CommonBase.sleep();
  MedsAddbutton.click();
  CommonBase.waitforsecond(10);
  //MedsCancel.click();
  CommonBase.sleep();
  MedsSearchFor.clear();
  CommonBase.waitforsecond(10);
  CommonBase.sleep();
  MedsSearchFor.sendKeys("Metformin");
  CommonBase.waitforsecond(10);
  CommonBase.sleep();
  MedsSearchButton.click();
  CommonBase.sleep();
  CommonBase.waitforsecond(10);
  CommonBase.sleep();
  MedsAddbutton.click();
  CommonBase.waitforsecond(10);
 }


 public void CoverageSelections()  {
	 WebDriverWait Exwait = new WebDriverWait(driver,200);
//	 CommonBase.waitForElementToLoad(selectMEDS, driver);
//	 CommonBase.waitForElementToLoad(selectarea, driver);
//	 
//	 (new Actions(driver)).dragAndDrop(selectMEDS, selectarea).perform();

  CommonBase.waitforsecond(20);
     COV.click();

  //CommonBase.waitforsecond(20);
  //CommonBase.sleep();
  WebElement coveditbutton = Exwait.until(ExpectedConditions.elementToBeClickable(covEditButton));
  coveditbutton.click();

  CommonBase.waitforsecond(20);
  JavascriptExecutor executor = (JavascriptExecutor) driver;
  executor.executeScript("arguments[0].click();", covMedEdit);

  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  covMedEditOption.click();

  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  executor.executeScript("arguments[0].click();", covPharEdit);

  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  covPharEditOption.click();

  CommonBase.waitforsecond(45);
  CommonBase.sleep();
  covSelect.click();

  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  executor.executeScript("arguments[0].click();", CONT);

  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  contEditButton.click();

  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  executor.executeScript("arguments[0].click();", contClaimEdit);
  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  contClaimEditOption.click();

  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  executor.executeScript("arguments[0].click();", contClinicalEdit);

  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  contClinicalEditOption.click();

  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  contSelect.click();
  
  CommonBase.waitforsecond(20);
 }

 public void GenerateCohort()  {

	 WebDriverWait Exwait = new WebDriverWait(driver,200);
	 CommonBase.waitforsecond(20);
  CommonBase.sleep();
  CommonBase.waitForElementToLoad(tickMark, driver);
  CommonBase.sleep();
  tickMark.click();
  CommonBase.sleep();
  CommonBase.waitforsecond(20);
  CommonBase.sleep();
  for (int i = 0; i <= 40;) {
   if (generateCohort.isDisplayed()) {
	   CommonBase.sleep();
    CommonBase.waitForElementToLoad(generateCohort, driver);
    generateCohort.click();
    break;
   }
   i++;
  }
  
  CommonBase.waitForElementToLoad(generateCohort, driver);
  CommonBase.sleep();
  CommonBase.sleep();
  CommonBase.sleep();
  repgenerateCohort.click();
  //CommonBase.waitforsecond(150);
  CommonBase.sleep();
  
  WebElement initalpanelnext = Exwait.until(ExpectedConditions.elementToBeClickable(initalPanelNext));
  initalpanelnext.click();
  CommonBase.sleep();
  CommonBase.sleep();
  CommonBase.sleep();
  CommonBase.sleep();
  CommonBase.sleep();
  
  driver.findElement(By.xpath("//img[@src='app/common/images/icon_refresh.png']")).click();;
  CommonBase.sleep();  
  
 //driver.findElement(By.xpath("//div[@class='wtChildContainer']//img[@alt='Existing store']")).click();
  
  WebElement complete1 = Exwait.until(ExpectedConditions.elementToBeClickable(complete));
  complete1.click();
  
  WebElement reportIcon1 = Exwait.until(ExpectedConditions.elementToBeClickable(reportIcon));
  reportIcon1.click();
  
  CommonBase.sleep();
  WTReportIcon.click();
  CommonBase.sleep();
  CommonBase.sleep();
  
  WebElement download1 = Exwait.until(ExpectedConditions.elementToBeClickable(download));
  download1.click();
  //download.click();
  CommonBase.sleep();
  //switchToWTwindowPage();
  driver.close();
  

 }


 public void ToWT() throws InterruptedException {
  CommonBase.waitforsecond(10);
  WTIcon.click();
  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

 }


 public void sleep() {
  try {
   Thread.sleep(20000);
  } catch (InterruptedException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
  }
 }
 
 public void switchToWTwindowPage() {
	 String Parent_Window = driver.getWindowHandle(); 
	 sleep();
	 for (String Child_Window : driver.getWindowHandles())  
     {  
	 driver.switchTo().window(Child_Window);
     }
 }
	public static String getMainWindowHandle() {
		return driver.getWindowHandle();
	}
	
	public void selectDate(){
		CommonBase.waitForElementToLoad(Date1, driver);
		  Date1.click();
	}


}	