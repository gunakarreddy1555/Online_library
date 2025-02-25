package com.vcube.library.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bookname;
	private String author;
	private String price;
	private String publisheddate;
	private String booklink;
	private String status="Active";
    
}