// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.EditCandidateData}
 */
public final class EditCandidateData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.EditCandidateData)
    EditCandidateDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EditCandidateData.newBuilder() to construct.
  private EditCandidateData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EditCandidateData() {
    pubKey_ = "";
    rewardAddress_ = "";
    ownerAddress_ = "";
    controlAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EditCandidateData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EditCandidateData(
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

            pubKey_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            rewardAddress_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            ownerAddress_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            controlAddress_ = s;
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
    return counters.minter.grpc.client.Data.internal_static_api_pb_EditCandidateData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_EditCandidateData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.EditCandidateData.class, counters.minter.grpc.client.EditCandidateData.Builder.class);
  }

  public static final int PUB_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object pubKey_;
  /**
   * <code>string pub_key = 1 [json_name = "pubKey"];</code>
   * @return The pubKey.
   */
  @java.lang.Override
  public java.lang.String getPubKey() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pubKey_ = s;
      return s;
    }
  }
  /**
   * <code>string pub_key = 1 [json_name = "pubKey"];</code>
   * @return The bytes for pubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPubKeyBytes() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REWARD_ADDRESS_FIELD_NUMBER = 3;
  private volatile java.lang.Object rewardAddress_;
  /**
   * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
   * @return The rewardAddress.
   */
  @java.lang.Override
  public java.lang.String getRewardAddress() {
    java.lang.Object ref = rewardAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
   * @return The bytes for rewardAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardAddressBytes() {
    java.lang.Object ref = rewardAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OWNER_ADDRESS_FIELD_NUMBER = 4;
  private volatile java.lang.Object ownerAddress_;
  /**
   * <code>string owner_address = 4 [json_name = "ownerAddress"];</code>
   * @return The ownerAddress.
   */
  @java.lang.Override
  public java.lang.String getOwnerAddress() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ownerAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string owner_address = 4 [json_name = "ownerAddress"];</code>
   * @return The bytes for ownerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerAddressBytes() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ownerAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTROL_ADDRESS_FIELD_NUMBER = 5;
  private volatile java.lang.Object controlAddress_;
  /**
   * <code>string control_address = 5 [json_name = "controlAddress"];</code>
   * @return The controlAddress.
   */
  @java.lang.Override
  public java.lang.String getControlAddress() {
    java.lang.Object ref = controlAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      controlAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string control_address = 5 [json_name = "controlAddress"];</code>
   * @return The bytes for controlAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getControlAddressBytes() {
    java.lang.Object ref = controlAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      controlAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pubKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rewardAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ownerAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ownerAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(controlAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, controlAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pubKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, rewardAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ownerAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, ownerAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(controlAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, controlAddress_);
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
    if (!(obj instanceof counters.minter.grpc.client.EditCandidateData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.EditCandidateData other = (counters.minter.grpc.client.EditCandidateData) obj;

    if (!getPubKey()
        .equals(other.getPubKey())) return false;
    if (!getRewardAddress()
        .equals(other.getRewardAddress())) return false;
    if (!getOwnerAddress()
        .equals(other.getOwnerAddress())) return false;
    if (!getControlAddress()
        .equals(other.getControlAddress())) return false;
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
    hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
    hash = (37 * hash) + REWARD_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getRewardAddress().hashCode();
    hash = (37 * hash) + OWNER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOwnerAddress().hashCode();
    hash = (37 * hash) + CONTROL_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getControlAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.EditCandidateData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EditCandidateData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EditCandidateData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EditCandidateData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EditCandidateData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EditCandidateData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EditCandidateData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EditCandidateData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.EditCandidateData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EditCandidateData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.EditCandidateData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EditCandidateData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.EditCandidateData prototype) {
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
   * Protobuf type {@code api_pb.EditCandidateData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.EditCandidateData)
      counters.minter.grpc.client.EditCandidateDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_EditCandidateData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_EditCandidateData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.EditCandidateData.class, counters.minter.grpc.client.EditCandidateData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.EditCandidateData.newBuilder()
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
      pubKey_ = "";

      rewardAddress_ = "";

      ownerAddress_ = "";

      controlAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_EditCandidateData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.EditCandidateData getDefaultInstanceForType() {
      return counters.minter.grpc.client.EditCandidateData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.EditCandidateData build() {
      counters.minter.grpc.client.EditCandidateData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.EditCandidateData buildPartial() {
      counters.minter.grpc.client.EditCandidateData result = new counters.minter.grpc.client.EditCandidateData(this);
      result.pubKey_ = pubKey_;
      result.rewardAddress_ = rewardAddress_;
      result.ownerAddress_ = ownerAddress_;
      result.controlAddress_ = controlAddress_;
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
      if (other instanceof counters.minter.grpc.client.EditCandidateData) {
        return mergeFrom((counters.minter.grpc.client.EditCandidateData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.EditCandidateData other) {
      if (other == counters.minter.grpc.client.EditCandidateData.getDefaultInstance()) return this;
      if (!other.getPubKey().isEmpty()) {
        pubKey_ = other.pubKey_;
        onChanged();
      }
      if (!other.getRewardAddress().isEmpty()) {
        rewardAddress_ = other.rewardAddress_;
        onChanged();
      }
      if (!other.getOwnerAddress().isEmpty()) {
        ownerAddress_ = other.ownerAddress_;
        onChanged();
      }
      if (!other.getControlAddress().isEmpty()) {
        controlAddress_ = other.controlAddress_;
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
      counters.minter.grpc.client.EditCandidateData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.EditCandidateData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pubKey_ = "";
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return The pubKey.
     */
    public java.lang.String getPubKey() {
      java.lang.Object ref = pubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return The bytes for pubKey.
     */
    public com.google.protobuf.ByteString
        getPubKeyBytes() {
      java.lang.Object ref = pubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @param value The pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPubKey() {
      
      pubKey_ = getDefaultInstance().getPubKey();
      onChanged();
      return this;
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @param value The bytes for pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pubKey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object rewardAddress_ = "";
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @return The rewardAddress.
     */
    public java.lang.String getRewardAddress() {
      java.lang.Object ref = rewardAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @return The bytes for rewardAddress.
     */
    public com.google.protobuf.ByteString
        getRewardAddressBytes() {
      java.lang.Object ref = rewardAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @param value The rewardAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rewardAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardAddress() {
      
      rewardAddress_ = getDefaultInstance().getRewardAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @param value The bytes for rewardAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rewardAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ownerAddress_ = "";
    /**
     * <code>string owner_address = 4 [json_name = "ownerAddress"];</code>
     * @return The ownerAddress.
     */
    public java.lang.String getOwnerAddress() {
      java.lang.Object ref = ownerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ownerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string owner_address = 4 [json_name = "ownerAddress"];</code>
     * @return The bytes for ownerAddress.
     */
    public com.google.protobuf.ByteString
        getOwnerAddressBytes() {
      java.lang.Object ref = ownerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ownerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string owner_address = 4 [json_name = "ownerAddress"];</code>
     * @param value The ownerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ownerAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string owner_address = 4 [json_name = "ownerAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwnerAddress() {
      
      ownerAddress_ = getDefaultInstance().getOwnerAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string owner_address = 4 [json_name = "ownerAddress"];</code>
     * @param value The bytes for ownerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ownerAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object controlAddress_ = "";
    /**
     * <code>string control_address = 5 [json_name = "controlAddress"];</code>
     * @return The controlAddress.
     */
    public java.lang.String getControlAddress() {
      java.lang.Object ref = controlAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        controlAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string control_address = 5 [json_name = "controlAddress"];</code>
     * @return The bytes for controlAddress.
     */
    public com.google.protobuf.ByteString
        getControlAddressBytes() {
      java.lang.Object ref = controlAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        controlAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string control_address = 5 [json_name = "controlAddress"];</code>
     * @param value The controlAddress to set.
     * @return This builder for chaining.
     */
    public Builder setControlAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      controlAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string control_address = 5 [json_name = "controlAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearControlAddress() {
      
      controlAddress_ = getDefaultInstance().getControlAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string control_address = 5 [json_name = "controlAddress"];</code>
     * @param value The bytes for controlAddress to set.
     * @return This builder for chaining.
     */
    public Builder setControlAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      controlAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.EditCandidateData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.EditCandidateData)
  private static final counters.minter.grpc.client.EditCandidateData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.EditCandidateData();
  }

  public static counters.minter.grpc.client.EditCandidateData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditCandidateData>
      PARSER = new com.google.protobuf.AbstractParser<EditCandidateData>() {
    @java.lang.Override
    public EditCandidateData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EditCandidateData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EditCandidateData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditCandidateData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.EditCandidateData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
