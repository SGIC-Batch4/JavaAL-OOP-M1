package com.sgic.result;

public interface ALResult {
	
	
	public void selectStream(String straemNaame);
	public void addSubject(Subject subject );
	public double calculateTotal();
	public double calcualteAvearge();
	public double calcualteStandardDeviation();
	public void printResultSheet();
}
