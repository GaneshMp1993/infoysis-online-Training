package com.project.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CodeTest {
	public static void main(String[] args) {
		Map<Code, String> lecture = new TreeMap<Code, String>();
		lecture.put(new Code("S01", "L03"), "Datatypes");
		lecture.put(new Code("S03", "L05"), "Variables");
		lecture.put(new Code("S07", "L04"), "Oops");
		lecture.put(new Code("S09", "L01"), "String");
		lecture.put(new Code("S10", "L07"), "Arrays");
		lecture.put(new Code("S05", "L02"), "Exception Handling");
		lecture.put(new Code("S11", "L10"), "Collections");
		lecture.put(new Code("S04", "L08"), "Lambda expresiions");
		lecture.put(new Code("S01", "L03"), "Constructors");
//		lecture.put(new Code(null, null), "Wrapper class");
//		lecture.put(new Code(null, null), "Naming Convension");
		

		for (Map.Entry<Code, String> entry : lecture.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
