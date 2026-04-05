package com.alekhya.finance_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alekhya.finance_backend.model.FinancialRecord;

public  interface FinancialRecordRepository extends JpaRepository<FinancialRecord, Long> {
    
}
