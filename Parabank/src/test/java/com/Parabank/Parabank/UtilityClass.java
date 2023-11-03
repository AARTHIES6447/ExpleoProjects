package com.Parabank.Parabank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	String strurl,strFirstName,strLastName,strAddress,strCity,strState,strZipCode,strPhoneNumber,strSsn,strUsername,strPassword,strRepeatedPassword;
	

	public UtilityClass() {
		data();
	}

	public void data() {
		File file = new File("\\src\\test\\resources\\Features\\cc.feature");
		FileInputStream fio = null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}

		strurl = prop.getProperty("url");
		strFirstName = prop.getProperty("FirstName");
		strLastName = prop.getProperty("LastName");
		strAddress = prop.getProperty("Address");
		strCity = prop.getProperty("City");
		strState = prop.getProperty("State");
		strZipCode = prop.getProperty("ZipCode");
		strPhoneNumber = prop.getProperty("PhoneNumber");
		strSsn = prop.getProperty("Ssn");
		strUsername = prop.getProperty("username");
		strPassword = prop.getProperty("password");
		strRepeatedPassword = prop.getProperty("RepeatedPassword");
	}

}
