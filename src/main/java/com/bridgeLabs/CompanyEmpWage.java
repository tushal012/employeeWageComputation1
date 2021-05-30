package com.bridgeLabs;

public class CompanyEmpWage {
    public static int empHrs = 0;
    //Instance variables
    public final String companyName;
    public final int empRate;
    public final int numOfDays;
    public final int maxHrs;

    public CompanyEmpWage(String companyName, int empRate, int numOfDays, int maxHrs) {
        this.companyName = companyName;
        this.empRate = empRate;
        this.numOfDays = numOfDays;
        this.maxHrs = maxHrs;
    }


    public static int getWorkingHours(int randomValue) {

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

    public  String calculateEmployeeWageForCompany() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;
        while (totalEmpHrs < maxHrs && totalWorkingDays < numOfDays) {
            totalWorkingDays++;
            double randomCheck = Math.floor(Math.random() * 10) % 3;
            empHrs = getWorkingHours((int) randomCheck);
            int monthlySalary = empRate * empHrs;
            totalWage += monthlySalary;

        }
        return "Total Employee wage For Company" + " " + companyName + " " + totalWage;
    }

}
