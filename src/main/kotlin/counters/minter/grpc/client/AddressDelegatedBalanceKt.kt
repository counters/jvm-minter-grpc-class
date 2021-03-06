//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmName("-initializeaddressDelegatedBalance")
public inline fun addressDelegatedBalance(block: counters.minter.grpc.client.AddressDelegatedBalanceKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.AddressDelegatedBalance =
  counters.minter.grpc.client.AddressDelegatedBalanceKt.Dsl._create(counters.minter.grpc.client.AddressDelegatedBalance.newBuilder()).apply { block() }._build()
public object AddressDelegatedBalanceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.AddressDelegatedBalance.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.AddressDelegatedBalance.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.AddressDelegatedBalance = _builder.build()

    /**
     * <code>.api_pb.Coin coin = 1;</code>
     */
    public var coin: counters.minter.grpc.client.Coin
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * <code>.api_pb.Coin coin = 1;</code>
     */
    public fun clearCoin() {
      _builder.clearCoin()
    }
    /**
     * <code>.api_pb.Coin coin = 1;</code>
     * @return Whether the coin field is set.
     */
    public fun hasCoin(): kotlin.Boolean {
      return _builder.hasCoin()
    }

    /**
     * <code>string value = 2;</code>
     */
    public var value: kotlin.String
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>string value = 2;</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }

    /**
     * <code>string bip_value = 3;</code>
     */
    public var bipValue: kotlin.String
      @JvmName("getBipValue")
      get() = _builder.getBipValue()
      @JvmName("setBipValue")
      set(value) {
        _builder.setBipValue(value)
      }
    /**
     * <code>string bip_value = 3;</code>
     */
    public fun clearBipValue() {
      _builder.clearBipValue()
    }

    /**
     * <code>string delegate_bip_value = 4;</code>
     */
    public var delegateBipValue: kotlin.String
      @JvmName("getDelegateBipValue")
      get() = _builder.getDelegateBipValue()
      @JvmName("setDelegateBipValue")
      set(value) {
        _builder.setDelegateBipValue(value)
      }
    /**
     * <code>string delegate_bip_value = 4;</code>
     */
    public fun clearDelegateBipValue() {
      _builder.clearDelegateBipValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.AddressDelegatedBalance.copy(block: counters.minter.grpc.client.AddressDelegatedBalanceKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.AddressDelegatedBalance =
  counters.minter.grpc.client.AddressDelegatedBalanceKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val counters.minter.grpc.client.AddressDelegatedBalanceOrBuilder.coinOrNull: counters.minter.grpc.client.Coin?
  get() = if (hasCoin()) getCoin() else null

