package com.bridgeLabs;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation");
        int IS_PRESENT = 1;
        int  EMP_RATE_PER_HR=20;
        int EMP_HR=8;
        int salary=0;


        double randomCheck = Math.floor(Math.random() * 10) % 2;
        if(randomCheck == IS_PRESENT) {
            System.out.println("salary is"+" "+EMP_RATE_PER_HR * EMP_HR);
        } else {
            salary = 0;
            System.out.println("Employee is absent" + " " + salary);
        }
    }
}
