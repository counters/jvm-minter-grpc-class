package counters.minter.grpc.client

import com.google.protobuf.Empty
import counters.minter.grpc.client.ApiServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for api_pb.ApiService.
 */
object ApiServiceGrpcKt {
  const val SERVICE_NAME: String = ApiServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ApiServiceGrpc.getServiceDescriptor()

  val subscribeMethod: MethodDescriptor<SubscribeRequest, SubscribeResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getSubscribeMethod()

  val haltsMethod: MethodDescriptor<HaltsRequest, HaltsResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getHaltsMethod()

  val genesisMethod: MethodDescriptor<Empty, GenesisResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getGenesisMethod()

  val minGasPriceMethod: MethodDescriptor<Empty, MinGasPriceResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getMinGasPriceMethod()

  val netInfoMethod: MethodDescriptor<Empty, NetInfoResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getNetInfoMethod()

  val statusMethod: MethodDescriptor<Empty, StatusResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getStatusMethod()

  val addressMethod: MethodDescriptor<AddressRequest, AddressResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getAddressMethod()

  val addressesMethod: MethodDescriptor<AddressesRequest, AddressesResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getAddressesMethod()

  val blockMethod: MethodDescriptor<BlockRequest, BlockResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getBlockMethod()

  val candidateMethod: MethodDescriptor<CandidateRequest, CandidateResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getCandidateMethod()

  val candidatesMethod: MethodDescriptor<CandidatesRequest, CandidatesResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getCandidatesMethod()

  val coinInfoByIdMethod: MethodDescriptor<CoinIdRequest, CoinInfoResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getCoinInfoByIdMethod()

  val coinInfoMethod: MethodDescriptor<CoinInfoRequest, CoinInfoResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getCoinInfoMethod()

  val estimateCoinBuyMethod: MethodDescriptor<EstimateCoinBuyRequest, EstimateCoinBuyResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getEstimateCoinBuyMethod()

  val estimateCoinSellMethod: MethodDescriptor<EstimateCoinSellRequest, EstimateCoinSellResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getEstimateCoinSellMethod()

  val estimateCoinSellAllMethod: MethodDescriptor<EstimateCoinSellAllRequest,
      EstimateCoinSellAllResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getEstimateCoinSellAllMethod()

  val estimateTxCommissionMethod: MethodDescriptor<EstimateTxCommissionRequest,
      EstimateTxCommissionResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getEstimateTxCommissionMethod()

  val eventsMethod: MethodDescriptor<EventsRequest, EventsResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getEventsMethod()

  val maxGasPriceMethod: MethodDescriptor<MaxGasPriceRequest, MaxGasPriceResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getMaxGasPriceMethod()

  val missedBlocksMethod: MethodDescriptor<MissedBlocksRequest, MissedBlocksResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getMissedBlocksMethod()

  val sendTransactionMethod: MethodDescriptor<SendTransactionRequest, SendTransactionResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getSendTransactionMethod()

  val transactionMethod: MethodDescriptor<TransactionRequest, TransactionResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getTransactionMethod()

  val transactionsMethod: MethodDescriptor<TransactionsRequest, TransactionsResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getTransactionsMethod()

  val unconfirmedTxsMethod: MethodDescriptor<UnconfirmedTxsRequest, UnconfirmedTxsResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getUnconfirmedTxsMethod()

  val validatorsMethod: MethodDescriptor<ValidatorsRequest, ValidatorsResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getValidatorsMethod()

  val frozenMethod: MethodDescriptor<FrozenRequest, FrozenResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getFrozenMethod()

  val waitListMethod: MethodDescriptor<WaitListRequest, WaitListResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getWaitListMethod()

  val testBlockMethod: MethodDescriptor<Empty, BlockResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getTestBlockMethod()

  val swapPoolMethod: MethodDescriptor<SwapPoolRequest, SwapPoolResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getSwapPoolMethod()

  val swapPoolProviderMethod: MethodDescriptor<SwapPoolProviderRequest, SwapPoolResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getSwapPoolProviderMethod()

  val priceCommissionMethod: MethodDescriptor<PriceCommissionRequest, PriceCommissionResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getPriceCommissionMethod()

  val versionNetworkMethod: MethodDescriptor<VersionNetworkRequest, VersionNetworkResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getVersionNetworkMethod()

  val commissionVotesMethod: MethodDescriptor<CommissionVotesRequest, CommissionVotesResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getCommissionVotesMethod()

  val updateVotesMethod: MethodDescriptor<UpdateVotesRequest, UpdateVotesResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getUpdateVotesMethod()

  val blocksMethod: MethodDescriptor<BlocksRequest, BlocksResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getBlocksMethod()

  val limitOrderMethod: MethodDescriptor<LimitOrderRequest, LimitOrderResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getLimitOrderMethod()

  val limitOrdersOfPoolMethod: MethodDescriptor<LimitOrdersOfPoolRequest, LimitOrdersOfPoolResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getLimitOrdersOfPoolMethod()

  val limitOrdersMethod: MethodDescriptor<LimitOrdersRequest, LimitOrdersResponse>
    @JvmStatic
    get() = ApiServiceGrpc.getLimitOrdersMethod()

  /**
   * A stub for issuing RPCs to a(n) api_pb.ApiService service as suspending coroutines.
   */
  @StubFor(ApiServiceGrpc::class)
  class ApiServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ApiServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ApiServiceCoroutineStub =
        ApiServiceCoroutineStub(channel, callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun subscribe(request: SubscribeRequest, headers: Metadata = Metadata()):
        Flow<SubscribeResponse> = serverStreamingRpc(
      channel,
      ApiServiceGrpc.getSubscribeMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun halts(request: HaltsRequest, headers: Metadata = Metadata()): HaltsResponse =
        unaryRpc(
      channel,
      ApiServiceGrpc.getHaltsMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun genesis(request: Empty, headers: Metadata = Metadata()): GenesisResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getGenesisMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun minGasPrice(request: Empty, headers: Metadata = Metadata()): MinGasPriceResponse =
        unaryRpc(
      channel,
      ApiServiceGrpc.getMinGasPriceMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun netInfo(request: Empty, headers: Metadata = Metadata()): NetInfoResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getNetInfoMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun status(request: Empty, headers: Metadata = Metadata()): StatusResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getStatusMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun address(request: AddressRequest, headers: Metadata = Metadata()): AddressResponse =
        unaryRpc(
      channel,
      ApiServiceGrpc.getAddressMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun addresses(request: AddressesRequest, headers: Metadata = Metadata()):
        AddressesResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getAddressesMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun block(request: BlockRequest, headers: Metadata = Metadata()): BlockResponse =
        unaryRpc(
      channel,
      ApiServiceGrpc.getBlockMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun candidate(request: CandidateRequest, headers: Metadata = Metadata()):
        CandidateResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getCandidateMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun candidates(request: CandidatesRequest, headers: Metadata = Metadata()):
        CandidatesResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getCandidatesMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun coinInfoById(request: CoinIdRequest, headers: Metadata = Metadata()):
        CoinInfoResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getCoinInfoByIdMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun coinInfo(request: CoinInfoRequest, headers: Metadata = Metadata()): CoinInfoResponse
        = unaryRpc(
      channel,
      ApiServiceGrpc.getCoinInfoMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun estimateCoinBuy(request: EstimateCoinBuyRequest, headers: Metadata = Metadata()):
        EstimateCoinBuyResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getEstimateCoinBuyMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun estimateCoinSell(request: EstimateCoinSellRequest, headers: Metadata = Metadata()):
        EstimateCoinSellResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getEstimateCoinSellMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun estimateCoinSellAll(request: EstimateCoinSellAllRequest, headers: Metadata =
        Metadata()): EstimateCoinSellAllResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getEstimateCoinSellAllMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun estimateTxCommission(request: EstimateTxCommissionRequest, headers: Metadata =
        Metadata()): EstimateTxCommissionResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getEstimateTxCommissionMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun events(request: EventsRequest, headers: Metadata = Metadata()): EventsResponse =
        unaryRpc(
      channel,
      ApiServiceGrpc.getEventsMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun maxGasPrice(request: MaxGasPriceRequest, headers: Metadata = Metadata()):
        MaxGasPriceResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getMaxGasPriceMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun missedBlocks(request: MissedBlocksRequest, headers: Metadata = Metadata()):
        MissedBlocksResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getMissedBlocksMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun sendTransaction(request: SendTransactionRequest, headers: Metadata = Metadata()):
        SendTransactionResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getSendTransactionMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun transaction(request: TransactionRequest, headers: Metadata = Metadata()):
        TransactionResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getTransactionMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun transactions(request: TransactionsRequest, headers: Metadata = Metadata()):
        TransactionsResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getTransactionsMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun unconfirmedTxs(request: UnconfirmedTxsRequest, headers: Metadata = Metadata()):
        UnconfirmedTxsResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getUnconfirmedTxsMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun validators(request: ValidatorsRequest, headers: Metadata = Metadata()):
        ValidatorsResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getValidatorsMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun frozen(request: FrozenRequest, headers: Metadata = Metadata()): FrozenResponse =
        unaryRpc(
      channel,
      ApiServiceGrpc.getFrozenMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun waitList(request: WaitListRequest, headers: Metadata = Metadata()): WaitListResponse
        = unaryRpc(
      channel,
      ApiServiceGrpc.getWaitListMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun testBlock(request: Empty, headers: Metadata = Metadata()): BlockResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getTestBlockMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun swapPool(request: SwapPoolRequest, headers: Metadata = Metadata()): SwapPoolResponse
        = unaryRpc(
      channel,
      ApiServiceGrpc.getSwapPoolMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun swapPoolProvider(request: SwapPoolProviderRequest, headers: Metadata = Metadata()):
        SwapPoolResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getSwapPoolProviderMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun priceCommission(request: PriceCommissionRequest, headers: Metadata = Metadata()):
        PriceCommissionResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getPriceCommissionMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun versionNetwork(request: VersionNetworkRequest, headers: Metadata = Metadata()):
        VersionNetworkResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getVersionNetworkMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun commissionVotes(request: CommissionVotesRequest, headers: Metadata = Metadata()):
        CommissionVotesResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getCommissionVotesMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun updateVotes(request: UpdateVotesRequest, headers: Metadata = Metadata()):
        UpdateVotesResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getUpdateVotesMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun blocks(request: BlocksRequest, headers: Metadata = Metadata()): BlocksResponse =
        unaryRpc(
      channel,
      ApiServiceGrpc.getBlocksMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun limitOrder(request: LimitOrderRequest, headers: Metadata = Metadata()):
        LimitOrderResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getLimitOrderMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun limitOrdersOfPool(request: LimitOrdersOfPoolRequest, headers: Metadata =
        Metadata()): LimitOrdersOfPoolResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getLimitOrdersOfPoolMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun limitOrders(request: LimitOrdersRequest, headers: Metadata = Metadata()):
        LimitOrdersResponse = unaryRpc(
      channel,
      ApiServiceGrpc.getLimitOrdersMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the api_pb.ApiService service based on Kotlin coroutines.
   */
  abstract class ApiServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for api_pb.ApiService.Subscribe.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open fun subscribe(request: SubscribeRequest): Flow<SubscribeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Subscribe is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Halts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun halts(request: HaltsRequest): HaltsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Halts is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Genesis.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun genesis(request: Empty): GenesisResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Genesis is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.MinGasPrice.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun minGasPrice(request: Empty): MinGasPriceResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.MinGasPrice is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.NetInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun netInfo(request: Empty): NetInfoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.NetInfo is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Status.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun status(request: Empty): StatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Status is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Address.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun address(request: AddressRequest): AddressResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Address is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Addresses.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addresses(request: AddressesRequest): AddressesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Addresses is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Block.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun block(request: BlockRequest): BlockResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Block is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Candidate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun candidate(request: CandidateRequest): CandidateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Candidate is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Candidates.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun candidates(request: CandidatesRequest): CandidatesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Candidates is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.CoinInfoById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun coinInfoById(request: CoinIdRequest): CoinInfoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.CoinInfoById is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.CoinInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun coinInfo(request: CoinInfoRequest): CoinInfoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.CoinInfo is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.EstimateCoinBuy.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun estimateCoinBuy(request: EstimateCoinBuyRequest): EstimateCoinBuyResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.EstimateCoinBuy is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.EstimateCoinSell.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun estimateCoinSell(request: EstimateCoinSellRequest): EstimateCoinSellResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.EstimateCoinSell is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.EstimateCoinSellAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun estimateCoinSellAll(request: EstimateCoinSellAllRequest):
        EstimateCoinSellAllResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.EstimateCoinSellAll is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.EstimateTxCommission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun estimateTxCommission(request: EstimateTxCommissionRequest):
        EstimateTxCommissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.EstimateTxCommission is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Events.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun events(request: EventsRequest): EventsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Events is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.MaxGasPrice.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun maxGasPrice(request: MaxGasPriceRequest): MaxGasPriceResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.MaxGasPrice is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.MissedBlocks.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun missedBlocks(request: MissedBlocksRequest): MissedBlocksResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.MissedBlocks is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.SendTransaction.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun sendTransaction(request: SendTransactionRequest): SendTransactionResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.SendTransaction is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Transaction.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun transaction(request: TransactionRequest): TransactionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Transaction is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Transactions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun transactions(request: TransactionsRequest): TransactionsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Transactions is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.UnconfirmedTxs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun unconfirmedTxs(request: UnconfirmedTxsRequest): UnconfirmedTxsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.UnconfirmedTxs is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Validators.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun validators(request: ValidatorsRequest): ValidatorsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Validators is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Frozen.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun frozen(request: FrozenRequest): FrozenResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Frozen is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.WaitList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun waitList(request: WaitListRequest): WaitListResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.WaitList is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.TestBlock.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun testBlock(request: Empty): BlockResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.TestBlock is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.SwapPool.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun swapPool(request: SwapPoolRequest): SwapPoolResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.SwapPool is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.SwapPoolProvider.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun swapPoolProvider(request: SwapPoolProviderRequest): SwapPoolResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.SwapPoolProvider is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.PriceCommission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun priceCommission(request: PriceCommissionRequest): PriceCommissionResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.PriceCommission is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.VersionNetwork.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun versionNetwork(request: VersionNetworkRequest): VersionNetworkResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.VersionNetwork is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.CommissionVotes.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun commissionVotes(request: CommissionVotesRequest): CommissionVotesResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.CommissionVotes is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.UpdateVotes.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateVotes(request: UpdateVotesRequest): UpdateVotesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.UpdateVotes is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.Blocks.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun blocks(request: BlocksRequest): BlocksResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.Blocks is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.LimitOrder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun limitOrder(request: LimitOrderRequest): LimitOrderResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.LimitOrder is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.LimitOrdersOfPool.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun limitOrdersOfPool(request: LimitOrdersOfPoolRequest): LimitOrdersOfPoolResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.LimitOrdersOfPool is unimplemented"))

    /**
     * Returns the response to an RPC for api_pb.ApiService.LimitOrders.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun limitOrders(request: LimitOrdersRequest): LimitOrdersResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method api_pb.ApiService.LimitOrders is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getSubscribeMethod(),
      implementation = ::subscribe
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getHaltsMethod(),
      implementation = ::halts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getGenesisMethod(),
      implementation = ::genesis
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getMinGasPriceMethod(),
      implementation = ::minGasPrice
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getNetInfoMethod(),
      implementation = ::netInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getStatusMethod(),
      implementation = ::status
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getAddressMethod(),
      implementation = ::address
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getAddressesMethod(),
      implementation = ::addresses
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getBlockMethod(),
      implementation = ::block
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getCandidateMethod(),
      implementation = ::candidate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getCandidatesMethod(),
      implementation = ::candidates
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getCoinInfoByIdMethod(),
      implementation = ::coinInfoById
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getCoinInfoMethod(),
      implementation = ::coinInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getEstimateCoinBuyMethod(),
      implementation = ::estimateCoinBuy
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getEstimateCoinSellMethod(),
      implementation = ::estimateCoinSell
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getEstimateCoinSellAllMethod(),
      implementation = ::estimateCoinSellAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getEstimateTxCommissionMethod(),
      implementation = ::estimateTxCommission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getEventsMethod(),
      implementation = ::events
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getMaxGasPriceMethod(),
      implementation = ::maxGasPrice
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getMissedBlocksMethod(),
      implementation = ::missedBlocks
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getSendTransactionMethod(),
      implementation = ::sendTransaction
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getTransactionMethod(),
      implementation = ::transaction
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getTransactionsMethod(),
      implementation = ::transactions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getUnconfirmedTxsMethod(),
      implementation = ::unconfirmedTxs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getValidatorsMethod(),
      implementation = ::validators
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getFrozenMethod(),
      implementation = ::frozen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getWaitListMethod(),
      implementation = ::waitList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getTestBlockMethod(),
      implementation = ::testBlock
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getSwapPoolMethod(),
      implementation = ::swapPool
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getSwapPoolProviderMethod(),
      implementation = ::swapPoolProvider
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getPriceCommissionMethod(),
      implementation = ::priceCommission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getVersionNetworkMethod(),
      implementation = ::versionNetwork
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getCommissionVotesMethod(),
      implementation = ::commissionVotes
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getUpdateVotesMethod(),
      implementation = ::updateVotes
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getBlocksMethod(),
      implementation = ::blocks
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getLimitOrderMethod(),
      implementation = ::limitOrder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getLimitOrdersOfPoolMethod(),
      implementation = ::limitOrdersOfPool
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ApiServiceGrpc.getLimitOrdersMethod(),
      implementation = ::limitOrders
    )).build()
  }
}
