package com.alekhya.finance_backend.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alekhya.finance_backend.model.FinancialRecord;
import com.alekhya.finance_backend.repository.FinancialRecordRepository;

@Service
public class FinancialService {

    @Autowired
    private FinancialRecordRepository repository;

    // ✅ CREATE
    public FinancialRecord createRecord(FinancialRecord record) {
        return repository.save(record);
    }
    

    // ✅ READ ALL
    public List<FinancialRecord> getAllRecords() {
        return repository.findAll();
    }

    // ✅ DELETE
    public void deleteRecord(Long id) {
        repository.deleteById(id);
    }

    // ✅ TOTAL INCOME
    public double getTotalIncome() {
        return repository.findAll().stream()
                .filter(r -> "INCOME".equals(r.getType()))
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    // ✅ TOTAL EXPENSE
    public double getTotalExpense() {
        return repository.findAll().stream()
                .filter(r -> "EXPENSE".equals(r.getType()))
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    // ✅ UPDATE
    public FinancialRecord updateRecord(Long id, FinancialRecord newRecord) {
        FinancialRecord existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Record not found"));

        existing.setAmount(newRecord.getAmount());
        existing.setType(newRecord.getType());
        existing.setCategory(newRecord.getCategory());
        existing.setDate(newRecord.getDate());
        existing.setNotes(newRecord.getNotes());

        return repository.save(existing);
    }

    // ✅ CATEGORY SUMMARY
    public Map<String, Double> getCategoryTotals() {
        return repository.findAll().stream()
                .collect(Collectors.groupingBy(
                        FinancialRecord::getCategory,
                        Collectors.summingDouble(FinancialRecord::getAmount)
                ));
    }

    // ✅ FILTER BY DATE (optional extra)
    public List<FinancialRecord> getRecordsByDate(String date) {
        LocalDate localDate = LocalDate.parse(date);

        return repository.findAll().stream()
                .filter(r -> r.getDate().equals(localDate))
                .toList();
    }
}