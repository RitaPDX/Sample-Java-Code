package com.selenium.test.testng.tests;

import com.selenium.test.webtestsbase.clsAbstrD2Tst;
import com.selenium.test.webtestsbase.clsLogPgWTB;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.selenium.test.configuration.clsCnstnts.*;
//import static com.selenium.test.configuration.clsCnstnts.TSTVAL;
import static com.selenium.test.reports.clsRprtr.report;
import static com.selenium.test.utils.clsWebUtils.*;
import static com.selenium.test.webtestsbase.clsDorg2WDF.driver;
import static org.testng.Assert.assertTrue;

/*
 *
 *
 * Created by ritabeigh on 10/21/15.
 *
 *
 */
public class clsMainPgNav extends clsAbstrD2Tst
{
	private static clsLogPgWTB lpgD2LogInPg;
	private static Boolean     blnPF;
	private static Boolean blnLIUNran = false;

		/*
		 *
		 * Test to see if browser is running. If not then
		 * start it, otherwise continue testing
		 *
		 */


	// TC004
	@Test(groups = "grpMPN", testName = "tstLIUNDrpDn",
				dependsOnGroups = "grpLPT", alwaysRun = true)
	public void tstLIUNDrpDn() throws Exception
	{
		String  strMsgP      = "PASS: Logged In User Name WebElement is present and functional.";
		String  strMsgF      = "FAIL: Dropdown menu elements missing or incorrect.";
		String  strOut       = "";
		String  strMyWebEl   = "Navigation-LoggedInUserName";
		String  strRRWebEl   = "Navigation-ResearchRequest";
		String  strAcctSttng = "Navigation-AccountSettings";
		String  strSgnOut    = "Navigation-SignOut";
		Boolean blnRR        = false;
		Boolean blnAcctSttng = false;
		Boolean blnSgnOut    = false;
		Boolean blnPF        = false;
		Boolean blnLIUN      = false;
		String  strTC_Num    = "TC004";
		String  strTC_Name   = "tstLIUNDrpDwn";
		String  strTC_Desc   = "Verify that the Logged In User Name drop-down menu can be opened and closed.";

		System.out.println("In " + strTC_Name);

		try
		{
			if (blnLIUNran == true)
			{
				return;
			}
			else
			{
				blnLIUN = driver.findElement(By.id(strMyWebEl)).isDisplayed();
				if (blnLIUN == true)
				{
					//driver.findElement(By.id(strMyWebEl)).click();
					clickAnElement(strMyWebEl, intID);
					blnRR = driver.findElement(By.id(strRRWebEl)).isDisplayed();
					blnAcctSttng = driver.findElement(By.id(strAcctSttng)).isDisplayed();
					blnSgnOut = driver.findElement(By.id(strSgnOut)).isDisplayed();
				}

				if ((blnRR == true) && (blnAcctSttng == true) && (blnSgnOut == true))
				{
					strOut = strMsgP;
					blnPF = true;
				}
				else
				{
					strOut = strMsgF;
					blnPF = false;
				}
			}

			//driver.findElement(By.id(strMyWebEl)).click();
			clickAnElement(strMyWebEl, intID);
			blnLIUNran = true;
			assertTrue(blnPF, strOut);
			Exception e = new Exception();
			throw e;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			report(TSTVAL, strTC_Num + ": " + " - " + strTC_Desc, strOut);
		}
	}

	// TC005
/*		@Test(groups = "grpMPN", testName = "tstNavHlp", dependsOnMethods = {"tstLIUNDrpDn"}, alwaysRun = true)
		public void tstNavHlp() throws Exception
			{

						//Verify that the Help WebElement is present

				String  strOut = "";
				String  strMyWebEl = "Navigation-Help";
				String  strTC_Num  = "TC005";
				String  strTC_Name = "tstNavHlp";
				String  strTC_Desc = "Verify that the Dorg2 Help page is available.";
				Boolean blnPF;
				System.out.println("In " + strTC_Name);

				try
					{
					blnPF = driver.findElement(By.id(strMyWebEl)).isDisplayed();
					if (blnPF == true)
						{
						strOut = "PASS: Help page has been found and opened.";
						}
					else
						{
						// There is an error
						strOut = "FAIL: The Help Web Element can not be found.";
						}
					assertTrue(blnPF, strOut);
					Exception e = new Exception();
					throw e;
					}
				catch (Exception e)
					{
					e.printStackTrace();
					}
				finally
					{
					report(TSTVAL, strTC_Num + ": " + " - " + strTC_Desc, strOut);
					}
			}

		// TC006
		@Test(groups = "grpMPN", testName = "tstQukSrch", dependsOnMethods = {"tstNavHlp"}, alwaysRun = true)
		public void tstQukSrch() throws Exception
			{
				String  strOut = "";
				String  strMyWebEl = "QuickSearchInput";
				String  strTC_Num  = "TC006";
				String  strTC_Name = "tstQukSrch";
				String  strTC_Desc = "Verify that the Dorg2 Quick Search WebElement is present.";
				Boolean blnPF;
				System.out.println("In " + strTC_Name);

				try
					{
					blnPF = driver.findElement(By.id(strMyWebEl)).isDisplayed();
					if (blnPF == true)
						{
						strOut = "PASS: The Quick Search WebElement is present.";
						}
					else
						{
						// There is an error
						strOut = "FAIL: The Quick Search WebElement can not be found.";
						blnPF = false;
						}
					assertTrue(blnPF, strOut);
					Exception e = new Exception();
					throw e;
					}
				catch (Exception e)
					{
					e.printStackTrace();
					}
				finally
					{
					report(TSTVAL, strTC_Num + ": " + " - " + strTC_Desc, strOut);
					}
			}

		// TC007
		@Test(groups = "grpMPN", testName = "tstSrch", dependsOnMethods = {"tstQukSrch"}, alwaysRun = true)
		public void tstSrch() throws Exception
			{
				String  strOut = "";
				String  strMyWebEl = "Navigation-0";
				String  strTC_Num  = "TC007";
				String  strTC_Name = "tstSrch";
				String  strTC_Desc = "Verify that the Dorg2 Search tab WebElement is present.";
				Boolean blnPF;
				System.out.println("In " + strTC_Name);

				try
					{
					blnPF = driver.findElement(By.id(strMyWebEl)).isDisplayed();
					if (blnPF == true)
						{
						strOut = "PASS: The Search tab WebElement is present.";
						}
					else
						{
						// There is an error
						strOut = "FAIL: The Search tab WebElement can not be found.";
						blnPF = false;
						}
					assertTrue(blnPF, strOut);
					Exception e = new Exception();
					throw e;
					}
				catch (Exception e)
					{
					e.printStackTrace();
					}
				finally
					{
					report(TSTVAL, strTC_Num + ": " + " - " + strTC_Desc, strOut);
					}
			}

		// TC008
		@Test(groups = "grpMPN", testName = "tstDshbrd", dependsOnMethods = {"tstSrch"}, alwaysRun = true)
		public void tstDshbrd() throws Exception
			{
				String  strOut = "";
				String  strMyWebEl = "Navigation-1";
				String  strTC_Num  = "TC008";
				String  strTC_Name = "tstDshbrd";
				String  strTC_Desc = "Verify that the Dorg2 Dashboard tab WebElement is present.";
				Boolean blnPF;
				System.out.println("In " + strTC_Name);

				try
					{
					blnPF = driver.findElement(By.id(strMyWebEl)).isDisplayed();
					if (blnPF == true)
						{
						strOut = "PASS: The Dorg2 Dashboard tab WebElement is present.";
						}
					else
						{
						// There is an error
						strOut = "FAIL: The Dorg2 Dashboard tab WebElement can not be found.";
						}
					assertTrue(blnPF, strOut);
					Exception e = new Exception();
					throw e;
					}
				catch (Exception e)
					{
					e.printStackTrace();
					}
				finally
					{
					report(TSTVAL, strTC_Num + ": " + " - " + strTC_Desc, strOut);
					}
			}

		// TC009
		@Test(groups = "grpMPN", testName = "tstMyLst", dependsOnMethods = {"tstDshbrd"}, alwaysRun = true)
		public void tstMyLst() throws Exception
			{
				String  strOut = "";
				String  strMyWebEl = "Navigation-2";
				String  strTC_Num  = "TC009";
				String  strTC_Name = "tstMyLst";
				String  strTC_Desc = "Verify that the Dorg2 My Lists tab WebElement is present.";
				Boolean blnPF;
				System.out.println("In " + strTC_Name);

				try
					{
					blnPF = driver.findElement(By.id(strMyWebEl)).isDisplayed();
					if (blnPF == true)
						{
						strOut = "PASS: The Dorg2 My Lists tab WebElement is present.";
						}
					else
						{
						// There is an error
						strOut = "FAIL: The Dorg2 My Lists tab WebElement can not be found.";
						}
					assertTrue(blnPF, strOut);
					Exception e = new Exception();
					throw e;
					}
				catch (Exception e)
					{
					e.printStackTrace();
					}
				finally
					{
					report(TSTVAL, strTC_Num + ": " + " - " + strTC_Desc, strOut);
					}
			}

		// TC010
		@Test(groups = "grpMPN", testName = "tstMngUsrs", dependsOnMethods = {"tstMyLst"}, alwaysRun = true)
		public void tstMngUsrs() throws Exception
			{
				String  strOut = "";
				String  strMyWebEl = "Navigation-3";
				String  strTC_Num  = "TC010";
				String  strTC_Name = "tstSrch";
				String  strTC_Desc = "Verify that the Dorg2 Manage Users tab WebElement is present.";
				Boolean blnPF;
				System.out.println("In " + strTC_Name);


				try
					{
					blnPF = driver.findElement(By.id(strMyWebEl)).isDisplayed();
					if (blnPF == true)
						{
						strOut = "PASS: The Manage Users tab WebElement is present.";
						}
					else
						{
						// There is an error
						strOut = "FAIL: The Manage Users tab WebElement can not be found.";
						}
					assertTrue(blnPF, strOut);
					Exception e = new Exception();
					throw e;
					}
				catch (Exception e)
					{
					e.printStackTrace();
					}
				finally
					{
					report(TSTVAL, strTC_Num + ": " + " - " + strTC_Desc, strOut);
					}

			}

		// TC011
		@Test(groups = "grpMPN", testName = "tstReArrngWdgt", dependsOnMethods = {"tstMngUsrs"}, alwaysRun = true)
		public void tstReArrngWdgt() throws Exception
			{
				String  strOut     = "";
				String  strMyWebEl = "Navigation-0";
				String  strTC_Num  = "TC011";
				String  strTC_Name = "tstSrch";
				String  strTC_Desc = "Verify that the Dorg2 Rearrange Widgets WebElement is present.";
				String  strMsgP    = "PASS: The Rearrange Widgets WebElement is present.";
				String  strMsgF    = "FAIL: The Rearrange Widgets WebElement can not be found.";
				Boolean blnPF      = false;
				System.out.println("In " + strTC_Name);

				try
					{
					blnPF = driver.findElement(By.id(strMyWebEl)).isDisplayed();
					strOut = (blnPF ? strMsgP : strMsgF);
					assertTrue(blnPF, strOut);
					Exception e = new Exception();
					throw e;
					}
				catch (Exception e)
					{
					e.printStackTrace();
					}
				finally
					{
					report(TSTVAL, strTC_Num + ": " + " - " + strTC_Desc, strOut);
					}
			}*/
}
