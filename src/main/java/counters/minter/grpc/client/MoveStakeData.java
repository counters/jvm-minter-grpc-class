// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.MoveStakeData}
 */
public final class MoveStakeData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.MoveStakeData)
    MoveStakeDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MoveStakeData.newBuilder() to construct.
  private MoveStakeData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MoveStakeData() {
    fromPubKey_ = "";
    toPubKey_ = "";
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MoveStakeData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MoveStakeData(
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

            fromPubKey_ = s;
            break;
          }
          case 18: {
            counters.minter.grpc.client.Coin.Builder subBuilder = null;
            if (coin_ != null) {
              subBuilder = coin_.toBuilder();
            }
            coin_ = input.readMessage(counters.minter.grpc.client.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coin_);
              coin_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            value_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            toPubKey_ = s;
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
    return counters.minter.grpc.client.Data.internal_static_api_pb_MoveStakeData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_MoveStakeData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.MoveStakeData.class, counters.minter.grpc.client.MoveStakeData.Builder.class);
  }

  public static final int FROM_PUB_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object fromPubKey_;
  /**
   * <code>string from_pub_key = 1;</code>
   * @return The fromPubKey.
   */
  @java.lang.Override
  public java.lang.String getFromPubKey() {
    java.lang.Object ref = fromPubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromPubKey_ = s;
      return s;
    }
  }
  /**
   * <code>string from_pub_key = 1;</code>
   * @return The bytes for fromPubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromPubKeyBytes() {
    java.lang.Object ref = fromPubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromPubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_PUB_KEY_FIELD_NUMBER = 4;
  private volatile java.lang.Object toPubKey_;
  /**
   * <code>string to_pub_key = 4;</code>
   * @return The toPubKey.
   */
  @java.lang.Override
  public java.lang.String getToPubKey() {
    java.lang.Object ref = toPubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toPubKey_ = s;
      return s;
    }
  }
  /**
   * <code>string to_pub_key = 4;</code>
   * @return The bytes for toPubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToPubKeyBytes() {
    java.lang.Object ref = toPubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toPubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COIN_FIELD_NUMBER = 2;
  private counters.minter.grpc.client.Coin coin_;
  /**
   * <code>.api_pb.Coin coin = 2;</code>
   * @return Whether the coin field is set.
   */
  @java.lang.Override
  public boolean hasCoin() {
    return coin_ != null;
  }
  /**
   * <code>.api_pb.Coin coin = 2;</code>
   * @return The coin.
   */
  @java.lang.Override
  public counters.minter.grpc.client.Coin getCoin() {
    return coin_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coin_;
  }
  /**
   * <code>.api_pb.Coin coin = 2;</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.CoinOrBuilder getCoinOrBuilder() {
    return getCoin();
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private volatile java.lang.Object value_;
  /**
   * <code>string value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 3;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromPubKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fromPubKey_);
    }
    if (coin_ != null) {
      output.writeMessage(2, getCoin());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toPubKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, toPubKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromPubKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fromPubKey_);
    }
    if (coin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCoin());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toPubKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, toPubKey_);
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
    if (!(obj instanceof counters.minter.grpc.client.MoveStakeData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.MoveStakeData other = (counters.minter.grpc.client.MoveStakeData) obj;

    if (!getFromPubKey()
        .equals(other.getFromPubKey())) return false;
    if (!getToPubKey()
        .equals(other.getToPubKey())) return false;
    if (hasCoin() != other.hasCoin()) return false;
    if (hasCoin()) {
      if (!getCoin()
          .equals(other.getCoin())) return false;
    }
    if (!getValue()
        .equals(other.getValue())) return false;
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
    hash = (37 * hash) + FROM_PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getFromPubKey().hashCode();
    hash = (37 * hash) + TO_PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getToPubKey().hashCode();
    if (hasCoin()) {
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin().hashCode();
    }
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.MoveStakeData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.MoveStakeData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.MoveStakeData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.MoveStakeData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.MoveStakeData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.MoveStakeData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.MoveStakeData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.MoveStakeData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.MoveStakeData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.MoveStakeData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.MoveStakeData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.MoveStakeData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.MoveStakeData prototype) {
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
   * Protobuf type {@code api_pb.MoveStakeData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.MoveStakeData)
      counters.minter.grpc.client.MoveStakeDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_MoveStakeData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_MoveStakeData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.MoveStakeData.class, counters.minter.grpc.client.MoveStakeData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.MoveStakeData.newBuilder()
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
      fromPubKey_ = "";

      toPubKey_ = "";

      if (coinBuilder_ == null) {
        coin_ = null;
      } else {
        coin_ = null;
        coinBuilder_ = null;
      }
      value_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_MoveStakeData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.MoveStakeData getDefaultInstanceForType() {
      return counters.minter.grpc.client.MoveStakeData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.MoveStakeData build() {
      counters.minter.grpc.client.MoveStakeData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.MoveStakeData buildPartial() {
      counters.minter.grpc.client.MoveStakeData result = new counters.minter.grpc.client.MoveStakeData(this);
      result.fromPubKey_ = fromPubKey_;
      result.toPubKey_ = toPubKey_;
      if (coinBuilder_ == null) {
        result.coin_ = coin_;
      } else {
        result.coin_ = coinBuilder_.build();
      }
      result.value_ = value_;
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
      if (other instanceof counters.minter.grpc.client.MoveStakeData) {
        return mergeFrom((counters.minter.grpc.client.MoveStakeData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.MoveStakeData other) {
      if (other == counters.minter.grpc.client.MoveStakeData.getDefaultInstance()) return this;
      if (!other.getFromPubKey().isEmpty()) {
        fromPubKey_ = other.fromPubKey_;
        onChanged();
      }
      if (!other.getToPubKey().isEmpty()) {
        toPubKey_ = other.toPubKey_;
        onChanged();
      }
      if (other.hasCoin()) {
        mergeCoin(other.getCoin());
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
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
      counters.minter.grpc.client.MoveStakeData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.MoveStakeData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fromPubKey_ = "";
    /**
     * <code>string from_pub_key = 1;</code>
     * @return The fromPubKey.
     */
    public java.lang.String getFromPubKey() {
      java.lang.Object ref = fromPubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromPubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from_pub_key = 1;</code>
     * @return The bytes for fromPubKey.
     */
    public com.google.protobuf.ByteString
        getFromPubKeyBytes() {
      java.lang.Object ref = fromPubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromPubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from_pub_key = 1;</code>
     * @param value The fromPubKey to set.
     * @return This builder for chaining.
     */
    public Builder setFromPubKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromPubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string from_pub_key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFromPubKey() {
      
      fromPubKey_ = getDefaultInstance().getFromPubKey();
      onChanged();
      return this;
    }
    /**
     * <code>string from_pub_key = 1;</code>
     * @param value The bytes for fromPubKey to set.
     * @return This builder for chaining.
     */
    public Builder setFromPubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromPubKey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object toPubKey_ = "";
    /**
     * <code>string to_pub_key = 4;</code>
     * @return The toPubKey.
     */
    public java.lang.String getToPubKey() {
      java.lang.Object ref = toPubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toPubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to_pub_key = 4;</code>
     * @return The bytes for toPubKey.
     */
    public com.google.protobuf.ByteString
        getToPubKeyBytes() {
      java.lang.Object ref = toPubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toPubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to_pub_key = 4;</code>
     * @param value The toPubKey to set.
     * @return This builder for chaining.
     */
    public Builder setToPubKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toPubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string to_pub_key = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearToPubKey() {
      
      toPubKey_ = getDefaultInstance().getToPubKey();
      onChanged();
      return this;
    }
    /**
     * <code>string to_pub_key = 4;</code>
     * @param value The bytes for toPubKey to set.
     * @return This builder for chaining.
     */
    public Builder setToPubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toPubKey_ = value;
      onChanged();
      return this;
    }

    private counters.minter.grpc.client.Coin coin_;
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> coinBuilder_;
    /**
     * <code>.api_pb.Coin coin = 2;</code>
     * @return Whether the coin field is set.
     */
    public boolean hasCoin() {
      return coinBuilder_ != null || coin_ != null;
    }
    /**
     * <code>.api_pb.Coin coin = 2;</code>
     * @return The coin.
     */
    public counters.minter.grpc.client.Coin getCoin() {
      if (coinBuilder_ == null) {
        return coin_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coin_;
      } else {
        return coinBuilder_.getMessage();
      }
    }
    /**
     * <code>.api_pb.Coin coin = 2;</code>
     */
    public Builder setCoin(counters.minter.grpc.client.Coin value) {
      if (coinBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coin_ = value;
        onChanged();
      } else {
        coinBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin = 2;</code>
     */
    public Builder setCoin(
        counters.minter.grpc.client.Coin.Builder builderForValue) {
      if (coinBuilder_ == null) {
        coin_ = builderForValue.build();
        onChanged();
      } else {
        coinBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin = 2;</code>
     */
    public Builder mergeCoin(counters.minter.grpc.client.Coin value) {
      if (coinBuilder_ == null) {
        if (coin_ != null) {
          coin_ =
            counters.minter.grpc.client.Coin.newBuilder(coin_).mergeFrom(value).buildPartial();
        } else {
          coin_ = value;
        }
        onChanged();
      } else {
        coinBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin = 2;</code>
     */
    public Builder clearCoin() {
      if (coinBuilder_ == null) {
        coin_ = null;
        onChanged();
      } else {
        coin_ = null;
        coinBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin = 2;</code>
     */
    public counters.minter.grpc.client.Coin.Builder getCoinBuilder() {
      
      onChanged();
      return getCoinFieldBuilder().getBuilder();
    }
    /**
     * <code>.api_pb.Coin coin = 2;</code>
     */
    public counters.minter.grpc.client.CoinOrBuilder getCoinOrBuilder() {
      if (coinBuilder_ != null) {
        return coinBuilder_.getMessageOrBuilder();
      } else {
        return coin_ == null ?
            counters.minter.grpc.client.Coin.getDefaultInstance() : coin_;
      }
    }
    /**
     * <code>.api_pb.Coin coin = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> 
        getCoinFieldBuilder() {
      if (coinBuilder_ == null) {
        coinBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder>(
                getCoin(),
                getParentForChildren(),
                isClean());
        coin_ = null;
      }
      return coinBuilder_;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 3;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 3;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>string value = 3;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.MoveStakeData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.MoveStakeData)
  private static final counters.minter.grpc.client.MoveStakeData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.MoveStakeData();
  }

  public static counters.minter.grpc.client.MoveStakeData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MoveStakeData>
      PARSER = new com.google.protobuf.AbstractParser<MoveStakeData>() {
    @java.lang.Override
    public MoveStakeData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MoveStakeData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MoveStakeData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MoveStakeData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.MoveStakeData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

