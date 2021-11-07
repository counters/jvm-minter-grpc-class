package counters.minter.grpc.client;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**

@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: api.proto") */
public final class ApiServiceGrpc {

  private ApiServiceGrpc() {}

  public static final String SERVICE_NAME = "api_pb.ApiService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.SubscribeRequest,
      counters.minter.grpc.client.SubscribeResponse> METHOD_SUBSCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "api_pb.ApiService", "Subscribe"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.SubscribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.SubscribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.HaltsRequest,
      counters.minter.grpc.client.HaltsResponse> METHOD_HALTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Halts"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.HaltsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.HaltsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.GenesisResponse> METHOD_GENESIS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Genesis"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.GenesisResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.MinGasPriceResponse> METHOD_MIN_GAS_PRICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "MinGasPrice"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.MinGasPriceResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.NetInfoResponse> METHOD_NET_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "NetInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.NetInfoResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.StatusResponse> METHOD_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Status"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.StatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.AddressRequest,
      counters.minter.grpc.client.AddressResponse> METHOD_ADDRESS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Address"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.AddressRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.AddressResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.AddressesRequest,
      counters.minter.grpc.client.AddressesResponse> METHOD_ADDRESSES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Addresses"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.AddressesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.AddressesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.BlockRequest,
      counters.minter.grpc.client.BlockResponse> METHOD_BLOCK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Block"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.BlockRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.BlockResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.CandidateRequest,
      counters.minter.grpc.client.CandidateResponse> METHOD_CANDIDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Candidate"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CandidateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CandidateResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.CandidatesRequest,
      counters.minter.grpc.client.CandidatesResponse> METHOD_CANDIDATES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Candidates"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CandidatesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CandidatesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.CoinIdRequest,
      counters.minter.grpc.client.CoinInfoResponse> METHOD_COIN_INFO_BY_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "CoinInfoById"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CoinIdRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CoinInfoResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.CoinInfoRequest,
      counters.minter.grpc.client.CoinInfoResponse> METHOD_COIN_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "CoinInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CoinInfoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CoinInfoResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinBuyRequest,
      counters.minter.grpc.client.EstimateCoinBuyResponse> METHOD_ESTIMATE_COIN_BUY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "EstimateCoinBuy"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EstimateCoinBuyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EstimateCoinBuyResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinSellRequest,
      counters.minter.grpc.client.EstimateCoinSellResponse> METHOD_ESTIMATE_COIN_SELL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "EstimateCoinSell"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EstimateCoinSellRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EstimateCoinSellResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinSellAllRequest,
      counters.minter.grpc.client.EstimateCoinSellAllResponse> METHOD_ESTIMATE_COIN_SELL_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "EstimateCoinSellAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EstimateCoinSellAllRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EstimateCoinSellAllResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateTxCommissionRequest,
      counters.minter.grpc.client.EstimateTxCommissionResponse> METHOD_ESTIMATE_TX_COMMISSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "EstimateTxCommission"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EstimateTxCommissionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EstimateTxCommissionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.EventsRequest,
      counters.minter.grpc.client.EventsResponse> METHOD_EVENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Events"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EventsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.EventsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.MaxGasPriceRequest,
      counters.minter.grpc.client.MaxGasPriceResponse> METHOD_MAX_GAS_PRICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "MaxGasPrice"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.MaxGasPriceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.MaxGasPriceResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.MissedBlocksRequest,
      counters.minter.grpc.client.MissedBlocksResponse> METHOD_MISSED_BLOCKS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "MissedBlocks"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.MissedBlocksRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.MissedBlocksResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.SendTransactionRequest,
      counters.minter.grpc.client.SendTransactionResponse> METHOD_SEND_TRANSACTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "SendTransaction"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.SendTransactionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.SendTransactionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.TransactionRequest,
      counters.minter.grpc.client.TransactionResponse> METHOD_TRANSACTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Transaction"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.TransactionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.TransactionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.TransactionsRequest,
      counters.minter.grpc.client.TransactionsResponse> METHOD_TRANSACTIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Transactions"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.TransactionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.TransactionsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.UnconfirmedTxsRequest,
      counters.minter.grpc.client.UnconfirmedTxsResponse> METHOD_UNCONFIRMED_TXS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "UnconfirmedTxs"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.UnconfirmedTxsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.UnconfirmedTxsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.ValidatorsRequest,
      counters.minter.grpc.client.ValidatorsResponse> METHOD_VALIDATORS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Validators"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.ValidatorsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.ValidatorsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.FrozenRequest,
      counters.minter.grpc.client.FrozenResponse> METHOD_FROZEN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Frozen"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.FrozenRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.FrozenResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.WaitListRequest,
      counters.minter.grpc.client.WaitListResponse> METHOD_WAIT_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "WaitList"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.WaitListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.WaitListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.BlockResponse> METHOD_TEST_BLOCK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "TestBlock"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.BlockResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolRequest,
      counters.minter.grpc.client.SwapPoolResponse> METHOD_SWAP_POOL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "SwapPool"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.SwapPoolRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.SwapPoolResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolProviderRequest,
      counters.minter.grpc.client.SwapPoolResponse> METHOD_SWAP_POOL_PROVIDER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "SwapPoolProvider"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.SwapPoolProviderRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.SwapPoolResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.PriceCommissionRequest,
      counters.minter.grpc.client.PriceCommissionResponse> METHOD_PRICE_COMMISSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "PriceCommission"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.PriceCommissionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.PriceCommissionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.VersionNetworkRequest,
      counters.minter.grpc.client.VersionNetworkResponse> METHOD_VERSION_NETWORK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "VersionNetwork"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.VersionNetworkRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.VersionNetworkResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.CommissionVotesRequest,
      counters.minter.grpc.client.CommissionVotesResponse> METHOD_COMMISSION_VOTES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "CommissionVotes"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CommissionVotesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.CommissionVotesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.UpdateVotesRequest,
      counters.minter.grpc.client.UpdateVotesResponse> METHOD_UPDATE_VOTES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "UpdateVotes"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.UpdateVotesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.UpdateVotesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.BlocksRequest,
      counters.minter.grpc.client.BlocksResponse> METHOD_BLOCKS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "Blocks"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.BlocksRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.BlocksResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrderRequest,
      counters.minter.grpc.client.LimitOrderResponse> METHOD_LIMIT_ORDER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "LimitOrder"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.LimitOrderRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.LimitOrderResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrdersOfPoolRequest,
      counters.minter.grpc.client.LimitOrdersOfPoolResponse> METHOD_LIMIT_ORDERS_OF_POOL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "LimitOrdersOfPool"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.LimitOrdersOfPoolRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.LimitOrdersOfPoolResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrdersRequest,
      counters.minter.grpc.client.LimitOrdersResponse> METHOD_LIMIT_ORDERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "api_pb.ApiService", "LimitOrders"),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.LimitOrdersRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(counters.minter.grpc.client.LimitOrdersResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiServiceStub newStub(io.grpc.Channel channel) {
    return new ApiServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApiServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ApiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApiServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ApiServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Subscribe
     * 
     * Subscribe returns a subscription for events by query. Only supported in WS and gRPC methods.
     * </pre>
     */
    public void subscribe(counters.minter.grpc.client.SubscribeRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SubscribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE, responseObserver);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public void halts(counters.minter.grpc.client.HaltsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.HaltsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HALTS, responseObserver);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public void genesis(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.GenesisResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GENESIS, responseObserver);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public void minGasPrice(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MinGasPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MIN_GAS_PRICE, responseObserver);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public void netInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.NetInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NET_INFO, responseObserver);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public void status(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STATUS, responseObserver);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public void address(counters.minter.grpc.client.AddressRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADDRESS, responseObserver);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public void addresses(counters.minter.grpc.client.AddressesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADDRESSES, responseObserver);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public void block(counters.minter.grpc.client.BlockRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BLOCK, responseObserver);
    }

    /**
     * <pre>
     * Candidate
     * Candidate returns candidate’s info by provided public key.
     * {{import "fields.md"}}
     * </pre>
     */
    public void candidate(counters.minter.grpc.client.CandidateRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CandidateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANDIDATE, responseObserver);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public void candidates(counters.minter.grpc.client.CandidatesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CandidatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANDIDATES, responseObserver);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public void coinInfoById(counters.minter.grpc.client.CoinIdRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COIN_INFO_BY_ID, responseObserver);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public void coinInfo(counters.minter.grpc.client.CoinInfoRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COIN_INFO, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public void estimateCoinBuy(counters.minter.grpc.client.EstimateCoinBuyRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinBuyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ESTIMATE_COIN_BUY, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public void estimateCoinSell(counters.minter.grpc.client.EstimateCoinSellRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ESTIMATE_COIN_SELL, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public void estimateCoinSellAll(counters.minter.grpc.client.EstimateCoinSellAllRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ESTIMATE_COIN_SELL_ALL, responseObserver);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public void estimateTxCommission(counters.minter.grpc.client.EstimateTxCommissionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateTxCommissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ESTIMATE_TX_COMMISSION, responseObserver);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public void events(counters.minter.grpc.client.EventsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EVENTS, responseObserver);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public void maxGasPrice(counters.minter.grpc.client.MaxGasPriceRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MaxGasPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MAX_GAS_PRICE, responseObserver);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public void missedBlocks(counters.minter.grpc.client.MissedBlocksRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MissedBlocksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MISSED_BLOCKS, responseObserver);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public void sendTransaction(counters.minter.grpc.client.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SendTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_TRANSACTION, responseObserver);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public void transaction(counters.minter.grpc.client.TransactionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TRANSACTION, responseObserver);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public void transactions(counters.minter.grpc.client.TransactionsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TRANSACTIONS, responseObserver);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public void unconfirmedTxs(counters.minter.grpc.client.UnconfirmedTxsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.UnconfirmedTxsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UNCONFIRMED_TXS, responseObserver);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public void validators(counters.minter.grpc.client.ValidatorsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.ValidatorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VALIDATORS, responseObserver);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * </pre>
     */
    public void frozen(counters.minter.grpc.client.FrozenRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.FrozenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FROZEN, responseObserver);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public void waitList(counters.minter.grpc.client.WaitListRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.WaitListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_WAIT_LIST, responseObserver);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public void testBlock(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TEST_BLOCK, responseObserver);
    }

    /**
     * <pre>
     * SwapPool
     * </pre>
     */
    public void swapPool(counters.minter.grpc.client.SwapPoolRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SWAP_POOL, responseObserver);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * </pre>
     */
    public void swapPoolProvider(counters.minter.grpc.client.SwapPoolProviderRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SWAP_POOL_PROVIDER, responseObserver);
    }

    /**
     * <pre>
     * PriceCommission
     * </pre>
     */
    public void priceCommission(counters.minter.grpc.client.PriceCommissionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.PriceCommissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PRICE_COMMISSION, responseObserver);
    }

    /**
     * <pre>
     * VersionNetwork
     * </pre>
     */
    public void versionNetwork(counters.minter.grpc.client.VersionNetworkRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.VersionNetworkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VERSION_NETWORK, responseObserver);
    }

    /**
     * <pre>
     * CommissionVotes
     * </pre>
     */
    public void commissionVotes(counters.minter.grpc.client.CommissionVotesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CommissionVotesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMMISSION_VOTES, responseObserver);
    }

    /**
     * <pre>
     * UpdateVotes
     * </pre>
     */
    public void updateVotes(counters.minter.grpc.client.UpdateVotesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.UpdateVotesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_VOTES, responseObserver);
    }

    /**
     * <pre>
     * Blocks
     * </pre>
     */
    public void blocks(counters.minter.grpc.client.BlocksRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlocksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BLOCKS, responseObserver);
    }

    /**
     * <pre>
     * LimitOrder
     * </pre>
     */
    public void limitOrder(counters.minter.grpc.client.LimitOrderRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIMIT_ORDER, responseObserver);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * </pre>
     */
    public void limitOrdersOfPool(counters.minter.grpc.client.LimitOrdersOfPoolRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersOfPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIMIT_ORDERS_OF_POOL, responseObserver);
    }

    /**
     * <pre>
     * LimitOrders
     * </pre>
     */
    public void limitOrders(counters.minter.grpc.client.LimitOrdersRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIMIT_ORDERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SUBSCRIBE,
            asyncServerStreamingCall(
              new MethodHandlers<
                counters.minter.grpc.client.SubscribeRequest,
                counters.minter.grpc.client.SubscribeResponse>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            METHOD_HALTS,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.HaltsRequest,
                counters.minter.grpc.client.HaltsResponse>(
                  this, METHODID_HALTS)))
          .addMethod(
            METHOD_GENESIS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.GenesisResponse>(
                  this, METHODID_GENESIS)))
          .addMethod(
            METHOD_MIN_GAS_PRICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.MinGasPriceResponse>(
                  this, METHODID_MIN_GAS_PRICE)))
          .addMethod(
            METHOD_NET_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.NetInfoResponse>(
                  this, METHODID_NET_INFO)))
          .addMethod(
            METHOD_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.StatusResponse>(
                  this, METHODID_STATUS)))
          .addMethod(
            METHOD_ADDRESS,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.AddressRequest,
                counters.minter.grpc.client.AddressResponse>(
                  this, METHODID_ADDRESS)))
          .addMethod(
            METHOD_ADDRESSES,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.AddressesRequest,
                counters.minter.grpc.client.AddressesResponse>(
                  this, METHODID_ADDRESSES)))
          .addMethod(
            METHOD_BLOCK,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.BlockRequest,
                counters.minter.grpc.client.BlockResponse>(
                  this, METHODID_BLOCK)))
          .addMethod(
            METHOD_CANDIDATE,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CandidateRequest,
                counters.minter.grpc.client.CandidateResponse>(
                  this, METHODID_CANDIDATE)))
          .addMethod(
            METHOD_CANDIDATES,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CandidatesRequest,
                counters.minter.grpc.client.CandidatesResponse>(
                  this, METHODID_CANDIDATES)))
          .addMethod(
            METHOD_COIN_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CoinIdRequest,
                counters.minter.grpc.client.CoinInfoResponse>(
                  this, METHODID_COIN_INFO_BY_ID)))
          .addMethod(
            METHOD_COIN_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CoinInfoRequest,
                counters.minter.grpc.client.CoinInfoResponse>(
                  this, METHODID_COIN_INFO)))
          .addMethod(
            METHOD_ESTIMATE_COIN_BUY,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EstimateCoinBuyRequest,
                counters.minter.grpc.client.EstimateCoinBuyResponse>(
                  this, METHODID_ESTIMATE_COIN_BUY)))
          .addMethod(
            METHOD_ESTIMATE_COIN_SELL,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EstimateCoinSellRequest,
                counters.minter.grpc.client.EstimateCoinSellResponse>(
                  this, METHODID_ESTIMATE_COIN_SELL)))
          .addMethod(
            METHOD_ESTIMATE_COIN_SELL_ALL,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EstimateCoinSellAllRequest,
                counters.minter.grpc.client.EstimateCoinSellAllResponse>(
                  this, METHODID_ESTIMATE_COIN_SELL_ALL)))
          .addMethod(
            METHOD_ESTIMATE_TX_COMMISSION,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EstimateTxCommissionRequest,
                counters.minter.grpc.client.EstimateTxCommissionResponse>(
                  this, METHODID_ESTIMATE_TX_COMMISSION)))
          .addMethod(
            METHOD_EVENTS,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EventsRequest,
                counters.minter.grpc.client.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            METHOD_MAX_GAS_PRICE,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.MaxGasPriceRequest,
                counters.minter.grpc.client.MaxGasPriceResponse>(
                  this, METHODID_MAX_GAS_PRICE)))
          .addMethod(
            METHOD_MISSED_BLOCKS,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.MissedBlocksRequest,
                counters.minter.grpc.client.MissedBlocksResponse>(
                  this, METHODID_MISSED_BLOCKS)))
          .addMethod(
            METHOD_SEND_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.SendTransactionRequest,
                counters.minter.grpc.client.SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            METHOD_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.TransactionRequest,
                counters.minter.grpc.client.TransactionResponse>(
                  this, METHODID_TRANSACTION)))
          .addMethod(
            METHOD_TRANSACTIONS,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.TransactionsRequest,
                counters.minter.grpc.client.TransactionsResponse>(
                  this, METHODID_TRANSACTIONS)))
          .addMethod(
            METHOD_UNCONFIRMED_TXS,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.UnconfirmedTxsRequest,
                counters.minter.grpc.client.UnconfirmedTxsResponse>(
                  this, METHODID_UNCONFIRMED_TXS)))
          .addMethod(
            METHOD_VALIDATORS,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.ValidatorsRequest,
                counters.minter.grpc.client.ValidatorsResponse>(
                  this, METHODID_VALIDATORS)))
          .addMethod(
            METHOD_FROZEN,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.FrozenRequest,
                counters.minter.grpc.client.FrozenResponse>(
                  this, METHODID_FROZEN)))
          .addMethod(
            METHOD_WAIT_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.WaitListRequest,
                counters.minter.grpc.client.WaitListResponse>(
                  this, METHODID_WAIT_LIST)))
          .addMethod(
            METHOD_TEST_BLOCK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.BlockResponse>(
                  this, METHODID_TEST_BLOCK)))
          .addMethod(
            METHOD_SWAP_POOL,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.SwapPoolRequest,
                counters.minter.grpc.client.SwapPoolResponse>(
                  this, METHODID_SWAP_POOL)))
          .addMethod(
            METHOD_SWAP_POOL_PROVIDER,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.SwapPoolProviderRequest,
                counters.minter.grpc.client.SwapPoolResponse>(
                  this, METHODID_SWAP_POOL_PROVIDER)))
          .addMethod(
            METHOD_PRICE_COMMISSION,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.PriceCommissionRequest,
                counters.minter.grpc.client.PriceCommissionResponse>(
                  this, METHODID_PRICE_COMMISSION)))
          .addMethod(
            METHOD_VERSION_NETWORK,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.VersionNetworkRequest,
                counters.minter.grpc.client.VersionNetworkResponse>(
                  this, METHODID_VERSION_NETWORK)))
          .addMethod(
            METHOD_COMMISSION_VOTES,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CommissionVotesRequest,
                counters.minter.grpc.client.CommissionVotesResponse>(
                  this, METHODID_COMMISSION_VOTES)))
          .addMethod(
            METHOD_UPDATE_VOTES,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.UpdateVotesRequest,
                counters.minter.grpc.client.UpdateVotesResponse>(
                  this, METHODID_UPDATE_VOTES)))
          .addMethod(
            METHOD_BLOCKS,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.BlocksRequest,
                counters.minter.grpc.client.BlocksResponse>(
                  this, METHODID_BLOCKS)))
          .addMethod(
            METHOD_LIMIT_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.LimitOrderRequest,
                counters.minter.grpc.client.LimitOrderResponse>(
                  this, METHODID_LIMIT_ORDER)))
          .addMethod(
            METHOD_LIMIT_ORDERS_OF_POOL,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.LimitOrdersOfPoolRequest,
                counters.minter.grpc.client.LimitOrdersOfPoolResponse>(
                  this, METHODID_LIMIT_ORDERS_OF_POOL)))
          .addMethod(
            METHOD_LIMIT_ORDERS,
            asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.LimitOrdersRequest,
                counters.minter.grpc.client.LimitOrdersResponse>(
                  this, METHODID_LIMIT_ORDERS)))
          .build();
    }
  }

  /**
   */
  public static final class ApiServiceStub extends io.grpc.stub.AbstractStub<ApiServiceStub> {
    private ApiServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe
     * 
     * Subscribe returns a subscription for events by query. Only supported in WS and gRPC methods.
     * </pre>
     */
    public void subscribe(counters.minter.grpc.client.SubscribeRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SubscribeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SUBSCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public void halts(counters.minter.grpc.client.HaltsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.HaltsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HALTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public void genesis(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.GenesisResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GENESIS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public void minGasPrice(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MinGasPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MIN_GAS_PRICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public void netInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.NetInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NET_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public void status(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_STATUS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public void address(counters.minter.grpc.client.AddressRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADDRESS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public void addresses(counters.minter.grpc.client.AddressesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADDRESSES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public void block(counters.minter.grpc.client.BlockRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BLOCK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Candidate
     * Candidate returns candidate’s info by provided public key.
     * {{import "fields.md"}}
     * </pre>
     */
    public void candidate(counters.minter.grpc.client.CandidateRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CandidateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANDIDATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public void candidates(counters.minter.grpc.client.CandidatesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CandidatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANDIDATES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public void coinInfoById(counters.minter.grpc.client.CoinIdRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COIN_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public void coinInfo(counters.minter.grpc.client.CoinInfoRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COIN_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public void estimateCoinBuy(counters.minter.grpc.client.EstimateCoinBuyRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinBuyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ESTIMATE_COIN_BUY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public void estimateCoinSell(counters.minter.grpc.client.EstimateCoinSellRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ESTIMATE_COIN_SELL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public void estimateCoinSellAll(counters.minter.grpc.client.EstimateCoinSellAllRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ESTIMATE_COIN_SELL_ALL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public void estimateTxCommission(counters.minter.grpc.client.EstimateTxCommissionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateTxCommissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ESTIMATE_TX_COMMISSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public void events(counters.minter.grpc.client.EventsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EVENTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public void maxGasPrice(counters.minter.grpc.client.MaxGasPriceRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MaxGasPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MAX_GAS_PRICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public void missedBlocks(counters.minter.grpc.client.MissedBlocksRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MissedBlocksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MISSED_BLOCKS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public void sendTransaction(counters.minter.grpc.client.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SendTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public void transaction(counters.minter.grpc.client.TransactionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public void transactions(counters.minter.grpc.client.TransactionsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TRANSACTIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public void unconfirmedTxs(counters.minter.grpc.client.UnconfirmedTxsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.UnconfirmedTxsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UNCONFIRMED_TXS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public void validators(counters.minter.grpc.client.ValidatorsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.ValidatorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VALIDATORS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * </pre>
     */
    public void frozen(counters.minter.grpc.client.FrozenRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.FrozenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FROZEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public void waitList(counters.minter.grpc.client.WaitListRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.WaitListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_WAIT_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public void testBlock(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TEST_BLOCK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapPool
     * </pre>
     */
    public void swapPool(counters.minter.grpc.client.SwapPoolRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SWAP_POOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * </pre>
     */
    public void swapPoolProvider(counters.minter.grpc.client.SwapPoolProviderRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SWAP_POOL_PROVIDER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PriceCommission
     * </pre>
     */
    public void priceCommission(counters.minter.grpc.client.PriceCommissionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.PriceCommissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PRICE_COMMISSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VersionNetwork
     * </pre>
     */
    public void versionNetwork(counters.minter.grpc.client.VersionNetworkRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.VersionNetworkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VERSION_NETWORK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CommissionVotes
     * </pre>
     */
    public void commissionVotes(counters.minter.grpc.client.CommissionVotesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CommissionVotesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMMISSION_VOTES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateVotes
     * </pre>
     */
    public void updateVotes(counters.minter.grpc.client.UpdateVotesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.UpdateVotesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VOTES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Blocks
     * </pre>
     */
    public void blocks(counters.minter.grpc.client.BlocksRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlocksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BLOCKS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrder
     * </pre>
     */
    public void limitOrder(counters.minter.grpc.client.LimitOrderRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIMIT_ORDER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * </pre>
     */
    public void limitOrdersOfPool(counters.minter.grpc.client.LimitOrdersOfPoolRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersOfPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIMIT_ORDERS_OF_POOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrders
     * </pre>
     */
    public void limitOrders(counters.minter.grpc.client.LimitOrdersRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIMIT_ORDERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ApiServiceBlockingStub extends io.grpc.stub.AbstractStub<ApiServiceBlockingStub> {
    private ApiServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe
     * 
     * Subscribe returns a subscription for events by query. Only supported in WS and gRPC methods.
     * </pre>
     */
    public java.util.Iterator<counters.minter.grpc.client.SubscribeResponse> subscribe(
        counters.minter.grpc.client.SubscribeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SUBSCRIBE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public counters.minter.grpc.client.HaltsResponse halts(counters.minter.grpc.client.HaltsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HALTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public counters.minter.grpc.client.GenesisResponse genesis(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GENESIS, getCallOptions(), request);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public counters.minter.grpc.client.MinGasPriceResponse minGasPrice(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MIN_GAS_PRICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public counters.minter.grpc.client.NetInfoResponse netInfo(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NET_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public counters.minter.grpc.client.StatusResponse status(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_STATUS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public counters.minter.grpc.client.AddressResponse address(counters.minter.grpc.client.AddressRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADDRESS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public counters.minter.grpc.client.AddressesResponse addresses(counters.minter.grpc.client.AddressesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADDRESSES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public counters.minter.grpc.client.BlockResponse block(counters.minter.grpc.client.BlockRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BLOCK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Candidate
     * Candidate returns candidate’s info by provided public key.
     * {{import "fields.md"}}
     * </pre>
     */
    public counters.minter.grpc.client.CandidateResponse candidate(counters.minter.grpc.client.CandidateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANDIDATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public counters.minter.grpc.client.CandidatesResponse candidates(counters.minter.grpc.client.CandidatesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANDIDATES, getCallOptions(), request);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public counters.minter.grpc.client.CoinInfoResponse coinInfoById(counters.minter.grpc.client.CoinIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COIN_INFO_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public counters.minter.grpc.client.CoinInfoResponse coinInfo(counters.minter.grpc.client.CoinInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COIN_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public counters.minter.grpc.client.EstimateCoinBuyResponse estimateCoinBuy(counters.minter.grpc.client.EstimateCoinBuyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ESTIMATE_COIN_BUY, getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public counters.minter.grpc.client.EstimateCoinSellResponse estimateCoinSell(counters.minter.grpc.client.EstimateCoinSellRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ESTIMATE_COIN_SELL, getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public counters.minter.grpc.client.EstimateCoinSellAllResponse estimateCoinSellAll(counters.minter.grpc.client.EstimateCoinSellAllRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ESTIMATE_COIN_SELL_ALL, getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public counters.minter.grpc.client.EstimateTxCommissionResponse estimateTxCommission(counters.minter.grpc.client.EstimateTxCommissionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ESTIMATE_TX_COMMISSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public counters.minter.grpc.client.EventsResponse events(counters.minter.grpc.client.EventsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EVENTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public counters.minter.grpc.client.MaxGasPriceResponse maxGasPrice(counters.minter.grpc.client.MaxGasPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MAX_GAS_PRICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public counters.minter.grpc.client.MissedBlocksResponse missedBlocks(counters.minter.grpc.client.MissedBlocksRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MISSED_BLOCKS, getCallOptions(), request);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public counters.minter.grpc.client.SendTransactionResponse sendTransaction(counters.minter.grpc.client.SendTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_TRANSACTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public counters.minter.grpc.client.TransactionResponse transaction(counters.minter.grpc.client.TransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TRANSACTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public counters.minter.grpc.client.TransactionsResponse transactions(counters.minter.grpc.client.TransactionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TRANSACTIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public counters.minter.grpc.client.UnconfirmedTxsResponse unconfirmedTxs(counters.minter.grpc.client.UnconfirmedTxsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UNCONFIRMED_TXS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public counters.minter.grpc.client.ValidatorsResponse validators(counters.minter.grpc.client.ValidatorsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VALIDATORS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * </pre>
     */
    public counters.minter.grpc.client.FrozenResponse frozen(counters.minter.grpc.client.FrozenRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FROZEN, getCallOptions(), request);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public counters.minter.grpc.client.WaitListResponse waitList(counters.minter.grpc.client.WaitListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_WAIT_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public counters.minter.grpc.client.BlockResponse testBlock(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TEST_BLOCK, getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapPool
     * </pre>
     */
    public counters.minter.grpc.client.SwapPoolResponse swapPool(counters.minter.grpc.client.SwapPoolRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SWAP_POOL, getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * </pre>
     */
    public counters.minter.grpc.client.SwapPoolResponse swapPoolProvider(counters.minter.grpc.client.SwapPoolProviderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SWAP_POOL_PROVIDER, getCallOptions(), request);
    }

    /**
     * <pre>
     * PriceCommission
     * </pre>
     */
    public counters.minter.grpc.client.PriceCommissionResponse priceCommission(counters.minter.grpc.client.PriceCommissionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PRICE_COMMISSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * VersionNetwork
     * </pre>
     */
    public counters.minter.grpc.client.VersionNetworkResponse versionNetwork(counters.minter.grpc.client.VersionNetworkRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VERSION_NETWORK, getCallOptions(), request);
    }

    /**
     * <pre>
     * CommissionVotes
     * </pre>
     */
    public counters.minter.grpc.client.CommissionVotesResponse commissionVotes(counters.minter.grpc.client.CommissionVotesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMMISSION_VOTES, getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateVotes
     * </pre>
     */
    public counters.minter.grpc.client.UpdateVotesResponse updateVotes(counters.minter.grpc.client.UpdateVotesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_VOTES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Blocks
     * </pre>
     */
    public counters.minter.grpc.client.BlocksResponse blocks(counters.minter.grpc.client.BlocksRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BLOCKS, getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrder
     * </pre>
     */
    public counters.minter.grpc.client.LimitOrderResponse limitOrder(counters.minter.grpc.client.LimitOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIMIT_ORDER, getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * </pre>
     */
    public counters.minter.grpc.client.LimitOrdersOfPoolResponse limitOrdersOfPool(counters.minter.grpc.client.LimitOrdersOfPoolRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIMIT_ORDERS_OF_POOL, getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrders
     * </pre>
     */
    public counters.minter.grpc.client.LimitOrdersResponse limitOrders(counters.minter.grpc.client.LimitOrdersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIMIT_ORDERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ApiServiceFutureStub extends io.grpc.stub.AbstractStub<ApiServiceFutureStub> {
    private ApiServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.HaltsResponse> halts(
        counters.minter.grpc.client.HaltsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HALTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.GenesisResponse> genesis(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GENESIS, getCallOptions()), request);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.MinGasPriceResponse> minGasPrice(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MIN_GAS_PRICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.NetInfoResponse> netInfo(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NET_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.StatusResponse> status(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_STATUS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.AddressResponse> address(
        counters.minter.grpc.client.AddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADDRESS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.AddressesResponse> addresses(
        counters.minter.grpc.client.AddressesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADDRESSES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.BlockResponse> block(
        counters.minter.grpc.client.BlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BLOCK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Candidate
     * Candidate returns candidate’s info by provided public key.
     * {{import "fields.md"}}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CandidateResponse> candidate(
        counters.minter.grpc.client.CandidateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANDIDATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CandidatesResponse> candidates(
        counters.minter.grpc.client.CandidatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANDIDATES, getCallOptions()), request);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CoinInfoResponse> coinInfoById(
        counters.minter.grpc.client.CoinIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COIN_INFO_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CoinInfoResponse> coinInfo(
        counters.minter.grpc.client.CoinInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COIN_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EstimateCoinBuyResponse> estimateCoinBuy(
        counters.minter.grpc.client.EstimateCoinBuyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ESTIMATE_COIN_BUY, getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EstimateCoinSellResponse> estimateCoinSell(
        counters.minter.grpc.client.EstimateCoinSellRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ESTIMATE_COIN_SELL, getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EstimateCoinSellAllResponse> estimateCoinSellAll(
        counters.minter.grpc.client.EstimateCoinSellAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ESTIMATE_COIN_SELL_ALL, getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EstimateTxCommissionResponse> estimateTxCommission(
        counters.minter.grpc.client.EstimateTxCommissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ESTIMATE_TX_COMMISSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EventsResponse> events(
        counters.minter.grpc.client.EventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EVENTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.MaxGasPriceResponse> maxGasPrice(
        counters.minter.grpc.client.MaxGasPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MAX_GAS_PRICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.MissedBlocksResponse> missedBlocks(
        counters.minter.grpc.client.MissedBlocksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MISSED_BLOCKS, getCallOptions()), request);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.SendTransactionResponse> sendTransaction(
        counters.minter.grpc.client.SendTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_TRANSACTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.TransactionResponse> transaction(
        counters.minter.grpc.client.TransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TRANSACTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.TransactionsResponse> transactions(
        counters.minter.grpc.client.TransactionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TRANSACTIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.UnconfirmedTxsResponse> unconfirmedTxs(
        counters.minter.grpc.client.UnconfirmedTxsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UNCONFIRMED_TXS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.ValidatorsResponse> validators(
        counters.minter.grpc.client.ValidatorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VALIDATORS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.FrozenResponse> frozen(
        counters.minter.grpc.client.FrozenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FROZEN, getCallOptions()), request);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.WaitListResponse> waitList(
        counters.minter.grpc.client.WaitListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_WAIT_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.BlockResponse> testBlock(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TEST_BLOCK, getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapPool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.SwapPoolResponse> swapPool(
        counters.minter.grpc.client.SwapPoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SWAP_POOL, getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.SwapPoolResponse> swapPoolProvider(
        counters.minter.grpc.client.SwapPoolProviderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SWAP_POOL_PROVIDER, getCallOptions()), request);
    }

    /**
     * <pre>
     * PriceCommission
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.PriceCommissionResponse> priceCommission(
        counters.minter.grpc.client.PriceCommissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PRICE_COMMISSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * VersionNetwork
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.VersionNetworkResponse> versionNetwork(
        counters.minter.grpc.client.VersionNetworkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VERSION_NETWORK, getCallOptions()), request);
    }

    /**
     * <pre>
     * CommissionVotes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CommissionVotesResponse> commissionVotes(
        counters.minter.grpc.client.CommissionVotesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMMISSION_VOTES, getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateVotes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.UpdateVotesResponse> updateVotes(
        counters.minter.grpc.client.UpdateVotesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VOTES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Blocks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.BlocksResponse> blocks(
        counters.minter.grpc.client.BlocksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BLOCKS, getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.LimitOrderResponse> limitOrder(
        counters.minter.grpc.client.LimitOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIMIT_ORDER, getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.LimitOrdersOfPoolResponse> limitOrdersOfPool(
        counters.minter.grpc.client.LimitOrdersOfPoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIMIT_ORDERS_OF_POOL, getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.LimitOrdersResponse> limitOrders(
        counters.minter.grpc.client.LimitOrdersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIMIT_ORDERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;
  private static final int METHODID_HALTS = 1;
  private static final int METHODID_GENESIS = 2;
  private static final int METHODID_MIN_GAS_PRICE = 3;
  private static final int METHODID_NET_INFO = 4;
  private static final int METHODID_STATUS = 5;
  private static final int METHODID_ADDRESS = 6;
  private static final int METHODID_ADDRESSES = 7;
  private static final int METHODID_BLOCK = 8;
  private static final int METHODID_CANDIDATE = 9;
  private static final int METHODID_CANDIDATES = 10;
  private static final int METHODID_COIN_INFO_BY_ID = 11;
  private static final int METHODID_COIN_INFO = 12;
  private static final int METHODID_ESTIMATE_COIN_BUY = 13;
  private static final int METHODID_ESTIMATE_COIN_SELL = 14;
  private static final int METHODID_ESTIMATE_COIN_SELL_ALL = 15;
  private static final int METHODID_ESTIMATE_TX_COMMISSION = 16;
  private static final int METHODID_EVENTS = 17;
  private static final int METHODID_MAX_GAS_PRICE = 18;
  private static final int METHODID_MISSED_BLOCKS = 19;
  private static final int METHODID_SEND_TRANSACTION = 20;
  private static final int METHODID_TRANSACTION = 21;
  private static final int METHODID_TRANSACTIONS = 22;
  private static final int METHODID_UNCONFIRMED_TXS = 23;
  private static final int METHODID_VALIDATORS = 24;
  private static final int METHODID_FROZEN = 25;
  private static final int METHODID_WAIT_LIST = 26;
  private static final int METHODID_TEST_BLOCK = 27;
  private static final int METHODID_SWAP_POOL = 28;
  private static final int METHODID_SWAP_POOL_PROVIDER = 29;
  private static final int METHODID_PRICE_COMMISSION = 30;
  private static final int METHODID_VERSION_NETWORK = 31;
  private static final int METHODID_COMMISSION_VOTES = 32;
  private static final int METHODID_UPDATE_VOTES = 33;
  private static final int METHODID_BLOCKS = 34;
  private static final int METHODID_LIMIT_ORDER = 35;
  private static final int METHODID_LIMIT_ORDERS_OF_POOL = 36;
  private static final int METHODID_LIMIT_ORDERS = 37;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApiServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApiServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((counters.minter.grpc.client.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.SubscribeResponse>) responseObserver);
          break;
        case METHODID_HALTS:
          serviceImpl.halts((counters.minter.grpc.client.HaltsRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.HaltsResponse>) responseObserver);
          break;
        case METHODID_GENESIS:
          serviceImpl.genesis((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.GenesisResponse>) responseObserver);
          break;
        case METHODID_MIN_GAS_PRICE:
          serviceImpl.minGasPrice((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.MinGasPriceResponse>) responseObserver);
          break;
        case METHODID_NET_INFO:
          serviceImpl.netInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.NetInfoResponse>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.StatusResponse>) responseObserver);
          break;
        case METHODID_ADDRESS:
          serviceImpl.address((counters.minter.grpc.client.AddressRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressResponse>) responseObserver);
          break;
        case METHODID_ADDRESSES:
          serviceImpl.addresses((counters.minter.grpc.client.AddressesRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressesResponse>) responseObserver);
          break;
        case METHODID_BLOCK:
          serviceImpl.block((counters.minter.grpc.client.BlockRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse>) responseObserver);
          break;
        case METHODID_CANDIDATE:
          serviceImpl.candidate((counters.minter.grpc.client.CandidateRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.CandidateResponse>) responseObserver);
          break;
        case METHODID_CANDIDATES:
          serviceImpl.candidates((counters.minter.grpc.client.CandidatesRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.CandidatesResponse>) responseObserver);
          break;
        case METHODID_COIN_INFO_BY_ID:
          serviceImpl.coinInfoById((counters.minter.grpc.client.CoinIdRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse>) responseObserver);
          break;
        case METHODID_COIN_INFO:
          serviceImpl.coinInfo((counters.minter.grpc.client.CoinInfoRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_COIN_BUY:
          serviceImpl.estimateCoinBuy((counters.minter.grpc.client.EstimateCoinBuyRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinBuyResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_COIN_SELL:
          serviceImpl.estimateCoinSell((counters.minter.grpc.client.EstimateCoinSellRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_COIN_SELL_ALL:
          serviceImpl.estimateCoinSellAll((counters.minter.grpc.client.EstimateCoinSellAllRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellAllResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_TX_COMMISSION:
          serviceImpl.estimateTxCommission((counters.minter.grpc.client.EstimateTxCommissionRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateTxCommissionResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((counters.minter.grpc.client.EventsRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.EventsResponse>) responseObserver);
          break;
        case METHODID_MAX_GAS_PRICE:
          serviceImpl.maxGasPrice((counters.minter.grpc.client.MaxGasPriceRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.MaxGasPriceResponse>) responseObserver);
          break;
        case METHODID_MISSED_BLOCKS:
          serviceImpl.missedBlocks((counters.minter.grpc.client.MissedBlocksRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.MissedBlocksResponse>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((counters.minter.grpc.client.SendTransactionRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.SendTransactionResponse>) responseObserver);
          break;
        case METHODID_TRANSACTION:
          serviceImpl.transaction((counters.minter.grpc.client.TransactionRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionResponse>) responseObserver);
          break;
        case METHODID_TRANSACTIONS:
          serviceImpl.transactions((counters.minter.grpc.client.TransactionsRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionsResponse>) responseObserver);
          break;
        case METHODID_UNCONFIRMED_TXS:
          serviceImpl.unconfirmedTxs((counters.minter.grpc.client.UnconfirmedTxsRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.UnconfirmedTxsResponse>) responseObserver);
          break;
        case METHODID_VALIDATORS:
          serviceImpl.validators((counters.minter.grpc.client.ValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.ValidatorsResponse>) responseObserver);
          break;
        case METHODID_FROZEN:
          serviceImpl.frozen((counters.minter.grpc.client.FrozenRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.FrozenResponse>) responseObserver);
          break;
        case METHODID_WAIT_LIST:
          serviceImpl.waitList((counters.minter.grpc.client.WaitListRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.WaitListResponse>) responseObserver);
          break;
        case METHODID_TEST_BLOCK:
          serviceImpl.testBlock((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse>) responseObserver);
          break;
        case METHODID_SWAP_POOL:
          serviceImpl.swapPool((counters.minter.grpc.client.SwapPoolRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse>) responseObserver);
          break;
        case METHODID_SWAP_POOL_PROVIDER:
          serviceImpl.swapPoolProvider((counters.minter.grpc.client.SwapPoolProviderRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse>) responseObserver);
          break;
        case METHODID_PRICE_COMMISSION:
          serviceImpl.priceCommission((counters.minter.grpc.client.PriceCommissionRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.PriceCommissionResponse>) responseObserver);
          break;
        case METHODID_VERSION_NETWORK:
          serviceImpl.versionNetwork((counters.minter.grpc.client.VersionNetworkRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.VersionNetworkResponse>) responseObserver);
          break;
        case METHODID_COMMISSION_VOTES:
          serviceImpl.commissionVotes((counters.minter.grpc.client.CommissionVotesRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.CommissionVotesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VOTES:
          serviceImpl.updateVotes((counters.minter.grpc.client.UpdateVotesRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.UpdateVotesResponse>) responseObserver);
          break;
        case METHODID_BLOCKS:
          serviceImpl.blocks((counters.minter.grpc.client.BlocksRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlocksResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDER:
          serviceImpl.limitOrder((counters.minter.grpc.client.LimitOrderRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrderResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDERS_OF_POOL:
          serviceImpl.limitOrdersOfPool((counters.minter.grpc.client.LimitOrdersOfPoolRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersOfPoolResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDERS:
          serviceImpl.limitOrders((counters.minter.grpc.client.LimitOrdersRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class ApiServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return counters.minter.grpc.client.Api.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ApiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiServiceDescriptorSupplier())
              .addMethod(METHOD_SUBSCRIBE)
              .addMethod(METHOD_HALTS)
              .addMethod(METHOD_GENESIS)
              .addMethod(METHOD_MIN_GAS_PRICE)
              .addMethod(METHOD_NET_INFO)
              .addMethod(METHOD_STATUS)
              .addMethod(METHOD_ADDRESS)
              .addMethod(METHOD_ADDRESSES)
              .addMethod(METHOD_BLOCK)
              .addMethod(METHOD_CANDIDATE)
              .addMethod(METHOD_CANDIDATES)
              .addMethod(METHOD_COIN_INFO_BY_ID)
              .addMethod(METHOD_COIN_INFO)
              .addMethod(METHOD_ESTIMATE_COIN_BUY)
              .addMethod(METHOD_ESTIMATE_COIN_SELL)
              .addMethod(METHOD_ESTIMATE_COIN_SELL_ALL)
              .addMethod(METHOD_ESTIMATE_TX_COMMISSION)
              .addMethod(METHOD_EVENTS)
              .addMethod(METHOD_MAX_GAS_PRICE)
              .addMethod(METHOD_MISSED_BLOCKS)
              .addMethod(METHOD_SEND_TRANSACTION)
              .addMethod(METHOD_TRANSACTION)
              .addMethod(METHOD_TRANSACTIONS)
              .addMethod(METHOD_UNCONFIRMED_TXS)
              .addMethod(METHOD_VALIDATORS)
              .addMethod(METHOD_FROZEN)
              .addMethod(METHOD_WAIT_LIST)
              .addMethod(METHOD_TEST_BLOCK)
              .addMethod(METHOD_SWAP_POOL)
              .addMethod(METHOD_SWAP_POOL_PROVIDER)
              .addMethod(METHOD_PRICE_COMMISSION)
              .addMethod(METHOD_VERSION_NETWORK)
              .addMethod(METHOD_COMMISSION_VOTES)
              .addMethod(METHOD_UPDATE_VOTES)
              .addMethod(METHOD_BLOCKS)
              .addMethod(METHOD_LIMIT_ORDER)
              .addMethod(METHOD_LIMIT_ORDERS_OF_POOL)
              .addMethod(METHOD_LIMIT_ORDERS)
              .build();
        }
      }
    }
    return result;
  }
}
