package com.project.checkedexceptiondemo1;

public class Ganesh {
	public static void main(String[] args) {
		Watsapp watsapp = new Watsapp();
		File file = new File();
		String[] names = { "Sampath", "Jaysurya", "SaiRupesh", "varaprasad", "Guru", };
		try {
			watsapp.createGroup(names);
			watsapp.shareFiles(file);
		} catch (watsappException e) {

			System.out.println(e.getMessage());

		}
	}

}
