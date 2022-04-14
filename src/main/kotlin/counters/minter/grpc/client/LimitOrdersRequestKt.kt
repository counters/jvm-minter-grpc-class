//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializelimitOrdersRequest")
public inline fun limitOrdersRequest(block: counters.minter.grpc.client.LimitOrdersRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.LimitOrdersRequest =
  counters.minter.grpc.client.LimitOrdersRequestKt.Dsl._create(counters.minter.grpc.client.LimitOrdersRequest.newBuilder()).apply { block() }._build()
public object LimitOrdersRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.LimitOrdersRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.LimitOrdersRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.LimitOrdersRequest = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class IdsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated uint64 ids = 1;</code>
     */
     public val ids: com.google.protobuf.kotlin.DslList<kotlin.Long, IdsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getIdsList()
      )
    /**
     * <code>repeated uint64 ids = 1;</code>
     * @param value The ids to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, IdsProxy>.add(value: kotlin.Long) {
      _builder.addIds(value)
    }/**
     * <code>repeated uint64 ids = 1;</code>
     * @param value The ids to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, IdsProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * <code>repeated uint64 ids = 1;</code>
     * @param values The ids to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, IdsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllIds(values)
    }/**
     * <code>repeated uint64 ids = 1;</code>
     * @param values The ids to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, IdsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * <code>repeated uint64 ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The ids to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setIds")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, IdsProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setIds(index, value)
    }/**
     * <code>repeated uint64 ids = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, IdsProxy>.clear() {
      _builder.clearIds()
    }
    /**
     * <code>uint64 height = 2;</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 2;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.LimitOrdersRequest.copy(block: counters.minter.grpc.client.LimitOrdersRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.LimitOrdersRequest =
  counters.minter.grpc.client.LimitOrdersRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

