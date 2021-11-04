// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events.proto

package examples.api_pb2;

public interface RewardEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.RewardEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
   * @return The role.
   */
  examples.api_pb2.RewardEvent.Role getRole();

  /**
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>string amount = 3 [json_name = "amount"];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 3 [json_name = "amount"];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>uint64 coin = 5 [json_name = "coin"];</code>
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

  /**
   * <pre>
   * coin for which the delegator received the reward
   * </pre>
   *
   * <code>uint64 for_coin = 6 [json_name = "forCoin"];</code>
   * @return The forCoin.
   */
  long getForCoin();
}
