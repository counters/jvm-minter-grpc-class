// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.EventsRequest}
 */
public final class EventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.EventsRequest)
    EventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventsRequest.newBuilder() to construct.
  private EventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventsRequest() {
    search_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventsRequest(
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

            height_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              search_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            search_.add(s);
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
        search_ = search_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_EventsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_EventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.EventsRequest.class, counters.minter.grpc.client.EventsRequest.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_;
  /**
   * <code>uint64 height = 1;</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int SEARCH_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList search_;
  /**
   * <pre>
   * Array of public keys of validators and wallet addresses of delegators for filtering
   * </pre>
   *
   * <code>repeated string search = 2;</code>
   * @return A list containing the search.
   */
  public com.google.protobuf.ProtocolStringList
      getSearchList() {
    return search_;
  }
  /**
   * <pre>
   * Array of public keys of validators and wallet addresses of delegators for filtering
   * </pre>
   *
   * <code>repeated string search = 2;</code>
   * @return The count of search.
   */
  public int getSearchCount() {
    return search_.size();
  }
  /**
   * <pre>
   * Array of public keys of validators and wallet addresses of delegators for filtering
   * </pre>
   *
   * <code>repeated string search = 2;</code>
   * @param index The index of the element to return.
   * @return The search at the given index.
   */
  public java.lang.String getSearch(int index) {
    return search_.get(index);
  }
  /**
   * <pre>
   * Array of public keys of validators and wallet addresses of delegators for filtering
   * </pre>
   *
   * <code>repeated string search = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the search at the given index.
   */
  public com.google.protobuf.ByteString
      getSearchBytes(int index) {
    return search_.getByteString(index);
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
    if (height_ != 0L) {
      output.writeUInt64(1, height_);
    }
    for (int i = 0; i < search_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, search_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, height_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < search_.size(); i++) {
        dataSize += computeStringSizeNoTag(search_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSearchList().size();
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
    if (!(obj instanceof counters.minter.grpc.client.EventsRequest)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.EventsRequest other = (counters.minter.grpc.client.EventsRequest) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (!getSearchList()
        .equals(other.getSearchList())) return false;
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
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    if (getSearchCount() > 0) {
      hash = (37 * hash) + SEARCH_FIELD_NUMBER;
      hash = (53 * hash) + getSearchList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.EventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.EventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.EventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EventsRequest parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.EventsRequest prototype) {
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
   * Protobuf type {@code api_pb.EventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.EventsRequest)
      counters.minter.grpc.client.EventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_EventsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_EventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.EventsRequest.class, counters.minter.grpc.client.EventsRequest.Builder.class);
    }

    // Construct using counters.minter.grpc.client.EventsRequest.newBuilder()
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
      height_ = 0L;

      search_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_EventsRequest_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.EventsRequest getDefaultInstanceForType() {
      return counters.minter.grpc.client.EventsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.EventsRequest build() {
      counters.minter.grpc.client.EventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.EventsRequest buildPartial() {
      counters.minter.grpc.client.EventsRequest result = new counters.minter.grpc.client.EventsRequest(this);
      int from_bitField0_ = bitField0_;
      result.height_ = height_;
      if (((bitField0_ & 0x00000001) != 0)) {
        search_ = search_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.search_ = search_;
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
      if (other instanceof counters.minter.grpc.client.EventsRequest) {
        return mergeFrom((counters.minter.grpc.client.EventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.EventsRequest other) {
      if (other == counters.minter.grpc.client.EventsRequest.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (!other.search_.isEmpty()) {
        if (search_.isEmpty()) {
          search_ = other.search_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSearchIsMutable();
          search_.addAll(other.search_);
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
      counters.minter.grpc.client.EventsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.EventsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long height_ ;
    /**
     * <code>uint64 height = 1;</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>uint64 height = 1;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 height = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList search_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSearchIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        search_ = new com.google.protobuf.LazyStringArrayList(search_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @return A list containing the search.
     */
    public com.google.protobuf.ProtocolStringList
        getSearchList() {
      return search_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @return The count of search.
     */
    public int getSearchCount() {
      return search_.size();
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param index The index of the element to return.
     * @return The search at the given index.
     */
    public java.lang.String getSearch(int index) {
      return search_.get(index);
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the search at the given index.
     */
    public com.google.protobuf.ByteString
        getSearchBytes(int index) {
      return search_.getByteString(index);
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param index The index to set the value at.
     * @param value The search to set.
     * @return This builder for chaining.
     */
    public Builder setSearch(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSearchIsMutable();
      search_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param value The search to add.
     * @return This builder for chaining.
     */
    public Builder addSearch(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSearchIsMutable();
      search_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param values The search to add.
     * @return This builder for chaining.
     */
    public Builder addAllSearch(
        java.lang.Iterable<java.lang.String> values) {
      ensureSearchIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, search_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSearch() {
      search_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param value The bytes of the search to add.
     * @return This builder for chaining.
     */
    public Builder addSearchBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSearchIsMutable();
      search_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api_pb.EventsRequest)
  }

  // @@protoc_insertion_point(class_scope:api_pb.EventsRequest)
  private static final counters.minter.grpc.client.EventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.EventsRequest();
  }

  public static counters.minter.grpc.client.EventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<EventsRequest>() {
    @java.lang.Override
    public EventsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.EventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

