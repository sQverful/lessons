package com.dorosh.lessons.error;

public class ExerciseNotCompletedException extends RuntimeException {
    public ExerciseNotCompletedException() {
        super("Implement this method and remove exception OR switch to branch completed if you got stuck.");
    }
}
