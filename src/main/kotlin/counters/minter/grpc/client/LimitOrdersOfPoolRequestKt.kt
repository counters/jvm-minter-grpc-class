//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializelimitOrdersOfPoolRequest")
public inline fun limitOrdersOfPoolRequest(block: counters.minter.grpc.client.LimitOrdersOfPoolRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.LimitOrdersOfPoolRequest =
  counters.minter.grpc.client.LimitOrdersOfPoolRequestKt.Dsl._create(counters.minter.grpc.client.LimitOrdersOfPoolRequest.newBuilder()).apply { block() }._build()
public object LimitOrdersOfPoolRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.LimitOrdersOfPoolRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.LimitOrdersOfPoolRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.LimitOrdersOfPoolRequest = _builder.build()

    /**
     * <code>uint64 sell_coin = 1;</code>
     */
    public var sellCoin: kotlin.Long
      @JvmName("getSellCoin")
      get() = _builder.getSellCoin()
      @JvmName("setSellCoin")
      set(value) {
        _builder.setSellCoin(value)
      }
    /**
     * <code>uint64 sell_coin = 1;</code>
     */
    public fun clearSellCoin() {
      _builder.clearSellCoin()
    }

    /**
     * <code>uint64 buy_coin = 2;</code>
     */
    public var buyCoin: kotlin.Long
      @JvmName("getBuyCoin")
      get() = _builder.getBuyCoin()
      @JvmName("setBuyCoin")
      set(value) {
        _builder.setBuyCoin(value)
      }
    /**
     * <code>uint64 buy_coin = 2;</code>
     */
    public fun clearBuyCoin() {
      _builder.clearBuyCoin()
    }

    /**
     * <code>int32 limit = 3;</code>
     */
    public var limit: kotlin.Int
      @JvmName("getLimit")
      get() = _builder.getLimit()
      @JvmName("setLimit")
      set(value) {
        _builder.setLimit(value)
      }
    /**
     * <code>int32 limit = 3;</code>
     */
    public fun clearLimit() {
      _builder.clearLimit()
    }

    /**
     * <code>uint64 height = 4;</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 4;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.LimitOrdersOfPoolRequest.copy(block: counters.minter.grpc.client.LimitOrdersOfPoolRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.LimitOrdersOfPoolRequest =
  counters.minter.grpc.client.LimitOrdersOfPoolRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

