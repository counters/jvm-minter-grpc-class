//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun candidatesResponse(block: examples.api_pb2.CandidatesResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CandidatesResponse =
  examples.api_pb2.CandidatesResponseKt.Dsl._create(examples.api_pb2.CandidatesResponse.newBuilder()).apply { block() }._build()
public object CandidatesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.CandidatesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.CandidatesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.CandidatesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class CandidatesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .api_pb.CandidateResponse candidates = 3 [json_name = "candidates"];</code>
     */
     public val candidates: com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse, CandidatesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getCandidatesList()
      )
    /**
     * <code>repeated .api_pb.CandidateResponse candidates = 3 [json_name = "candidates"];</code>
     * @param value The candidates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addCandidates")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse, CandidatesProxy>.add(value: examples.api_pb2.CandidateResponse) {
      _builder.addCandidates(value)
    }/**
     * <code>repeated .api_pb.CandidateResponse candidates = 3 [json_name = "candidates"];</code>
     * @param value The candidates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignCandidates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse, CandidatesProxy>.plusAssign(value: examples.api_pb2.CandidateResponse) {
      add(value)
    }/**
     * <code>repeated .api_pb.CandidateResponse candidates = 3 [json_name = "candidates"];</code>
     * @param values The candidates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllCandidates")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse, CandidatesProxy>.addAll(values: kotlin.collections.Iterable<examples.api_pb2.CandidateResponse>) {
      _builder.addAllCandidates(values)
    }/**
     * <code>repeated .api_pb.CandidateResponse candidates = 3 [json_name = "candidates"];</code>
     * @param values The candidates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllCandidates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse, CandidatesProxy>.plusAssign(values: kotlin.collections.Iterable<examples.api_pb2.CandidateResponse>) {
      addAll(values)
    }/**
     * <code>repeated .api_pb.CandidateResponse candidates = 3 [json_name = "candidates"];</code>
     * @param index The index to set the value at.
     * @param value The candidates to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setCandidates")
    public operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse, CandidatesProxy>.set(index: kotlin.Int, value: examples.api_pb2.CandidateResponse) {
      _builder.setCandidates(index, value)
    }/**
     * <code>repeated .api_pb.CandidateResponse candidates = 3 [json_name = "candidates"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearCandidates")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse, CandidatesProxy>.clear() {
      _builder.clearCandidates()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.CandidatesResponse.copy(block: examples.api_pb2.CandidatesResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CandidatesResponse =
  examples.api_pb2.CandidatesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
