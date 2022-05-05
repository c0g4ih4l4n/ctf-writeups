package com.naham;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File db = new File("C:\\Users\\te\\IdeaProjects\\DecryptNahamcon\\src\\com\\naham\\db.encrypted");
        String pin = "";
        int num = 0;
        File file2 = new File("output" + Integer.toString(num) + ".db");

        for (int i =1000; i < 10000; i++) {
            pin = String.format("%04d", i);

            String pinInput = pin + pin + pin + pin;

            System.out.println("Testing PIN: " + pin);

            if (Decrypt.action(pinInput, db, file2)) {
                num += 1;
                file2 = new File("output" + Integer.toString(num) + ".db");
                System.out.println("Found pin: " + pin);
            }
        }

    }
}
