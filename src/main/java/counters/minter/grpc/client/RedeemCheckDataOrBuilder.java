// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface RedeemCheckDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.RedeemCheckData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
   * @return The rawCheck.
   */
  java.lang.String getRawCheck();
  /**
   * <code>string raw_check = 1 [json_name = "rawCheck"];</code>
   * @return The bytes for rawCheck.
   */
  com.google.protobuf.ByteString
      getRawCheckBytes();

  /**
   * <code>string proof = 2 [json_name = "proof"];</code>
   * @return The proof.
   */
  java.lang.String getProof();
  /**
   * <code>string proof = 2 [json_name = "proof"];</code>
   * @return The bytes for proof.
   */
  com.google.protobuf.ByteString
      getProofBytes();
}