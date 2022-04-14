//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeestimateCoinBuyRequest")
public inline fun estimateCoinBuyRequest(block: counters.minter.grpc.client.EstimateCoinBuyRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EstimateCoinBuyRequest =
  counters.minter.grpc.client.EstimateCoinBuyRequestKt.Dsl._create(counters.minter.grpc.client.EstimateCoinBuyRequest.newBuilder()).apply { block() }._build()
public object EstimateCoinBuyRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.EstimateCoinBuyRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.EstimateCoinBuyRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.EstimateCoinBuyRequest = _builder.build()

    /**
     * <code>uint64 coin_id_to_buy = 1;</code>
     */
    public var coinIdToBuy: kotlin.Long
      @JvmName("getCoinIdToBuy")
      get() = _builder.getCoinIdToBuy()
      @JvmName("setCoinIdToBuy")
      set(value) {
        _builder.setCoinIdToBuy(value)
      }
    /**
     * <code>uint64 coin_id_to_buy = 1;</code>
     */
    public fun clearCoinIdToBuy() {
      _builder.clearCoinIdToBuy()
    }
    /**
     * <code>uint64 coin_id_to_buy = 1;</code>
     * @return Whether the coinIdToBuy field is set.
     */
    public fun hasCoinIdToBuy(): kotlin.Boolean {
      return _builder.hasCoinIdToBuy()
    }

    /**
     * <code>string coin_to_buy = 5;</code>
     */
    public var coinToBuy: kotlin.String
      @JvmName("getCoinToBuy")
      get() = _builder.getCoinToBuy()
      @JvmName("setCoinToBuy")
      set(value) {
        _builder.setCoinToBuy(value)
      }
    /**
     * <code>string coin_to_buy = 5;</code>
     */
    public fun clearCoinToBuy() {
      _builder.clearCoinToBuy()
    }
    /**
     * <code>string coin_to_buy = 5;</code>
     * @return Whether the coinToBuy field is set.
     */
    public fun hasCoinToBuy(): kotlin.Boolean {
      return _builder.hasCoinToBuy()
    }

    /**
     * <code>uint64 coin_id_to_sell = 2;</code>
     */
    public var coinIdToSell: kotlin.Long
      @JvmName("getCoinIdToSell")
      get() = _builder.getCoinIdToSell()
      @JvmName("setCoinIdToSell")
      set(value) {
        _builder.setCoinIdToSell(value)
      }
    /**
     * <code>uint64 coin_id_to_sell = 2;</code>
     */
    public fun clearCoinIdToSell() {
      _builder.clearCoinIdToSell()
    }
    /**
     * <code>uint64 coin_id_to_sell = 2;</code>
     * @return Whether the coinIdToSell field is set.
     */
    public fun hasCoinIdToSell(): kotlin.Boolean {
      return _builder.hasCoinIdToSell()
    }

    /**
     * <code>string coin_to_sell = 6;</code>
     */
    public var coinToSell: kotlin.String
      @JvmName("getCoinToSell")
      get() = _builder.getCoinToSell()
      @JvmName("setCoinToSell")
      set(value) {
        _builder.setCoinToSell(value)
      }
    /**
     * <code>string coin_to_sell = 6;</code>
     */
    public fun clearCoinToSell() {
      _builder.clearCoinToSell()
    }
    /**
     * <code>string coin_to_sell = 6;</code>
     * @return Whether the coinToSell field is set.
     */
    public fun hasCoinToSell(): kotlin.Boolean {
      return _builder.hasCoinToSell()
    }

    /**
     * <code>string value_to_buy = 3;</code>
     */
    public var valueToBuy: kotlin.String
      @JvmName("getValueToBuy")
      get() = _builder.getValueToBuy()
      @JvmName("setValueToBuy")
      set(value) {
        _builder.setValueToBuy(value)
      }
    /**
     * <code>string value_to_buy = 3;</code>
     */
    public fun clearValueToBuy() {
      _builder.clearValueToBuy()
    }

    /**
     * <code>uint64 height = 4;</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 4;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>uint64 coin_id_commission = 9;</code>
     */
    public var coinIdCommission: kotlin.Long
      @JvmName("getCoinIdCommission")
      get() = _builder.getCoinIdCommission()
      @JvmName("setCoinIdCommission")
      set(value) {
        _builder.setCoinIdCommission(value)
      }
    /**
     * <code>uint64 coin_id_commission = 9;</code>
     */
    public fun clearCoinIdCommission() {
      _builder.clearCoinIdCommission()
    }
    /**
     * <code>uint64 coin_id_commission = 9;</code>
     * @return Whether the coinIdCommission field is set.
     */
    public fun hasCoinIdCommission(): kotlin.Boolean {
      return _builder.hasCoinIdCommission()
    }

    /**
     * <code>string coin_commission = 10;</code>
     */
    public var coinCommission: kotlin.String
      @JvmName("getCoinCommission")
      get() = _builder.getCoinCommission()
      @JvmName("setCoinCommission")
      set(value) {
        _builder.setCoinCommission(value)
      }
    /**
     * <code>string coin_commission = 10;</code>
     */
    public fun clearCoinCommission() {
      _builder.clearCoinCommission()
    }
    /**
     * <code>string coin_commission = 10;</code>
     * @return Whether the coinCommission field is set.
     */
    public fun hasCoinCommission(): kotlin.Boolean {
      return _builder.hasCoinCommission()
    }

    /**
     * <code>.api_pb.SwapFrom swap_from = 8;</code>
     */
    public var swapFrom: counters.minter.grpc.client.SwapFrom
      @JvmName("getSwapFrom")
      get() = _builder.getSwapFrom()
      @JvmName("setSwapFrom")
      set(value) {
        _builder.setSwapFrom(value)
      }
    /**
     * <code>.api_pb.SwapFrom swap_from = 8;</code>
     */
    public fun clearSwapFrom() {
      _builder.clearSwapFrom()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class RouteProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated uint64 route = 11;</code>
     */
     public val route: com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRouteList()
      )
    /**
     * <code>repeated uint64 route = 11;</code>
     * @param value The route to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRoute")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.add(value: kotlin.Long) {
      _builder.addRoute(value)
    }/**
     * <code>repeated uint64 route = 11;</code>
     * @param value The route to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRoute")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * <code>repeated uint64 route = 11;</code>
     * @param values The route to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRoute")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllRoute(values)
    }/**
     * <code>repeated uint64 route = 11;</code>
     * @param values The route to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRoute")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * <code>repeated uint64 route = 11;</code>
     * @param index The index to set the value at.
     * @param value The route to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRoute")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setRoute(index, value)
    }/**
     * <code>repeated uint64 route = 11;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRoute")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.clear() {
      _builder.clearRoute()
    }public val buyCase: counters.minter.grpc.client.EstimateCoinBuyRequest.BuyCase
      @JvmName("getBuyCase")
      get() = _builder.getBuyCase()

    public fun clearBuy() {
      _builder.clearBuy()
    }
    public val sellCase: counters.minter.grpc.client.EstimateCoinBuyRequest.SellCase
      @JvmName("getSellCase")
      get() = _builder.getSellCase()

    public fun clearSell() {
      _builder.clearSell()
    }
    public val commissionCase: counters.minter.grpc.client.EstimateCoinBuyRequest.CommissionCase
      @JvmName("getCommissionCase")
      get() = _builder.getCommissionCase()

    public fun clearCommission() {
      _builder.clearCommission()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.EstimateCoinBuyRequest.copy(block: counters.minter.grpc.client.EstimateCoinBuyRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EstimateCoinBuyRequest =
  counters.minter.grpc.client.EstimateCoinBuyRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

