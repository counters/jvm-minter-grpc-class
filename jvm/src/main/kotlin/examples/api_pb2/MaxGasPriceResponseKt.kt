//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun maxGasPriceResponse(block: examples.api_pb2.MaxGasPriceResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.MaxGasPriceResponse =
  examples.api_pb2.MaxGasPriceResponseKt.Dsl._create(examples.api_pb2.MaxGasPriceResponse.newBuilder()).apply { block() }._build()
public object MaxGasPriceResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.MaxGasPriceResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.MaxGasPriceResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.MaxGasPriceResponse = _builder.build()

    /**
     * <code>uint64 max_gas_price = 3 [json_name = "maxGasPrice"];</code>
     */
    public var maxGasPrice: kotlin.Long
      @JvmName("getMaxGasPrice")
      get() = _builder.getMaxGasPrice()
      @JvmName("setMaxGasPrice")
      set(value) {
        _builder.setMaxGasPrice(value)
      }
    /**
     * <code>uint64 max_gas_price = 3 [json_name = "maxGasPrice"];</code>
     */
    public fun clearMaxGasPrice() {
      _builder.clearMaxGasPrice()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.MaxGasPriceResponse.copy(block: examples.api_pb2.MaxGasPriceResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.MaxGasPriceResponse =
  examples.api_pb2.MaxGasPriceResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
