// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: school.proto

// Protobuf Java Version: 3.25.2
package net.sahet.protobuf.messages;

public interface CourseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:myProtobufNS.Course)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string course_name = 2;</code>
   * @return The courseName.
   */
  java.lang.String getCourseName();
  /**
   * <code>string course_name = 2;</code>
   * @return The bytes for courseName.
   */
  com.google.protobuf.ByteString
      getCourseNameBytes();

  /**
   * <code>repeated .myProtobufNS.Student student = 3;</code>
   */
  java.util.List<net.sahet.protobuf.messages.Student> 
      getStudentList();
  /**
   * <code>repeated .myProtobufNS.Student student = 3;</code>
   */
  net.sahet.protobuf.messages.Student getStudent(int index);
  /**
   * <code>repeated .myProtobufNS.Student student = 3;</code>
   */
  int getStudentCount();
  /**
   * <code>repeated .myProtobufNS.Student student = 3;</code>
   */
  java.util.List<? extends net.sahet.protobuf.messages.StudentOrBuilder> 
      getStudentOrBuilderList();
  /**
   * <code>repeated .myProtobufNS.Student student = 3;</code>
   */
  net.sahet.protobuf.messages.StudentOrBuilder getStudentOrBuilder(
      int index);
}
