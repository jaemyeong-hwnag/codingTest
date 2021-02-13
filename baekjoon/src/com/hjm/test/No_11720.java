package com.hjm.test;

import java.util.*;

public class No_11720 {

	public static void main(String[] args) {
        String num1;
        String num2;
		int sum = 0; // гу╟Х
        
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextLine();
		num2 = sc.nextLine();
		
		num2 = num2.replace("0", "");
		for (int i = 0; i < num2.length(); i++) {
			sum = sum + Integer.parseInt(num2.substring(i, i+1));
		}

		System.out.println(sum);
	}

}
