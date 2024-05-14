// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf3_samples.proto

// Protobuf Java Version: 3.25.2
package net.sahet.protobuf.sample.messages;

/**
 * Protobuf enum {@code mySearchNS.EnumNotAllowingAlias}
 */
public enum EnumNotAllowingAlias
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENAA_UNSPECIFIED = 0;</code>
   */
  ENAA_UNSPECIFIED(0),
  /**
   * <code>ENAA_STARTED = 1;</code>
   */
  ENAA_STARTED(1),
  /**
   * <pre>
   * ENAA_RUNNING = 1;  // Uncommenting this line will cause a warning message.
   * </pre>
   *
   * <code>ENAA_FINISHED = 2;</code>
   */
  ENAA_FINISHED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENAA_UNSPECIFIED = 0;</code>
   */
  public static final int ENAA_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ENAA_STARTED = 1;</code>
   */
  public static final int ENAA_STARTED_VALUE = 1;
  /**
   * <pre>
   * ENAA_RUNNING = 1;  // Uncommenting this line will cause a warning message.
   * </pre>
   *
   * <code>ENAA_FINISHED = 2;</code>
   */
  public static final int ENAA_FINISHED_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EnumNotAllowingAlias valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EnumNotAllowingAlias forNumber(int value) {
    switch (value) {
      case 0: return ENAA_UNSPECIFIED;
      case 1: return ENAA_STARTED;
      case 2: return ENAA_FINISHED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EnumNotAllowingAlias>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EnumNotAllowingAlias> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EnumNotAllowingAlias>() {
          public EnumNotAllowingAlias findValueByNumber(int number) {
            return EnumNotAllowingAlias.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return net.sahet.protobuf.sample.messages.Protobuf3Samples.getDescriptor().getEnumTypes().get(2);
  }

  private static final EnumNotAllowingAlias[] VALUES = values();

  public static EnumNotAllowingAlias valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EnumNotAllowingAlias(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:mySearchNS.EnumNotAllowingAlias)
}

