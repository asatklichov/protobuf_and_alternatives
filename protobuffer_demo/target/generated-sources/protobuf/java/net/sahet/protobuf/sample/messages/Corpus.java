// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf3_samples.proto

// Protobuf Java Version: 3.25.2
package net.sahet.protobuf.sample.messages;

/**
 * Protobuf enum {@code mySearchNS.Corpus}
 */
public enum Corpus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CORPUS_UNSPECIFIED = 0;</code>
   */
  CORPUS_UNSPECIFIED(0),
  /**
   * <code>CORPUS_UNIVERSAL = 1;</code>
   */
  CORPUS_UNIVERSAL(1),
  /**
   * <code>CORPUS_WEB = 2;</code>
   */
  CORPUS_WEB(2),
  /**
   * <code>CORPUS_IMAGES = 3;</code>
   */
  CORPUS_IMAGES(3),
  /**
   * <code>CORPUS_LOCAL = 4;</code>
   */
  CORPUS_LOCAL(4),
  /**
   * <code>CORPUS_NEWS = 5;</code>
   */
  CORPUS_NEWS(5),
  /**
   * <code>CORPUS_PRODUCTS = 6;</code>
   */
  CORPUS_PRODUCTS(6),
  /**
   * <code>CORPUS_VIDEO = 7;</code>
   */
  CORPUS_VIDEO(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CORPUS_UNSPECIFIED = 0;</code>
   */
  public static final int CORPUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>CORPUS_UNIVERSAL = 1;</code>
   */
  public static final int CORPUS_UNIVERSAL_VALUE = 1;
  /**
   * <code>CORPUS_WEB = 2;</code>
   */
  public static final int CORPUS_WEB_VALUE = 2;
  /**
   * <code>CORPUS_IMAGES = 3;</code>
   */
  public static final int CORPUS_IMAGES_VALUE = 3;
  /**
   * <code>CORPUS_LOCAL = 4;</code>
   */
  public static final int CORPUS_LOCAL_VALUE = 4;
  /**
   * <code>CORPUS_NEWS = 5;</code>
   */
  public static final int CORPUS_NEWS_VALUE = 5;
  /**
   * <code>CORPUS_PRODUCTS = 6;</code>
   */
  public static final int CORPUS_PRODUCTS_VALUE = 6;
  /**
   * <code>CORPUS_VIDEO = 7;</code>
   */
  public static final int CORPUS_VIDEO_VALUE = 7;


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
  public static Corpus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Corpus forNumber(int value) {
    switch (value) {
      case 0: return CORPUS_UNSPECIFIED;
      case 1: return CORPUS_UNIVERSAL;
      case 2: return CORPUS_WEB;
      case 3: return CORPUS_IMAGES;
      case 4: return CORPUS_LOCAL;
      case 5: return CORPUS_NEWS;
      case 6: return CORPUS_PRODUCTS;
      case 7: return CORPUS_VIDEO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Corpus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Corpus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Corpus>() {
          public Corpus findValueByNumber(int number) {
            return Corpus.forNumber(number);
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
    return net.sahet.protobuf.sample.messages.Protobuf3Samples.getDescriptor().getEnumTypes().get(0);
  }

  private static final Corpus[] VALUES = values();

  public static Corpus valueOf(
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

  private Corpus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:mySearchNS.Corpus)
}
