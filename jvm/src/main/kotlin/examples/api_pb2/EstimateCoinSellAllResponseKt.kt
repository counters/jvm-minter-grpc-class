//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun estimateCoinSellAllResponse(block: examples.api_pb2.EstimateCoinSellAllResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.EstimateCoinSellAllResponse =
  examples.api_pb2.EstimateCoinSellAllResponseKt.Dsl._create(examples.api_pb2.EstimateCoinSellAllResponse.newBuilder()).apply { block() }._build()
public object EstimateCoinSellAllResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.EstimateCoinSellAllResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.EstimateCoinSellAllResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.EstimateCoinSellAllResponse = _builder.build()

    /**
     * <code>string will_get = 1 [json_name = "willGet"];</code>
     */
    public var willGet: kotlin.String
      @JvmName("getWillGet")
      get() = _builder.getWillGet()
      @JvmName("setWillGet")
      set(value) {
        _builder.setWillGet(value)
      }
    /**
     * <code>string will_get = 1 [json_name = "willGet"];</code>
     */
    public fun clearWillGet() {
      _builder.clearWillGet()
    }

    /**
     * <code>.api_pb.SwapFrom swap_from = 2 [json_name = "swapFrom"];</code>
     */
    public var swapFrom: examples.api_pb2.SwapFrom
      @JvmName("getSwapFrom")
      get() = _builder.getSwapFrom()
      @JvmName("setSwapFrom")
      set(value) {
        _builder.setSwapFrom(value)
      }
    /**
     * <code>.api_pb.SwapFrom swap_from = 2 [json_name = "swapFrom"];</code>
     */
    public fun clearSwapFrom() {
      _builder.clearSwapFrom()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.EstimateCoinSellAllResponse.copy(block: examples.api_pb2.EstimateCoinSellAllResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.EstimateCoinSellAllResponse =
  examples.api_pb2.EstimateCoinSellAllResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
