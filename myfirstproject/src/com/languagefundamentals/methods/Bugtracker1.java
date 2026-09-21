package com.languagefundamentals.methods;

public class Bugtracker1 {
	int getBugid=101;
	String ApplicationName="weather";
	String getBugTitle="temperature";
	String getseverity;
	String getPriority;
	String getstatus;
	
	public static void main(String[] args) {
		System.out.println("main method started");

		Bugtracker1 b1=new Bugtracker1();
		b1.getBugid();
		System.out.println("main method ended");
			}
	void getBugid(){
		System.out.println("Enter BugID:"+getBugid);
		ApplicationName();
	}
	void ApplicationName(){
	System.out.println("Enter ApllicationName:"+ApplicationName);
		getBugTitle();
	}
	void getBugTitle() {
	System.out.println("Enter the BugTitle:"+getBugTitle);
		getseverity();
	}
	void getseverity() {
		System.out.println("Enter the everity:"+getseverity);
		getPriority();
		
	}
	
	void getPriority(){
		System.out.println("Enter the Priority:"+getPriority);
		getstatus();
	}
	void getstatus() {
		System.out.println("Enter the Status:"+getstatus);
	}

}



