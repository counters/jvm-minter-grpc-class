//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeswapPoolProviderRequest")
public inline fun swapPoolProviderRequest(block: counters.minter.grpc.client.SwapPoolProviderRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SwapPoolProviderRequest =
  counters.minter.grpc.client.SwapPoolProviderRequestKt.Dsl._create(counters.minter.grpc.client.SwapPoolProviderRequest.newBuilder()).apply { block() }._build()
public object SwapPoolProviderRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.SwapPoolProviderRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SwapPoolProviderRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SwapPoolProviderRequest = _builder.build()

    /**
     * <code>uint64 coin0 = 1;</code>
     */
    public var coin0: kotlin.Long
      @JvmName("getCoin0")
      get() = _builder.getCoin0()
      @JvmName("setCoin0")
      set(value) {
        _builder.setCoin0(value)
      }
    /**
     * <code>uint64 coin0 = 1;</code>
     */
    public fun clearCoin0() {
      _builder.clearCoin0()
    }

    /**
     * <code>uint64 coin1 = 2;</code>
     */
    public var coin1: kotlin.Long
      @JvmName("getCoin1")
      get() = _builder.getCoin1()
      @JvmName("setCoin1")
      set(value) {
        _builder.setCoin1(value)
      }
    /**
     * <code>uint64 coin1 = 2;</code>
     */
    public fun clearCoin1() {
      _builder.clearCoin1()
    }

    /**
     * <code>string provider = 3;</code>
     */
    public var provider: kotlin.String
      @JvmName("getProvider")
      get() = _builder.getProvider()
      @JvmName("setProvider")
      set(value) {
        _builder.setProvider(value)
      }
    /**
     * <code>string provider = 3;</code>
     */
    public fun clearProvider() {
      _builder.clearProvider()
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
public inline fun counters.minter.grpc.client.SwapPoolProviderRequest.copy(block: counters.minter.grpc.client.SwapPoolProviderRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SwapPoolProviderRequest =
  counters.minter.grpc.client.SwapPoolProviderRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

