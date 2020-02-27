package com.result.service.impl;

import com.result.model.Subject;
import com.result.service.ALResultService;
import com.result.service.SubjectService;

public class ALResultServiceImpl implements ALResultService{

	private String indexNumber;
	private SubjectService subjectService;
	
	private Subject[] studentSubject=new Subject[5];
	private Double[] studentMarks=new Double[5];
	
	private int counter=2;
	
	public ALResultServiceImpl(SubjectService subjectService) {
		this.subjectService=subjectService;
	}
	
	@Override
	public void assignIndexNumber(String indexNumber) {
		this.indexNumber=indexNumber;
		
	}
	@Override
	public void addMarks(String subjectId, Double marks) {
		Subject subjectObj=subjectService.getSubjectById(subjectId);
		studentSubject[counter]=subjectObj;
		studentMarks[counter]=marks;
		counter++;
		
	}
	@Override
	public double getTotal() {
		double total=0;
		if(counter==5) {
			for(int i=2;i<counter;i++) {
				total=total+studentMarks[i];
			}
		}
		return total;
	}
	@Override
	public double getAverage() {
		// TODO Auto-generated method stub
		return getTotal()/3;
	}
	@Override
	public double getStandardDevation() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void printResult() {
		if(counter==5) {
		System.out.println("----------------------- RESULT SHEET ---------------------");
		System.out.println("Index Number : " + this.indexNumber);
		System.out.println("Subject_ID\t|\tSubject_Name\t|\tMarks");
		
		for(int i=0;i<counter;i++) {
			System.out.println(studentSubject[i].getId()+"\t|\t"+studentSubject[i].getName()+"\t|\t"+studentMarks[i]);
		}
		System.out.println("Total : " + this.getTotal());
		System.out.println("Average : " + this.getAverage());
		}
	}

	@Override
	public void setEnglishMarks(String subjectId,Double marks) {
		Subject subObj=subjectService.getSubjectById(subjectId);
		studentSubject[0]=subObj;
		studentMarks[0]=marks;
	}

	@Override
	public void setAppituteMarks(String subjectId,Double marks) {
		Subject subObj=subjectService.getSubjectById(subjectId);
		studentSubject[1]=subObj;
		studentMarks[1]=marks;
		
	}
	
	
	
}
