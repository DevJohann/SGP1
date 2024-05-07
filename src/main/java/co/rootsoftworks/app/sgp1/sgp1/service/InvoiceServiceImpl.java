package co.rootsoftworks.app.sgp1.sgp1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.rootsoftworks.app.sgp1.sgp1.entity.Invoice;
import co.rootsoftworks.app.sgp1.sgp1.repository.InvoiceRepository;

public class InvoiceServiceImpl implements InvoiceService{
    
    @Autowired
    private InvoiceRepository repository;

    @Override
    public List<Invoice> findAll() {
        return (List<Invoice>) repository.findAll();
    }
}
