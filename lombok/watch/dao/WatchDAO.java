package com.xworkz.watch.dao;

import com.xworkz.watch.entity.WatchEntity;

public interface WatchDAO {

	boolean saveWatchEntity (WatchEntity watchEntity);

	WatchEntity getWatchEntity(String watchName);


}
