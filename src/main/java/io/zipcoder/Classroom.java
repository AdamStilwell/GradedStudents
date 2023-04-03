package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Classroom {
    Student[] students;
    ArrayList<Student> studentsArrayList = new ArrayList<>();

    public Classroom(int maxNumberOfStudents) {

    }

    public Classroom(Student[] studentsInClass) {

    }

    public Classroom() {
        students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double avg = 0.0;
        int sum = 0;
        for (Student student : getStudents()) {
            avg = student.getAverageExamScore();
            sum++;
        }
        return avg / sum;
    }

    public void addStudent(Student student) {
        studentsArrayList.add(student);
        students = studentsArrayList.toArray(new Student[0]);
    }

    public void removeStudent(String firstName, String lastName) {
        for (Student s: studentsArrayList) {
            if(s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)){
                studentsArrayList.remove(s);
            }
        }
    }

    public ArrayList<Student> getStudentsByScore(){
        
        return studentsArrayList;
    }
}
