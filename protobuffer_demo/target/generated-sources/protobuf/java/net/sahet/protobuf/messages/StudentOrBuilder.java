// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: school.proto

// Protobuf Java Version: 3.25.2
package net.sahet.protobuf.messages;

public interface StudentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:myProtobufNS.Student)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string first_name = 2;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 2;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 3;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 3;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string email = 4;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 4;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated .myProtobufNS.Student.PhoneNumber phone = 5;</code>
   */
  java.util.List<net.sahet.protobuf.messages.Student.PhoneNumber> 
      getPhoneList();
  /**
   * <code>repeated .myProtobufNS.Student.PhoneNumber phone = 5;</code>
   */
  net.sahet.protobuf.messages.Student.PhoneNumber getPhone(int index);
  /**
   * <code>repeated .myProtobufNS.Student.PhoneNumber phone = 5;</code>
   */
  int getPhoneCount();
  /**
   * <code>repeated .myProtobufNS.Student.PhoneNumber phone = 5;</code>
   */
  java.util.List<? extends net.sahet.protobuf.messages.Student.PhoneNumberOrBuilder> 
      getPhoneOrBuilderList();
  /**
   * <code>repeated .myProtobufNS.Student.PhoneNumber phone = 5;</code>
   */
  net.sahet.protobuf.messages.Student.PhoneNumberOrBuilder getPhoneOrBuilder(
      int index);
}