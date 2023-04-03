package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, Double[] testScores) {
        setFirstName(firstName);
        setLastName(lastName);
        examScores.addAll(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getExamScores() {
        return examScores.toArray(new Double[0]);
    }

    public ArrayList<Double> addExamScore(Double exam){
        this.examScores.add(exam);
        return examScores;
    }

    public void setExamScore(int examNumber, double newScore){
        Double[] tempExamScores = examScores.toArray(new Double[0]);
        tempExamScores[examNumber] = newScore;
        examScores.clear();
        examScores.addAll(Arrays.asList(tempExamScores));
    }

    public Double getAverageExamScore(){
        Double avg = 0.0;
        int sum = 0;
        for (Double num: examScores){
            avg+= num;
            sum++;
        }
        return avg/(int) sum;
    }

    @Override
    public String toString() {
        return "```\nStudent Name: " +
                firstName + " " + lastName + "\n" +
                "Exam Scores:" + getExamScores().toString() +
                "\n```";
    }
}
