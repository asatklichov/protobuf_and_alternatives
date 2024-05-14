package net.sahet.protobuf.demo;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import net.sahet.protobuf.messages.AddressBookOuterClass;
import net.sahet.protobuf.messages.AddressBookOuterClass.AddressBook;
import net.sahet.protobuf.messages.AddressBookOuterClass.Company;
import net.sahet.tt.point.greeting.Ttpoint.Greet;

/**
 * Serializing and Deserializing Protobuf Once we create an instance of our
 * Person class, we want to save that on disc in a binary format that is
 * compatible with a created protocol. Let’s say that we want to create an
 * instance of the AddressBook class and add one person to that object.
 * 
 * Also see:
 * 
 * https://protobuf.dev/getting-started/javatutorial/
 *
 */
class WritingAMessageDemo { // write a message demo
	final static String FILE_PATH = "addr_book";

	public static void main(String[] args) throws IOException {

		String email = "dsdj@sdsd.com";
		int id = new Random().nextInt();
		String name = "sdsd dfd ";
		String number = " 3434301688";

		// given
		Company company = AddressBookOuterClass.Company.newBuilder().setId(id).setName(name).setEmail(email)
				.addNumbers(number).build();

		id = new Random().nextInt();
		AddressBookOuterClass.Company.newBuilder().setId(id).setName("broadcom").setEmail("zwe@broadcom.com")
				.addNumbers(number).build();

		// when
		AddressBookOuterClass.AddressBook addrBook = AddressBookOuterClass.AddressBook.newBuilder().addCompany(company)
				// .setPeople(1, person2)
				.build();

		System.out.println(addrBook.getCompanyCount());
		System.out.println(addrBook.getCompany(0).getName());
		// System.out.println(addrBook.getCompany(1).getName());

		try (FileOutputStream fos = new FileOutputStream(FILE_PATH)) {
			// serialize - write the new address book back to disk.
			addrBook.writeTo(fos);
			if (Files.exists(Paths.get(FILE_PATH))) {
				// if (Files.deleteIfExists(Paths.get(filePath))) {
				System.out.println("done");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

//https://protobuf.dev/getting-started/javatutorial/
class DeserializeDemo { // read a message demo

	public static void main(String[] args) {

		// then
		try (FileInputStream fis = new FileInputStream(WritingAMessageDemo.FILE_PATH)) {

			AddressBookOuterClass.AddressBook deserialized = AddressBookOuterClass.AddressBook.newBuilder()
					.mergeFrom(fis).build();
			System.out.println(deserialized.getCompanyCount());
			System.out.println(deserialized.getCompany(0).getName());
			// fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}


class WritingAMessageDemoByteArray {
	public static void main(String[] args) throws IOException {

	    Greet greeting = Greet.newBuilder()
                .setGreeting("Gurgunmysyn")
                .setUserName("Merdan")
                .build();
	    
	    System.out.println(greeting);
	    
	    
	    Greet parseFrom = Greet.parseFrom(greeting.toByteArray());
	    
//
// 		byte[] arr = serialize(greeting);
// 		ByteBuffer bb = ByteBuffer.wrap(arr);
// 		Greet  parseFrom = Greet.parseFrom(bb);
 		
	    
		/*
		 * AddressBook parseFrom =
		 * AddressBookOuterClass.AddressBook.parseFrom(greeting.toByteArray());
		 * 
		 */
	    System.out.println(parseFrom);
	}

	static byte[] serialize(final Greet obj) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try (ObjectOutputStream out = new ObjectOutputStream(bos)) {
			out.writeObject(obj);
			out.flush();
			return bos.toByteArray();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
