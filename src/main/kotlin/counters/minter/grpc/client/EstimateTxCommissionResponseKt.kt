//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeestimateTxCommissionResponse")
public inline fun estimateTxCommissionResponse(block: counters.minter.grpc.client.EstimateTxCommissionResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EstimateTxCommissionResponse =
  counters.minter.grpc.client.EstimateTxCommissionResponseKt.Dsl._create(counters.minter.grpc.client.EstimateTxCommissionResponse.newBuilder()).apply { block() }._build()
public object EstimateTxCommissionResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.EstimateTxCommissionResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.EstimateTxCommissionResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.EstimateTxCommissionResponse = _builder.build()

    /**
     * <code>string commission = 1;</code>
     */
    public var commission: kotlin.String
      @JvmName("getCommission")
      get() = _builder.getCommission()
      @JvmName("setCommission")
      set(value) {
        _builder.setCommission(value)
      }
    /**
     * <code>string commission = 1;</code>
     */
    public fun clearCommission() {
      _builder.clearCommission()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.EstimateTxCommissionResponse.copy(block: counters.minter.grpc.client.EstimateTxCommissionResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EstimateTxCommissionResponse =
  counters.minter.grpc.client.EstimateTxCommissionResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

