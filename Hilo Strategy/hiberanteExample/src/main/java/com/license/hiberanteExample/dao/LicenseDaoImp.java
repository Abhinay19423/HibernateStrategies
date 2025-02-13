package com.license.hiberanteExample.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.license.hiberanteExample.entity.DrivingLicense;

import jakarta.persistence.EntityManager;

public class LicenseDaoImp implements LicenseDAO{

    private final EntityManager entityManager;

    @Autowired
    public LicenseDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void saveLicense(DrivingLicense license) {
        
    }

    @Override
    public DrivingLicense getLicense(int id) {
        
        return null;
    }

    @Override
    public void updateLicense(DrivingLicense license) {
        
    }

    @Override
    public void deleteLicense(DrivingLicense license) {
        
    } 

}
