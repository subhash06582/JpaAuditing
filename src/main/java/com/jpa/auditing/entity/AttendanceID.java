package com.jpa.auditing.entity;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AttendanceID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3285591128028175792L;

	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="effective_dt")
	private LocalDate effectiveDt;
}