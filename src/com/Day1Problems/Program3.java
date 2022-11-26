package com.Day1Problems;

public class Program3 {
	public static void main(String[] args) {
		String a1 = "ATUL";
		String a2 = "atul";

		System.out.println(a1.equals(a2));// false
		System.out.println(a2.equalsIgnoreCase(a1));// true

	}
}
