// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

/**
 * Protobuf type {@code api_pb.SendTransactionResponse}
 */
public final class SendTransactionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.SendTransactionResponse)
    SendTransactionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendTransactionResponse.newBuilder() to construct.
  private SendTransactionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendTransactionResponse() {
    log_ = "";
    hash_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SendTransactionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendTransactionResponse(
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

            code_ = input.readUInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            log_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            hash_ = s;
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
    return examples.api_pb2.Resources.internal_static_api_pb_SendTransactionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return examples.api_pb2.Resources.internal_static_api_pb_SendTransactionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            examples.api_pb2.SendTransactionResponse.class, examples.api_pb2.SendTransactionResponse.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private long code_;
  /**
   * <pre>
   * option (grpc.gateway.protoc_gen_openapiv2.options.openapiv2_schema) = {
   * example: "{&#92;"code&#92;":&#92;"0&#92;",&#92;"log&#92;":&#92;"&#92;", &#92;"hash&#92;":&#92;"Mt6019f740983dc43b53ea9c37891af0c9ce7251399ebaafc4ea56d68d665adfcb&#92;"}"
   * };
   * </pre>
   *
   * <code>uint64 code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  @java.lang.Override
  public long getCode() {
    return code_;
  }

  public static final int LOG_FIELD_NUMBER = 3;
  private volatile java.lang.Object log_;
  /**
   * <code>string log = 3 [json_name = "log"];</code>
   * @return The log.
   */
  @java.lang.Override
  public java.lang.String getLog() {
    java.lang.Object ref = log_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      log_ = s;
      return s;
    }
  }
  /**
   * <code>string log = 3 [json_name = "log"];</code>
   * @return The bytes for log.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogBytes() {
    java.lang.Object ref = log_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      log_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASH_FIELD_NUMBER = 4;
  private volatile java.lang.Object hash_;
  /**
   * <code>string hash = 4 [json_name = "hash"];</code>
   * @return The hash.
   */
  @java.lang.Override
  public java.lang.String getHash() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hash_ = s;
      return s;
    }
  }
  /**
   * <code>string hash = 4 [json_name = "hash"];</code>
   * @return The bytes for hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hash_ = b;
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
    if (code_ != 0L) {
      output.writeUInt64(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(log_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, log_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, hash_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(log_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, log_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, hash_);
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
    if (!(obj instanceof examples.api_pb2.SendTransactionResponse)) {
      return super.equals(obj);
    }
    examples.api_pb2.SendTransactionResponse other = (examples.api_pb2.SendTransactionResponse) obj;

    if (getCode()
        != other.getCode()) return false;
    if (!getLog()
        .equals(other.getLog())) return false;
    if (!getHash()
        .equals(other.getHash())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCode());
    hash = (37 * hash) + LOG_FIELD_NUMBER;
    hash = (53 * hash) + getLog().hashCode();
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static examples.api_pb2.SendTransactionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.api_pb2.SendTransactionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.api_pb2.SendTransactionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.api_pb2.SendTransactionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.api_pb2.SendTransactionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.api_pb2.SendTransactionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.api_pb2.SendTransactionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static examples.api_pb2.SendTransactionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static examples.api_pb2.SendTransactionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static examples.api_pb2.SendTransactionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static examples.api_pb2.SendTransactionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static examples.api_pb2.SendTransactionResponse parseFrom(
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
  public static Builder newBuilder(examples.api_pb2.SendTransactionResponse prototype) {
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
   * Protobuf type {@code api_pb.SendTransactionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.SendTransactionResponse)
      examples.api_pb2.SendTransactionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return examples.api_pb2.Resources.internal_static_api_pb_SendTransactionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return examples.api_pb2.Resources.internal_static_api_pb_SendTransactionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              examples.api_pb2.SendTransactionResponse.class, examples.api_pb2.SendTransactionResponse.Builder.class);
    }

    // Construct using examples.api_pb2.SendTransactionResponse.newBuilder()
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
      code_ = 0L;

      log_ = "";

      hash_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return examples.api_pb2.Resources.internal_static_api_pb_SendTransactionResponse_descriptor;
    }

    @java.lang.Override
    public examples.api_pb2.SendTransactionResponse getDefaultInstanceForType() {
      return examples.api_pb2.SendTransactionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public examples.api_pb2.SendTransactionResponse build() {
      examples.api_pb2.SendTransactionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public examples.api_pb2.SendTransactionResponse buildPartial() {
      examples.api_pb2.SendTransactionResponse result = new examples.api_pb2.SendTransactionResponse(this);
      result.code_ = code_;
      result.log_ = log_;
      result.hash_ = hash_;
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
      if (other instanceof examples.api_pb2.SendTransactionResponse) {
        return mergeFrom((examples.api_pb2.SendTransactionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(examples.api_pb2.SendTransactionResponse other) {
      if (other == examples.api_pb2.SendTransactionResponse.getDefaultInstance()) return this;
      if (other.getCode() != 0L) {
        setCode(other.getCode());
      }
      if (!other.getLog().isEmpty()) {
        log_ = other.log_;
        onChanged();
      }
      if (!other.getHash().isEmpty()) {
        hash_ = other.hash_;
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
      examples.api_pb2.SendTransactionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (examples.api_pb2.SendTransactionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long code_ ;
    /**
     * <pre>
     * option (grpc.gateway.protoc_gen_openapiv2.options.openapiv2_schema) = {
     * example: "{&#92;"code&#92;":&#92;"0&#92;",&#92;"log&#92;":&#92;"&#92;", &#92;"hash&#92;":&#92;"Mt6019f740983dc43b53ea9c37891af0c9ce7251399ebaafc4ea56d68d665adfcb&#92;"}"
     * };
     * </pre>
     *
     * <code>uint64 code = 1 [json_name = "code"];</code>
     * @return The code.
     */
    @java.lang.Override
    public long getCode() {
      return code_;
    }
    /**
     * <pre>
     * option (grpc.gateway.protoc_gen_openapiv2.options.openapiv2_schema) = {
     * example: "{&#92;"code&#92;":&#92;"0&#92;",&#92;"log&#92;":&#92;"&#92;", &#92;"hash&#92;":&#92;"Mt6019f740983dc43b53ea9c37891af0c9ce7251399ebaafc4ea56d68d665adfcb&#92;"}"
     * };
     * </pre>
     *
     * <code>uint64 code = 1 [json_name = "code"];</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(long value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * option (grpc.gateway.protoc_gen_openapiv2.options.openapiv2_schema) = {
     * example: "{&#92;"code&#92;":&#92;"0&#92;",&#92;"log&#92;":&#92;"&#92;", &#92;"hash&#92;":&#92;"Mt6019f740983dc43b53ea9c37891af0c9ce7251399ebaafc4ea56d68d665adfcb&#92;"}"
     * };
     * </pre>
     *
     * <code>uint64 code = 1 [json_name = "code"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      
      code_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object log_ = "";
    /**
     * <code>string log = 3 [json_name = "log"];</code>
     * @return The log.
     */
    public java.lang.String getLog() {
      java.lang.Object ref = log_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        log_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string log = 3 [json_name = "log"];</code>
     * @return The bytes for log.
     */
    public com.google.protobuf.ByteString
        getLogBytes() {
      java.lang.Object ref = log_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        log_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string log = 3 [json_name = "log"];</code>
     * @param value The log to set.
     * @return This builder for chaining.
     */
    public Builder setLog(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      log_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string log = 3 [json_name = "log"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLog() {
      
      log_ = getDefaultInstance().getLog();
      onChanged();
      return this;
    }
    /**
     * <code>string log = 3 [json_name = "log"];</code>
     * @param value The bytes for log to set.
     * @return This builder for chaining.
     */
    public Builder setLogBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      log_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hash_ = "";
    /**
     * <code>string hash = 4 [json_name = "hash"];</code>
     * @return The hash.
     */
    public java.lang.String getHash() {
      java.lang.Object ref = hash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hash = 4 [json_name = "hash"];</code>
     * @return The bytes for hash.
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hash = 4 [json_name = "hash"];</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 4 [json_name = "hash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 4 [json_name = "hash"];</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hash_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.SendTransactionResponse)
  }

  // @@protoc_insertion_point(class_scope:api_pb.SendTransactionResponse)
  private static final examples.api_pb2.SendTransactionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new examples.api_pb2.SendTransactionResponse();
  }

  public static examples.api_pb2.SendTransactionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendTransactionResponse>
      PARSER = new com.google.protobuf.AbstractParser<SendTransactionResponse>() {
    @java.lang.Override
    public SendTransactionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendTransactionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendTransactionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendTransactionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public examples.api_pb2.SendTransactionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

