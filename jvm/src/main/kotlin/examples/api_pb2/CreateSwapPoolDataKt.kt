//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun createSwapPoolData(block: examples.api_pb2.CreateSwapPoolDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CreateSwapPoolData =
  examples.api_pb2.CreateSwapPoolDataKt.Dsl._create(examples.api_pb2.CreateSwapPoolData.newBuilder()).apply { block() }._build()
public object CreateSwapPoolDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.CreateSwapPoolData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.CreateSwapPoolData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.CreateSwapPoolData = _builder.build()

    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     */
    public var coin0: examples.api_pb2.Coin
      @JvmName("getCoin0")
      get() = _builder.getCoin0()
      @JvmName("setCoin0")
      set(value) {
        _builder.setCoin0(value)
      }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     */
    public fun clearCoin0() {
      _builder.clearCoin0()
    }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     * @return Whether the coin0 field is set.
     */
    public fun hasCoin0(): kotlin.Boolean {
      return _builder.hasCoin0()
    }

    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     */
    public var coin1: examples.api_pb2.Coin
      @JvmName("getCoin1")
      get() = _builder.getCoin1()
      @JvmName("setCoin1")
      set(value) {
        _builder.setCoin1(value)
      }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     */
    public fun clearCoin1() {
      _builder.clearCoin1()
    }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     * @return Whether the coin1 field is set.
     */
    public fun hasCoin1(): kotlin.Boolean {
      return _builder.hasCoin1()
    }

    /**
     * <code>string volume0 = 3 [json_name = "volume0"];</code>
     */
    public var volume0: kotlin.String
      @JvmName("getVolume0")
      get() = _builder.getVolume0()
      @JvmName("setVolume0")
      set(value) {
        _builder.setVolume0(value)
      }
    /**
     * <code>string volume0 = 3 [json_name = "volume0"];</code>
     */
    public fun clearVolume0() {
      _builder.clearVolume0()
    }

    /**
     * <code>string volume1 = 4 [json_name = "volume1"];</code>
     */
    public var volume1: kotlin.String
      @JvmName("getVolume1")
      get() = _builder.getVolume1()
      @JvmName("setVolume1")
      set(value) {
        _builder.setVolume1(value)
      }
    /**
     * <code>string volume1 = 4 [json_name = "volume1"];</code>
     */
    public fun clearVolume1() {
      _builder.clearVolume1()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.CreateSwapPoolData.copy(block: examples.api_pb2.CreateSwapPoolDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CreateSwapPoolData =
  examples.api_pb2.CreateSwapPoolDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
