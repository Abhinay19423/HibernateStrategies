package com.license.hiberanteExample;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.license.hiberanteExample.dao.LicenseDAO;
import com.license.hiberanteExample.entity.DrivingLicense;

// import com.license.hiberanteExample.entity.DrivingLicense;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;

@SpringBootApplication
public class DemoApplication {

	// @PersistenceContext
    // private EntityManager entityManager;

	private final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(LicenseDAO licenseDAO){
		return runner -> {
			createDrivingLicense(licenseDAO);
			allDrivingLicenses(licenseDAO);
            System.out.println("fetchedLicense");
			sc.close();
		};
	}

	public void createDrivingLicense(LicenseDAO licenseDAO){
		// DrivingLicense
		System.out.println("Enter no of driving license u want to create  ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i< n; i++){
			System.out.println("Enter name ");
			String name = sc.nextLine();
			System.out.println("Enter age ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter address ");
			String address = sc.nextLine();
			System.out.println("Enter licenseIssueZone ");
			String licenseIssueZone = sc.nextLine();
			DrivingLicense license = new DrivingLicense(name, age, address,
					//  licenseIssueDate, licenseExpiryDate,
					 licenseIssueZone);
			licenseDAO.saveLicense(license);
		}
	}

	public void allDrivingLicenses(LicenseDAO licenseDAO){
		List<DrivingLicense> l = licenseDAO.showAllDrivingLicenses();
		for(DrivingLicense license : l){
			System.out.println(license.toString());
		}
	}

}
