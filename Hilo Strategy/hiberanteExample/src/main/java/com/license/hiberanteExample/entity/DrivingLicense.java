package com.license.hiberanteExample.entity;

import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

import java.util.Date;

// import org.hibernate.annotations.GenericGenerator;
// import org.hibernate.annotations.GenericGenerators;
// import org.hibernate.annotations.Parameter;


@Table(name = "DrivingLicense")
// @GenericGenerators(name = "hibhilo", strategy= "hilo", parameters = {@Parameter(name = "max_lo", value = "100000")}, value = { @GenericGenerator })
@SequenceGenerator(name = "hibhilo", sequenceName = "hibhilo", initialValue = 100000, allocationSize = 1)
public class DrivingLicense {

    @Id
    @GeneratedValue(generator = "hibhilo")
    @Column(name = "licenseNumber")
    Integer licenseNumber;
    @Column(name = "name")
    String name;
    @Column(name = "age")
    Integer age;
    @Column(name = "address")
    String address;
    @Column(name = "licenseIssueDate")
    Date licenseIssueDate;
    @Column(name = "licenseExpiryDate")
    Date licenseExpiryDate;
    @Override
    public String toString() {
        return "DrivingLicense [licenseNumber=" + licenseNumber + ", name=" + name + ", age=" + age + ", address="
                + address + ", licenseIssueDate=" + licenseIssueDate + ", licenseExpiryDate=" + licenseExpiryDate
                + ", licenseIssueZone=" + licenseIssueZone + "]";
    }
    @Column(name = "licenseIssueZone")
    String licenseIssueZone;
    public DrivingLicense(String name, Integer age, String address, Date licenseIssueDate, Date licenseExpiryDate,
            String licenseIssueZone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.licenseIssueDate = licenseIssueDate;
        this.licenseExpiryDate = licenseExpiryDate;
        this.licenseIssueZone = licenseIssueZone;
    }
    public Integer getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getLicenseIssueDate() {
        return licenseIssueDate;
    }
    public void setLicenseIssueDate(Date licenseIssueDate) {
        this.licenseIssueDate = licenseIssueDate;
    }
    public Date getLicenseExpiryDate() {
        return licenseExpiryDate;
    }
    public void setLicenseExpiryDate(Date licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }
    public String getLicenseIssueZone() {
        return licenseIssueZone;
    }
    public void setLicenseIssueZone(String licenseIssueZone) {
        this.licenseIssueZone = licenseIssueZone;
    }
    




}
