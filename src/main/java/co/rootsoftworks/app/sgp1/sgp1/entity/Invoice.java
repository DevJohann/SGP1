package co.rootsoftworks.app.sgp1.sgp1.entity;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Invoice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceID;
    
    private Date date;
    private Integer amount;

    //@Autowired
    //private List<Product> products;

    //Full constructor
    public Invoice(Long invoiceID, Date date, Integer amount) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.amount = amount;
    }

    //Empty constructor
    public Invoice() {

    }


    //----------- Getters and setters ------------- //

    public Long getInvoiceID() {
        return invoiceID;
    }
    
    public void setInvoiceID(Long invoiceID) {
        this.invoiceID = invoiceID;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
}
