//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun sellAllCoinData(block: examples.api_pb2.SellAllCoinDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.SellAllCoinData =
  examples.api_pb2.SellAllCoinDataKt.Dsl._create(examples.api_pb2.SellAllCoinData.newBuilder()).apply { block() }._build()
public object SellAllCoinDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.SellAllCoinData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.SellAllCoinData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.SellAllCoinData = _builder.build()

    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    public var coinToSell: examples.api_pb2.Coin
      @JvmName("getCoinToSell")
      get() = _builder.getCoinToSell()
      @JvmName("setCoinToSell")
      set(value) {
        _builder.setCoinToSell(value)
      }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    public fun clearCoinToSell() {
      _builder.clearCoinToSell()
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     * @return Whether the coinToSell field is set.
     */
    public fun hasCoinToSell(): kotlin.Boolean {
      return _builder.hasCoinToSell()
    }

    /**
     * <code>.api_pb.Coin coin_to_buy = 2 [json_name = "coinToBuy"];</code>
     */
    public var coinToBuy: examples.api_pb2.Coin
      @JvmName("getCoinToBuy")
      get() = _builder.getCoinToBuy()
      @JvmName("setCoinToBuy")
      set(value) {
        _builder.setCoinToBuy(value)
      }
    /**
     * <code>.api_pb.Coin coin_to_buy = 2 [json_name = "coinToBuy"];</code>
     */
    public fun clearCoinToBuy() {
      _builder.clearCoinToBuy()
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 2 [json_name = "coinToBuy"];</code>
     * @return Whether the coinToBuy field is set.
     */
    public fun hasCoinToBuy(): kotlin.Boolean {
      return _builder.hasCoinToBuy()
    }

    /**
     * <code>string minimum_value_to_buy = 3 [json_name = "minimumValueToBuy"];</code>
     */
    public var minimumValueToBuy: kotlin.String
      @JvmName("getMinimumValueToBuy")
      get() = _builder.getMinimumValueToBuy()
      @JvmName("setMinimumValueToBuy")
      set(value) {
        _builder.setMinimumValueToBuy(value)
      }
    /**
     * <code>string minimum_value_to_buy = 3 [json_name = "minimumValueToBuy"];</code>
     */
    public fun clearMinimumValueToBuy() {
      _builder.clearMinimumValueToBuy()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.SellAllCoinData.copy(block: examples.api_pb2.SellAllCoinDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.SellAllCoinData =
  examples.api_pb2.SellAllCoinDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
