//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun haltsResponse(block: examples.api_pb2.HaltsResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.HaltsResponse =
  examples.api_pb2.HaltsResponseKt.Dsl._create(examples.api_pb2.HaltsResponse.newBuilder()).apply { block() }._build()
public object HaltsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.HaltsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.HaltsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.HaltsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PublicKeysProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @return A list containing the publicKeys.
     */
    public val publicKeys: com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPublicKeysList()
      )
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param value The publicKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPublicKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.add(value: kotlin.String) {
      _builder.addPublicKeys(value)
    }
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param value The publicKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPublicKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param values The publicKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPublicKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllPublicKeys(values)
    }
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param values The publicKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPublicKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param index The index to set the value at.
     * @param value The publicKeys to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPublicKeys")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setPublicKeys(index, value)
    }/**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPublicKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.clear() {
      _builder.clearPublicKeys()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.HaltsResponse.copy(block: examples.api_pb2.HaltsResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.HaltsResponse =
  examples.api_pb2.HaltsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
