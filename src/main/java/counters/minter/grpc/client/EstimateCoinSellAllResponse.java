// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.EstimateCoinSellAllResponse}
 */
public final class EstimateCoinSellAllResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.EstimateCoinSellAllResponse)
    EstimateCoinSellAllResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EstimateCoinSellAllResponse.newBuilder() to construct.
  private EstimateCoinSellAllResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EstimateCoinSellAllResponse() {
    willGet_ = "";
    swapFrom_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EstimateCoinSellAllResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EstimateCoinSellAllResponse(
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

            willGet_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            swapFrom_ = rawValue;
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
    return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateCoinSellAllResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateCoinSellAllResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.EstimateCoinSellAllResponse.class, counters.minter.grpc.client.EstimateCoinSellAllResponse.Builder.class);
  }

  public static final int WILL_GET_FIELD_NUMBER = 1;
  private volatile java.lang.Object willGet_;
  /**
   * <code>string will_get = 1 [json_name = "willGet"];</code>
   * @return The willGet.
   */
  @java.lang.Override
  public java.lang.String getWillGet() {
    java.lang.Object ref = willGet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      willGet_ = s;
      return s;
    }
  }
  /**
   * <code>string will_get = 1 [json_name = "willGet"];</code>
   * @return The bytes for willGet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWillGetBytes() {
    java.lang.Object ref = willGet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      willGet_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SWAP_FROM_FIELD_NUMBER = 2;
  private int swapFrom_;
  /**
   * <code>.api_pb.SwapFrom swap_from = 2 [json_name = "swapFrom"];</code>
   * @return The enum numeric value on the wire for swapFrom.
   */
  @java.lang.Override public int getSwapFromValue() {
    return swapFrom_;
  }
  /**
   * <code>.api_pb.SwapFrom swap_from = 2 [json_name = "swapFrom"];</code>
   * @return The swapFrom.
   */
  @java.lang.Override public counters.minter.grpc.client.SwapFrom getSwapFrom() {
    @SuppressWarnings("deprecation")
    counters.minter.grpc.client.SwapFrom result = counters.minter.grpc.client.SwapFrom.valueOf(swapFrom_);
    return result == null ? counters.minter.grpc.client.SwapFrom.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(willGet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, willGet_);
    }
    if (swapFrom_ != counters.minter.grpc.client.SwapFrom.optimal.getNumber()) {
      output.writeEnum(2, swapFrom_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(willGet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, willGet_);
    }
    if (swapFrom_ != counters.minter.grpc.client.SwapFrom.optimal.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, swapFrom_);
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
    if (!(obj instanceof counters.minter.grpc.client.EstimateCoinSellAllResponse)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.EstimateCoinSellAllResponse other = (counters.minter.grpc.client.EstimateCoinSellAllResponse) obj;

    if (!getWillGet()
        .equals(other.getWillGet())) return false;
    if (swapFrom_ != other.swapFrom_) return false;
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
    hash = (37 * hash) + WILL_GET_FIELD_NUMBER;
    hash = (53 * hash) + getWillGet().hashCode();
    hash = (37 * hash) + SWAP_FROM_FIELD_NUMBER;
    hash = (53 * hash) + swapFrom_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EstimateCoinSellAllResponse parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.EstimateCoinSellAllResponse prototype) {
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
   * Protobuf type {@code api_pb.EstimateCoinSellAllResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.EstimateCoinSellAllResponse)
      counters.minter.grpc.client.EstimateCoinSellAllResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateCoinSellAllResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateCoinSellAllResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.EstimateCoinSellAllResponse.class, counters.minter.grpc.client.EstimateCoinSellAllResponse.Builder.class);
    }

    // Construct using counters.minter.grpc.client.EstimateCoinSellAllResponse.newBuilder()
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
      willGet_ = "";

      swapFrom_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateCoinSellAllResponse_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.EstimateCoinSellAllResponse getDefaultInstanceForType() {
      return counters.minter.grpc.client.EstimateCoinSellAllResponse.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.EstimateCoinSellAllResponse build() {
      counters.minter.grpc.client.EstimateCoinSellAllResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.EstimateCoinSellAllResponse buildPartial() {
      counters.minter.grpc.client.EstimateCoinSellAllResponse result = new counters.minter.grpc.client.EstimateCoinSellAllResponse(this);
      result.willGet_ = willGet_;
      result.swapFrom_ = swapFrom_;
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
      if (other instanceof counters.minter.grpc.client.EstimateCoinSellAllResponse) {
        return mergeFrom((counters.minter.grpc.client.EstimateCoinSellAllResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.EstimateCoinSellAllResponse other) {
      if (other == counters.minter.grpc.client.EstimateCoinSellAllResponse.getDefaultInstance()) return this;
      if (!other.getWillGet().isEmpty()) {
        willGet_ = other.willGet_;
        onChanged();
      }
      if (other.swapFrom_ != 0) {
        setSwapFromValue(other.getSwapFromValue());
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
      counters.minter.grpc.client.EstimateCoinSellAllResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.EstimateCoinSellAllResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object willGet_ = "";
    /**
     * <code>string will_get = 1 [json_name = "willGet"];</code>
     * @return The willGet.
     */
    public java.lang.String getWillGet() {
      java.lang.Object ref = willGet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        willGet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string will_get = 1 [json_name = "willGet"];</code>
     * @return The bytes for willGet.
     */
    public com.google.protobuf.ByteString
        getWillGetBytes() {
      java.lang.Object ref = willGet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        willGet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string will_get = 1 [json_name = "willGet"];</code>
     * @param value The willGet to set.
     * @return This builder for chaining.
     */
    public Builder setWillGet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      willGet_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string will_get = 1 [json_name = "willGet"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWillGet() {
      
      willGet_ = getDefaultInstance().getWillGet();
      onChanged();
      return this;
    }
    /**
     * <code>string will_get = 1 [json_name = "willGet"];</code>
     * @param value The bytes for willGet to set.
     * @return This builder for chaining.
     */
    public Builder setWillGetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      willGet_ = value;
      onChanged();
      return this;
    }

    private int swapFrom_ = 0;
    /**
     * <code>.api_pb.SwapFrom swap_from = 2 [json_name = "swapFrom"];</code>
     * @return The enum numeric value on the wire for swapFrom.
     */
    @java.lang.Override public int getSwapFromValue() {
      return swapFrom_;
    }
    /**
     * <code>.api_pb.SwapFrom swap_from = 2 [json_name = "swapFrom"];</code>
     * @param value The enum numeric value on the wire for swapFrom to set.
     * @return This builder for chaining.
     */
    public Builder setSwapFromValue(int value) {
      
      swapFrom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.api_pb.SwapFrom swap_from = 2 [json_name = "swapFrom"];</code>
     * @return The swapFrom.
     */
    @java.lang.Override
    public counters.minter.grpc.client.SwapFrom getSwapFrom() {
      @SuppressWarnings("deprecation")
      counters.minter.grpc.client.SwapFrom result = counters.minter.grpc.client.SwapFrom.valueOf(swapFrom_);
      return result == null ? counters.minter.grpc.client.SwapFrom.UNRECOGNIZED : result;
    }
    /**
     * <code>.api_pb.SwapFrom swap_from = 2 [json_name = "swapFrom"];</code>
     * @param value The swapFrom to set.
     * @return This builder for chaining.
     */
    public Builder setSwapFrom(counters.minter.grpc.client.SwapFrom value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      swapFrom_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api_pb.SwapFrom swap_from = 2 [json_name = "swapFrom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSwapFrom() {
      
      swapFrom_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api_pb.EstimateCoinSellAllResponse)
  }

  // @@protoc_insertion_point(class_scope:api_pb.EstimateCoinSellAllResponse)
  private static final counters.minter.grpc.client.EstimateCoinSellAllResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.EstimateCoinSellAllResponse();
  }

  public static counters.minter.grpc.client.EstimateCoinSellAllResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EstimateCoinSellAllResponse>
      PARSER = new com.google.protobuf.AbstractParser<EstimateCoinSellAllResponse>() {
    @java.lang.Override
    public EstimateCoinSellAllResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EstimateCoinSellAllResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EstimateCoinSellAllResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EstimateCoinSellAllResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.EstimateCoinSellAllResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

