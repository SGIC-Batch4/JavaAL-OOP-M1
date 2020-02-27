package com.result;

import com.result.model.Subject;
import com.result.service.ALResultService;
import com.result.service.SubjectService;
import com.result.service.impl.ALResultServiceImpl;
import com.result.service.impl.SubjectServiceImpl;

public class App {

	public static void main(String[] args) {
		
		SubjectService subjectStore=new SubjectServiceImpl();
		subjectStore.addSuject(new Subject("C001","English"));
		subjectStore.addSuject(new Subject("C002","Apitude"));
		subjectStore.addSuject(new Subject("S001","CombinedMaths"));
		subjectStore.addSuject(new Subject("S002","Biology"));
		subjectStore.addSuject(new Subject("S003","Physics"));
		subjectStore.addSuject(new Subject("S004","Chemistry"));
		
		ALResultService alRes1=new ALResultServiceImpl(subjectStore);
		alRes1.assignIndexNumber("IN0001");
		alRes1.setAppituteMarks("C002", 67.0);
		alRes1.setEnglishMarks("C001", 75.0);
		alRes1.addMarks("S001", 56.0);
		alRes1.addMarks("S003", 78.0);
		alRes1.addMarks("S004", 67.0);
		alRes1.printResult();
		
		ALResultService alRes2=new ALResultServiceImpl(subjectStore);
		alRes2.assignIndexNumber("IN0002");
		alRes2.setAppituteMarks("C002", 75.0);
		alRes2.setEnglishMarks("C001", 80.0);
		alRes2.addMarks("S001", 82.0);
		alRes2.addMarks("S003", 78.0);
		alRes2.addMarks("S004", 75.0);
		alRes2.printResult();
	}

}
