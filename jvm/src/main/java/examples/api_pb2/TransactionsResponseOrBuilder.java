// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

public interface TransactionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.TransactionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
   */
  java.util.List<examples.api_pb2.TransactionResponse> 
      getTransactionsList();
  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
   */
  examples.api_pb2.TransactionResponse getTransactions(int index);
  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
   */
  int getTransactionsCount();
  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
   */
  java.util.List<? extends examples.api_pb2.TransactionResponseOrBuilder> 
      getTransactionsOrBuilderList();
  /**
   * <code>repeated .api_pb.TransactionResponse transactions = 3 [json_name = "transactions"];</code>
   */
  examples.api_pb2.TransactionResponseOrBuilder getTransactionsOrBuilder(
      int index);
}
