//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun setCandidateOnData(block: counters.minter.grpc.client.SetCandidateOnDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SetCandidateOnData =
  counters.minter.grpc.client.SetCandidateOnDataKt.Dsl._create(counters.minter.grpc.client.SetCandidateOnData.newBuilder()).apply { block() }._build()
public object SetCandidateOnDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.SetCandidateOnData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SetCandidateOnData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SetCandidateOnData = _builder.build()

    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     */
    public var pubKey: kotlin.String
      @JvmName("getPubKey")
      get() = _builder.getPubKey()
      @JvmName("setPubKey")
      set(value) {
        _builder.setPubKey(value)
      }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     */
    public fun clearPubKey() {
      _builder.clearPubKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.SetCandidateOnData.copy(block: counters.minter.grpc.client.SetCandidateOnDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SetCandidateOnData =
  counters.minter.grpc.client.SetCandidateOnDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()