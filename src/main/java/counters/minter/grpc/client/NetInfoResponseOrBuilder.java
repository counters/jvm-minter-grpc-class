// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface NetInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.NetInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool listening = 4;</code>
   * @return The listening.
   */
  boolean getListening();

  /**
   * <code>repeated string listeners = 1;</code>
   * @return A list containing the listeners.
   */
  java.util.List<java.lang.String>
      getListenersList();
  /**
   * <code>repeated string listeners = 1;</code>
   * @return The count of listeners.
   */
  int getListenersCount();
  /**
   * <code>repeated string listeners = 1;</code>
   * @param index The index of the element to return.
   * @return The listeners at the given index.
   */
  java.lang.String getListeners(int index);
  /**
   * <code>repeated string listeners = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the listeners at the given index.
   */
  com.google.protobuf.ByteString
      getListenersBytes(int index);

  /**
   * <code>int64 count_peers = 2;</code>
   * @return The countPeers.
   */
  long getCountPeers();

  /**
   * <code>repeated .api_pb.NetInfoResponse.Peer peers = 3;</code>
   */
  java.util.List<counters.minter.grpc.client.NetInfoResponse.Peer> 
      getPeersList();
  /**
   * <code>repeated .api_pb.NetInfoResponse.Peer peers = 3;</code>
   */
  counters.minter.grpc.client.NetInfoResponse.Peer getPeers(int index);
  /**
   * <code>repeated .api_pb.NetInfoResponse.Peer peers = 3;</code>
   */
  int getPeersCount();
  /**
   * <code>repeated .api_pb.NetInfoResponse.Peer peers = 3;</code>
   */
  java.util.List<? extends counters.minter.grpc.client.NetInfoResponse.PeerOrBuilder> 
      getPeersOrBuilderList();
  /**
   * <code>repeated .api_pb.NetInfoResponse.Peer peers = 3;</code>
   */
  counters.minter.grpc.client.NetInfoResponse.PeerOrBuilder getPeersOrBuilder(
      int index);
}
