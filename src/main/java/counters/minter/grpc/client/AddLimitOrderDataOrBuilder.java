// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface AddLimitOrderDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.AddLimitOrderData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
   * @return Whether the coinToSell field is set.
   */
  boolean hasCoinToSell();
  /**
   * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
   * @return The coinToSell.
   */
  counters.minter.grpc.client.Coin getCoinToSell();
  /**
   * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
   */
  counters.minter.grpc.client.CoinOrBuilder getCoinToSellOrBuilder();

  /**
   * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
   * @return The valueToSell.
   */
  java.lang.String getValueToSell();
  /**
   * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
   * @return The bytes for valueToSell.
   */
  com.google.protobuf.ByteString
      getValueToSellBytes();

  /**
   * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
   * @return Whether the coinToBuy field is set.
   */
  boolean hasCoinToBuy();
  /**
   * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
   * @return The coinToBuy.
   */
  counters.minter.grpc.client.Coin getCoinToBuy();
  /**
   * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
   */
  counters.minter.grpc.client.CoinOrBuilder getCoinToBuyOrBuilder();

  /**
   * <code>string value_to_buy = 4 [json_name = "valueToBuy"];</code>
   * @return The valueToBuy.
   */
  java.lang.String getValueToBuy();
  /**
   * <code>string value_to_buy = 4 [json_name = "valueToBuy"];</code>
   * @return The bytes for valueToBuy.
   */
  com.google.protobuf.ByteString
      getValueToBuyBytes();
}
