// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

/**
 * Protobuf type {@code api_pb.UnconfirmedTxsResponse}
 */
public final class UnconfirmedTxsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.UnconfirmedTxsResponse)
    UnconfirmedTxsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnconfirmedTxsResponse.newBuilder() to construct.
  private UnconfirmedTxsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnconfirmedTxsResponse() {
    transactions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnconfirmedTxsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UnconfirmedTxsResponse(
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

            transactionCount_ = input.readUInt64();
            break;
          }
          case 16: {

            totalTransactions_ = input.readUInt64();
            break;
          }
          case 24: {

            totalBytes_ = input.readUInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              transactions_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            transactions_.add(s);
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
        transactions_ = transactions_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return examples.api_pb2.Resources.internal_static_api_pb_UnconfirmedTxsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return examples.api_pb2.Resources.internal_static_api_pb_UnconfirmedTxsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            examples.api_pb2.UnconfirmedTxsResponse.class, examples.api_pb2.UnconfirmedTxsResponse.Builder.class);
  }

  public static final int TRANSACTION_COUNT_FIELD_NUMBER = 1;
  private long transactionCount_;
  /**
   * <code>uint64 transaction_count = 1 [json_name = "transactionCount"];</code>
   * @return The transactionCount.
   */
  @java.lang.Override
  public long getTransactionCount() {
    return transactionCount_;
  }

  public static final int TOTAL_TRANSACTIONS_FIELD_NUMBER = 2;
  private long totalTransactions_;
  /**
   * <code>uint64 total_transactions = 2 [json_name = "totalTransactions"];</code>
   * @return The totalTransactions.
   */
  @java.lang.Override
  public long getTotalTransactions() {
    return totalTransactions_;
  }

  public static final int TOTAL_BYTES_FIELD_NUMBER = 3;
  private long totalBytes_;
  /**
   * <code>uint64 total_bytes = 3 [json_name = "totalBytes"];</code>
   * @return The totalBytes.
   */
  @java.lang.Override
  public long getTotalBytes() {
    return totalBytes_;
  }

  public static final int TRANSACTIONS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList transactions_;
  /**
   * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
   * @return A list containing the transactions.
   */
  public com.google.protobuf.ProtocolStringList
      getTransactionsList() {
    return transactions_;
  }
  /**
   * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
   * @return The count of transactions.
   */
  public int getTransactionsCount() {
    return transactions_.size();
  }
  /**
   * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
   * @param index The index of the element to return.
   * @return The transactions at the given index.
   */
  public java.lang.String getTransactions(int index) {
    return transactions_.get(index);
  }
  /**
   * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the transactions at the given index.
   */
  public com.google.protobuf.ByteString
      getTransactionsBytes(int index) {
    return transactions_.getByteString(index);
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
    if (transactionCount_ != 0L) {
      output.writeUInt64(1, transactionCount_);
    }
    if (totalTransactions_ != 0L) {
      output.writeUInt64(2, totalTransactions_);
    }
    if (totalBytes_ != 0L) {
      output.writeUInt64(3, totalBytes_);
    }
    for (int i = 0; i < transactions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, transactions_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transactionCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, transactionCount_);
    }
    if (totalTransactions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, totalTransactions_);
    }
    if (totalBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, totalBytes_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < transactions_.size(); i++) {
        dataSize += computeStringSizeNoTag(transactions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTransactionsList().size();
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
    if (!(obj instanceof examples.api_pb2.UnconfirmedTxsResponse)) {
      return super.equals(obj);
    }
    examples.api_pb2.UnconfirmedTxsResponse other = (examples.api_pb2.UnconfirmedTxsResponse) obj;

    if (getTransactionCount()
        != other.getTransactionCount()) return false;
    if (getTotalTransactions()
        != other.getTotalTransactions()) return false;
    if (getTotalBytes()
        != other.getTotalBytes()) return false;
    if (!getTransactionsList()
        .equals(other.getTransactionsList())) return false;
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
    hash = (37 * hash) + TRANSACTION_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTransactionCount());
    hash = (37 * hash) + TOTAL_TRANSACTIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalTransactions());
    hash = (37 * hash) + TOTAL_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalBytes());
    if (getTransactionsCount() > 0) {
      hash = (37 * hash) + TRANSACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static examples.api_pb2.UnconfirmedTxsResponse parseFrom(
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
  public static Builder newBuilder(examples.api_pb2.UnconfirmedTxsResponse prototype) {
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
   * Protobuf type {@code api_pb.UnconfirmedTxsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.UnconfirmedTxsResponse)
      examples.api_pb2.UnconfirmedTxsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return examples.api_pb2.Resources.internal_static_api_pb_UnconfirmedTxsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return examples.api_pb2.Resources.internal_static_api_pb_UnconfirmedTxsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              examples.api_pb2.UnconfirmedTxsResponse.class, examples.api_pb2.UnconfirmedTxsResponse.Builder.class);
    }

    // Construct using examples.api_pb2.UnconfirmedTxsResponse.newBuilder()
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
      transactionCount_ = 0L;

      totalTransactions_ = 0L;

      totalBytes_ = 0L;

      transactions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return examples.api_pb2.Resources.internal_static_api_pb_UnconfirmedTxsResponse_descriptor;
    }

    @java.lang.Override
    public examples.api_pb2.UnconfirmedTxsResponse getDefaultInstanceForType() {
      return examples.api_pb2.UnconfirmedTxsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public examples.api_pb2.UnconfirmedTxsResponse build() {
      examples.api_pb2.UnconfirmedTxsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public examples.api_pb2.UnconfirmedTxsResponse buildPartial() {
      examples.api_pb2.UnconfirmedTxsResponse result = new examples.api_pb2.UnconfirmedTxsResponse(this);
      int from_bitField0_ = bitField0_;
      result.transactionCount_ = transactionCount_;
      result.totalTransactions_ = totalTransactions_;
      result.totalBytes_ = totalBytes_;
      if (((bitField0_ & 0x00000001) != 0)) {
        transactions_ = transactions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.transactions_ = transactions_;
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
      if (other instanceof examples.api_pb2.UnconfirmedTxsResponse) {
        return mergeFrom((examples.api_pb2.UnconfirmedTxsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(examples.api_pb2.UnconfirmedTxsResponse other) {
      if (other == examples.api_pb2.UnconfirmedTxsResponse.getDefaultInstance()) return this;
      if (other.getTransactionCount() != 0L) {
        setTransactionCount(other.getTransactionCount());
      }
      if (other.getTotalTransactions() != 0L) {
        setTotalTransactions(other.getTotalTransactions());
      }
      if (other.getTotalBytes() != 0L) {
        setTotalBytes(other.getTotalBytes());
      }
      if (!other.transactions_.isEmpty()) {
        if (transactions_.isEmpty()) {
          transactions_ = other.transactions_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTransactionsIsMutable();
          transactions_.addAll(other.transactions_);
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
      examples.api_pb2.UnconfirmedTxsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (examples.api_pb2.UnconfirmedTxsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long transactionCount_ ;
    /**
     * <code>uint64 transaction_count = 1 [json_name = "transactionCount"];</code>
     * @return The transactionCount.
     */
    @java.lang.Override
    public long getTransactionCount() {
      return transactionCount_;
    }
    /**
     * <code>uint64 transaction_count = 1 [json_name = "transactionCount"];</code>
     * @param value The transactionCount to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionCount(long value) {
      
      transactionCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 transaction_count = 1 [json_name = "transactionCount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTransactionCount() {
      
      transactionCount_ = 0L;
      onChanged();
      return this;
    }

    private long totalTransactions_ ;
    /**
     * <code>uint64 total_transactions = 2 [json_name = "totalTransactions"];</code>
     * @return The totalTransactions.
     */
    @java.lang.Override
    public long getTotalTransactions() {
      return totalTransactions_;
    }
    /**
     * <code>uint64 total_transactions = 2 [json_name = "totalTransactions"];</code>
     * @param value The totalTransactions to set.
     * @return This builder for chaining.
     */
    public Builder setTotalTransactions(long value) {
      
      totalTransactions_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 total_transactions = 2 [json_name = "totalTransactions"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalTransactions() {
      
      totalTransactions_ = 0L;
      onChanged();
      return this;
    }

    private long totalBytes_ ;
    /**
     * <code>uint64 total_bytes = 3 [json_name = "totalBytes"];</code>
     * @return The totalBytes.
     */
    @java.lang.Override
    public long getTotalBytes() {
      return totalBytes_;
    }
    /**
     * <code>uint64 total_bytes = 3 [json_name = "totalBytes"];</code>
     * @param value The totalBytes to set.
     * @return This builder for chaining.
     */
    public Builder setTotalBytes(long value) {
      
      totalBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 total_bytes = 3 [json_name = "totalBytes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalBytes() {
      
      totalBytes_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList transactions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTransactionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        transactions_ = new com.google.protobuf.LazyStringArrayList(transactions_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @return A list containing the transactions.
     */
    public com.google.protobuf.ProtocolStringList
        getTransactionsList() {
      return transactions_.getUnmodifiableView();
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @return The count of transactions.
     */
    public int getTransactionsCount() {
      return transactions_.size();
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param index The index of the element to return.
     * @return The transactions at the given index.
     */
    public java.lang.String getTransactions(int index) {
      return transactions_.get(index);
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the transactions at the given index.
     */
    public com.google.protobuf.ByteString
        getTransactionsBytes(int index) {
      return transactions_.getByteString(index);
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param index The index to set the value at.
     * @param value The transactions to set.
     * @return This builder for chaining.
     */
    public Builder setTransactions(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTransactionsIsMutable();
      transactions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param value The transactions to add.
     * @return This builder for chaining.
     */
    public Builder addTransactions(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTransactionsIsMutable();
      transactions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param values The transactions to add.
     * @return This builder for chaining.
     */
    public Builder addAllTransactions(
        java.lang.Iterable<java.lang.String> values) {
      ensureTransactionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, transactions_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTransactions() {
      transactions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param value The bytes of the transactions to add.
     * @return This builder for chaining.
     */
    public Builder addTransactionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTransactionsIsMutable();
      transactions_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api_pb.UnconfirmedTxsResponse)
  }

  // @@protoc_insertion_point(class_scope:api_pb.UnconfirmedTxsResponse)
  private static final examples.api_pb2.UnconfirmedTxsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new examples.api_pb2.UnconfirmedTxsResponse();
  }

  public static examples.api_pb2.UnconfirmedTxsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnconfirmedTxsResponse>
      PARSER = new com.google.protobuf.AbstractParser<UnconfirmedTxsResponse>() {
    @java.lang.Override
    public UnconfirmedTxsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UnconfirmedTxsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UnconfirmedTxsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnconfirmedTxsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public examples.api_pb2.UnconfirmedTxsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

