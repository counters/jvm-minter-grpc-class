// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.UpdatedBlockRewardEvent}
 */
public final class UpdatedBlockRewardEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.UpdatedBlockRewardEvent)
    UpdatedBlockRewardEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatedBlockRewardEvent.newBuilder() to construct.
  private UpdatedBlockRewardEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatedBlockRewardEvent() {
    value_ = "";
    valueLockedStakeRewards_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatedBlockRewardEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdatedBlockRewardEvent(
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

            value_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            valueLockedStakeRewards_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return counters.minter.grpc.client.Events.internal_static_api_pb_UpdatedBlockRewardEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Events.internal_static_api_pb_UpdatedBlockRewardEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.UpdatedBlockRewardEvent.class, counters.minter.grpc.client.UpdatedBlockRewardEvent.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private volatile java.lang.Object value_;
  /**
   * <code>string value = 1;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 1;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_LOCKED_STAKE_REWARDS_FIELD_NUMBER = 2;
  private volatile java.lang.Object valueLockedStakeRewards_;
  /**
   * <code>string value_locked_stake_rewards = 2;</code>
   * @return The valueLockedStakeRewards.
   */
  @java.lang.Override
  public java.lang.String getValueLockedStakeRewards() {
    java.lang.Object ref = valueLockedStakeRewards_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valueLockedStakeRewards_ = s;
      return s;
    }
  }
  /**
   * <code>string value_locked_stake_rewards = 2;</code>
   * @return The bytes for valueLockedStakeRewards.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueLockedStakeRewardsBytes() {
    java.lang.Object ref = valueLockedStakeRewards_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valueLockedStakeRewards_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valueLockedStakeRewards_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, valueLockedStakeRewards_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valueLockedStakeRewards_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, valueLockedStakeRewards_);
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
    if (!(obj instanceof counters.minter.grpc.client.UpdatedBlockRewardEvent)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.UpdatedBlockRewardEvent other = (counters.minter.grpc.client.UpdatedBlockRewardEvent) obj;

    if (!getValue()
        .equals(other.getValue())) return false;
    if (!getValueLockedStakeRewards()
        .equals(other.getValueLockedStakeRewards())) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + VALUE_LOCKED_STAKE_REWARDS_FIELD_NUMBER;
    hash = (53 * hash) + getValueLockedStakeRewards().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.UpdatedBlockRewardEvent parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.UpdatedBlockRewardEvent prototype) {
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
   * Protobuf type {@code api_pb.UpdatedBlockRewardEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.UpdatedBlockRewardEvent)
      counters.minter.grpc.client.UpdatedBlockRewardEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Events.internal_static_api_pb_UpdatedBlockRewardEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Events.internal_static_api_pb_UpdatedBlockRewardEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.UpdatedBlockRewardEvent.class, counters.minter.grpc.client.UpdatedBlockRewardEvent.Builder.class);
    }

    // Construct using counters.minter.grpc.client.UpdatedBlockRewardEvent.newBuilder()
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
      value_ = "";

      valueLockedStakeRewards_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Events.internal_static_api_pb_UpdatedBlockRewardEvent_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.UpdatedBlockRewardEvent getDefaultInstanceForType() {
      return counters.minter.grpc.client.UpdatedBlockRewardEvent.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.UpdatedBlockRewardEvent build() {
      counters.minter.grpc.client.UpdatedBlockRewardEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.UpdatedBlockRewardEvent buildPartial() {
      counters.minter.grpc.client.UpdatedBlockRewardEvent result = new counters.minter.grpc.client.UpdatedBlockRewardEvent(this);
      result.value_ = value_;
      result.valueLockedStakeRewards_ = valueLockedStakeRewards_;
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
      if (other instanceof counters.minter.grpc.client.UpdatedBlockRewardEvent) {
        return mergeFrom((counters.minter.grpc.client.UpdatedBlockRewardEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.UpdatedBlockRewardEvent other) {
      if (other == counters.minter.grpc.client.UpdatedBlockRewardEvent.getDefaultInstance()) return this;
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
      if (!other.getValueLockedStakeRewards().isEmpty()) {
        valueLockedStakeRewards_ = other.valueLockedStakeRewards_;
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
      counters.minter.grpc.client.UpdatedBlockRewardEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.UpdatedBlockRewardEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 1;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 1;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 1;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>string value = 1;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object valueLockedStakeRewards_ = "";
    /**
     * <code>string value_locked_stake_rewards = 2;</code>
     * @return The valueLockedStakeRewards.
     */
    public java.lang.String getValueLockedStakeRewards() {
      java.lang.Object ref = valueLockedStakeRewards_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valueLockedStakeRewards_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value_locked_stake_rewards = 2;</code>
     * @return The bytes for valueLockedStakeRewards.
     */
    public com.google.protobuf.ByteString
        getValueLockedStakeRewardsBytes() {
      java.lang.Object ref = valueLockedStakeRewards_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valueLockedStakeRewards_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value_locked_stake_rewards = 2;</code>
     * @param value The valueLockedStakeRewards to set.
     * @return This builder for chaining.
     */
    public Builder setValueLockedStakeRewards(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valueLockedStakeRewards_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string value_locked_stake_rewards = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValueLockedStakeRewards() {
      
      valueLockedStakeRewards_ = getDefaultInstance().getValueLockedStakeRewards();
      onChanged();
      return this;
    }
    /**
     * <code>string value_locked_stake_rewards = 2;</code>
     * @param value The bytes for valueLockedStakeRewards to set.
     * @return This builder for chaining.
     */
    public Builder setValueLockedStakeRewardsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      valueLockedStakeRewards_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.UpdatedBlockRewardEvent)
  }

  // @@protoc_insertion_point(class_scope:api_pb.UpdatedBlockRewardEvent)
  private static final counters.minter.grpc.client.UpdatedBlockRewardEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.UpdatedBlockRewardEvent();
  }

  public static counters.minter.grpc.client.UpdatedBlockRewardEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatedBlockRewardEvent>
      PARSER = new com.google.protobuf.AbstractParser<UpdatedBlockRewardEvent>() {
    @java.lang.Override
    public UpdatedBlockRewardEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdatedBlockRewardEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdatedBlockRewardEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatedBlockRewardEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.UpdatedBlockRewardEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

