//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun redeemCheckData(block: examples.api_pb2.RedeemCheckDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.RedeemCheckData =
  examples.api_pb2.RedeemCheckDataKt.Dsl._create(examples.api_pb2.RedeemCheckData.newBuilder()).apply { block() }._build()
public object RedeemCheckDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.RedeemCheckData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.RedeemCheckData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.RedeemCheckData = _builder.build()

    /**
     * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
     */
    public var rawCheck: kotlin.String
      @JvmName("getRawCheck")
      get() = _builder.getRawCheck()
      @JvmName("setRawCheck")
      set(value) {
        _builder.setRawCheck(value)
      }
    /**
     * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
     */
    public fun clearRawCheck() {
      _builder.clearRawCheck()
    }

    /**
     * <code>string proof = 2 [json_name = "proof"];</code>
     */
    public var proof: kotlin.String
      @JvmName("getProof")
      get() = _builder.getProof()
      @JvmName("setProof")
      set(value) {
        _builder.setProof(value)
      }
    /**
     * <code>string proof = 2 [json_name = "proof"];</code>
     */
    public fun clearProof() {
      _builder.clearProof()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.RedeemCheckData.copy(block: examples.api_pb2.RedeemCheckDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.RedeemCheckData =
  examples.api_pb2.RedeemCheckDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
