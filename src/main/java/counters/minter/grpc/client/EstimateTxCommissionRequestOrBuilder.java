// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface EstimateTxCommissionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.EstimateTxCommissionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tx = 1;</code>
   * @return The tx.
   */
  java.lang.String getTx();
  /**
   * <code>string tx = 1;</code>
   * @return The bytes for tx.
   */
  com.google.protobuf.ByteString
      getTxBytes();

  /**
   * <code>uint64 height = 2;</code>
   * @return The height.
   */
  long getHeight();
}
