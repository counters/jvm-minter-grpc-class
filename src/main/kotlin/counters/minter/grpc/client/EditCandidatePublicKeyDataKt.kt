//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeeditCandidatePublicKeyData")
public inline fun editCandidatePublicKeyData(block: counters.minter.grpc.client.EditCandidatePublicKeyDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EditCandidatePublicKeyData =
  counters.minter.grpc.client.EditCandidatePublicKeyDataKt.Dsl._create(counters.minter.grpc.client.EditCandidatePublicKeyData.newBuilder()).apply { block() }._build()
public object EditCandidatePublicKeyDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.EditCandidatePublicKeyData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.EditCandidatePublicKeyData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.EditCandidatePublicKeyData = _builder.build()

    /**
     * <code>string pub_key = 1;</code>
     */
    public var pubKey: kotlin.String
      @JvmName("getPubKey")
      get() = _builder.getPubKey()
      @JvmName("setPubKey")
      set(value) {
        _builder.setPubKey(value)
      }
    /**
     * <code>string pub_key = 1;</code>
     */
    public fun clearPubKey() {
      _builder.clearPubKey()
    }

    /**
     * <code>string new_pub_key = 2;</code>
     */
    public var newPubKey: kotlin.String
      @JvmName("getNewPubKey")
      get() = _builder.getNewPubKey()
      @JvmName("setNewPubKey")
      set(value) {
        _builder.setNewPubKey(value)
      }
    /**
     * <code>string new_pub_key = 2;</code>
     */
    public fun clearNewPubKey() {
      _builder.clearNewPubKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.EditCandidatePublicKeyData.copy(block: counters.minter.grpc.client.EditCandidatePublicKeyDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EditCandidatePublicKeyData =
  counters.minter.grpc.client.EditCandidatePublicKeyDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

