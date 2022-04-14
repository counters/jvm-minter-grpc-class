// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface SellAllCoinDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.SellAllCoinData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api_pb.Coin coin_to_sell = 1;</code>
   * @return Whether the coinToSell field is set.
   */
  boolean hasCoinToSell();
  /**
   * <code>.api_pb.Coin coin_to_sell = 1;</code>
   * @return The coinToSell.
   */
  counters.minter.grpc.client.Coin getCoinToSell();
  /**
   * <code>.api_pb.Coin coin_to_sell = 1;</code>
   */
  counters.minter.grpc.client.CoinOrBuilder getCoinToSellOrBuilder();

  /**
   * <code>.api_pb.Coin coin_to_buy = 2;</code>
   * @return Whether the coinToBuy field is set.
   */
  boolean hasCoinToBuy();
  /**
   * <code>.api_pb.Coin coin_to_buy = 2;</code>
   * @return The coinToBuy.
   */
  counters.minter.grpc.client.Coin getCoinToBuy();
  /**
   * <code>.api_pb.Coin coin_to_buy = 2;</code>
   */
  counters.minter.grpc.client.CoinOrBuilder getCoinToBuyOrBuilder();

  /**
   * <code>string minimum_value_to_buy = 3;</code>
   * @return The minimumValueToBuy.
   */
  java.lang.String getMinimumValueToBuy();
  /**
   * <code>string minimum_value_to_buy = 3;</code>
   * @return The bytes for minimumValueToBuy.
   */
  com.google.protobuf.ByteString
      getMinimumValueToBuyBytes();
}
