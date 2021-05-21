package com.jpa.auditing.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.auditing.entity.Attendance;
import com.jpa.auditing.repository.AttendanceRepo;

@Service
public class AttendanceService {

	@Autowired
	private AttendanceRepo attendanceRepo;
	
	public Attendance saveAttendance(Attendance attendance) {
		
		return attendanceRepo.save(attendance);
		
	}
}