//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeestimateTxCommissionRequest")
public inline fun estimateTxCommissionRequest(block: counters.minter.grpc.client.EstimateTxCommissionRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EstimateTxCommissionRequest =
  counters.minter.grpc.client.EstimateTxCommissionRequestKt.Dsl._create(counters.minter.grpc.client.EstimateTxCommissionRequest.newBuilder()).apply { block() }._build()
public object EstimateTxCommissionRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.EstimateTxCommissionRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.EstimateTxCommissionRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.EstimateTxCommissionRequest = _builder.build()

    /**
     * <code>string tx = 1;</code>
     */
    public var tx: kotlin.String
      @JvmName("getTx")
      get() = _builder.getTx()
      @JvmName("setTx")
      set(value) {
        _builder.setTx(value)
      }
    /**
     * <code>string tx = 1;</code>
     */
    public fun clearTx() {
      _builder.clearTx()
    }

    /**
     * <code>uint64 height = 2;</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 2;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.EstimateTxCommissionRequest.copy(block: counters.minter.grpc.client.EstimateTxCommissionRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EstimateTxCommissionRequest =
  counters.minter.grpc.client.EstimateTxCommissionRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

