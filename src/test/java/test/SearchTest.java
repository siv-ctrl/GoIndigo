package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.WrapperClass;
import excel.Excel;
import pages.SearchPage;

public class SearchTest extends WrapperClass {

@BeforeClass
public void startUp() {
	launchApplication();
	openWebsite();
}

@Test
public void searchTest() throws InterruptedException, Exception {
	//Thread.sleep(1000);
	SearchPage searchPage=new SearchPage(driver);
	searchPage.search(Excel.getvalue1(), Excel.getvalue2());;
}

@AfterMethod
public void close() {
	closeBrowser();
}
}
