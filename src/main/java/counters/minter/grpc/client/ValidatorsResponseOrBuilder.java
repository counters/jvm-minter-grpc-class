// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface ValidatorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.ValidatorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api_pb.ValidatorsResponse.Result validators = 3;</code>
   */
  java.util.List<counters.minter.grpc.client.ValidatorsResponse.Result> 
      getValidatorsList();
  /**
   * <code>repeated .api_pb.ValidatorsResponse.Result validators = 3;</code>
   */
  counters.minter.grpc.client.ValidatorsResponse.Result getValidators(int index);
  /**
   * <code>repeated .api_pb.ValidatorsResponse.Result validators = 3;</code>
   */
  int getValidatorsCount();
  /**
   * <code>repeated .api_pb.ValidatorsResponse.Result validators = 3;</code>
   */
  java.util.List<? extends counters.minter.grpc.client.ValidatorsResponse.ResultOrBuilder> 
      getValidatorsOrBuilderList();
  /**
   * <code>repeated .api_pb.ValidatorsResponse.Result validators = 3;</code>
   */
  counters.minter.grpc.client.ValidatorsResponse.ResultOrBuilder getValidatorsOrBuilder(
      int index);
}
