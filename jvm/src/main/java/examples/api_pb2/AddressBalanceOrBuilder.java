// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

public interface AddressBalanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.AddressBalance)
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
  examples.api_pb2.Coin getCoin();
  /**
   * <code>.api_pb.Coin coin = 1 [json_name = "coin"];</code>
   */
  examples.api_pb2.CoinOrBuilder getCoinOrBuilder();

  /**
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>string bip_value = 3 [json_name = "bipValue"];</code>
   * @return The bipValue.
   */
  java.lang.String getBipValue();
  /**
   * <code>string bip_value = 3 [json_name = "bipValue"];</code>
   * @return The bytes for bipValue.
   */
  com.google.protobuf.ByteString
      getBipValueBytes();
}
