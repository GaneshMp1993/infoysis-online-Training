package com.project.samsungdao;

import java.util.List;

import com.project.entity.samsung.Samsung;

public interface SamsungDao {
	void saveData();
	void readSingleData();
	void updateData();
	void deleteData();
	List<Samsung> getAllSamsungDetails();
	

}
