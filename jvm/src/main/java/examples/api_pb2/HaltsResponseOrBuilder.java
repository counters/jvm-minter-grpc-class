// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

public interface HaltsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.HaltsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
   * @return A list containing the publicKeys.
   */
  java.util.List<java.lang.String>
      getPublicKeysList();
  /**
   * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
   * @return The count of publicKeys.
   */
  int getPublicKeysCount();
  /**
   * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
   * @param index The index of the element to return.
   * @return The publicKeys at the given index.
   */
  java.lang.String getPublicKeys(int index);
  /**
   * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the publicKeys at the given index.
   */
  com.google.protobuf.ByteString
      getPublicKeysBytes(int index);
}
