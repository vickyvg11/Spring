package com.xworkz.service;

import com.xworkz.entity.TyreClass;

public interface Service {

	boolean validateTyreClass(TyreClass tyreClass);
	
	boolean validateTyreClassByName(TyreClass tyreclass);
	
	boolean deleteRowByID(TyreClass tyreClass);
	

}
