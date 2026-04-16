package com.generation153.library.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loans")
public class Loan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private LocalDate date;
	@Column(name = "exp_return_date", nullable = false)
	private LocalDate expReturnDate;
	@Column(name = "return_date", nullable = true)
	private LocalDate returnDate;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EnumLoanStatus status;
}
