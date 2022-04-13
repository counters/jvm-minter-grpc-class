// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.BlocksRequest}
 */
public final class BlocksRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.BlocksRequest)
    BlocksRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlocksRequest.newBuilder() to construct.
  private BlocksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlocksRequest() {
    fields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlocksRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlocksRequest(
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

            fromHeight_ = input.readUInt64();
            break;
          }
          case 16: {

            toHeight_ = input.readUInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fields_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            fields_.add(rawValue);
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fields_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              fields_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 32: {

            failedTxs_ = input.readBool();
            break;
          }
          case 40: {

            events_ = input.readBool();
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
        fields_ = java.util.Collections.unmodifiableList(fields_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_BlocksRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_BlocksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.BlocksRequest.class, counters.minter.grpc.client.BlocksRequest.Builder.class);
  }

  public static final int FROM_HEIGHT_FIELD_NUMBER = 1;
  private long fromHeight_;
  /**
   * <code>uint64 from_height = 1 [json_name = "fromHeight"];</code>
   * @return The fromHeight.
   */
  @java.lang.Override
  public long getFromHeight() {
    return fromHeight_;
  }

  public static final int TO_HEIGHT_FIELD_NUMBER = 2;
  private long toHeight_;
  /**
   * <code>uint64 to_height = 2 [json_name = "toHeight"];</code>
   * @return The toHeight.
   */
  @java.lang.Override
  public long getToHeight() {
    return toHeight_;
  }

  public static final int FIELDS_FIELD_NUMBER = 3;
  private java.util.List<java.lang.Integer> fields_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, counters.minter.grpc.client.BlockField> fields_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, counters.minter.grpc.client.BlockField>() {
            public counters.minter.grpc.client.BlockField convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              counters.minter.grpc.client.BlockField result = counters.minter.grpc.client.BlockField.valueOf(from);
              return result == null ? counters.minter.grpc.client.BlockField.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
   * @return A list containing the fields.
   */
  @java.lang.Override
  public java.util.List<counters.minter.grpc.client.BlockField> getFieldsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, counters.minter.grpc.client.BlockField>(fields_, fields_converter_);
  }
  /**
   * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
   * @return The count of fields.
   */
  @java.lang.Override
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
   * @param index The index of the element to return.
   * @return The fields at the given index.
   */
  @java.lang.Override
  public counters.minter.grpc.client.BlockField getFields(int index) {
    return fields_converter_.convert(fields_.get(index));
  }
  /**
   * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
   * @return A list containing the enum numeric values on the wire for fields.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getFieldsValueList() {
    return fields_;
  }
  /**
   * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of fields at the given index.
   */
  @java.lang.Override
  public int getFieldsValue(int index) {
    return fields_.get(index);
  }
  private int fieldsMemoizedSerializedSize;

  public static final int FAILED_TXS_FIELD_NUMBER = 4;
  private boolean failedTxs_;
  /**
   * <code>bool failed_txs = 4 [json_name = "failedTxs"];</code>
   * @return The failedTxs.
   */
  @java.lang.Override
  public boolean getFailedTxs() {
    return failedTxs_;
  }

  public static final int EVENTS_FIELD_NUMBER = 5;
  private boolean events_;
  /**
   * <code>bool events = 5 [json_name = "events"];</code>
   * @return The events.
   */
  @java.lang.Override
  public boolean getEvents() {
    return events_;
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
    if (fromHeight_ != 0L) {
      output.writeUInt64(1, fromHeight_);
    }
    if (toHeight_ != 0L) {
      output.writeUInt64(2, toHeight_);
    }
    if (getFieldsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(fieldsMemoizedSerializedSize);
    }
    for (int i = 0; i < fields_.size(); i++) {
      output.writeEnumNoTag(fields_.get(i));
    }
    if (failedTxs_ != false) {
      output.writeBool(4, failedTxs_);
    }
    if (events_ != false) {
      output.writeBool(5, events_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fromHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, fromHeight_);
    }
    if (toHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, toHeight_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fields_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(fields_.get(i));
      }
      size += dataSize;
      if (!getFieldsList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }fieldsMemoizedSerializedSize = dataSize;
    }
    if (failedTxs_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, failedTxs_);
    }
    if (events_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, events_);
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
    if (!(obj instanceof counters.minter.grpc.client.BlocksRequest)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.BlocksRequest other = (counters.minter.grpc.client.BlocksRequest) obj;

    if (getFromHeight()
        != other.getFromHeight()) return false;
    if (getToHeight()
        != other.getToHeight()) return false;
    if (!fields_.equals(other.fields_)) return false;
    if (getFailedTxs()
        != other.getFailedTxs()) return false;
    if (getEvents()
        != other.getEvents()) return false;
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
    hash = (37 * hash) + FROM_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFromHeight());
    hash = (37 * hash) + TO_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getToHeight());
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + fields_.hashCode();
    }
    hash = (37 * hash) + FAILED_TXS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFailedTxs());
    hash = (37 * hash) + EVENTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEvents());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.BlocksRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.BlocksRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.BlocksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.BlocksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.BlocksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.BlocksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.BlocksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.BlocksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.BlocksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.BlocksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.BlocksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.BlocksRequest parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.BlocksRequest prototype) {
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
   * Protobuf type {@code api_pb.BlocksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.BlocksRequest)
      counters.minter.grpc.client.BlocksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_BlocksRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_BlocksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.BlocksRequest.class, counters.minter.grpc.client.BlocksRequest.Builder.class);
    }

    // Construct using counters.minter.grpc.client.BlocksRequest.newBuilder()
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
      fromHeight_ = 0L;

      toHeight_ = 0L;

      fields_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      failedTxs_ = false;

      events_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_BlocksRequest_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.BlocksRequest getDefaultInstanceForType() {
      return counters.minter.grpc.client.BlocksRequest.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.BlocksRequest build() {
      counters.minter.grpc.client.BlocksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.BlocksRequest buildPartial() {
      counters.minter.grpc.client.BlocksRequest result = new counters.minter.grpc.client.BlocksRequest(this);
      int from_bitField0_ = bitField0_;
      result.fromHeight_ = fromHeight_;
      result.toHeight_ = toHeight_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fields_ = java.util.Collections.unmodifiableList(fields_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fields_ = fields_;
      result.failedTxs_ = failedTxs_;
      result.events_ = events_;
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
      if (other instanceof counters.minter.grpc.client.BlocksRequest) {
        return mergeFrom((counters.minter.grpc.client.BlocksRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.BlocksRequest other) {
      if (other == counters.minter.grpc.client.BlocksRequest.getDefaultInstance()) return this;
      if (other.getFromHeight() != 0L) {
        setFromHeight(other.getFromHeight());
      }
      if (other.getToHeight() != 0L) {
        setToHeight(other.getToHeight());
      }
      if (!other.fields_.isEmpty()) {
        if (fields_.isEmpty()) {
          fields_ = other.fields_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFieldsIsMutable();
          fields_.addAll(other.fields_);
        }
        onChanged();
      }
      if (other.getFailedTxs() != false) {
        setFailedTxs(other.getFailedTxs());
      }
      if (other.getEvents() != false) {
        setEvents(other.getEvents());
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
      counters.minter.grpc.client.BlocksRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.BlocksRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long fromHeight_ ;
    /**
     * <code>uint64 from_height = 1 [json_name = "fromHeight"];</code>
     * @return The fromHeight.
     */
    @java.lang.Override
    public long getFromHeight() {
      return fromHeight_;
    }
    /**
     * <code>uint64 from_height = 1 [json_name = "fromHeight"];</code>
     * @param value The fromHeight to set.
     * @return This builder for chaining.
     */
    public Builder setFromHeight(long value) {
      
      fromHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 from_height = 1 [json_name = "fromHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFromHeight() {
      
      fromHeight_ = 0L;
      onChanged();
      return this;
    }

    private long toHeight_ ;
    /**
     * <code>uint64 to_height = 2 [json_name = "toHeight"];</code>
     * @return The toHeight.
     */
    @java.lang.Override
    public long getToHeight() {
      return toHeight_;
    }
    /**
     * <code>uint64 to_height = 2 [json_name = "toHeight"];</code>
     * @param value The toHeight to set.
     * @return This builder for chaining.
     */
    public Builder setToHeight(long value) {
      
      toHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 to_height = 2 [json_name = "toHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToHeight() {
      
      toHeight_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> fields_ =
      java.util.Collections.emptyList();
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fields_ = new java.util.ArrayList<java.lang.Integer>(fields_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @return A list containing the fields.
     */
    public java.util.List<counters.minter.grpc.client.BlockField> getFieldsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, counters.minter.grpc.client.BlockField>(fields_, fields_converter_);
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @return The count of fields.
     */
    public int getFieldsCount() {
      return fields_.size();
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param index The index of the element to return.
     * @return The fields at the given index.
     */
    public counters.minter.grpc.client.BlockField getFields(int index) {
      return fields_converter_.convert(fields_.get(index));
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param index The index to set the value at.
     * @param value The fields to set.
     * @return This builder for chaining.
     */
    public Builder setFields(
        int index, counters.minter.grpc.client.BlockField value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldsIsMutable();
      fields_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param value The fields to add.
     * @return This builder for chaining.
     */
    public Builder addFields(counters.minter.grpc.client.BlockField value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldsIsMutable();
      fields_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param values The fields to add.
     * @return This builder for chaining.
     */
    public Builder addAllFields(
        java.lang.Iterable<? extends counters.minter.grpc.client.BlockField> values) {
      ensureFieldsIsMutable();
      for (counters.minter.grpc.client.BlockField value : values) {
        fields_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFields() {
      fields_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @return A list containing the enum numeric values on the wire for fields.
     */
    public java.util.List<java.lang.Integer>
    getFieldsValueList() {
      return java.util.Collections.unmodifiableList(fields_);
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of fields at the given index.
     */
    public int getFieldsValue(int index) {
      return fields_.get(index);
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of fields at the given index.
     * @return This builder for chaining.
     */
    public Builder setFieldsValue(
        int index, int value) {
      ensureFieldsIsMutable();
      fields_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param value The enum numeric value on the wire for fields to add.
     * @return This builder for chaining.
     */
    public Builder addFieldsValue(int value) {
      ensureFieldsIsMutable();
      fields_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param values The enum numeric values on the wire for fields to add.
     * @return This builder for chaining.
     */
    public Builder addAllFieldsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureFieldsIsMutable();
      for (int value : values) {
        fields_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean failedTxs_ ;
    /**
     * <code>bool failed_txs = 4 [json_name = "failedTxs"];</code>
     * @return The failedTxs.
     */
    @java.lang.Override
    public boolean getFailedTxs() {
      return failedTxs_;
    }
    /**
     * <code>bool failed_txs = 4 [json_name = "failedTxs"];</code>
     * @param value The failedTxs to set.
     * @return This builder for chaining.
     */
    public Builder setFailedTxs(boolean value) {
      
      failedTxs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool failed_txs = 4 [json_name = "failedTxs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedTxs() {
      
      failedTxs_ = false;
      onChanged();
      return this;
    }

    private boolean events_ ;
    /**
     * <code>bool events = 5 [json_name = "events"];</code>
     * @return The events.
     */
    @java.lang.Override
    public boolean getEvents() {
      return events_;
    }
    /**
     * <code>bool events = 5 [json_name = "events"];</code>
     * @param value The events to set.
     * @return This builder for chaining.
     */
    public Builder setEvents(boolean value) {
      
      events_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool events = 5 [json_name = "events"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEvents() {
      
      events_ = false;
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


    // @@protoc_insertion_point(builder_scope:api_pb.BlocksRequest)
  }

  // @@protoc_insertion_point(class_scope:api_pb.BlocksRequest)
  private static final counters.minter.grpc.client.BlocksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.BlocksRequest();
  }

  public static counters.minter.grpc.client.BlocksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlocksRequest>
      PARSER = new com.google.protobuf.AbstractParser<BlocksRequest>() {
    @java.lang.Override
    public BlocksRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlocksRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlocksRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlocksRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.BlocksRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

