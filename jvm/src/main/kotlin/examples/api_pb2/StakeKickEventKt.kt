//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: events.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun stakeKickEvent(block: examples.api_pb2.StakeKickEventKt.Dsl.() -> kotlin.Unit): examples.api_pb2.StakeKickEvent =
  examples.api_pb2.StakeKickEventKt.Dsl._create(examples.api_pb2.StakeKickEvent.newBuilder()).apply { block() }._build()
public object StakeKickEventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.StakeKickEvent.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.StakeKickEvent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.StakeKickEvent = _builder.build()

    /**
     * <code>string address = 1 [json_name = "address"];</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <code>string amount = 2 [json_name = "amount"];</code>
     */
    public var amount: kotlin.String
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>string amount = 2 [json_name = "amount"];</code>
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }

    /**
     * <code>uint64 coin = 3 [json_name = "coin"];</code>
     */
    public var coin: kotlin.Long
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * <code>uint64 coin = 3 [json_name = "coin"];</code>
     */
    public fun clearCoin() {
      _builder.clearCoin()
    }

    /**
     * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
     */
    public var validatorPubKey: kotlin.String
      @JvmName("getValidatorPubKey")
      get() = _builder.getValidatorPubKey()
      @JvmName("setValidatorPubKey")
      set(value) {
        _builder.setValidatorPubKey(value)
      }
    /**
     * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
     */
    public fun clearValidatorPubKey() {
      _builder.clearValidatorPubKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.StakeKickEvent.copy(block: examples.api_pb2.StakeKickEventKt.Dsl.() -> kotlin.Unit): examples.api_pb2.StakeKickEvent =
  examples.api_pb2.StakeKickEventKt.Dsl._create(this.toBuilder()).apply { block() }._build()
