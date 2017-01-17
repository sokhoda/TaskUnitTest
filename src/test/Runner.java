package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("1", "2",
				"3"));
		System.out.println(list.get(1));
		list.add("d");
		System.out.println(list);
	}
}
