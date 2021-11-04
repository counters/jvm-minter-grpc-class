//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package examples.api_pb2;

@kotlin.jvm.JvmSynthetic
public inline fun candidateResponse(block: examples.api_pb2.CandidateResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CandidateResponse =
  examples.api_pb2.CandidateResponseKt.Dsl._create(examples.api_pb2.CandidateResponse.newBuilder()).apply { block() }._build()
public object CandidateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: examples.api_pb2.CandidateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: examples.api_pb2.CandidateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): examples.api_pb2.CandidateResponse = _builder.build()

    /**
     * <code>uint64 id = 14 [json_name = "id"];</code>
     */
    public var id: kotlin.Long
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>uint64 id = 14 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <pre>
     * Address where validator’s rewards go to.
     * </pre>
     *
     * <code>string reward_address = 1 [json_name = "rewardAddress"];</code>
     */
    public var rewardAddress: kotlin.String
      @JvmName("getRewardAddress")
      get() = _builder.getRewardAddress()
      @JvmName("setRewardAddress")
      set(value) {
        _builder.setRewardAddress(value)
      }
    /**
     * <pre>
     * Address where validator’s rewards go to.
     * </pre>
     *
     * <code>string reward_address = 1 [json_name = "rewardAddress"];</code>
     */
    public fun clearRewardAddress() {
      _builder.clearRewardAddress()
    }

    /**
     * <pre>
     * Address that allows one to start the candidate by sending the SetCandidateOnline transaction or stop it by sending the SetCandidateOffline transaction. It also enables the owner to edit the node by sending EditCandidate.
     * </pre>
     *
     * <code>string owner_address = 10 [json_name = "ownerAddress"];</code>
     */
    public var ownerAddress: kotlin.String
      @JvmName("getOwnerAddress")
      get() = _builder.getOwnerAddress()
      @JvmName("setOwnerAddress")
      set(value) {
        _builder.setOwnerAddress(value)
      }
    /**
     * <pre>
     * Address that allows one to start the candidate by sending the SetCandidateOnline transaction or stop it by sending the SetCandidateOffline transaction. It also enables the owner to edit the node by sending EditCandidate.
     * </pre>
     *
     * <code>string owner_address = 10 [json_name = "ownerAddress"];</code>
     */
    public fun clearOwnerAddress() {
      _builder.clearOwnerAddress()
    }

    /**
     * <pre>
     * Address that allows one to start the candidate by sending the SetCandidateOnline transaction or stop it by sending the SetCandidateOffline transaction.
     * </pre>
     *
     * <code>string control_address = 11 [json_name = "controlAddress"];</code>
     */
    public var controlAddress: kotlin.String
      @JvmName("getControlAddress")
      get() = _builder.getControlAddress()
      @JvmName("setControlAddress")
      set(value) {
        _builder.setControlAddress(value)
      }
    /**
     * <pre>
     * Address that allows one to start the candidate by sending the SetCandidateOnline transaction or stop it by sending the SetCandidateOffline transaction.
     * </pre>
     *
     * <code>string control_address = 11 [json_name = "controlAddress"];</code>
     */
    public fun clearControlAddress() {
      _builder.clearControlAddress()
    }

    /**
     * <pre>
     * Total stake of a candidate
     * </pre>
     *
     * <code>string total_stake = 2 [json_name = "totalStake"];</code>
     */
    public var totalStake: kotlin.String
      @JvmName("getTotalStake")
      get() = _builder.getTotalStake()
      @JvmName("setTotalStake")
      set(value) {
        _builder.setTotalStake(value)
      }
    /**
     * <pre>
     * Total stake of a candidate
     * </pre>
     *
     * <code>string total_stake = 2 [json_name = "totalStake"];</code>
     */
    public fun clearTotalStake() {
      _builder.clearTotalStake()
    }

    /**
     * <pre>
     * Public key of a candidate
     * </pre>
     *
     * <code>string public_key = 3 [json_name = "publicKey"];</code>
     */
    public var publicKey: kotlin.String
      @JvmName("getPublicKey")
      get() = _builder.getPublicKey()
      @JvmName("setPublicKey")
      set(value) {
        _builder.setPublicKey(value)
      }
    /**
     * <pre>
     * Public key of a candidate
     * </pre>
     *
     * <code>string public_key = 3 [json_name = "publicKey"];</code>
     */
    public fun clearPublicKey() {
      _builder.clearPublicKey()
    }

    /**
     * <pre>
     * Commission (from 0 to 100) from rewards which delegators will pay to validator
     * </pre>
     *
     * <code>uint64 commission = 4 [json_name = "commission"];</code>
     */
    public var commission: kotlin.Long
      @JvmName("getCommission")
      get() = _builder.getCommission()
      @JvmName("setCommission")
      set(value) {
        _builder.setCommission(value)
      }
    /**
     * <pre>
     * Commission (from 0 to 100) from rewards which delegators will pay to validator
     * </pre>
     *
     * <code>uint64 commission = 4 [json_name = "commission"];</code>
     */
    public fun clearCommission() {
      _builder.clearCommission()
    }

    /**
     * <pre>
     * Number of occupied steak slots. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>.google.protobuf.UInt64Value used_slots = 7 [json_name = "usedSlots"];</code>
     */
    public var usedSlots: com.google.protobuf.UInt64Value
      @JvmName("getUsedSlots")
      get() = _builder.getUsedSlots()
      @JvmName("setUsedSlots")
      set(value) {
        _builder.setUsedSlots(value)
      }
    /**
     * <pre>
     * Number of occupied steak slots. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>.google.protobuf.UInt64Value used_slots = 7 [json_name = "usedSlots"];</code>
     */
    public fun clearUsedSlots() {
      _builder.clearUsedSlots()
    }
    /**
     * <pre>
     * Number of occupied steak slots. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>.google.protobuf.UInt64Value used_slots = 7 [json_name = "usedSlots"];</code>
     * @return Whether the usedSlots field is set.
     */
    public fun hasUsedSlots(): kotlin.Boolean {
      return _builder.hasUsedSlots()
    }

    /**
     * <pre>
     * Number of unique wallets in steaks. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>.google.protobuf.UInt64Value uniq_users = 8 [json_name = "uniqUsers"];</code>
     */
    public var uniqUsers: com.google.protobuf.UInt64Value
      @JvmName("getUniqUsers")
      get() = _builder.getUniqUsers()
      @JvmName("setUniqUsers")
      set(value) {
        _builder.setUniqUsers(value)
      }
    /**
     * <pre>
     * Number of unique wallets in steaks. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>.google.protobuf.UInt64Value uniq_users = 8 [json_name = "uniqUsers"];</code>
     */
    public fun clearUniqUsers() {
      _builder.clearUniqUsers()
    }
    /**
     * <pre>
     * Number of unique wallets in steaks. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>.google.protobuf.UInt64Value uniq_users = 8 [json_name = "uniqUsers"];</code>
     * @return Whether the uniqUsers field is set.
     */
    public fun hasUniqUsers(): kotlin.Boolean {
      return _builder.hasUniqUsers()
    }

    /**
     * <pre>
     * Smallest steak size. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>.google.protobuf.StringValue min_stake = 9 [json_name = "minStake"];</code>
     */
    public var minStake: com.google.protobuf.StringValue
      @JvmName("getMinStake")
      get() = _builder.getMinStake()
      @JvmName("setMinStake")
      set(value) {
        _builder.setMinStake(value)
      }
    /**
     * <pre>
     * Smallest steak size. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>.google.protobuf.StringValue min_stake = 9 [json_name = "minStake"];</code>
     */
    public fun clearMinStake() {
      _builder.clearMinStake()
    }
    /**
     * <pre>
     * Smallest steak size. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>.google.protobuf.StringValue min_stake = 9 [json_name = "minStake"];</code>
     * @return Whether the minStake field is set.
     */
    public fun hasMinStake(): kotlin.Boolean {
      return _builder.hasMinStake()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class StakesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * List of stakes. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>repeated .api_pb.CandidateResponse.Stake stakes = 5 [json_name = "stakes"];</code>
     */
     public val stakes: com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse.Stake, StakesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getStakesList()
      )
    /**
     * <pre>
     * List of stakes. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>repeated .api_pb.CandidateResponse.Stake stakes = 5 [json_name = "stakes"];</code>
     * @param value The stakes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addStakes")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse.Stake, StakesProxy>.add(value: examples.api_pb2.CandidateResponse.Stake) {
      _builder.addStakes(value)
    }/**
     * <pre>
     * List of stakes. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>repeated .api_pb.CandidateResponse.Stake stakes = 5 [json_name = "stakes"];</code>
     * @param value The stakes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignStakes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse.Stake, StakesProxy>.plusAssign(value: examples.api_pb2.CandidateResponse.Stake) {
      add(value)
    }/**
     * <pre>
     * List of stakes. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>repeated .api_pb.CandidateResponse.Stake stakes = 5 [json_name = "stakes"];</code>
     * @param values The stakes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllStakes")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse.Stake, StakesProxy>.addAll(values: kotlin.collections.Iterable<examples.api_pb2.CandidateResponse.Stake>) {
      _builder.addAllStakes(values)
    }/**
     * <pre>
     * List of stakes. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>repeated .api_pb.CandidateResponse.Stake stakes = 5 [json_name = "stakes"];</code>
     * @param values The stakes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllStakes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse.Stake, StakesProxy>.plusAssign(values: kotlin.collections.Iterable<examples.api_pb2.CandidateResponse.Stake>) {
      addAll(values)
    }/**
     * <pre>
     * List of stakes. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>repeated .api_pb.CandidateResponse.Stake stakes = 5 [json_name = "stakes"];</code>
     * @param index The index to set the value at.
     * @param value The stakes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setStakes")
    public operator fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse.Stake, StakesProxy>.set(index: kotlin.Int, value: examples.api_pb2.CandidateResponse.Stake) {
      _builder.setStakes(index, value)
    }/**
     * <pre>
     * List of stakes. Note: filled in when request includes_stakes
     * </pre>
     *
     * <code>repeated .api_pb.CandidateResponse.Stake stakes = 5 [json_name = "stakes"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearStakes")
    public fun com.google.protobuf.kotlin.DslList<examples.api_pb2.CandidateResponse.Stake, StakesProxy>.clear() {
      _builder.clearStakes()
    }
    /**
     * <pre>
     * Candidate status. Available values: offline = 1, online = 2
     * </pre>
     *
     * <code>uint64 status = 6 [json_name = "status"];</code>
     */
    public var status: kotlin.Long
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    /**
     * <pre>
     * Candidate status. Available values: offline = 1, online = 2
     * </pre>
     *
     * <code>uint64 status = 6 [json_name = "status"];</code>
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }

    /**
     * <pre>
     * Is a validator at the current height
     * </pre>
     *
     * <code>bool validator = 12 [json_name = "validator"];</code>
     */
    public var validator: kotlin.Boolean
      @JvmName("getValidator")
      get() = _builder.getValidator()
      @JvmName("setValidator")
      set(value) {
        _builder.setValidator(value)
      }
    /**
     * <pre>
     * Is a validator at the current height
     * </pre>
     *
     * <code>bool validator = 12 [json_name = "validator"];</code>
     */
    public fun clearValidator() {
      _builder.clearValidator()
    }

    /**
     * <code>uint64 jailed_until = 13 [json_name = "jailedUntil"];</code>
     */
    public var jailedUntil: kotlin.Long
      @JvmName("getJailedUntil")
      get() = _builder.getJailedUntil()
      @JvmName("setJailedUntil")
      set(value) {
        _builder.setJailedUntil(value)
      }
    /**
     * <code>uint64 jailed_until = 13 [json_name = "jailedUntil"];</code>
     */
    public fun clearJailedUntil() {
      _builder.clearJailedUntil()
    }
  }
  @kotlin.jvm.JvmSynthetic
  public inline fun stake(block: examples.api_pb2.CandidateResponseKt.StakeKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CandidateResponse.Stake =
    examples.api_pb2.CandidateResponseKt.StakeKt.Dsl._create(examples.api_pb2.CandidateResponse.Stake.newBuilder()).apply { block() }._build()
  public object StakeKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: examples.api_pb2.CandidateResponse.Stake.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: examples.api_pb2.CandidateResponse.Stake.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): examples.api_pb2.CandidateResponse.Stake = _builder.build()

      /**
       * <code>string owner = 1 [json_name = "owner"];</code>
       */
      public var owner: kotlin.String
        @JvmName("getOwner")
        get() = _builder.getOwner()
        @JvmName("setOwner")
        set(value) {
          _builder.setOwner(value)
        }
      /**
       * <code>string owner = 1 [json_name = "owner"];</code>
       */
      public fun clearOwner() {
        _builder.clearOwner()
      }

      /**
       * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
       */
      public var coin: examples.api_pb2.Coin
        @JvmName("getCoin")
        get() = _builder.getCoin()
        @JvmName("setCoin")
        set(value) {
          _builder.setCoin(value)
        }
      /**
       * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
       */
      public fun clearCoin() {
        _builder.clearCoin()
      }
      /**
       * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
       * @return Whether the coin field is set.
       */
      public fun hasCoin(): kotlin.Boolean {
        return _builder.hasCoin()
      }

      /**
       * <code>string value = 3 [json_name = "value"];</code>
       */
      public var value: kotlin.String
        @JvmName("getValue")
        get() = _builder.getValue()
        @JvmName("setValue")
        set(value) {
          _builder.setValue(value)
        }
      /**
       * <code>string value = 3 [json_name = "value"];</code>
       */
      public fun clearValue() {
        _builder.clearValue()
      }

      /**
       * <code>string bip_value = 4 [json_name = "bipValue"];</code>
       */
      public var bipValue: kotlin.String
        @JvmName("getBipValue")
        get() = _builder.getBipValue()
        @JvmName("setBipValue")
        set(value) {
          _builder.setBipValue(value)
        }
      /**
       * <code>string bip_value = 4 [json_name = "bipValue"];</code>
       */
      public fun clearBipValue() {
        _builder.clearBipValue()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.CandidateResponse.copy(block: examples.api_pb2.CandidateResponseKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CandidateResponse =
  examples.api_pb2.CandidateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
public inline fun examples.api_pb2.CandidateResponse.Stake.copy(block: examples.api_pb2.CandidateResponseKt.StakeKt.Dsl.() -> kotlin.Unit): examples.api_pb2.CandidateResponse.Stake =
  examples.api_pb2.CandidateResponseKt.StakeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
