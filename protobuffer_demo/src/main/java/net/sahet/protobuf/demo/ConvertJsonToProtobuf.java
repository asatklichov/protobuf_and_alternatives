package net.sahet.protobuf.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Struct;
import com.google.protobuf.util.JsonFormat;
import net.sahet.protobuf.messages.AddressBookOuterClass;

public class ConvertJsonToProtobuf {

	public static void main(String[] args) throws IOException {

		String jsonStr = new String(Files.readAllBytes(Paths.get("myproto.json")));
		System.out.println(jsonStr);

		System.out.println("\n---Convert JSON to Protobuf---");
		/**
		 * We can convert JSON to a protobuf message by using JsonFormat. JsonFormat is
		 * a utility class to convert protobuf messages to/from JSON format.
		 * JsonFormat’s parser() creates a Parser, which uses the merge() method to
		 * parse JSON to protobuf message.
		 */
		Message protobuf = convertFromJsonToProtobuf(jsonStr);
		System.out.println(protobuf);

		System.out.println("\n---Convert Protobuf to JSON---");
		String json = convertFromProtobufToJson(protobuf);
		System.out.println(json);

		System.out.println("\n compare both input-and-output Jsons");
		// false related to paddings
		System.out.println(jsonStr.equals(json));

		Path path = Paths.get("myproto2.json");
		byte[] strToBytes = json.getBytes();
		Files.write(path, strToBytes);

		System.out.println("Actually json objects only equl to itself");
		String jsonWrapped = new String(Files.readAllBytes(Paths.get("myproto_wrapped.json")));
		System.out.println(jsonWrapped.equals(json));
		System.out.println(json.equals(json));





		System.out.println("\n2 ---Convert Protobuf to JSON---");
		String email = "dsdj@sdsd.com";
		int id = new Random().nextInt();
		String name = "sdsd dfd ";
		String number = " 3434301688";


		AddressBookOuterClass.Company company = AddressBookOuterClass.Company.newBuilder().setId(id).setName(name).setEmail(email)
				.addNumbers(number).build();

		id = new Random().nextInt();

		AddressBookOuterClass.Company company2 = AddressBookOuterClass.Company.newBuilder().setId(id).setName("broadcom").setEmail("bro@broadcom.com")
				.addNumbers(number).build();

		AddressBookOuterClass.AddressBook addrBook = AddressBookOuterClass.AddressBook.newBuilder()
				.addCompany(company)
				.addCompany(company2)
				.setCompany(0, company2)
				.build();

		json = convertFromProtobufToJson(addrBook);
		System.out.println(json);


	}

	/**
	 * Parses from the proto3 JSON format into a protobuf message.
	 * 
	 * @param json
	 * @return
	 * @throws IOException
	 */
	public static Message convertFromJsonToProtobuf(String json) throws IOException {
		com.google.protobuf.Struct.Builder structBuilder = Struct.newBuilder();
		JsonFormat.parser().ignoringUnknownFields().merge(json, structBuilder);
		return structBuilder.build();
	}

	/**
	 * Converts a protobuf message to the proto3 JSON format. Throws exceptions if
	 * thereare unknown Any types in the message.
	 * 
	 * @param messageOrBuilder
	 * @return
	 * @throws IOException
	 */
	public static String convertFromProtobufToJson(MessageOrBuilder messageOrBuilder) throws IOException {
		return JsonFormat.printer().print(messageOrBuilder);
	}
	
	

}
