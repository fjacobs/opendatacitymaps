package com.dynacore.livemap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dynacore.livemap.entity.hibernate.ParkingLogData;
import com.dynacore.livemap.repository.ParkingPlaceRepository;
import com.dynacore.livemap.repository.ParkingPlaceRepositoryImpl;


@Service("parkingPlaceService")
public class ParkingPlaceServiceImpl implements ParkingPlaceService {
	
	@Autowired 
	private ParkingPlaceRepository parkingPlaceRepository;
	
	@Transactional
	public ParkingLogData save(ParkingLogData parkingPlace) {
		return parkingPlaceRepository.save(parkingPlace);
	}

}
