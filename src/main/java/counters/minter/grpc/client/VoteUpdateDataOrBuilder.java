// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface VoteUpdateDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.VoteUpdateData)
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

  /**
   * <code>string version = 3;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 3;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
