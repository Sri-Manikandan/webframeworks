package com.example.practice_at_home_1.Models;

public class Student {
     private int id;
     private String studentName;
     private String departmentName;
     private String mailid;

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getStudentName() {
          return studentName;
     }

     public Student(int id, String studentName, String departmentName, String mailid) {
          this.id = id;
          this.studentName = studentName;
          this.departmentName = departmentName;
          this.mailid = mailid;
     }

     public void setStudentName(String studentName) {
          this.studentName = studentName;
     }

     public String getDepartmentName() {
          return departmentName;
     }

     public void setDepartmentName(String departmentName) {
          this.departmentName = departmentName;
     }

     public String getMailid() {
          return mailid;
     }

     public void setMailid(String mailid) {
          this.mailid = mailid;
     }
}
