//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeminGasPriceResponse")
public inline fun minGasPriceResponse(block: counters.minter.grpc.client.MinGasPriceResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.MinGasPriceResponse =
  counters.minter.grpc.client.MinGasPriceResponseKt.Dsl._create(counters.minter.grpc.client.MinGasPriceResponse.newBuilder()).apply { block() }._build()
public object MinGasPriceResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.MinGasPriceResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.MinGasPriceResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.MinGasPriceResponse = _builder.build()

    /**
     * <code>uint64 min_gas_price = 3;</code>
     */
    public var minGasPrice: kotlin.Long
      @JvmName("getMinGasPrice")
      get() = _builder.getMinGasPrice()
      @JvmName("setMinGasPrice")
      set(value) {
        _builder.setMinGasPrice(value)
      }
    /**
     * <code>uint64 min_gas_price = 3;</code>
     */
    public fun clearMinGasPrice() {
      _builder.clearMinGasPrice()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.MinGasPriceResponse.copy(block: counters.minter.grpc.client.MinGasPriceResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.MinGasPriceResponse =
  counters.minter.grpc.client.MinGasPriceResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

