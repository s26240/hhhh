package com.pjatk.invoice;

import com.pjatk.invoice.model.Invoice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class InvoiceInterestCalculator {
    public static double calculateIntersts(double percentage, List<Invoice>invoices, LocalDate date){
        double value = 0;
        for (Invoice invoice : invoices) {
            long days = ChronoUnit.DAYS.between(date, invoice.getDueDate());
        }
    }
}
