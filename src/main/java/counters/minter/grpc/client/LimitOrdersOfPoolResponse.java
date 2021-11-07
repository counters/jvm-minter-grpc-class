// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.LimitOrdersOfPoolResponse}
 */
public final class LimitOrdersOfPoolResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.LimitOrdersOfPoolResponse)
    LimitOrdersOfPoolResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LimitOrdersOfPoolResponse.newBuilder() to construct.
  private LimitOrdersOfPoolResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LimitOrdersOfPoolResponse() {
    poolPrice_ = "";
    orders_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LimitOrdersOfPoolResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LimitOrdersOfPoolResponse(
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
              orders_ = new java.util.ArrayList<counters.minter.grpc.client.LimitOrderResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            orders_.add(
                input.readMessage(counters.minter.grpc.client.LimitOrderResponse.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            poolPrice_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        orders_ = java.util.Collections.unmodifiableList(orders_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_LimitOrdersOfPoolResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_LimitOrdersOfPoolResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.LimitOrdersOfPoolResponse.class, counters.minter.grpc.client.LimitOrdersOfPoolResponse.Builder.class);
  }

  public static final int POOL_PRICE_FIELD_NUMBER = 2;
  private volatile java.lang.Object poolPrice_;
  /**
   * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
   * @return The poolPrice.
   */
  @java.lang.Override
  public java.lang.String getPoolPrice() {
    java.lang.Object ref = poolPrice_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poolPrice_ = s;
      return s;
    }
  }
  /**
   * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
   * @return The bytes for poolPrice.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoolPriceBytes() {
    java.lang.Object ref = poolPrice_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poolPrice_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERS_FIELD_NUMBER = 1;
  private java.util.List<counters.minter.grpc.client.LimitOrderResponse> orders_;
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public java.util.List<counters.minter.grpc.client.LimitOrderResponse> getOrdersList() {
    return orders_;
  }
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends counters.minter.grpc.client.LimitOrderResponseOrBuilder> 
      getOrdersOrBuilderList() {
    return orders_;
  }
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public int getOrdersCount() {
    return orders_.size();
  }
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.LimitOrderResponse getOrders(int index) {
    return orders_.get(index);
  }
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public counters.minter.grpc.client.LimitOrderResponseOrBuilder getOrdersOrBuilder(
      int index) {
    return orders_.get(index);
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
    for (int i = 0; i < orders_.size(); i++) {
      output.writeMessage(1, orders_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolPrice_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, poolPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < orders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, orders_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolPrice_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, poolPrice_);
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
    if (!(obj instanceof counters.minter.grpc.client.LimitOrdersOfPoolResponse)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.LimitOrdersOfPoolResponse other = (counters.minter.grpc.client.LimitOrdersOfPoolResponse) obj;

    if (!getPoolPrice()
        .equals(other.getPoolPrice())) return false;
    if (!getOrdersList()
        .equals(other.getOrdersList())) return false;
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
    hash = (37 * hash) + POOL_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPoolPrice().hashCode();
    if (getOrdersCount() > 0) {
      hash = (37 * hash) + ORDERS_FIELD_NUMBER;
      hash = (53 * hash) + getOrdersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.LimitOrdersOfPoolResponse prototype) {
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
   * Protobuf type {@code api_pb.LimitOrdersOfPoolResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.LimitOrdersOfPoolResponse)
      counters.minter.grpc.client.LimitOrdersOfPoolResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_LimitOrdersOfPoolResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_LimitOrdersOfPoolResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.LimitOrdersOfPoolResponse.class, counters.minter.grpc.client.LimitOrdersOfPoolResponse.Builder.class);
    }

    // Construct using counters.minter.grpc.client.LimitOrdersOfPoolResponse.newBuilder()
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
        getOrdersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      poolPrice_ = "";

      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ordersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_LimitOrdersOfPoolResponse_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.LimitOrdersOfPoolResponse getDefaultInstanceForType() {
      return counters.minter.grpc.client.LimitOrdersOfPoolResponse.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.LimitOrdersOfPoolResponse build() {
      counters.minter.grpc.client.LimitOrdersOfPoolResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.LimitOrdersOfPoolResponse buildPartial() {
      counters.minter.grpc.client.LimitOrdersOfPoolResponse result = new counters.minter.grpc.client.LimitOrdersOfPoolResponse(this);
      int from_bitField0_ = bitField0_;
      result.poolPrice_ = poolPrice_;
      if (ordersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          orders_ = java.util.Collections.unmodifiableList(orders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.orders_ = orders_;
      } else {
        result.orders_ = ordersBuilder_.build();
      }
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
      if (other instanceof counters.minter.grpc.client.LimitOrdersOfPoolResponse) {
        return mergeFrom((counters.minter.grpc.client.LimitOrdersOfPoolResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.LimitOrdersOfPoolResponse other) {
      if (other == counters.minter.grpc.client.LimitOrdersOfPoolResponse.getDefaultInstance()) return this;
      if (!other.getPoolPrice().isEmpty()) {
        poolPrice_ = other.poolPrice_;
        onChanged();
      }
      if (ordersBuilder_ == null) {
        if (!other.orders_.isEmpty()) {
          if (orders_.isEmpty()) {
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrdersIsMutable();
            orders_.addAll(other.orders_);
          }
          onChanged();
        }
      } else {
        if (!other.orders_.isEmpty()) {
          if (ordersBuilder_.isEmpty()) {
            ordersBuilder_.dispose();
            ordersBuilder_ = null;
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ordersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrdersFieldBuilder() : null;
          } else {
            ordersBuilder_.addAllMessages(other.orders_);
          }
        }
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
      counters.minter.grpc.client.LimitOrdersOfPoolResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.LimitOrdersOfPoolResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object poolPrice_ = "";
    /**
     * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
     * @return The poolPrice.
     */
    public java.lang.String getPoolPrice() {
      java.lang.Object ref = poolPrice_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poolPrice_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
     * @return The bytes for poolPrice.
     */
    public com.google.protobuf.ByteString
        getPoolPriceBytes() {
      java.lang.Object ref = poolPrice_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poolPrice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
     * @param value The poolPrice to set.
     * @return This builder for chaining.
     */
    public Builder setPoolPrice(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      poolPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolPrice() {
      
      poolPrice_ = getDefaultInstance().getPoolPrice();
      onChanged();
      return this;
    }
    /**
     * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
     * @param value The bytes for poolPrice to set.
     * @return This builder for chaining.
     */
    public Builder setPoolPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      poolPrice_ = value;
      onChanged();
      return this;
    }

    private java.util.List<counters.minter.grpc.client.LimitOrderResponse> orders_ =
      java.util.Collections.emptyList();
    private void ensureOrdersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        orders_ = new java.util.ArrayList<counters.minter.grpc.client.LimitOrderResponse>(orders_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        counters.minter.grpc.client.LimitOrderResponse, counters.minter.grpc.client.LimitOrderResponse.Builder, counters.minter.grpc.client.LimitOrderResponseOrBuilder> ordersBuilder_;

    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public java.util.List<counters.minter.grpc.client.LimitOrderResponse> getOrdersList() {
      if (ordersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orders_);
      } else {
        return ordersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public int getOrdersCount() {
      if (ordersBuilder_ == null) {
        return orders_.size();
      } else {
        return ordersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public counters.minter.grpc.client.LimitOrderResponse getOrders(int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);
      } else {
        return ordersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public Builder setOrders(
        int index, counters.minter.grpc.client.LimitOrderResponse value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.set(index, value);
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public Builder setOrders(
        int index, counters.minter.grpc.client.LimitOrderResponse.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.set(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public Builder addOrders(counters.minter.grpc.client.LimitOrderResponse value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public Builder addOrders(
        int index, counters.minter.grpc.client.LimitOrderResponse value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(index, value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public Builder addOrders(
        counters.minter.grpc.client.LimitOrderResponse.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public Builder addOrders(
        int index, counters.minter.grpc.client.LimitOrderResponse.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public Builder addAllOrders(
        java.lang.Iterable<? extends counters.minter.grpc.client.LimitOrderResponse> values) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, orders_);
        onChanged();
      } else {
        ordersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public Builder clearOrders() {
      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ordersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public Builder removeOrders(int index) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.remove(index);
        onChanged();
      } else {
        ordersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public counters.minter.grpc.client.LimitOrderResponse.Builder getOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public counters.minter.grpc.client.LimitOrderResponseOrBuilder getOrdersOrBuilder(
        int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);  } else {
        return ordersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public java.util.List<? extends counters.minter.grpc.client.LimitOrderResponseOrBuilder> 
         getOrdersOrBuilderList() {
      if (ordersBuilder_ != null) {
        return ordersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orders_);
      }
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public counters.minter.grpc.client.LimitOrderResponse.Builder addOrdersBuilder() {
      return getOrdersFieldBuilder().addBuilder(
          counters.minter.grpc.client.LimitOrderResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public counters.minter.grpc.client.LimitOrderResponse.Builder addOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().addBuilder(
          index, counters.minter.grpc.client.LimitOrderResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
     */
    public java.util.List<counters.minter.grpc.client.LimitOrderResponse.Builder> 
         getOrdersBuilderList() {
      return getOrdersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        counters.minter.grpc.client.LimitOrderResponse, counters.minter.grpc.client.LimitOrderResponse.Builder, counters.minter.grpc.client.LimitOrderResponseOrBuilder> 
        getOrdersFieldBuilder() {
      if (ordersBuilder_ == null) {
        ordersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            counters.minter.grpc.client.LimitOrderResponse, counters.minter.grpc.client.LimitOrderResponse.Builder, counters.minter.grpc.client.LimitOrderResponseOrBuilder>(
                orders_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        orders_ = null;
      }
      return ordersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api_pb.LimitOrdersOfPoolResponse)
  }

  // @@protoc_insertion_point(class_scope:api_pb.LimitOrdersOfPoolResponse)
  private static final counters.minter.grpc.client.LimitOrdersOfPoolResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.LimitOrdersOfPoolResponse();
  }

  public static counters.minter.grpc.client.LimitOrdersOfPoolResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LimitOrdersOfPoolResponse>
      PARSER = new com.google.protobuf.AbstractParser<LimitOrdersOfPoolResponse>() {
    @java.lang.Override
    public LimitOrdersOfPoolResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LimitOrdersOfPoolResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LimitOrdersOfPoolResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LimitOrdersOfPoolResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.LimitOrdersOfPoolResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
