package com.xworkz.dao;

import com.xworkz.entity.TyreClass;

public interface TyreDAO {
	
	void addTyreEntity(TyreClass tyreClass);
	
	void updateTyreClassNameByID(TyreClass tyreClass);
	
	void deleteTyreClass();
	
	void readTyreClassByID();
	
	void updatePriceByName();

}
