package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.xdevapi.SessionFactory;
import com.xworkz.dao.TyreClassImpl;
import com.xworkz.dao.TyreDAO;
import com.xworkz.entity.TyreClass;

import javassist.compiler.ast.Symbol;

@Component
public class ServiceImpl implements Service {

	@Autowired
	private TyreDAO tyreDao;


	public ServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + ":Object Created of ServiceIMPL");
	}



	@Override
	public boolean validateTyreClass(TyreClass tyreClass) {
		System.out.println("Invoked Validate Tyre Class");
		boolean temp = false;

		if (!tyreClass.getName().isEmpty() && tyreClass.getName() != null) {
			temp = true;
			System.out.println("Name is Entered");

		} else {
			temp = false;
			System.out.println("Name is empty");
			return temp;
		}
		if (tyreClass.getPrice() > 0) {
			temp = true;
			System.out.println("Price is Entered");
		}
		else {
			temp = false;
			System.out.println("Price must be Greater than Zero");
			return temp;

		}
		if (tyreClass.getWarranty() > 0) {
			temp = true;
			System.out.println("warranty is success");
		} else {
			temp=false;
			System.out.println("Warranty Should Be Greater Than 1 ");
			return temp;
		}
		if (tyreClass.getWidthTyre() > 100) {
			temp = true;
			System.out.println("width is Sucess");

		} else {
			temp=false;
			System.out.println("Width Should Be Greater Than 170");
			return temp;
		}

		if (temp) {
			System.out.println("All data has been Validated");
			this.tyreDao.addTyreEntity(tyreClass);
			return temp;
		} else {
			System.out.println("Invalid Data");
			return temp;
		}

	}



	@Override
	public boolean validateTyreClassByName(TyreClass tyreClass) {
		System.out.println("Invoked Service Class Validation Method");
		boolean temp1 = false;
		if(!tyreClass.getName().isEmpty() && tyreClass.getName()!=null) {
			temp1=true;
			System.out.println("Validated By Name");
			return temp1;
		}else {
			temp1=false;
			System.out.println("Name ia not Updated");
			return temp1;


		}
	}



	@Override
	public boolean deleteRowByID(TyreClass tyreClass) {
		System.out.println("Invoked Service Class For Deleted Row");
		boolean temp2=false;
		if(tyreClass.getName().isEmpty() && tyreClass.getName()!=null ) {
			temp2=true;
			System.out.println("Validated");
			return temp2;
		}else {
			temp2=false;
			System.out.println("ID is not Deleted");
			return temp2;
		}

	}
}


