//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeswapPoolsRequest")
public inline fun swapPoolsRequest(block: counters.minter.grpc.client.SwapPoolsRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SwapPoolsRequest =
  counters.minter.grpc.client.SwapPoolsRequestKt.Dsl._create(counters.minter.grpc.client.SwapPoolsRequest.newBuilder()).apply { block() }._build()
public object SwapPoolsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.SwapPoolsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SwapPoolsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SwapPoolsRequest = _builder.build()

    /**
     * <code>uint64 height = 1;</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 1;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>bool orders = 2;</code>
     */
    public var orders: kotlin.Boolean
      @JvmName("getOrders")
      get() = _builder.getOrders()
      @JvmName("setOrders")
      set(value) {
        _builder.setOrders(value)
      }
    /**
     * <code>bool orders = 2;</code>
     */
    public fun clearOrders() {
      _builder.clearOrders()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.SwapPoolsRequest.copy(block: counters.minter.grpc.client.SwapPoolsRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SwapPoolsRequest =
  counters.minter.grpc.client.SwapPoolsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

