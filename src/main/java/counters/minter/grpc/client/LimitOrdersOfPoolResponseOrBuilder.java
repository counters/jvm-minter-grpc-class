// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface LimitOrdersOfPoolResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.LimitOrdersOfPoolResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
   * @return The poolPrice.
   */
  java.lang.String getPoolPrice();
  /**
   * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
   * @return The bytes for poolPrice.
   */
  com.google.protobuf.ByteString
      getPoolPriceBytes();

  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  java.util.List<counters.minter.grpc.client.LimitOrderResponse> 
      getOrdersList();
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  counters.minter.grpc.client.LimitOrderResponse getOrders(int index);
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  int getOrdersCount();
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  java.util.List<? extends counters.minter.grpc.client.LimitOrderResponseOrBuilder> 
      getOrdersOrBuilderList();
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  counters.minter.grpc.client.LimitOrderResponseOrBuilder getOrdersOrBuilder(
      int index);
}