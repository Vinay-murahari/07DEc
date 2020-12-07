package com.vinay.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
		@Id
		@Column(name="student_id")
		public int student_id;
		@Column(name="student_fname")
		public String student_fname;
		@Column(name="student_lname")
		public String student_lname;
		@Column(name="student_adress")
		public String student_adress;
		
		public Student() {
			
		}
		public Student(int student_id, String student_fname, String student_lname, String student_adress) {
			super();
			this.student_id = student_id;
			this.student_fname = student_fname;
			this.student_lname = student_lname;
			this.student_adress = student_adress;
		}
		public int getStudent_id() {
			return student_id;
		}
		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}
		public String getStudent_fname() {
			return student_fname;
		}
		public void setStudent_fname(String student_fname) {
			this.student_fname = student_fname;
		}
		public String getStudent_lname() {
			return student_lname;
		}
		public void setStudent_lname(String student_lname) {
			this.student_lname = student_lname;
		}
		public String getStudent_adress() {
			return student_adress;
		}
		public void setStudent_adress(String student_adress) {
			this.student_adress = student_adress;
		}
		@Override
		public String toString() {
			return "Student_Model [student_id=" + student_id + ", student_fname=" + student_fname + ", student_lname="
					+ student_lname + ", student_adress=" + student_adress + "]";
		}
		
		
}