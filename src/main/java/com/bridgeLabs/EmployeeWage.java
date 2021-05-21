package com.bridgeLabs;

public class EmployeeWage {
    public static final int ispartTime = 1;
    public static final int isfullTime = 2;
    public static final int empWagePerHr = 20;
    public static final int workingDays = 20;
    public static final int maxHrsInMonth = 50;
    public static int empHrs=0;
    public static void calculateEmployeeWage()
    {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalWage=0;
        while (totalEmpHrs < maxHrsInMonth && totalWorkingDays < workingDays) {
            totalWorkingDays++;
            int randomValue = (int) (Math.random() * 3 + 1);
            empHrs=getWorkingHours(randomValue);
            totalEmpHrs += empHrs;
            int monthlySalary = empWagePerHr * totalEmpHrs;
            totalWage+=monthlySalary;
            System.out.println(monthlySalary);
        }
        System.out.println("Total wage is"+totalWage);
    }
    public static int getWorkingHours(int randomValue)
    {
        switch (randomValue) {
            case 1:
                empHrs = 4;
                break;
            case 2:
                empHrs = 8;
                break;
            case 3:
                empHrs = 0;
        }
        return empHrs;
    }
    public static void main(String args[]){
        System.out.println("Welcome to Employee wage computation");
        calculateEmployeeWage();
        }

}

