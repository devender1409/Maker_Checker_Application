package com.customerapp.model.hibernate.repository.entities;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "customer_master_16794")
public class CustomerMstEntity {

    @Column(name = "cust_id",length = 10)
    private Integer customerId;//Y

    @Id
    @Column(name = "cust_code",nullable = false,length = 10)
    private String customerCode;//Y

    @Column(name = "cust_name",nullable = false,length = 30)
    private String customerName;//Y

    @Column(name = "cust_address1",nullable = false,length = 100)
    private String customerAddress1;//Y

    @Column(name = "cust_address2",length = 100)
    private String customerAddress2;//N

    @Column(name = "pin_code",nullable = false,length = 6)
    private int customerPinCode;//Y

    @Column(name = "email",nullable = false,length = 100)
    private String emailAddress;//Y

    @Column(name = "cont_no",length = 20)
    private String contactNumber;//N

    @Column(name = "prim_cont_person",nullable = false,length = 100)
    private String primaryContactPerson;//Y

    @Column(name = "record_status",nullable = false,length = 5)
    private String recordStatus;//Y

    @Column(name = "a_i_flag",nullable = false,length = 1)
    private String activeInactiveFlag;//Y

    @Column(name = "created_by",nullable = false,length = 30)
    private String createdBy;//Y

    @Column(name = "created_date",nullable = false)
    private Date createdDate;//Y

    @Column(name = "modified_by",length = 30)
    private String modifiedBy;//N

    @Column(name = "modified_date")
    private Date modifiedDate;//N

    @Column(name = "authorized_by",length = 30)
    private String authorizedBy;//N

    @Column(name = "authorized_date")
    private Date authorizedDate;//N

    public CustomerMstEntity() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress1() {
        return customerAddress1;
    }

    public void setCustomerAddress1(String customerAddress1) {
        this.customerAddress1 = customerAddress1;
    }

    public String getCustomerAddress2() {
        return customerAddress2;
    }

    public void setCustomerAddress2(String customerAddress2) {
        this.customerAddress2 = customerAddress2;
    }

    public int getCustomerPinCode() {
        return customerPinCode;
    }

    public void setCustomerPinCode(int customerPinCode) {
        this.customerPinCode = customerPinCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPrimaryContactPerson() {
        return primaryContactPerson;
    }

    public void setPrimaryContactPerson(String primaryContactPerson) {
        this.primaryContactPerson = primaryContactPerson;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getActiveInactiveFlag() {
        return activeInactiveFlag;
    }

    public void setActiveInactiveFlag(String activeInactiveFlag) {
        this.activeInactiveFlag = activeInactiveFlag;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getAuthorizedBy() {
        return authorizedBy;
    }

    public void setAuthorizedBy(String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }

    public Date getAuthorizedDate() {
        return authorizedDate;
    }

    public void setAuthorizedDate(Date authorizedDate) {
        this.authorizedDate = authorizedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerMstEntity that = (CustomerMstEntity) o;
        return customerPinCode == that.customerPinCode && Objects.equals(customerId, that.customerId) && Objects.equals(customerCode, that.customerCode) && Objects.equals(customerName, that.customerName) && Objects.equals(customerAddress1, that.customerAddress1) && Objects.equals(customerAddress2, that.customerAddress2) && Objects.equals(emailAddress, that.emailAddress) && Objects.equals(contactNumber, that.contactNumber) && Objects.equals(primaryContactPerson, that.primaryContactPerson) && Objects.equals(recordStatus, that.recordStatus) && Objects.equals(activeInactiveFlag, that.activeInactiveFlag) && Objects.equals(createdBy, that.createdBy) && Objects.equals(createdDate, that.createdDate) && Objects.equals(modifiedBy, that.modifiedBy) && Objects.equals(modifiedDate, that.modifiedDate) && Objects.equals(authorizedBy, that.authorizedBy) && Objects.equals(authorizedDate, that.authorizedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerCode, customerName, customerAddress1, customerAddress2, customerPinCode, emailAddress, contactNumber, primaryContactPerson, recordStatus, activeInactiveFlag, createdBy, createdDate, modifiedBy, modifiedDate, authorizedBy, authorizedDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerTempEntity{");
        sb.append("customerId=").append(customerId);
        sb.append(", customerCode='").append(customerCode).append('\'');
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", customerAddress1='").append(customerAddress1).append('\'');
        sb.append(", customerAddress2='").append(customerAddress2).append('\'');
        sb.append(", customerPinCode=").append(customerPinCode);
        sb.append(", emailAddress='").append(emailAddress).append('\'');
        sb.append(", contactNumber='").append(contactNumber).append('\'');
        sb.append(", primaryContactPerson='").append(primaryContactPerson).append('\'');
        sb.append(", recordStatus='").append(recordStatus).append('\'');
        sb.append(", activeInactiveFlag='").append(activeInactiveFlag).append('\'');
        sb.append(", createdBy='").append(createdBy).append('\'');
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedBy='").append(modifiedBy).append('\'');
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", authorizedBy='").append(authorizedBy).append('\'');
        sb.append(", authorizedDate=").append(authorizedDate);
        sb.append('}');
        return sb.toString();
    }

    public CustomerMstEntity(Integer customerId, String customerCode, String customerName, String customerAddress1, int customerPinCode, String emailAddress, String primaryContactPerson, String recordStatus, String activeInactiveFlag, String createdBy, Date createdDate) {
        this.customerId = customerId;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerAddress1 = customerAddress1;
        this.customerPinCode = customerPinCode;
        this.emailAddress = emailAddress;
        this.primaryContactPerson = primaryContactPerson;
        this.recordStatus = recordStatus;
        this.activeInactiveFlag = activeInactiveFlag;
        this.createdBy = createdBy;
        this.createdDate=createdDate;
    }
}

