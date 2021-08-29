package com.company;

import Email.model.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String Dept;
        String generatedEmail;
       char[] generatePassword;
       Employee emp= new Employee("Harshit","Sharma");
        Credential cs= new Credential();

         System.out.println("Please Enter the  Department");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resources");
        System.out.println("4.Legal");
        Scanner sc=new Scanner(System.in);
         int option=sc.nextInt();

         if (option==1){
             generatedEmail=cs.generateEmailAddress(emp.getFristname().toLowerCase(), emp.getSecondname().toLowerCase(),"Tech");
              generatePassword = cs.generatepassword(8);
              cs.showcredentials(emp,generatedEmail,generatePassword);}

           else if (option==2){
                 generatedEmail=cs.generateEmailAddress(emp.getFristname().toLowerCase(), emp.getSecondname().toLowerCase(),"Adm");
                 generatePassword = cs.generatepassword(8);
                 cs.showcredentials(emp,generatedEmail,generatePassword);
         }
         else if (option==3){
             generatedEmail=cs.generateEmailAddress(emp.getFristname().toLowerCase(), emp.getSecondname().toLowerCase(),"HR");
             generatePassword = cs.generatepassword(8);
             cs.showcredentials(emp,generatedEmail,generatePassword);
         }
         else if (option==4){
             generatedEmail=cs.generateEmailAddress(emp.getFristname().toLowerCase(), emp.getSecondname().toLowerCase(),"Legal");
             generatePassword = cs.generatepassword(8);
             cs.showcredentials(emp,generatedEmail,generatePassword);
         }
          else
              System.out.println("Invalid Option");
         }
}
