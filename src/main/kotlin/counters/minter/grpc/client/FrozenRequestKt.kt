//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun frozenRequest(block: counters.minter.grpc.client.FrozenRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.FrozenRequest =
  counters.minter.grpc.client.FrozenRequestKt.Dsl._create(counters.minter.grpc.client.FrozenRequest.newBuilder()).apply { block() }._build()
public object FrozenRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.FrozenRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.FrozenRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.FrozenRequest = _builder.build()

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
     * <code>.google.protobuf.UInt64Value coin_id = 2 [json_name = "coinId"];</code>
     */
    public var coinId: com.google.protobuf.UInt64Value
      @JvmName("getCoinId")
      get() = _builder.getCoinId()
      @JvmName("setCoinId")
      set(value) {
        _builder.setCoinId(value)
      }
    /**
     * <code>.google.protobuf.UInt64Value coin_id = 2 [json_name = "coinId"];</code>
     */
    public fun clearCoinId() {
      _builder.clearCoinId()
    }
    /**
     * <code>.google.protobuf.UInt64Value coin_id = 2 [json_name = "coinId"];</code>
     * @return Whether the coinId field is set.
     */
    public fun hasCoinId(): kotlin.Boolean {
      return _builder.hasCoinId()
    }

    /**
     * <code>uint64 height = 3 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 3 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.FrozenRequest.copy(block: counters.minter.grpc.client.FrozenRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.FrozenRequest =
  counters.minter.grpc.client.FrozenRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
