package wenge.IO;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		File file = new File("d:/text.txt");
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
