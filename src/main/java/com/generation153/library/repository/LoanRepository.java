package com.generation153.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation153.library.entity.Loan;

//non è più necessaria l'annotazione @Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {

}
