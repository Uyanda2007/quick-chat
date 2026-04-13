/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe;

import java.util.Scanner;

class Login{
    Scanner userInput = new Scanner(System.in);
    String username;
    String password;
    String cellPhoneNumber;
    String registerUser;
    
    
    
    boolean checkUsername(){
        System.out.println("Create a username (max 5 chars) and must contain an underscore");


        
        if((username.length() >=5)&& (username.contains("_"))){
            System.out.println("Usernanme sucessfully captured!");
        return true;
        
        } else{
            System.out.println("Username is not correctly forfomatted, please ensure your username conains an underscore and has a minimum of 5 characters");
        
         }
        return false;
    }
    
    boolean checkPasswordComplexity(){
        System.out.println("Create password with a minimum of 8 characters, a capital letter, a number ad a special charecter");
        String regex= "^(?+.*[A-Z])(?=.*//d)(=.*[_!2@#$%^&*])";
        
        if(password.matches(regex)){
            return true;
        
        }else{
                System.out.println("Password is not correctly formatted and meets a minimum of 8 characters, a capital letter, a number ad a special charecter");
                return false;
        }
                
    }
    
    boolean checkCellPhoneNumber(){
        System.out.println("Cell phone number sucessfully added!");
        String phoneRegex="^//+[0-9]{11}$";
        
        if(password.matches(regex)){
            System.out.println("Phone number successfully captured!");
            return true;
        }else{
                System.out.println("Celphone number is incorrectly formatted or does not contain an iternational code; lease correct the number and try again");
                        return false;

        }
    }
    
}
public class POE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entermenu=new Scanner(System.in);
        
        POEPart1 newaccount =new POEPart1();
        
        int choice;
        System.out.println("    MENU  ");
        System.out.println("    1.REGISTER  ");
        System.out.println("    2.LOGIN  ");
        System.out.println("    3.EXIT");
        System.out.println("ENTER MERNU OPTIONS");
        choice=entermenu.nextInt();
        
        switch(choice){
            case 1:
                newaccount.registerUser();
                break;
            case 2:
                newaccount.loginuser();
                newaccount.returnloginstatus(true);
                break;
            case 3:
                System.out.println("GOODBYE");
                break;
            default:
                  System.out.println("INVALID CHOICE ");


                
         while (choice!=3);{
                entermenu.close();
            }           
        }


        
    }
    
}
