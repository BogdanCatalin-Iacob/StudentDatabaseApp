package com.bogdan.iacob;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int ID = 1000;

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.println("1 - year 10\n 2 - year 11\n 3 - year 12\n 4 - year 13\nEnter student class level: ");
        this.year = sc.nextInt();

        setStudentID();

//        System.out.println(firstName + " " + lastName + " " + year + " " + studentID);

    }

    private void setStudentID(){
        ID++;
        studentID = year + "" + ID;
    }

    public void enroll(){

        do {
            System.out.print("Enter a course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        }while(1 != 0);
        System.out.println("Enrolled in: " + courses);
    }

    public void viewBalance(){
        System.out.println("Balance is: £" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter our amount: ");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: £" +payment);
        viewBalance();
    }

    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\n Grade Year: " + year +
                "\n Student ID: " + studentID +
                "\n Courses Enrolled: " + courses +
                "\n Balance: £" + tuitionBalance;
    }

}
