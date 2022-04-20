// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: searchingByLocation.proto

package grpc.newServices;

/**
 * Protobuf type {@code scanCityEntered}
 */
public  final class scanCityEntered extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scanCityEntered)
    scanCityEnteredOrBuilder {
private static final long serialVersionUID = 0L;
  // Use scanCityEntered.newBuilder() to construct.
  private scanCityEntered(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private scanCityEntered() {
    dataCityInfo_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private scanCityEntered(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dataCityInfo_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.newServices.searchingByLocationImpl.internal_static_scanCityEntered_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.newServices.searchingByLocationImpl.internal_static_scanCityEntered_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.newServices.scanCityEntered.class, grpc.newServices.scanCityEntered.Builder.class);
  }

  public static final int DATACITYINFO_FIELD_NUMBER = 3;
  private volatile java.lang.Object dataCityInfo_;
  /**
   * <code>string dataCityInfo = 3;</code>
   */
  public java.lang.String getDataCityInfo() {
    java.lang.Object ref = dataCityInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataCityInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string dataCityInfo = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDataCityInfoBytes() {
    java.lang.Object ref = dataCityInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataCityInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDataCityInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dataCityInfo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDataCityInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dataCityInfo_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.newServices.scanCityEntered)) {
      return super.equals(obj);
    }
    grpc.newServices.scanCityEntered other = (grpc.newServices.scanCityEntered) obj;

    boolean result = true;
    result = result && getDataCityInfo()
        .equals(other.getDataCityInfo());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATACITYINFO_FIELD_NUMBER;
    hash = (53 * hash) + getDataCityInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.newServices.scanCityEntered parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.newServices.scanCityEntered parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.newServices.scanCityEntered parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.newServices.scanCityEntered parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.newServices.scanCityEntered parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.newServices.scanCityEntered parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.newServices.scanCityEntered parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.newServices.scanCityEntered parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.newServices.scanCityEntered parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.newServices.scanCityEntered parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.newServices.scanCityEntered parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.newServices.scanCityEntered parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.newServices.scanCityEntered prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code scanCityEntered}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scanCityEntered)
      grpc.newServices.scanCityEnteredOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.newServices.searchingByLocationImpl.internal_static_scanCityEntered_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.newServices.searchingByLocationImpl.internal_static_scanCityEntered_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.newServices.scanCityEntered.class, grpc.newServices.scanCityEntered.Builder.class);
    }

    // Construct using grpc.newServices.scanCityEntered.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dataCityInfo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.newServices.searchingByLocationImpl.internal_static_scanCityEntered_descriptor;
    }

    @java.lang.Override
    public grpc.newServices.scanCityEntered getDefaultInstanceForType() {
      return grpc.newServices.scanCityEntered.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.newServices.scanCityEntered build() {
      grpc.newServices.scanCityEntered result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.newServices.scanCityEntered buildPartial() {
      grpc.newServices.scanCityEntered result = new grpc.newServices.scanCityEntered(this);
      result.dataCityInfo_ = dataCityInfo_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.newServices.scanCityEntered) {
        return mergeFrom((grpc.newServices.scanCityEntered)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.newServices.scanCityEntered other) {
      if (other == grpc.newServices.scanCityEntered.getDefaultInstance()) return this;
      if (!other.getDataCityInfo().isEmpty()) {
        dataCityInfo_ = other.dataCityInfo_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.newServices.scanCityEntered parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.newServices.scanCityEntered) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dataCityInfo_ = "";
    /**
     * <code>string dataCityInfo = 3;</code>
     */
    public java.lang.String getDataCityInfo() {
      java.lang.Object ref = dataCityInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataCityInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataCityInfo = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDataCityInfoBytes() {
      java.lang.Object ref = dataCityInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataCityInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataCityInfo = 3;</code>
     */
    public Builder setDataCityInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataCityInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dataCityInfo = 3;</code>
     */
    public Builder clearDataCityInfo() {
      
      dataCityInfo_ = getDefaultInstance().getDataCityInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string dataCityInfo = 3;</code>
     */
    public Builder setDataCityInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataCityInfo_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:scanCityEntered)
  }

  // @@protoc_insertion_point(class_scope:scanCityEntered)
  private static final grpc.newServices.scanCityEntered DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.newServices.scanCityEntered();
  }

  public static grpc.newServices.scanCityEntered getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<scanCityEntered>
      PARSER = new com.google.protobuf.AbstractParser<scanCityEntered>() {
    @java.lang.Override
    public scanCityEntered parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new scanCityEntered(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<scanCityEntered> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<scanCityEntered> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.newServices.scanCityEntered getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

