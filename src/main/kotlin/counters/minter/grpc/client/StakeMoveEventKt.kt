//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializestakeMoveEvent")
public inline fun stakeMoveEvent(block: counters.minter.grpc.client.StakeMoveEventKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.StakeMoveEvent =
  counters.minter.grpc.client.StakeMoveEventKt.Dsl._create(counters.minter.grpc.client.StakeMoveEvent.newBuilder()).apply { block() }._build()
public object StakeMoveEventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.StakeMoveEvent.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.StakeMoveEvent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.StakeMoveEvent = _builder.build()

    /**
     * <code>string address = 1;</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 1;</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <code>string amount = 2;</code>
     */
    public var amount: kotlin.String
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>string amount = 2;</code>
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }

    /**
     * <code>uint64 coin = 3;</code>
     */
    public var coin: kotlin.Long
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * <code>uint64 coin = 3;</code>
     */
    public fun clearCoin() {
      _builder.clearCoin()
    }

    /**
     * <code>string candidate_pub_key = 4;</code>
     */
    public var candidatePubKey: kotlin.String
      @JvmName("getCandidatePubKey")
      get() = _builder.getCandidatePubKey()
      @JvmName("setCandidatePubKey")
      set(value) {
        _builder.setCandidatePubKey(value)
      }
    /**
     * <code>string candidate_pub_key = 4;</code>
     */
    public fun clearCandidatePubKey() {
      _builder.clearCandidatePubKey()
    }

    /**
     * <code>string to_candidate_pub_key = 5;</code>
     */
    public var toCandidatePubKey: kotlin.String
      @JvmName("getToCandidatePubKey")
      get() = _builder.getToCandidatePubKey()
      @JvmName("setToCandidatePubKey")
      set(value) {
        _builder.setToCandidatePubKey(value)
      }
    /**
     * <code>string to_candidate_pub_key = 5;</code>
     */
    public fun clearToCandidatePubKey() {
      _builder.clearToCandidatePubKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.StakeMoveEvent.copy(block: counters.minter.grpc.client.StakeMoveEventKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.StakeMoveEvent =
  counters.minter.grpc.client.StakeMoveEventKt.Dsl._create(this.toBuilder()).apply { block() }._build()

