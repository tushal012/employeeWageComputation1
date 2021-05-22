package com.bridgeLabs;

public class EmployeeWage {
    public static int empHrs=0;
    public static void calculateEmployeeWageForCompany(String company,int empRate,int numOfDays,int maxHrs)
    {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalWage=0;
        while (totalEmpHrs < maxHrs && totalWorkingDays < numOfDays) {
            totalWorkingDays++;
            double randomCheck = Math.floor(Math.random() * 10) % 3;
            empHrs=getWorkingHours((int) randomCheck);
            //totalEmpHrs += empHrs;
            int monthlySalary = empRate * empHrs;
            totalWage+=monthlySalary;
            System.out.println(monthlySalary);
        }
        System.out.println("Total Employee wage For Company"+" "+company+" "+totalWage);;
    }
    public static int getWorkingHours(int randomCheck)
    {
        switch (randomCheck) {
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
        System.out.println("Welcome to Employee Wage Computation");
        calculateEmployeeWageForCompany("Wipro",20,
                2,10);
        calculateEmployeeWageForCompany("TCS",10,4,2);
        }

}

