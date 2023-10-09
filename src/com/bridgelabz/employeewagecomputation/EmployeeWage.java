package com.bridgelabz.employeewagecomputation;

public class EmployeeWage {

    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        int dailyWage = 0;
        int check = (int) Math.floor(Math.random() * 10 % 3);
//        if (check == 1) {
//            System.out.println("Employee is Present.");
//            dailyWage = FULL_DAY_HOURS * WAGE_PER_HOUR;
//        } else if (check == 2) {
//            System.out.println("Employee is Part-time.");
//            dailyWage = PART_TIME_HOURS * WAGE_PER_HOUR;
//        } else {
//            System.out.println("Employee is Absent.");
//        }
        // Using Switch Case
        switch (check) {
            case 1:
                System.out.println("Employee is Full-time.");
                dailyWage = FULL_DAY_HOURS * WAGE_PER_HOUR;
                break;
            case 2:
                System.out.println("Employee is Part-time.");
                dailyWage = PART_TIME_HOURS * WAGE_PER_HOUR;
                break;
            default:
                System.out.println("Employee is Absent.");
        }
        System.out.println("The total Wage of the Employee is: " +dailyWage);
    }
}
