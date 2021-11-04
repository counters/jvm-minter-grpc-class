//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun buySwapPoolData(block: examples.api_pb2.BuySwapPoolDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.BuySwapPoolData =
  examples.api_pb2.BuySwapPoolDataKt.Dsl._create(examples.api_pb2.BuySwapPoolData.newBuilder()).apply { block() }._build()
public object BuySwapPoolDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.BuySwapPoolData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.BuySwapPoolData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.BuySwapPoolData = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class CoinsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .api_pb.Coin coins = 1 [json_name = "coins"];</code>
     */
     public val coins: com.google.protobuf.kotlin.DslList<examples.api_pb2.Coin, CoinsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getCoinsList()
      )
    /**
     * <code>repeated .api_pb.Coin coins = 1 [json_name = "coins"];</code>
     * @param value The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addCoins")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.Coin, CoinsProxy>.add(value: examples.api_pb2.Coin) {
      _builder.addCoins(value)
    }/**
     * <code>repeated .api_pb.Coin coins = 1 [json_name = "coins"];</code>
     * @param value The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignCoins")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.Coin, CoinsProxy>.plusAssign(value: examples.api_pb2.Coin) {
      add(value)
    }/**
     * <code>repeated .api_pb.Coin coins = 1 [json_name = "coins"];</code>
     * @param values The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllCoins")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.Coin, CoinsProxy>.addAll(values: kotlin.collections.Iterable<examples.api_pb2.Coin>) {
      _builder.addAllCoins(values)
    }/**
     * <code>repeated .api_pb.Coin coins = 1 [json_name = "coins"];</code>
     * @param values The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllCoins")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.Coin, CoinsProxy>.plusAssign(values: kotlin.collections.Iterable<examples.api_pb2.Coin>) {
      addAll(values)
    }/**
     * <code>repeated .api_pb.Coin coins = 1 [json_name = "coins"];</code>
     * @param index The index to set the value at.
     * @param value The coins to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setCoins")
    public operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.Coin, CoinsProxy>.set(index: kotlin.Int, value: examples.api_pb2.Coin) {
      _builder.setCoins(index, value)
    }/**
     * <code>repeated .api_pb.Coin coins = 1 [json_name = "coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearCoins")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.Coin, CoinsProxy>.clear() {
      _builder.clearCoins()
    }
    /**
     * <code>string value_to_buy = 2 [json_name = "valueToBuy"];</code>
     */
    public var valueToBuy: kotlin.String
      @JvmName("getValueToBuy")
      get() = _builder.getValueToBuy()
      @JvmName("setValueToBuy")
      set(value) {
        _builder.setValueToBuy(value)
      }
    /**
     * <code>string value_to_buy = 2 [json_name = "valueToBuy"];</code>
     */
    public fun clearValueToBuy() {
      _builder.clearValueToBuy()
    }

    /**
     * <code>string maximum_value_to_sell = 4 [json_name = "maximumValueToSell"];</code>
     */
    public var maximumValueToSell: kotlin.String
      @JvmName("getMaximumValueToSell")
      get() = _builder.getMaximumValueToSell()
      @JvmName("setMaximumValueToSell")
      set(value) {
        _builder.setMaximumValueToSell(value)
      }
    /**
     * <code>string maximum_value_to_sell = 4 [json_name = "maximumValueToSell"];</code>
     */
    public fun clearMaximumValueToSell() {
      _builder.clearMaximumValueToSell()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.BuySwapPoolData.copy(block: examples.api_pb2.BuySwapPoolDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.BuySwapPoolData =
  examples.api_pb2.BuySwapPoolDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
