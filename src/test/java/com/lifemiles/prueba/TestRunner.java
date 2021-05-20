package com.lifemiles.prueba;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//usar este para probar una sola clase
public class TestRunner {
	//clases junit
	/*
	 * Assert
	 * TestCase
	 * TestResult
	 */
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestUnit.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
}
