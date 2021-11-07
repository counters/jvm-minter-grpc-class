// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.JailEvent}
 */
public final class JailEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.JailEvent)
    JailEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JailEvent.newBuilder() to construct.
  private JailEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JailEvent() {
    validatorPubKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JailEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JailEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            validatorPubKey_ = s;
            break;
          }
          case 16: {

            jailedUntil_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return counters.minter.grpc.client.Events.internal_static_api_pb_JailEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Events.internal_static_api_pb_JailEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.JailEvent.class, counters.minter.grpc.client.JailEvent.Builder.class);
  }

  public static final int VALIDATOR_PUB_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object validatorPubKey_;
  /**
   * <code>string validator_pub_key = 1 [json_name = "validatorPubKey"];</code>
   * @return The validatorPubKey.
   */
  @java.lang.Override
  public java.lang.String getValidatorPubKey() {
    java.lang.Object ref = validatorPubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorPubKey_ = s;
      return s;
    }
  }
  /**
   * <code>string validator_pub_key = 1 [json_name = "validatorPubKey"];</code>
   * @return The bytes for validatorPubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValidatorPubKeyBytes() {
    java.lang.Object ref = validatorPubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorPubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JAILED_UNTIL_FIELD_NUMBER = 2;
  private long jailedUntil_;
  /**
   * <code>uint64 jailed_until = 2 [json_name = "jailedUntil"];</code>
   * @return The jailedUntil.
   */
  @java.lang.Override
  public long getJailedUntil() {
    return jailedUntil_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorPubKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, validatorPubKey_);
    }
    if (jailedUntil_ != 0L) {
      output.writeUInt64(2, jailedUntil_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorPubKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, validatorPubKey_);
    }
    if (jailedUntil_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, jailedUntil_);
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
    if (!(obj instanceof counters.minter.grpc.client.JailEvent)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.JailEvent other = (counters.minter.grpc.client.JailEvent) obj;

    if (!getValidatorPubKey()
        .equals(other.getValidatorPubKey())) return false;
    if (getJailedUntil()
        != other.getJailedUntil()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VALIDATOR_PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorPubKey().hashCode();
    hash = (37 * hash) + JAILED_UNTIL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJailedUntil());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.JailEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.JailEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.JailEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.JailEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.JailEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.JailEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.JailEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.JailEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.JailEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.JailEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.JailEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.JailEvent parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.JailEvent prototype) {
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
   * Protobuf type {@code api_pb.JailEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.JailEvent)
      counters.minter.grpc.client.JailEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Events.internal_static_api_pb_JailEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Events.internal_static_api_pb_JailEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.JailEvent.class, counters.minter.grpc.client.JailEvent.Builder.class);
    }

    // Construct using counters.minter.grpc.client.JailEvent.newBuilder()
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
      validatorPubKey_ = "";

      jailedUntil_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Events.internal_static_api_pb_JailEvent_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.JailEvent getDefaultInstanceForType() {
      return counters.minter.grpc.client.JailEvent.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.JailEvent build() {
      counters.minter.grpc.client.JailEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.JailEvent buildPartial() {
      counters.minter.grpc.client.JailEvent result = new counters.minter.grpc.client.JailEvent(this);
      result.validatorPubKey_ = validatorPubKey_;
      result.jailedUntil_ = jailedUntil_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof counters.minter.grpc.client.JailEvent) {
        return mergeFrom((counters.minter.grpc.client.JailEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.JailEvent other) {
      if (other == counters.minter.grpc.client.JailEvent.getDefaultInstance()) return this;
      if (!other.getValidatorPubKey().isEmpty()) {
        validatorPubKey_ = other.validatorPubKey_;
        onChanged();
      }
      if (other.getJailedUntil() != 0L) {
        setJailedUntil(other.getJailedUntil());
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
      counters.minter.grpc.client.JailEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.JailEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object validatorPubKey_ = "";
    /**
     * <code>string validator_pub_key = 1 [json_name = "validatorPubKey"];</code>
     * @return The validatorPubKey.
     */
    public java.lang.String getValidatorPubKey() {
      java.lang.Object ref = validatorPubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorPubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string validator_pub_key = 1 [json_name = "validatorPubKey"];</code>
     * @return The bytes for validatorPubKey.
     */
    public com.google.protobuf.ByteString
        getValidatorPubKeyBytes() {
      java.lang.Object ref = validatorPubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorPubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string validator_pub_key = 1 [json_name = "validatorPubKey"];</code>
     * @param value The validatorPubKey to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorPubKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      validatorPubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string validator_pub_key = 1 [json_name = "validatorPubKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorPubKey() {
      
      validatorPubKey_ = getDefaultInstance().getValidatorPubKey();
      onChanged();
      return this;
    }
    /**
     * <code>string validator_pub_key = 1 [json_name = "validatorPubKey"];</code>
     * @param value The bytes for validatorPubKey to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorPubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      validatorPubKey_ = value;
      onChanged();
      return this;
    }

    private long jailedUntil_ ;
    /**
     * <code>uint64 jailed_until = 2 [json_name = "jailedUntil"];</code>
     * @return The jailedUntil.
     */
    @java.lang.Override
    public long getJailedUntil() {
      return jailedUntil_;
    }
    /**
     * <code>uint64 jailed_until = 2 [json_name = "jailedUntil"];</code>
     * @param value The jailedUntil to set.
     * @return This builder for chaining.
     */
    public Builder setJailedUntil(long value) {
      
      jailedUntil_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 jailed_until = 2 [json_name = "jailedUntil"];</code>
     * @return This builder for chaining.
     */
    public Builder clearJailedUntil() {
      
      jailedUntil_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api_pb.JailEvent)
  }

  // @@protoc_insertion_point(class_scope:api_pb.JailEvent)
  private static final counters.minter.grpc.client.JailEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.JailEvent();
  }

  public static counters.minter.grpc.client.JailEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JailEvent>
      PARSER = new com.google.protobuf.AbstractParser<JailEvent>() {
    @java.lang.Override
    public JailEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JailEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JailEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JailEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.JailEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
