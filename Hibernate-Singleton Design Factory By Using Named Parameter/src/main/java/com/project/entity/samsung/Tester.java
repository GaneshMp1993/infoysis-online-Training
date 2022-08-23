package com.project.entity.samsung;

import com.project.samsungdao.SamsungDaoImpl;

public class Tester {
	public static void main(String[] args) {
		SamsungDaoImpl impl = new SamsungDaoImpl();
	      Samsung samsung=new Samsung("z-flip", "Black", 100000.00, 8, true);
	      samsung.setId(2);
//	      impl.saveData(samsung);
//	      impl.getSamsungDetailsById(3);
//	      impl.getSamsungDetails();
//	      impl.updateSamsungDetialsById(1, "White");
//	      impl.updateSamsungDetails(samsung);
	      impl.deleteSamsungDetailsByID(6);
	}

}
