// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.SellAllSwapPoolData}
 */
public final class SellAllSwapPoolData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.SellAllSwapPoolData)
    SellAllSwapPoolDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SellAllSwapPoolData.newBuilder() to construct.
  private SellAllSwapPoolData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SellAllSwapPoolData() {
    coins_ = java.util.Collections.emptyList();
    minimumValueToBuy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SellAllSwapPoolData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SellAllSwapPoolData(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              coins_ = new java.util.ArrayList<counters.minter.grpc.client.Coin>();
              mutable_bitField0_ |= 0x00000001;
            }
            coins_.add(
                input.readMessage(counters.minter.grpc.client.Coin.parser(), extensionRegistry));
            break;
          }
          case 26: {
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        coins_ = java.util.Collections.unmodifiableList(coins_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_SellAllSwapPoolData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_SellAllSwapPoolData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.SellAllSwapPoolData.class, counters.minter.grpc.client.SellAllSwapPoolData.Builder.class);
  }

  public static final int COINS_FIELD_NUMBER = 1;
  private java.util.List<counters.minter.grpc.client.Coin> coins_;
  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  @java.lang.Override
  public java.util.List<counters.minter.grpc.client.Coin> getCoinsList() {
    return coins_;
  }
  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends counters.minter.grpc.client.CoinOrBuilder> 
      getCoinsOrBuilderList() {
    return coins_;
  }
  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  @java.lang.Override
  public int getCoinsCount() {
    return coins_.size();
  }
  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.Coin getCoins(int index) {
    return coins_.get(index);
  }
  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.CoinOrBuilder getCoinsOrBuilder(
      int index) {
    return coins_.get(index);
  }

  public static final int MINIMUM_VALUE_TO_BUY_FIELD_NUMBER = 3;
  private volatile java.lang.Object minimumValueToBuy_;
  /**
   * <code>string minimum_value_to_buy = 3;</code>
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
   * <code>string minimum_value_to_buy = 3;</code>
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
    for (int i = 0; i < coins_.size(); i++) {
      output.writeMessage(1, coins_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minimumValueToBuy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, minimumValueToBuy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < coins_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, coins_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minimumValueToBuy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, minimumValueToBuy_);
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
    if (!(obj instanceof counters.minter.grpc.client.SellAllSwapPoolData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.SellAllSwapPoolData other = (counters.minter.grpc.client.SellAllSwapPoolData) obj;

    if (!getCoinsList()
        .equals(other.getCoinsList())) return false;
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
    if (getCoinsCount() > 0) {
      hash = (37 * hash) + COINS_FIELD_NUMBER;
      hash = (53 * hash) + getCoinsList().hashCode();
    }
    hash = (37 * hash) + MINIMUM_VALUE_TO_BUY_FIELD_NUMBER;
    hash = (53 * hash) + getMinimumValueToBuy().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.SellAllSwapPoolData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.SellAllSwapPoolData prototype) {
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
   * Protobuf type {@code api_pb.SellAllSwapPoolData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.SellAllSwapPoolData)
      counters.minter.grpc.client.SellAllSwapPoolDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_SellAllSwapPoolData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_SellAllSwapPoolData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.SellAllSwapPoolData.class, counters.minter.grpc.client.SellAllSwapPoolData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.SellAllSwapPoolData.newBuilder()
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
        getCoinsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (coinsBuilder_ == null) {
        coins_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        coinsBuilder_.clear();
      }
      minimumValueToBuy_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_SellAllSwapPoolData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.SellAllSwapPoolData getDefaultInstanceForType() {
      return counters.minter.grpc.client.SellAllSwapPoolData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.SellAllSwapPoolData build() {
      counters.minter.grpc.client.SellAllSwapPoolData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.SellAllSwapPoolData buildPartial() {
      counters.minter.grpc.client.SellAllSwapPoolData result = new counters.minter.grpc.client.SellAllSwapPoolData(this);
      int from_bitField0_ = bitField0_;
      if (coinsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          coins_ = java.util.Collections.unmodifiableList(coins_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.coins_ = coins_;
      } else {
        result.coins_ = coinsBuilder_.build();
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
      if (other instanceof counters.minter.grpc.client.SellAllSwapPoolData) {
        return mergeFrom((counters.minter.grpc.client.SellAllSwapPoolData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.SellAllSwapPoolData other) {
      if (other == counters.minter.grpc.client.SellAllSwapPoolData.getDefaultInstance()) return this;
      if (coinsBuilder_ == null) {
        if (!other.coins_.isEmpty()) {
          if (coins_.isEmpty()) {
            coins_ = other.coins_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCoinsIsMutable();
            coins_.addAll(other.coins_);
          }
          onChanged();
        }
      } else {
        if (!other.coins_.isEmpty()) {
          if (coinsBuilder_.isEmpty()) {
            coinsBuilder_.dispose();
            coinsBuilder_ = null;
            coins_ = other.coins_;
            bitField0_ = (bitField0_ & ~0x00000001);
            coinsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCoinsFieldBuilder() : null;
          } else {
            coinsBuilder_.addAllMessages(other.coins_);
          }
        }
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
      counters.minter.grpc.client.SellAllSwapPoolData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.SellAllSwapPoolData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<counters.minter.grpc.client.Coin> coins_ =
      java.util.Collections.emptyList();
    private void ensureCoinsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        coins_ = new java.util.ArrayList<counters.minter.grpc.client.Coin>(coins_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> coinsBuilder_;

    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public java.util.List<counters.minter.grpc.client.Coin> getCoinsList() {
      if (coinsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(coins_);
      } else {
        return coinsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public int getCoinsCount() {
      if (coinsBuilder_ == null) {
        return coins_.size();
      } else {
        return coinsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public counters.minter.grpc.client.Coin getCoins(int index) {
      if (coinsBuilder_ == null) {
        return coins_.get(index);
      } else {
        return coinsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public Builder setCoins(
        int index, counters.minter.grpc.client.Coin value) {
      if (coinsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoinsIsMutable();
        coins_.set(index, value);
        onChanged();
      } else {
        coinsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public Builder setCoins(
        int index, counters.minter.grpc.client.Coin.Builder builderForValue) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        coins_.set(index, builderForValue.build());
        onChanged();
      } else {
        coinsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public Builder addCoins(counters.minter.grpc.client.Coin value) {
      if (coinsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoinsIsMutable();
        coins_.add(value);
        onChanged();
      } else {
        coinsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public Builder addCoins(
        int index, counters.minter.grpc.client.Coin value) {
      if (coinsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoinsIsMutable();
        coins_.add(index, value);
        onChanged();
      } else {
        coinsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public Builder addCoins(
        counters.minter.grpc.client.Coin.Builder builderForValue) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        coins_.add(builderForValue.build());
        onChanged();
      } else {
        coinsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public Builder addCoins(
        int index, counters.minter.grpc.client.Coin.Builder builderForValue) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        coins_.add(index, builderForValue.build());
        onChanged();
      } else {
        coinsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public Builder addAllCoins(
        java.lang.Iterable<? extends counters.minter.grpc.client.Coin> values) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, coins_);
        onChanged();
      } else {
        coinsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public Builder clearCoins() {
      if (coinsBuilder_ == null) {
        coins_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        coinsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public Builder removeCoins(int index) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        coins_.remove(index);
        onChanged();
      } else {
        coinsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public counters.minter.grpc.client.Coin.Builder getCoinsBuilder(
        int index) {
      return getCoinsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public counters.minter.grpc.client.CoinOrBuilder getCoinsOrBuilder(
        int index) {
      if (coinsBuilder_ == null) {
        return coins_.get(index);  } else {
        return coinsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public java.util.List<? extends counters.minter.grpc.client.CoinOrBuilder> 
         getCoinsOrBuilderList() {
      if (coinsBuilder_ != null) {
        return coinsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(coins_);
      }
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public counters.minter.grpc.client.Coin.Builder addCoinsBuilder() {
      return getCoinsFieldBuilder().addBuilder(
          counters.minter.grpc.client.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public counters.minter.grpc.client.Coin.Builder addCoinsBuilder(
        int index) {
      return getCoinsFieldBuilder().addBuilder(
          index, counters.minter.grpc.client.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    public java.util.List<counters.minter.grpc.client.Coin.Builder> 
         getCoinsBuilderList() {
      return getCoinsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder> 
        getCoinsFieldBuilder() {
      if (coinsBuilder_ == null) {
        coinsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            counters.minter.grpc.client.Coin, counters.minter.grpc.client.Coin.Builder, counters.minter.grpc.client.CoinOrBuilder>(
                coins_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        coins_ = null;
      }
      return coinsBuilder_;
    }

    private java.lang.Object minimumValueToBuy_ = "";
    /**
     * <code>string minimum_value_to_buy = 3;</code>
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
     * <code>string minimum_value_to_buy = 3;</code>
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
     * <code>string minimum_value_to_buy = 3;</code>
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
     * <code>string minimum_value_to_buy = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinimumValueToBuy() {
      
      minimumValueToBuy_ = getDefaultInstance().getMinimumValueToBuy();
      onChanged();
      return this;
    }
    /**
     * <code>string minimum_value_to_buy = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:api_pb.SellAllSwapPoolData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.SellAllSwapPoolData)
  private static final counters.minter.grpc.client.SellAllSwapPoolData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.SellAllSwapPoolData();
  }

  public static counters.minter.grpc.client.SellAllSwapPoolData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SellAllSwapPoolData>
      PARSER = new com.google.protobuf.AbstractParser<SellAllSwapPoolData>() {
    @java.lang.Override
    public SellAllSwapPoolData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SellAllSwapPoolData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SellAllSwapPoolData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SellAllSwapPoolData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.SellAllSwapPoolData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

