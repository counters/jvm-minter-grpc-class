//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeupdateNetworkEvent")
public inline fun updateNetworkEvent(block: counters.minter.grpc.client.UpdateNetworkEventKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.UpdateNetworkEvent =
  counters.minter.grpc.client.UpdateNetworkEventKt.Dsl._create(counters.minter.grpc.client.UpdateNetworkEvent.newBuilder()).apply { block() }._build()
public object UpdateNetworkEventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.UpdateNetworkEvent.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.UpdateNetworkEvent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.UpdateNetworkEvent = _builder.build()

    /**
     * <code>string version = 1;</code>
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <code>string version = 1;</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.UpdateNetworkEvent.copy(block: counters.minter.grpc.client.UpdateNetworkEventKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.UpdateNetworkEvent =
  counters.minter.grpc.client.UpdateNetworkEventKt.Dsl._create(this.toBuilder()).apply { block() }._build()

