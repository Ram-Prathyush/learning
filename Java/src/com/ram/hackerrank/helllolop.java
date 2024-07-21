package com.ram.hackerrank;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class helllolop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.next();
		int no = scan.nextInt();
		TreeSet<String> treeSet = new TreeSet<String>();

		for (int i = 0; i < input.length() - no; i++) {
			treeSet.add(input.substring(i, i + no));
		}

		System.out.println(treeSet.first() + " - " + treeSet.last());

	}

}
