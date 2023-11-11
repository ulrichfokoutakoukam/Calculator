package com.calculator;


/**
 * this class handle central calculations
 * @author ulrich Takoukam
 */
public class Operations {
	
	private static double m_dMemoryValue = 0;
	
	
	static double getOperationResult(String iStrExpression) {
		
		double dVal = 0;
		return dVal;
		
	}

	
	static void resetMemory() {
		m_dMemoryValue = 0;
	}
	
	static void updateMemory(double iDVal) {
		m_dMemoryValue = iDVal;
	}
	
	static void appendToMemory(double iDVal) {
		m_dMemoryValue += iDVal;
	}
	
	static double getFromMemory() {
		return m_dMemoryValue;
	}
}
