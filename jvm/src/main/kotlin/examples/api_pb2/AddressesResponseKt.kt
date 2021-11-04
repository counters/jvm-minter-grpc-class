//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun addressesResponse(block: examples.api_pb2.AddressesResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.AddressesResponse =
  examples.api_pb2.AddressesResponseKt.Dsl._create(examples.api_pb2.AddressesResponse.newBuilder()).apply { block() }._build()
public object AddressesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.AddressesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.AddressesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.AddressesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AddressesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>map&lt;string, .api_pb.AddressesResponse.Result&gt; addresses = 3 [json_name = "addresses"];</code>
     */
     public val addresses: com.google.protobuf.kotlin.DslMap<kotlin.String, examples.api_pb2.AddressesResponse.Result, AddressesProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getAddressesMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getAddressesMap()
      )
    /**
     * <code>map&lt;string, .api_pb.AddressesResponse.Result&gt; addresses = 3 [json_name = "addresses"];</code>
     */
    @JvmName("putAddresses")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, examples.api_pb2.AddressesResponse.Result, AddressesProxy>
      .put(key: kotlin.String, value: examples.api_pb2.AddressesResponse.Result) {
         _builder.putAddresses(key, value)
       }
    /**
     * <code>map&lt;string, .api_pb.AddressesResponse.Result&gt; addresses = 3 [json_name = "addresses"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setAddresses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, examples.api_pb2.AddressesResponse.Result, AddressesProxy>
      .set(key: kotlin.String, value: examples.api_pb2.AddressesResponse.Result) {
         put(key, value)
       }
    /**
     * <code>map&lt;string, .api_pb.AddressesResponse.Result&gt; addresses = 3 [json_name = "addresses"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeAddresses")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, examples.api_pb2.AddressesResponse.Result, AddressesProxy>
      .remove(key: kotlin.String) {
         _builder.removeAddresses(key)
       }
    /**
     * <code>map&lt;string, .api_pb.AddressesResponse.Result&gt; addresses = 3 [json_name = "addresses"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllAddresses")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, examples.api_pb2.AddressesResponse.Result, AddressesProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, examples.api_pb2.AddressesResponse.Result>) {
         _builder.putAllAddresses(map)
       }
    /**
     * <code>map&lt;string, .api_pb.AddressesResponse.Result&gt; addresses = 3 [json_name = "addresses"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearAddresses")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, examples.api_pb2.AddressesResponse.Result, AddressesProxy>
      .clear() {
         _builder.clearAddresses()
       }
  }
  @kotlin.jvm.JvmSynthetic
  public inline fun result(block: examples.api_pb2.AddressesResponseKt.ResultKt.Dsl.() -> kotlin.Unit): examples.api_pb2.AddressesResponse.Result =
    examples.api_pb2.AddressesResponseKt.ResultKt.Dsl._create(examples.api_pb2.AddressesResponse.Result.newBuilder()).apply { block() }._build()
  public object ResultKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: examples.api_pb2.AddressesResponse.Result.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: examples.api_pb2.AddressesResponse.Result.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): examples.api_pb2.AddressesResponse.Result = _builder.build()

      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class BalanceProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * <code>repeated .api_pb.AddressBalance balance = 2 [json_name = "balance"];</code>
       */
       public val balance: com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, BalanceProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getBalanceList()
        )
      /**
       * <code>repeated .api_pb.AddressBalance balance = 2 [json_name = "balance"];</code>
       * @param value The balance to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addBalance")
      public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, BalanceProxy>.add(value: examples.api_pb2.AddressBalance) {
        _builder.addBalance(value)
      }/**
       * <code>repeated .api_pb.AddressBalance balance = 2 [json_name = "balance"];</code>
       * @param value The balance to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignBalance")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, BalanceProxy>.plusAssign(value: examples.api_pb2.AddressBalance) {
        add(value)
      }/**
       * <code>repeated .api_pb.AddressBalance balance = 2 [json_name = "balance"];</code>
       * @param values The balance to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllBalance")
      public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, BalanceProxy>.addAll(values: kotlin.collections.Iterable<examples.api_pb2.AddressBalance>) {
        _builder.addAllBalance(values)
      }/**
       * <code>repeated .api_pb.AddressBalance balance = 2 [json_name = "balance"];</code>
       * @param values The balance to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllBalance")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, BalanceProxy>.plusAssign(values: kotlin.collections.Iterable<examples.api_pb2.AddressBalance>) {
        addAll(values)
      }/**
       * <code>repeated .api_pb.AddressBalance balance = 2 [json_name = "balance"];</code>
       * @param index The index to set the value at.
       * @param value The balance to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setBalance")
      public operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, BalanceProxy>.set(index: kotlin.Int, value: examples.api_pb2.AddressBalance) {
        _builder.setBalance(index, value)
      }/**
       * <code>repeated .api_pb.AddressBalance balance = 2 [json_name = "balance"];</code>
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearBalance")
      public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, BalanceProxy>.clear() {
        _builder.clearBalance()
      }
      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class DelegatedProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * <pre>
       * Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressDelegatedBalance delegated = 6 [json_name = "delegated"];</code>
       */
       public val delegated: com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressDelegatedBalance, DelegatedProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getDelegatedList()
        )
      /**
       * <pre>
       * Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressDelegatedBalance delegated = 6 [json_name = "delegated"];</code>
       * @param value The delegated to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addDelegated")
      public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressDelegatedBalance, DelegatedProxy>.add(value: examples.api_pb2.AddressDelegatedBalance) {
        _builder.addDelegated(value)
      }/**
       * <pre>
       * Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressDelegatedBalance delegated = 6 [json_name = "delegated"];</code>
       * @param value The delegated to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignDelegated")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressDelegatedBalance, DelegatedProxy>.plusAssign(value: examples.api_pb2.AddressDelegatedBalance) {
        add(value)
      }/**
       * <pre>
       * Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressDelegatedBalance delegated = 6 [json_name = "delegated"];</code>
       * @param values The delegated to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllDelegated")
      public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressDelegatedBalance, DelegatedProxy>.addAll(values: kotlin.collections.Iterable<examples.api_pb2.AddressDelegatedBalance>) {
        _builder.addAllDelegated(values)
      }/**
       * <pre>
       * Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressDelegatedBalance delegated = 6 [json_name = "delegated"];</code>
       * @param values The delegated to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllDelegated")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressDelegatedBalance, DelegatedProxy>.plusAssign(values: kotlin.collections.Iterable<examples.api_pb2.AddressDelegatedBalance>) {
        addAll(values)
      }/**
       * <pre>
       * Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressDelegatedBalance delegated = 6 [json_name = "delegated"];</code>
       * @param index The index to set the value at.
       * @param value The delegated to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setDelegated")
      public operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressDelegatedBalance, DelegatedProxy>.set(index: kotlin.Int, value: examples.api_pb2.AddressDelegatedBalance) {
        _builder.setDelegated(index, value)
      }/**
       * <pre>
       * Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressDelegatedBalance delegated = 6 [json_name = "delegated"];</code>
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearDelegated")
      public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressDelegatedBalance, DelegatedProxy>.clear() {
        _builder.clearDelegated()
      }
      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class TotalProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * <pre>
       * Sum of balance and delegated by coins. Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressBalance total = 4 [json_name = "total"];</code>
       */
       public val total: com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, TotalProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getTotalList()
        )
      /**
       * <pre>
       * Sum of balance and delegated by coins. Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressBalance total = 4 [json_name = "total"];</code>
       * @param value The total to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addTotal")
      public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, TotalProxy>.add(value: examples.api_pb2.AddressBalance) {
        _builder.addTotal(value)
      }/**
       * <pre>
       * Sum of balance and delegated by coins. Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressBalance total = 4 [json_name = "total"];</code>
       * @param value The total to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignTotal")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, TotalProxy>.plusAssign(value: examples.api_pb2.AddressBalance) {
        add(value)
      }/**
       * <pre>
       * Sum of balance and delegated by coins. Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressBalance total = 4 [json_name = "total"];</code>
       * @param values The total to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllTotal")
      public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, TotalProxy>.addAll(values: kotlin.collections.Iterable<examples.api_pb2.AddressBalance>) {
        _builder.addAllTotal(values)
      }/**
       * <pre>
       * Sum of balance and delegated by coins. Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressBalance total = 4 [json_name = "total"];</code>
       * @param values The total to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllTotal")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, TotalProxy>.plusAssign(values: kotlin.collections.Iterable<examples.api_pb2.AddressBalance>) {
        addAll(values)
      }/**
       * <pre>
       * Sum of balance and delegated by coins. Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressBalance total = 4 [json_name = "total"];</code>
       * @param index The index to set the value at.
       * @param value The total to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setTotal")
      public operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, TotalProxy>.set(index: kotlin.Int, value: examples.api_pb2.AddressBalance) {
        _builder.setTotal(index, value)
      }/**
       * <pre>
       * Sum of balance and delegated by coins. Filled in when request delegated
       * </pre>
       *
       * <code>repeated .api_pb.AddressBalance total = 4 [json_name = "total"];</code>
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearTotal")
      public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.AddressBalance, TotalProxy>.clear() {
        _builder.clearTotal()
      }
      /**
       * <code>uint64 transaction_count = 3 [json_name = "transactionCount"];</code>
       */
      public var transactionCount: kotlin.Long
        @JvmName("getTransactionCount")
        get() = _builder.getTransactionCount()
        @JvmName("setTransactionCount")
        set(value) {
          _builder.setTransactionCount(value)
        }
      /**
       * <code>uint64 transaction_count = 3 [json_name = "transactionCount"];</code>
       */
      public fun clearTransactionCount() {
        _builder.clearTransactionCount()
      }

      /**
       * <code>string bip_value = 5 [json_name = "bipValue"];</code>
       */
      public var bipValue: kotlin.String
        @JvmName("getBipValue")
        get() = _builder.getBipValue()
        @JvmName("setBipValue")
        set(value) {
          _builder.setBipValue(value)
        }
      /**
       * <code>string bip_value = 5 [json_name = "bipValue"];</code>
       */
      public fun clearBipValue() {
        _builder.clearBipValue()
      }

      /**
       * <code>.api_pb.Multisig multisig = 7 [json_name = "multisig"];</code>
       */
      public var multisig: examples.api_pb2.Multisig
        @JvmName("getMultisig")
        get() = _builder.getMultisig()
        @JvmName("setMultisig")
        set(value) {
          _builder.setMultisig(value)
        }
      /**
       * <code>.api_pb.Multisig multisig = 7 [json_name = "multisig"];</code>
       */
      public fun clearMultisig() {
        _builder.clearMultisig()
      }
      /**
       * <code>.api_pb.Multisig multisig = 7 [json_name = "multisig"];</code>
       * @return Whether the multisig field is set.
       */
      public fun hasMultisig(): kotlin.Boolean {
        return _builder.hasMultisig()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.AddressesResponse.copy(block: examples.api_pb2.AddressesResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.AddressesResponse =
  examples.api_pb2.AddressesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.AddressesResponse.Result.copy(block: examples.api_pb2.AddressesResponseKt.ResultKt.Dsl.() -> kotlin.Unit): examples.api_pb2.AddressesResponse.Result =
  examples.api_pb2.AddressesResponseKt.ResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()
