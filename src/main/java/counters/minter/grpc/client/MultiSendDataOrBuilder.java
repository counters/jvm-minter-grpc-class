// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface MultiSendDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.MultiSendData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
   */
  java.util.List<counters.minter.grpc.client.SendData> 
      getListList();
  /**
   * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
   */
  counters.minter.grpc.client.SendData getList(int index);
  /**
   * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
   */
  int getListCount();
  /**
   * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
   */
  java.util.List<? extends counters.minter.grpc.client.SendDataOrBuilder> 
      getListOrBuilderList();
  /**
   * <code>repeated .api_pb.SendData list = 1 [json_name = "list"];</code>
   */
  counters.minter.grpc.client.SendDataOrBuilder getListOrBuilder(
      int index);
}