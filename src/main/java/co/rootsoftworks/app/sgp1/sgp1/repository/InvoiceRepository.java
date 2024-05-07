package co.rootsoftworks.app.sgp1.sgp1.repository;

import org.springframework.data.repository.CrudRepository;

import co.rootsoftworks.app.sgp1.sgp1.entity.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long>{
    
}
