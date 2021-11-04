//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun unconfirmedTxsResponse(block: examples.api_pb2.UnconfirmedTxsResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.UnconfirmedTxsResponse =
  examples.api_pb2.UnconfirmedTxsResponseKt.Dsl._create(examples.api_pb2.UnconfirmedTxsResponse.newBuilder()).apply { block() }._build()
public object UnconfirmedTxsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.UnconfirmedTxsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.UnconfirmedTxsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.UnconfirmedTxsResponse = _builder.build()

    /**
     * <code>uint64 transaction_count = 1 [json_name = "transactionCount"];</code>
     */
    public var transactionCount: kotlin.Long
      @JvmName("getTransactionCount")
      get() = _builder.getTransactionCount()
      @JvmName("setTransactionCount")
      set(value) {
        _builder.setTransactionCount(value)
      }
    /**
     * <code>uint64 transaction_count = 1 [json_name = "transactionCount"];</code>
     */
    public fun clearTransactionCount() {
      _builder.clearTransactionCount()
    }

    /**
     * <code>uint64 total_transactions = 2 [json_name = "totalTransactions"];</code>
     */
    public var totalTransactions: kotlin.Long
      @JvmName("getTotalTransactions")
      get() = _builder.getTotalTransactions()
      @JvmName("setTotalTransactions")
      set(value) {
        _builder.setTotalTransactions(value)
      }
    /**
     * <code>uint64 total_transactions = 2 [json_name = "totalTransactions"];</code>
     */
    public fun clearTotalTransactions() {
      _builder.clearTotalTransactions()
    }

    /**
     * <code>uint64 total_bytes = 3 [json_name = "totalBytes"];</code>
     */
    public var totalBytes: kotlin.Long
      @JvmName("getTotalBytes")
      get() = _builder.getTotalBytes()
      @JvmName("setTotalBytes")
      set(value) {
        _builder.setTotalBytes(value)
      }
    /**
     * <code>uint64 total_bytes = 3 [json_name = "totalBytes"];</code>
     */
    public fun clearTotalBytes() {
      _builder.clearTotalBytes()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class TransactionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @return A list containing the transactions.
     */
    public val transactions: com.google.protobuf.kotlin.DslList<kotlin.String, TransactionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTransactionsList()
      )
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param value The transactions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTransactions")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, TransactionsProxy>.add(value: kotlin.String) {
      _builder.addTransactions(value)
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param value The transactions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTransactions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, TransactionsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param values The transactions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTransactions")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, TransactionsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllTransactions(values)
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param values The transactions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTransactions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, TransactionsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     * @param index The index to set the value at.
     * @param value The transactions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTransactions")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, TransactionsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setTransactions(index, value)
    }/**
     * <code>repeated string transactions = 4 [json_name = "transactions"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTransactions")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, TransactionsProxy>.clear() {
      _builder.clearTransactions()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.UnconfirmedTxsResponse.copy(block: examples.api_pb2.UnconfirmedTxsResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.UnconfirmedTxsResponse =
  examples.api_pb2.UnconfirmedTxsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
