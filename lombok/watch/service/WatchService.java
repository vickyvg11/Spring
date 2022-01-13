package com.xworkz.watch.service;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.watch.dto.WatchDTO;
import com.xworkz.watch.entity.WatchEntity;

public interface WatchService {

	Map<String,String> map = new HashMap<String,String>();
	
	boolean validateWatchDTO(WatchDTO watchDTO);

	boolean saveWatchDTO(WatchDTO watchDTO);

	boolean validateName(String watchName);

	WatchDTO watchDTO(String watchName);

}
