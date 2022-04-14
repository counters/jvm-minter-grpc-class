//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializemultisig")
public inline fun multisig(block: counters.minter.grpc.client.MultisigKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.Multisig =
  counters.minter.grpc.client.MultisigKt.Dsl._create(counters.minter.grpc.client.Multisig.newBuilder()).apply { block() }._build()
public object MultisigKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.Multisig.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.Multisig.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.Multisig = _builder.build()

    /**
     * <code>uint64 threshold = 1;</code>
     */
    public var threshold: kotlin.Long
      @JvmName("getThreshold")
      get() = _builder.getThreshold()
      @JvmName("setThreshold")
      set(value) {
        _builder.setThreshold(value)
      }
    /**
     * <code>uint64 threshold = 1;</code>
     */
    public fun clearThreshold() {
      _builder.clearThreshold()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class WeightsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated uint64 weights = 2;</code>
     */
     public val weights: com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getWeightsList()
      )
    /**
     * <code>repeated uint64 weights = 2;</code>
     * @param value The weights to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addWeights")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.add(value: kotlin.Long) {
      _builder.addWeights(value)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     * @param value The weights to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignWeights")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     * @param values The weights to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllWeights")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllWeights(values)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     * @param values The weights to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllWeights")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     * @param index The index to set the value at.
     * @param value The weights to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setWeights")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setWeights(index, value)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearWeights")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.clear() {
      _builder.clearWeights()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AddressesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string addresses = 3;</code>
     * @return A list containing the addresses.
     */
    public val addresses: com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAddressesList()
      )
    /**
     * <code>repeated string addresses = 3;</code>
     * @param value The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAddresses")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.add(value: kotlin.String) {
      _builder.addAddresses(value)
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param value The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAddresses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param values The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAddresses")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllAddresses(values)
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param values The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAddresses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param index The index to set the value at.
     * @param value The addresses to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAddresses")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setAddresses(index, value)
    }/**
     * <code>repeated string addresses = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAddresses")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.clear() {
      _builder.clearAddresses()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.Multisig.copy(block: counters.minter.grpc.client.MultisigKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.Multisig =
  counters.minter.grpc.client.MultisigKt.Dsl._create(this.toBuilder()).apply { block() }._build()

