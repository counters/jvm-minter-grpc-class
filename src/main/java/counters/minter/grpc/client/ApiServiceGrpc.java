package counters.minter.grpc.client;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApiServiceGrpc {

  private ApiServiceGrpc() {}

  public static final String SERVICE_NAME = "api_pb.ApiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SubscribeRequest,
      SubscribeResponse> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = SubscribeRequest.class,
      responseType = SubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SubscribeRequest,
      SubscribeResponse> getSubscribeMethod() {
    io.grpc.MethodDescriptor<SubscribeRequest, SubscribeResponse> getSubscribeMethod;
    if ((getSubscribeMethod = ApiServiceGrpc.getSubscribeMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSubscribeMethod = ApiServiceGrpc.getSubscribeMethod) == null) {
          ApiServiceGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<SubscribeRequest, SubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HaltsRequest,
      HaltsResponse> getHaltsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Halts",
      requestType = HaltsRequest.class,
      responseType = HaltsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HaltsRequest,
      HaltsResponse> getHaltsMethod() {
    io.grpc.MethodDescriptor<HaltsRequest, HaltsResponse> getHaltsMethod;
    if ((getHaltsMethod = ApiServiceGrpc.getHaltsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getHaltsMethod = ApiServiceGrpc.getHaltsMethod) == null) {
          ApiServiceGrpc.getHaltsMethod = getHaltsMethod =
              io.grpc.MethodDescriptor.<HaltsRequest, HaltsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HaltsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HaltsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Halts"))
              .build();
        }
      }
    }
    return getHaltsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      GenesisResponse> getGenesisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Genesis",
      requestType = com.google.protobuf.Empty.class,
      responseType = GenesisResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      GenesisResponse> getGenesisMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, GenesisResponse> getGenesisMethod;
    if ((getGenesisMethod = ApiServiceGrpc.getGenesisMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGenesisMethod = ApiServiceGrpc.getGenesisMethod) == null) {
          ApiServiceGrpc.getGenesisMethod = getGenesisMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, GenesisResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Genesis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GenesisResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Genesis"))
              .build();
        }
      }
    }
    return getGenesisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      MinGasPriceResponse> getMinGasPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinGasPrice",
      requestType = com.google.protobuf.Empty.class,
      responseType = MinGasPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      MinGasPriceResponse> getMinGasPriceMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, MinGasPriceResponse> getMinGasPriceMethod;
    if ((getMinGasPriceMethod = ApiServiceGrpc.getMinGasPriceMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getMinGasPriceMethod = ApiServiceGrpc.getMinGasPriceMethod) == null) {
          ApiServiceGrpc.getMinGasPriceMethod = getMinGasPriceMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, MinGasPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinGasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MinGasPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("MinGasPrice"))
              .build();
        }
      }
    }
    return getMinGasPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      NetInfoResponse> getNetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NetInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = NetInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      NetInfoResponse> getNetInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, NetInfoResponse> getNetInfoMethod;
    if ((getNetInfoMethod = ApiServiceGrpc.getNetInfoMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getNetInfoMethod = ApiServiceGrpc.getNetInfoMethod) == null) {
          ApiServiceGrpc.getNetInfoMethod = getNetInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, NetInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NetInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("NetInfo"))
              .build();
        }
      }
    }
    return getNetInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      StatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = com.google.protobuf.Empty.class,
      responseType = StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      StatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, StatusResponse> getStatusMethod;
    if ((getStatusMethod = ApiServiceGrpc.getStatusMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getStatusMethod = ApiServiceGrpc.getStatusMethod) == null) {
          ApiServiceGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressRequest,
      AddressResponse> getAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Address",
      requestType = AddressRequest.class,
      responseType = AddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressRequest,
      AddressResponse> getAddressMethod() {
    io.grpc.MethodDescriptor<AddressRequest, AddressResponse> getAddressMethod;
    if ((getAddressMethod = ApiServiceGrpc.getAddressMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getAddressMethod = ApiServiceGrpc.getAddressMethod) == null) {
          ApiServiceGrpc.getAddressMethod = getAddressMethod =
              io.grpc.MethodDescriptor.<AddressRequest, AddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Address"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Address"))
              .build();
        }
      }
    }
    return getAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressesRequest,
      AddressesResponse> getAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Addresses",
      requestType = AddressesRequest.class,
      responseType = AddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressesRequest,
      AddressesResponse> getAddressesMethod() {
    io.grpc.MethodDescriptor<AddressesRequest, AddressesResponse> getAddressesMethod;
    if ((getAddressesMethod = ApiServiceGrpc.getAddressesMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getAddressesMethod = ApiServiceGrpc.getAddressesMethod) == null) {
          ApiServiceGrpc.getAddressesMethod = getAddressesMethod =
              io.grpc.MethodDescriptor.<AddressesRequest, AddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Addresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Addresses"))
              .build();
        }
      }
    }
    return getAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BlockRequest,
      BlockResponse> getBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Block",
      requestType = BlockRequest.class,
      responseType = BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BlockRequest,
      BlockResponse> getBlockMethod() {
    io.grpc.MethodDescriptor<BlockRequest, BlockResponse> getBlockMethod;
    if ((getBlockMethod = ApiServiceGrpc.getBlockMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getBlockMethod = ApiServiceGrpc.getBlockMethod) == null) {
          ApiServiceGrpc.getBlockMethod = getBlockMethod =
              io.grpc.MethodDescriptor.<BlockRequest, BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Block"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Block"))
              .build();
        }
      }
    }
    return getBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CandidateRequest,
      CandidateResponse> getCandidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Candidate",
      requestType = CandidateRequest.class,
      responseType = CandidateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CandidateRequest,
      CandidateResponse> getCandidateMethod() {
    io.grpc.MethodDescriptor<CandidateRequest, CandidateResponse> getCandidateMethod;
    if ((getCandidateMethod = ApiServiceGrpc.getCandidateMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCandidateMethod = ApiServiceGrpc.getCandidateMethod) == null) {
          ApiServiceGrpc.getCandidateMethod = getCandidateMethod =
              io.grpc.MethodDescriptor.<CandidateRequest, CandidateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Candidate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CandidateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CandidateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Candidate"))
              .build();
        }
      }
    }
    return getCandidateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CandidatesRequest,
      CandidatesResponse> getCandidatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Candidates",
      requestType = CandidatesRequest.class,
      responseType = CandidatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CandidatesRequest,
      CandidatesResponse> getCandidatesMethod() {
    io.grpc.MethodDescriptor<CandidatesRequest, CandidatesResponse> getCandidatesMethod;
    if ((getCandidatesMethod = ApiServiceGrpc.getCandidatesMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCandidatesMethod = ApiServiceGrpc.getCandidatesMethod) == null) {
          ApiServiceGrpc.getCandidatesMethod = getCandidatesMethod =
              io.grpc.MethodDescriptor.<CandidatesRequest, CandidatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Candidates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CandidatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CandidatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Candidates"))
              .build();
        }
      }
    }
    return getCandidatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CoinIdRequest,
      CoinInfoResponse> getCoinInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CoinInfoById",
      requestType = CoinIdRequest.class,
      responseType = CoinInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CoinIdRequest,
      CoinInfoResponse> getCoinInfoByIdMethod() {
    io.grpc.MethodDescriptor<CoinIdRequest, CoinInfoResponse> getCoinInfoByIdMethod;
    if ((getCoinInfoByIdMethod = ApiServiceGrpc.getCoinInfoByIdMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCoinInfoByIdMethod = ApiServiceGrpc.getCoinInfoByIdMethod) == null) {
          ApiServiceGrpc.getCoinInfoByIdMethod = getCoinInfoByIdMethod =
              io.grpc.MethodDescriptor.<CoinIdRequest, CoinInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CoinInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CoinIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CoinInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("CoinInfoById"))
              .build();
        }
      }
    }
    return getCoinInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CoinInfoRequest,
      CoinInfoResponse> getCoinInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CoinInfo",
      requestType = CoinInfoRequest.class,
      responseType = CoinInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CoinInfoRequest,
      CoinInfoResponse> getCoinInfoMethod() {
    io.grpc.MethodDescriptor<CoinInfoRequest, CoinInfoResponse> getCoinInfoMethod;
    if ((getCoinInfoMethod = ApiServiceGrpc.getCoinInfoMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCoinInfoMethod = ApiServiceGrpc.getCoinInfoMethod) == null) {
          ApiServiceGrpc.getCoinInfoMethod = getCoinInfoMethod =
              io.grpc.MethodDescriptor.<CoinInfoRequest, CoinInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CoinInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CoinInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CoinInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("CoinInfo"))
              .build();
        }
      }
    }
    return getCoinInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EstimateCoinBuyRequest,
      EstimateCoinBuyResponse> getEstimateCoinBuyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateCoinBuy",
      requestType = EstimateCoinBuyRequest.class,
      responseType = EstimateCoinBuyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EstimateCoinBuyRequest,
      EstimateCoinBuyResponse> getEstimateCoinBuyMethod() {
    io.grpc.MethodDescriptor<EstimateCoinBuyRequest, EstimateCoinBuyResponse> getEstimateCoinBuyMethod;
    if ((getEstimateCoinBuyMethod = ApiServiceGrpc.getEstimateCoinBuyMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEstimateCoinBuyMethod = ApiServiceGrpc.getEstimateCoinBuyMethod) == null) {
          ApiServiceGrpc.getEstimateCoinBuyMethod = getEstimateCoinBuyMethod =
              io.grpc.MethodDescriptor.<EstimateCoinBuyRequest, EstimateCoinBuyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateCoinBuy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EstimateCoinBuyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EstimateCoinBuyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("EstimateCoinBuy"))
              .build();
        }
      }
    }
    return getEstimateCoinBuyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EstimateCoinSellRequest,
      EstimateCoinSellResponse> getEstimateCoinSellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateCoinSell",
      requestType = EstimateCoinSellRequest.class,
      responseType = EstimateCoinSellResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EstimateCoinSellRequest,
      EstimateCoinSellResponse> getEstimateCoinSellMethod() {
    io.grpc.MethodDescriptor<EstimateCoinSellRequest, EstimateCoinSellResponse> getEstimateCoinSellMethod;
    if ((getEstimateCoinSellMethod = ApiServiceGrpc.getEstimateCoinSellMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEstimateCoinSellMethod = ApiServiceGrpc.getEstimateCoinSellMethod) == null) {
          ApiServiceGrpc.getEstimateCoinSellMethod = getEstimateCoinSellMethod =
              io.grpc.MethodDescriptor.<EstimateCoinSellRequest, EstimateCoinSellResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateCoinSell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EstimateCoinSellRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EstimateCoinSellResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("EstimateCoinSell"))
              .build();
        }
      }
    }
    return getEstimateCoinSellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EstimateCoinSellAllRequest,
      EstimateCoinSellAllResponse> getEstimateCoinSellAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateCoinSellAll",
      requestType = EstimateCoinSellAllRequest.class,
      responseType = EstimateCoinSellAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EstimateCoinSellAllRequest,
      EstimateCoinSellAllResponse> getEstimateCoinSellAllMethod() {
    io.grpc.MethodDescriptor<EstimateCoinSellAllRequest, EstimateCoinSellAllResponse> getEstimateCoinSellAllMethod;
    if ((getEstimateCoinSellAllMethod = ApiServiceGrpc.getEstimateCoinSellAllMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEstimateCoinSellAllMethod = ApiServiceGrpc.getEstimateCoinSellAllMethod) == null) {
          ApiServiceGrpc.getEstimateCoinSellAllMethod = getEstimateCoinSellAllMethod =
              io.grpc.MethodDescriptor.<EstimateCoinSellAllRequest, EstimateCoinSellAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateCoinSellAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EstimateCoinSellAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EstimateCoinSellAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("EstimateCoinSellAll"))
              .build();
        }
      }
    }
    return getEstimateCoinSellAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EstimateTxCommissionRequest,
      EstimateTxCommissionResponse> getEstimateTxCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateTxCommission",
      requestType = EstimateTxCommissionRequest.class,
      responseType = EstimateTxCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EstimateTxCommissionRequest,
      EstimateTxCommissionResponse> getEstimateTxCommissionMethod() {
    io.grpc.MethodDescriptor<EstimateTxCommissionRequest, EstimateTxCommissionResponse> getEstimateTxCommissionMethod;
    if ((getEstimateTxCommissionMethod = ApiServiceGrpc.getEstimateTxCommissionMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEstimateTxCommissionMethod = ApiServiceGrpc.getEstimateTxCommissionMethod) == null) {
          ApiServiceGrpc.getEstimateTxCommissionMethod = getEstimateTxCommissionMethod =
              io.grpc.MethodDescriptor.<EstimateTxCommissionRequest, EstimateTxCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateTxCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EstimateTxCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EstimateTxCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("EstimateTxCommission"))
              .build();
        }
      }
    }
    return getEstimateTxCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EventsRequest,
      EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = EventsRequest.class,
      responseType = EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EventsRequest,
      EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<EventsRequest, EventsResponse> getEventsMethod;
    if ((getEventsMethod = ApiServiceGrpc.getEventsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEventsMethod = ApiServiceGrpc.getEventsMethod) == null) {
          ApiServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<EventsRequest, EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MaxGasPriceRequest,
      MaxGasPriceResponse> getMaxGasPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxGasPrice",
      requestType = MaxGasPriceRequest.class,
      responseType = MaxGasPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MaxGasPriceRequest,
      MaxGasPriceResponse> getMaxGasPriceMethod() {
    io.grpc.MethodDescriptor<MaxGasPriceRequest, MaxGasPriceResponse> getMaxGasPriceMethod;
    if ((getMaxGasPriceMethod = ApiServiceGrpc.getMaxGasPriceMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getMaxGasPriceMethod = ApiServiceGrpc.getMaxGasPriceMethod) == null) {
          ApiServiceGrpc.getMaxGasPriceMethod = getMaxGasPriceMethod =
              io.grpc.MethodDescriptor.<MaxGasPriceRequest, MaxGasPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxGasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MaxGasPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MaxGasPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("MaxGasPrice"))
              .build();
        }
      }
    }
    return getMaxGasPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MissedBlocksRequest,
      MissedBlocksResponse> getMissedBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MissedBlocks",
      requestType = MissedBlocksRequest.class,
      responseType = MissedBlocksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MissedBlocksRequest,
      MissedBlocksResponse> getMissedBlocksMethod() {
    io.grpc.MethodDescriptor<MissedBlocksRequest, MissedBlocksResponse> getMissedBlocksMethod;
    if ((getMissedBlocksMethod = ApiServiceGrpc.getMissedBlocksMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getMissedBlocksMethod = ApiServiceGrpc.getMissedBlocksMethod) == null) {
          ApiServiceGrpc.getMissedBlocksMethod = getMissedBlocksMethod =
              io.grpc.MethodDescriptor.<MissedBlocksRequest, MissedBlocksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MissedBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MissedBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MissedBlocksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("MissedBlocks"))
              .build();
        }
      }
    }
    return getMissedBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SendTransactionRequest,
      SendTransactionResponse> getSendTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTransaction",
      requestType = SendTransactionRequest.class,
      responseType = SendTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SendTransactionRequest,
      SendTransactionResponse> getSendTransactionMethod() {
    io.grpc.MethodDescriptor<SendTransactionRequest, SendTransactionResponse> getSendTransactionMethod;
    if ((getSendTransactionMethod = ApiServiceGrpc.getSendTransactionMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSendTransactionMethod = ApiServiceGrpc.getSendTransactionMethod) == null) {
          ApiServiceGrpc.getSendTransactionMethod = getSendTransactionMethod =
              io.grpc.MethodDescriptor.<SendTransactionRequest, SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SendTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SendTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("SendTransaction"))
              .build();
        }
      }
    }
    return getSendTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TransactionRequest,
      TransactionResponse> getTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transaction",
      requestType = TransactionRequest.class,
      responseType = TransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TransactionRequest,
      TransactionResponse> getTransactionMethod() {
    io.grpc.MethodDescriptor<TransactionRequest, TransactionResponse> getTransactionMethod;
    if ((getTransactionMethod = ApiServiceGrpc.getTransactionMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getTransactionMethod = ApiServiceGrpc.getTransactionMethod) == null) {
          ApiServiceGrpc.getTransactionMethod = getTransactionMethod =
              io.grpc.MethodDescriptor.<TransactionRequest, TransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Transaction"))
              .build();
        }
      }
    }
    return getTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TransactionsRequest,
      TransactionsResponse> getTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transactions",
      requestType = TransactionsRequest.class,
      responseType = TransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TransactionsRequest,
      TransactionsResponse> getTransactionsMethod() {
    io.grpc.MethodDescriptor<TransactionsRequest, TransactionsResponse> getTransactionsMethod;
    if ((getTransactionsMethod = ApiServiceGrpc.getTransactionsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getTransactionsMethod = ApiServiceGrpc.getTransactionsMethod) == null) {
          ApiServiceGrpc.getTransactionsMethod = getTransactionsMethod =
              io.grpc.MethodDescriptor.<TransactionsRequest, TransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Transactions"))
              .build();
        }
      }
    }
    return getTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UnconfirmedTxsRequest,
      UnconfirmedTxsResponse> getUnconfirmedTxsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnconfirmedTxs",
      requestType = UnconfirmedTxsRequest.class,
      responseType = UnconfirmedTxsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UnconfirmedTxsRequest,
      UnconfirmedTxsResponse> getUnconfirmedTxsMethod() {
    io.grpc.MethodDescriptor<UnconfirmedTxsRequest, UnconfirmedTxsResponse> getUnconfirmedTxsMethod;
    if ((getUnconfirmedTxsMethod = ApiServiceGrpc.getUnconfirmedTxsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getUnconfirmedTxsMethod = ApiServiceGrpc.getUnconfirmedTxsMethod) == null) {
          ApiServiceGrpc.getUnconfirmedTxsMethod = getUnconfirmedTxsMethod =
              io.grpc.MethodDescriptor.<UnconfirmedTxsRequest, UnconfirmedTxsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnconfirmedTxs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UnconfirmedTxsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UnconfirmedTxsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("UnconfirmedTxs"))
              .build();
        }
      }
    }
    return getUnconfirmedTxsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ValidatorsRequest,
      ValidatorsResponse> getValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validators",
      requestType = ValidatorsRequest.class,
      responseType = ValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ValidatorsRequest,
      ValidatorsResponse> getValidatorsMethod() {
    io.grpc.MethodDescriptor<ValidatorsRequest, ValidatorsResponse> getValidatorsMethod;
    if ((getValidatorsMethod = ApiServiceGrpc.getValidatorsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getValidatorsMethod = ApiServiceGrpc.getValidatorsMethod) == null) {
          ApiServiceGrpc.getValidatorsMethod = getValidatorsMethod =
              io.grpc.MethodDescriptor.<ValidatorsRequest, ValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Validators"))
              .build();
        }
      }
    }
    return getValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<FrozenRequest,
      FrozenResponse> getFrozenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Frozen",
      requestType = FrozenRequest.class,
      responseType = FrozenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<FrozenRequest,
      FrozenResponse> getFrozenMethod() {
    io.grpc.MethodDescriptor<FrozenRequest, FrozenResponse> getFrozenMethod;
    if ((getFrozenMethod = ApiServiceGrpc.getFrozenMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getFrozenMethod = ApiServiceGrpc.getFrozenMethod) == null) {
          ApiServiceGrpc.getFrozenMethod = getFrozenMethod =
              io.grpc.MethodDescriptor.<FrozenRequest, FrozenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Frozen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FrozenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FrozenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Frozen"))
              .build();
        }
      }
    }
    return getFrozenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<WaitListRequest,
      WaitListResponse> getWaitListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaitList",
      requestType = WaitListRequest.class,
      responseType = WaitListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<WaitListRequest,
      WaitListResponse> getWaitListMethod() {
    io.grpc.MethodDescriptor<WaitListRequest, WaitListResponse> getWaitListMethod;
    if ((getWaitListMethod = ApiServiceGrpc.getWaitListMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getWaitListMethod = ApiServiceGrpc.getWaitListMethod) == null) {
          ApiServiceGrpc.getWaitListMethod = getWaitListMethod =
              io.grpc.MethodDescriptor.<WaitListRequest, WaitListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaitList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WaitListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WaitListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("WaitList"))
              .build();
        }
      }
    }
    return getWaitListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      BlockResponse> getTestBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestBlock",
      requestType = com.google.protobuf.Empty.class,
      responseType = BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      BlockResponse> getTestBlockMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, BlockResponse> getTestBlockMethod;
    if ((getTestBlockMethod = ApiServiceGrpc.getTestBlockMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getTestBlockMethod = ApiServiceGrpc.getTestBlockMethod) == null) {
          ApiServiceGrpc.getTestBlockMethod = getTestBlockMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("TestBlock"))
              .build();
        }
      }
    }
    return getTestBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SwapPoolRequest,
      SwapPoolResponse> getSwapPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapPool",
      requestType = SwapPoolRequest.class,
      responseType = SwapPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SwapPoolRequest,
      SwapPoolResponse> getSwapPoolMethod() {
    io.grpc.MethodDescriptor<SwapPoolRequest, SwapPoolResponse> getSwapPoolMethod;
    if ((getSwapPoolMethod = ApiServiceGrpc.getSwapPoolMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSwapPoolMethod = ApiServiceGrpc.getSwapPoolMethod) == null) {
          ApiServiceGrpc.getSwapPoolMethod = getSwapPoolMethod =
              io.grpc.MethodDescriptor.<SwapPoolRequest, SwapPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SwapPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SwapPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("SwapPool"))
              .build();
        }
      }
    }
    return getSwapPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SwapPoolProviderRequest,
      SwapPoolResponse> getSwapPoolProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapPoolProvider",
      requestType = SwapPoolProviderRequest.class,
      responseType = SwapPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SwapPoolProviderRequest,
      SwapPoolResponse> getSwapPoolProviderMethod() {
    io.grpc.MethodDescriptor<SwapPoolProviderRequest, SwapPoolResponse> getSwapPoolProviderMethod;
    if ((getSwapPoolProviderMethod = ApiServiceGrpc.getSwapPoolProviderMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSwapPoolProviderMethod = ApiServiceGrpc.getSwapPoolProviderMethod) == null) {
          ApiServiceGrpc.getSwapPoolProviderMethod = getSwapPoolProviderMethod =
              io.grpc.MethodDescriptor.<SwapPoolProviderRequest, SwapPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapPoolProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SwapPoolProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SwapPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("SwapPoolProvider"))
              .build();
        }
      }
    }
    return getSwapPoolProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PriceCommissionRequest,
      PriceCommissionResponse> getPriceCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PriceCommission",
      requestType = PriceCommissionRequest.class,
      responseType = PriceCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PriceCommissionRequest,
      PriceCommissionResponse> getPriceCommissionMethod() {
    io.grpc.MethodDescriptor<PriceCommissionRequest, PriceCommissionResponse> getPriceCommissionMethod;
    if ((getPriceCommissionMethod = ApiServiceGrpc.getPriceCommissionMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getPriceCommissionMethod = ApiServiceGrpc.getPriceCommissionMethod) == null) {
          ApiServiceGrpc.getPriceCommissionMethod = getPriceCommissionMethod =
              io.grpc.MethodDescriptor.<PriceCommissionRequest, PriceCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PriceCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PriceCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PriceCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("PriceCommission"))
              .build();
        }
      }
    }
    return getPriceCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<VersionNetworkRequest,
      VersionNetworkResponse> getVersionNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VersionNetwork",
      requestType = VersionNetworkRequest.class,
      responseType = VersionNetworkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<VersionNetworkRequest,
      VersionNetworkResponse> getVersionNetworkMethod() {
    io.grpc.MethodDescriptor<VersionNetworkRequest, VersionNetworkResponse> getVersionNetworkMethod;
    if ((getVersionNetworkMethod = ApiServiceGrpc.getVersionNetworkMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getVersionNetworkMethod = ApiServiceGrpc.getVersionNetworkMethod) == null) {
          ApiServiceGrpc.getVersionNetworkMethod = getVersionNetworkMethod =
              io.grpc.MethodDescriptor.<VersionNetworkRequest, VersionNetworkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VersionNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  VersionNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  VersionNetworkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("VersionNetwork"))
              .build();
        }
      }
    }
    return getVersionNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CommissionVotesRequest,
      CommissionVotesResponse> getCommissionVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommissionVotes",
      requestType = CommissionVotesRequest.class,
      responseType = CommissionVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommissionVotesRequest,
      CommissionVotesResponse> getCommissionVotesMethod() {
    io.grpc.MethodDescriptor<CommissionVotesRequest, CommissionVotesResponse> getCommissionVotesMethod;
    if ((getCommissionVotesMethod = ApiServiceGrpc.getCommissionVotesMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCommissionVotesMethod = ApiServiceGrpc.getCommissionVotesMethod) == null) {
          ApiServiceGrpc.getCommissionVotesMethod = getCommissionVotesMethod =
              io.grpc.MethodDescriptor.<CommissionVotesRequest, CommissionVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommissionVotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommissionVotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommissionVotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("CommissionVotes"))
              .build();
        }
      }
    }
    return getCommissionVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UpdateVotesRequest,
      UpdateVotesResponse> getUpdateVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVotes",
      requestType = UpdateVotesRequest.class,
      responseType = UpdateVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UpdateVotesRequest,
      UpdateVotesResponse> getUpdateVotesMethod() {
    io.grpc.MethodDescriptor<UpdateVotesRequest, UpdateVotesResponse> getUpdateVotesMethod;
    if ((getUpdateVotesMethod = ApiServiceGrpc.getUpdateVotesMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getUpdateVotesMethod = ApiServiceGrpc.getUpdateVotesMethod) == null) {
          ApiServiceGrpc.getUpdateVotesMethod = getUpdateVotesMethod =
              io.grpc.MethodDescriptor.<UpdateVotesRequest, UpdateVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UpdateVotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UpdateVotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("UpdateVotes"))
              .build();
        }
      }
    }
    return getUpdateVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BlocksRequest,
      BlocksResponse> getBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blocks",
      requestType = BlocksRequest.class,
      responseType = BlocksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BlocksRequest,
      BlocksResponse> getBlocksMethod() {
    io.grpc.MethodDescriptor<BlocksRequest, BlocksResponse> getBlocksMethod;
    if ((getBlocksMethod = ApiServiceGrpc.getBlocksMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getBlocksMethod = ApiServiceGrpc.getBlocksMethod) == null) {
          ApiServiceGrpc.getBlocksMethod = getBlocksMethod =
              io.grpc.MethodDescriptor.<BlocksRequest, BlocksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlocksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Blocks"))
              .build();
        }
      }
    }
    return getBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LimitOrderRequest,
      LimitOrderResponse> getLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrder",
      requestType = LimitOrderRequest.class,
      responseType = LimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LimitOrderRequest,
      LimitOrderResponse> getLimitOrderMethod() {
    io.grpc.MethodDescriptor<LimitOrderRequest, LimitOrderResponse> getLimitOrderMethod;
    if ((getLimitOrderMethod = ApiServiceGrpc.getLimitOrderMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getLimitOrderMethod = ApiServiceGrpc.getLimitOrderMethod) == null) {
          ApiServiceGrpc.getLimitOrderMethod = getLimitOrderMethod =
              io.grpc.MethodDescriptor.<LimitOrderRequest, LimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LimitOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("LimitOrder"))
              .build();
        }
      }
    }
    return getLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LimitOrdersOfPoolRequest,
      LimitOrdersOfPoolResponse> getLimitOrdersOfPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrdersOfPool",
      requestType = LimitOrdersOfPoolRequest.class,
      responseType = LimitOrdersOfPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LimitOrdersOfPoolRequest,
      LimitOrdersOfPoolResponse> getLimitOrdersOfPoolMethod() {
    io.grpc.MethodDescriptor<LimitOrdersOfPoolRequest, LimitOrdersOfPoolResponse> getLimitOrdersOfPoolMethod;
    if ((getLimitOrdersOfPoolMethod = ApiServiceGrpc.getLimitOrdersOfPoolMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getLimitOrdersOfPoolMethod = ApiServiceGrpc.getLimitOrdersOfPoolMethod) == null) {
          ApiServiceGrpc.getLimitOrdersOfPoolMethod = getLimitOrdersOfPoolMethod =
              io.grpc.MethodDescriptor.<LimitOrdersOfPoolRequest, LimitOrdersOfPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrdersOfPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LimitOrdersOfPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LimitOrdersOfPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("LimitOrdersOfPool"))
              .build();
        }
      }
    }
    return getLimitOrdersOfPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LimitOrdersRequest,
      LimitOrdersResponse> getLimitOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrders",
      requestType = LimitOrdersRequest.class,
      responseType = LimitOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LimitOrdersRequest,
      LimitOrdersResponse> getLimitOrdersMethod() {
    io.grpc.MethodDescriptor<LimitOrdersRequest, LimitOrdersResponse> getLimitOrdersMethod;
    if ((getLimitOrdersMethod = ApiServiceGrpc.getLimitOrdersMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getLimitOrdersMethod = ApiServiceGrpc.getLimitOrdersMethod) == null) {
          ApiServiceGrpc.getLimitOrdersMethod = getLimitOrdersMethod =
              io.grpc.MethodDescriptor.<LimitOrdersRequest, LimitOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LimitOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LimitOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("LimitOrders"))
              .build();
        }
      }
    }
    return getLimitOrdersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiServiceStub>() {
        @Override
        public ApiServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiServiceStub(channel, callOptions);
        }
      };
    return ApiServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiServiceBlockingStub>() {
        @Override
        public ApiServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiServiceBlockingStub(channel, callOptions);
        }
      };
    return ApiServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiServiceFutureStub>() {
        @Override
        public ApiServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiServiceFutureStub(channel, callOptions);
        }
      };
    return ApiServiceFutureStub.newStub(factory, channel);
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
    public void subscribe(SubscribeRequest request,
                          io.grpc.stub.StreamObserver<SubscribeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public void halts(HaltsRequest request,
                      io.grpc.stub.StreamObserver<HaltsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHaltsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public void genesis(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<GenesisResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenesisMethod(), responseObserver);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public void minGasPrice(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<MinGasPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMinGasPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public void netInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<NetInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNetInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public void status(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public void address(AddressRequest request,
                        io.grpc.stub.StreamObserver<AddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public void addresses(AddressesRequest request,
                          io.grpc.stub.StreamObserver<AddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public void block(BlockRequest request,
                      io.grpc.stub.StreamObserver<BlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Candidate
     * Candidate returns candidate’s info by provided public key.
     * {{import "fields.md"}}
     * </pre>
     */
    public void candidate(CandidateRequest request,
                          io.grpc.stub.StreamObserver<CandidateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCandidateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public void candidates(CandidatesRequest request,
                           io.grpc.stub.StreamObserver<CandidatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCandidatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public void coinInfoById(CoinIdRequest request,
                             io.grpc.stub.StreamObserver<CoinInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCoinInfoByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public void coinInfo(CoinInfoRequest request,
                         io.grpc.stub.StreamObserver<CoinInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCoinInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public void estimateCoinBuy(EstimateCoinBuyRequest request,
                                io.grpc.stub.StreamObserver<EstimateCoinBuyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateCoinBuyMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public void estimateCoinSell(EstimateCoinSellRequest request,
                                 io.grpc.stub.StreamObserver<EstimateCoinSellResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateCoinSellMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public void estimateCoinSellAll(EstimateCoinSellAllRequest request,
                                    io.grpc.stub.StreamObserver<EstimateCoinSellAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateCoinSellAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public void estimateTxCommission(EstimateTxCommissionRequest request,
                                     io.grpc.stub.StreamObserver<EstimateTxCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateTxCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public void events(EventsRequest request,
                       io.grpc.stub.StreamObserver<EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public void maxGasPrice(MaxGasPriceRequest request,
                            io.grpc.stub.StreamObserver<MaxGasPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMaxGasPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public void missedBlocks(MissedBlocksRequest request,
                             io.grpc.stub.StreamObserver<MissedBlocksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMissedBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public void sendTransaction(SendTransactionRequest request,
                                io.grpc.stub.StreamObserver<SendTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public void transaction(TransactionRequest request,
                            io.grpc.stub.StreamObserver<TransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public void transactions(TransactionsRequest request,
                             io.grpc.stub.StreamObserver<TransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public void unconfirmedTxs(UnconfirmedTxsRequest request,
                               io.grpc.stub.StreamObserver<UnconfirmedTxsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnconfirmedTxsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public void validators(ValidatorsRequest request,
                           io.grpc.stub.StreamObserver<ValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * </pre>
     */
    public void frozen(FrozenRequest request,
                       io.grpc.stub.StreamObserver<FrozenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFrozenMethod(), responseObserver);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public void waitList(WaitListRequest request,
                         io.grpc.stub.StreamObserver<WaitListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWaitListMethod(), responseObserver);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public void testBlock(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<BlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * SwapPool
     * </pre>
     */
    public void swapPool(SwapPoolRequest request,
                         io.grpc.stub.StreamObserver<SwapPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * </pre>
     */
    public void swapPoolProvider(SwapPoolProviderRequest request,
                                 io.grpc.stub.StreamObserver<SwapPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapPoolProviderMethod(), responseObserver);
    }

    /**
     * <pre>
     * PriceCommission
     * </pre>
     */
    public void priceCommission(PriceCommissionRequest request,
                                io.grpc.stub.StreamObserver<PriceCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPriceCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * VersionNetwork
     * </pre>
     */
    public void versionNetwork(VersionNetworkRequest request,
                               io.grpc.stub.StreamObserver<VersionNetworkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVersionNetworkMethod(), responseObserver);
    }

    /**
     * <pre>
     * CommissionVotes
     * </pre>
     */
    public void commissionVotes(CommissionVotesRequest request,
                                io.grpc.stub.StreamObserver<CommissionVotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommissionVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateVotes
     * </pre>
     */
    public void updateVotes(UpdateVotesRequest request,
                            io.grpc.stub.StreamObserver<UpdateVotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Blocks
     * </pre>
     */
    public void blocks(BlocksRequest request,
                       io.grpc.stub.StreamObserver<BlocksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * LimitOrder
     * </pre>
     */
    public void limitOrder(LimitOrderRequest request,
                           io.grpc.stub.StreamObserver<LimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * </pre>
     */
    public void limitOrdersOfPool(LimitOrdersOfPoolRequest request,
                                  io.grpc.stub.StreamObserver<LimitOrdersOfPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrdersOfPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * LimitOrders
     * </pre>
     */
    public void limitOrders(LimitOrdersRequest request,
                            io.grpc.stub.StreamObserver<LimitOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrdersMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                SubscribeRequest,
                SubscribeResponse>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getHaltsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                HaltsRequest,
                HaltsResponse>(
                  this, METHODID_HALTS)))
          .addMethod(
            getGenesisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                GenesisResponse>(
                  this, METHODID_GENESIS)))
          .addMethod(
            getMinGasPriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                MinGasPriceResponse>(
                  this, METHODID_MIN_GAS_PRICE)))
          .addMethod(
            getNetInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                NetInfoResponse>(
                  this, METHODID_NET_INFO)))
          .addMethod(
            getStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                StatusResponse>(
                  this, METHODID_STATUS)))
          .addMethod(
            getAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressRequest,
                AddressResponse>(
                  this, METHODID_ADDRESS)))
          .addMethod(
            getAddressesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressesRequest,
                AddressesResponse>(
                  this, METHODID_ADDRESSES)))
          .addMethod(
            getBlockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BlockRequest,
                BlockResponse>(
                  this, METHODID_BLOCK)))
          .addMethod(
            getCandidateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                CandidateRequest,
                CandidateResponse>(
                  this, METHODID_CANDIDATE)))
          .addMethod(
            getCandidatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                CandidatesRequest,
                CandidatesResponse>(
                  this, METHODID_CANDIDATES)))
          .addMethod(
            getCoinInfoByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                CoinIdRequest,
                CoinInfoResponse>(
                  this, METHODID_COIN_INFO_BY_ID)))
          .addMethod(
            getCoinInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                CoinInfoRequest,
                CoinInfoResponse>(
                  this, METHODID_COIN_INFO)))
          .addMethod(
            getEstimateCoinBuyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                EstimateCoinBuyRequest,
                EstimateCoinBuyResponse>(
                  this, METHODID_ESTIMATE_COIN_BUY)))
          .addMethod(
            getEstimateCoinSellMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                EstimateCoinSellRequest,
                EstimateCoinSellResponse>(
                  this, METHODID_ESTIMATE_COIN_SELL)))
          .addMethod(
            getEstimateCoinSellAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                EstimateCoinSellAllRequest,
                EstimateCoinSellAllResponse>(
                  this, METHODID_ESTIMATE_COIN_SELL_ALL)))
          .addMethod(
            getEstimateTxCommissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                EstimateTxCommissionRequest,
                EstimateTxCommissionResponse>(
                  this, METHODID_ESTIMATE_TX_COMMISSION)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                EventsRequest,
                EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getMaxGasPriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                MaxGasPriceRequest,
                MaxGasPriceResponse>(
                  this, METHODID_MAX_GAS_PRICE)))
          .addMethod(
            getMissedBlocksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                MissedBlocksRequest,
                MissedBlocksResponse>(
                  this, METHODID_MISSED_BLOCKS)))
          .addMethod(
            getSendTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SendTransactionRequest,
                SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            getTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TransactionRequest,
                TransactionResponse>(
                  this, METHODID_TRANSACTION)))
          .addMethod(
            getTransactionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TransactionsRequest,
                TransactionsResponse>(
                  this, METHODID_TRANSACTIONS)))
          .addMethod(
            getUnconfirmedTxsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UnconfirmedTxsRequest,
                UnconfirmedTxsResponse>(
                  this, METHODID_UNCONFIRMED_TXS)))
          .addMethod(
            getValidatorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ValidatorsRequest,
                ValidatorsResponse>(
                  this, METHODID_VALIDATORS)))
          .addMethod(
            getFrozenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                FrozenRequest,
                FrozenResponse>(
                  this, METHODID_FROZEN)))
          .addMethod(
            getWaitListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                WaitListRequest,
                WaitListResponse>(
                  this, METHODID_WAIT_LIST)))
          .addMethod(
            getTestBlockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                BlockResponse>(
                  this, METHODID_TEST_BLOCK)))
          .addMethod(
            getSwapPoolMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SwapPoolRequest,
                SwapPoolResponse>(
                  this, METHODID_SWAP_POOL)))
          .addMethod(
            getSwapPoolProviderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SwapPoolProviderRequest,
                SwapPoolResponse>(
                  this, METHODID_SWAP_POOL_PROVIDER)))
          .addMethod(
            getPriceCommissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                PriceCommissionRequest,
                PriceCommissionResponse>(
                  this, METHODID_PRICE_COMMISSION)))
          .addMethod(
            getVersionNetworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                VersionNetworkRequest,
                VersionNetworkResponse>(
                  this, METHODID_VERSION_NETWORK)))
          .addMethod(
            getCommissionVotesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                CommissionVotesRequest,
                CommissionVotesResponse>(
                  this, METHODID_COMMISSION_VOTES)))
          .addMethod(
            getUpdateVotesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UpdateVotesRequest,
                UpdateVotesResponse>(
                  this, METHODID_UPDATE_VOTES)))
          .addMethod(
            getBlocksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BlocksRequest,
                BlocksResponse>(
                  this, METHODID_BLOCKS)))
          .addMethod(
            getLimitOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                LimitOrderRequest,
                LimitOrderResponse>(
                  this, METHODID_LIMIT_ORDER)))
          .addMethod(
            getLimitOrdersOfPoolMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                LimitOrdersOfPoolRequest,
                LimitOrdersOfPoolResponse>(
                  this, METHODID_LIMIT_ORDERS_OF_POOL)))
          .addMethod(
            getLimitOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                LimitOrdersRequest,
                LimitOrdersResponse>(
                  this, METHODID_LIMIT_ORDERS)))
          .build();
    }
  }

  /**
   */
  public static final class ApiServiceStub extends io.grpc.stub.AbstractAsyncStub<ApiServiceStub> {
    private ApiServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ApiServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe
     * 
     * Subscribe returns a subscription for events by query. Only supported in WS and gRPC methods.
     * </pre>
     */
    public void subscribe(SubscribeRequest request,
                          io.grpc.stub.StreamObserver<SubscribeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public void halts(HaltsRequest request,
                      io.grpc.stub.StreamObserver<HaltsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHaltsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public void genesis(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<GenesisResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenesisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public void minGasPrice(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<MinGasPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMinGasPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public void netInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<NetInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNetInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public void status(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public void address(AddressRequest request,
                        io.grpc.stub.StreamObserver<AddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public void addresses(AddressesRequest request,
                          io.grpc.stub.StreamObserver<AddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public void block(BlockRequest request,
                      io.grpc.stub.StreamObserver<BlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Candidate
     * Candidate returns candidate’s info by provided public key.
     * {{import "fields.md"}}
     * </pre>
     */
    public void candidate(CandidateRequest request,
                          io.grpc.stub.StreamObserver<CandidateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCandidateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public void candidates(CandidatesRequest request,
                           io.grpc.stub.StreamObserver<CandidatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCandidatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public void coinInfoById(CoinIdRequest request,
                             io.grpc.stub.StreamObserver<CoinInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCoinInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public void coinInfo(CoinInfoRequest request,
                         io.grpc.stub.StreamObserver<CoinInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCoinInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public void estimateCoinBuy(EstimateCoinBuyRequest request,
                                io.grpc.stub.StreamObserver<EstimateCoinBuyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateCoinBuyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public void estimateCoinSell(EstimateCoinSellRequest request,
                                 io.grpc.stub.StreamObserver<EstimateCoinSellResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateCoinSellMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public void estimateCoinSellAll(EstimateCoinSellAllRequest request,
                                    io.grpc.stub.StreamObserver<EstimateCoinSellAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateCoinSellAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public void estimateTxCommission(EstimateTxCommissionRequest request,
                                     io.grpc.stub.StreamObserver<EstimateTxCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateTxCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public void events(EventsRequest request,
                       io.grpc.stub.StreamObserver<EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public void maxGasPrice(MaxGasPriceRequest request,
                            io.grpc.stub.StreamObserver<MaxGasPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMaxGasPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public void missedBlocks(MissedBlocksRequest request,
                             io.grpc.stub.StreamObserver<MissedBlocksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMissedBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public void sendTransaction(SendTransactionRequest request,
                                io.grpc.stub.StreamObserver<SendTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public void transaction(TransactionRequest request,
                            io.grpc.stub.StreamObserver<TransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public void transactions(TransactionsRequest request,
                             io.grpc.stub.StreamObserver<TransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public void unconfirmedTxs(UnconfirmedTxsRequest request,
                               io.grpc.stub.StreamObserver<UnconfirmedTxsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnconfirmedTxsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public void validators(ValidatorsRequest request,
                           io.grpc.stub.StreamObserver<ValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * </pre>
     */
    public void frozen(FrozenRequest request,
                       io.grpc.stub.StreamObserver<FrozenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFrozenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public void waitList(WaitListRequest request,
                         io.grpc.stub.StreamObserver<WaitListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWaitListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public void testBlock(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<BlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapPool
     * </pre>
     */
    public void swapPool(SwapPoolRequest request,
                         io.grpc.stub.StreamObserver<SwapPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * </pre>
     */
    public void swapPoolProvider(SwapPoolProviderRequest request,
                                 io.grpc.stub.StreamObserver<SwapPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapPoolProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PriceCommission
     * </pre>
     */
    public void priceCommission(PriceCommissionRequest request,
                                io.grpc.stub.StreamObserver<PriceCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPriceCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VersionNetwork
     * </pre>
     */
    public void versionNetwork(VersionNetworkRequest request,
                               io.grpc.stub.StreamObserver<VersionNetworkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVersionNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CommissionVotes
     * </pre>
     */
    public void commissionVotes(CommissionVotesRequest request,
                                io.grpc.stub.StreamObserver<CommissionVotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommissionVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateVotes
     * </pre>
     */
    public void updateVotes(UpdateVotesRequest request,
                            io.grpc.stub.StreamObserver<UpdateVotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Blocks
     * </pre>
     */
    public void blocks(BlocksRequest request,
                       io.grpc.stub.StreamObserver<BlocksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrder
     * </pre>
     */
    public void limitOrder(LimitOrderRequest request,
                           io.grpc.stub.StreamObserver<LimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * </pre>
     */
    public void limitOrdersOfPool(LimitOrdersOfPoolRequest request,
                                  io.grpc.stub.StreamObserver<LimitOrdersOfPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrdersOfPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrders
     * </pre>
     */
    public void limitOrders(LimitOrdersRequest request,
                            io.grpc.stub.StreamObserver<LimitOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrdersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ApiServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApiServiceBlockingStub> {
    private ApiServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ApiServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe
     * 
     * Subscribe returns a subscription for events by query. Only supported in WS and gRPC methods.
     * </pre>
     */
    public java.util.Iterator<SubscribeResponse> subscribe(
        SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public HaltsResponse halts(HaltsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHaltsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public GenesisResponse genesis(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenesisMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public MinGasPriceResponse minGasPrice(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMinGasPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public NetInfoResponse netInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNetInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public StatusResponse status(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public AddressResponse address(AddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public AddressesResponse addresses(AddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public BlockResponse block(BlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Candidate
     * Candidate returns candidate’s info by provided public key.
     * {{import "fields.md"}}
     * </pre>
     */
    public CandidateResponse candidate(CandidateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCandidateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public CandidatesResponse candidates(CandidatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCandidatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public CoinInfoResponse coinInfoById(CoinIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCoinInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public CoinInfoResponse coinInfo(CoinInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCoinInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public EstimateCoinBuyResponse estimateCoinBuy(EstimateCoinBuyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateCoinBuyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public EstimateCoinSellResponse estimateCoinSell(EstimateCoinSellRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateCoinSellMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public EstimateCoinSellAllResponse estimateCoinSellAll(EstimateCoinSellAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateCoinSellAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public EstimateTxCommissionResponse estimateTxCommission(EstimateTxCommissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateTxCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public EventsResponse events(EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public MaxGasPriceResponse maxGasPrice(MaxGasPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMaxGasPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public MissedBlocksResponse missedBlocks(MissedBlocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMissedBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public SendTransactionResponse sendTransaction(SendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public TransactionResponse transaction(TransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public TransactionsResponse transactions(TransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public UnconfirmedTxsResponse unconfirmedTxs(UnconfirmedTxsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnconfirmedTxsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public ValidatorsResponse validators(ValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * </pre>
     */
    public FrozenResponse frozen(FrozenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFrozenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public WaitListResponse waitList(WaitListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWaitListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public BlockResponse testBlock(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapPool
     * </pre>
     */
    public SwapPoolResponse swapPool(SwapPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * </pre>
     */
    public SwapPoolResponse swapPoolProvider(SwapPoolProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapPoolProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PriceCommission
     * </pre>
     */
    public PriceCommissionResponse priceCommission(PriceCommissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPriceCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VersionNetwork
     * </pre>
     */
    public VersionNetworkResponse versionNetwork(VersionNetworkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVersionNetworkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CommissionVotes
     * </pre>
     */
    public CommissionVotesResponse commissionVotes(CommissionVotesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommissionVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateVotes
     * </pre>
     */
    public UpdateVotesResponse updateVotes(UpdateVotesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Blocks
     * </pre>
     */
    public BlocksResponse blocks(BlocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrder
     * </pre>
     */
    public LimitOrderResponse limitOrder(LimitOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * </pre>
     */
    public LimitOrdersOfPoolResponse limitOrdersOfPool(LimitOrdersOfPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrdersOfPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrders
     * </pre>
     */
    public LimitOrdersResponse limitOrders(LimitOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrdersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ApiServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ApiServiceFutureStub> {
    private ApiServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ApiServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<HaltsResponse> halts(
        HaltsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHaltsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GenesisResponse> genesis(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenesisMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MinGasPriceResponse> minGasPrice(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMinGasPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<NetInfoResponse> netInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNetInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<StatusResponse> status(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressResponse> address(
        AddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressesResponse> addresses(
        AddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BlockResponse> block(
        BlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Candidate
     * Candidate returns candidate’s info by provided public key.
     * {{import "fields.md"}}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CandidateResponse> candidate(
        CandidateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCandidateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CandidatesResponse> candidates(
        CandidatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCandidatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CoinInfoResponse> coinInfoById(
        CoinIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCoinInfoByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CoinInfoResponse> coinInfo(
        CoinInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCoinInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EstimateCoinBuyResponse> estimateCoinBuy(
        EstimateCoinBuyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateCoinBuyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EstimateCoinSellResponse> estimateCoinSell(
        EstimateCoinSellRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateCoinSellMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EstimateCoinSellAllResponse> estimateCoinSellAll(
        EstimateCoinSellAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateCoinSellAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EstimateTxCommissionResponse> estimateTxCommission(
        EstimateTxCommissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateTxCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EventsResponse> events(
        EventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MaxGasPriceResponse> maxGasPrice(
        MaxGasPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMaxGasPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MissedBlocksResponse> missedBlocks(
        MissedBlocksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMissedBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SendTransactionResponse> sendTransaction(
        SendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionResponse> transaction(
        TransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionsResponse> transactions(
        TransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UnconfirmedTxsResponse> unconfirmedTxs(
        UnconfirmedTxsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnconfirmedTxsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ValidatorsResponse> validators(
        ValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<FrozenResponse> frozen(
        FrozenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFrozenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<WaitListResponse> waitList(
        WaitListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWaitListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BlockResponse> testBlock(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapPool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SwapPoolResponse> swapPool(
        SwapPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SwapPoolResponse> swapPoolProvider(
        SwapPoolProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapPoolProviderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PriceCommission
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<PriceCommissionResponse> priceCommission(
        PriceCommissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPriceCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VersionNetwork
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<VersionNetworkResponse> versionNetwork(
        VersionNetworkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVersionNetworkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CommissionVotes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CommissionVotesResponse> commissionVotes(
        CommissionVotesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommissionVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateVotes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UpdateVotesResponse> updateVotes(
        UpdateVotesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Blocks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BlocksResponse> blocks(
        BlocksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<LimitOrderResponse> limitOrder(
        LimitOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<LimitOrdersOfPoolResponse> limitOrdersOfPool(
        LimitOrdersOfPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrdersOfPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<LimitOrdersResponse> limitOrders(
        LimitOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrdersMethod(), getCallOptions()), request);
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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<SubscribeResponse>) responseObserver);
          break;
        case METHODID_HALTS:
          serviceImpl.halts((HaltsRequest) request,
              (io.grpc.stub.StreamObserver<HaltsResponse>) responseObserver);
          break;
        case METHODID_GENESIS:
          serviceImpl.genesis((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<GenesisResponse>) responseObserver);
          break;
        case METHODID_MIN_GAS_PRICE:
          serviceImpl.minGasPrice((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<MinGasPriceResponse>) responseObserver);
          break;
        case METHODID_NET_INFO:
          serviceImpl.netInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<NetInfoResponse>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<StatusResponse>) responseObserver);
          break;
        case METHODID_ADDRESS:
          serviceImpl.address((AddressRequest) request,
              (io.grpc.stub.StreamObserver<AddressResponse>) responseObserver);
          break;
        case METHODID_ADDRESSES:
          serviceImpl.addresses((AddressesRequest) request,
              (io.grpc.stub.StreamObserver<AddressesResponse>) responseObserver);
          break;
        case METHODID_BLOCK:
          serviceImpl.block((BlockRequest) request,
              (io.grpc.stub.StreamObserver<BlockResponse>) responseObserver);
          break;
        case METHODID_CANDIDATE:
          serviceImpl.candidate((CandidateRequest) request,
              (io.grpc.stub.StreamObserver<CandidateResponse>) responseObserver);
          break;
        case METHODID_CANDIDATES:
          serviceImpl.candidates((CandidatesRequest) request,
              (io.grpc.stub.StreamObserver<CandidatesResponse>) responseObserver);
          break;
        case METHODID_COIN_INFO_BY_ID:
          serviceImpl.coinInfoById((CoinIdRequest) request,
              (io.grpc.stub.StreamObserver<CoinInfoResponse>) responseObserver);
          break;
        case METHODID_COIN_INFO:
          serviceImpl.coinInfo((CoinInfoRequest) request,
              (io.grpc.stub.StreamObserver<CoinInfoResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_COIN_BUY:
          serviceImpl.estimateCoinBuy((EstimateCoinBuyRequest) request,
              (io.grpc.stub.StreamObserver<EstimateCoinBuyResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_COIN_SELL:
          serviceImpl.estimateCoinSell((EstimateCoinSellRequest) request,
              (io.grpc.stub.StreamObserver<EstimateCoinSellResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_COIN_SELL_ALL:
          serviceImpl.estimateCoinSellAll((EstimateCoinSellAllRequest) request,
              (io.grpc.stub.StreamObserver<EstimateCoinSellAllResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_TX_COMMISSION:
          serviceImpl.estimateTxCommission((EstimateTxCommissionRequest) request,
              (io.grpc.stub.StreamObserver<EstimateTxCommissionResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((EventsRequest) request,
              (io.grpc.stub.StreamObserver<EventsResponse>) responseObserver);
          break;
        case METHODID_MAX_GAS_PRICE:
          serviceImpl.maxGasPrice((MaxGasPriceRequest) request,
              (io.grpc.stub.StreamObserver<MaxGasPriceResponse>) responseObserver);
          break;
        case METHODID_MISSED_BLOCKS:
          serviceImpl.missedBlocks((MissedBlocksRequest) request,
              (io.grpc.stub.StreamObserver<MissedBlocksResponse>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((SendTransactionRequest) request,
              (io.grpc.stub.StreamObserver<SendTransactionResponse>) responseObserver);
          break;
        case METHODID_TRANSACTION:
          serviceImpl.transaction((TransactionRequest) request,
              (io.grpc.stub.StreamObserver<TransactionResponse>) responseObserver);
          break;
        case METHODID_TRANSACTIONS:
          serviceImpl.transactions((TransactionsRequest) request,
              (io.grpc.stub.StreamObserver<TransactionsResponse>) responseObserver);
          break;
        case METHODID_UNCONFIRMED_TXS:
          serviceImpl.unconfirmedTxs((UnconfirmedTxsRequest) request,
              (io.grpc.stub.StreamObserver<UnconfirmedTxsResponse>) responseObserver);
          break;
        case METHODID_VALIDATORS:
          serviceImpl.validators((ValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<ValidatorsResponse>) responseObserver);
          break;
        case METHODID_FROZEN:
          serviceImpl.frozen((FrozenRequest) request,
              (io.grpc.stub.StreamObserver<FrozenResponse>) responseObserver);
          break;
        case METHODID_WAIT_LIST:
          serviceImpl.waitList((WaitListRequest) request,
              (io.grpc.stub.StreamObserver<WaitListResponse>) responseObserver);
          break;
        case METHODID_TEST_BLOCK:
          serviceImpl.testBlock((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<BlockResponse>) responseObserver);
          break;
        case METHODID_SWAP_POOL:
          serviceImpl.swapPool((SwapPoolRequest) request,
              (io.grpc.stub.StreamObserver<SwapPoolResponse>) responseObserver);
          break;
        case METHODID_SWAP_POOL_PROVIDER:
          serviceImpl.swapPoolProvider((SwapPoolProviderRequest) request,
              (io.grpc.stub.StreamObserver<SwapPoolResponse>) responseObserver);
          break;
        case METHODID_PRICE_COMMISSION:
          serviceImpl.priceCommission((PriceCommissionRequest) request,
              (io.grpc.stub.StreamObserver<PriceCommissionResponse>) responseObserver);
          break;
        case METHODID_VERSION_NETWORK:
          serviceImpl.versionNetwork((VersionNetworkRequest) request,
              (io.grpc.stub.StreamObserver<VersionNetworkResponse>) responseObserver);
          break;
        case METHODID_COMMISSION_VOTES:
          serviceImpl.commissionVotes((CommissionVotesRequest) request,
              (io.grpc.stub.StreamObserver<CommissionVotesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VOTES:
          serviceImpl.updateVotes((UpdateVotesRequest) request,
              (io.grpc.stub.StreamObserver<UpdateVotesResponse>) responseObserver);
          break;
        case METHODID_BLOCKS:
          serviceImpl.blocks((BlocksRequest) request,
              (io.grpc.stub.StreamObserver<BlocksResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDER:
          serviceImpl.limitOrder((LimitOrderRequest) request,
              (io.grpc.stub.StreamObserver<LimitOrderResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDERS_OF_POOL:
          serviceImpl.limitOrdersOfPool((LimitOrdersOfPoolRequest) request,
              (io.grpc.stub.StreamObserver<LimitOrdersOfPoolResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDERS:
          serviceImpl.limitOrders((LimitOrdersRequest) request,
              (io.grpc.stub.StreamObserver<LimitOrdersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ApiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Api.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiService");
    }
  }

  private static final class ApiServiceFileDescriptorSupplier
      extends ApiServiceBaseDescriptorSupplier {
    ApiServiceFileDescriptorSupplier() {}
  }

  private static final class ApiServiceMethodDescriptorSupplier
      extends ApiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApiServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
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
              .setSchemaDescriptor(new ApiServiceFileDescriptorSupplier())
              .addMethod(getSubscribeMethod())
              .addMethod(getHaltsMethod())
              .addMethod(getGenesisMethod())
              .addMethod(getMinGasPriceMethod())
              .addMethod(getNetInfoMethod())
              .addMethod(getStatusMethod())
              .addMethod(getAddressMethod())
              .addMethod(getAddressesMethod())
              .addMethod(getBlockMethod())
              .addMethod(getCandidateMethod())
              .addMethod(getCandidatesMethod())
              .addMethod(getCoinInfoByIdMethod())
              .addMethod(getCoinInfoMethod())
              .addMethod(getEstimateCoinBuyMethod())
              .addMethod(getEstimateCoinSellMethod())
              .addMethod(getEstimateCoinSellAllMethod())
              .addMethod(getEstimateTxCommissionMethod())
              .addMethod(getEventsMethod())
              .addMethod(getMaxGasPriceMethod())
              .addMethod(getMissedBlocksMethod())
              .addMethod(getSendTransactionMethod())
              .addMethod(getTransactionMethod())
              .addMethod(getTransactionsMethod())
              .addMethod(getUnconfirmedTxsMethod())
              .addMethod(getValidatorsMethod())
              .addMethod(getFrozenMethod())
              .addMethod(getWaitListMethod())
              .addMethod(getTestBlockMethod())
              .addMethod(getSwapPoolMethod())
              .addMethod(getSwapPoolProviderMethod())
              .addMethod(getPriceCommissionMethod())
              .addMethod(getVersionNetworkMethod())
              .addMethod(getCommissionVotesMethod())
              .addMethod(getUpdateVotesMethod())
              .addMethod(getBlocksMethod())
              .addMethod(getLimitOrderMethod())
              .addMethod(getLimitOrdersOfPoolMethod())
              .addMethod(getLimitOrdersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
