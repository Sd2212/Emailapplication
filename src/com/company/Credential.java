package com.company;

import java.util.Random;

public class Credential {

    String generateEmailAddress(String Frist, String Second, String Department){
       return Frist+ Second+"@"+Department+".com";}

          char[] generatepassword(int length){
            String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
            String specialcharacters = "!@#$z";
            String numbers = "0123456789";
            String cC= capitalCaseLetters+lowerCaseLetters+specialcharacters +numbers;

            Random r = new Random();
            char[] password = new char[length];
            password[0] =lowerCaseLetters.charAt(r.nextInt(lowerCaseLetters.length()));
            password[1] =capitalCaseLetters.charAt(r.nextInt(capitalCaseLetters.length()));
            password[2] =specialcharacters.charAt(r.nextInt(specialcharacters.length()));
            password[3] =numbers.charAt(r.nextInt(numbers.length()));

            for (int i=4;i<length;i++){
                password[i]= cC.charAt(r.nextInt(cC.length()));
            }
            return password;
    }

 void showcredentials(Email.model.Employee emp,String email,char[] generatepassword){
            System.out.println(emp.getFristname()+" Your Credentials are:" );
     System.out.println( "Email:  "+email);
                     System.out.println("Password: "+generatepassword);


 }
}
