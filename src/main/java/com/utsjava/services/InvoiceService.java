package com.utsjava.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utsjava.model.entities.Invoice;
import com.utsjava.model.repos.InvoiceRepo;

@Service
@Transactional
public class InvoiceService {
    @Autowired
    private InvoiceRepo invoiceRepo;

    public Invoice save(Invoice invoice) {
        return invoiceRepo.save(invoice);
    }

    public Iterable<Invoice> findAll() {
        return invoiceRepo.findAll();
    }

    public void removeOne(Long id) {
        invoiceRepo.deleteById(id);
    }

    public Invoice findOne(Long id) {
        Optional<Invoice> invoice = invoiceRepo.findById(id);
        if (!invoice.isPresent()) {
            return null;
        }
        return invoiceRepo.findById(id).get();
    }
}
