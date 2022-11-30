package com.utsjava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utsjava.model.entities.Invoice;
import com.utsjava.services.InvoiceService;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {
    
    @Autowired
    private InvoiceService invoiceService;

    @CrossOrigin
    @PostMapping
    public Invoice create(@RequestBody Invoice invoice) {
        return invoiceService.save(invoice);
    }

    @CrossOrigin
    @GetMapping
    public Iterable<Invoice> findAll() {
        return invoiceService.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Invoice findOne(@PathVariable("id") Long id) {
        return invoiceService.findOne(id);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        invoiceService.removeOne(id);
    }    
}
