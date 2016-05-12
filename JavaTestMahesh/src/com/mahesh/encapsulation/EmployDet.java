package com.mahesh.encapsulation;

public class EmployDet {
	public static void main(String[] args) {
		Employ empObj = new Employ();
		empObj.setEmpSalary(3323);
		empObj.setEmpNme("mahesh");
		empObj.setEmpId(223);
		empObj.setEmpGender("male");
		empObj.setEmpBatch(21);
		empObj.setEmpAge(32);
		empObj.setEmpAddress("MArathalli");

		System.out.println("empNme : " + empObj.getEmpNme());
		System.out.println("empId : " + empObj.getEmpId());
		System.out.println("empSalary : " + empObj.getEmpSalary());
		System.out.println("empAddress : " + empObj.getEmpAddress());
		System.out.println("empBatch : " + empObj.getEmpBatch());
		System.out.println("empAge : " + empObj.getEmpAge());
		System.out.println("empGender : " + empObj.getEmpGender());
	}
}
