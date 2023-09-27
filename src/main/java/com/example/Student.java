package com.example;

public class Student {
    private int score;

    public Student(int score) {
        // TODO: Initialize the score
        this.score = score;
    }

    public String grade() {
        // TODO: Calculate and return the grade based on the score. 
        // Use the following grading scale:
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score < 90) {
            return "B";
        } else if (score >= 70 && score < 80) {
            return "C";
        } else if (score >= 60 && score < 70) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public boolean isPassing() {
        // Return true if the score is 60 or above, otherwise return false
        return score >= 60;
    }
}
