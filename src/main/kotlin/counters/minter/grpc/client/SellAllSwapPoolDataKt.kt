//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializesellAllSwapPoolData")
public inline fun sellAllSwapPoolData(block: counters.minter.grpc.client.SellAllSwapPoolDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SellAllSwapPoolData =
  counters.minter.grpc.client.SellAllSwapPoolDataKt.Dsl._create(counters.minter.grpc.client.SellAllSwapPoolData.newBuilder()).apply { block() }._build()
public object SellAllSwapPoolDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.SellAllSwapPoolData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SellAllSwapPoolData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SellAllSwapPoolData = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class CoinsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
     public val coins: com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getCoinsList()
      )
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param value The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addCoins")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.add(value: counters.minter.grpc.client.Coin) {
      _builder.addCoins(value)
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param value The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignCoins")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.plusAssign(value: counters.minter.grpc.client.Coin) {
      add(value)
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param values The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllCoins")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.addAll(values: kotlin.collections.Iterable<counters.minter.grpc.client.Coin>) {
      _builder.addAllCoins(values)
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param values The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllCoins")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.plusAssign(values: kotlin.collections.Iterable<counters.minter.grpc.client.Coin>) {
      addAll(values)
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param index The index to set the value at.
     * @param value The coins to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setCoins")
    public operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.set(index: kotlin.Int, value: counters.minter.grpc.client.Coin) {
      _builder.setCoins(index, value)
    }
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearCoins")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.clear() {
      _builder.clearCoins()
    }


    /**
     * <code>string minimum_value_to_buy = 3;</code>
     */
    public var minimumValueToBuy: kotlin.String
      @JvmName("getMinimumValueToBuy")
      get() = _builder.getMinimumValueToBuy()
      @JvmName("setMinimumValueToBuy")
      set(value) {
        _builder.setMinimumValueToBuy(value)
      }
    /**
     * <code>string minimum_value_to_buy = 3;</code>
     */
    public fun clearMinimumValueToBuy() {
      _builder.clearMinimumValueToBuy()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.SellAllSwapPoolData.copy(block: counters.minter.grpc.client.SellAllSwapPoolDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SellAllSwapPoolData =
  counters.minter.grpc.client.SellAllSwapPoolDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

