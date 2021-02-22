 package com.mindtree.Passport.service.impl;

import java.util.List;

import com.mindtree.Passport.dao.PassportDao;
import com.mindtree.Passport.dao.impl.PassportDaoImpl;
import com.mindtree.Passport.entity.Passport;
import com.mindtree.Passport.entity.Person;
import com.mindtree.Passport.exception.daoexception.ConnectivityException;
import com.mindtree.Passport.exception.daoexception.PersonidNot;
import com.mindtree.Passport.exception.serviceexception.*;
import com.mindtree.Passport.service.PassportService;

public class PassportServiceimpl implements PassportService {
	private PassportDao dao = new PassportDaoImpl(); 
	@Override
	public Person getPersonDetails() {
		return dao.getPersonDetails();
	}
	@Override
	public boolean addToPersonDB(Person person) {
		return dao.addToPersonDB(person);
	}
	@Override
	public Passport getPassportDetails() throws PersonidNotservice {
		try {
			return dao.getPassportDetails();
		} catch (PersonidNot e) {
			throw new PersonidNotservice("id not found");
		}
	}
	@Override
	public boolean addToPassportDB(Passport passport) {
		return dao.addToPassportDB(passport);
	}
	@Override
	public Person getInfoDetails() throws PersonidNotservice {
		try {
			return dao.getInfoDetails();
		} catch (PersonidNot e) {
			throw new PersonidNotservice("id not found");
		} 
	}
	@Override
	public List<Person> getAllInfoDetails() {
		 return dao.getAllInfoDetails();
	}

}
