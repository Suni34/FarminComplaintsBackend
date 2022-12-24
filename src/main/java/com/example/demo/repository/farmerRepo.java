package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FarmerComplaints;
@Repository
public interface farmerRepo extends JpaRepository<FarmerComplaints, Long> {

//	OngoingStubbing<List<FarmerComplaints>> findAllById(long id);

//	public FarmerComplaints findById(long id);
//
//	public Object times(int i);
	
}
