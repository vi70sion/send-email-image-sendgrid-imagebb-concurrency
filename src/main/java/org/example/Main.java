package org.example;

public class Main {
    public static void main(String[] args) {

        TaskProcessor taskProcessorEmail = new TaskProcessor("email");
        Thread emailThread1 = new Thread(taskProcessorEmail);
        Thread emailThread2 = new Thread(taskProcessorEmail);

        TaskProcessor taskProcessorImage = new TaskProcessor("image");
        Thread imageThread1 = new Thread(taskProcessorImage);
        Thread imageThread2 = new Thread(taskProcessorImage);

        emailThread1.start();
        emailThread2.start();
        imageThread1.start();
        imageThread2.start();

    }
}