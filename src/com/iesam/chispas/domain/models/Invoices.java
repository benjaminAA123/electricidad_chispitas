package com.iesam.chispas.domain.models;

public class Invoices {

    private Integer idInvoice;
    public String invoiceDate;
    public String client;
    public String product;
    public String service;
    public String taxBase;
    public String totalVat;


    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }


    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }



    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }



    public String getTaxBase() {
        return  taxBase;
    }

    public void setTaxBase(String taxBase) {
        this.taxBase = taxBase;
    }

    public String getTotalVat() {
        return totalVat;
    }

    public void setTotalVat(String totalVat) {
        this.totalVat = totalVat;
    }

    }