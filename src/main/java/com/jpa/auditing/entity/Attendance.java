package com.jpa.auditing.entity;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@IdClass(AttendanceID.class)
@Table(name="attendance")
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Attendance extends AuditableBase implements Serializable {

	private static final long serialVersionUID = 81024225062716935L;

	@Id
	@Column(name="emp_id")
	private Integer empId;
	
	@Id
	@Column(name="effective_dt")
	private LocalDate effectiveDt;
	
	@Column(name="fl_present")
	private boolean present;
	
}