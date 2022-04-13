//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun rewardEvent(block: counters.minter.grpc.client.RewardEventKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.RewardEvent =
  counters.minter.grpc.client.RewardEventKt.Dsl._create(counters.minter.grpc.client.RewardEvent.newBuilder()).apply { block() }._build()
public object RewardEventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.RewardEvent.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.RewardEvent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.RewardEvent = _builder.build()

    /**
     * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
     */
    public var role: counters.minter.grpc.client.RewardEvent.Role
      @JvmName("getRole")
      get() = _builder.getRole()
      @JvmName("setRole")
      set(value) {
        _builder.setRole(value)
      }
    /**
     * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
     */
    public fun clearRole() {
      _builder.clearRole()
    }

    /**
     * <code>string address = 2 [json_name = "address"];</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     */
    public var amount: kotlin.String
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     */
    public fun clearAmount() {
      _builder.clearAmount()
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

    /**
     * <pre>
     * coin for which the delegator received the reward
     * </pre>
     *
     * <code>uint64 for_coin = 6 [json_name = "forCoin"];</code>
     */
    public var forCoin: kotlin.Long
      @JvmName("getForCoin")
      get() = _builder.getForCoin()
      @JvmName("setForCoin")
      set(value) {
        _builder.setForCoin(value)
      }
    /**
     * <pre>
     * coin for which the delegator received the reward
     * </pre>
     *
     * <code>uint64 for_coin = 6 [json_name = "forCoin"];</code>
     */
    public fun clearForCoin() {
      _builder.clearForCoin()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.RewardEvent.copy(block: counters.minter.grpc.client.RewardEventKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.RewardEvent =
  counters.minter.grpc.client.RewardEventKt.Dsl._create(this.toBuilder()).apply { block() }._build()
