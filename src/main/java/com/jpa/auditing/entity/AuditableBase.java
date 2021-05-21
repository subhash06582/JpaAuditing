package com.jpa.auditing.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@MappedSuperclass
@Data
@EntityListeners(value = { AuditingEntityListener.class })
public abstract class AuditableBase {

	@CreatedBy
	@Column(name="created_by", updatable=false)
	private String createdBy;
	
	@CreatedDate
	@Column(name="created_dt", updatable =false)
	private LocalDateTime createdDt;
	
	@LastModifiedBy
	@Column(name="modified_by")
	private String modifiedBy;
	
	@LastModifiedDate
	@Column(name="modified_dt")
	private LocalDateTime modifiedDt;
}