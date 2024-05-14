package net.sahet.protobuf.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import net.sahet.protobuf.messages.Course;
import net.sahet.protobuf.messages.Student;
import net.sahet.protobuf.messages.Student.PhoneNumber;
import net.sahet.protobuf.messages.Student.PhoneType;

public class SchoolDemo { // write a message demo
	final static String FILE_PATH = "school_book";

	public static void main(String[] args) throws IOException {

		Map<Integer, Course> courses = new HashMap<>();

		Course course1 = Course.newBuilder().setId(1).setCourseName("REST with Spring")
				.addAllStudent(createTestStudents()).build();

		courses.put(course1.getId(), course1);

		System.out.println("------- serialize -----\n");
		//write to the disk
		try (FileOutputStream fos = new FileOutputStream(FILE_PATH)) {
			// serialize - write the new address book back to disk.
			course1.writeTo(fos);
			if (Files.exists(Paths.get(FILE_PATH))) {
				// if (Files.deleteIfExists(Paths.get(filePath))) {
				System.out.println("wrote to the disk: "+Paths.get(FILE_PATH));
				System.out.println("done\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}



		System.out.println("------- add more -----\n");
		//add new courses
		Student s = createStudent(11, "John", "Doe", "john.doe@baeldung.com", Arrays.asList(PhoneNumber.newBuilder().setNumber("3232323").setType(PhoneType.LANDLINE).build()));
		List<Student> sList = new ArrayList<>();
		sList.add(s);
		Course course2 = Course.newBuilder().setId(2).setCourseName("Learn Spring Security")
				.addAllStudent(sList).build();

		PhoneNumber phone1 = createPhone("2332133", PhoneType.LANDLINE);
		Student student1 = createStudent(12, "Adam", "Ogly", "adam.ogly@sahet.net", Arrays.asList(phone1));

		Course course3 = Course.newBuilder().setId(13).setCourseName("Learn genAi and Protobuf")
				.addAllStudent(Arrays.asList(student1)).build();

		courses.put(course2.getId(), course2);
		courses.put(course3.getId(), course3);
		System.out.println(courses);




		System.out.println("------- deserialize -----\n");

		// Read the existing school book.
		try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
			//merge from disk
			Course courz = Course.newBuilder().mergeFrom(fis)
					.build();
			System.out.println(courz);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static List<Student> createTestStudents() {
		PhoneNumber phone1 = createPhone("123456", PhoneType.MOBILE);
		Student student1 = createStudent(1, "John", "Doe", "john.doe@baeldung.com", Arrays.asList(phone1));

		PhoneNumber phone2 = createPhone("234567", PhoneType.LANDLINE);
		Student student2 = createStudent(2, "Richard", "Roe", "richard.roe@baeldung.com", Arrays.asList(phone2));

		PhoneNumber phone3_1 = createPhone("345678", PhoneType.MOBILE);
		PhoneNumber phone3_2 = createPhone("456789", PhoneType.LANDLINE);
		Student student3 = createStudent(3, "Jane", "Doe", "jane.doe@baeldung.com", Arrays.asList(phone3_1, phone3_2));

		return Arrays.asList(student1, student2, student3);
	}

	private static Student createStudent(int id, String firstName, String lastName, String email,
			List<PhoneNumber> phones) {
		return Student.newBuilder().setId(id).setFirstName(firstName).setLastName(lastName).setEmail(email)
				.addAllPhone(phones).build();
	}

	private static PhoneNumber createPhone(String number, PhoneType type) {
		return PhoneNumber.newBuilder().setNumber(number).setType(type).build();
	}

}
