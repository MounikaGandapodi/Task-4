import java.io.*;
import java.util.*;
public class Online_Exam 
{
   Scanner input=new Scanner(System.in);
   HashMap<String,Integer> data=new HashMap<String,Integer>();
	
	public void login() {
		data.put("Geetha",1111);
		data.put("Seetha",2222);
		System.out.println("-----Welcome to the ONLINE EXAM portal-----");
		String userid;
		int pwd;
		System.out.println("Login to continue to the exam.....");
		System.out.println("Enter user id");
		userid=input.next();
		System.out.println("Enter password");
		pwd=input.nextInt();
		if(data.containsKey(userid) && data.get(userid)==pwd)
		{
			System.out.println("Login sucessful");
				option_menu();
		}
		else {
			System.out.println("Invalid Login");
			System.out.println("Try again");
				login();
		}
	}
	public void option_menu() {
		int select;
		System.out.println("Enter the option you want to perform");
		System.out.println("1.Update profile and password");
		System.out.println("2.Start the exam");
		System.out.println("3.Logout");
		select=input.nextInt();
		switch(select) {
		case 1:
			data=update();
			option_menu();
			break;
		case 2:
			exam();
			option_menu();
			break;
		case 3:
			System.out.println("Thank you for writing the ONLINE EXAM ......");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid entry");
		}
	}
	public HashMap<String,Integer> update(){
		String uuser;
		int newpwd;
		System.out.println("Welcome to Update profile");
		System.out.println("Enter user name");
		uuser=input.next();
		if(data.containsKey(uuser)) {
		System.out.println("Enter the  new password that you want to update your profile");
		newpwd = input.nextInt();
		data.replace(uuser, newpwd);
		}
		
		else {
			System.out.println("User does not exist");
		}
		return data;
	}
public void exam() {
	long examtime=System.currentTimeMillis();
	long endtime=examtime+30*1000;
	int ans_count=0;
	int ans,score;
	System.out.println("Start the exam");
	while(System.currentTimeMillis()<endtime) {
		System.out.println("You have 30 seconds to answer 5 questions");
		System.out.println("Each question carries 10 marks"+" "+"-5 for wrong answer");
		System.out.println("\n -------->Q1. 5+1 = ?");
		System.out.println("1)10"+"\t"+"2)20"+"\t"+"3)6"+"\t"+"4)15");
		System.out.println("Enter the correct option");
		ans=input.nextInt();
		System.out.println("Answer is Locked...");
		if(ans==3) {
			ans_count++;
		}
		System.out.println("\n -------->Q2. 20+2 = ?");
		System.out.println("1)18"+"\t"+"2)27"+"\t"+"3)22"+"\t"+"4)25");
		System.out.println("Enter the correct option");
		ans=input.nextInt();
		System.out.println("Answer is Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("\n -------->Q3. 44+33 = ?");
		System.out.println("1.77"+"\t"+"2.14"+"\t"+"3.56"+"\t"+"4.75");
		System.out.println("Enter the correct option");
		ans=input.nextInt();
		System.out.println("Answer is Locked...");
		if(ans==1) {
			ans_count++;
		}
		System.out.println("\n -------->Q4.80+3 = ?");
		System.out.println("1)91"+"\t"+"2)83"+"\t"+"3)89"+"\t"+"4)63");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("\n -------->Q5. 57+3 = ?");
		System.out.println("1)60"+"\t"+"2)63"+"\t"+"3)64"+"\t"+"4)55");
		System.out.println("Enter the correct option");
		ans=input.nextInt();
		System.out.println("Answer is  Locked...");
		if(ans==1) {
			ans_count++;
		}
		break;
	}
	System.out.println("You have finished the exam !!");
	score=ans_count*10-((5-ans_count)*5);
	System.out.println("Your score is..."+" "+score);	
  }
 }


