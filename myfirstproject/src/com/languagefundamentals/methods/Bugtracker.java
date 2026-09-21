package com.languagefundamentals.methods;

public class Bugtracker {
	

	public static void main(String[] args) {
		System.out.println("main method started");

		Bugtracker b1=new Bugtracker();
		b1.getBugid();
		System.out.println("main method ended");
			}
	void getBugid(){
		int getBugid=101;
		System.out.println("Enter BugID:"+getBugid);
		ApplicationName();
	}
	void ApplicationName(){
		String An="weather";
		System.out.println("Enter ApllicationName:"+An);
		getBugTitle();
	}
	void getBugTitle() {
		String Bt="temperature";
		System.out.println("Enter the BugTitle:"+Bt);
		getseverity();
	}
	void getseverity() {
		String sv="high";
		System.out.println("Enter the everity:"+sv);
		getPriority();
		
	}
	
	void getPriority() {
		String pr="first";
		System.out.println("Enter the Priority:"+pr);
		getstatus();
	}
	void getstatus() {
		String status="completed";
		System.out.println("Enter the Status:"+status);
	}

}
