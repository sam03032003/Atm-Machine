package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Project1_ATM_MACHINE {
   

    public static void main(String[] args) {

        // Account no is already declared as acc1
        int acc1 = 123456;
        // Password is also declared as pass1
        int pass1 = 2003;
        // Initial balance of acc1 or account
        int balance = 10000;
        Scanner sc = new Scanner(System.in);

        try {
            for (int n = 1; n > 0; n++) {
                System.out.println("Enter Account nos.");
                int acc = sc.nextInt();
                System.out.println("Entered Account number : " + acc);

                System.out.println("Enter Password");
                int pass = sc.nextInt();
                System.out.println("Entered Password : " + pass);


                if (acc1 == acc) {
                    if (pass == pass1) {
                        System.out.println("Account Found");
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("Select type :-");
                        System.out.println("For Saving A/c press 1");
                        System.out.println("For Current A/c press 2");

                        int type1 = sc.nextInt();
                        if (type1 == 1) {
                            System.out.println("Welcome to your Saving Account");
                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^############################^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            System.out.println();
                            System.out.println("Select operations you have to perform :");
                            System.out.println("For Balance Inquiry press 3");
                            System.out.println("For Deposit Cash press 4");
                            System.out.println("For Withdrawl Cash press 5");
                            int entered_op = sc.nextInt();

                            if (entered_op == 3) {
                                System.out.println("Current balance in your Saving A/c is  " + balance);
                            } else if (entered_op == 4) {
                                System.out.println("Enter Deposit amount :");
                                int deposit_amu = sc.nextInt();
                                int update_bal = balance + deposit_amu;
                                System.out.println("Your balance is :" + update_bal);
                            } else if (entered_op == 5) {
                                System.out.println("Enter Withdrawl amount :");
                                int withdrawl_amu = sc.nextInt();
                                int update_with = balance - withdrawl_amu;
                                if (update_with >= 0) {
                                    System.out.println("Balance is :" + update_with);
                                } else {
                                    System.out.println("Balance is not negative");
                                }
                            } else {
                                System.out.println("Select Valid Operation");
                            }
                        } else if (type1 == 2) {
                            System.out.println("Welcome to your Current Account");
                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^############################^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            System.out.println();

                            // Operations are not mentioned for current account
                            System.out.println("OPERATIONS ARE NOT MENTIONED FOR CURRENT ACCOUNT MODIFIED IN FUTURE");

                        } else {
                            System.out.println("Invalid type");
                        }


                    } else {
                        System.out.println("Invalid Password");
                    }
                }
                System.out.println("Want to continue press any number but if not then press 0");
                int num = sc.nextInt();
                if (num == 0) {
                    break;
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Enter valid number");
        }








    }
}
