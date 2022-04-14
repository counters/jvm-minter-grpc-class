// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

public interface RewardEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.RewardEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api_pb.RewardEvent.Role role = 1;</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <code>.api_pb.RewardEvent.Role role = 1;</code>
   * @return The role.
   */
  counters.minter.grpc.client.RewardEvent.Role getRole();

  /**
   * <code>string address = 2;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 2;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>string amount = 3;</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 3;</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>string validator_pub_key = 4;</code>
   * @return The validatorPubKey.
   */
  java.lang.String getValidatorPubKey();
  /**
   * <code>string validator_pub_key = 4;</code>
   * @return The bytes for validatorPubKey.
   */
  com.google.protobuf.ByteString
      getValidatorPubKeyBytes();

  /**
   * <pre>
   * coin for which the delegator received the reward
   * </pre>
   *
   * <code>uint64 for_coin = 6;</code>
   * @return The forCoin.
   */
  long getForCoin();
}
