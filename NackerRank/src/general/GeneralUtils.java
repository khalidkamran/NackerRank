package general;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

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

	// public static final Set<Integer> set = new HashSet();
	// public static final Set<Integer> product = new HashSet();

	public static final SortedSet<Integer> set = new TreeSet<>();
	public static final SortedSet<Integer> product = new TreeSet();

	public static void permute(String value) {
		StringBuilder str = new StringBuilder(value);
		// char[] strArray = value.toCharArray();
		doPermute("", value);
		// doMagic(value);
		System.out.println(set);
	}

	public static void doPermute(String prefix, String value) {
		canAdd(prefix, value);
		int len = value.length();
		if (len != 0) {
			for (int i = 0; i < len; i++) {
				doPermute(prefix + value.charAt(i), value.substring(0, i) + value.substring(i + 1, len));
			}
		}
	}

	public static void doMagic(String value) {
		doSum(0);
		for (int i = 0; i < set.size(); i++) {
			int val = set.first();
			set.remove(val);
			// System.out.println("do Magic Val : " + val);
			doSum(++val);
		}
	}

	public static void doSum(int index) {
		int sum = 0;
		for (Integer val : set.tailSet(index)) {
			// System.out.println("do Sum Val : " + val);
			sum += val;
		}
		product.add(sum);
	}

	public static void canAdd(String prefix, String value) {
		int len = prefix.trim().length();
		int iVal = 0;
		if (len != 0) {
			iVal = Integer.parseInt(prefix);
			if (isPrime(iVal)) {
				set.add(iVal);
			}
		}
		len = 0;
		iVal = 0;
		len = value.trim().length();
		if (len != 0) {
			iVal = Integer.parseInt(value);
			if (isPrime(iVal)) {
				set.add(iVal);
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
