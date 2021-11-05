// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.RedeemCheckData}
 */
public final class RedeemCheckData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.RedeemCheckData)
    RedeemCheckDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RedeemCheckData.newBuilder() to construct.
  private RedeemCheckData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RedeemCheckData() {
    rawCheck_ = "";
    proof_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RedeemCheckData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RedeemCheckData(
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

            rawCheck_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            proof_ = s;
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
    return counters.minter.grpc.client.Data.internal_static_api_pb_RedeemCheckData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_RedeemCheckData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.RedeemCheckData.class, counters.minter.grpc.client.RedeemCheckData.Builder.class);
  }

  public static final int RAW_CHECK_FIELD_NUMBER = 1;
  private volatile java.lang.Object rawCheck_;
  /**
   * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
   * @return The rawCheck.
   */
  @java.lang.Override
  public java.lang.String getRawCheck() {
    java.lang.Object ref = rawCheck_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rawCheck_ = s;
      return s;
    }
  }
  /**
   * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
   * @return The bytes for rawCheck.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRawCheckBytes() {
    java.lang.Object ref = rawCheck_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rawCheck_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROOF_FIELD_NUMBER = 2;
  private volatile java.lang.Object proof_;
  /**
   * <code>string proof = 2 [json_name = "proof"];</code>
   * @return The proof.
   */
  @java.lang.Override
  public java.lang.String getProof() {
    java.lang.Object ref = proof_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      proof_ = s;
      return s;
    }
  }
  /**
   * <code>string proof = 2 [json_name = "proof"];</code>
   * @return The bytes for proof.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProofBytes() {
    java.lang.Object ref = proof_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      proof_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rawCheck_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rawCheck_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proof_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, proof_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rawCheck_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rawCheck_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proof_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, proof_);
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
    if (!(obj instanceof counters.minter.grpc.client.RedeemCheckData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.RedeemCheckData other = (counters.minter.grpc.client.RedeemCheckData) obj;

    if (!getRawCheck()
        .equals(other.getRawCheck())) return false;
    if (!getProof()
        .equals(other.getProof())) return false;
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
    hash = (37 * hash) + RAW_CHECK_FIELD_NUMBER;
    hash = (53 * hash) + getRawCheck().hashCode();
    hash = (37 * hash) + PROOF_FIELD_NUMBER;
    hash = (53 * hash) + getProof().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.RedeemCheckData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.RedeemCheckData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.RedeemCheckData prototype) {
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
   * Protobuf type {@code api_pb.RedeemCheckData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.RedeemCheckData)
      counters.minter.grpc.client.RedeemCheckDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_RedeemCheckData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_RedeemCheckData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.RedeemCheckData.class, counters.minter.grpc.client.RedeemCheckData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.RedeemCheckData.newBuilder()
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
      rawCheck_ = "";

      proof_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_RedeemCheckData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.RedeemCheckData getDefaultInstanceForType() {
      return counters.minter.grpc.client.RedeemCheckData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.RedeemCheckData build() {
      counters.minter.grpc.client.RedeemCheckData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.RedeemCheckData buildPartial() {
      counters.minter.grpc.client.RedeemCheckData result = new counters.minter.grpc.client.RedeemCheckData(this);
      result.rawCheck_ = rawCheck_;
      result.proof_ = proof_;
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
      if (other instanceof counters.minter.grpc.client.RedeemCheckData) {
        return mergeFrom((counters.minter.grpc.client.RedeemCheckData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.RedeemCheckData other) {
      if (other == counters.minter.grpc.client.RedeemCheckData.getDefaultInstance()) return this;
      if (!other.getRawCheck().isEmpty()) {
        rawCheck_ = other.rawCheck_;
        onChanged();
      }
      if (!other.getProof().isEmpty()) {
        proof_ = other.proof_;
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
      counters.minter.grpc.client.RedeemCheckData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.RedeemCheckData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object rawCheck_ = "";
    /**
     * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
     * @return The rawCheck.
     */
    public java.lang.String getRawCheck() {
      java.lang.Object ref = rawCheck_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rawCheck_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
     * @return The bytes for rawCheck.
     */
    public com.google.protobuf.ByteString
        getRawCheckBytes() {
      java.lang.Object ref = rawCheck_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rawCheck_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
     * @param value The rawCheck to set.
     * @return This builder for chaining.
     */
    public Builder setRawCheck(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rawCheck_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRawCheck() {
      
      rawCheck_ = getDefaultInstance().getRawCheck();
      onChanged();
      return this;
    }
    /**
     * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
     * @param value The bytes for rawCheck to set.
     * @return This builder for chaining.
     */
    public Builder setRawCheckBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rawCheck_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object proof_ = "";
    /**
     * <code>string proof = 2 [json_name = "proof"];</code>
     * @return The proof.
     */
    public java.lang.String getProof() {
      java.lang.Object ref = proof_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        proof_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string proof = 2 [json_name = "proof"];</code>
     * @return The bytes for proof.
     */
    public com.google.protobuf.ByteString
        getProofBytes() {
      java.lang.Object ref = proof_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        proof_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string proof = 2 [json_name = "proof"];</code>
     * @param value The proof to set.
     * @return This builder for chaining.
     */
    public Builder setProof(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      proof_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string proof = 2 [json_name = "proof"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProof() {
      
      proof_ = getDefaultInstance().getProof();
      onChanged();
      return this;
    }
    /**
     * <code>string proof = 2 [json_name = "proof"];</code>
     * @param value The bytes for proof to set.
     * @return This builder for chaining.
     */
    public Builder setProofBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      proof_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.RedeemCheckData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.RedeemCheckData)
  private static final counters.minter.grpc.client.RedeemCheckData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.RedeemCheckData();
  }

  public static counters.minter.grpc.client.RedeemCheckData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RedeemCheckData>
      PARSER = new com.google.protobuf.AbstractParser<RedeemCheckData>() {
    @java.lang.Override
    public RedeemCheckData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RedeemCheckData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RedeemCheckData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RedeemCheckData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.RedeemCheckData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
