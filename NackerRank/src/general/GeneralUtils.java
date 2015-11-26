package general;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GeneralUtils {

	public static BufferedWriter getFileWriter(String fileName) throws Exception {
		BufferedWriter file = new BufferedWriter(new FileWriter(new File(fileName)));
		return file;
	}

	public static BufferedReader getFileReader(String fileName) throws Exception {
		BufferedReader file = new BufferedReader(new FileReader(new File(fileName)));
		return file;
	}

	public static void input() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String str = in.next();
		String str1 = in.nextLine();
		System.out.println(str + str1 + a);
		in.close();
	}

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		// in.useDelimiter("\\n");
		int a = 0;
		String str = "";

		System.out.print("Enter Number : ");
		a = Integer.parseInt(in.next().trim());
		System.out.print("Enter Name : ");
		str = in.next();
		permute(str);
		// System.out.println("Number : " + a);
		// System.out.println("Name : " + str);
		in.close();
	}

	public static final Set<String> set = new HashSet();

	public static void permute(String value) {
		StringBuilder str = new StringBuilder(value);
		// set.add(value);
		// char[] strArray = value.toCharArray();
		doPermute("", value);
		System.out.println(set);
	}

	public static void doPermute(String prefix, String value) {
		int len = value.length();
		if (len == 0) {
			set.add(prefix);
		} else {
			for (int i = 0; i < len; i++) {
				doPermute(prefix + value.charAt(i), value.substring(0, i) + value.substring(i + 1, len));
			}
		}
	}

	public static boolean isPrime(int val) {
		if (val <= 1)
			return false;
		if (val == 2 || val == 3)
			return true;

		for (int i = 2; i < val; i++) {
			if (val % i == 0)
				return false;
		}
		return true;
	}
}
