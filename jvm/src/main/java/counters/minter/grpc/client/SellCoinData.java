// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.SellCoinData}
 */
public final class SellCoinData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.SellCoinData)
    SellCoinDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SellCoinData.newBuilder() to construct.
  private SellCoinData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SellCoinData() {
    valueToSell_ = "";
    minimumValueToBuy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SellCoinData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SellCoinData(
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

            minimumValueToBuy_ = s;
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
    return counters.minter.grpc.client.Data.internal_static_api_pb_SellCoinData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_SellCoinData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.SellCoinData.class, counters.minter.grpc.client.SellCoinData.Builder.class);
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

  public static final int MINIMUM_VALUE_TO_BUY_FIELD_NUMBER = 4;
  private volatile java.lang.Object minimumValueToBuy_;
  /**
   * <code>string minimum_value_to_buy = 4 [json_name = "minimumValueToBuy"];</code>
   * @return The minimumValueToBuy.
   */
  @java.lang.Override
  public java.lang.String getMinimumValueToBuy() {
    java.lang.Object ref = minimumValueToBuy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      minimumValueToBuy_ = s;
      return s;
    }
  }
  /**
   * <code>string minimum_value_to_buy = 4 [json_name = "minimumValueToBuy"];</code>
   * @return The bytes for minimumValueToBuy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMinimumValueToBuyBytes() {
    java.lang.Object ref = minimumValueToBuy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      minimumValueToBuy_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minimumValueToBuy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, minimumValueToBuy_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minimumValueToBuy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, minimumValueToBuy_);
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
    if (!(obj instanceof counters.minter.grpc.client.SellCoinData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.SellCoinData other = (counters.minter.grpc.client.SellCoinData) obj;

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
    if (!getMinimumValueToBuy()
        .equals(other.getMinimumValueToBuy())) return false;
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
    hash = (37 * hash) + MINIMUM_VALUE_TO_BUY_FIELD_NUMBER;
    hash = (53 * hash) + getMinimumValueToBuy().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.SellCoinData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.SellCoinData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellCoinData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.SellCoinData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellCoinData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.SellCoinData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellCoinData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.SellCoinData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellCoinData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.SellCoinData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellCoinData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.SellCoinData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.SellCoinData prototype) {
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
   * Protobuf type {@code api_pb.SellCoinData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.SellCoinData)
      counters.minter.grpc.client.SellCoinDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_SellCoinData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_SellCoinData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.SellCoinData.class, counters.minter.grpc.client.SellCoinData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.SellCoinData.newBuilder()
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
      minimumValueToBuy_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_SellCoinData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.SellCoinData getDefaultInstanceForType() {
      return counters.minter.grpc.client.SellCoinData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.SellCoinData build() {
      counters.minter.grpc.client.SellCoinData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.SellCoinData buildPartial() {
      counters.minter.grpc.client.SellCoinData result = new counters.minter.grpc.client.SellCoinData(this);
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
      result.minimumValueToBuy_ = minimumValueToBuy_;
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
      if (other instanceof counters.minter.grpc.client.SellCoinData) {
        return mergeFrom((counters.minter.grpc.client.SellCoinData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.SellCoinData other) {
      if (other == counters.minter.grpc.client.SellCoinData.getDefaultInstance()) return this;
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
      if (!other.getMinimumValueToBuy().isEmpty()) {
        minimumValueToBuy_ = other.minimumValueToBuy_;
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
      counters.minter.grpc.client.SellCoinData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.SellCoinData) e.getUnfinishedMessage();
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

    private java.lang.Object minimumValueToBuy_ = "";
    /**
     * <code>string minimum_value_to_buy = 4 [json_name = "minimumValueToBuy"];</code>
     * @return The minimumValueToBuy.
     */
    public java.lang.String getMinimumValueToBuy() {
      java.lang.Object ref = minimumValueToBuy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        minimumValueToBuy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string minimum_value_to_buy = 4 [json_name = "minimumValueToBuy"];</code>
     * @return The bytes for minimumValueToBuy.
     */
    public com.google.protobuf.ByteString
        getMinimumValueToBuyBytes() {
      java.lang.Object ref = minimumValueToBuy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minimumValueToBuy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string minimum_value_to_buy = 4 [json_name = "minimumValueToBuy"];</code>
     * @param value The minimumValueToBuy to set.
     * @return This builder for chaining.
     */
    public Builder setMinimumValueToBuy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      minimumValueToBuy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string minimum_value_to_buy = 4 [json_name = "minimumValueToBuy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinimumValueToBuy() {
      
      minimumValueToBuy_ = getDefaultInstance().getMinimumValueToBuy();
      onChanged();
      return this;
    }
    /**
     * <code>string minimum_value_to_buy = 4 [json_name = "minimumValueToBuy"];</code>
     * @param value The bytes for minimumValueToBuy to set.
     * @return This builder for chaining.
     */
    public Builder setMinimumValueToBuyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      minimumValueToBuy_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.SellCoinData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.SellCoinData)
  private static final counters.minter.grpc.client.SellCoinData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.SellCoinData();
  }

  public static counters.minter.grpc.client.SellCoinData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SellCoinData>
      PARSER = new com.google.protobuf.AbstractParser<SellCoinData>() {
    @java.lang.Override
    public SellCoinData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SellCoinData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SellCoinData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SellCoinData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.SellCoinData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
