// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface SetHaltBlockDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.SetHaltBlockData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string pub_key = 1;</code>
   * @return The pubKey.
   */
  java.lang.String getPubKey();
  /**
   * <code>string pub_key = 1;</code>
   * @return The bytes for pubKey.
   */
  com.google.protobuf.ByteString
      getPubKeyBytes();

  /**
   * <code>uint64 height = 2;</code>
   * @return The height.
   */
  long getHeight();
}
