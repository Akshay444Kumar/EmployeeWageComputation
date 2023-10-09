package com.bridgelabz.employeewagecomputation;

public class EmployeeWage {

    final int IS_FULL_TIME = 1;
    final int IS_PART_TIME = 2;
    final int WAGE_PER_HOUR = 20;
    final int FULL_DAY_HOURS = 8;
    final int PART_TIME_HOURS = 4;
    final int MAX_WORK_HOURS = 100;
    final int MAX_WORK_DAYS = 20;

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.calculateEmployeeWage();
    }

    void calculateEmployeeWage() {
        int totalWorkHours = 0;
        int totalWorkDays = 0;
        int totalDailyWage = 0;
        while (totalWorkHours <= MAX_WORK_HOURS && totalWorkDays < MAX_WORK_DAYS) {
            totalWorkDays++;
            int check = (int) Math.floor(Math.random() * 10 % 3);
            switch (check) {
                case IS_FULL_TIME:
                    totalWorkHours = totalWorkHours + FULL_DAY_HOURS;
                    totalDailyWage = totalDailyWage + FULL_DAY_HOURS * WAGE_PER_HOUR;
                    System.out.println("Employee is Present Full-time: " +totalDailyWage);
                    break;
                case IS_PART_TIME:
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
