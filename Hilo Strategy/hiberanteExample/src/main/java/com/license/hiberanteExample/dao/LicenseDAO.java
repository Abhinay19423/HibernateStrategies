package com.license.hiberanteExample.dao;

import com.license.hiberanteExample.entity.DrivingLicense;

public interface LicenseDAO {

    public void saveLicense(DrivingLicense license);

    public DrivingLicense getLicense(int id);

    public void updateLicense(DrivingLicense license);

    public void deleteLicense(DrivingLicense license);

}
