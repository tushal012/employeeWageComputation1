package com.bridgeLabs;

public class CompanyEmpWage {
    private final String companyName;
    private final int empRate;
    private final int numOfDays;
    private final int maxHrs;

    public CompanyEmpWage(String companyName, int empRate, int numOfDays, int maxHrs) {
        this.companyName = companyName;
        this.empRate = empRate;
        this.numOfDays = numOfDays;
        this.maxHrs = maxHrs;
    }
    public static int getWorkingHours(int randomValue) {

        int empHrs;
        switch (randomValue) {
            case 1:
                empHrs = 4;
                break;
            case 2:
                empHrs = 8;
                break;
            case 3:
                empHrs = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + randomValue);
        }
        return empHrs;
    }

    public void calculateEmpWageCompany() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;
        while (totalEmpHrs < maxHrs && totalWorkingDays < numOfDays) {
            totalWorkingDays++;
            double randomCheck = Math.floor(Math.random() * 10) % 3;
            int empHrs = getWorkingHours((int) randomCheck);
            int monthlySalary = empRate * empHrs;
            totalWage += monthlySalary;

        }
        System.out.println("Total Employee wage For Company" + " " + companyName + " " + totalWage);

    }
}
