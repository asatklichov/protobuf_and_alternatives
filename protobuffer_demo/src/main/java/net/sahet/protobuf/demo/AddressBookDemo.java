package net.sahet.protobuf.demo;

import java.util.Random;

import net.sahet.protobuf.messages.AddressBookOuterClass;
import net.sahet.protobuf.messages.AddressBookOuterClass.Company;

public class AddressBookDemo {
	public static void main(String[] args) {
		String email = "dsdj@sdsd.com";
		int id = new Random().nextInt();
		String name = "sdsd dfd ";
		String number = " 3434301688";
 
		
		Company company = AddressBookOuterClass.Company.newBuilder().setId(id).setName(name).setEmail(email)
				.addNumbers(number).build();

		id = new Random().nextInt();

		Company company2 = AddressBookOuterClass.Company.newBuilder().setId(id).setName("broadcom").setEmail("bro@broadcom.com")
		.addNumbers(number).build();
		
		AddressBookOuterClass.AddressBook addrBook = AddressBookOuterClass.AddressBook.newBuilder()
				.addCompany(company)
				.addCompany(company2)
				.setCompany(0, company2)
				.build();
		

		System.out.println(addrBook.getCompanyCount());
		System.out.println(addrBook.getCompany(0).getName());
		System.out.println(addrBook.getCompany(1).getName());
	}

}
