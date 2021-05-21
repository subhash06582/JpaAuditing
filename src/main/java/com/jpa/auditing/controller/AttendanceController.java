package com.jpa.auditing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.auditing.entity.Attendance;
import com.jpa.auditing.service.AttendanceService;

@RestController
@RequestMapping(value = "/byteprogramming")
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;

	@PostMapping(value = "/jpaAudit/attendance")
	public ResponseEntity<Attendance> saveAttendance(@RequestBody Attendance attendace) {

		return new ResponseEntity<Attendance>(attendanceService.saveAttendance(attendace), HttpStatus.OK);
	}

	@GetMapping(value = "/jpaAudit/attendance")
	public ResponseEntity<Object> getAttendance() {

		return new ResponseEntity<Object>("Hello", HttpStatus.OK);
	}
}