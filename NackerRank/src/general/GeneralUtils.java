package general;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class GeneralUtils {
	
	public static BufferedWriter getFileWriter(String fileName) throws Exception{
		BufferedWriter file = new BufferedWriter(new FileWriter(new File(fileName)));
		return file;
	}

	public static BufferedReader getFileReader(String fileName) throws Exception{
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
}
