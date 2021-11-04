// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

/**
 * Protobuf type {@code api_pb.MissedBlocksResponse}
 */
public final class MissedBlocksResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.MissedBlocksResponse)
    MissedBlocksResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MissedBlocksResponse.newBuilder() to construct.
  private MissedBlocksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MissedBlocksResponse() {
    missedBlocks_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MissedBlocksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MissedBlocksResponse(
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
            java.lang.String s = input.readStringRequireUtf8();

            missedBlocks_ = s;
            break;
          }
          case 16: {

            missedBlocksCount_ = input.readInt64();
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
    return examples.api_pb2.Resources.internal_static_api_pb_MissedBlocksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return examples.api_pb2.Resources.internal_static_api_pb_MissedBlocksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            examples.api_pb2.MissedBlocksResponse.class, examples.api_pb2.MissedBlocksResponse.Builder.class);
  }

  public static final int MISSED_BLOCKS_FIELD_NUMBER = 1;
  private volatile java.lang.Object missedBlocks_;
  /**
   * <code>string missed_blocks = 1 [json_name = "missedBlocks"];</code>
   * @return The missedBlocks.
   */
  @java.lang.Override
  public java.lang.String getMissedBlocks() {
    java.lang.Object ref = missedBlocks_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      missedBlocks_ = s;
      return s;
    }
  }
  /**
   * <code>string missed_blocks = 1 [json_name = "missedBlocks"];</code>
   * @return The bytes for missedBlocks.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMissedBlocksBytes() {
    java.lang.Object ref = missedBlocks_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      missedBlocks_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MISSED_BLOCKS_COUNT_FIELD_NUMBER = 2;
  private long missedBlocksCount_;
  /**
   * <code>int64 missed_blocks_count = 2 [json_name = "missedBlocksCount"];</code>
   * @return The missedBlocksCount.
   */
  @java.lang.Override
  public long getMissedBlocksCount() {
    return missedBlocksCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(missedBlocks_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, missedBlocks_);
    }
    if (missedBlocksCount_ != 0L) {
      output.writeInt64(2, missedBlocksCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(missedBlocks_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, missedBlocks_);
    }
    if (missedBlocksCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, missedBlocksCount_);
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
    if (!(obj instanceof examples.api_pb2.MissedBlocksResponse)) {
      return super.equals(obj);
    }
    examples.api_pb2.MissedBlocksResponse other = (examples.api_pb2.MissedBlocksResponse) obj;

    if (!getMissedBlocks()
        .equals(other.getMissedBlocks())) return false;
    if (getMissedBlocksCount()
        != other.getMissedBlocksCount()) return false;
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
    hash = (37 * hash) + MISSED_BLOCKS_FIELD_NUMBER;
    hash = (53 * hash) + getMissedBlocks().hashCode();
    hash = (37 * hash) + MISSED_BLOCKS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMissedBlocksCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static examples.api_pb2.MissedBlocksResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.api_pb2.MissedBlocksResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.api_pb2.MissedBlocksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.api_pb2.MissedBlocksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.api_pb2.MissedBlocksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.api_pb2.MissedBlocksResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.api_pb2.MissedBlocksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static examples.api_pb2.MissedBlocksResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static examples.api_pb2.MissedBlocksResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static examples.api_pb2.MissedBlocksResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static examples.api_pb2.MissedBlocksResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static examples.api_pb2.MissedBlocksResponse parseFrom(
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
  public static Builder newBuilder(examples.api_pb2.MissedBlocksResponse prototype) {
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
   * Protobuf type {@code api_pb.MissedBlocksResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.MissedBlocksResponse)
      examples.api_pb2.MissedBlocksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return examples.api_pb2.Resources.internal_static_api_pb_MissedBlocksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return examples.api_pb2.Resources.internal_static_api_pb_MissedBlocksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              examples.api_pb2.MissedBlocksResponse.class, examples.api_pb2.MissedBlocksResponse.Builder.class);
    }

    // Construct using examples.api_pb2.MissedBlocksResponse.newBuilder()
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
      missedBlocks_ = "";

      missedBlocksCount_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return examples.api_pb2.Resources.internal_static_api_pb_MissedBlocksResponse_descriptor;
    }

    @java.lang.Override
    public examples.api_pb2.MissedBlocksResponse getDefaultInstanceForType() {
      return examples.api_pb2.MissedBlocksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public examples.api_pb2.MissedBlocksResponse build() {
      examples.api_pb2.MissedBlocksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public examples.api_pb2.MissedBlocksResponse buildPartial() {
      examples.api_pb2.MissedBlocksResponse result = new examples.api_pb2.MissedBlocksResponse(this);
      result.missedBlocks_ = missedBlocks_;
      result.missedBlocksCount_ = missedBlocksCount_;
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
      if (other instanceof examples.api_pb2.MissedBlocksResponse) {
        return mergeFrom((examples.api_pb2.MissedBlocksResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(examples.api_pb2.MissedBlocksResponse other) {
      if (other == examples.api_pb2.MissedBlocksResponse.getDefaultInstance()) return this;
      if (!other.getMissedBlocks().isEmpty()) {
        missedBlocks_ = other.missedBlocks_;
        onChanged();
      }
      if (other.getMissedBlocksCount() != 0L) {
        setMissedBlocksCount(other.getMissedBlocksCount());
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
      examples.api_pb2.MissedBlocksResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (examples.api_pb2.MissedBlocksResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object missedBlocks_ = "";
    /**
     * <code>string missed_blocks = 1 [json_name = "missedBlocks"];</code>
     * @return The missedBlocks.
     */
    public java.lang.String getMissedBlocks() {
      java.lang.Object ref = missedBlocks_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        missedBlocks_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string missed_blocks = 1 [json_name = "missedBlocks"];</code>
     * @return The bytes for missedBlocks.
     */
    public com.google.protobuf.ByteString
        getMissedBlocksBytes() {
      java.lang.Object ref = missedBlocks_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        missedBlocks_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string missed_blocks = 1 [json_name = "missedBlocks"];</code>
     * @param value The missedBlocks to set.
     * @return This builder for chaining.
     */
    public Builder setMissedBlocks(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      missedBlocks_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string missed_blocks = 1 [json_name = "missedBlocks"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMissedBlocks() {
      
      missedBlocks_ = getDefaultInstance().getMissedBlocks();
      onChanged();
      return this;
    }
    /**
     * <code>string missed_blocks = 1 [json_name = "missedBlocks"];</code>
     * @param value The bytes for missedBlocks to set.
     * @return This builder for chaining.
     */
    public Builder setMissedBlocksBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      missedBlocks_ = value;
      onChanged();
      return this;
    }

    private long missedBlocksCount_ ;
    /**
     * <code>int64 missed_blocks_count = 2 [json_name = "missedBlocksCount"];</code>
     * @return The missedBlocksCount.
     */
    @java.lang.Override
    public long getMissedBlocksCount() {
      return missedBlocksCount_;
    }
    /**
     * <code>int64 missed_blocks_count = 2 [json_name = "missedBlocksCount"];</code>
     * @param value The missedBlocksCount to set.
     * @return This builder for chaining.
     */
    public Builder setMissedBlocksCount(long value) {
      
      missedBlocksCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 missed_blocks_count = 2 [json_name = "missedBlocksCount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMissedBlocksCount() {
      
      missedBlocksCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api_pb.MissedBlocksResponse)
  }

  // @@protoc_insertion_point(class_scope:api_pb.MissedBlocksResponse)
  private static final examples.api_pb2.MissedBlocksResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new examples.api_pb2.MissedBlocksResponse();
  }

  public static examples.api_pb2.MissedBlocksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MissedBlocksResponse>
      PARSER = new com.google.protobuf.AbstractParser<MissedBlocksResponse>() {
    @java.lang.Override
    public MissedBlocksResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MissedBlocksResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MissedBlocksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MissedBlocksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public examples.api_pb2.MissedBlocksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

