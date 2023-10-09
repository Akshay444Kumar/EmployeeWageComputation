package com.bridgelabz.employeewagecomputation;

public class EmployeeWage {

    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int check = (int) Math.floor(Math.random() * 10 % 2);
        if (check == 1) {
            System.out.println("Employee is Present.");
            int dailyWage = FULL_DAY_HOURS * WAGE_PER_HOUR;
            System.out.println("Daily Wage of the Employee is: " +dailyWage);
        } else {
            System.out.println("Employee is Absent.");
            System.out.println("Daily Wage of the Employee is 0");
        }
    }
}
