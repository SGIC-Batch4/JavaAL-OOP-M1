package com.result.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.result.model.Subject;
import com.result.service.ALResultService;
import com.result.service.SubjectService;

public class ALResultServiceImpl implements ALResultService {

	private String indexNumber;
	private SubjectService subjectService;

	Map<Subject, Double> resultSheet = new HashMap<Subject, Double>();
	List<Subject> skipSubjects = new ArrayList();

	public ALResultServiceImpl(SubjectService subjectService) {
		this.subjectService = subjectService;
	}

	@Override
	public void assignIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;

	}

	@Override
	public void addMarks(String subjectId, Double marks) {
		Subject subjectObj = subjectService.getSubjectById(subjectId);
		resultSheet.put(subjectObj, marks);
	}

	@Override
	public double getTotal() {
		double total = 0;
		if (this.resultSheet.size() == 5) {
			Set set = resultSheet.entrySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry mentry = (Map.Entry) iterator.next();
				Subject subject = (Subject) mentry.getKey();
				if (!skipSubjects.contains(subject)) {
					total=total+(double)mentry.getValue();
				}
			}

		}
		return total;
	}

	@Override
	public double getAverage() {
		return getTotal() / 3;
	}

	@Override
	public double getStandardDevation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printResult() {
		if (this.resultSheet.size() == 5) {
			System.out.println("----------------------- RESULT SHEET ---------------------");
			System.out.println("Index Number : " + this.indexNumber);
			System.out.println("ID\t|\tName\t|\tMarks");

			Set set = resultSheet.entrySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry mentry = (Map.Entry) iterator.next();
				Subject subject = (Subject) mentry.getKey();
				System.out.println(subject.getId() + "\t|\t" + subject.getName() + "\t|\t" + mentry.getValue());
			}

			System.out.println("Total : " + this.getTotal());
			System.out.println("Average : " + this.getAverage());
		}
	}

	@Override
	public void setEnglishMarks(String subjectId, Double marks) {
		Subject subObj = subjectService.getSubjectById(subjectId);
		resultSheet.put(subObj, marks);
	}

	@Override
	public void setAppituteMarks(String subjectId, Double marks) {
		Subject subObj = subjectService.getSubjectById(subjectId);
		resultSheet.put(subObj, marks);

	}

	@Override
	public void skipSubjectForTotal(String subjectId) {
		Subject subObj = subjectService.getSubjectById(subjectId);
		skipSubjects.add(subObj);
	}

}
