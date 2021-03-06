//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializebestTradeResponse")
public inline fun bestTradeResponse(block: counters.minter.grpc.client.BestTradeResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.BestTradeResponse =
  counters.minter.grpc.client.BestTradeResponseKt.Dsl._create(counters.minter.grpc.client.BestTradeResponse.newBuilder()).apply { block() }._build()
public object BestTradeResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.BestTradeResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.BestTradeResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.BestTradeResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PathProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated uint64 path = 1;</code>
     */
     public val path: com.google.protobuf.kotlin.DslList<kotlin.Long, PathProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPathList()
      )
    /**
     * <code>repeated uint64 path = 1;</code>
     * @param value The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPath")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, PathProxy>.add(value: kotlin.Long) {
      _builder.addPath(value)
    }/**
     * <code>repeated uint64 path = 1;</code>
     * @param value The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPath")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, PathProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * <code>repeated uint64 path = 1;</code>
     * @param values The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPath")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, PathProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllPath(values)
    }/**
     * <code>repeated uint64 path = 1;</code>
     * @param values The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPath")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, PathProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * <code>repeated uint64 path = 1;</code>
     * @param index The index to set the value at.
     * @param value The path to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPath")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, PathProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setPath(index, value)
    }/**
     * <code>repeated uint64 path = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPath")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, PathProxy>.clear() {
      _builder.clearPath()
    }
    /**
     * <code>string result = 2;</code>
     */
    public var result: kotlin.String
      @JvmName("getResult")
      get() = _builder.getResult()
      @JvmName("setResult")
      set(value) {
        _builder.setResult(value)
      }
    /**
     * <code>string result = 2;</code>
     */
    public fun clearResult() {
      _builder.clearResult()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.BestTradeResponse.copy(block: counters.minter.grpc.client.BestTradeResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.BestTradeResponse =
  counters.minter.grpc.client.BestTradeResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

