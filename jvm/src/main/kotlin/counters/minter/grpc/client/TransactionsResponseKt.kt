//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun transactionsResponse(block: counters.minter.grpc.client.TransactionsResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.TransactionsResponse =
  counters.minter.grpc.client.TransactionsResponseKt.Dsl._create(counters.minter.grpc.client.TransactionsResponse.newBuilder()).apply { block() }._build()
public object TransactionsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.TransactionsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.TransactionsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.TransactionsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class TransactionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
     */
     public val transactions: com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.TransactionResponse, TransactionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTransactionsList()
      )
    /**
     * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
     * @param value The transactions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTransactions")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.TransactionResponse, TransactionsProxy>.add(value: counters.minter.grpc.client.TransactionResponse) {
      _builder.addTransactions(value)
    }/**
     * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
     * @param value The transactions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTransactions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.TransactionResponse, TransactionsProxy>.plusAssign(value: counters.minter.grpc.client.TransactionResponse) {
      add(value)
    }/**
     * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
     * @param values The transactions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTransactions")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.TransactionResponse, TransactionsProxy>.addAll(values: kotlin.collections.Iterable<counters.minter.grpc.client.TransactionResponse>) {
      _builder.addAllTransactions(values)
    }/**
     * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
     * @param values The transactions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTransactions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.TransactionResponse, TransactionsProxy>.plusAssign(values: kotlin.collections.Iterable<counters.minter.grpc.client.TransactionResponse>) {
      addAll(values)
    }/**
     * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
     * @param index The index to set the value at.
     * @param value The transactions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTransactions")
    public operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.TransactionResponse, TransactionsProxy>.set(index: kotlin.Int, value: counters.minter.grpc.client.TransactionResponse) {
      _builder.setTransactions(index, value)
    }/**
     * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTransactions")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.TransactionResponse, TransactionsProxy>.clear() {
      _builder.clearTransactions()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.TransactionsResponse.copy(block: counters.minter.grpc.client.TransactionsResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.TransactionsResponse =
  counters.minter.grpc.client.TransactionsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()