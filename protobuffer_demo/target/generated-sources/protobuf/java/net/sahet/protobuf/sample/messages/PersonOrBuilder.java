// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: other_types.proto

// Protobuf Java Version: 3.25.2
package net.sahet.protobuf.sample.messages;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:myCompundNS.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *
   *The " = 1", " = 2" markers on each element identify the unique “tag” that field uses in the binary encoding.
   *Tag numbers 1-15 require one less byte to encode than higher numbers, so as an optimization you can decide to
   *use those tags for the commonly used or repeated elements, leaving tags 16 and higher for less-commonly used
   *optional elements. Each element in a repeated field requires re-encoding the tag number,
   *so repeated fields are particularly good candidates for this optimization.
   *
   *You must give each field in your message definition a number
   *between 1 and 536,870,911 with the following restrictions:
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   *
   *The " = 1", " = 2" markers on each element identify the unique “tag” that field uses in the binary encoding.
   *Tag numbers 1-15 require one less byte to encode than higher numbers, so as an optimization you can decide to
   *use those tags for the commonly used or repeated elements, leaving tags 16 and higher for less-commonly used
   *optional elements. Each element in a repeated field requires re-encoding the tag number,
   *so repeated fields are particularly good candidates for this optimization.
   *
   *You must give each field in your message definition a number
   *between 1 and 536,870,911 with the following restrictions:
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 id = 2;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string email = 3;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 3;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>bool male = 4;</code>
   * @return The male.
   */
  boolean getMale();

  /**
   * <code>repeated .myCompundNS.Person.Title titles = 5;</code>
   */
  java.util.List<net.sahet.protobuf.sample.messages.Person.Title> 
      getTitlesList();
  /**
   * <code>repeated .myCompundNS.Person.Title titles = 5;</code>
   */
  net.sahet.protobuf.sample.messages.Person.Title getTitles(int index);
  /**
   * <code>repeated .myCompundNS.Person.Title titles = 5;</code>
   */
  int getTitlesCount();
  /**
   * <code>repeated .myCompundNS.Person.Title titles = 5;</code>
   */
  java.util.List<? extends net.sahet.protobuf.sample.messages.Person.TitleOrBuilder> 
      getTitlesOrBuilderList();
  /**
   * <code>repeated .myCompundNS.Person.Title titles = 5;</code>
   */
  net.sahet.protobuf.sample.messages.Person.TitleOrBuilder getTitlesOrBuilder(
      int index);
}