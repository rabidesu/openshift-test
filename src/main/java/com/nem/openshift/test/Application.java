package com.nem.openshift.test;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        for (int i =0; i < 1000; i++) {
            System.out.println("Working.... " + i + "iterations");
            Thread.sleep(5000);
        }

        System.out.println("Stop working");
    }

}
