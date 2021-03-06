// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.SlashEvent}
 */
public final class SlashEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.SlashEvent)
    SlashEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SlashEvent.newBuilder() to construct.
  private SlashEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SlashEvent() {
    address_ = "";
    amount_ = "";
    validatorPubKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SlashEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SlashEvent(
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

            address_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            amount_ = s;
            break;
          }
          case 24: {

            coin_ = input.readUInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            validatorPubKey_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return counters.minter.grpc.client.Events.internal_static_api_pb_SlashEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Events.internal_static_api_pb_SlashEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.SlashEvent.class, counters.minter.grpc.client.SlashEvent.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object address_;
  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private volatile java.lang.Object amount_;
  /**
   * <code>string amount = 2;</code>
   * @return The amount.
   */
  @java.lang.Override
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <code>string amount = 2;</code>
   * @return The bytes for amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COIN_FIELD_NUMBER = 3;
  private long coin_;
  /**
   * <code>uint64 coin = 3;</code>
   * @return The coin.
   */
  @java.lang.Override
  public long getCoin() {
    return coin_;
  }

  public static final int VALIDATOR_PUB_KEY_FIELD_NUMBER = 4;
  private volatile java.lang.Object validatorPubKey_;
  /**
   * <code>string validator_pub_key = 4;</code>
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
   * <code>string validator_pub_key = 4;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, amount_);
    }
    if (coin_ != 0L) {
      output.writeUInt64(3, coin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorPubKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, validatorPubKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, amount_);
    }
    if (coin_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, coin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorPubKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, validatorPubKey_);
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
    if (!(obj instanceof counters.minter.grpc.client.SlashEvent)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.SlashEvent other = (counters.minter.grpc.client.SlashEvent) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (getCoin()
        != other.getCoin()) return false;
    if (!getValidatorPubKey()
        .equals(other.getValidatorPubKey())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + COIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCoin());
    hash = (37 * hash) + VALIDATOR_PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorPubKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.SlashEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.SlashEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.SlashEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.SlashEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.SlashEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.SlashEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.SlashEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.SlashEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.SlashEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.SlashEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.SlashEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.SlashEvent parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.SlashEvent prototype) {
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
   * Protobuf type {@code api_pb.SlashEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.SlashEvent)
      counters.minter.grpc.client.SlashEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Events.internal_static_api_pb_SlashEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Events.internal_static_api_pb_SlashEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.SlashEvent.class, counters.minter.grpc.client.SlashEvent.Builder.class);
    }

    // Construct using counters.minter.grpc.client.SlashEvent.newBuilder()
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
      address_ = "";

      amount_ = "";

      coin_ = 0L;

      validatorPubKey_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Events.internal_static_api_pb_SlashEvent_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.SlashEvent getDefaultInstanceForType() {
      return counters.minter.grpc.client.SlashEvent.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.SlashEvent build() {
      counters.minter.grpc.client.SlashEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.SlashEvent buildPartial() {
      counters.minter.grpc.client.SlashEvent result = new counters.minter.grpc.client.SlashEvent(this);
      result.address_ = address_;
      result.amount_ = amount_;
      result.coin_ = coin_;
      result.validatorPubKey_ = validatorPubKey_;
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
      if (other instanceof counters.minter.grpc.client.SlashEvent) {
        return mergeFrom((counters.minter.grpc.client.SlashEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.SlashEvent other) {
      if (other == counters.minter.grpc.client.SlashEvent.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        onChanged();
      }
      if (other.getCoin() != 0L) {
        setCoin(other.getCoin());
      }
      if (!other.getValidatorPubKey().isEmpty()) {
        validatorPubKey_ = other.validatorPubKey_;
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
      counters.minter.grpc.client.SlashEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.SlashEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1;</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      address_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>string amount = 2;</code>
     * @return The amount.
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amount = 2;</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amount = 2;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 2;</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      amount_ = value;
      onChanged();
      return this;
    }

    private long coin_ ;
    /**
     * <code>uint64 coin = 3;</code>
     * @return The coin.
     */
    @java.lang.Override
    public long getCoin() {
      return coin_;
    }
    /**
     * <code>uint64 coin = 3;</code>
     * @param value The coin to set.
     * @return This builder for chaining.
     */
    public Builder setCoin(long value) {
      
      coin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 coin = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoin() {
      
      coin_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object validatorPubKey_ = "";
    /**
     * <code>string validator_pub_key = 4;</code>
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
     * <code>string validator_pub_key = 4;</code>
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
     * <code>string validator_pub_key = 4;</code>
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
     * <code>string validator_pub_key = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorPubKey() {
      
      validatorPubKey_ = getDefaultInstance().getValidatorPubKey();
      onChanged();
      return this;
    }
    /**
     * <code>string validator_pub_key = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:api_pb.SlashEvent)
  }

  // @@protoc_insertion_point(class_scope:api_pb.SlashEvent)
  private static final counters.minter.grpc.client.SlashEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.SlashEvent();
  }

  public static counters.minter.grpc.client.SlashEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SlashEvent>
      PARSER = new com.google.protobuf.AbstractParser<SlashEvent>() {
    @java.lang.Override
    public SlashEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SlashEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SlashEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SlashEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.SlashEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

