// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.CreateSwapPoolData}
 */
public final class CreateSwapPoolData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.CreateSwapPoolData)
    CreateSwapPoolDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSwapPoolData.newBuilder() to construct.
  private CreateSwapPoolData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSwapPoolData() {
    volume0_ = "";
    volume1_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSwapPoolData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSwapPoolData(
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
            counters.minter.grpc.client.Coin.Builder subBuilder = null;
            if (coin0_ != null) {
              subBuilder = coin0_.toBuilder();
            }
            coin0_ = input.readMessage(counters.minter.grpc.client.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coin0_);
              coin0_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            counters.minter.grpc.client.Coin.Builder subBuilder = null;
            if (coin1_ != null) {
              subBuilder = coin1_.toBuilder();
            }
            coin1_ = input.readMessage(counters.minter.grpc.client.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coin1_);
              coin1_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            volume0_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            volume1_ = s;
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
    return counters.minter.grpc.client.Data.internal_static_api_pb_CreateSwapPoolData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_CreateSwapPoolData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.CreateSwapPoolData.class, counters.minter.grpc.client.CreateSwapPoolData.Builder.class);
  }

  public static final int COIN0_FIELD_NUMBER = 1;
  private counters.minter.grpc.client.Coin coin0_;
  /**
   * <code>.api_pb.Coin coin0 = 1;</code>
   * @return Whether the coin0 field is set.
   */
  @java.lang.Override
  public boolean hasCoin0() {
    return coin0_ != null;
  }
  /**
   * <code>.api_pb.Coin coin0 = 1;</code>
   * @return The coin0.
   */
  @java.lang.Override
  public counters.minter.grpc.client.Coin getCoin0() {
    return coin0_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coin0_;
  }
  /**
   * <code>.api_pb.Coin coin0 = 1;</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.CoinOrBuilder getCoin0OrBuilder() {
    return getCoin0();
  }

  public static final int COIN1_FIELD_NUMBER = 2;
  private counters.minter.grpc.client.Coin coin1_;
  /**
   * <code>.api_pb.Coin coin1 = 2;</code>
   * @return Whether the coin1 field is set.
   */
  @java.lang.Override
  public boolean hasCoin1() {
    return coin1_ != null;
  }
  /**
   * <code>.api_pb.Coin coin1 = 2;</code>
   * @return The coin1.
   */
  @java.lang.Override
  public counters.minter.grpc.client.Coin getCoin1() {
    return coin1_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coin1_;
  }
  /**
   * <code>.api_pb.Coin coin1 = 2;</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.CoinOrBuilder getCoin1OrBuilder() {
    return getCoin1();
  }

  public static final int VOLUME0_FIELD_NUMBER = 3;
  private volatile java.lang.Object volume0_;
  /**
   * <code>string volume0 = 3;</code>
   * @return The volume0.
   */
  @java.lang.Override
  public java.lang.String getVolume0() {
    java.lang.Object ref = volume0_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      volume0_ = s;
      return s;
    }
  }
  /**
   * <code>string volume0 = 3;</code>
   * @return The bytes for volume0.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVolume0Bytes() {
    java.lang.Object ref = volume0_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      volume0_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOLUME1_FIELD_NUMBER = 4;
  private volatile java.lang.Object volume1_;
  /**
   * <code>string volume1 = 4;</code>
   * @return The volume1.
   */
  @java.lang.Override
  public java.lang.String getVolume1() {
    java.lang.Object ref = volume1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      volume1_ = s;
      return s;
    }
  }
  /**
   * <code>string volume1 = 4;</code>
   * @return The bytes for volume1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVolume1Bytes() {
    java.lang.Object ref = volume1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      volume1_ = b;
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
    if (coin0_ != null) {
      output.writeMessage(1, getCoin0());
    }
    if (coin1_ != null) {
      output.writeMessage(2, getCoin1());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volume0_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, volume0_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volume1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, volume1_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (coin0_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCoin0());
    }
    if (coin1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCoin1());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volume0_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, volume0_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volume1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, volume1_);
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
    if (!(obj instanceof counters.minter.grpc.client.CreateSwapPoolData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.CreateSwapPoolData other = (counters.minter.grpc.client.CreateSwapPoolData) obj;

    if (hasCoin0() != other.hasCoin0()) return false;
    if (hasCoin0()) {
      if (!getCoin0()
          .equals(other.getCoin0())) return false;
    }
    if (hasCoin1() != other.hasCoin1()) return false;
    if (hasCoin1()) {
      if (!getCoin1()
          .equals(other.getCoin1())) return false;
    }
    if (!getVolume0()
        .equals(other.getVolume0())) return false;
    if (!getVolume1()
        .equals(other.getVolume1())) return false;
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
    if (hasCoin0()) {
      hash = (37 * hash) + COIN0_FIELD_NUMBER;
      hash = (53 * hash) + getCoin0().hashCode();
    }
    if (hasCoin1()) {
      hash = (37 * hash) + COIN1_FIELD_NUMBER;
      hash = (53 * hash) + getCoin1().hashCode();
    }
    hash = (37 * hash) + VOLUME0_FIELD_NUMBER;
    hash = (53 * hash) + getVolume0().hashCode();
    hash = (37 * hash) + VOLUME1_FIELD_NUMBER;
    hash = (53 * hash) + getVolume1().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.CreateSwapPoolData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.CreateSwapPoolData prototype) {
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
   * Protobuf type {@code api_pb.CreateSwapPoolData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.CreateSwapPoolData)
      counters.minter.grpc.client.CreateSwapPoolDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_CreateSwapPoolData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_CreateSwapPoolData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.CreateSwapPoolData.class, counters.minter.grpc.client.CreateSwapPoolData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.CreateSwapPoolData.newBuilder()
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
      if (coin0Builder_ == null) {
        coin0_ = null;
      } else {
        coin0_ = null;
        coin0Builder_ = null;
      }
      if (coin1Builder_ == null) {
        coin1_ = null;
      } else {
        coin1_ = null;
        coin1Builder_ = null;
      }
      volume0_ = "";

      volume1_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_CreateSwapPoolData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.CreateSwapPoolData getDefaultInstanceForType() {
      return counters.minter.grpc.client.CreateSwapPoolData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.CreateSwapPoolData build() {
      counters.minter.grpc.client.CreateSwapPoolData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.CreateSwapPoolData buildPartial() {
      counters.minter.grpc.client.CreateSwapPoolData result = new counters.minter.grpc.client.CreateSwapPoolData(this);
      if (coin0Builder_ == null) {
        result.coin0_ = coin0_;
      } else {
        result.coin0_ = coin0Builder_.build();
      }
      if (coin1Builder_ == null) {
        result.coin1_ = coin1_;
      } else {
        result.coin1_ = coin1Builder_.build();
      }
      result.volume0_ = volume0_;
      result.volume1_ = volume1_;
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
      if (other instanceof counters.minter.grpc.client.CreateSwapPoolData) {
        return mergeFrom((counters.minter.grpc.client.CreateSwapPoolData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.CreateSwapPoolData other) {
      if (other == counters.minter.grpc.client.CreateSwapPoolData.getDefaultInstance()) return this;
      if (other.hasCoin0()) {
        mergeCoin0(other.getCoin0());
      }
      if (other.hasCoin1()) {
        mergeCoin1(other.getCoin1());
      }
      if (!other.getVolume0().isEmpty()) {
        volume0_ = other.volume0_;
        onChanged();
      }
      if (!other.getVolume1().isEmpty()) {
        volume1_ = other.volume1_;
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
      counters.minter.grpc.client.CreateSwapPoolData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.CreateSwapPoolData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private counters.minter.grpc.client.Coin coin0_;
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> coin0Builder_;
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     * @return Whether the coin0 field is set.
     */
    public boolean hasCoin0() {
      return coin0Builder_ != null || coin0_ != null;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     * @return The coin0.
     */
    public counters.minter.grpc.client.Coin getCoin0() {
      if (coin0Builder_ == null) {
        return coin0_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coin0_;
      } else {
        return coin0Builder_.getMessage();
      }
    }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     */
    public Builder setCoin0(counters.minter.grpc.client.Coin value) {
      if (coin0Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coin0_ = value;
        onChanged();
      } else {
        coin0Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     */
    public Builder setCoin0(
        counters.minter.grpc.client.Coin.Builder builderForValue) {
      if (coin0Builder_ == null) {
        coin0_ = builderForValue.build();
        onChanged();
      } else {
        coin0Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     */
    public Builder mergeCoin0(counters.minter.grpc.client.Coin value) {
      if (coin0Builder_ == null) {
        if (coin0_ != null) {
          coin0_ =
            counters.minter.grpc.client.Coin.newBuilder(coin0_).mergeFrom(value).buildPartial();
        } else {
          coin0_ = value;
        }
        onChanged();
      } else {
        coin0Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     */
    public Builder clearCoin0() {
      if (coin0Builder_ == null) {
        coin0_ = null;
        onChanged();
      } else {
        coin0_ = null;
        coin0Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     */
    public counters.minter.grpc.client.Coin.Builder getCoin0Builder() {
      
      onChanged();
      return getCoin0FieldBuilder().getBuilder();
    }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     */
    public counters.minter.grpc.client.CoinOrBuilder getCoin0OrBuilder() {
      if (coin0Builder_ != null) {
        return coin0Builder_.getMessageOrBuilder();
      } else {
        return coin0_ == null ?
            counters.minter.grpc.client.Coin.getDefaultInstance() : coin0_;
      }
    }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> 
        getCoin0FieldBuilder() {
      if (coin0Builder_ == null) {
        coin0Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder>(
                getCoin0(),
                getParentForChildren(),
                isClean());
        coin0_ = null;
      }
      return coin0Builder_;
    }

    private counters.minter.grpc.client.Coin coin1_;
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> coin1Builder_;
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     * @return Whether the coin1 field is set.
     */
    public boolean hasCoin1() {
      return coin1Builder_ != null || coin1_ != null;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     * @return The coin1.
     */
    public counters.minter.grpc.client.Coin getCoin1() {
      if (coin1Builder_ == null) {
        return coin1_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coin1_;
      } else {
        return coin1Builder_.getMessage();
      }
    }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     */
    public Builder setCoin1(counters.minter.grpc.client.Coin value) {
      if (coin1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coin1_ = value;
        onChanged();
      } else {
        coin1Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     */
    public Builder setCoin1(
        counters.minter.grpc.client.Coin.Builder builderForValue) {
      if (coin1Builder_ == null) {
        coin1_ = builderForValue.build();
        onChanged();
      } else {
        coin1Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     */
    public Builder mergeCoin1(counters.minter.grpc.client.Coin value) {
      if (coin1Builder_ == null) {
        if (coin1_ != null) {
          coin1_ =
            counters.minter.grpc.client.Coin.newBuilder(coin1_).mergeFrom(value).buildPartial();
        } else {
          coin1_ = value;
        }
        onChanged();
      } else {
        coin1Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     */
    public Builder clearCoin1() {
      if (coin1Builder_ == null) {
        coin1_ = null;
        onChanged();
      } else {
        coin1_ = null;
        coin1Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     */
    public counters.minter.grpc.client.Coin.Builder getCoin1Builder() {
      
      onChanged();
      return getCoin1FieldBuilder().getBuilder();
    }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     */
    public counters.minter.grpc.client.CoinOrBuilder getCoin1OrBuilder() {
      if (coin1Builder_ != null) {
        return coin1Builder_.getMessageOrBuilder();
      } else {
        return coin1_ == null ?
            counters.minter.grpc.client.Coin.getDefaultInstance() : coin1_;
      }
    }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> 
        getCoin1FieldBuilder() {
      if (coin1Builder_ == null) {
        coin1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder>(
                getCoin1(),
                getParentForChildren(),
                isClean());
        coin1_ = null;
      }
      return coin1Builder_;
    }

    private java.lang.Object volume0_ = "";
    /**
     * <code>string volume0 = 3;</code>
     * @return The volume0.
     */
    public java.lang.String getVolume0() {
      java.lang.Object ref = volume0_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        volume0_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string volume0 = 3;</code>
     * @return The bytes for volume0.
     */
    public com.google.protobuf.ByteString
        getVolume0Bytes() {
      java.lang.Object ref = volume0_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        volume0_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string volume0 = 3;</code>
     * @param value The volume0 to set.
     * @return This builder for chaining.
     */
    public Builder setVolume0(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      volume0_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string volume0 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVolume0() {
      
      volume0_ = getDefaultInstance().getVolume0();
      onChanged();
      return this;
    }
    /**
     * <code>string volume0 = 3;</code>
     * @param value The bytes for volume0 to set.
     * @return This builder for chaining.
     */
    public Builder setVolume0Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      volume0_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object volume1_ = "";
    /**
     * <code>string volume1 = 4;</code>
     * @return The volume1.
     */
    public java.lang.String getVolume1() {
      java.lang.Object ref = volume1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        volume1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string volume1 = 4;</code>
     * @return The bytes for volume1.
     */
    public com.google.protobuf.ByteString
        getVolume1Bytes() {
      java.lang.Object ref = volume1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        volume1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string volume1 = 4;</code>
     * @param value The volume1 to set.
     * @return This builder for chaining.
     */
    public Builder setVolume1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      volume1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string volume1 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVolume1() {
      
      volume1_ = getDefaultInstance().getVolume1();
      onChanged();
      return this;
    }
    /**
     * <code>string volume1 = 4;</code>
     * @param value The bytes for volume1 to set.
     * @return This builder for chaining.
     */
    public Builder setVolume1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      volume1_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.CreateSwapPoolData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.CreateSwapPoolData)
  private static final counters.minter.grpc.client.CreateSwapPoolData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.CreateSwapPoolData();
  }

  public static counters.minter.grpc.client.CreateSwapPoolData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSwapPoolData>
      PARSER = new com.google.protobuf.AbstractParser<CreateSwapPoolData>() {
    @java.lang.Override
    public CreateSwapPoolData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSwapPoolData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSwapPoolData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSwapPoolData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.CreateSwapPoolData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

