//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun multiSendData(block: examples.api_pb2.MultiSendDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.MultiSendData =
  examples.api_pb2.MultiSendDataKt.Dsl._create(examples.api_pb2.MultiSendData.newBuilder()).apply { block() }._build()
public object MultiSendDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.MultiSendData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.MultiSendData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.MultiSendData = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ListProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
     */
     public val list: com.google.protobuf.kotlin.DslList<examples.api_pb2.SendData, ListProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getListList()
      )
    /**
     * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
     * @param value The list to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addList")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.SendData, ListProxy>.add(value: examples.api_pb2.SendData) {
      _builder.addList(value)
    }/**
     * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
     * @param value The list to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.SendData, ListProxy>.plusAssign(value: examples.api_pb2.SendData) {
      add(value)
    }/**
     * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
     * @param values The list to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllList")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.SendData, ListProxy>.addAll(values: kotlin.collections.Iterable<examples.api_pb2.SendData>) {
      _builder.addAllList(values)
    }/**
     * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
     * @param values The list to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.SendData, ListProxy>.plusAssign(values: kotlin.collections.Iterable<examples.api_pb2.SendData>) {
      addAll(values)
    }/**
     * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
     * @param index The index to set the value at.
     * @param value The list to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setList")
    public operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.SendData, ListProxy>.set(index: kotlin.Int, value: examples.api_pb2.SendData) {
      _builder.setList(index, value)
    }/**
     * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearList")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.SendData, ListProxy>.clear() {
      _builder.clearList()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.MultiSendData.copy(block: examples.api_pb2.MultiSendDataKt.Dsl.() -> kotlin.Unit): examples.api_pb2.MultiSendData =
  examples.api_pb2.MultiSendDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
