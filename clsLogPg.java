package com.selenium.test.testng.tests;

import com.selenium.test.webtestsbase.clsAbstrD2Tst;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.ISuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Properties;

import static com.selenium.test.configuration.clsCnstnts.*;
import static com.selenium.test.reports.clsRprtr.report;
import static com.selenium.test.utils.clsPausePrgrm.waitSec;
import static com.selenium.test.utils.clsWebUtils.*;
import static com.selenium.test.webtestsbase.clsDorg2WDF.driver;
import static org.testng.Assert.assertTrue;

//import static com.selenium.test.utils.clsTstUtils.*;


/**
 *
 * Created by ritabeigh on 10/1/15.
 *
 */

public class clsLogPg extends clsAbstrD2Tst
{
	private static Boolean blnNav;

	private static Properties assertProps = null;
	public         String     fileName    = clsLogPg.class.getSimpleName();
	public String strRptOutDir;
	List<XmlSuite> xmlSuites;
	List<ISuite>   Suites;
	private Boolean blnBrwsrOpen = false;

	public static String getAssertValue(String strKey)
	{
		return assertProps(strKey);
	}

	public static String assertProps(String strKey)
	{
		return null;
	}

	@BeforeSuite(description = "DORG2TstSuite")
	public void doB4Suite() throws Exception
	{
		System.out.println("In BeforeSuite: LogPgTst");
		openBrowser();
		blnNav = blnIsNav();
	}

	// Test Case TC001
	@Test(groups = "grpLPT", testName = "tstNotValidLoginPWD", alwaysRun = true)

	public void tstNotValidLoginPWD() throws Exception
	{
		String strMsgP 		= "PASS: Login failed with invalid Password.";
		String strMsgF 		= "FAIL: Login with invalid Password was NOT successful.";
		String strOut     = "";
		String strTC_Num  = "TC001";
		String strTC_Name = "tstNotValidLoginPWD";
		String strTC_Desc = "Verify that Login functions correctly with valid " +
												"UID and incorrect PWD";
		System.out.println("In " + strTC_Name);
		Boolean blnPF;

		try
		{
			//Enter correct username and bogus password
			sendKey(LOGIN, UID);
			sendKey(PASSWORD, "RoadRunner");
			clickAnElement(BTNLOG, intID);

			blnPF		=	driver.getCurrentUrl().endsWith("login");

			strOut	= (blnPF ? strMsgP : strMsgF);

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

			// Clear the UID and PWD fields
			driver.findElement(By.id(LOGIN)).clear();
			driver.findElement(By.id(PASSWORD)).clear();
		}
	}

	//     Test Case TC002
	@Test(groups = "grpLPT", testName = "tstNotValidLoginUID",
				dependsOnMethods = {"tstNotValidLoginPWD"}, alwaysRun = true)
	public void tstNotValidLoginUID() throws Exception
	{
		//WebElement wblWarng;
		String	strMsgP			= "PASS: Login failed with invalid User ID";
		String	strMsgF			= "FAIL: Login with invalid User ID was NOT successful.";
		String	strOut			= "";
		String	strTC_Num		= "TC002";
		String	strTC_Name	= "tstNotValidLoginUID";
		String	strTC_Desc	=	"Verify that Login functions " +
													"correctly with incorrect UID and valid PWD";
		System.out.println("In " + strTC_Name);
		Boolean blnPF;

		try
		{
			// Send PWD and Wile E. Coyote to the UID and PWD textboxes
			sendKey(LOGIN, "Wile E. Coyote");
			sendKey(PASSWORD, PWD);
			clickAnElement(BTNLOG, intID);

			blnPF		= driver.getCurrentUrl().endsWith("login");

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

			// Clear the UID and PWD fields
			driver.findElement(By.id(LOGIN)).clear();
			driver.findElement(By.id(PASSWORD)).clear();
		}
	}

	// Test Case TC003
	@Test(groups = "grpLPT", testName = "tstValidLogin",
				dependsOnMethods = {"tstNotValidLoginUID"}, alwaysRun = true)
	public void tstValidLogin() throws Exception, NoSuchElementException
	{
		String		strOut			=		"";
		String		strTC_Num		=		"TC003";
		String		strTC_Name	=		"tstValidLogin";
		String		strTC_Desc	=		"Verify that user can log in when using a valid UID and PWD";
		String		strMsgP			=		"PASS: Valid Login successful Dorg2 Dashboard page is open.";
		String		strMsgF			=		"FAIL: Valid Login not successful.";
		String		strModl00		=		"wm-close-button";
		String		strModl01		=		"walkme-custom-balloon-close-button";
		Boolean		blnPF				=		false;

		System.out.println("In " + strTC_Name);

		try
		{
			// Send PWD and Wile E. Coyote to the UID and PWD textboxes
			sendKey(LOGIN, UID);
			sendKey(PASSWORD, PWD);
			clickAnElement(BTNLOG, intID);
			waitSec(5);
			blnPF = driver.getCurrentUrl().endsWith("dashboard");

			strOut = (blnPF ? strMsgP : strMsgF);




			assertTrue(blnPF, strOut);
			report(TSTVAL, strTC_Num + ": " + " - " + strTC_Desc, strOut);

			Exception e = new Exception();
			throw e;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			/*closeWM(strModl00);
			closeWM(strModl01);*/
			closeWM("wm-close-link");
		}
	}
}
