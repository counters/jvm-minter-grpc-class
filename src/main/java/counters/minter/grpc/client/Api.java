// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package counters.minter.grpc.client;

public final class Api {
  private Api() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tapi.proto\022\006api_pb\032\033google/protobuf/emp" +
      "ty.proto\032\017resources.proto\032\034google/api/an" +
      "notations.proto2\316\035\n\nApiService\022V\n\tSubscr" +
      "ibe\022\030.api_pb.SubscribeRequest\032\031.api_pb.S" +
      "ubscribeResponse\"\022\202\323\344\223\002\014\022\n/subscribe0\001\022M" +
      "\n\005Halts\022\024.api_pb.HaltsRequest\032\025.api_pb.H" +
      "altsResponse\"\027\202\323\344\223\002\021\022\017/halts/{height}\022L\n" +
      "\007Genesis\022\026.google.protobuf.Empty\032\027.api_p" +
      "b.GenesisResponse\"\020\202\323\344\223\002\n\022\010/genesis\022Z\n\013M" +
      "inGasPrice\022\026.google.protobuf.Empty\032\033.api" +
      "_pb.MinGasPriceResponse\"\026\202\323\344\223\002\020\022\016/min_ga" +
      "s_price\022M\n\007NetInfo\022\026.google.protobuf.Emp" +
      "ty\032\027.api_pb.NetInfoResponse\"\021\202\323\344\223\002\013\022\t/ne" +
      "t_info\022:\n\006Status\022\026.google.protobuf.Empty" +
      "\032\026.api_pb.StatusResponse\"\000\022V\n\007Address\022\026." +
      "api_pb.AddressRequest\032\027.api_pb.AddressRe" +
      "sponse\"\032\202\323\344\223\002\024\022\022/address/{address}\022T\n\tAd" +
      "dresses\022\030.api_pb.AddressesRequest\032\031.api_" +
      "pb.AddressesResponse\"\022\202\323\344\223\002\014\022\n/addresses" +
      "\022M\n\005Block\022\024.api_pb.BlockRequest\032\025.api_pb" +
      ".BlockResponse\"\027\202\323\344\223\002\021\022\017/block/{height}\022" +
      "a\n\tCandidate\022\030.api_pb.CandidateRequest\032\031" +
      ".api_pb.CandidateResponse\"\037\202\323\344\223\002\031\022\027/cand" +
      "idate/{public_key}\022X\n\nCandidates\022\031.api_p" +
      "b.CandidatesRequest\032\032.api_pb.CandidatesR" +
      "esponse\"\023\202\323\344\223\002\r\022\013/candidates\022^\n\014CoinInfo" +
      "ById\022\025.api_pb.CoinIdRequest\032\030.api_pb.Coi" +
      "nInfoResponse\"\035\202\323\344\223\002\027\022\025/coin_info_by_id/" +
      "{id}\022Z\n\010CoinInfo\022\027.api_pb.CoinInfoReques" +
      "t\032\030.api_pb.CoinInfoResponse\"\033\202\323\344\223\002\025\022\023/co" +
      "in_info/{symbol}\022n\n\017EstimateCoinBuy\022\036.ap" +
      "i_pb.EstimateCoinBuyRequest\032\037.api_pb.Est" +
      "imateCoinBuyResponse\"\032\202\323\344\223\002\024\022\022/estimate_" +
      "coin_buy\022r\n\020EstimateCoinSell\022\037.api_pb.Es" +
      "timateCoinSellRequest\032 .api_pb.EstimateC" +
      "oinSellResponse\"\033\202\323\344\223\002\025\022\023/estimate_coin_" +
      "sell\022\177\n\023EstimateCoinSellAll\022\".api_pb.Est" +
      "imateCoinSellAllRequest\032#.api_pb.Estimat" +
      "eCoinSellAllResponse\"\037\202\323\344\223\002\031\022\027/estimate_" +
      "coin_sell_all\022\207\001\n\024EstimateTxCommission\022#" +
      ".api_pb.EstimateTxCommissionRequest\032$.ap" +
      "i_pb.EstimateTxCommissionResponse\"$\202\323\344\223\002" +
      "\036\022\034/estimate_tx_commission/{tx}\022Q\n\006Event" +
      "s\022\025.api_pb.EventsRequest\032\026.api_pb.Events" +
      "Response\"\030\202\323\344\223\002\022\022\020/events/{height}\022^\n\013Ma" +
      "xGasPrice\022\032.api_pb.MaxGasPriceRequest\032\033." +
      "api_pb.MaxGasPriceResponse\"\026\202\323\344\223\002\020\022\016/max" +
      "_gas_price\022n\n\014MissedBlocks\022\033.api_pb.Miss" +
      "edBlocksRequest\032\034.api_pb.MissedBlocksRes" +
      "ponse\"#\202\323\344\223\002\035\022\033/missed_blocks/{public_ke" +
      "y}\022\212\001\n\017SendTransaction\022\036.api_pb.SendTran" +
      "sactionRequest\032\037.api_pb.SendTransactionR" +
      "esponse\"6\202\323\344\223\0020\022\026/send_transaction/{tx}Z" +
      "\026\"\021/send_transaction:\001*\022c\n\013Transaction\022\032" +
      ".api_pb.TransactionRequest\032\033.api_pb.Tran" +
      "sactionResponse\"\033\202\323\344\223\002\025\022\023/transaction/{h" +
      "ash}\022`\n\014Transactions\022\033.api_pb.Transactio" +
      "nsRequest\032\034.api_pb.TransactionsResponse\"" +
      "\025\202\323\344\223\002\017\022\r/transactions\022i\n\016UnconfirmedTxs" +
      "\022\035.api_pb.UnconfirmedTxsRequest\032\036.api_pb" +
      ".UnconfirmedTxsResponse\"\030\202\323\344\223\002\022\022\020/unconf" +
      "irmed_txs\022X\n\nValidators\022\031.api_pb.Validat" +
      "orsRequest\032\032.api_pb.ValidatorsResponse\"\023" +
      "\202\323\344\223\002\r\022\013/validators\022R\n\006Frozen\022\025.api_pb.F" +
      "rozenRequest\032\026.api_pb.FrozenResponse\"\031\202\323" +
      "\344\223\002\023\022\021/frozen/{address}\022Z\n\010WaitList\022\027.ap" +
      "i_pb.WaitListRequest\032\030.api_pb.WaitListRe" +
      "sponse\"\033\202\323\344\223\002\025\022\023/waitlist/{address}\022O\n\tT" +
      "estBlock\022\026.google.protobuf.Empty\032\025.api_p" +
      "b.BlockResponse\"\023\202\323\344\223\002\r\022\013/test/block\022a\n\010" +
      "SwapPool\022\027.api_pb.SwapPoolRequest\032\030.api_" +
      "pb.SwapPoolResponse\"\"\202\323\344\223\002\034\022\032/swap_pool/" +
      "{coin0}/{coin1}\022|\n\020SwapPoolProvider\022\037.ap" +
      "i_pb.SwapPoolProviderRequest\032\030.api_pb.Sw" +
      "apPoolResponse\"-\202\323\344\223\002\'\022%/swap_pool/{coin" +
      "0}/{coin1}/{provider}\022n\n\017PriceCommission" +
      "\022\036.api_pb.PriceCommissionRequest\032\037.api_p" +
      "b.PriceCommissionResponse\"\032\202\323\344\223\002\024\022\022/pric" +
      "e_commissions\022i\n\016VersionNetwork\022\035.api_pb" +
      ".VersionNetworkRequest\032\036.api_pb.VersionN" +
      "etworkResponse\"\030\202\323\344\223\002\022\022\020/version_network" +
      "\022~\n\017CommissionVotes\022\036.api_pb.CommissionV" +
      "otesRequest\032\037.api_pb.CommissionVotesResp" +
      "onse\"*\202\323\344\223\002$\022\"/commission_votes/{target_" +
      "version}\022n\n\013UpdateVotes\022\032.api_pb.UpdateV" +
      "otesRequest\032\033.api_pb.UpdateVotesResponse" +
      "\"&\202\323\344\223\002 \022\036/update_votes/{target_version}" +
      "\022H\n\006Blocks\022\025.api_pb.BlocksRequest\032\026.api_" +
      "pb.BlocksResponse\"\017\202\323\344\223\002\t\022\007/blocks\022d\n\nLi" +
      "mitOrder\022\031.api_pb.LimitOrderRequest\032\032.ap" +
      "i_pb.LimitOrderResponse\"\037\202\323\344\223\002\031\022\027/limit_" +
      "order/{order_id}\022\206\001\n\021LimitOrdersOfPool\022 " +
      ".api_pb.LimitOrdersOfPoolRequest\032!.api_p" +
      "b.LimitOrdersOfPoolResponse\",\202\323\344\223\002&\022$/li" +
      "mit_orders/{sell_coin}/{buy_coin}\022]\n\013Lim" +
      "itOrders\022\032.api_pb.LimitOrdersRequest\032\033.a" +
      "pi_pb.LimitOrdersResponse\"\025\202\323\344\223\002\017\022\r/limi" +
      "t_ordersBV\n\033counters.minter.grpc.clientP" +
      "\001Z5github.com/MinterTeam/node-grpc-gatew" +
      "ay/gen/go;api_pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          counters.minter.grpc.client.Resources.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    counters.minter.grpc.client.Resources.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}