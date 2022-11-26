package com.utsjava.model.repos;

import org.springframework.data.repository.CrudRepository;

import com.utsjava.model.entities.Invoice;

public interface InvoiceRepo extends CrudRepository<Invoice, Long>{
    
}
