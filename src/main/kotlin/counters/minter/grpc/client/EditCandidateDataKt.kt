//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeeditCandidateData")
public inline fun editCandidateData(block: counters.minter.grpc.client.EditCandidateDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EditCandidateData =
  counters.minter.grpc.client.EditCandidateDataKt.Dsl._create(counters.minter.grpc.client.EditCandidateData.newBuilder()).apply { block() }._build()
public object EditCandidateDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.EditCandidateData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.EditCandidateData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.EditCandidateData = _builder.build()

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
     * <code>string reward_address = 3;</code>
     */
    public var rewardAddress: kotlin.String
      @JvmName("getRewardAddress")
      get() = _builder.getRewardAddress()
      @JvmName("setRewardAddress")
      set(value) {
        _builder.setRewardAddress(value)
      }
    /**
     * <code>string reward_address = 3;</code>
     */
    public fun clearRewardAddress() {
      _builder.clearRewardAddress()
    }

    /**
     * <code>string owner_address = 4;</code>
     */
    public var ownerAddress: kotlin.String
      @JvmName("getOwnerAddress")
      get() = _builder.getOwnerAddress()
      @JvmName("setOwnerAddress")
      set(value) {
        _builder.setOwnerAddress(value)
      }
    /**
     * <code>string owner_address = 4;</code>
     */
    public fun clearOwnerAddress() {
      _builder.clearOwnerAddress()
    }

    /**
     * <code>string control_address = 5;</code>
     */
    public var controlAddress: kotlin.String
      @JvmName("getControlAddress")
      get() = _builder.getControlAddress()
      @JvmName("setControlAddress")
      set(value) {
        _builder.setControlAddress(value)
      }
    /**
     * <code>string control_address = 5;</code>
     */
    public fun clearControlAddress() {
      _builder.clearControlAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.EditCandidateData.copy(block: counters.minter.grpc.client.EditCandidateDataKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EditCandidateData =
  counters.minter.grpc.client.EditCandidateDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

