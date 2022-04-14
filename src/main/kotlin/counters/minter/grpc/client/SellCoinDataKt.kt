//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializesellCoinData")
public inline fun sellCoinData(block: counters.minter.grpc.client.SellCoinDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SellCoinData =
  counters.minter.grpc.client.SellCoinDataKt.Dsl._create(counters.minter.grpc.client.SellCoinData.newBuilder()).apply { block() }._build()
public object SellCoinDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.SellCoinData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SellCoinData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SellCoinData = _builder.build()

    /**
     * <code>.api_pb.Coin coin_to_sell = 1;</code>
     */
    public var coinToSell: counters.minter.grpc.client.Coin
      @JvmName("getCoinToSell")
      get() = _builder.getCoinToSell()
      @JvmName("setCoinToSell")
      set(value) {
        _builder.setCoinToSell(value)
      }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1;</code>
     */
    public fun clearCoinToSell() {
      _builder.clearCoinToSell()
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1;</code>
     * @return Whether the coinToSell field is set.
     */
    public fun hasCoinToSell(): kotlin.Boolean {
      return _builder.hasCoinToSell()
    }

    /**
     * <code>string value_to_sell = 2;</code>
     */
    public var valueToSell: kotlin.String
      @JvmName("getValueToSell")
      get() = _builder.getValueToSell()
      @JvmName("setValueToSell")
      set(value) {
        _builder.setValueToSell(value)
      }
    /**
     * <code>string value_to_sell = 2;</code>
     */
    public fun clearValueToSell() {
      _builder.clearValueToSell()
    }

    /**
     * <code>.api_pb.Coin coin_to_buy = 3;</code>
     */
    public var coinToBuy: counters.minter.grpc.client.Coin
      @JvmName("getCoinToBuy")
      get() = _builder.getCoinToBuy()
      @JvmName("setCoinToBuy")
      set(value) {
        _builder.setCoinToBuy(value)
      }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3;</code>
     */
    public fun clearCoinToBuy() {
      _builder.clearCoinToBuy()
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3;</code>
     * @return Whether the coinToBuy field is set.
     */
    public fun hasCoinToBuy(): kotlin.Boolean {
      return _builder.hasCoinToBuy()
    }

    /**
     * <code>string minimum_value_to_buy = 4;</code>
     */
    public var minimumValueToBuy: kotlin.String
      @JvmName("getMinimumValueToBuy")
      get() = _builder.getMinimumValueToBuy()
      @JvmName("setMinimumValueToBuy")
      set(value) {
        _builder.setMinimumValueToBuy(value)
      }
    /**
     * <code>string minimum_value_to_buy = 4;</code>
     */
    public fun clearMinimumValueToBuy() {
      _builder.clearMinimumValueToBuy()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.SellCoinData.copy(block: counters.minter.grpc.client.SellCoinDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SellCoinData =
  counters.minter.grpc.client.SellCoinDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val counters.minter.grpc.client.SellCoinDataOrBuilder.coinToSellOrNull: counters.minter.grpc.client.Coin?
  get() = if (hasCoinToSell()) getCoinToSell() else null

val counters.minter.grpc.client.SellCoinDataOrBuilder.coinToBuyOrNull: counters.minter.grpc.client.Coin?
  get() = if (hasCoinToBuy()) getCoinToBuy() else null

