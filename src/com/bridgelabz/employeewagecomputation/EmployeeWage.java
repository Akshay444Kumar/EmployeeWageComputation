package com.bridgelabz.employeewagecomputation;

public class EmployeeWage {

    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        int MAX_WORK_HOURS = 100;
        int MAX_WORK_DAYS = 20;
        int totalWorkHours = 0;
        int totalWorkDays = 0;
        int totalDailyWage = 0;

        while (totalWorkHours <= MAX_WORK_HOURS && totalWorkDays < MAX_WORK_DAYS) {
            totalWorkDays++;
            int check = (int) Math.floor(Math.random() * 10 % 3);
            switch (check) {
                case 1:
                    totalWorkHours = totalWorkHours + FULL_DAY_HOURS;
                    totalDailyWage = totalDailyWage + FULL_DAY_HOURS * WAGE_PER_HOUR;
                    System.out.println("Employee is Present Full-time: " +totalDailyWage);
                    break;
                case 2:
                    totalWorkHours = totalWorkHours + PART_TIME_HOURS;
                    totalDailyWage = totalDailyWage + PART_TIME_HOURS * WAGE_PER_HOUR;
                    System.out.println("Employee is Present Part-time: " +totalDailyWage);
                    break;
                default:
                    System.out.println("Employee is Absent: " +totalDailyWage);
            }
            System.out.println("Working Days: " +totalWorkDays + " Total Work Hours: " +totalWorkHours);
        }
        System.out.println("The total Monthly Wage of the Employee is: " +totalDailyWage);
    }
}
