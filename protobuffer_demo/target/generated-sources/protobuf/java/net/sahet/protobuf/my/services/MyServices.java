// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: my_services.proto

// Protobuf Java Version: 3.25.2
package net.sahet.protobuf.my.services;

public final class MyServices {
  private MyServices() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myServicesNS_RequestObj_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myServicesNS_RequestObj_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myServicesNS_ResponseObj_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myServicesNS_ResponseObj_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myServicesNS_SomeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myServicesNS_SomeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myServicesNS_SomeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myServicesNS_SomeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myServicesNS_SecondRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myServicesNS_SecondRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myServicesNS_SecondResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myServicesNS_SecondResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021my_services.proto\022\014myServicesNS\"\035\n\nReq" +
      "uestObj\022\017\n\007message\030\001 \001(\t\"\036\n\013ResponseObj\022" +
      "\017\n\007respond\030\001 \001(\t\"\r\n\013SomeRequest\"\016\n\014SomeR" +
      "esponse\"\017\n\rSecondRequest\"\020\n\016SecondRespon" +
      "se2Q\n\nFooService\022C\n\014GetSomething\022\030.mySer" +
      "vicesNS.RequestObj\032\031.myServicesNS.Respon" +
      "seObj2\243\001\n\013AnInterface\022E\n\nsomeMethod\022\031.my" +
      "ServicesNS.SomeRequest\032\032.myServicesNS.So" +
      "meResponse\"\000\022M\n\014secondMethod\022\033.myService" +
      "sNS.SecondRequest\032\034.myServicesNS.SecondR" +
      "esponse\"\0000\001B%\n\036net.sahet.protobuf.my.ser" +
      "vicesP\001\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_myServicesNS_RequestObj_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_myServicesNS_RequestObj_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myServicesNS_RequestObj_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_myServicesNS_ResponseObj_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_myServicesNS_ResponseObj_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myServicesNS_ResponseObj_descriptor,
        new java.lang.String[] { "Respond", });
    internal_static_myServicesNS_SomeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_myServicesNS_SomeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myServicesNS_SomeRequest_descriptor,
        new java.lang.String[] { });
    internal_static_myServicesNS_SomeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_myServicesNS_SomeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myServicesNS_SomeResponse_descriptor,
        new java.lang.String[] { });
    internal_static_myServicesNS_SecondRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_myServicesNS_SecondRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myServicesNS_SecondRequest_descriptor,
        new java.lang.String[] { });
    internal_static_myServicesNS_SecondResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_myServicesNS_SecondResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myServicesNS_SecondResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
