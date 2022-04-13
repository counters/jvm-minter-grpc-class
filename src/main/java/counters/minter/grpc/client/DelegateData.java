// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.DelegateData}
 */
public final class DelegateData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.DelegateData)
    DelegateDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DelegateData.newBuilder() to construct.
  private DelegateData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DelegateData() {
    pubKey_ = "";
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DelegateData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DelegateData(
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

            pubKey_ = s;
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
    return counters.minter.grpc.client.Data.internal_static_api_pb_DelegateData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_DelegateData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.DelegateData.class, counters.minter.grpc.client.DelegateData.Builder.class);
  }

  public static final int PUB_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object pubKey_;
  /**
   * <code>string pub_key = 1 [json_name = "pubKey"];</code>
   * @return The pubKey.
   */
  @java.lang.Override
  public java.lang.String getPubKey() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pubKey_ = s;
      return s;
    }
  }
  /**
   * <code>string pub_key = 1 [json_name = "pubKey"];</code>
   * @return The bytes for pubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPubKeyBytes() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COIN_FIELD_NUMBER = 2;
  private counters.minter.grpc.client.Coin coin_;
  /**
   * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
   * @return Whether the coin field is set.
   */
  @java.lang.Override
  public boolean hasCoin() {
    return coin_ != null;
  }
  /**
   * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
   * @return The coin.
   */
  @java.lang.Override
  public counters.minter.grpc.client.Coin getCoin() {
    return coin_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coin_;
  }
  /**
   * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.CoinOrBuilder getCoinOrBuilder() {
    return getCoin();
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private volatile java.lang.Object value_;
  /**
   * <code>string value = 3 [json_name = "value"];</code>
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
   * <code>string value = 3 [json_name = "value"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pubKey_);
    }
    if (coin_ != null) {
      output.writeMessage(2, getCoin());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pubKey_);
    }
    if (coin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCoin());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
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
    if (!(obj instanceof counters.minter.grpc.client.DelegateData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.DelegateData other = (counters.minter.grpc.client.DelegateData) obj;

    if (!getPubKey()
        .equals(other.getPubKey())) return false;
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
    hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
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

  public static counters.minter.grpc.client.DelegateData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.DelegateData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.DelegateData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.DelegateData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.DelegateData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.DelegateData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.DelegateData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.DelegateData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.DelegateData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.DelegateData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.DelegateData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.DelegateData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.DelegateData prototype) {
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
   * Protobuf type {@code api_pb.DelegateData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.DelegateData)
      counters.minter.grpc.client.DelegateDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_DelegateData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_DelegateData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.DelegateData.class, counters.minter.grpc.client.DelegateData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.DelegateData.newBuilder()
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
      pubKey_ = "";

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
      return counters.minter.grpc.client.Data.internal_static_api_pb_DelegateData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.DelegateData getDefaultInstanceForType() {
      return counters.minter.grpc.client.DelegateData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.DelegateData build() {
      counters.minter.grpc.client.DelegateData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.DelegateData buildPartial() {
      counters.minter.grpc.client.DelegateData result = new counters.minter.grpc.client.DelegateData(this);
      result.pubKey_ = pubKey_;
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
      if (other instanceof counters.minter.grpc.client.DelegateData) {
        return mergeFrom((counters.minter.grpc.client.DelegateData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.DelegateData other) {
      if (other == counters.minter.grpc.client.DelegateData.getDefaultInstance()) return this;
      if (!other.getPubKey().isEmpty()) {
        pubKey_ = other.pubKey_;
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
      counters.minter.grpc.client.DelegateData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.DelegateData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pubKey_ = "";
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return The pubKey.
     */
    public java.lang.String getPubKey() {
      java.lang.Object ref = pubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return The bytes for pubKey.
     */
    public com.google.protobuf.ByteString
        getPubKeyBytes() {
      java.lang.Object ref = pubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @param value The pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPubKey() {
      
      pubKey_ = getDefaultInstance().getPubKey();
      onChanged();
      return this;
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @param value The bytes for pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pubKey_ = value;
      onChanged();
      return this;
    }

    private counters.minter.grpc.client.Coin coin_;
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> coinBuilder_;
    /**
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
     * @return Whether the coin field is set.
     */
    public boolean hasCoin() {
      return coinBuilder_ != null || coin_ != null;
    }
    /**
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
     */
    public counters.minter.grpc.client.Coin.Builder getCoinBuilder() {
      
      onChanged();
      return getCoinFieldBuilder().getBuilder();
    }
    /**
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
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
     * <code>string value = 3 [json_name = "value"];</code>
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
     * <code>string value = 3 [json_name = "value"];</code>
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
     * <code>string value = 3 [json_name = "value"];</code>
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
     * <code>string value = 3 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>string value = 3 [json_name = "value"];</code>
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


    // @@protoc_insertion_point(builder_scope:api_pb.DelegateData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.DelegateData)
  private static final counters.minter.grpc.client.DelegateData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.DelegateData();
  }

  public static counters.minter.grpc.client.DelegateData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DelegateData>
      PARSER = new com.google.protobuf.AbstractParser<DelegateData>() {
    @java.lang.Override
    public DelegateData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DelegateData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DelegateData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DelegateData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.DelegateData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

