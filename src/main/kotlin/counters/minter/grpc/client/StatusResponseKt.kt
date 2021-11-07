//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun statusResponse(block: counters.minter.grpc.client.StatusResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.StatusResponse =
  counters.minter.grpc.client.StatusResponseKt.Dsl._create(counters.minter.grpc.client.StatusResponse.newBuilder()).apply { block() }._build()
public object StatusResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.StatusResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.StatusResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.StatusResponse = _builder.build()

    /**
     * <code>string version = 8 [json_name = "version"];</code>
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <code>string version = 8 [json_name = "version"];</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * <code>string network = 11 [json_name = "network"];</code>
     */
    public var network: kotlin.String
      @JvmName("getNetwork")
      get() = _builder.getNetwork()
      @JvmName("setNetwork")
      set(value) {
        _builder.setNetwork(value)
      }
    /**
     * <code>string network = 11 [json_name = "network"];</code>
     */
    public fun clearNetwork() {
      _builder.clearNetwork()
    }

    /**
     * <code>uint64 initial_height = 12 [json_name = "initialHeight"];</code>
     */
    public var initialHeight: kotlin.Long
      @JvmName("getInitialHeight")
      get() = _builder.getInitialHeight()
      @JvmName("setInitialHeight")
      set(value) {
        _builder.setInitialHeight(value)
      }
    /**
     * <code>uint64 initial_height = 12 [json_name = "initialHeight"];</code>
     */
    public fun clearInitialHeight() {
      _builder.clearInitialHeight()
    }

    /**
     * <code>string latest_block_hash = 1 [json_name = "latestBlockHash"];</code>
     */
    public var latestBlockHash: kotlin.String
      @JvmName("getLatestBlockHash")
      get() = _builder.getLatestBlockHash()
      @JvmName("setLatestBlockHash")
      set(value) {
        _builder.setLatestBlockHash(value)
      }
    /**
     * <code>string latest_block_hash = 1 [json_name = "latestBlockHash"];</code>
     */
    public fun clearLatestBlockHash() {
      _builder.clearLatestBlockHash()
    }

    /**
     * <code>string latest_app_hash = 2 [json_name = "latestAppHash"];</code>
     */
    public var latestAppHash: kotlin.String
      @JvmName("getLatestAppHash")
      get() = _builder.getLatestAppHash()
      @JvmName("setLatestAppHash")
      set(value) {
        _builder.setLatestAppHash(value)
      }
    /**
     * <code>string latest_app_hash = 2 [json_name = "latestAppHash"];</code>
     */
    public fun clearLatestAppHash() {
      _builder.clearLatestAppHash()
    }

    /**
     * <code>uint64 latest_block_height = 3 [json_name = "latestBlockHeight"];</code>
     */
    public var latestBlockHeight: kotlin.Long
      @JvmName("getLatestBlockHeight")
      get() = _builder.getLatestBlockHeight()
      @JvmName("setLatestBlockHeight")
      set(value) {
        _builder.setLatestBlockHeight(value)
      }
    /**
     * <code>uint64 latest_block_height = 3 [json_name = "latestBlockHeight"];</code>
     */
    public fun clearLatestBlockHeight() {
      _builder.clearLatestBlockHeight()
    }

    /**
     * <code>string latest_block_time = 4 [json_name = "latestBlockTime"];</code>
     */
    public var latestBlockTime: kotlin.String
      @JvmName("getLatestBlockTime")
      get() = _builder.getLatestBlockTime()
      @JvmName("setLatestBlockTime")
      set(value) {
        _builder.setLatestBlockTime(value)
      }
    /**
     * <code>string latest_block_time = 4 [json_name = "latestBlockTime"];</code>
     */
    public fun clearLatestBlockTime() {
      _builder.clearLatestBlockTime()
    }

    /**
     * <code>uint64 keep_last_states = 5 [json_name = "keepLastStates"];</code>
     */
    public var keepLastStates: kotlin.Long
      @JvmName("getKeepLastStates")
      get() = _builder.getKeepLastStates()
      @JvmName("setKeepLastStates")
      set(value) {
        _builder.setKeepLastStates(value)
      }
    /**
     * <code>uint64 keep_last_states = 5 [json_name = "keepLastStates"];</code>
     */
    public fun clearKeepLastStates() {
      _builder.clearKeepLastStates()
    }

    /**
     * <code>string total_slashed = 10 [json_name = "totalSlashed"];</code>
     */
    public var totalSlashed: kotlin.String
      @JvmName("getTotalSlashed")
      get() = _builder.getTotalSlashed()
      @JvmName("setTotalSlashed")
      set(value) {
        _builder.setTotalSlashed(value)
      }
    /**
     * <code>string total_slashed = 10 [json_name = "totalSlashed"];</code>
     */
    public fun clearTotalSlashed() {
      _builder.clearTotalSlashed()
    }

    /**
     * <code>bool catching_up = 6 [json_name = "catchingUp"];</code>
     */
    public var catchingUp: kotlin.Boolean
      @JvmName("getCatchingUp")
      get() = _builder.getCatchingUp()
      @JvmName("setCatchingUp")
      set(value) {
        _builder.setCatchingUp(value)
      }
    /**
     * <code>bool catching_up = 6 [json_name = "catchingUp"];</code>
     */
    public fun clearCatchingUp() {
      _builder.clearCatchingUp()
    }

    /**
     * <code>string public_key = 7 [json_name = "publicKey"];</code>
     */
    public var publicKey: kotlin.String
      @JvmName("getPublicKey")
      get() = _builder.getPublicKey()
      @JvmName("setPublicKey")
      set(value) {
        _builder.setPublicKey(value)
      }
    /**
     * <code>string public_key = 7 [json_name = "publicKey"];</code>
     */
    public fun clearPublicKey() {
      _builder.clearPublicKey()
    }

    /**
     * <code>string node_id = 9 [json_name = "nodeId"];</code>
     */
    public var nodeId: kotlin.String
      @JvmName("getNodeId")
      get() = _builder.getNodeId()
      @JvmName("setNodeId")
      set(value) {
        _builder.setNodeId(value)
      }
    /**
     * <code>string node_id = 9 [json_name = "nodeId"];</code>
     */
    public fun clearNodeId() {
      _builder.clearNodeId()
    }

    /**
     * <code>string moniker = 13 [json_name = "moniker"];</code>
     */
    public var moniker: kotlin.String
      @JvmName("getMoniker")
      get() = _builder.getMoniker()
      @JvmName("setMoniker")
      set(value) {
        _builder.setMoniker(value)
      }
    /**
     * <code>string moniker = 13 [json_name = "moniker"];</code>
     */
    public fun clearMoniker() {
      _builder.clearMoniker()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.StatusResponse.copy(block: counters.minter.grpc.client.StatusResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.StatusResponse =
  counters.minter.grpc.client.StatusResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()