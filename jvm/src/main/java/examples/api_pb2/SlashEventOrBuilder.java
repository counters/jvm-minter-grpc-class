// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events.proto

package examples.api_pb2;

public interface SlashEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.SlashEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>string amount = 2 [json_name = "amount"];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 2 [json_name = "amount"];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>uint64 coin = 3 [json_name = "coin"];</code>
   * @return The coin.
   */
  long getCoin();

  /**
   * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
   * @return The validatorPubKey.
   */
  java.lang.String getValidatorPubKey();
  /**
   * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
   * @return The bytes for validatorPubKey.
   */
  com.google.protobuf.ByteString
      getValidatorPubKeyBytes();
}
