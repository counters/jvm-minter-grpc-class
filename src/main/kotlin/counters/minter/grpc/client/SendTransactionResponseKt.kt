//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializesendTransactionResponse")
public inline fun sendTransactionResponse(block: counters.minter.grpc.client.SendTransactionResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SendTransactionResponse =
  counters.minter.grpc.client.SendTransactionResponseKt.Dsl._create(counters.minter.grpc.client.SendTransactionResponse.newBuilder()).apply { block() }._build()
public object SendTransactionResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.SendTransactionResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SendTransactionResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SendTransactionResponse = _builder.build()

    /**
     * <pre>
     *option (grpc.gateway.protoc_gen_openapiv2.options.openapiv2_schema) = {
     *example: "{&#92;"code&#92;":&#92;"0&#92;",&#92;"log&#92;":&#92;"&#92;", &#92;"hash&#92;":&#92;"Mt6019f740983dc43b53ea9c37891af0c9ce7251399ebaafc4ea56d68d665adfcb&#92;"}"
     *};
     * </pre>
     *
     * <code>uint64 code = 1;</code>
     */
    public var code: kotlin.Long
      @JvmName("getCode")
      get() = _builder.getCode()
      @JvmName("setCode")
      set(value) {
        _builder.setCode(value)
      }
    /**
     * <pre>
     *option (grpc.gateway.protoc_gen_openapiv2.options.openapiv2_schema) = {
     *example: "{&#92;"code&#92;":&#92;"0&#92;",&#92;"log&#92;":&#92;"&#92;", &#92;"hash&#92;":&#92;"Mt6019f740983dc43b53ea9c37891af0c9ce7251399ebaafc4ea56d68d665adfcb&#92;"}"
     *};
     * </pre>
     *
     * <code>uint64 code = 1;</code>
     */
    public fun clearCode() {
      _builder.clearCode()
    }

    /**
     * <code>string log = 3;</code>
     */
    public var log: kotlin.String
      @JvmName("getLog")
      get() = _builder.getLog()
      @JvmName("setLog")
      set(value) {
        _builder.setLog(value)
      }
    /**
     * <code>string log = 3;</code>
     */
    public fun clearLog() {
      _builder.clearLog()
    }

    /**
     * <code>string hash = 4;</code>
     */
    public var hash: kotlin.String
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <code>string hash = 4;</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.SendTransactionResponse.copy(block: counters.minter.grpc.client.SendTransactionResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.SendTransactionResponse =
  counters.minter.grpc.client.SendTransactionResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

