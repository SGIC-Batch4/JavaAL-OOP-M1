package com.result.service;

public interface ALResultService {

	public void assignIndexNumber(String indexNumber);
	public void addMarks(String subjectId,Double marks);
	public double getTotal();
	public double getAverage();
	public double getStandardDevation();
	public void setEnglishMarks(String subjectId,Double marks);
	public void setAppituteMarks(String subjectId,Double marks);
	public void printResult();
}
