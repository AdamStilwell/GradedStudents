package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void getExamsTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double[] output = student.getExamScores();

        // Then
        Assert.assertEquals(examScores, output);
    }

    @Test
    public void addExamScoresTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        Double input = 100.0;
        Double output = student.getExamScores()[0];

        // Then
        Assert.assertEquals(input, output);
    }

    @Test
    public void getAverageExamScore(){
        //Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output = student.getAverageExamScore();
        Double expected = 125.0;

        // Then
        Assert.assertEquals(expected, output);
    }
}