// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.CreateMultisigData}
 */
public final class CreateMultisigData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.CreateMultisigData)
    CreateMultisigDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateMultisigData.newBuilder() to construct.
  private CreateMultisigData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateMultisigData() {
    weights_ = emptyLongList();
    addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateMultisigData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateMultisigData(
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

            threshold_ = input.readUInt64();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              weights_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            weights_.addLong(input.readUInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              weights_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              weights_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              addresses_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            addresses_.add(s);
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
        weights_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        addresses_ = addresses_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_CreateMultisigData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_CreateMultisigData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.CreateMultisigData.class, counters.minter.grpc.client.CreateMultisigData.Builder.class);
  }

  public static final int THRESHOLD_FIELD_NUMBER = 1;
  private long threshold_;
  /**
   * <code>uint64 threshold = 1;</code>
   * @return The threshold.
   */
  @java.lang.Override
  public long getThreshold() {
    return threshold_;
  }

  public static final int WEIGHTS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList weights_;
  /**
   * <code>repeated uint64 weights = 2;</code>
   * @return A list containing the weights.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getWeightsList() {
    return weights_;
  }
  /**
   * <code>repeated uint64 weights = 2;</code>
   * @return The count of weights.
   */
  public int getWeightsCount() {
    return weights_.size();
  }
  /**
   * <code>repeated uint64 weights = 2;</code>
   * @param index The index of the element to return.
   * @return The weights at the given index.
   */
  public long getWeights(int index) {
    return weights_.getLong(index);
  }
  private int weightsMemoizedSerializedSize = -1;

  public static final int ADDRESSES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList addresses_;
  /**
   * <code>repeated string addresses = 3;</code>
   * @return A list containing the addresses.
   */
  public com.google.protobuf.ProtocolStringList
      getAddressesList() {
    return addresses_;
  }
  /**
   * <code>repeated string addresses = 3;</code>
   * @return The count of addresses.
   */
  public int getAddressesCount() {
    return addresses_.size();
  }
  /**
   * <code>repeated string addresses = 3;</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  public java.lang.String getAddresses(int index) {
    return addresses_.get(index);
  }
  /**
   * <code>repeated string addresses = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  public com.google.protobuf.ByteString
      getAddressesBytes(int index) {
    return addresses_.getByteString(index);
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
    getSerializedSize();
    if (threshold_ != 0L) {
      output.writeUInt64(1, threshold_);
    }
    if (getWeightsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(weightsMemoizedSerializedSize);
    }
    for (int i = 0; i < weights_.size(); i++) {
      output.writeUInt64NoTag(weights_.getLong(i));
    }
    for (int i = 0; i < addresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, addresses_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (threshold_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, threshold_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < weights_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(weights_.getLong(i));
      }
      size += dataSize;
      if (!getWeightsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      weightsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < addresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(addresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAddressesList().size();
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
    if (!(obj instanceof counters.minter.grpc.client.CreateMultisigData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.CreateMultisigData other = (counters.minter.grpc.client.CreateMultisigData) obj;

    if (getThreshold()
        != other.getThreshold()) return false;
    if (!getWeightsList()
        .equals(other.getWeightsList())) return false;
    if (!getAddressesList()
        .equals(other.getAddressesList())) return false;
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
    hash = (37 * hash) + THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getThreshold());
    if (getWeightsCount() > 0) {
      hash = (37 * hash) + WEIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getWeightsList().hashCode();
    }
    if (getAddressesCount() > 0) {
      hash = (37 * hash) + ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getAddressesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.CreateMultisigData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.CreateMultisigData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.CreateMultisigData prototype) {
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
   * Protobuf type {@code api_pb.CreateMultisigData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.CreateMultisigData)
      counters.minter.grpc.client.CreateMultisigDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_CreateMultisigData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_CreateMultisigData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.CreateMultisigData.class, counters.minter.grpc.client.CreateMultisigData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.CreateMultisigData.newBuilder()
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
      threshold_ = 0L;

      weights_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_CreateMultisigData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.CreateMultisigData getDefaultInstanceForType() {
      return counters.minter.grpc.client.CreateMultisigData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.CreateMultisigData build() {
      counters.minter.grpc.client.CreateMultisigData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.CreateMultisigData buildPartial() {
      counters.minter.grpc.client.CreateMultisigData result = new counters.minter.grpc.client.CreateMultisigData(this);
      int from_bitField0_ = bitField0_;
      result.threshold_ = threshold_;
      if (((bitField0_ & 0x00000001) != 0)) {
        weights_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.weights_ = weights_;
      if (((bitField0_ & 0x00000002) != 0)) {
        addresses_ = addresses_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.addresses_ = addresses_;
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
      if (other instanceof counters.minter.grpc.client.CreateMultisigData) {
        return mergeFrom((counters.minter.grpc.client.CreateMultisigData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.CreateMultisigData other) {
      if (other == counters.minter.grpc.client.CreateMultisigData.getDefaultInstance()) return this;
      if (other.getThreshold() != 0L) {
        setThreshold(other.getThreshold());
      }
      if (!other.weights_.isEmpty()) {
        if (weights_.isEmpty()) {
          weights_ = other.weights_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureWeightsIsMutable();
          weights_.addAll(other.weights_);
        }
        onChanged();
      }
      if (!other.addresses_.isEmpty()) {
        if (addresses_.isEmpty()) {
          addresses_ = other.addresses_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAddressesIsMutable();
          addresses_.addAll(other.addresses_);
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
      counters.minter.grpc.client.CreateMultisigData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.CreateMultisigData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long threshold_ ;
    /**
     * <code>uint64 threshold = 1;</code>
     * @return The threshold.
     */
    @java.lang.Override
    public long getThreshold() {
      return threshold_;
    }
    /**
     * <code>uint64 threshold = 1;</code>
     * @param value The threshold to set.
     * @return This builder for chaining.
     */
    public Builder setThreshold(long value) {
      
      threshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 threshold = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearThreshold() {
      
      threshold_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList weights_ = emptyLongList();
    private void ensureWeightsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        weights_ = mutableCopy(weights_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     * @return A list containing the weights.
     */
    public java.util.List<java.lang.Long>
        getWeightsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(weights_) : weights_;
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     * @return The count of weights.
     */
    public int getWeightsCount() {
      return weights_.size();
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     * @param index The index of the element to return.
     * @return The weights at the given index.
     */
    public long getWeights(int index) {
      return weights_.getLong(index);
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     * @param index The index to set the value at.
     * @param value The weights to set.
     * @return This builder for chaining.
     */
    public Builder setWeights(
        int index, long value) {
      ensureWeightsIsMutable();
      weights_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     * @param value The weights to add.
     * @return This builder for chaining.
     */
    public Builder addWeights(long value) {
      ensureWeightsIsMutable();
      weights_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     * @param values The weights to add.
     * @return This builder for chaining.
     */
    public Builder addAllWeights(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureWeightsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, weights_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeights() {
      weights_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAddressesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        addresses_ = new com.google.protobuf.LazyStringArrayList(addresses_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @return A list containing the addresses.
     */
    public com.google.protobuf.ProtocolStringList
        getAddressesList() {
      return addresses_.getUnmodifiableView();
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @return The count of addresses.
     */
    public int getAddressesCount() {
      return addresses_.size();
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param index The index of the element to return.
     * @return The addresses at the given index.
     */
    public java.lang.String getAddresses(int index) {
      return addresses_.get(index);
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the addresses at the given index.
     */
    public com.google.protobuf.ByteString
        getAddressesBytes(int index) {
      return addresses_.getByteString(index);
    }
    /**
     * <code>repeated string addresses = 3;</code>
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
     * <code>repeated string addresses = 3;</code>
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
     * <code>repeated string addresses = 3;</code>
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
     * <code>repeated string addresses = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddresses() {
      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:api_pb.CreateMultisigData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.CreateMultisigData)
  private static final counters.minter.grpc.client.CreateMultisigData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.CreateMultisigData();
  }

  public static counters.minter.grpc.client.CreateMultisigData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMultisigData>
      PARSER = new com.google.protobuf.AbstractParser<CreateMultisigData>() {
    @java.lang.Override
    public CreateMultisigData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateMultisigData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateMultisigData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMultisigData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.CreateMultisigData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

