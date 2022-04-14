//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeeventsRequest")
public inline fun eventsRequest(block: counters.minter.grpc.client.EventsRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EventsRequest =
  counters.minter.grpc.client.EventsRequestKt.Dsl._create(counters.minter.grpc.client.EventsRequest.newBuilder()).apply { block() }._build()
public object EventsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.EventsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.EventsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.EventsRequest = _builder.build()

    /**
     * <code>uint64 height = 1;</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 1;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SearchProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @return A list containing the search.
     */
    public val search: com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSearchList()
      )
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param value The search to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSearch")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.add(value: kotlin.String) {
      _builder.addSearch(value)
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param value The search to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSearch")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param values The search to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSearch")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllSearch(values)
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param values The search to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSearch")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     * @param index The index to set the value at.
     * @param value The search to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSearch")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setSearch(index, value)
    }/**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSearch")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.clear() {
      _builder.clearSearch()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.EventsRequest.copy(block: counters.minter.grpc.client.EventsRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EventsRequest =
  counters.minter.grpc.client.EventsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

