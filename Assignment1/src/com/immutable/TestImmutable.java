package com.immutable;

public class TestImmutable {
  public static void main(String args[]) {
	  StudentData studentData = new StudentData("Pihu",80);
	  studentData.display(studentData.getName(), studentData.getRollNo());
  }
}
