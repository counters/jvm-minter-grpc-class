//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun commissionVotesRequest(block: examples.api_pb2.CommissionVotesRequestKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CommissionVotesRequest =
  examples.api_pb2.CommissionVotesRequestKt.Dsl._create(examples.api_pb2.CommissionVotesRequest.newBuilder()).apply { block() }._build()
public object CommissionVotesRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.CommissionVotesRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.CommissionVotesRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.CommissionVotesRequest = _builder.build()

    /**
     * <code>uint64 target_version = 1 [json_name = "targetVersion"];</code>
     */
    public var targetVersion: kotlin.Long
      @JvmName("getTargetVersion")
      get() = _builder.getTargetVersion()
      @JvmName("setTargetVersion")
      set(value) {
        _builder.setTargetVersion(value)
      }
    /**
     * <code>uint64 target_version = 1 [json_name = "targetVersion"];</code>
     */
    public fun clearTargetVersion() {
      _builder.clearTargetVersion()
    }

    /**
     * <code>uint64 height = 2 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 2 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.CommissionVotesRequest.copy(block: examples.api_pb2.CommissionVotesRequestKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CommissionVotesRequest =
  examples.api_pb2.CommissionVotesRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
