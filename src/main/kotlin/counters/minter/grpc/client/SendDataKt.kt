//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun sendData(block: counters.minter.grpc.client.SendDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SendData =
  counters.minter.grpc.client.SendDataKt.Dsl._create(counters.minter.grpc.client.SendData.newBuilder()).apply { block() }._build()
public object SendDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.SendData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SendData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SendData = _builder.build()

    /**
     * <code>.api_pb.Coin coin = 1 [json_name = "coin"];</code>
     */
    public var coin: counters.minter.grpc.client.Coin
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * <code>.api_pb.Coin coin = 1 [json_name = "coin"];</code>
     */
    public fun clearCoin() {
      _builder.clearCoin()
    }
    /**
     * <code>.api_pb.Coin coin = 1 [json_name = "coin"];</code>
     * @return Whether the coin field is set.
     */
    public fun hasCoin(): kotlin.Boolean {
      return _builder.hasCoin()
    }

    /**
     * <code>string to = 2 [json_name = "to"];</code>
     */
    public var to: kotlin.String
      @JvmName("getTo")
      get() = _builder.getTo()
      @JvmName("setTo")
      set(value) {
        _builder.setTo(value)
      }
    /**
     * <code>string to = 2 [json_name = "to"];</code>
     */
    public fun clearTo() {
      _builder.clearTo()
    }

    /**
     * <code>string value = 3 [json_name = "value"];</code>
     */
    public var value: kotlin.String
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>string value = 3 [json_name = "value"];</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.SendData.copy(block: counters.minter.grpc.client.SendDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SendData =
  counters.minter.grpc.client.SendDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()