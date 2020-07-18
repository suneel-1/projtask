package com.example.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Requests {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int employeeId;
	private int projectId;
	private String description;
	private String activity;
	private int july1;
	private int july2;
	private int july3;
	private int july4;
	private int july5;
	private int july6;
	private int july7;
	private int july8;
	private int july9;
	private int july10;
	private int july11;
	private int july12;
	private int july13;
	private int july14;
	private int july15;
	private int totalhrs;
	private String status;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public int getJuly1() {
		return july1;
	}
	public void setJuly1(int july1) {
		this.july1 = july1;
	}
	public int getJuly2() {
		return july2;
	}
	public void setJuly2(int july2) {
		this.july2 = july2;
	}
	public int getJuly3() {
		return july3;
	}
	public void setJuly3(int july3) {
		this.july3 = july3;
	}
	public int getJuly4() {
		return july4;
	}
	public void setJuly4(int july4) {
		this.july4 = july4;
	}
	public int getJuly5() {
		return july5;
	}
	public void setJuly5(int july5) {
		this.july5 = july5;
	}
	public int getJuly6() {
		return july6;
	}
	public void setJuly6(int july6) {
		this.july6 = july6;
	}
	public int getJuly7() {
		return july7;
	}
	public void setJuly7(int july7) {
		this.july7 = july7;
	}
	public int getJuly8() {
		return july8;
	}
	public void setJuly8(int july8) {
		this.july8 = july8;
	}
	public int getJuly9() {
		return july9;
	}
	public void setJuly9(int july9) {
		this.july9 = july9;
	}
	public int getJuly10() {
		return july10;
	}
	public void setJuly10(int july10) {
		this.july10 = july10;
	}
	public int getJuly11() {
		return july11;
	}
	public void setJuly11(int july11) {
		this.july11 = july11;
	}
	public int getJuly12() {
		return july12;
	}
	public void setJuly12(int july12) {
		this.july12 = july12;
	}
	public int getJuly13() {
		return july13;
	}
	public void setJuly13(int july13) {
		this.july13 = july13;
	}
	public int getJuly14() {
		return july14;
	}
	public void setJuly14(int july14) {
		this.july14 = july14;
	}
	public int getJuly15() {
		return july15;
	}
	public void setJuly15(int july15) {
		this.july15 = july15;
	}
	public int getTotalhrs() {
		return totalhrs;
	}
	public void setTotalhrs(int totalhrs) {
		this.totalhrs = totalhrs;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
}
