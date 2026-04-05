package com.alekhya.finance_backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alekhya.finance_backend.model.FinancialRecord;
import com.alekhya.finance_backend.service.FinancialService;

@RestController
@RequestMapping("/api/finance")
public class FinancialController {

    @Autowired
    private FinancialService service;

    // ✅ CREATE
    @PostMapping
    public FinancialRecord createRecord(@RequestBody FinancialRecord record) {
        return service.createRecord(record);
    }

    // ✅ GET ALL
    @GetMapping
    public List<FinancialRecord> getAllRecords() {
        return service.getAllRecords();
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable Long id) {
        service.deleteRecord(id);
    }

    // ✅ TOTAL INCOME
    @GetMapping("/income")
    public double getTotalIncome() {
        return service.getTotalIncome();
    }

    // ✅ TOTAL EXPENSE
    @GetMapping("/expense")
    public double getTotalExpense() {
        return service.getTotalExpense();
    }

    // ✅ BALANCE
    @GetMapping("/balance")
    public double getBalance() {
        return service.getTotalIncome() - service.getTotalExpense();
    }

    // ✅ CATEGORY SUMMARY
    @GetMapping("/category-summary")
    public Map<String, Double> getCategorySummary() {
        return service.getCategoryTotals();
    }

    // ✅ UPDATE
    @PutMapping("/{id}")
    public FinancialRecord updateRecord(
            @PathVariable Long id,
            @RequestBody FinancialRecord record) {
        return service.updateRecord(id, record);
    }

    // ✅ FILTER BY DATE
    @GetMapping("/by-date")
    public List<FinancialRecord> getByDate(@RequestParam String date) {
        return service.getRecordsByDate(date);
    }

    // ✅ TEST
    @GetMapping("/test")
    public String test() {
        return "Working";
    }
}