// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface StatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.StatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string version = 8;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 8;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>string network = 11;</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <code>string network = 11;</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <code>uint64 initial_height = 12;</code>
   * @return The initialHeight.
   */
  long getInitialHeight();

  /**
   * <code>string latest_block_hash = 1;</code>
   * @return The latestBlockHash.
   */
  java.lang.String getLatestBlockHash();
  /**
   * <code>string latest_block_hash = 1;</code>
   * @return The bytes for latestBlockHash.
   */
  com.google.protobuf.ByteString
      getLatestBlockHashBytes();

  /**
   * <code>string latest_app_hash = 2;</code>
   * @return The latestAppHash.
   */
  java.lang.String getLatestAppHash();
  /**
   * <code>string latest_app_hash = 2;</code>
   * @return The bytes for latestAppHash.
   */
  com.google.protobuf.ByteString
      getLatestAppHashBytes();

  /**
   * <code>uint64 latest_block_height = 3;</code>
   * @return The latestBlockHeight.
   */
  long getLatestBlockHeight();

  /**
   * <code>string latest_block_time = 4;</code>
   * @return The latestBlockTime.
   */
  java.lang.String getLatestBlockTime();
  /**
   * <code>string latest_block_time = 4;</code>
   * @return The bytes for latestBlockTime.
   */
  com.google.protobuf.ByteString
      getLatestBlockTimeBytes();

  /**
   * <code>uint64 keep_last_states = 5;</code>
   * @return The keepLastStates.
   */
  long getKeepLastStates();

  /**
   * <code>string total_slashed = 10;</code>
   * @return The totalSlashed.
   */
  java.lang.String getTotalSlashed();
  /**
   * <code>string total_slashed = 10;</code>
   * @return The bytes for totalSlashed.
   */
  com.google.protobuf.ByteString
      getTotalSlashedBytes();

  /**
   * <code>string current_emission = 14;</code>
   * @return The currentEmission.
   */
  java.lang.String getCurrentEmission();
  /**
   * <code>string current_emission = 14;</code>
   * @return The bytes for currentEmission.
   */
  com.google.protobuf.ByteString
      getCurrentEmissionBytes();

  /**
   * <code>bool catching_up = 6;</code>
   * @return The catchingUp.
   */
  boolean getCatchingUp();

  /**
   * <code>string public_key = 7;</code>
   * @return The publicKey.
   */
  java.lang.String getPublicKey();
  /**
   * <code>string public_key = 7;</code>
   * @return The bytes for publicKey.
   */
  com.google.protobuf.ByteString
      getPublicKeyBytes();

  /**
   * <code>string node_id = 9;</code>
   * @return The nodeId.
   */
  java.lang.String getNodeId();
  /**
   * <code>string node_id = 9;</code>
   * @return The bytes for nodeId.
   */
  com.google.protobuf.ByteString
      getNodeIdBytes();

  /**
   * <code>string moniker = 13;</code>
   * @return The moniker.
   */
  java.lang.String getMoniker();
  /**
   * <code>string moniker = 13;</code>
   * @return The bytes for moniker.
   */
  com.google.protobuf.ByteString
      getMonikerBytes();
}
