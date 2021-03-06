// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.FrozenAllRequest}
 */
public final class FrozenAllRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.FrozenAllRequest)
    FrozenAllRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FrozenAllRequest.newBuilder() to construct.
  private FrozenAllRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FrozenAllRequest() {
    addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    coinIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FrozenAllRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FrozenAllRequest(
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
          case 8: {

            startHeight_ = input.readUInt64();
            break;
          }
          case 16: {

            endHeight_ = input.readUInt64();
            break;
          }
          case 24: {

            height_ = input.readUInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              addresses_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            addresses_.add(s);
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              coinIds_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            coinIds_.addLong(input.readUInt64());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              coinIds_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              coinIds_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
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
        addresses_ = addresses_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        coinIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_FrozenAllRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_FrozenAllRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.FrozenAllRequest.class, counters.minter.grpc.client.FrozenAllRequest.Builder.class);
  }

  public static final int START_HEIGHT_FIELD_NUMBER = 1;
  private long startHeight_;
  /**
   * <code>uint64 start_height = 1;</code>
   * @return The startHeight.
   */
  @java.lang.Override
  public long getStartHeight() {
    return startHeight_;
  }

  public static final int END_HEIGHT_FIELD_NUMBER = 2;
  private long endHeight_;
  /**
   * <code>uint64 end_height = 2;</code>
   * @return The endHeight.
   */
  @java.lang.Override
  public long getEndHeight() {
    return endHeight_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private long height_;
  /**
   * <code>uint64 height = 3;</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int ADDRESSES_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList addresses_;
  /**
   * <code>repeated string addresses = 4;</code>
   * @return A list containing the addresses.
   */
  public com.google.protobuf.ProtocolStringList
      getAddressesList() {
    return addresses_;
  }
  /**
   * <code>repeated string addresses = 4;</code>
   * @return The count of addresses.
   */
  public int getAddressesCount() {
    return addresses_.size();
  }
  /**
   * <code>repeated string addresses = 4;</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  public java.lang.String getAddresses(int index) {
    return addresses_.get(index);
  }
  /**
   * <code>repeated string addresses = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  public com.google.protobuf.ByteString
      getAddressesBytes(int index) {
    return addresses_.getByteString(index);
  }

  public static final int COIN_IDS_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.LongList coinIds_;
  /**
   * <code>repeated uint64 coin_ids = 5;</code>
   * @return A list containing the coinIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getCoinIdsList() {
    return coinIds_;
  }
  /**
   * <code>repeated uint64 coin_ids = 5;</code>
   * @return The count of coinIds.
   */
  public int getCoinIdsCount() {
    return coinIds_.size();
  }
  /**
   * <code>repeated uint64 coin_ids = 5;</code>
   * @param index The index of the element to return.
   * @return The coinIds at the given index.
   */
  public long getCoinIds(int index) {
    return coinIds_.getLong(index);
  }
  private int coinIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (startHeight_ != 0L) {
      output.writeUInt64(1, startHeight_);
    }
    if (endHeight_ != 0L) {
      output.writeUInt64(2, endHeight_);
    }
    if (height_ != 0L) {
      output.writeUInt64(3, height_);
    }
    for (int i = 0; i < addresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, addresses_.getRaw(i));
    }
    if (getCoinIdsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(coinIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < coinIds_.size(); i++) {
      output.writeUInt64NoTag(coinIds_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, startHeight_);
    }
    if (endHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, endHeight_);
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, height_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < addresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(addresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAddressesList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < coinIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(coinIds_.getLong(i));
      }
      size += dataSize;
      if (!getCoinIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      coinIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof counters.minter.grpc.client.FrozenAllRequest)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.FrozenAllRequest other = (counters.minter.grpc.client.FrozenAllRequest) obj;

    if (getStartHeight()
        != other.getStartHeight()) return false;
    if (getEndHeight()
        != other.getEndHeight()) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (!getAddressesList()
        .equals(other.getAddressesList())) return false;
    if (!getCoinIdsList()
        .equals(other.getCoinIdsList())) return false;
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
    hash = (37 * hash) + START_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartHeight());
    hash = (37 * hash) + END_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndHeight());
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    if (getAddressesCount() > 0) {
      hash = (37 * hash) + ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getAddressesList().hashCode();
    }
    if (getCoinIdsCount() > 0) {
      hash = (37 * hash) + COIN_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getCoinIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.FrozenAllRequest parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.FrozenAllRequest prototype) {
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
   * Protobuf type {@code api_pb.FrozenAllRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.FrozenAllRequest)
      counters.minter.grpc.client.FrozenAllRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_FrozenAllRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_FrozenAllRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.FrozenAllRequest.class, counters.minter.grpc.client.FrozenAllRequest.Builder.class);
    }

    // Construct using counters.minter.grpc.client.FrozenAllRequest.newBuilder()
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
      startHeight_ = 0L;

      endHeight_ = 0L;

      height_ = 0L;

      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      coinIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_FrozenAllRequest_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.FrozenAllRequest getDefaultInstanceForType() {
      return counters.minter.grpc.client.FrozenAllRequest.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.FrozenAllRequest build() {
      counters.minter.grpc.client.FrozenAllRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.FrozenAllRequest buildPartial() {
      counters.minter.grpc.client.FrozenAllRequest result = new counters.minter.grpc.client.FrozenAllRequest(this);
      int from_bitField0_ = bitField0_;
      result.startHeight_ = startHeight_;
      result.endHeight_ = endHeight_;
      result.height_ = height_;
      if (((bitField0_ & 0x00000001) != 0)) {
        addresses_ = addresses_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.addresses_ = addresses_;
      if (((bitField0_ & 0x00000002) != 0)) {
        coinIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.coinIds_ = coinIds_;
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
      if (other instanceof counters.minter.grpc.client.FrozenAllRequest) {
        return mergeFrom((counters.minter.grpc.client.FrozenAllRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.FrozenAllRequest other) {
      if (other == counters.minter.grpc.client.FrozenAllRequest.getDefaultInstance()) return this;
      if (other.getStartHeight() != 0L) {
        setStartHeight(other.getStartHeight());
      }
      if (other.getEndHeight() != 0L) {
        setEndHeight(other.getEndHeight());
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (!other.addresses_.isEmpty()) {
        if (addresses_.isEmpty()) {
          addresses_ = other.addresses_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAddressesIsMutable();
          addresses_.addAll(other.addresses_);
        }
        onChanged();
      }
      if (!other.coinIds_.isEmpty()) {
        if (coinIds_.isEmpty()) {
          coinIds_ = other.coinIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCoinIdsIsMutable();
          coinIds_.addAll(other.coinIds_);
        }
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
      counters.minter.grpc.client.FrozenAllRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.FrozenAllRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long startHeight_ ;
    /**
     * <code>uint64 start_height = 1;</code>
     * @return The startHeight.
     */
    @java.lang.Override
    public long getStartHeight() {
      return startHeight_;
    }
    /**
     * <code>uint64 start_height = 1;</code>
     * @param value The startHeight to set.
     * @return This builder for chaining.
     */
    public Builder setStartHeight(long value) {
      
      startHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 start_height = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartHeight() {
      
      startHeight_ = 0L;
      onChanged();
      return this;
    }

    private long endHeight_ ;
    /**
     * <code>uint64 end_height = 2;</code>
     * @return The endHeight.
     */
    @java.lang.Override
    public long getEndHeight() {
      return endHeight_;
    }
    /**
     * <code>uint64 end_height = 2;</code>
     * @param value The endHeight to set.
     * @return This builder for chaining.
     */
    public Builder setEndHeight(long value) {
      
      endHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 end_height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndHeight() {
      
      endHeight_ = 0L;
      onChanged();
      return this;
    }

    private long height_ ;
    /**
     * <code>uint64 height = 3;</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>uint64 height = 3;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 height = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAddressesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        addresses_ = new com.google.protobuf.LazyStringArrayList(addresses_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string addresses = 4;</code>
     * @return A list containing the addresses.
     */
    public com.google.protobuf.ProtocolStringList
        getAddressesList() {
      return addresses_.getUnmodifiableView();
    }
    /**
     * <code>repeated string addresses = 4;</code>
     * @return The count of addresses.
     */
    public int getAddressesCount() {
      return addresses_.size();
    }
    /**
     * <code>repeated string addresses = 4;</code>
     * @param index The index of the element to return.
     * @return The addresses at the given index.
     */
    public java.lang.String getAddresses(int index) {
      return addresses_.get(index);
    }
    /**
     * <code>repeated string addresses = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the addresses at the given index.
     */
    public com.google.protobuf.ByteString
        getAddressesBytes(int index) {
      return addresses_.getByteString(index);
    }
    /**
     * <code>repeated string addresses = 4;</code>
     * @param index The index to set the value at.
     * @param value The addresses to set.
     * @return This builder for chaining.
     */
    public Builder setAddresses(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressesIsMutable();
      addresses_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 4;</code>
     * @param value The addresses to add.
     * @return This builder for chaining.
     */
    public Builder addAddresses(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressesIsMutable();
      addresses_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 4;</code>
     * @param values The addresses to add.
     * @return This builder for chaining.
     */
    public Builder addAllAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, addresses_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddresses() {
      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 4;</code>
     * @param value The bytes of the addresses to add.
     * @return This builder for chaining.
     */
    public Builder addAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAddressesIsMutable();
      addresses_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList coinIds_ = emptyLongList();
    private void ensureCoinIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        coinIds_ = mutableCopy(coinIds_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated uint64 coin_ids = 5;</code>
     * @return A list containing the coinIds.
     */
    public java.util.List<java.lang.Long>
        getCoinIdsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(coinIds_) : coinIds_;
    }
    /**
     * <code>repeated uint64 coin_ids = 5;</code>
     * @return The count of coinIds.
     */
    public int getCoinIdsCount() {
      return coinIds_.size();
    }
    /**
     * <code>repeated uint64 coin_ids = 5;</code>
     * @param index The index of the element to return.
     * @return The coinIds at the given index.
     */
    public long getCoinIds(int index) {
      return coinIds_.getLong(index);
    }
    /**
     * <code>repeated uint64 coin_ids = 5;</code>
     * @param index The index to set the value at.
     * @param value The coinIds to set.
     * @return This builder for chaining.
     */
    public Builder setCoinIds(
        int index, long value) {
      ensureCoinIdsIsMutable();
      coinIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 coin_ids = 5;</code>
     * @param value The coinIds to add.
     * @return This builder for chaining.
     */
    public Builder addCoinIds(long value) {
      ensureCoinIdsIsMutable();
      coinIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 coin_ids = 5;</code>
     * @param values The coinIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllCoinIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureCoinIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, coinIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 coin_ids = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoinIds() {
      coinIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:api_pb.FrozenAllRequest)
  }

  // @@protoc_insertion_point(class_scope:api_pb.FrozenAllRequest)
  private static final counters.minter.grpc.client.FrozenAllRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.FrozenAllRequest();
  }

  public static counters.minter.grpc.client.FrozenAllRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrozenAllRequest>
      PARSER = new com.google.protobuf.AbstractParser<FrozenAllRequest>() {
    @java.lang.Override
    public FrozenAllRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FrozenAllRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FrozenAllRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrozenAllRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.FrozenAllRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

