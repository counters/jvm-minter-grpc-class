// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.AddLimitOrderData}
 */
public final class AddLimitOrderData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.AddLimitOrderData)
    AddLimitOrderDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddLimitOrderData.newBuilder() to construct.
  private AddLimitOrderData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddLimitOrderData() {
    valueToSell_ = "";
    valueToBuy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddLimitOrderData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddLimitOrderData(
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
            if (coinToSell_ != null) {
              subBuilder = coinToSell_.toBuilder();
            }
            coinToSell_ = input.readMessage(counters.minter.grpc.client.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coinToSell_);
              coinToSell_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            valueToSell_ = s;
            break;
          }
          case 26: {
            counters.minter.grpc.client.Coin.Builder subBuilder = null;
            if (coinToBuy_ != null) {
              subBuilder = coinToBuy_.toBuilder();
            }
            coinToBuy_ = input.readMessage(counters.minter.grpc.client.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coinToBuy_);
              coinToBuy_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            valueToBuy_ = s;
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
    return counters.minter.grpc.client.Data.internal_static_api_pb_AddLimitOrderData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_AddLimitOrderData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.AddLimitOrderData.class, counters.minter.grpc.client.AddLimitOrderData.Builder.class);
  }

  public static final int COIN_TO_SELL_FIELD_NUMBER = 1;
  private counters.minter.grpc.client.Coin coinToSell_;
  /**
   * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
   * @return Whether the coinToSell field is set.
   */
  @java.lang.Override
  public boolean hasCoinToSell() {
    return coinToSell_ != null;
  }
  /**
   * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
   * @return The coinToSell.
   */
  @java.lang.Override
  public counters.minter.grpc.client.Coin getCoinToSell() {
    return coinToSell_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coinToSell_;
  }
  /**
   * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.CoinOrBuilder getCoinToSellOrBuilder() {
    return getCoinToSell();
  }

  public static final int VALUE_TO_SELL_FIELD_NUMBER = 2;
  private volatile java.lang.Object valueToSell_;
  /**
   * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
   * @return The valueToSell.
   */
  @java.lang.Override
  public java.lang.String getValueToSell() {
    java.lang.Object ref = valueToSell_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valueToSell_ = s;
      return s;
    }
  }
  /**
   * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
   * @return The bytes for valueToSell.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueToSellBytes() {
    java.lang.Object ref = valueToSell_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valueToSell_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COIN_TO_BUY_FIELD_NUMBER = 3;
  private counters.minter.grpc.client.Coin coinToBuy_;
  /**
   * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
   * @return Whether the coinToBuy field is set.
   */
  @java.lang.Override
  public boolean hasCoinToBuy() {
    return coinToBuy_ != null;
  }
  /**
   * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
   * @return The coinToBuy.
   */
  @java.lang.Override
  public counters.minter.grpc.client.Coin getCoinToBuy() {
    return coinToBuy_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coinToBuy_;
  }
  /**
   * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.CoinOrBuilder getCoinToBuyOrBuilder() {
    return getCoinToBuy();
  }

  public static final int VALUE_TO_BUY_FIELD_NUMBER = 4;
  private volatile java.lang.Object valueToBuy_;
  /**
   * <code>string value_to_buy = 4 [json_name = "valueToBuy"];</code>
   * @return The valueToBuy.
   */
  @java.lang.Override
  public java.lang.String getValueToBuy() {
    java.lang.Object ref = valueToBuy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valueToBuy_ = s;
      return s;
    }
  }
  /**
   * <code>string value_to_buy = 4 [json_name = "valueToBuy"];</code>
   * @return The bytes for valueToBuy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueToBuyBytes() {
    java.lang.Object ref = valueToBuy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valueToBuy_ = b;
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
    if (coinToSell_ != null) {
      output.writeMessage(1, getCoinToSell());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valueToSell_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, valueToSell_);
    }
    if (coinToBuy_ != null) {
      output.writeMessage(3, getCoinToBuy());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valueToBuy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, valueToBuy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (coinToSell_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCoinToSell());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valueToSell_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, valueToSell_);
    }
    if (coinToBuy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCoinToBuy());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valueToBuy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, valueToBuy_);
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
    if (!(obj instanceof counters.minter.grpc.client.AddLimitOrderData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.AddLimitOrderData other = (counters.minter.grpc.client.AddLimitOrderData) obj;

    if (hasCoinToSell() != other.hasCoinToSell()) return false;
    if (hasCoinToSell()) {
      if (!getCoinToSell()
          .equals(other.getCoinToSell())) return false;
    }
    if (!getValueToSell()
        .equals(other.getValueToSell())) return false;
    if (hasCoinToBuy() != other.hasCoinToBuy()) return false;
    if (hasCoinToBuy()) {
      if (!getCoinToBuy()
          .equals(other.getCoinToBuy())) return false;
    }
    if (!getValueToBuy()
        .equals(other.getValueToBuy())) return false;
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
    if (hasCoinToSell()) {
      hash = (37 * hash) + COIN_TO_SELL_FIELD_NUMBER;
      hash = (53 * hash) + getCoinToSell().hashCode();
    }
    hash = (37 * hash) + VALUE_TO_SELL_FIELD_NUMBER;
    hash = (53 * hash) + getValueToSell().hashCode();
    if (hasCoinToBuy()) {
      hash = (37 * hash) + COIN_TO_BUY_FIELD_NUMBER;
      hash = (53 * hash) + getCoinToBuy().hashCode();
    }
    hash = (37 * hash) + VALUE_TO_BUY_FIELD_NUMBER;
    hash = (53 * hash) + getValueToBuy().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.AddLimitOrderData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.AddLimitOrderData prototype) {
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
   * Protobuf type {@code api_pb.AddLimitOrderData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.AddLimitOrderData)
      counters.minter.grpc.client.AddLimitOrderDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_AddLimitOrderData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_AddLimitOrderData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.AddLimitOrderData.class, counters.minter.grpc.client.AddLimitOrderData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.AddLimitOrderData.newBuilder()
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
      if (coinToSellBuilder_ == null) {
        coinToSell_ = null;
      } else {
        coinToSell_ = null;
        coinToSellBuilder_ = null;
      }
      valueToSell_ = "";

      if (coinToBuyBuilder_ == null) {
        coinToBuy_ = null;
      } else {
        coinToBuy_ = null;
        coinToBuyBuilder_ = null;
      }
      valueToBuy_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_AddLimitOrderData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.AddLimitOrderData getDefaultInstanceForType() {
      return counters.minter.grpc.client.AddLimitOrderData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.AddLimitOrderData build() {
      counters.minter.grpc.client.AddLimitOrderData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.AddLimitOrderData buildPartial() {
      counters.minter.grpc.client.AddLimitOrderData result = new counters.minter.grpc.client.AddLimitOrderData(this);
      if (coinToSellBuilder_ == null) {
        result.coinToSell_ = coinToSell_;
      } else {
        result.coinToSell_ = coinToSellBuilder_.build();
      }
      result.valueToSell_ = valueToSell_;
      if (coinToBuyBuilder_ == null) {
        result.coinToBuy_ = coinToBuy_;
      } else {
        result.coinToBuy_ = coinToBuyBuilder_.build();
      }
      result.valueToBuy_ = valueToBuy_;
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
      if (other instanceof counters.minter.grpc.client.AddLimitOrderData) {
        return mergeFrom((counters.minter.grpc.client.AddLimitOrderData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.AddLimitOrderData other) {
      if (other == counters.minter.grpc.client.AddLimitOrderData.getDefaultInstance()) return this;
      if (other.hasCoinToSell()) {
        mergeCoinToSell(other.getCoinToSell());
      }
      if (!other.getValueToSell().isEmpty()) {
        valueToSell_ = other.valueToSell_;
        onChanged();
      }
      if (other.hasCoinToBuy()) {
        mergeCoinToBuy(other.getCoinToBuy());
      }
      if (!other.getValueToBuy().isEmpty()) {
        valueToBuy_ = other.valueToBuy_;
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
      counters.minter.grpc.client.AddLimitOrderData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.AddLimitOrderData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private counters.minter.grpc.client.Coin coinToSell_;
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> coinToSellBuilder_;
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     * @return Whether the coinToSell field is set.
     */
    public boolean hasCoinToSell() {
      return coinToSellBuilder_ != null || coinToSell_ != null;
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     * @return The coinToSell.
     */
    public counters.minter.grpc.client.Coin getCoinToSell() {
      if (coinToSellBuilder_ == null) {
        return coinToSell_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coinToSell_;
      } else {
        return coinToSellBuilder_.getMessage();
      }
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    public Builder setCoinToSell(counters.minter.grpc.client.Coin value) {
      if (coinToSellBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coinToSell_ = value;
        onChanged();
      } else {
        coinToSellBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    public Builder setCoinToSell(
        counters.minter.grpc.client.Coin.Builder builderForValue) {
      if (coinToSellBuilder_ == null) {
        coinToSell_ = builderForValue.build();
        onChanged();
      } else {
        coinToSellBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    public Builder mergeCoinToSell(counters.minter.grpc.client.Coin value) {
      if (coinToSellBuilder_ == null) {
        if (coinToSell_ != null) {
          coinToSell_ =
            counters.minter.grpc.client.Coin.newBuilder(coinToSell_).mergeFrom(value).buildPartial();
        } else {
          coinToSell_ = value;
        }
        onChanged();
      } else {
        coinToSellBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    public Builder clearCoinToSell() {
      if (coinToSellBuilder_ == null) {
        coinToSell_ = null;
        onChanged();
      } else {
        coinToSell_ = null;
        coinToSellBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    public counters.minter.grpc.client.Coin.Builder getCoinToSellBuilder() {
      
      onChanged();
      return getCoinToSellFieldBuilder().getBuilder();
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    public counters.minter.grpc.client.CoinOrBuilder getCoinToSellOrBuilder() {
      if (coinToSellBuilder_ != null) {
        return coinToSellBuilder_.getMessageOrBuilder();
      } else {
        return coinToSell_ == null ?
            counters.minter.grpc.client.Coin.getDefaultInstance() : coinToSell_;
      }
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> 
        getCoinToSellFieldBuilder() {
      if (coinToSellBuilder_ == null) {
        coinToSellBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder>(
                getCoinToSell(),
                getParentForChildren(),
                isClean());
        coinToSell_ = null;
      }
      return coinToSellBuilder_;
    }

    private java.lang.Object valueToSell_ = "";
    /**
     * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
     * @return The valueToSell.
     */
    public java.lang.String getValueToSell() {
      java.lang.Object ref = valueToSell_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valueToSell_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
     * @return The bytes for valueToSell.
     */
    public com.google.protobuf.ByteString
        getValueToSellBytes() {
      java.lang.Object ref = valueToSell_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valueToSell_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
     * @param value The valueToSell to set.
     * @return This builder for chaining.
     */
    public Builder setValueToSell(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valueToSell_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValueToSell() {
      
      valueToSell_ = getDefaultInstance().getValueToSell();
      onChanged();
      return this;
    }
    /**
     * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
     * @param value The bytes for valueToSell to set.
     * @return This builder for chaining.
     */
    public Builder setValueToSellBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      valueToSell_ = value;
      onChanged();
      return this;
    }

    private counters.minter.grpc.client.Coin coinToBuy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> coinToBuyBuilder_;
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     * @return Whether the coinToBuy field is set.
     */
    public boolean hasCoinToBuy() {
      return coinToBuyBuilder_ != null || coinToBuy_ != null;
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     * @return The coinToBuy.
     */
    public counters.minter.grpc.client.Coin getCoinToBuy() {
      if (coinToBuyBuilder_ == null) {
        return coinToBuy_ == null ? counters.minter.grpc.client.Coin.getDefaultInstance() : coinToBuy_;
      } else {
        return coinToBuyBuilder_.getMessage();
      }
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     */
    public Builder setCoinToBuy(counters.minter.grpc.client.Coin value) {
      if (coinToBuyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coinToBuy_ = value;
        onChanged();
      } else {
        coinToBuyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     */
    public Builder setCoinToBuy(
        counters.minter.grpc.client.Coin.Builder builderForValue) {
      if (coinToBuyBuilder_ == null) {
        coinToBuy_ = builderForValue.build();
        onChanged();
      } else {
        coinToBuyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     */
    public Builder mergeCoinToBuy(counters.minter.grpc.client.Coin value) {
      if (coinToBuyBuilder_ == null) {
        if (coinToBuy_ != null) {
          coinToBuy_ =
            counters.minter.grpc.client.Coin.newBuilder(coinToBuy_).mergeFrom(value).buildPartial();
        } else {
          coinToBuy_ = value;
        }
        onChanged();
      } else {
        coinToBuyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     */
    public Builder clearCoinToBuy() {
      if (coinToBuyBuilder_ == null) {
        coinToBuy_ = null;
        onChanged();
      } else {
        coinToBuy_ = null;
        coinToBuyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     */
    public counters.minter.grpc.client.Coin.Builder getCoinToBuyBuilder() {
      
      onChanged();
      return getCoinToBuyFieldBuilder().getBuilder();
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     */
    public counters.minter.grpc.client.CoinOrBuilder getCoinToBuyOrBuilder() {
      if (coinToBuyBuilder_ != null) {
        return coinToBuyBuilder_.getMessageOrBuilder();
      } else {
        return coinToBuy_ == null ?
            counters.minter.grpc.client.Coin.getDefaultInstance() : coinToBuy_;
      }
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> 
        getCoinToBuyFieldBuilder() {
      if (coinToBuyBuilder_ == null) {
        coinToBuyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder>(
                getCoinToBuy(),
                getParentForChildren(),
                isClean());
        coinToBuy_ = null;
      }
      return coinToBuyBuilder_;
    }

    private java.lang.Object valueToBuy_ = "";
    /**
     * <code>string value_to_buy = 4 [json_name = "valueToBuy"];</code>
     * @return The valueToBuy.
     */
    public java.lang.String getValueToBuy() {
      java.lang.Object ref = valueToBuy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valueToBuy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value_to_buy = 4 [json_name = "valueToBuy"];</code>
     * @return The bytes for valueToBuy.
     */
    public com.google.protobuf.ByteString
        getValueToBuyBytes() {
      java.lang.Object ref = valueToBuy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valueToBuy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value_to_buy = 4 [json_name = "valueToBuy"];</code>
     * @param value The valueToBuy to set.
     * @return This builder for chaining.
     */
    public Builder setValueToBuy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valueToBuy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string value_to_buy = 4 [json_name = "valueToBuy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValueToBuy() {
      
      valueToBuy_ = getDefaultInstance().getValueToBuy();
      onChanged();
      return this;
    }
    /**
     * <code>string value_to_buy = 4 [json_name = "valueToBuy"];</code>
     * @param value The bytes for valueToBuy to set.
     * @return This builder for chaining.
     */
    public Builder setValueToBuyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      valueToBuy_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.AddLimitOrderData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.AddLimitOrderData)
  private static final counters.minter.grpc.client.AddLimitOrderData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.AddLimitOrderData();
  }

  public static counters.minter.grpc.client.AddLimitOrderData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddLimitOrderData>
      PARSER = new com.google.protobuf.AbstractParser<AddLimitOrderData>() {
    @java.lang.Override
    public AddLimitOrderData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddLimitOrderData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddLimitOrderData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddLimitOrderData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.AddLimitOrderData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
