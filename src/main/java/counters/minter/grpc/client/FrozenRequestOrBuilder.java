// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface FrozenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.FrozenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>.google.protobuf.UInt64Value coin_id = 2;</code>
   * @return Whether the coinId field is set.
   */
  boolean hasCoinId();
  /**
   * <code>.google.protobuf.UInt64Value coin_id = 2;</code>
   * @return The coinId.
   */
  com.google.protobuf.UInt64Value getCoinId();
  /**
   * <code>.google.protobuf.UInt64Value coin_id = 2;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getCoinIdOrBuilder();

  /**
   * <code>uint64 height = 3;</code>
   * @return The height.
   */
  long getHeight();
}
