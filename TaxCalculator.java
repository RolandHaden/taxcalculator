/*
Title: Tax Calculator
Author: Davis Haden
Date Created: 10-13-2020
Last Date Modified: 10-16-2020
*/
import java.util.Scanner;//Scanner Class
public class TaxCalculator{
   public static void main(String [] args){
      Scanner input = new Scanner(System.in);
      double income;//Amount of money made
      double tax;//Tax (Can vary based on income)
      double taxOwed;//Tax * Income but only after the deduction
      double deductible = 0;//deuction # which changes based on if you are the Head of House hold or Single.
      String marriage;//used for displaying marriage status
      String isHOH = " ";//used for displaying Head of House hold status.
      //asking for information before calcualting
      System.out.print("Are you a head of household? (Yes/No): ");
      marriage = input.nextLine();
      System.out.print("What is your annual income?: ");
      income = input.nextDouble();
      //determining the amount of money deducted based on marriage.
      if(marriage.equalsIgnoreCase("Yes")){
         isHOH = "Yes";
         deductible = 18350;//amount for head of household
      }
      if (marriage.equalsIgnoreCase("No")){
         isHOH = "No";
         deductible = 12200;//amount for non head of household
      }
      //determining tax %
      if (income < 9275){
         tax = .10;
      }else if (income < 37650){
         tax = .15;
      }else if (income < 91150){
         tax = .25;
      }else if (income < 190150){
         tax = .28;
      }else if (income < 413350){
         tax = .33;
      }else if (income < 415050){
         tax = .35;
      }else{
         tax = .396;
      }
      //determining total tax owed
      taxOwed = (income - deductible)*tax;
      if (taxOwed < 0){
         taxOwed = 0;//used for if there is a negative number of money owed.
      }
      //printing out all the information
      System.out.println("Income: " + "$" + income);
      System.out.println("Head of Household: " + isHOH);
      System.out.println("Deductable: $" + deductible);
      System.out.println("Tax Rate: " + Math.round(tax*100) + "%");
      System.out.println("----------------");
      System.out.println("Tax Owed: " + "$" + taxOwed);
   }
}