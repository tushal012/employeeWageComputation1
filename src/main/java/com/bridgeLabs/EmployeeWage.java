package com.bridgeLabs;

import java.util.Scanner;

public class EmployeeWage {

    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation");
        CompanyEmpWage[] companyEmpWage = new CompanyEmpWage[10];
        for (int index = 0; index < companyEmpWage.length; index++) {
            System.out.println("Please enter the" + index + "st company deatils");
            System.out.println("enter the company name");
            String companyName = scanner.nextLine();
            System.out.println("enter the rate per hour");
            int empRate = scanner.nextInt();
            System.out.println("enter the number of days");
            int numOfDays = scanner.nextInt();
            System.out.println("enter the maximum working hrs in a month");
            int maxHrs = scanner.nextInt();
            scanner.nextLine();
            companyEmpWage[index] = new CompanyEmpWage(companyName, empRate, numOfDays, maxHrs);
        }
        for (CompanyEmpWage companyEmpWage1 : companyEmpWage) {
            companyEmpWage1.calculateEmpWageCompany();
        }
    }

}

