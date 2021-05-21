package com.jpa.auditing.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.auditing.entity.Attendance;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Integer>{

}