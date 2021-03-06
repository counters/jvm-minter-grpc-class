// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface BuySwapPoolDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.BuySwapPoolData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  java.util.List<counters.minter.grpc.client.Coin> 
      getCoinsList();
  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  counters.minter.grpc.client.Coin getCoins(int index);
  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  int getCoinsCount();
  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  java.util.List<? extends counters.minter.grpc.client.CoinOrBuilder> 
      getCoinsOrBuilderList();
  /**
   * <code>repeated .api_pb.Coin coins = 1;</code>
   */
  counters.minter.grpc.client.CoinOrBuilder getCoinsOrBuilder(
      int index);

  /**
   * <code>string value_to_buy = 2;</code>
   * @return The valueToBuy.
   */
  java.lang.String getValueToBuy();
  /**
   * <code>string value_to_buy = 2;</code>
   * @return The bytes for valueToBuy.
   */
  com.google.protobuf.ByteString
      getValueToBuyBytes();

  /**
   * <code>string maximum_value_to_sell = 4;</code>
   * @return The maximumValueToSell.
   */
  java.lang.String getMaximumValueToSell();
  /**
   * <code>string maximum_value_to_sell = 4;</code>
   * @return The bytes for maximumValueToSell.
   */
  com.google.protobuf.ByteString
      getMaximumValueToSellBytes();
}
