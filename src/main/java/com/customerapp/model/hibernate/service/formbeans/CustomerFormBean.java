package com.customerapp.model.hibernate.service.formbeans;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

public class CustomerFormBean {
    private int customerId;//Y
    @NotEmpty(message = "Cannot be Empty")
    @Size(max = 10)
    private String customerCode;//Y

    @NotEmpty(message = "Name Can't be Left Blank")
    @Size(max = 30)
    private String customerName;//Y

    @NotEmpty(message = "*required")
    @Size(max = 100)
    private String customerAddress1;//Y

    @Size(max=100)
    private String customerAddress2;//N

    @NotNull(message = "*required(must be of length 6)")
//    @Size(min = 6,max=6,message = "pincode min length is 6 & max length is 6")
    private int customerPinCode;//Y

    @NotEmpty(message = "*required")
    @Size(max = 100)
    private String emailAddress;//Y

    @Size(max = 20)
    private String contactNumber;//N

    @NotEmpty(message = "*required")
    private String primaryContactPerson;//Y

    @Size(max = 5)
    private String recordStatus;//Y

    @NotEmpty(message = "*choose Active/InActive")
    private String activeInactiveFlag;//Y

    private String createdBy;//Y

    private Date createdDate;//Y
    private String modifiedBy;//N
    private Date modifiedDate;//N
    private String authorizedBy;//N
    private Date authorizedDate;//N

    public CustomerFormBean() {
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
        CustomerFormBean that = (CustomerFormBean) o;
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

    public CustomerFormBean(Integer customerId, String customerCode, String customerName, String customerAddress1, int customerPinCode, String emailAddress, String primaryContactPerson, String recordStatus, String activeInactiveFlag, String createdBy, Date createdDate) {
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
