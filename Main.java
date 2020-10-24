package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

	    char[] n = {'3', '4', '5'};
	    char[] n_square = {'1', '1', '9', '0', '2', '5'};
        boolean statement = true;

        for (char x : n_square) {
            if ('3' == x){
                statement = true;
            }
            else { statement = false; }
        }

        if (statement){
            System.out.println("Yes, 3 is in n square number");
        }
        else {System.out.println("No, 3 isn`t in n square number");}

        char x = n[0];
        n[0] = n[2];
        n[2] = x;
        for (char y:n) {
            System.out.print(y);
        }
        char[] g = {1, n[0], n[1], n[2], 1};
    }
}
