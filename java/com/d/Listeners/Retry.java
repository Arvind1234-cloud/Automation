package com.d.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	public int Retrycount=3;
	public int Counter=0;


	@Override
	public boolean retry(ITestResult result) {
		
		if(Counter<Retrycount){
			
			Counter++;
			return true;
		}
		
		return false;
	}

}
