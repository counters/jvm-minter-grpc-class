// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface SendDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.SendData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api_pb.Coin coin = 1 [json_name = "coin"];</code>
   * @return Whether the coin field is set.
   */
  boolean hasCoin();
  /**
   * <code>.api_pb.Coin coin = 1 [json_name = "coin"];</code>
   * @return The coin.
   */
  counters.minter.grpc.client.Coin getCoin();
  /**
   * <code>.api_pb.Coin coin = 1 [json_name = "coin"];</code>
   */
  counters.minter.grpc.client.CoinOrBuilder getCoinOrBuilder();

  /**
   * <code>string to = 2 [json_name = "to"];</code>
   * @return The to.
   */
  java.lang.String getTo();
  /**
   * <code>string to = 2 [json_name = "to"];</code>
   * @return The bytes for to.
   */
  com.google.protobuf.ByteString
      getToBytes();

  /**
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}