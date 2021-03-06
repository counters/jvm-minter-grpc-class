//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializetransactionsRequest")
public inline fun transactionsRequest(block: counters.minter.grpc.client.TransactionsRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.TransactionsRequest =
  counters.minter.grpc.client.TransactionsRequestKt.Dsl._create(counters.minter.grpc.client.TransactionsRequest.newBuilder()).apply { block() }._build()
public object TransactionsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.TransactionsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.TransactionsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.TransactionsRequest = _builder.build()

    /**
     * <code>string query = 1;</code>
     */
    public var query: kotlin.String
      @JvmName("getQuery")
      get() = _builder.getQuery()
      @JvmName("setQuery")
      set(value) {
        _builder.setQuery(value)
      }
    /**
     * <code>string query = 1;</code>
     */
    public fun clearQuery() {
      _builder.clearQuery()
    }

    /**
     * <code>int32 page = 2;</code>
     */
    public var page: kotlin.Int
      @JvmName("getPage")
      get() = _builder.getPage()
      @JvmName("setPage")
      set(value) {
        _builder.setPage(value)
      }
    /**
     * <code>int32 page = 2;</code>
     */
    public fun clearPage() {
      _builder.clearPage()
    }

    /**
     * <code>int32 per_page = 3;</code>
     */
    public var perPage: kotlin.Int
      @JvmName("getPerPage")
      get() = _builder.getPerPage()
      @JvmName("setPerPage")
      set(value) {
        _builder.setPerPage(value)
      }
    /**
     * <code>int32 per_page = 3;</code>
     */
    public fun clearPerPage() {
      _builder.clearPerPage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.TransactionsRequest.copy(block: counters.minter.grpc.client.TransactionsRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.TransactionsRequest =
  counters.minter.grpc.client.TransactionsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

