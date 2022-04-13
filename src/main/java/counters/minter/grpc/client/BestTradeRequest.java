// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.BestTradeRequest}
 */
public final class BestTradeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.BestTradeRequest)
    BestTradeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BestTradeRequest.newBuilder() to construct.
  private BestTradeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BestTradeRequest() {
    amount_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BestTradeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BestTradeRequest(
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
          case 8: {

            sellCoin_ = input.readUInt64();
            break;
          }
          case 16: {

            buyCoin_ = input.readUInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            amount_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 40: {

            height_ = input.readUInt64();
            break;
          }
          case 48: {

            maxDepth_ = input.readInt32();
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
    return counters.minter.grpc.client.Resources.internal_static_api_pb_BestTradeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_BestTradeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.BestTradeRequest.class, counters.minter.grpc.client.BestTradeRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code api_pb.BestTradeRequest.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>input = 0;</code>
     */
    input(0),
    /**
     * <code>output = 1;</code>
     */
    output(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>input = 0;</code>
     */
    public static final int input_VALUE = 0;
    /**
     * <code>output = 1;</code>
     */
    public static final int output_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return input;
        case 1: return output;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return counters.minter.grpc.client.BestTradeRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:api_pb.BestTradeRequest.Type)
  }

  public static final int SELL_COIN_FIELD_NUMBER = 1;
  private long sellCoin_;
  /**
   * <code>uint64 sell_coin = 1 [json_name = "sellCoin"];</code>
   * @return The sellCoin.
   */
  @java.lang.Override
  public long getSellCoin() {
    return sellCoin_;
  }

  public static final int BUY_COIN_FIELD_NUMBER = 2;
  private long buyCoin_;
  /**
   * <code>uint64 buy_coin = 2 [json_name = "buyCoin"];</code>
   * @return The buyCoin.
   */
  @java.lang.Override
  public long getBuyCoin() {
    return buyCoin_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private volatile java.lang.Object amount_;
  /**
   * <code>string amount = 3 [json_name = "amount"];</code>
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
   * <code>string amount = 3 [json_name = "amount"];</code>
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

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_;
  /**
   * <code>.api_pb.BestTradeRequest.Type type = 4 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.api_pb.BestTradeRequest.Type type = 4 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public counters.minter.grpc.client.BestTradeRequest.Type getType() {
    @SuppressWarnings("deprecation")
    counters.minter.grpc.client.BestTradeRequest.Type result = counters.minter.grpc.client.BestTradeRequest.Type.valueOf(type_);
    return result == null ? counters.minter.grpc.client.BestTradeRequest.Type.UNRECOGNIZED : result;
  }

  public static final int HEIGHT_FIELD_NUMBER = 5;
  private long height_;
  /**
   * <code>uint64 height = 5 [json_name = "height"];</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int MAX_DEPTH_FIELD_NUMBER = 6;
  private int maxDepth_;
  /**
   * <code>int32 max_depth = 6 [json_name = "maxDepth"];</code>
   * @return The maxDepth.
   */
  @java.lang.Override
  public int getMaxDepth() {
    return maxDepth_;
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
    if (sellCoin_ != 0L) {
      output.writeUInt64(1, sellCoin_);
    }
    if (buyCoin_ != 0L) {
      output.writeUInt64(2, buyCoin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, amount_);
    }
    if (type_ != counters.minter.grpc.client.BestTradeRequest.Type.input.getNumber()) {
      output.writeEnum(4, type_);
    }
    if (height_ != 0L) {
      output.writeUInt64(5, height_);
    }
    if (maxDepth_ != 0) {
      output.writeInt32(6, maxDepth_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sellCoin_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, sellCoin_);
    }
    if (buyCoin_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, buyCoin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, amount_);
    }
    if (type_ != counters.minter.grpc.client.BestTradeRequest.Type.input.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, type_);
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, height_);
    }
    if (maxDepth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, maxDepth_);
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
    if (!(obj instanceof counters.minter.grpc.client.BestTradeRequest)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.BestTradeRequest other = (counters.minter.grpc.client.BestTradeRequest) obj;

    if (getSellCoin()
        != other.getSellCoin()) return false;
    if (getBuyCoin()
        != other.getBuyCoin()) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (type_ != other.type_) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (getMaxDepth()
        != other.getMaxDepth()) return false;
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
    hash = (37 * hash) + SELL_COIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSellCoin());
    hash = (37 * hash) + BUY_COIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBuyCoin());
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + MAX_DEPTH_FIELD_NUMBER;
    hash = (53 * hash) + getMaxDepth();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.BestTradeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.BestTradeRequest parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.BestTradeRequest prototype) {
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
   * Protobuf type {@code api_pb.BestTradeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.BestTradeRequest)
      counters.minter.grpc.client.BestTradeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_BestTradeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_BestTradeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.BestTradeRequest.class, counters.minter.grpc.client.BestTradeRequest.Builder.class);
    }

    // Construct using counters.minter.grpc.client.BestTradeRequest.newBuilder()
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
      sellCoin_ = 0L;

      buyCoin_ = 0L;

      amount_ = "";

      type_ = 0;

      height_ = 0L;

      maxDepth_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_BestTradeRequest_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.BestTradeRequest getDefaultInstanceForType() {
      return counters.minter.grpc.client.BestTradeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.BestTradeRequest build() {
      counters.minter.grpc.client.BestTradeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.BestTradeRequest buildPartial() {
      counters.minter.grpc.client.BestTradeRequest result = new counters.minter.grpc.client.BestTradeRequest(this);
      result.sellCoin_ = sellCoin_;
      result.buyCoin_ = buyCoin_;
      result.amount_ = amount_;
      result.type_ = type_;
      result.height_ = height_;
      result.maxDepth_ = maxDepth_;
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
      if (other instanceof counters.minter.grpc.client.BestTradeRequest) {
        return mergeFrom((counters.minter.grpc.client.BestTradeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.BestTradeRequest other) {
      if (other == counters.minter.grpc.client.BestTradeRequest.getDefaultInstance()) return this;
      if (other.getSellCoin() != 0L) {
        setSellCoin(other.getSellCoin());
      }
      if (other.getBuyCoin() != 0L) {
        setBuyCoin(other.getBuyCoin());
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getMaxDepth() != 0) {
        setMaxDepth(other.getMaxDepth());
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
      counters.minter.grpc.client.BestTradeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.BestTradeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long sellCoin_ ;
    /**
     * <code>uint64 sell_coin = 1 [json_name = "sellCoin"];</code>
     * @return The sellCoin.
     */
    @java.lang.Override
    public long getSellCoin() {
      return sellCoin_;
    }
    /**
     * <code>uint64 sell_coin = 1 [json_name = "sellCoin"];</code>
     * @param value The sellCoin to set.
     * @return This builder for chaining.
     */
    public Builder setSellCoin(long value) {
      
      sellCoin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 sell_coin = 1 [json_name = "sellCoin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSellCoin() {
      
      sellCoin_ = 0L;
      onChanged();
      return this;
    }

    private long buyCoin_ ;
    /**
     * <code>uint64 buy_coin = 2 [json_name = "buyCoin"];</code>
     * @return The buyCoin.
     */
    @java.lang.Override
    public long getBuyCoin() {
      return buyCoin_;
    }
    /**
     * <code>uint64 buy_coin = 2 [json_name = "buyCoin"];</code>
     * @param value The buyCoin to set.
     * @return This builder for chaining.
     */
    public Builder setBuyCoin(long value) {
      
      buyCoin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 buy_coin = 2 [json_name = "buyCoin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBuyCoin() {
      
      buyCoin_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
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
     * <code>string amount = 3 [json_name = "amount"];</code>
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
     * <code>string amount = 3 [json_name = "amount"];</code>
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
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
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

    private int type_ = 0;
    /**
     * <code>.api_pb.BestTradeRequest.Type type = 4 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.api_pb.BestTradeRequest.Type type = 4 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.api_pb.BestTradeRequest.Type type = 4 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public counters.minter.grpc.client.BestTradeRequest.Type getType() {
      @SuppressWarnings("deprecation")
      counters.minter.grpc.client.BestTradeRequest.Type result = counters.minter.grpc.client.BestTradeRequest.Type.valueOf(type_);
      return result == null ? counters.minter.grpc.client.BestTradeRequest.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.api_pb.BestTradeRequest.Type type = 4 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(counters.minter.grpc.client.BestTradeRequest.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api_pb.BestTradeRequest.Type type = 4 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long height_ ;
    /**
     * <code>uint64 height = 5 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>uint64 height = 5 [json_name = "height"];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 height = 5 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0L;
      onChanged();
      return this;
    }

    private int maxDepth_ ;
    /**
     * <code>int32 max_depth = 6 [json_name = "maxDepth"];</code>
     * @return The maxDepth.
     */
    @java.lang.Override
    public int getMaxDepth() {
      return maxDepth_;
    }
    /**
     * <code>int32 max_depth = 6 [json_name = "maxDepth"];</code>
     * @param value The maxDepth to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDepth(int value) {
      
      maxDepth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_depth = 6 [json_name = "maxDepth"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxDepth() {
      
      maxDepth_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api_pb.BestTradeRequest)
  }

  // @@protoc_insertion_point(class_scope:api_pb.BestTradeRequest)
  private static final counters.minter.grpc.client.BestTradeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.BestTradeRequest();
  }

  public static counters.minter.grpc.client.BestTradeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BestTradeRequest>
      PARSER = new com.google.protobuf.AbstractParser<BestTradeRequest>() {
    @java.lang.Override
    public BestTradeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BestTradeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BestTradeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BestTradeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.BestTradeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

