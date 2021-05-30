import com.bridgeLabs.CompanyEmpWage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeWageBuilder { public static ArrayList<CompanyEmpWage> al = new ArrayList<CompanyEmpWage>();

    public static void getTotalWageForCompany(String companyname) {

        for (CompanyEmpWage var:al)
        {

            if (var.calculateEmployeeWageForCompany().contains(companyname)) {
                System.out.println(var.calculateEmployeeWageForCompany());
                break;
            }
        }

    }
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation");
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the number of company");
        int number = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < number; index++) {
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
            al.add(new CompanyEmpWage(companyName, empRate, numOfDays, maxHrs));

        }
        System.out.println("enter the company ti be queried");
        String companyName1 = scanner.nextLine();
        getTotalWageForCompany(companyName1);
    }

    }


