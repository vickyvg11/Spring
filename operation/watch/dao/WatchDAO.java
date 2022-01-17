package com.xworkz.watch.dao;

import java.util.List;

import com.xworkz.watch.entity.WatchEntity;

public interface WatchDAO {

	boolean saveWatchEntity (WatchEntity watchEntity);

	WatchEntity getWatchEntity(String watchName);

	List<WatchEntity> getAllData();
	
	boolean deleteWatchEntity(String watchName);
}
