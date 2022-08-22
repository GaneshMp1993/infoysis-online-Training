package com.project.checkedexceptiondemo1;

public class Watsapp {
	public void createGroup(String[] names) throws watsappException {
		if (names.length > 5) {
			throw new watsappException("Cant create group more than 5 members");
		} else {
			System.out.println("Group is created sucessfully,,,,,,,,,,,,,");
		}
	}

	public void shareFiles(File file) throws watsappException {
		if (file.size > 1000) {
			throw new watsappException("File cannot upload due to exceeeding of memory,,,,,,,,,");
		} else {
			System.out.println("File is uploaded sucessfully,,,,,,,,,,,");
		}
	}

}
