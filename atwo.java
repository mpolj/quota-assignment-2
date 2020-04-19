/*
• Maximilian Philip Oljanenko
• Program: Assingment 2
• Objective: This pogram will read in values from a user and calculate certain statistics and display them back to the user. 
• This program uses: While loops, if-statements, if-else statements, nested if statements
*/

import java.util.Scanner;

public class atwo{
    public static void main(String[]args){
        
        // Basic Program introduction
        System.out.println("Maximilian P. Oljanenko");
        System.out.println("Program | Homework #2 | Introduction to Java Spring 2019");
        System.out.println();

        //Initiate Variables
        double salesPct;
        int id, count=0, didBuy, didntBuy, quota, totalCustomers, quotaStanding, bonus;

        //Declare the scanner to accept user input
        Scanner input=new Scanner(System.in);

        //Give the user a way to end the program and display the final count
        System.out.println("Enter ID. -1 to end:");
        
        //Read in the ID for the Rep
        id=input.nextInt();


        while (id!=-1){
            //Read in the information entered by the user
            System.out.println("Please Enter: Customers Who Bought, Customers Who Didnt Buy, The Assigned Quota.");
            didBuy=input.nextInt();
            didntBuy=input.nextInt();
            quota=input.nextInt();

            // Print the information entered by the user
            System.out.println("Rep ID Number: " + id);
            System.out.println("Customers Bought: " + didBuy +  " | " + "Customer Didnt Buy: " + didntBuy );
            System.out.println("The Assigned Quota Is: " + quota);

            //Compute and print the total number of customers
            totalCustomers=didBuy + didntBuy;
            System.out.println("Total Customers: " + totalCustomers);

            // Calculate how the rep is doing on ther quota and provide a message accordingly
            quotaStanding= quota - didBuy;
            if(quota == 0){
                System.out.println("Quota Standing: " + "You Do Not Have a Quota.");
            }
            else
            if(didBuy > quota){
                System.out.println("Quota Standing: " + "You Surpassed Your Quota. Great Work!");
            }
            
            if(didBuy < quota){
                System.out.println("Quota Standing: " + quotaStanding + " " + "Below - You Have Not Met Your Quota. Lets Get Those Numbers Up!");
            }

            if(didBuy == quota){
                System.out.println("Quota Standing: " + "You Have Matched Your Quota Exactly.");
            }

            // Calculate the bonus and provide the proper message regarding the bonus
            bonus= (didBuy * 2) - didntBuy;
            if(bonus >= 1){
                System.out.println("Bonus: " + bonus);
            }
            else{
                System.out.println("There is No Bonus!");
            }

            if(didBuy > didntBuy){
                System.out.println("More of Your Customers Bought");
            }

            if(didBuy < didntBuy){
                System.out.println("More of Your Customers Did Not Buy");
            }

            if(didBuy == didntBuy){
                System.out.println("The Same Ammount of Customers Bought and Didnt Buy");
            }

            // Calculate the sales Pct. and print it with 3 decimal points
            salesPct = ((double) didBuy/totalCustomers);
            System.out.print("Sales Percentage: ");
            System.out.printf("%.3f\n", salesPct);

            System.out.println();
            System.out.println();
            System.out.println();

            //Enter next ID
            System.out.println("Enter ID. -1 to end:");
            id=input.nextInt();
            //count this employee
            count++;
        }
        
        System.out.println(count+" Employees Processed");

        // Close the input buffer
        input.close();
    }
} 