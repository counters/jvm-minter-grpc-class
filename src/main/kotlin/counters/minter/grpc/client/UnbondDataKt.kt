//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun unbondData(block: counters.minter.grpc.client.UnbondDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.UnbondData =
  counters.minter.grpc.client.UnbondDataKt.Dsl._create(counters.minter.grpc.client.UnbondData.newBuilder()).apply { block() }._build()
public object UnbondDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.UnbondData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.UnbondData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.UnbondData = _builder.build()

    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     */
    public var pubKey: kotlin.String
      @JvmName("getPubKey")
      get() = _builder.getPubKey()
      @JvmName("setPubKey")
      set(value) {
        _builder.setPubKey(value)
      }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     */
    public fun clearPubKey() {
      _builder.clearPubKey()
    }

    /**
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
     */
    public var coin: counters.minter.grpc.client.Coin
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
     */
    public fun clearCoin() {
      _builder.clearCoin()
    }
    /**
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
     * @return Whether the coin field is set.
     */
    public fun hasCoin(): kotlin.Boolean {
      return _builder.hasCoin()
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
public inline fun counters.minter.grpc.client.UnbondData.copy(block: counters.minter.grpc.client.UnbondDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.UnbondData =
  counters.minter.grpc.client.UnbondDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()