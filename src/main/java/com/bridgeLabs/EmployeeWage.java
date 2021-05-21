package com.bridgeLabs;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation");

        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int  EMP_RATE_PER_HR=20;
        int WORKING_HOURS=20;
        int MAX_HOURS_IN_MONTH=100;
        int TOTAL_EMP_HOURS=0;
        int TOTAL_WORKING_DAYS=0;
        int EMP_HR =0;


        while (TOTAL_EMP_HOURS < MAX_HOURS_IN_MONTH && TOTAL_WORKING_DAYS < WORKING_HOURS) {
            TOTAL_WORKING_DAYS++;
            double randomCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) randomCheck) {
                case 1:
                    EMP_HR = 4;
                    break;
                case 2:
                    EMP_HR = 8;
                    break;
                case 3:
                    EMP_HR = 0;

            }
            TOTAL_EMP_HOURS += EMP_HR;
        }
        int monthlySalary = EMP_RATE_PER_HR * TOTAL_EMP_HOURS;
        System.out.println(monthlySalary);
    }
}
