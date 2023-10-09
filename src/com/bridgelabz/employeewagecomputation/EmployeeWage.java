package com.bridgelabz.employeewagecomputation;

public class EmployeeWage {

    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        int WORK_DAYS_PER_MONTH = 20;
        int dailyWage = 0;

        for (int day = 1; day <= WORK_DAYS_PER_MONTH; day++) {
            int check = (int) Math.floor(Math.random() * 10 % 3);
            switch (check) {
                case 1:
                    dailyWage = dailyWage + FULL_DAY_HOURS * WAGE_PER_HOUR;
                    System.out.println("Employee is Present Full-time: " +dailyWage);
                    break;
                case 2:
                    dailyWage = dailyWage + PART_TIME_HOURS * WAGE_PER_HOUR;
                    System.out.println("Employee is Present Part-time: " +dailyWage);
                    break;
                default:
                    System.out.println("Employee is Absent.");
            }
        }
        System.out.println("The total Monthly Wage of the Employee is: " +dailyWage);
    }
}
