// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

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
  java.util.List<examples.api_pb2.LimitOrderResponse> 
      getOrdersList();
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  examples.api_pb2.LimitOrderResponse getOrders(int index);
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  int getOrdersCount();
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  java.util.List<? extends examples.api_pb2.LimitOrderResponseOrBuilder> 
      getOrdersOrBuilderList();
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  examples.api_pb2.LimitOrderResponseOrBuilder getOrdersOrBuilder(
      int index);
}
