//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializecreateSwapPoolData")
public inline fun createSwapPoolData(block: counters.minter.grpc.client.CreateSwapPoolDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.CreateSwapPoolData =
  counters.minter.grpc.client.CreateSwapPoolDataKt.Dsl._create(counters.minter.grpc.client.CreateSwapPoolData.newBuilder()).apply { block() }._build()
public object CreateSwapPoolDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.CreateSwapPoolData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.CreateSwapPoolData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.CreateSwapPoolData = _builder.build()

    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     */
    public var coin0: counters.minter.grpc.client.Coin
      @JvmName("getCoin0")
      get() = _builder.getCoin0()
      @JvmName("setCoin0")
      set(value) {
        _builder.setCoin0(value)
      }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     */
    public fun clearCoin0() {
      _builder.clearCoin0()
    }
    /**
     * <code>.api_pb.Coin coin0 = 1;</code>
     * @return Whether the coin0 field is set.
     */
    public fun hasCoin0(): kotlin.Boolean {
      return _builder.hasCoin0()
    }

    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     */
    public var coin1: counters.minter.grpc.client.Coin
      @JvmName("getCoin1")
      get() = _builder.getCoin1()
      @JvmName("setCoin1")
      set(value) {
        _builder.setCoin1(value)
      }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     */
    public fun clearCoin1() {
      _builder.clearCoin1()
    }
    /**
     * <code>.api_pb.Coin coin1 = 2;</code>
     * @return Whether the coin1 field is set.
     */
    public fun hasCoin1(): kotlin.Boolean {
      return _builder.hasCoin1()
    }

    /**
     * <code>string volume0 = 3;</code>
     */
    public var volume0: kotlin.String
      @JvmName("getVolume0")
      get() = _builder.getVolume0()
      @JvmName("setVolume0")
      set(value) {
        _builder.setVolume0(value)
      }
    /**
     * <code>string volume0 = 3;</code>
     */
    public fun clearVolume0() {
      _builder.clearVolume0()
    }

    /**
     * <code>string volume1 = 4;</code>
     */
    public var volume1: kotlin.String
      @JvmName("getVolume1")
      get() = _builder.getVolume1()
      @JvmName("setVolume1")
      set(value) {
        _builder.setVolume1(value)
      }
    /**
     * <code>string volume1 = 4;</code>
     */
    public fun clearVolume1() {
      _builder.clearVolume1()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.CreateSwapPoolData.copy(block: counters.minter.grpc.client.CreateSwapPoolDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.CreateSwapPoolData =
  counters.minter.grpc.client.CreateSwapPoolDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val counters.minter.grpc.client.CreateSwapPoolDataOrBuilder.coin0OrNull: counters.minter.grpc.client.Coin?
  get() = if (hasCoin0()) getCoin0() else null

val counters.minter.grpc.client.CreateSwapPoolDataOrBuilder.coin1OrNull: counters.minter.grpc.client.Coin?
  get() = if (hasCoin1()) getCoin1() else null

