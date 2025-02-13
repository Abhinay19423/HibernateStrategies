package com.license.hiberanteExample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.license.hiberanteExample.entity.DrivingLicense;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class LicenseDaoImp implements LicenseDAO{

    // @PersistenceContext
    private final EntityManager entityManager;

    @Autowired
    public LicenseDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void saveLicense(DrivingLicense license) {
        entityManager.persist(license);
    }

    @Override
    public DrivingLicense getLicense(int id) {
        DrivingLicense license = entityManager.find(DrivingLicense.class, id);
        if(license != null){
            return license;
        }
        return null;
    }

    @Override
    public List<DrivingLicense> showAllDrivingLicenses() {
        List<DrivingLicense> licenses = entityManager.createQuery("from DrivingLicense", DrivingLicense.class).getResultList();
        return licenses;
    }

    @Override
    public void updateLicense(DrivingLicense license) {
        
    }

    @Override
    public void deleteLicense(DrivingLicense license) {
        
    } 

}
