package com.calculator.test;

import com.calculator.Main;
import com.calculator.test.locators.MainActivityLocators;
import com.robotium.solo.Solo;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<Main>{

	Instrumentation instrumentation = null;
	Main mainActivity = null;
	
	public MainActivityTest() {
		super(Main.class);
		
	}
	private Solo solo;
	
	/**
	 * This setup is to run before test case is started.
	 * This is where the solo object is created.
	 */
	@Override
	public void setUp() throws Exception {		
		if(solo == null)
		{
			instrumentation = getInstrumentation();

			
			/******** Added Code ******************/		

			mainActivity = getActivity();
			assertNotNull(mainActivity);
			solo = new Solo(instrumentation,mainActivity);
		}
	}
	/**
	 * Verify The Header is  correct .
	 */
	public void test001_verifyHeader()
	{
		String sHeader = MainActivityLocators.header;
		System.out.println("...som.." + solo.getText(1).getText().toString());
		
		boolean isUserIDEditAvailable = solo.searchEditText(sHeader);
		System.out.println("...som..." + isUserIDEditAvailable);
		assertTrue(isUserIDEditAvailable);
	}

}
