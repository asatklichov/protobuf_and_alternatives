package com.baeldung.protobuf;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.baeldung.protobuf.BaeldungTraining.Course;
import com.googlecode.protobuf.format.JsonFormat;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class ApplicationIntegrationTest {

	@Autowired
	private RestTemplate restTemplate;

	@LocalServerPort
	private int port;

	/**
	 * Testing With RestTemplate Here is how we create a client, send a GET request
	 * to the designated destination, receive the response in the form of protocol
	 * buffer messages and verify it using the RestTemplate API:
	 */
	@Test
	public void whenUsingRestTemplate_thenSucceed() {
		ResponseEntity<Course> course = restTemplate.getForEntity(getUrl(), Course.class);
		assertResponse(course.toString());
	}

	/**
	 * Testing With HttpClient The first step to use the HttpClient API and manually
	 * convert protocol buffer messages is adding the following two dependencies to
	 * the Maven POM file:
	 * 
	 * @throws IOException
	 */
	@Test
	public void whenUsingHttpClient_thenSucceed() throws IOException {
		InputStream responseStream = executeHttpRequest(getUrl());
		String jsonOutput = convertProtobufMessageStreamToJsonString(responseStream);
		assertResponse(jsonOutput);
	}

	private InputStream executeHttpRequest(String url) throws IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet request = new HttpGet(url);
		HttpResponse httpResponse = httpClient.execute(request);
		return httpResponse.getEntity().getContent();
	}

	private String convertProtobufMessageStreamToJsonString(InputStream protobufStream) throws IOException {
		JsonFormat jsonFormat = new JsonFormat();
		Course course = Course.parseFrom(protobufStream);
		return jsonFormat.printToString(course);
	}

	private void assertResponse(String response) {
		assertThat(response, containsString("id"));
		assertThat(response, containsString("course_name"));
		assertThat(response, containsString("REST with Spring"));
		assertThat(response, containsString("student"));
		assertThat(response, containsString("first_name"));
		assertThat(response, containsString("last_name"));
		assertThat(response, containsString("email"));
		assertThat(response, containsString("john.doe@baeldung.com"));
		assertThat(response, containsString("richard.roe@baeldung.com"));
		assertThat(response, containsString("jane.doe@baeldung.com"));
		assertThat(response, containsString("phone"));
		assertThat(response, containsString("number"));
		assertThat(response, containsString("type"));
	}

	private String getUrl() {
		return "http://localhost:" + port + "/courses/1";
	}
}