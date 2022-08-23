package com.project.samsungdao;

import java.util.List;

import com.project.entity.samsung.Samsung;

public interface SamsungDao {
	void saveData(Samsung samsung);

	void getSamsungDetailsById(int id);

	List<Samsung> getSamsungDetails();

	void updateSamsungDetialsById(int id, String color);

	void updateSamsungDetails(Samsung samsung);

	void deleteSamsungDetailsByID(int id);

}
