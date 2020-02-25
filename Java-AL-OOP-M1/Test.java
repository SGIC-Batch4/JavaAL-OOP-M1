package com.sgic.result;

public class Test {

	public static void main(String[] args) {

		AL al1=new AL();
		al1.selectStream("Maths");
		
		Subject sub1=new Subject("001","Maths",80);
		al1.addSubject(sub1);
		al1.addSubject(new Subject("002","Physics",60));
		al1.addSubject(new Subject("003","Chemistry",40));
		al1.addSubject(new Subject("004","Tamil",60));
		
		al1.printResultSheet();
		

		AL al1=new AL();
		al1.selectStream("Maths");
		
		Subject sub1=new Subject("002","Maths",80);
		al1.addSubject(sub1);
		al1.addSubject(new Subject("001","Physics",60));
		al1.addSubject(new Subject("003","Chemistry",40));
		al1.addSubject(new Subject("004","Tamil",60));
		
		al1.printResultSheet();
	}

}
