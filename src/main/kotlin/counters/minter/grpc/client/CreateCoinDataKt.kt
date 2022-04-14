//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializecreateCoinData")
public inline fun createCoinData(block: counters.minter.grpc.client.CreateCoinDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.CreateCoinData =
  counters.minter.grpc.client.CreateCoinDataKt.Dsl._create(counters.minter.grpc.client.CreateCoinData.newBuilder()).apply { block() }._build()
public object CreateCoinDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.CreateCoinData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.CreateCoinData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.CreateCoinData = _builder.build()

    /**
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>string symbol = 2;</code>
     */
    public var symbol: kotlin.String
      @JvmName("getSymbol")
      get() = _builder.getSymbol()
      @JvmName("setSymbol")
      set(value) {
        _builder.setSymbol(value)
      }
    /**
     * <code>string symbol = 2;</code>
     */
    public fun clearSymbol() {
      _builder.clearSymbol()
    }

    /**
     * <code>string initial_amount = 3;</code>
     */
    public var initialAmount: kotlin.String
      @JvmName("getInitialAmount")
      get() = _builder.getInitialAmount()
      @JvmName("setInitialAmount")
      set(value) {
        _builder.setInitialAmount(value)
      }
    /**
     * <code>string initial_amount = 3;</code>
     */
    public fun clearInitialAmount() {
      _builder.clearInitialAmount()
    }

    /**
     * <code>string initial_reserve = 4;</code>
     */
    public var initialReserve: kotlin.String
      @JvmName("getInitialReserve")
      get() = _builder.getInitialReserve()
      @JvmName("setInitialReserve")
      set(value) {
        _builder.setInitialReserve(value)
      }
    /**
     * <code>string initial_reserve = 4;</code>
     */
    public fun clearInitialReserve() {
      _builder.clearInitialReserve()
    }

    /**
     * <code>uint64 constant_reserve_ratio = 5;</code>
     */
    public var constantReserveRatio: kotlin.Long
      @JvmName("getConstantReserveRatio")
      get() = _builder.getConstantReserveRatio()
      @JvmName("setConstantReserveRatio")
      set(value) {
        _builder.setConstantReserveRatio(value)
      }
    /**
     * <code>uint64 constant_reserve_ratio = 5;</code>
     */
    public fun clearConstantReserveRatio() {
      _builder.clearConstantReserveRatio()
    }

    /**
     * <code>string max_supply = 6;</code>
     */
    public var maxSupply: kotlin.String
      @JvmName("getMaxSupply")
      get() = _builder.getMaxSupply()
      @JvmName("setMaxSupply")
      set(value) {
        _builder.setMaxSupply(value)
      }
    /**
     * <code>string max_supply = 6;</code>
     */
    public fun clearMaxSupply() {
      _builder.clearMaxSupply()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.CreateCoinData.copy(block: counters.minter.grpc.client.CreateCoinDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.CreateCoinData =
  counters.minter.grpc.client.CreateCoinDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

