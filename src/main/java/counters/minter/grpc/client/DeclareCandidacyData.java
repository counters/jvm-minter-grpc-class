// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.DeclareCandidacyData}
 */
public final class DeclareCandidacyData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.DeclareCandidacyData)
    DeclareCandidacyDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeclareCandidacyData.newBuilder() to construct.
  private DeclareCandidacyData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeclareCandidacyData() {
    address_ = "";
    pubKey_ = "";
    stake_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeclareCandidacyData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeclareCandidacyData(
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

            pubKey_ = s;
            break;
          }
          case 24: {

            commission_ = input.readUInt64();
            break;
          }
          case 34: {
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
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            stake_ = s;
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
    return counters.minter.grpc.client.Data.internal_static_api_pb_DeclareCandidacyData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_DeclareCandidacyData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.DeclareCandidacyData.class, counters.minter.grpc.client.DeclareCandidacyData.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object address_;
  /**
   * <code>string address = 1 [json_name = "address"];</code>
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
   * <code>string address = 1 [json_name = "address"];</code>
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

  public static final int PUB_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object pubKey_;
  /**
   * <code>string pub_key = 2 [json_name = "pubKey"];</code>
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
   * <code>string pub_key = 2 [json_name = "pubKey"];</code>
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

  public static final int COMMISSION_FIELD_NUMBER = 3;
  private long commission_;
  /**
   * <code>uint64 commission = 3 [json_name = "commission"];</code>
   * @return The commission.
   */
  @java.lang.Override
  public long getCommission() {
    return commission_;
  }

  public static final int COIN_FIELD_NUMBER = 4;
  private counters.minter.grpc.client.Coin coin_;
  /**
   * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
   * @return Whether the coin field is set.
   */
  @java.lang.Override
  public boolean hasCoin() {
    return coin_ != null;
  }
  /**
   * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
   * @return The coin.
   */
  @java.lang.Override
  public counters.minter.grpc.client.Coin getCoin() {
    return coin_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coin_;
  }
  /**
   * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.CoinOrBuilder getCoinOrBuilder() {
    return getCoin();
  }

  public static final int STAKE_FIELD_NUMBER = 5;
  private volatile java.lang.Object stake_;
  /**
   * <code>string stake = 5 [json_name = "stake"];</code>
   * @return The stake.
   */
  @java.lang.Override
  public java.lang.String getStake() {
    java.lang.Object ref = stake_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stake_ = s;
      return s;
    }
  }
  /**
   * <code>string stake = 5 [json_name = "stake"];</code>
   * @return The bytes for stake.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStakeBytes() {
    java.lang.Object ref = stake_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stake_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pubKey_);
    }
    if (commission_ != 0L) {
      output.writeUInt64(3, commission_);
    }
    if (coin_ != null) {
      output.writeMessage(4, getCoin());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stake_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, stake_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pubKey_);
    }
    if (commission_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, commission_);
    }
    if (coin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCoin());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stake_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, stake_);
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
    if (!(obj instanceof counters.minter.grpc.client.DeclareCandidacyData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.DeclareCandidacyData other = (counters.minter.grpc.client.DeclareCandidacyData) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getPubKey()
        .equals(other.getPubKey())) return false;
    if (getCommission()
        != other.getCommission()) return false;
    if (hasCoin() != other.hasCoin()) return false;
    if (hasCoin()) {
      if (!getCoin()
          .equals(other.getCoin())) return false;
    }
    if (!getStake()
        .equals(other.getStake())) return false;
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
    hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
    hash = (37 * hash) + COMMISSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCommission());
    if (hasCoin()) {
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin().hashCode();
    }
    hash = (37 * hash) + STAKE_FIELD_NUMBER;
    hash = (53 * hash) + getStake().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.DeclareCandidacyData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.DeclareCandidacyData prototype) {
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
   * Protobuf type {@code api_pb.DeclareCandidacyData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.DeclareCandidacyData)
      counters.minter.grpc.client.DeclareCandidacyDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_DeclareCandidacyData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_DeclareCandidacyData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.DeclareCandidacyData.class, counters.minter.grpc.client.DeclareCandidacyData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.DeclareCandidacyData.newBuilder()
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

      pubKey_ = "";

      commission_ = 0L;

      if (coinBuilder_ == null) {
        coin_ = null;
      } else {
        coin_ = null;
        coinBuilder_ = null;
      }
      stake_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_DeclareCandidacyData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.DeclareCandidacyData getDefaultInstanceForType() {
      return counters.minter.grpc.client.DeclareCandidacyData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.DeclareCandidacyData build() {
      counters.minter.grpc.client.DeclareCandidacyData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.DeclareCandidacyData buildPartial() {
      counters.minter.grpc.client.DeclareCandidacyData result = new counters.minter.grpc.client.DeclareCandidacyData(this);
      result.address_ = address_;
      result.pubKey_ = pubKey_;
      result.commission_ = commission_;
      if (coinBuilder_ == null) {
        result.coin_ = coin_;
      } else {
        result.coin_ = coinBuilder_.build();
      }
      result.stake_ = stake_;
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
      if (other instanceof counters.minter.grpc.client.DeclareCandidacyData) {
        return mergeFrom((counters.minter.grpc.client.DeclareCandidacyData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.DeclareCandidacyData other) {
      if (other == counters.minter.grpc.client.DeclareCandidacyData.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (!other.getPubKey().isEmpty()) {
        pubKey_ = other.pubKey_;
        onChanged();
      }
      if (other.getCommission() != 0L) {
        setCommission(other.getCommission());
      }
      if (other.hasCoin()) {
        mergeCoin(other.getCoin());
      }
      if (!other.getStake().isEmpty()) {
        stake_ = other.stake_;
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
      counters.minter.grpc.client.DeclareCandidacyData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.DeclareCandidacyData) e.getUnfinishedMessage();
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
     * <code>string address = 1 [json_name = "address"];</code>
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
     * <code>string address = 1 [json_name = "address"];</code>
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
     * <code>string address = 1 [json_name = "address"];</code>
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
     * <code>string address = 1 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
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

    private java.lang.Object pubKey_ = "";
    /**
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
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
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
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
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
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
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPubKey() {
      
      pubKey_ = getDefaultInstance().getPubKey();
      onChanged();
      return this;
    }
    /**
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
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

    private long commission_ ;
    /**
     * <code>uint64 commission = 3 [json_name = "commission"];</code>
     * @return The commission.
     */
    @java.lang.Override
    public long getCommission() {
      return commission_;
    }
    /**
     * <code>uint64 commission = 3 [json_name = "commission"];</code>
     * @param value The commission to set.
     * @return This builder for chaining.
     */
    public Builder setCommission(long value) {
      
      commission_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 commission = 3 [json_name = "commission"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCommission() {
      
      commission_ = 0L;
      onChanged();
      return this;
    }

    private counters.minter.grpc.client.Coin coin_;
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> coinBuilder_;
    /**
     * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
     * @return Whether the coin field is set.
     */
    public boolean hasCoin() {
      return coinBuilder_ != null || coin_ != null;
    }
    /**
     * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
     */
    public counters.minter.grpc.client.Coin.Builder getCoinBuilder() {
      
      onChanged();
      return getCoinFieldBuilder().getBuilder();
    }
    /**
     * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
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
     * <code>.api_pb.Coin coin = 4 [json_name = "coin"];</code>
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

    private java.lang.Object stake_ = "";
    /**
     * <code>string stake = 5 [json_name = "stake"];</code>
     * @return The stake.
     */
    public java.lang.String getStake() {
      java.lang.Object ref = stake_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stake_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stake = 5 [json_name = "stake"];</code>
     * @return The bytes for stake.
     */
    public com.google.protobuf.ByteString
        getStakeBytes() {
      java.lang.Object ref = stake_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stake_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stake = 5 [json_name = "stake"];</code>
     * @param value The stake to set.
     * @return This builder for chaining.
     */
    public Builder setStake(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stake_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stake = 5 [json_name = "stake"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStake() {
      
      stake_ = getDefaultInstance().getStake();
      onChanged();
      return this;
    }
    /**
     * <code>string stake = 5 [json_name = "stake"];</code>
     * @param value The bytes for stake to set.
     * @return This builder for chaining.
     */
    public Builder setStakeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stake_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.DeclareCandidacyData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.DeclareCandidacyData)
  private static final counters.minter.grpc.client.DeclareCandidacyData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.DeclareCandidacyData();
  }

  public static counters.minter.grpc.client.DeclareCandidacyData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeclareCandidacyData>
      PARSER = new com.google.protobuf.AbstractParser<DeclareCandidacyData>() {
    @java.lang.Override
    public DeclareCandidacyData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeclareCandidacyData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeclareCandidacyData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeclareCandidacyData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.DeclareCandidacyData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

