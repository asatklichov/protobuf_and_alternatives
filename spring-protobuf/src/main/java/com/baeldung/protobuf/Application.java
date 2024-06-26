package com.baeldung.protobuf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.baeldung.protobuf.BaeldungTraining.Course;
import com.baeldung.protobuf.BaeldungTraining.Student;
import com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber;
import com.baeldung.protobuf.BaeldungTraining.Student.PhoneType;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/converter/protobuf/ProtobufHttpMessageConverter.html
	 * 
	 * Protocol buffers are Google's language-neutral, platform-neutral, extensible
	 * mechanism for serializing structured data – think XML, but smaller, faster,
	 * and simpler.
	 * 
	 * org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter.
	 * This type is an HttpMessageConverter. HttpMessageConverters encode and decode
	 * the requests and responses in REST service calls. They're usually activated
	 * after some sort of content negotiation has occurred: if the client specifies
	 * 
	 * 
	 * Accept: application/x-protobuf, for example, then our REST service will send
	 * back the Protocol Buffer-encoded response.\
	 * 
	 * 
	 * https://www.baeldung.com/spring-rest-api-with-protocol-buffers
	 * 
	 * 
	 * @param hmc
	 * @return
	 */
	@Bean
	RestTemplate restTemplate(ProtobufHttpMessageConverter hmc) {
		return new RestTemplate(Arrays.asList(hmc));
	}

	@Bean
	ProtobufHttpMessageConverter protobufHttpMessageConverter() {
		return new ProtobufHttpMessageConverter();
	}

	@Bean
	public CourseRepository createTestCourses() {
		Map<Integer, Course> courses = new HashMap<>();

		Course course1 = Course.newBuilder().setId(1).setCourseName("REST with Spring")
				.addAllStudent(createTestStudents()).build();

		Course course2 = Course.newBuilder().setId(2).setCourseName("Learn Spring Security")
				.addAllStudent(new ArrayList<>()).build();

		PhoneNumber phone1 = createPhone("2332133", PhoneType.LANDLINE);
		Student student1 = createStudent(1, "Adam", "Ogly", "adam.ogly@sahet.net", Arrays.asList(phone1));

		Course course3 = Course.newBuilder().setId(3).setCourseName("Learn genAi and Protobuf")
				.addAllStudent(Arrays.asList(student1)).build();

		courses.put(course1.getId(), course1);
		courses.put(course2.getId(), course2);
		courses.put(course3.getId(), course3);

		return new CourseRepository(courses);
	}

	private List<Student> createTestStudents() {
		PhoneNumber phone1 = createPhone("123456", PhoneType.MOBILE);
		Student student1 = createStudent(1, "John", "Doe", "john.doe@baeldung.com", Arrays.asList(phone1));

		PhoneNumber phone2 = createPhone("234567", PhoneType.LANDLINE);
		Student student2 = createStudent(2, "Richard", "Roe", "richard.roe@baeldung.com", Arrays.asList(phone2));

		PhoneNumber phone3_1 = createPhone("345678", PhoneType.MOBILE);
		PhoneNumber phone3_2 = createPhone("456789", PhoneType.LANDLINE);
		Student student3 = createStudent(3, "Jane", "Doe", "jane.doe@baeldung.com", Arrays.asList(phone3_1, phone3_2));

		return Arrays.asList(student1, student2, student3);
	}

	private Student createStudent(int id, String firstName, String lastName, String email, List<PhoneNumber> phones) {
		return Student.newBuilder().setId(id).setFirstName(firstName).setLastName(lastName).setEmail(email)
				.addAllPhone(phones).build();
	}

	private PhoneNumber createPhone(String number, PhoneType type) {
		return PhoneNumber.newBuilder().setNumber(number).setType(type).build();
	}
}