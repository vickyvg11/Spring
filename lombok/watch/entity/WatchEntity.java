package com.xworkz.watch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
@Entity
@Table(name="watch_info")
@Data
public class WatchEntity implements java.io.Serializable{

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int enterId;

	@Column (name="NAME")
	private String name;

	@Column (name="EMAIL")
	private String email;

	@Column (name="ADDRESS")
	private String address;

	@Column (name="MOBILENUMBER")
	private long mobileNumber;

}
