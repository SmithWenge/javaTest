package wenge.changeTest;

import java.util.ArrayList;
import java.util.List;

public class ChangeTets {
	
	public static void change(String[] args) {
		args[0] = "222";
	}
	
	public static void change(List<String> list) {
		list.add("wenge");
	}
	
	public static void change(String str) {
		str = str + str;
	} 
	
	public static void main(String[] args) {
		
		String[] a = {"111","222"};
		change(a);
		for(String b : a) {
			System.out.println(b);
		}
		
		List<String> list = new ArrayList<String>();
		change(list);
		
		for(String b : list) {
			System.out.println(b);
		}
		
		String str = "wenge";
		change(str);
		System.out.println(str);
	}
}
