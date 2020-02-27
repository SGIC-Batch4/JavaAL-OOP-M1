package com.result.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.result.model.Subject;
import com.result.service.SubjectService;

public class SubjectServiceImpl implements SubjectService {

	private List<Subject> subjects=new ArrayList<Subject>();
	
	
	@Override
	public void addSuject(Subject subject) {
		this.subjects.add(subject);
	}

	@Override
	public Subject getSubjectById(String subjectId) {
		
	
		for(Subject subjectObj:this.subjects) {
			if(subjectId.equals(subjectObj.getId())) {
				return subjectObj;
			}
		}
		return null;
	}

}
