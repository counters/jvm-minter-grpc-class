//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializemultiSendData")
public inline fun multiSendData(block: counters.minter.grpc.client.MultiSendDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.MultiSendData =
  counters.minter.grpc.client.MultiSendDataKt.Dsl._create(counters.minter.grpc.client.MultiSendData.newBuilder()).apply { block() }._build()
public object MultiSendDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.MultiSendData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.MultiSendData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.MultiSendData = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ListProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .api_pb.SendData list = 1;</code>
     */
     public val list: com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.SendData, ListProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getListList()
      )
    /**
     * <code>repeated .api_pb.SendData list = 1;</code>
     * @param value The list to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addList")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.SendData, ListProxy>.add(value: counters.minter.grpc.client.SendData) {
      _builder.addList(value)
    }
    /**
     * <code>repeated .api_pb.SendData list = 1;</code>
     * @param value The list to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.SendData, ListProxy>.plusAssign(value: counters.minter.grpc.client.SendData) {
      add(value)
    }
    /**
     * <code>repeated .api_pb.SendData list = 1;</code>
     * @param values The list to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllList")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.SendData, ListProxy>.addAll(values: kotlin.collections.Iterable<counters.minter.grpc.client.SendData>) {
      _builder.addAllList(values)
    }
    /**
     * <code>repeated .api_pb.SendData list = 1;</code>
     * @param values The list to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.SendData, ListProxy>.plusAssign(values: kotlin.collections.Iterable<counters.minter.grpc.client.SendData>) {
      addAll(values)
    }
    /**
     * <code>repeated .api_pb.SendData list = 1;</code>
     * @param index The index to set the value at.
     * @param value The list to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setList")
    public operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.SendData, ListProxy>.set(index: kotlin.Int, value: counters.minter.grpc.client.SendData) {
      _builder.setList(index, value)
    }
    /**
     * <code>repeated .api_pb.SendData list = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearList")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.SendData, ListProxy>.clear() {
      _builder.clearList()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.MultiSendData.copy(block: counters.minter.grpc.client.MultiSendDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.MultiSendData =
  counters.minter.grpc.client.MultiSendDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

