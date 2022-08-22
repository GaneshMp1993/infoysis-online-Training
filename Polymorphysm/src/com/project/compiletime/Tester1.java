package com.project.compiletime;

public class Tester1 {
	public static void main(String[] args) {
		FaceBook fb=new FaceBook();
		fb.searchUser(123);
		fb.searchUser(543435432532l);
		fb.searchUser("Steve");
		fb.searchUser("Steve", "Jobs");
		fb.searchUser("Bangalore", 577589);
	}

}
