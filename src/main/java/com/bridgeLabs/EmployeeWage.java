package com.bridgeLabs;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation");

        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int  EMP_RATE_PER_HR=20;
        int EMP_HR =0;
        int salary=0;


        double randomCheck = Math.floor(Math.random() * 10) % 2;
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
        salary = EMP_RATE_PER_HR * EMP_HR;
        System.out.println(salary);
    }
}
