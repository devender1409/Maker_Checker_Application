package com.customerapp.model.hibernate.repository.dbexceptions;

public class CustomerMstNotFoundException extends RuntimeException{
    public CustomerMstNotFoundException(String message) {
        super(message);
    }

}
