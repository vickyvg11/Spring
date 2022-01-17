package com.xworkz.watch.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xworkz.watch.dao.WatchDAO;
import com.xworkz.watch.dto.WatchDTO;
import com.xworkz.watch.entity.WatchEntity;

@Component
public class WatchServiceImpl implements WatchService {

	@Autowired
	private WatchDAO watchDAO;



	public WatchServiceImpl() {
		System.out.println("Service Layer is Created"+this.getClass().getSimpleName());
	}





	@Override
	public boolean validateWatchDTO(WatchDTO watchDTO) {
		System.out.println("Invoked Validate WatchDTO");
		boolean temp =false;
		if(watchDTO.getName()!=null && !watchDTO.getName().isEmpty()) {
			temp=true;
			System.out.println("Data Entered Is Correct");

		}else {
			temp=false;
			map.put("Name","Invalid Name");
			System.out.println("INvalid Name");
			return temp;
		}if(watchDTO.getEmail()!=null && !watchDTO.getEmail().isEmpty()) {
			temp=true;
			System.out.println("Data Entered is Correct");

		}else {
			temp=false;
			map.put("Email","Invalid Email");
			System.out.println("InValid Data");
			return temp;
		}if (watchDTO.getAddress()!=null && !watchDTO.getAddress().isEmpty()) {
			temp=true;
			System.out.println("Data Entered is Correct");

		}else {
			temp=false;
			map.put("Address","Invalid address");
			System.out.println("InvAlid Data");
			return temp;
		}if (watchDTO.getMobileNumber()>0) {
			temp=true;
			System.out.println("Data is Correct");

		}else {
			temp=false;
			map.put("MobileNumber","Invalid Mobile Number");
			System.out.println("Invalid Data");

			return temp;
		}

		return temp;
	}



	@Override
	public boolean saveWatchDTO(WatchDTO watchDTO) {

		WatchEntity watchEntity = new WatchEntity();
		BeanUtils.copyProperties(watchDTO, watchEntity);
		boolean entity = this.watchDAO.saveWatchEntity(watchEntity);
		return entity;
	}



	@Override
	public boolean validateName(String watchName) {
		System.out.println("Invoked Validate Name");
		boolean temp =false;

		if(watchName!=null && !watchName.isEmpty()) {
			temp=true;
			System.out.println("Data Entered Is Correct");
			return temp;
		}else {
			temp=false;
			System.out.println("INvalid Watch Name");
			return temp;

		}



	}



	@Override
	public WatchDTO watchDTO(String watchName) {
		System.out.println("Invoked watchDTO");
		WatchEntity entity = this.watchDAO.getWatchEntity(watchName);
		if(entity!=null) {
			WatchDTO watchDTO =new WatchDTO();
			BeanUtils.copyProperties(entity, watchDTO);
			return watchDTO;
		}else {
			return null;
		}
	}





	@Override
	public List<Object> getAllData() {
		System.out.println("Invoked get All Data of Service Layer");
		List<Object> container = null;
		List<WatchEntity> allData = this.watchDAO.getAllData();

		if (allData!=null) {
			return container = new ArrayList<Object>(allData);

		}
		return container;

	}

	@Override
	public boolean deleteWatch(String watchName) {
		System.out.println("Invoked Delete Watch();");
		boolean deleteWatchEntity = this.watchDAO.deleteWatchEntity(watchName);
		return deleteWatchEntity;
	}

}






