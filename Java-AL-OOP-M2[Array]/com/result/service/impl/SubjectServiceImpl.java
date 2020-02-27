package com.result.service.impl;

import com.result.model.Subject;
import com.result.service.SubjectService;

public class SubjectServiceImpl implements SubjectService {

	private Subject[] subjects=new Subject[10];
	private int subjectCounter=0;
	
	@Override
	public void addSuject(Subject subject) {
		subjects[subjectCounter]=subject;
		subjectCounter++;
	}

	@Override
	public Subject getSubjectById(String subjectId) {
		
		for(int i=0;i<subjectCounter;i++) {
			if(subjectId.equals(subjects[i].getId())) {
				return subjects[i];
			}
		}
		return null;
	}

}
