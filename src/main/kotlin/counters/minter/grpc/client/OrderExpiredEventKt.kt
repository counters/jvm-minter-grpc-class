//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeorderExpiredEvent")
public inline fun orderExpiredEvent(block: counters.minter.grpc.client.OrderExpiredEventKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.OrderExpiredEvent =
  counters.minter.grpc.client.OrderExpiredEventKt.Dsl._create(counters.minter.grpc.client.OrderExpiredEvent.newBuilder()).apply { block() }._build()
public object OrderExpiredEventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.OrderExpiredEvent.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.OrderExpiredEvent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.OrderExpiredEvent = _builder.build()

    /**
     * <code>uint64 id = 1;</code>
     */
    public var id: kotlin.Long
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>uint64 id = 1;</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>string address = 2;</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 2;</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
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
     * <code>string amount = 4;</code>
     */
    public var amount: kotlin.String
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>string amount = 4;</code>
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.OrderExpiredEvent.copy(block: counters.minter.grpc.client.OrderExpiredEventKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.OrderExpiredEvent =
  counters.minter.grpc.client.OrderExpiredEventKt.Dsl._create(this.toBuilder()).apply { block() }._build()

