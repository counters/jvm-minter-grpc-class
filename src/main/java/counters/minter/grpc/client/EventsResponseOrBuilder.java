// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface EventsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.EventsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.protobuf.Struct events = 1;</code>
   */
  java.util.List<com.google.protobuf.Struct> 
      getEventsList();
  /**
   * <code>repeated .google.protobuf.Struct events = 1;</code>
   */
  com.google.protobuf.Struct getEvents(int index);
  /**
   * <code>repeated .google.protobuf.Struct events = 1;</code>
   */
  int getEventsCount();
  /**
   * <code>repeated .google.protobuf.Struct events = 1;</code>
   */
  java.util.List<? extends com.google.protobuf.StructOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Struct events = 1;</code>
   */
  com.google.protobuf.StructOrBuilder getEventsOrBuilder(
      int index);
}
