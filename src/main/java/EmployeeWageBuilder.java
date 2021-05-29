import com.bridgeLabs.CompanyEmpWage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeWageBuilder {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation");
        ArrayList<CompanyEmpWage> al = new ArrayList<CompanyEmpWage>();
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
        Iterator<CompanyEmpWage> itr = al.iterator();
        while (itr.hasNext()) {
            itr.next().calculateEmpWageCompany();
        }
    }
}
