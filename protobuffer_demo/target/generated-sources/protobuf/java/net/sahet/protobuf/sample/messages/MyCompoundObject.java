// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: other_types.proto

// Protobuf Java Version: 3.25.2
package net.sahet.protobuf.sample.messages;

public final class MyCompoundObject {
  private MyCompoundObject() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myCompundNS_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myCompundNS_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myCompundNS_Person_Title_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myCompundNS_Person_Title_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myCompundNS_Animal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myCompundNS_Animal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myCompundNS_Audience_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myCompundNS_Audience_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myCompundNS_MyErrorStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myCompundNS_MyErrorStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myCompundNS_MyErrorStatus_ErrorsDetailsByIdEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myCompundNS_MyErrorStatus_ErrorsDetailsByIdEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myCompundNS_MapFieldEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myCompundNS_MapFieldEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021other_types.proto\022\013myCompundNS\032\031google" +
      "/protobuf/any.proto\"\332\001\n\006Person\022\014\n\004name\030\001" +
      " \001(\t\022\n\n\002id\030\002 \001(\005\022\r\n\005email\030\003 \001(\t\022\014\n\004male\030" +
      "\004 \001(\010\022)\n\006titles\030\005 \003(\0132\031.myCompundNS.Pers" +
      "on.Title\032H\n\005Title\022\022\n\ntitle_name\030\001 \001(\t\022+\n" +
      "\004type\030\002 \001(\0162\035.myCompundNS.Person.TitleTy" +
      "pe\"$\n\tTitleType\022\006\n\002BC\020\000\022\006\n\002MG\020\001\022\007\n\003PhD\020\002" +
      "\"\277\001\n\006Animal\022\014\n\004name\030\001 \001(\t\022,\n\004type\030\003 \003(\0162" +
      "\036.myCompundNS.Animal.AnimalType\"I\n\nAnima" +
      "lType\022\007\n\003CAT\020\000\022\007\n\003DOG\020\001\022\010\n\004FISH\020\002\022\023\n\017TOR" +
      "TOISE_TURTLE\020\003\022\n\n\006RABBIT\020\004\".\n\010FileType\022\n" +
      "\n\006PROGID\020\000\022\n\n\006TERMID\020\001\022\n\n\006TRANID\020\002\"U\n\010Au" +
      "dience\022#\n\006people\030\001 \003(\0132\023.myCompundNS.Per" +
      "son\022$\n\007animals\030\002 \003(\0132\023.myCompundNS.Anima" +
      "l\"\255\002\n\rMyErrorStatus\022\017\n\007message\030\001 \001(\t\022%\n\007" +
      "details\030\002 \003(\0132\024.google.protobuf.Any\022L\n\021e" +
      "rrorsDetailsById\030\003 \003(\01321.myCompundNS.MyE" +
      "rrorStatus.ErrorsDetailsByIdEntry\0226\n\022err" +
      "orsDetailsById2\030\004 \003(\0132\032.myCompundNS.MapF" +
      "ieldEntry\022\021\n\tbytesData\030\005 \001(\014\022\021\n\tbytesLis" +
      "t\030\006 \003(\014\0328\n\026ErrorsDetailsByIdEntry\022\013\n\003key" +
      "\030\001 \001(\005\022\r\n\005value\030\002 \001(\t:\0028\001\"+\n\rMapFieldEnt" +
      "ry\022\013\n\003key\030\001 \001(\005\022\r\n\005value\030\002 \001(\tB8\n\"net.sa" +
      "het.protobuf.sample.messagesB\020MyCompound" +
      "ObjectP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_myCompundNS_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_myCompundNS_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myCompundNS_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Male", "Titles", });
    internal_static_myCompundNS_Person_Title_descriptor =
      internal_static_myCompundNS_Person_descriptor.getNestedTypes().get(0);
    internal_static_myCompundNS_Person_Title_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myCompundNS_Person_Title_descriptor,
        new java.lang.String[] { "TitleName", "Type", });
    internal_static_myCompundNS_Animal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_myCompundNS_Animal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myCompundNS_Animal_descriptor,
        new java.lang.String[] { "Name", "Type", });
    internal_static_myCompundNS_Audience_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_myCompundNS_Audience_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myCompundNS_Audience_descriptor,
        new java.lang.String[] { "People", "Animals", });
    internal_static_myCompundNS_MyErrorStatus_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_myCompundNS_MyErrorStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myCompundNS_MyErrorStatus_descriptor,
        new java.lang.String[] { "Message", "Details", "ErrorsDetailsById", "ErrorsDetailsById2", "BytesData", "BytesList", });
    internal_static_myCompundNS_MyErrorStatus_ErrorsDetailsByIdEntry_descriptor =
      internal_static_myCompundNS_MyErrorStatus_descriptor.getNestedTypes().get(0);
    internal_static_myCompundNS_MyErrorStatus_ErrorsDetailsByIdEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myCompundNS_MyErrorStatus_ErrorsDetailsByIdEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_myCompundNS_MapFieldEntry_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_myCompundNS_MapFieldEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myCompundNS_MapFieldEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}