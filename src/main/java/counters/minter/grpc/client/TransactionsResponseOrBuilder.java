// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface TransactionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.TransactionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3;</code>
   */
  java.util.List<counters.minter.grpc.client.TransactionResponse> 
      getTransactionsList();
  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3;</code>
   */
  counters.minter.grpc.client.TransactionResponse getTransactions(int index);
  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3;</code>
   */
  int getTransactionsCount();
  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3;</code>
   */
  java.util.List<? extends counters.minter.grpc.client.TransactionResponseOrBuilder> 
      getTransactionsOrBuilderList();
  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3;</code>
   */
  counters.minter.grpc.client.TransactionResponseOrBuilder getTransactionsOrBuilder(
      int index);
}
