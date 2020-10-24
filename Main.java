package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int A, B, C, x, y;
        String a, b, c;
        x = 30;
        y = 15;

        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);

        System.out.print("Please enter A side in cm: ");
        a = br.readLine();
        System.out.print("Please enter B side in cm: ");
        b = br.readLine();
        System.out.print("Please enter C side in cm: ");
        c = br.readLine();

        A = Integer.parseInt(a);
        B = Integer.parseInt(a);
        C = Integer.parseInt(a);

        if ( (A <= x && B <= y) || (A <= x && C <= y) || (B <= x && A <= y)
            || (B <= x && C <= y) || ( C <= x && A <= y) || (C <= x && B <= y)) {
            System.out.println("Brick is in!");
        }


    }
}
