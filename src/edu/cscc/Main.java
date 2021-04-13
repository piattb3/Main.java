/**
 * @author Benjamin Piatt
 * @date 04/13/2021
 * @description Program which compares and sorts data values to validate the information and sort using comparators.
 */
package edu.cscc;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student[] students = TestData.createStudents();
        Arrays.sort(students,new Comparator<Student>() {
            /**
             *
             * @param s1 = student last name
             * @param s2 = separate variable, student last name
             * @return = Int Validation of student last name + sorting
             */
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                return lastname1.compareTo(lastname2);
            }
        });
        printStudentList("Students Sorted By LastName",students);


        Arrays.sort(students, new Comparator<Student>() {
            /**
             * Comparator
             * @param s1 = student major
             * @param s2 = separate variable, student major
             * @return = String Validation of sorting by major + Sorting
             */
            public int compare(Student s1, Student s2) {
                String major1 = s1.getMajor();
                String major2 = s2.getMajor();
                return major1.compareTo(major2);
            }
        });
        printStudentList("Students Sorted By Major",students);


        Arrays.sort(students, new Comparator<Student>() {
            /**
             * Comparator
             * @param s1 = student zip code
             * @param s2 = separate variable, student zip code
             * @return = Int Validation + sorting of student zip
             */
            public int compare(Student s1, Student s2) {
                int z1 = s1.getZipcode();
                int z2 = s2.getZipcode();
                return z1 - z2;
            }
        });
        printStudentList("Students Sorted By Zip Code",students);


        Arrays.sort(students, new Comparator<Student>() {
            /**
             * Comparator
             * @param s1 = student GPA
             * @param s2 = separate variable, student GPA
             * @return = Double Validation + Sorting of student gpa
             */
            public int compare(Student s1, Student s2) {
                double gpa1 = s1.getGpa();
                double gpa2 = s2.getGpa();
                return Double.compare(gpa2, gpa1);
            }
        });
        printStudentList("Students Sorted By GPA",students);
    }

    public static void printStudentList(String title,Student[] list) {
        final String format = "%-12s %-12s %-18s %-12s %-12s\n";
        System.out.println(title);
        System.out.printf(format,"First Name","Last Name","Major","Zip Code","GPA");
        for (Student s : list) {
            System.out.printf(format,s.getFirstName(),s.getLastName(),s.getMajor(),s.getZipcode(),s.getGpa());
        }
        System.out.println("==============================================================\n");
    }
}
