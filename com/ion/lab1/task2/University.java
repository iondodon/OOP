package com.ion.lab1.task2;

import java.util.Scanner;

public class University {
    private String name;
    private int num_students;
    private int foundationYear;
    private Student[] students;

    University(String name, int foundation_year, int num_students){
        this.name = name;
        this.foundationYear = foundation_year;
        this.num_students = num_students;
        this.students = new Student[num_students];
        setStudents(num_students);
    }

    public float getStudentsAverage(){
        float sum = 0;

        for(int i = 0; i < this.num_students; i++){
            sum += students[i].getMark();
        }

        return sum / (float) this.num_students;
    }

    private void setStudents(int num_students){
        for(int i = 0; i < num_students; i++){
            String student_name = "";
            int student_age = 0;
            float student_mark = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println(this.name + ": Insert student " + Integer.toString(i) +" name:");
            student_name = scanner.next();
            System.out.println(this.name + ": Insert student " + Integer.toString(i) + " age:");
            student_age = scanner.nextInt();
            System.out.println(this.name + ": Insert student " + Integer.toString(i) + " mark:");
            student_mark = scanner.nextFloat();
            System.out.println();

            students[i] = new Student(student_name, student_age, student_mark);
        }
    }

}
