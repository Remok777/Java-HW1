package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    Reader inputStreamReader = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(inputStreamReader);

	    String r, name, address, c1, c2, c3, t1, t2, t3;
	    final double PI = 3.14;
	    double P, R, country1, country2, country3, c1_sum, c2_sum, c3_sum, total_sum;
	    int time1, time2, time3;

	    System.out.print("1) Enter the radius value: ");
	    r = br.readLine();
	    R = Double.parseDouble(r);
	    P = 2.0*PI*R;
	    System.out.println("Perimeter of the circle = " + P);
	    System.out.print("2)Enter your name: ");
	    name = br.readLine();
	    System.out.println("Where are you live, " + name +"?");
	    address = br.readLine();
	    System.out.println("Name: " + name);
	    System.out.println("Address: " + address);

	    System.out.print("3) Standart units per minute for 1st country: ");
	    c1 = br.readLine();
	    country1 = Double.parseDouble(c1);
	    System.out.println("Duration of talk: ");
	    t1 = br.readLine();
	    time1 = Integer.parseInt(t1);
		System.out.print("Standart units per minute for 2nd country: ");
		c2 = br.readLine();
		country2 = Double.parseDouble(c2);
		System.out.println("Duration of talk: ");
		t2 = br.readLine();
		time2 = Integer.parseInt(t2);
		System.out.print("Standart units per minute for 3rd country: ");
		c3 = br.readLine();
		country3 = Double.parseDouble(c3);
		System.out.println("Duration of talk: ");
		t3 = br.readLine();
		time3 = Integer.parseInt(t3);

		c1_sum = country1*time1;
		c2_sum = country2*time2;
		c3_sum = country3*time3;
		total_sum = c1_sum + c2_sum + c3_sum;

		System.out.println("The sum of 3 calls: " + c1_sum + "$ | " + c2_sum + "$ | " + c3_sum + "$ |");
		System.out.println("Total sum of all calls" + total_sum);
    }
}
