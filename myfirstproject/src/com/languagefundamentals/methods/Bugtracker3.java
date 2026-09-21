package com.languagefundamentals.methods;

public class Bugtracker3 {
	int getBugid=101;
	String ApplicationName="weather";
	String getBugTitle="temperature";
	String getseverity="high";
	String getPriority="first";
	String getstatus="completed";
	
	public static void main(String[] args) {
		System.out.println("main method started");

		Bugtracker3 b1=new Bugtracker3();
		b1.getBugid();
		b1.ApplicationName();
		b1.getBugTitle();
		b1.getseverity();
		b1.getPriority();
		b1.getstatus();
		
		System.out.println("main method ended");	
		
	}
	void getBugid(){
		System.out.println("Enter BugID:  "+getBugid);
		}
	void ApplicationName(){
	System.out.println("Enter ApllicationName:"+ApplicationName);
	}
	void getBugTitle() {
	System.out.println("Enter the BugTitle:"+getBugTitle);
	}
	void getseverity() {
		System.out.println("Enter the everity:"+getseverity);
			
	}
	
	void getPriority(){
		System.out.println("Enter the Priority:"+getPriority);
	}
	void getstatus() {
		System.out.println("Enter the Status:"+getstatus);
	}


}
