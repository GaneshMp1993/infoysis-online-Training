package com.project.entity.samsung;

import com.project.samsungdao.SamsungDaoImpl;

public class Tester {
	public static void main(String[] args) {
		SamsungDaoImpl impl = new SamsungDaoImpl();
	impl.saveData();
//	impl.readSingleData();
//		impl.updateData();
//		impl.deleteData();
		impl.getAllSamsungDetails();
	}

}
