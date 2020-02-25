package com.sgic.result;
import java.lang.Math;
public class AL implements ALResult{
	
	private String stream;
	private double englishMarks;
	private double appitudeMarks;
	private Subject[] subjects=new Subject[3];
	
	private int subjectCounter=0;
	
	@Override
	public double calculateTotal() {
		double total=0;
		for(int i=0;i<subjectCounter;i++) {
			total=total+subjects[i].getMarks();
		}
		return total;
	}
	@Override
	public double calcualteAvearge() {
		return calculateTotal()/subjectCounter;
	}
	@Override
	public double calcualteStandardDeviation() {
		double avg=calcualteAvearge();
		
		double variance=0;
		for(int i=0;i<subjectCounter;i++) {
			variance=variance+Math.pow((avg-subjects[i].getMarks()),2);
		}
		
		return Math.sqrt(variance);
	}
	@Override
	public void printResultSheet() {
		System.out.print("------------------ RESULT SHEET -------------------");
		System.out.println("Your Stream : "+this.stream);
		for(int i=0;i<subjectCounter;i++) {
			System.out.println(subjects[i].getName() + "\t:\t"+subjects[i].getMarks());
		}
		System.out.println("English : "+this.englishMarks);
		System.out.println("Apptitute : "+this.appitudeMarks);
		System.out.println("-------- Total: "+this.calculateTotal());
		System.out.println("-------- Avg: "+this.calcualteAvearge());
		System.out.println("-------- S.D: "+this.calcualteStandardDeviation());
	}
	@Override
	public void selectStream(String straemNaame) {
		this.stream=straemNaame;
		
	}
	@Override
	public void addSubject(Subject subject) {
		if(subjectCounter<3) {
			subjects[subjectCounter]=subject;
			subjectCounter++;
		}
		
	}
}
