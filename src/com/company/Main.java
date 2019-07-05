package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Open Lockers:");
        boolean[] lockers = new boolean[100];

        for (int i = 0; i < lockers.length; i++) {
            lockers[i] = false;
            for (int j = 1; j <= lockers.length; j++) {
                if ((i + 1) % j == 0) {
                    lockers[i] = !lockers[i];
                }
            }
            if (lockers[i]) {
                System.out.println("Locker " + (i + 1));
            }
        }
    }
}
