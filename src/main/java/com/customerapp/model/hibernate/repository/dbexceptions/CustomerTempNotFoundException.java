package com.customerapp.model.hibernate.repository.dbexceptions;

public class CustomerTempNotFoundException extends RuntimeException{
    public CustomerTempNotFoundException(String message) {
        super(message);
    }
}
