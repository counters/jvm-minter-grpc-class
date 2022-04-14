package counters.minter.grpc.client;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApiServiceGrpc {

  private ApiServiceGrpc() {}

  public static final String SERVICE_NAME = "api_pb.ApiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.SubscribeRequest,
      counters.minter.grpc.client.SubscribeResponse> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = counters.minter.grpc.client.SubscribeRequest.class,
      responseType = counters.minter.grpc.client.SubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.SubscribeRequest,
      counters.minter.grpc.client.SubscribeResponse> getSubscribeMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.SubscribeRequest, counters.minter.grpc.client.SubscribeResponse> getSubscribeMethod;
    if ((getSubscribeMethod = ApiServiceGrpc.getSubscribeMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSubscribeMethod = ApiServiceGrpc.getSubscribeMethod) == null) {
          ApiServiceGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.SubscribeRequest, counters.minter.grpc.client.SubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.HaltsRequest,
      counters.minter.grpc.client.HaltsResponse> getHaltsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Halts",
      requestType = counters.minter.grpc.client.HaltsRequest.class,
      responseType = counters.minter.grpc.client.HaltsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.HaltsRequest,
      counters.minter.grpc.client.HaltsResponse> getHaltsMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.HaltsRequest, counters.minter.grpc.client.HaltsResponse> getHaltsMethod;
    if ((getHaltsMethod = ApiServiceGrpc.getHaltsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getHaltsMethod = ApiServiceGrpc.getHaltsMethod) == null) {
          ApiServiceGrpc.getHaltsMethod = getHaltsMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.HaltsRequest, counters.minter.grpc.client.HaltsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.HaltsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.HaltsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Halts"))
              .build();
        }
      }
    }
    return getHaltsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.GenesisResponse> getGenesisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Genesis",
      requestType = com.google.protobuf.Empty.class,
      responseType = counters.minter.grpc.client.GenesisResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.GenesisResponse> getGenesisMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, counters.minter.grpc.client.GenesisResponse> getGenesisMethod;
    if ((getGenesisMethod = ApiServiceGrpc.getGenesisMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGenesisMethod = ApiServiceGrpc.getGenesisMethod) == null) {
          ApiServiceGrpc.getGenesisMethod = getGenesisMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, counters.minter.grpc.client.GenesisResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Genesis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.GenesisResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Genesis"))
              .build();
        }
      }
    }
    return getGenesisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.MinGasPriceResponse> getMinGasPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinGasPrice",
      requestType = com.google.protobuf.Empty.class,
      responseType = counters.minter.grpc.client.MinGasPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.MinGasPriceResponse> getMinGasPriceMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, counters.minter.grpc.client.MinGasPriceResponse> getMinGasPriceMethod;
    if ((getMinGasPriceMethod = ApiServiceGrpc.getMinGasPriceMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getMinGasPriceMethod = ApiServiceGrpc.getMinGasPriceMethod) == null) {
          ApiServiceGrpc.getMinGasPriceMethod = getMinGasPriceMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, counters.minter.grpc.client.MinGasPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinGasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.MinGasPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("MinGasPrice"))
              .build();
        }
      }
    }
    return getMinGasPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.NetInfoResponse> getNetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NetInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = counters.minter.grpc.client.NetInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.NetInfoResponse> getNetInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, counters.minter.grpc.client.NetInfoResponse> getNetInfoMethod;
    if ((getNetInfoMethod = ApiServiceGrpc.getNetInfoMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getNetInfoMethod = ApiServiceGrpc.getNetInfoMethod) == null) {
          ApiServiceGrpc.getNetInfoMethod = getNetInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, counters.minter.grpc.client.NetInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.NetInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("NetInfo"))
              .build();
        }
      }
    }
    return getNetInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.StatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = com.google.protobuf.Empty.class,
      responseType = counters.minter.grpc.client.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.StatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, counters.minter.grpc.client.StatusResponse> getStatusMethod;
    if ((getStatusMethod = ApiServiceGrpc.getStatusMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getStatusMethod = ApiServiceGrpc.getStatusMethod) == null) {
          ApiServiceGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, counters.minter.grpc.client.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.AddressRequest,
      counters.minter.grpc.client.AddressResponse> getAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Address",
      requestType = counters.minter.grpc.client.AddressRequest.class,
      responseType = counters.minter.grpc.client.AddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.AddressRequest,
      counters.minter.grpc.client.AddressResponse> getAddressMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.AddressRequest, counters.minter.grpc.client.AddressResponse> getAddressMethod;
    if ((getAddressMethod = ApiServiceGrpc.getAddressMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getAddressMethod = ApiServiceGrpc.getAddressMethod) == null) {
          ApiServiceGrpc.getAddressMethod = getAddressMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.AddressRequest, counters.minter.grpc.client.AddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Address"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.AddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.AddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Address"))
              .build();
        }
      }
    }
    return getAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.AddressesRequest,
      counters.minter.grpc.client.AddressesResponse> getAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Addresses",
      requestType = counters.minter.grpc.client.AddressesRequest.class,
      responseType = counters.minter.grpc.client.AddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.AddressesRequest,
      counters.minter.grpc.client.AddressesResponse> getAddressesMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.AddressesRequest, counters.minter.grpc.client.AddressesResponse> getAddressesMethod;
    if ((getAddressesMethod = ApiServiceGrpc.getAddressesMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getAddressesMethod = ApiServiceGrpc.getAddressesMethod) == null) {
          ApiServiceGrpc.getAddressesMethod = getAddressesMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.AddressesRequest, counters.minter.grpc.client.AddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Addresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.AddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.AddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Addresses"))
              .build();
        }
      }
    }
    return getAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.BlockRequest,
      counters.minter.grpc.client.BlockResponse> getBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Block",
      requestType = counters.minter.grpc.client.BlockRequest.class,
      responseType = counters.minter.grpc.client.BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.BlockRequest,
      counters.minter.grpc.client.BlockResponse> getBlockMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.BlockRequest, counters.minter.grpc.client.BlockResponse> getBlockMethod;
    if ((getBlockMethod = ApiServiceGrpc.getBlockMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getBlockMethod = ApiServiceGrpc.getBlockMethod) == null) {
          ApiServiceGrpc.getBlockMethod = getBlockMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.BlockRequest, counters.minter.grpc.client.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Block"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.BlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Block"))
              .build();
        }
      }
    }
    return getBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.CandidateRequest,
      counters.minter.grpc.client.CandidateResponse> getCandidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Candidate",
      requestType = counters.minter.grpc.client.CandidateRequest.class,
      responseType = counters.minter.grpc.client.CandidateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.CandidateRequest,
      counters.minter.grpc.client.CandidateResponse> getCandidateMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.CandidateRequest, counters.minter.grpc.client.CandidateResponse> getCandidateMethod;
    if ((getCandidateMethod = ApiServiceGrpc.getCandidateMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCandidateMethod = ApiServiceGrpc.getCandidateMethod) == null) {
          ApiServiceGrpc.getCandidateMethod = getCandidateMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.CandidateRequest, counters.minter.grpc.client.CandidateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Candidate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CandidateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CandidateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Candidate"))
              .build();
        }
      }
    }
    return getCandidateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.CandidatesRequest,
      counters.minter.grpc.client.CandidatesResponse> getCandidatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Candidates",
      requestType = counters.minter.grpc.client.CandidatesRequest.class,
      responseType = counters.minter.grpc.client.CandidatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.CandidatesRequest,
      counters.minter.grpc.client.CandidatesResponse> getCandidatesMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.CandidatesRequest, counters.minter.grpc.client.CandidatesResponse> getCandidatesMethod;
    if ((getCandidatesMethod = ApiServiceGrpc.getCandidatesMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCandidatesMethod = ApiServiceGrpc.getCandidatesMethod) == null) {
          ApiServiceGrpc.getCandidatesMethod = getCandidatesMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.CandidatesRequest, counters.minter.grpc.client.CandidatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Candidates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CandidatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CandidatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Candidates"))
              .build();
        }
      }
    }
    return getCandidatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.CoinIdRequest,
      counters.minter.grpc.client.CoinInfoResponse> getCoinInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CoinInfoById",
      requestType = counters.minter.grpc.client.CoinIdRequest.class,
      responseType = counters.minter.grpc.client.CoinInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.CoinIdRequest,
      counters.minter.grpc.client.CoinInfoResponse> getCoinInfoByIdMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.CoinIdRequest, counters.minter.grpc.client.CoinInfoResponse> getCoinInfoByIdMethod;
    if ((getCoinInfoByIdMethod = ApiServiceGrpc.getCoinInfoByIdMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCoinInfoByIdMethod = ApiServiceGrpc.getCoinInfoByIdMethod) == null) {
          ApiServiceGrpc.getCoinInfoByIdMethod = getCoinInfoByIdMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.CoinIdRequest, counters.minter.grpc.client.CoinInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CoinInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CoinIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CoinInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("CoinInfoById"))
              .build();
        }
      }
    }
    return getCoinInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.CoinInfoRequest,
      counters.minter.grpc.client.CoinInfoResponse> getCoinInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CoinInfo",
      requestType = counters.minter.grpc.client.CoinInfoRequest.class,
      responseType = counters.minter.grpc.client.CoinInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.CoinInfoRequest,
      counters.minter.grpc.client.CoinInfoResponse> getCoinInfoMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.CoinInfoRequest, counters.minter.grpc.client.CoinInfoResponse> getCoinInfoMethod;
    if ((getCoinInfoMethod = ApiServiceGrpc.getCoinInfoMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCoinInfoMethod = ApiServiceGrpc.getCoinInfoMethod) == null) {
          ApiServiceGrpc.getCoinInfoMethod = getCoinInfoMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.CoinInfoRequest, counters.minter.grpc.client.CoinInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CoinInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CoinInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CoinInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("CoinInfo"))
              .build();
        }
      }
    }
    return getCoinInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinBuyRequest,
      counters.minter.grpc.client.EstimateCoinBuyResponse> getEstimateCoinBuyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateCoinBuy",
      requestType = counters.minter.grpc.client.EstimateCoinBuyRequest.class,
      responseType = counters.minter.grpc.client.EstimateCoinBuyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinBuyRequest,
      counters.minter.grpc.client.EstimateCoinBuyResponse> getEstimateCoinBuyMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinBuyRequest, counters.minter.grpc.client.EstimateCoinBuyResponse> getEstimateCoinBuyMethod;
    if ((getEstimateCoinBuyMethod = ApiServiceGrpc.getEstimateCoinBuyMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEstimateCoinBuyMethod = ApiServiceGrpc.getEstimateCoinBuyMethod) == null) {
          ApiServiceGrpc.getEstimateCoinBuyMethod = getEstimateCoinBuyMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.EstimateCoinBuyRequest, counters.minter.grpc.client.EstimateCoinBuyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateCoinBuy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EstimateCoinBuyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EstimateCoinBuyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("EstimateCoinBuy"))
              .build();
        }
      }
    }
    return getEstimateCoinBuyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinSellRequest,
      counters.minter.grpc.client.EstimateCoinSellResponse> getEstimateCoinSellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateCoinSell",
      requestType = counters.minter.grpc.client.EstimateCoinSellRequest.class,
      responseType = counters.minter.grpc.client.EstimateCoinSellResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinSellRequest,
      counters.minter.grpc.client.EstimateCoinSellResponse> getEstimateCoinSellMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinSellRequest, counters.minter.grpc.client.EstimateCoinSellResponse> getEstimateCoinSellMethod;
    if ((getEstimateCoinSellMethod = ApiServiceGrpc.getEstimateCoinSellMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEstimateCoinSellMethod = ApiServiceGrpc.getEstimateCoinSellMethod) == null) {
          ApiServiceGrpc.getEstimateCoinSellMethod = getEstimateCoinSellMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.EstimateCoinSellRequest, counters.minter.grpc.client.EstimateCoinSellResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateCoinSell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EstimateCoinSellRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EstimateCoinSellResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("EstimateCoinSell"))
              .build();
        }
      }
    }
    return getEstimateCoinSellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinSellAllRequest,
      counters.minter.grpc.client.EstimateCoinSellAllResponse> getEstimateCoinSellAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateCoinSellAll",
      requestType = counters.minter.grpc.client.EstimateCoinSellAllRequest.class,
      responseType = counters.minter.grpc.client.EstimateCoinSellAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinSellAllRequest,
      counters.minter.grpc.client.EstimateCoinSellAllResponse> getEstimateCoinSellAllMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateCoinSellAllRequest, counters.minter.grpc.client.EstimateCoinSellAllResponse> getEstimateCoinSellAllMethod;
    if ((getEstimateCoinSellAllMethod = ApiServiceGrpc.getEstimateCoinSellAllMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEstimateCoinSellAllMethod = ApiServiceGrpc.getEstimateCoinSellAllMethod) == null) {
          ApiServiceGrpc.getEstimateCoinSellAllMethod = getEstimateCoinSellAllMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.EstimateCoinSellAllRequest, counters.minter.grpc.client.EstimateCoinSellAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateCoinSellAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EstimateCoinSellAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EstimateCoinSellAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("EstimateCoinSellAll"))
              .build();
        }
      }
    }
    return getEstimateCoinSellAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateTxCommissionRequest,
      counters.minter.grpc.client.EstimateTxCommissionResponse> getEstimateTxCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateTxCommission",
      requestType = counters.minter.grpc.client.EstimateTxCommissionRequest.class,
      responseType = counters.minter.grpc.client.EstimateTxCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateTxCommissionRequest,
      counters.minter.grpc.client.EstimateTxCommissionResponse> getEstimateTxCommissionMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.EstimateTxCommissionRequest, counters.minter.grpc.client.EstimateTxCommissionResponse> getEstimateTxCommissionMethod;
    if ((getEstimateTxCommissionMethod = ApiServiceGrpc.getEstimateTxCommissionMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEstimateTxCommissionMethod = ApiServiceGrpc.getEstimateTxCommissionMethod) == null) {
          ApiServiceGrpc.getEstimateTxCommissionMethod = getEstimateTxCommissionMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.EstimateTxCommissionRequest, counters.minter.grpc.client.EstimateTxCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateTxCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EstimateTxCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EstimateTxCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("EstimateTxCommission"))
              .build();
        }
      }
    }
    return getEstimateTxCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.EventsRequest,
      counters.minter.grpc.client.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = counters.minter.grpc.client.EventsRequest.class,
      responseType = counters.minter.grpc.client.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.EventsRequest,
      counters.minter.grpc.client.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.EventsRequest, counters.minter.grpc.client.EventsResponse> getEventsMethod;
    if ((getEventsMethod = ApiServiceGrpc.getEventsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEventsMethod = ApiServiceGrpc.getEventsMethod) == null) {
          ApiServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.EventsRequest, counters.minter.grpc.client.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.MaxGasPriceRequest,
      counters.minter.grpc.client.MaxGasPriceResponse> getMaxGasPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxGasPrice",
      requestType = counters.minter.grpc.client.MaxGasPriceRequest.class,
      responseType = counters.minter.grpc.client.MaxGasPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.MaxGasPriceRequest,
      counters.minter.grpc.client.MaxGasPriceResponse> getMaxGasPriceMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.MaxGasPriceRequest, counters.minter.grpc.client.MaxGasPriceResponse> getMaxGasPriceMethod;
    if ((getMaxGasPriceMethod = ApiServiceGrpc.getMaxGasPriceMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getMaxGasPriceMethod = ApiServiceGrpc.getMaxGasPriceMethod) == null) {
          ApiServiceGrpc.getMaxGasPriceMethod = getMaxGasPriceMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.MaxGasPriceRequest, counters.minter.grpc.client.MaxGasPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxGasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.MaxGasPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.MaxGasPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("MaxGasPrice"))
              .build();
        }
      }
    }
    return getMaxGasPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.MissedBlocksRequest,
      counters.minter.grpc.client.MissedBlocksResponse> getMissedBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MissedBlocks",
      requestType = counters.minter.grpc.client.MissedBlocksRequest.class,
      responseType = counters.minter.grpc.client.MissedBlocksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.MissedBlocksRequest,
      counters.minter.grpc.client.MissedBlocksResponse> getMissedBlocksMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.MissedBlocksRequest, counters.minter.grpc.client.MissedBlocksResponse> getMissedBlocksMethod;
    if ((getMissedBlocksMethod = ApiServiceGrpc.getMissedBlocksMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getMissedBlocksMethod = ApiServiceGrpc.getMissedBlocksMethod) == null) {
          ApiServiceGrpc.getMissedBlocksMethod = getMissedBlocksMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.MissedBlocksRequest, counters.minter.grpc.client.MissedBlocksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MissedBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.MissedBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.MissedBlocksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("MissedBlocks"))
              .build();
        }
      }
    }
    return getMissedBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.SendTransactionRequest,
      counters.minter.grpc.client.SendTransactionResponse> getSendTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTransaction",
      requestType = counters.minter.grpc.client.SendTransactionRequest.class,
      responseType = counters.minter.grpc.client.SendTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.SendTransactionRequest,
      counters.minter.grpc.client.SendTransactionResponse> getSendTransactionMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.SendTransactionRequest, counters.minter.grpc.client.SendTransactionResponse> getSendTransactionMethod;
    if ((getSendTransactionMethod = ApiServiceGrpc.getSendTransactionMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSendTransactionMethod = ApiServiceGrpc.getSendTransactionMethod) == null) {
          ApiServiceGrpc.getSendTransactionMethod = getSendTransactionMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.SendTransactionRequest, counters.minter.grpc.client.SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SendTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SendTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("SendTransaction"))
              .build();
        }
      }
    }
    return getSendTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.TransactionRequest,
      counters.minter.grpc.client.TransactionResponse> getTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transaction",
      requestType = counters.minter.grpc.client.TransactionRequest.class,
      responseType = counters.minter.grpc.client.TransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.TransactionRequest,
      counters.minter.grpc.client.TransactionResponse> getTransactionMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.TransactionRequest, counters.minter.grpc.client.TransactionResponse> getTransactionMethod;
    if ((getTransactionMethod = ApiServiceGrpc.getTransactionMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getTransactionMethod = ApiServiceGrpc.getTransactionMethod) == null) {
          ApiServiceGrpc.getTransactionMethod = getTransactionMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.TransactionRequest, counters.minter.grpc.client.TransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.TransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.TransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Transaction"))
              .build();
        }
      }
    }
    return getTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.TransactionsRequest,
      counters.minter.grpc.client.TransactionsResponse> getTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transactions",
      requestType = counters.minter.grpc.client.TransactionsRequest.class,
      responseType = counters.minter.grpc.client.TransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.TransactionsRequest,
      counters.minter.grpc.client.TransactionsResponse> getTransactionsMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.TransactionsRequest, counters.minter.grpc.client.TransactionsResponse> getTransactionsMethod;
    if ((getTransactionsMethod = ApiServiceGrpc.getTransactionsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getTransactionsMethod = ApiServiceGrpc.getTransactionsMethod) == null) {
          ApiServiceGrpc.getTransactionsMethod = getTransactionsMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.TransactionsRequest, counters.minter.grpc.client.TransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.TransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.TransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Transactions"))
              .build();
        }
      }
    }
    return getTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.UnconfirmedTxsRequest,
      counters.minter.grpc.client.UnconfirmedTxsResponse> getUnconfirmedTxsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnconfirmedTxs",
      requestType = counters.minter.grpc.client.UnconfirmedTxsRequest.class,
      responseType = counters.minter.grpc.client.UnconfirmedTxsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.UnconfirmedTxsRequest,
      counters.minter.grpc.client.UnconfirmedTxsResponse> getUnconfirmedTxsMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.UnconfirmedTxsRequest, counters.minter.grpc.client.UnconfirmedTxsResponse> getUnconfirmedTxsMethod;
    if ((getUnconfirmedTxsMethod = ApiServiceGrpc.getUnconfirmedTxsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getUnconfirmedTxsMethod = ApiServiceGrpc.getUnconfirmedTxsMethod) == null) {
          ApiServiceGrpc.getUnconfirmedTxsMethod = getUnconfirmedTxsMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.UnconfirmedTxsRequest, counters.minter.grpc.client.UnconfirmedTxsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnconfirmedTxs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.UnconfirmedTxsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.UnconfirmedTxsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("UnconfirmedTxs"))
              .build();
        }
      }
    }
    return getUnconfirmedTxsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.ValidatorsRequest,
      counters.minter.grpc.client.ValidatorsResponse> getValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validators",
      requestType = counters.minter.grpc.client.ValidatorsRequest.class,
      responseType = counters.minter.grpc.client.ValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.ValidatorsRequest,
      counters.minter.grpc.client.ValidatorsResponse> getValidatorsMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.ValidatorsRequest, counters.minter.grpc.client.ValidatorsResponse> getValidatorsMethod;
    if ((getValidatorsMethod = ApiServiceGrpc.getValidatorsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getValidatorsMethod = ApiServiceGrpc.getValidatorsMethod) == null) {
          ApiServiceGrpc.getValidatorsMethod = getValidatorsMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.ValidatorsRequest, counters.minter.grpc.client.ValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.ValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.ValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Validators"))
              .build();
        }
      }
    }
    return getValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.FrozenRequest,
      counters.minter.grpc.client.FrozenResponse> getFrozenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Frozen",
      requestType = counters.minter.grpc.client.FrozenRequest.class,
      responseType = counters.minter.grpc.client.FrozenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.FrozenRequest,
      counters.minter.grpc.client.FrozenResponse> getFrozenMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.FrozenRequest, counters.minter.grpc.client.FrozenResponse> getFrozenMethod;
    if ((getFrozenMethod = ApiServiceGrpc.getFrozenMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getFrozenMethod = ApiServiceGrpc.getFrozenMethod) == null) {
          ApiServiceGrpc.getFrozenMethod = getFrozenMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.FrozenRequest, counters.minter.grpc.client.FrozenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Frozen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.FrozenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.FrozenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Frozen"))
              .build();
        }
      }
    }
    return getFrozenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.FrozenAllRequest,
      counters.minter.grpc.client.FrozenResponse> getFrozenAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FrozenAll",
      requestType = counters.minter.grpc.client.FrozenAllRequest.class,
      responseType = counters.minter.grpc.client.FrozenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.FrozenAllRequest,
      counters.minter.grpc.client.FrozenResponse> getFrozenAllMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.FrozenAllRequest, counters.minter.grpc.client.FrozenResponse> getFrozenAllMethod;
    if ((getFrozenAllMethod = ApiServiceGrpc.getFrozenAllMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getFrozenAllMethod = ApiServiceGrpc.getFrozenAllMethod) == null) {
          ApiServiceGrpc.getFrozenAllMethod = getFrozenAllMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.FrozenAllRequest, counters.minter.grpc.client.FrozenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FrozenAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.FrozenAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.FrozenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("FrozenAll"))
              .build();
        }
      }
    }
    return getFrozenAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.WaitListRequest,
      counters.minter.grpc.client.WaitListResponse> getWaitListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaitList",
      requestType = counters.minter.grpc.client.WaitListRequest.class,
      responseType = counters.minter.grpc.client.WaitListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.WaitListRequest,
      counters.minter.grpc.client.WaitListResponse> getWaitListMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.WaitListRequest, counters.minter.grpc.client.WaitListResponse> getWaitListMethod;
    if ((getWaitListMethod = ApiServiceGrpc.getWaitListMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getWaitListMethod = ApiServiceGrpc.getWaitListMethod) == null) {
          ApiServiceGrpc.getWaitListMethod = getWaitListMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.WaitListRequest, counters.minter.grpc.client.WaitListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaitList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.WaitListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.WaitListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("WaitList"))
              .build();
        }
      }
    }
    return getWaitListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.BlockResponse> getTestBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestBlock",
      requestType = com.google.protobuf.Empty.class,
      responseType = counters.minter.grpc.client.BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      counters.minter.grpc.client.BlockResponse> getTestBlockMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, counters.minter.grpc.client.BlockResponse> getTestBlockMethod;
    if ((getTestBlockMethod = ApiServiceGrpc.getTestBlockMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getTestBlockMethod = ApiServiceGrpc.getTestBlockMethod) == null) {
          ApiServiceGrpc.getTestBlockMethod = getTestBlockMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, counters.minter.grpc.client.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("TestBlock"))
              .build();
        }
      }
    }
    return getTestBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolRequest,
      counters.minter.grpc.client.SwapPoolResponse> getSwapPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapPool",
      requestType = counters.minter.grpc.client.SwapPoolRequest.class,
      responseType = counters.minter.grpc.client.SwapPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolRequest,
      counters.minter.grpc.client.SwapPoolResponse> getSwapPoolMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolRequest, counters.minter.grpc.client.SwapPoolResponse> getSwapPoolMethod;
    if ((getSwapPoolMethod = ApiServiceGrpc.getSwapPoolMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSwapPoolMethod = ApiServiceGrpc.getSwapPoolMethod) == null) {
          ApiServiceGrpc.getSwapPoolMethod = getSwapPoolMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.SwapPoolRequest, counters.minter.grpc.client.SwapPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SwapPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SwapPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("SwapPool"))
              .build();
        }
      }
    }
    return getSwapPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolsRequest,
      counters.minter.grpc.client.SwapPoolsResponse> getSwapPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapPools",
      requestType = counters.minter.grpc.client.SwapPoolsRequest.class,
      responseType = counters.minter.grpc.client.SwapPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolsRequest,
      counters.minter.grpc.client.SwapPoolsResponse> getSwapPoolsMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolsRequest, counters.minter.grpc.client.SwapPoolsResponse> getSwapPoolsMethod;
    if ((getSwapPoolsMethod = ApiServiceGrpc.getSwapPoolsMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSwapPoolsMethod = ApiServiceGrpc.getSwapPoolsMethod) == null) {
          ApiServiceGrpc.getSwapPoolsMethod = getSwapPoolsMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.SwapPoolsRequest, counters.minter.grpc.client.SwapPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SwapPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SwapPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("SwapPools"))
              .build();
        }
      }
    }
    return getSwapPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolProviderRequest,
      counters.minter.grpc.client.SwapPoolResponse> getSwapPoolProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapPoolProvider",
      requestType = counters.minter.grpc.client.SwapPoolProviderRequest.class,
      responseType = counters.minter.grpc.client.SwapPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolProviderRequest,
      counters.minter.grpc.client.SwapPoolResponse> getSwapPoolProviderMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.SwapPoolProviderRequest, counters.minter.grpc.client.SwapPoolResponse> getSwapPoolProviderMethod;
    if ((getSwapPoolProviderMethod = ApiServiceGrpc.getSwapPoolProviderMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSwapPoolProviderMethod = ApiServiceGrpc.getSwapPoolProviderMethod) == null) {
          ApiServiceGrpc.getSwapPoolProviderMethod = getSwapPoolProviderMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.SwapPoolProviderRequest, counters.minter.grpc.client.SwapPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapPoolProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SwapPoolProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.SwapPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("SwapPoolProvider"))
              .build();
        }
      }
    }
    return getSwapPoolProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.PriceCommissionRequest,
      counters.minter.grpc.client.PriceCommissionResponse> getPriceCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PriceCommission",
      requestType = counters.minter.grpc.client.PriceCommissionRequest.class,
      responseType = counters.minter.grpc.client.PriceCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.PriceCommissionRequest,
      counters.minter.grpc.client.PriceCommissionResponse> getPriceCommissionMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.PriceCommissionRequest, counters.minter.grpc.client.PriceCommissionResponse> getPriceCommissionMethod;
    if ((getPriceCommissionMethod = ApiServiceGrpc.getPriceCommissionMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getPriceCommissionMethod = ApiServiceGrpc.getPriceCommissionMethod) == null) {
          ApiServiceGrpc.getPriceCommissionMethod = getPriceCommissionMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.PriceCommissionRequest, counters.minter.grpc.client.PriceCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PriceCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.PriceCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.PriceCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("PriceCommission"))
              .build();
        }
      }
    }
    return getPriceCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.VersionNetworkRequest,
      counters.minter.grpc.client.VersionNetworkResponse> getVersionNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VersionNetwork",
      requestType = counters.minter.grpc.client.VersionNetworkRequest.class,
      responseType = counters.minter.grpc.client.VersionNetworkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.VersionNetworkRequest,
      counters.minter.grpc.client.VersionNetworkResponse> getVersionNetworkMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.VersionNetworkRequest, counters.minter.grpc.client.VersionNetworkResponse> getVersionNetworkMethod;
    if ((getVersionNetworkMethod = ApiServiceGrpc.getVersionNetworkMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getVersionNetworkMethod = ApiServiceGrpc.getVersionNetworkMethod) == null) {
          ApiServiceGrpc.getVersionNetworkMethod = getVersionNetworkMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.VersionNetworkRequest, counters.minter.grpc.client.VersionNetworkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VersionNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.VersionNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.VersionNetworkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("VersionNetwork"))
              .build();
        }
      }
    }
    return getVersionNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.CommissionVotesRequest,
      counters.minter.grpc.client.CommissionVotesResponse> getCommissionVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommissionVotes",
      requestType = counters.minter.grpc.client.CommissionVotesRequest.class,
      responseType = counters.minter.grpc.client.CommissionVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.CommissionVotesRequest,
      counters.minter.grpc.client.CommissionVotesResponse> getCommissionVotesMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.CommissionVotesRequest, counters.minter.grpc.client.CommissionVotesResponse> getCommissionVotesMethod;
    if ((getCommissionVotesMethod = ApiServiceGrpc.getCommissionVotesMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCommissionVotesMethod = ApiServiceGrpc.getCommissionVotesMethod) == null) {
          ApiServiceGrpc.getCommissionVotesMethod = getCommissionVotesMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.CommissionVotesRequest, counters.minter.grpc.client.CommissionVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommissionVotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CommissionVotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.CommissionVotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("CommissionVotes"))
              .build();
        }
      }
    }
    return getCommissionVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.UpdateVotesRequest,
      counters.minter.grpc.client.UpdateVotesResponse> getUpdateVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVotes",
      requestType = counters.minter.grpc.client.UpdateVotesRequest.class,
      responseType = counters.minter.grpc.client.UpdateVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.UpdateVotesRequest,
      counters.minter.grpc.client.UpdateVotesResponse> getUpdateVotesMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.UpdateVotesRequest, counters.minter.grpc.client.UpdateVotesResponse> getUpdateVotesMethod;
    if ((getUpdateVotesMethod = ApiServiceGrpc.getUpdateVotesMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getUpdateVotesMethod = ApiServiceGrpc.getUpdateVotesMethod) == null) {
          ApiServiceGrpc.getUpdateVotesMethod = getUpdateVotesMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.UpdateVotesRequest, counters.minter.grpc.client.UpdateVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.UpdateVotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.UpdateVotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("UpdateVotes"))
              .build();
        }
      }
    }
    return getUpdateVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.BlocksRequest,
      counters.minter.grpc.client.BlocksResponse> getBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blocks",
      requestType = counters.minter.grpc.client.BlocksRequest.class,
      responseType = counters.minter.grpc.client.BlocksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.BlocksRequest,
      counters.minter.grpc.client.BlocksResponse> getBlocksMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.BlocksRequest, counters.minter.grpc.client.BlocksResponse> getBlocksMethod;
    if ((getBlocksMethod = ApiServiceGrpc.getBlocksMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getBlocksMethod = ApiServiceGrpc.getBlocksMethod) == null) {
          ApiServiceGrpc.getBlocksMethod = getBlocksMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.BlocksRequest, counters.minter.grpc.client.BlocksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.BlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.BlocksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Blocks"))
              .build();
        }
      }
    }
    return getBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrderRequest,
      counters.minter.grpc.client.LimitOrderResponse> getLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrder",
      requestType = counters.minter.grpc.client.LimitOrderRequest.class,
      responseType = counters.minter.grpc.client.LimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrderRequest,
      counters.minter.grpc.client.LimitOrderResponse> getLimitOrderMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrderRequest, counters.minter.grpc.client.LimitOrderResponse> getLimitOrderMethod;
    if ((getLimitOrderMethod = ApiServiceGrpc.getLimitOrderMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getLimitOrderMethod = ApiServiceGrpc.getLimitOrderMethod) == null) {
          ApiServiceGrpc.getLimitOrderMethod = getLimitOrderMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.LimitOrderRequest, counters.minter.grpc.client.LimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.LimitOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.LimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("LimitOrder"))
              .build();
        }
      }
    }
    return getLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrdersOfPoolRequest,
      counters.minter.grpc.client.LimitOrdersOfPoolResponse> getLimitOrdersOfPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrdersOfPool",
      requestType = counters.minter.grpc.client.LimitOrdersOfPoolRequest.class,
      responseType = counters.minter.grpc.client.LimitOrdersOfPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrdersOfPoolRequest,
      counters.minter.grpc.client.LimitOrdersOfPoolResponse> getLimitOrdersOfPoolMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrdersOfPoolRequest, counters.minter.grpc.client.LimitOrdersOfPoolResponse> getLimitOrdersOfPoolMethod;
    if ((getLimitOrdersOfPoolMethod = ApiServiceGrpc.getLimitOrdersOfPoolMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getLimitOrdersOfPoolMethod = ApiServiceGrpc.getLimitOrdersOfPoolMethod) == null) {
          ApiServiceGrpc.getLimitOrdersOfPoolMethod = getLimitOrdersOfPoolMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.LimitOrdersOfPoolRequest, counters.minter.grpc.client.LimitOrdersOfPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrdersOfPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.LimitOrdersOfPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.LimitOrdersOfPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("LimitOrdersOfPool"))
              .build();
        }
      }
    }
    return getLimitOrdersOfPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrdersRequest,
      counters.minter.grpc.client.LimitOrdersResponse> getLimitOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrders",
      requestType = counters.minter.grpc.client.LimitOrdersRequest.class,
      responseType = counters.minter.grpc.client.LimitOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrdersRequest,
      counters.minter.grpc.client.LimitOrdersResponse> getLimitOrdersMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.LimitOrdersRequest, counters.minter.grpc.client.LimitOrdersResponse> getLimitOrdersMethod;
    if ((getLimitOrdersMethod = ApiServiceGrpc.getLimitOrdersMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getLimitOrdersMethod = ApiServiceGrpc.getLimitOrdersMethod) == null) {
          ApiServiceGrpc.getLimitOrdersMethod = getLimitOrdersMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.LimitOrdersRequest, counters.minter.grpc.client.LimitOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.LimitOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.LimitOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("LimitOrders"))
              .build();
        }
      }
    }
    return getLimitOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<counters.minter.grpc.client.BestTradeRequest,
      counters.minter.grpc.client.BestTradeResponse> getBestTradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BestTrade",
      requestType = counters.minter.grpc.client.BestTradeRequest.class,
      responseType = counters.minter.grpc.client.BestTradeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<counters.minter.grpc.client.BestTradeRequest,
      counters.minter.grpc.client.BestTradeResponse> getBestTradeMethod() {
    io.grpc.MethodDescriptor<counters.minter.grpc.client.BestTradeRequest, counters.minter.grpc.client.BestTradeResponse> getBestTradeMethod;
    if ((getBestTradeMethod = ApiServiceGrpc.getBestTradeMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getBestTradeMethod = ApiServiceGrpc.getBestTradeMethod) == null) {
          ApiServiceGrpc.getBestTradeMethod = getBestTradeMethod =
              io.grpc.MethodDescriptor.<counters.minter.grpc.client.BestTradeRequest, counters.minter.grpc.client.BestTradeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BestTrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.BestTradeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  counters.minter.grpc.client.BestTradeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("BestTrade"))
              .build();
        }
      }
    }
    return getBestTradeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiServiceStub>() {
        @java.lang.Override
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
        @java.lang.Override
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
        @java.lang.Override
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
    public void subscribe(counters.minter.grpc.client.SubscribeRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SubscribeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public void halts(counters.minter.grpc.client.HaltsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.HaltsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHaltsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public void genesis(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.GenesisResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenesisMethod(), responseObserver);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public void minGasPrice(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MinGasPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMinGasPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public void netInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.NetInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNetInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public void status(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public void address(counters.minter.grpc.client.AddressRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public void addresses(counters.minter.grpc.client.AddressesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public void block(counters.minter.grpc.client.BlockRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockMethod(), responseObserver);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCandidateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public void candidates(counters.minter.grpc.client.CandidatesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CandidatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCandidatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public void coinInfoById(counters.minter.grpc.client.CoinIdRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCoinInfoByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public void coinInfo(counters.minter.grpc.client.CoinInfoRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCoinInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public void estimateCoinBuy(counters.minter.grpc.client.EstimateCoinBuyRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinBuyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateCoinBuyMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public void estimateCoinSell(counters.minter.grpc.client.EstimateCoinSellRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateCoinSellMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public void estimateCoinSellAll(counters.minter.grpc.client.EstimateCoinSellAllRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateCoinSellAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public void estimateTxCommission(counters.minter.grpc.client.EstimateTxCommissionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateTxCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateTxCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public void events(counters.minter.grpc.client.EventsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public void maxGasPrice(counters.minter.grpc.client.MaxGasPriceRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MaxGasPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMaxGasPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public void missedBlocks(counters.minter.grpc.client.MissedBlocksRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MissedBlocksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMissedBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public void sendTransaction(counters.minter.grpc.client.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SendTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public void transaction(counters.minter.grpc.client.TransactionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public void transactions(counters.minter.grpc.client.TransactionsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public void unconfirmedTxs(counters.minter.grpc.client.UnconfirmedTxsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.UnconfirmedTxsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnconfirmedTxsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public void validators(counters.minter.grpc.client.ValidatorsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.ValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * Deprecated: Use FrozenAll instead.
     * </pre>
     */
    public void frozen(counters.minter.grpc.client.FrozenRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.FrozenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFrozenMethod(), responseObserver);
    }

    /**
     * <pre>
     * FrozenAll
     * FrozenAll returns frozen balance.
     * </pre>
     */
    public void frozenAll(counters.minter.grpc.client.FrozenAllRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.FrozenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFrozenAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public void waitList(counters.minter.grpc.client.WaitListRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.WaitListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWaitListMethod(), responseObserver);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public void testBlock(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * SwapPool
     * SwapPool returns total supply and reserves.
     * </pre>
     */
    public void swapPool(counters.minter.grpc.client.SwapPoolRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * SwapPools
     * SwapPools returns list of all pools.
     * </pre>
     */
    public void swapPools(counters.minter.grpc.client.SwapPoolsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * SwapPoolProvider returns reserves and liquidity balance of provider.
     * </pre>
     */
    public void swapPoolProvider(counters.minter.grpc.client.SwapPoolProviderRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapPoolProviderMethod(), responseObserver);
    }

    /**
     * <pre>
     * PriceCommission
     * PriceCommission returns commissions.
     * </pre>
     */
    public void priceCommission(counters.minter.grpc.client.PriceCommissionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.PriceCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPriceCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * VersionNetwork
     * VersionNetwork returns versions network.
     * </pre>
     */
    public void versionNetwork(counters.minter.grpc.client.VersionNetworkRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.VersionNetworkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVersionNetworkMethod(), responseObserver);
    }

    /**
     * <pre>
     * CommissionVotes
     * CommissionVotes returns votes for update commissions.
     * </pre>
     */
    public void commissionVotes(counters.minter.grpc.client.CommissionVotesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CommissionVotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommissionVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateVotes
     * UpdateVotes returns votes for update network.
     * </pre>
     */
    public void updateVotes(counters.minter.grpc.client.UpdateVotesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.UpdateVotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Blocks
     * Blocks returns blocks at given interval.
     * </pre>
     */
    public void blocks(counters.minter.grpc.client.BlocksRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlocksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * LimitOrder
     * LimitOrder returns order by ID.
     * </pre>
     */
    public void limitOrder(counters.minter.grpc.client.LimitOrderRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * LimitOrdersOfPool returns sell orders for a pair of coins.
     * </pre>
     */
    public void limitOrdersOfPool(counters.minter.grpc.client.LimitOrdersOfPoolRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersOfPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrdersOfPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * LimitOrders
     * LimitOrders returns orders by IDs.
     * </pre>
     */
    public void limitOrders(counters.minter.grpc.client.LimitOrdersRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * BestTrade
     * BestTrade returns optimal exchange route.
     * </pre>
     */
    public void bestTrade(counters.minter.grpc.client.BestTradeRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BestTradeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBestTradeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                counters.minter.grpc.client.SubscribeRequest,
                counters.minter.grpc.client.SubscribeResponse>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getHaltsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.HaltsRequest,
                counters.minter.grpc.client.HaltsResponse>(
                  this, METHODID_HALTS)))
          .addMethod(
            getGenesisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.GenesisResponse>(
                  this, METHODID_GENESIS)))
          .addMethod(
            getMinGasPriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.MinGasPriceResponse>(
                  this, METHODID_MIN_GAS_PRICE)))
          .addMethod(
            getNetInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.NetInfoResponse>(
                  this, METHODID_NET_INFO)))
          .addMethod(
            getStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.StatusResponse>(
                  this, METHODID_STATUS)))
          .addMethod(
            getAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.AddressRequest,
                counters.minter.grpc.client.AddressResponse>(
                  this, METHODID_ADDRESS)))
          .addMethod(
            getAddressesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.AddressesRequest,
                counters.minter.grpc.client.AddressesResponse>(
                  this, METHODID_ADDRESSES)))
          .addMethod(
            getBlockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.BlockRequest,
                counters.minter.grpc.client.BlockResponse>(
                  this, METHODID_BLOCK)))
          .addMethod(
            getCandidateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CandidateRequest,
                counters.minter.grpc.client.CandidateResponse>(
                  this, METHODID_CANDIDATE)))
          .addMethod(
            getCandidatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CandidatesRequest,
                counters.minter.grpc.client.CandidatesResponse>(
                  this, METHODID_CANDIDATES)))
          .addMethod(
            getCoinInfoByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CoinIdRequest,
                counters.minter.grpc.client.CoinInfoResponse>(
                  this, METHODID_COIN_INFO_BY_ID)))
          .addMethod(
            getCoinInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CoinInfoRequest,
                counters.minter.grpc.client.CoinInfoResponse>(
                  this, METHODID_COIN_INFO)))
          .addMethod(
            getEstimateCoinBuyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EstimateCoinBuyRequest,
                counters.minter.grpc.client.EstimateCoinBuyResponse>(
                  this, METHODID_ESTIMATE_COIN_BUY)))
          .addMethod(
            getEstimateCoinSellMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EstimateCoinSellRequest,
                counters.minter.grpc.client.EstimateCoinSellResponse>(
                  this, METHODID_ESTIMATE_COIN_SELL)))
          .addMethod(
            getEstimateCoinSellAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EstimateCoinSellAllRequest,
                counters.minter.grpc.client.EstimateCoinSellAllResponse>(
                  this, METHODID_ESTIMATE_COIN_SELL_ALL)))
          .addMethod(
            getEstimateTxCommissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EstimateTxCommissionRequest,
                counters.minter.grpc.client.EstimateTxCommissionResponse>(
                  this, METHODID_ESTIMATE_TX_COMMISSION)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.EventsRequest,
                counters.minter.grpc.client.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getMaxGasPriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.MaxGasPriceRequest,
                counters.minter.grpc.client.MaxGasPriceResponse>(
                  this, METHODID_MAX_GAS_PRICE)))
          .addMethod(
            getMissedBlocksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.MissedBlocksRequest,
                counters.minter.grpc.client.MissedBlocksResponse>(
                  this, METHODID_MISSED_BLOCKS)))
          .addMethod(
            getSendTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.SendTransactionRequest,
                counters.minter.grpc.client.SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            getTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.TransactionRequest,
                counters.minter.grpc.client.TransactionResponse>(
                  this, METHODID_TRANSACTION)))
          .addMethod(
            getTransactionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.TransactionsRequest,
                counters.minter.grpc.client.TransactionsResponse>(
                  this, METHODID_TRANSACTIONS)))
          .addMethod(
            getUnconfirmedTxsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.UnconfirmedTxsRequest,
                counters.minter.grpc.client.UnconfirmedTxsResponse>(
                  this, METHODID_UNCONFIRMED_TXS)))
          .addMethod(
            getValidatorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.ValidatorsRequest,
                counters.minter.grpc.client.ValidatorsResponse>(
                  this, METHODID_VALIDATORS)))
          .addMethod(
            getFrozenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.FrozenRequest,
                counters.minter.grpc.client.FrozenResponse>(
                  this, METHODID_FROZEN)))
          .addMethod(
            getFrozenAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.FrozenAllRequest,
                counters.minter.grpc.client.FrozenResponse>(
                  this, METHODID_FROZEN_ALL)))
          .addMethod(
            getWaitListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.WaitListRequest,
                counters.minter.grpc.client.WaitListResponse>(
                  this, METHODID_WAIT_LIST)))
          .addMethod(
            getTestBlockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                counters.minter.grpc.client.BlockResponse>(
                  this, METHODID_TEST_BLOCK)))
          .addMethod(
            getSwapPoolMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.SwapPoolRequest,
                counters.minter.grpc.client.SwapPoolResponse>(
                  this, METHODID_SWAP_POOL)))
          .addMethod(
            getSwapPoolsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.SwapPoolsRequest,
                counters.minter.grpc.client.SwapPoolsResponse>(
                  this, METHODID_SWAP_POOLS)))
          .addMethod(
            getSwapPoolProviderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.SwapPoolProviderRequest,
                counters.minter.grpc.client.SwapPoolResponse>(
                  this, METHODID_SWAP_POOL_PROVIDER)))
          .addMethod(
            getPriceCommissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.PriceCommissionRequest,
                counters.minter.grpc.client.PriceCommissionResponse>(
                  this, METHODID_PRICE_COMMISSION)))
          .addMethod(
            getVersionNetworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.VersionNetworkRequest,
                counters.minter.grpc.client.VersionNetworkResponse>(
                  this, METHODID_VERSION_NETWORK)))
          .addMethod(
            getCommissionVotesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.CommissionVotesRequest,
                counters.minter.grpc.client.CommissionVotesResponse>(
                  this, METHODID_COMMISSION_VOTES)))
          .addMethod(
            getUpdateVotesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.UpdateVotesRequest,
                counters.minter.grpc.client.UpdateVotesResponse>(
                  this, METHODID_UPDATE_VOTES)))
          .addMethod(
            getBlocksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.BlocksRequest,
                counters.minter.grpc.client.BlocksResponse>(
                  this, METHODID_BLOCKS)))
          .addMethod(
            getLimitOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.LimitOrderRequest,
                counters.minter.grpc.client.LimitOrderResponse>(
                  this, METHODID_LIMIT_ORDER)))
          .addMethod(
            getLimitOrdersOfPoolMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.LimitOrdersOfPoolRequest,
                counters.minter.grpc.client.LimitOrdersOfPoolResponse>(
                  this, METHODID_LIMIT_ORDERS_OF_POOL)))
          .addMethod(
            getLimitOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.LimitOrdersRequest,
                counters.minter.grpc.client.LimitOrdersResponse>(
                  this, METHODID_LIMIT_ORDERS)))
          .addMethod(
            getBestTradeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                counters.minter.grpc.client.BestTradeRequest,
                counters.minter.grpc.client.BestTradeResponse>(
                  this, METHODID_BEST_TRADE)))
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

    @java.lang.Override
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
    public void subscribe(counters.minter.grpc.client.SubscribeRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SubscribeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public void halts(counters.minter.grpc.client.HaltsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.HaltsResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.GenesisResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MinGasPriceResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.NetInfoResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public void address(counters.minter.grpc.client.AddressRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public void addresses(counters.minter.grpc.client.AddressesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.AddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public void block(counters.minter.grpc.client.BlockRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse> responseObserver) {
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
    public void candidate(counters.minter.grpc.client.CandidateRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CandidateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCandidateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public void candidates(counters.minter.grpc.client.CandidatesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CandidatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCandidatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public void coinInfoById(counters.minter.grpc.client.CoinIdRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCoinInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public void coinInfo(counters.minter.grpc.client.CoinInfoRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CoinInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCoinInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public void estimateCoinBuy(counters.minter.grpc.client.EstimateCoinBuyRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinBuyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateCoinBuyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public void estimateCoinSell(counters.minter.grpc.client.EstimateCoinSellRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateCoinSellMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public void estimateCoinSellAll(counters.minter.grpc.client.EstimateCoinSellAllRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateCoinSellAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateCoinSellAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public void estimateTxCommission(counters.minter.grpc.client.EstimateTxCommissionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EstimateTxCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateTxCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public void events(counters.minter.grpc.client.EventsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public void maxGasPrice(counters.minter.grpc.client.MaxGasPriceRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MaxGasPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMaxGasPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public void missedBlocks(counters.minter.grpc.client.MissedBlocksRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.MissedBlocksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMissedBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public void sendTransaction(counters.minter.grpc.client.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SendTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public void transaction(counters.minter.grpc.client.TransactionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public void transactions(counters.minter.grpc.client.TransactionsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.TransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public void unconfirmedTxs(counters.minter.grpc.client.UnconfirmedTxsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.UnconfirmedTxsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnconfirmedTxsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public void validators(counters.minter.grpc.client.ValidatorsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.ValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * Deprecated: Use FrozenAll instead.
     * </pre>
     */
    public void frozen(counters.minter.grpc.client.FrozenRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.FrozenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFrozenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FrozenAll
     * FrozenAll returns frozen balance.
     * </pre>
     */
    public void frozenAll(counters.minter.grpc.client.FrozenAllRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.FrozenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFrozenAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public void waitList(counters.minter.grpc.client.WaitListRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.WaitListResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapPool
     * SwapPool returns total supply and reserves.
     * </pre>
     */
    public void swapPool(counters.minter.grpc.client.SwapPoolRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapPools
     * SwapPools returns list of all pools.
     * </pre>
     */
    public void swapPools(counters.minter.grpc.client.SwapPoolsRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * SwapPoolProvider returns reserves and liquidity balance of provider.
     * </pre>
     */
    public void swapPoolProvider(counters.minter.grpc.client.SwapPoolProviderRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapPoolProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PriceCommission
     * PriceCommission returns commissions.
     * </pre>
     */
    public void priceCommission(counters.minter.grpc.client.PriceCommissionRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.PriceCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPriceCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VersionNetwork
     * VersionNetwork returns versions network.
     * </pre>
     */
    public void versionNetwork(counters.minter.grpc.client.VersionNetworkRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.VersionNetworkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVersionNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CommissionVotes
     * CommissionVotes returns votes for update commissions.
     * </pre>
     */
    public void commissionVotes(counters.minter.grpc.client.CommissionVotesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.CommissionVotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommissionVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateVotes
     * UpdateVotes returns votes for update network.
     * </pre>
     */
    public void updateVotes(counters.minter.grpc.client.UpdateVotesRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.UpdateVotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Blocks
     * Blocks returns blocks at given interval.
     * </pre>
     */
    public void blocks(counters.minter.grpc.client.BlocksRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BlocksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrder
     * LimitOrder returns order by ID.
     * </pre>
     */
    public void limitOrder(counters.minter.grpc.client.LimitOrderRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * LimitOrdersOfPool returns sell orders for a pair of coins.
     * </pre>
     */
    public void limitOrdersOfPool(counters.minter.grpc.client.LimitOrdersOfPoolRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersOfPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrdersOfPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrders
     * LimitOrders returns orders by IDs.
     * </pre>
     */
    public void limitOrders(counters.minter.grpc.client.LimitOrdersRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.LimitOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BestTrade
     * BestTrade returns optimal exchange route.
     * </pre>
     */
    public void bestTrade(counters.minter.grpc.client.BestTradeRequest request,
        io.grpc.stub.StreamObserver<counters.minter.grpc.client.BestTradeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBestTradeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ApiServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApiServiceBlockingStub> {
    private ApiServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
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
    public java.util.Iterator<counters.minter.grpc.client.SubscribeResponse> subscribe(
        counters.minter.grpc.client.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Halts 
     * Halts returns the candidate votes for stopping the network at block.
     * </pre>
     */
    public counters.minter.grpc.client.HaltsResponse halts(counters.minter.grpc.client.HaltsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHaltsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public counters.minter.grpc.client.GenesisResponse genesis(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenesisMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MinGasPrice
     * MinGasPrice returns current min gas price.
     * </pre>
     */
    public counters.minter.grpc.client.MinGasPriceResponse minGasPrice(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMinGasPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NetInfo
     * NetInfo returns network info
     * </pre>
     */
    public counters.minter.grpc.client.NetInfoResponse netInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNetInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Status
     * Status returns node status including pubkey, latest block.
     * </pre>
     */
    public counters.minter.grpc.client.StatusResponse status(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Address
     * Address returns coins list, balance and transaction count of an address.
     * </pre>
     */
    public counters.minter.grpc.client.AddressResponse address(counters.minter.grpc.client.AddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public counters.minter.grpc.client.AddressesResponse addresses(counters.minter.grpc.client.AddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public counters.minter.grpc.client.BlockResponse block(counters.minter.grpc.client.BlockRequest request) {
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
    public counters.minter.grpc.client.CandidateResponse candidate(counters.minter.grpc.client.CandidateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCandidateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public counters.minter.grpc.client.CandidatesResponse candidates(counters.minter.grpc.client.CandidatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCandidatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public counters.minter.grpc.client.CoinInfoResponse coinInfoById(counters.minter.grpc.client.CoinIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCoinInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public counters.minter.grpc.client.CoinInfoResponse coinInfo(counters.minter.grpc.client.CoinInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCoinInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public counters.minter.grpc.client.EstimateCoinBuyResponse estimateCoinBuy(counters.minter.grpc.client.EstimateCoinBuyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateCoinBuyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public counters.minter.grpc.client.EstimateCoinSellResponse estimateCoinSell(counters.minter.grpc.client.EstimateCoinSellRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateCoinSellMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public counters.minter.grpc.client.EstimateCoinSellAllResponse estimateCoinSellAll(counters.minter.grpc.client.EstimateCoinSellAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateCoinSellAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public counters.minter.grpc.client.EstimateTxCommissionResponse estimateTxCommission(counters.minter.grpc.client.EstimateTxCommissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateTxCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public counters.minter.grpc.client.EventsResponse events(counters.minter.grpc.client.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public counters.minter.grpc.client.MaxGasPriceResponse maxGasPrice(counters.minter.grpc.client.MaxGasPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMaxGasPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public counters.minter.grpc.client.MissedBlocksResponse missedBlocks(counters.minter.grpc.client.MissedBlocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMissedBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public counters.minter.grpc.client.SendTransactionResponse sendTransaction(counters.minter.grpc.client.SendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public counters.minter.grpc.client.TransactionResponse transaction(counters.minter.grpc.client.TransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public counters.minter.grpc.client.TransactionsResponse transactions(counters.minter.grpc.client.TransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public counters.minter.grpc.client.UnconfirmedTxsResponse unconfirmedTxs(counters.minter.grpc.client.UnconfirmedTxsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnconfirmedTxsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public counters.minter.grpc.client.ValidatorsResponse validators(counters.minter.grpc.client.ValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * Deprecated: Use FrozenAll instead.
     * </pre>
     */
    public counters.minter.grpc.client.FrozenResponse frozen(counters.minter.grpc.client.FrozenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFrozenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FrozenAll
     * FrozenAll returns frozen balance.
     * </pre>
     */
    public counters.minter.grpc.client.FrozenResponse frozenAll(counters.minter.grpc.client.FrozenAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFrozenAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public counters.minter.grpc.client.WaitListResponse waitList(counters.minter.grpc.client.WaitListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWaitListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public counters.minter.grpc.client.BlockResponse testBlock(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapPool
     * SwapPool returns total supply and reserves.
     * </pre>
     */
    public counters.minter.grpc.client.SwapPoolResponse swapPool(counters.minter.grpc.client.SwapPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapPools
     * SwapPools returns list of all pools.
     * </pre>
     */
    public counters.minter.grpc.client.SwapPoolsResponse swapPools(counters.minter.grpc.client.SwapPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * SwapPoolProvider returns reserves and liquidity balance of provider.
     * </pre>
     */
    public counters.minter.grpc.client.SwapPoolResponse swapPoolProvider(counters.minter.grpc.client.SwapPoolProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapPoolProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PriceCommission
     * PriceCommission returns commissions.
     * </pre>
     */
    public counters.minter.grpc.client.PriceCommissionResponse priceCommission(counters.minter.grpc.client.PriceCommissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPriceCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VersionNetwork
     * VersionNetwork returns versions network.
     * </pre>
     */
    public counters.minter.grpc.client.VersionNetworkResponse versionNetwork(counters.minter.grpc.client.VersionNetworkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVersionNetworkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CommissionVotes
     * CommissionVotes returns votes for update commissions.
     * </pre>
     */
    public counters.minter.grpc.client.CommissionVotesResponse commissionVotes(counters.minter.grpc.client.CommissionVotesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommissionVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateVotes
     * UpdateVotes returns votes for update network.
     * </pre>
     */
    public counters.minter.grpc.client.UpdateVotesResponse updateVotes(counters.minter.grpc.client.UpdateVotesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Blocks
     * Blocks returns blocks at given interval.
     * </pre>
     */
    public counters.minter.grpc.client.BlocksResponse blocks(counters.minter.grpc.client.BlocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrder
     * LimitOrder returns order by ID.
     * </pre>
     */
    public counters.minter.grpc.client.LimitOrderResponse limitOrder(counters.minter.grpc.client.LimitOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * LimitOrdersOfPool returns sell orders for a pair of coins.
     * </pre>
     */
    public counters.minter.grpc.client.LimitOrdersOfPoolResponse limitOrdersOfPool(counters.minter.grpc.client.LimitOrdersOfPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrdersOfPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrders
     * LimitOrders returns orders by IDs.
     * </pre>
     */
    public counters.minter.grpc.client.LimitOrdersResponse limitOrders(counters.minter.grpc.client.LimitOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BestTrade
     * BestTrade returns optimal exchange route.
     * </pre>
     */
    public counters.minter.grpc.client.BestTradeResponse bestTrade(counters.minter.grpc.client.BestTradeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBestTradeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ApiServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ApiServiceFutureStub> {
    private ApiServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
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
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.HaltsResponse> halts(
        counters.minter.grpc.client.HaltsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHaltsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Genesis
     * Genesis returns genesis file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.GenesisResponse> genesis(
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
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.MinGasPriceResponse> minGasPrice(
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
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.NetInfoResponse> netInfo(
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
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.StatusResponse> status(
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
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.AddressResponse> address(
        counters.minter.grpc.client.AddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Addresses
     * Addresses returns list of addresses.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.AddressesResponse> addresses(
        counters.minter.grpc.client.AddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Block
     * Block returns block data at given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.BlockResponse> block(
        counters.minter.grpc.client.BlockRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CandidateResponse> candidate(
        counters.minter.grpc.client.CandidateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCandidateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Candidates
     * Candidates returns list of candidates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CandidatesResponse> candidates(
        counters.minter.grpc.client.CandidatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCandidatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CoinInfoById
     * CoinInfoById returns information about coin ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CoinInfoResponse> coinInfoById(
        counters.minter.grpc.client.CoinIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCoinInfoByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CoinInfo
     * CoinInfo returns information about coin symbol.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CoinInfoResponse> coinInfo(
        counters.minter.grpc.client.CoinInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCoinInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateCoinBuy
     * EstimateCoinBuy returns estimate of buy coin transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EstimateCoinBuyResponse> estimateCoinBuy(
        counters.minter.grpc.client.EstimateCoinBuyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateCoinBuyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateCoinSell
     * EstimateCoinSell returns estimate of sell coin transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EstimateCoinSellResponse> estimateCoinSell(
        counters.minter.grpc.client.EstimateCoinSellRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateCoinSellMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateCoinSellAll
     * EstimateCoinSellAll returns estimate of sell all coin transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EstimateCoinSellAllResponse> estimateCoinSellAll(
        counters.minter.grpc.client.EstimateCoinSellAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateCoinSellAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateTxCommission
     * EstimateTxCommission returns estimate of transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EstimateTxCommissionResponse> estimateTxCommission(
        counters.minter.grpc.client.EstimateTxCommissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateTxCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Events
     * Events returns events at given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.EventsResponse> events(
        counters.minter.grpc.client.EventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MaxGasPrice
     * MaxGasPrice returns current max gas.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.MaxGasPriceResponse> maxGasPrice(
        counters.minter.grpc.client.MaxGasPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMaxGasPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MissedBlocks
     * MissedBlocks returns missed blocks by validator public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.MissedBlocksResponse> missedBlocks(
        counters.minter.grpc.client.MissedBlocksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMissedBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendTransaction
     * SendTransaction returns the result of sending signed tx. To ensure that transaction was successfully committed to the blockchain, you need to find the transaction by the hash and ensure that the status code equals to 0.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.SendTransactionResponse> sendTransaction(
        counters.minter.grpc.client.SendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transaction
     * Transaction returns transaction info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.TransactionResponse> transaction(
        counters.minter.grpc.client.TransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transactions
     * Transactions returns transactions by query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.TransactionsResponse> transactions(
        counters.minter.grpc.client.TransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnconfirmedTxs
     * UnconfirmedTxs returns unconfirmed transactions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.UnconfirmedTxsResponse> unconfirmedTxs(
        counters.minter.grpc.client.UnconfirmedTxsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnconfirmedTxsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validators
     * Validators returns list of active validators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.ValidatorsResponse> validators(
        counters.minter.grpc.client.ValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Frozen
     * Frozen returns frozen balance.
     * Deprecated: Use FrozenAll instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.FrozenResponse> frozen(
        counters.minter.grpc.client.FrozenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFrozenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FrozenAll
     * FrozenAll returns frozen balance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.FrozenResponse> frozenAll(
        counters.minter.grpc.client.FrozenAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFrozenAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WaitList
     * WaitList returns the list of address stakes in waitlist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.WaitListResponse> waitList(
        counters.minter.grpc.client.WaitListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWaitListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TestBlock
     * TestBlock returns the list of example transactions in block. Available only testnet mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.BlockResponse> testBlock(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapPool
     * SwapPool returns total supply and reserves.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.SwapPoolResponse> swapPool(
        counters.minter.grpc.client.SwapPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapPools
     * SwapPools returns list of all pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.SwapPoolsResponse> swapPools(
        counters.minter.grpc.client.SwapPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapPoolProvider
     * SwapPoolProvider returns reserves and liquidity balance of provider.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.SwapPoolResponse> swapPoolProvider(
        counters.minter.grpc.client.SwapPoolProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapPoolProviderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PriceCommission
     * PriceCommission returns commissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.PriceCommissionResponse> priceCommission(
        counters.minter.grpc.client.PriceCommissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPriceCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VersionNetwork
     * VersionNetwork returns versions network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.VersionNetworkResponse> versionNetwork(
        counters.minter.grpc.client.VersionNetworkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVersionNetworkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CommissionVotes
     * CommissionVotes returns votes for update commissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.CommissionVotesResponse> commissionVotes(
        counters.minter.grpc.client.CommissionVotesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommissionVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateVotes
     * UpdateVotes returns votes for update network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.UpdateVotesResponse> updateVotes(
        counters.minter.grpc.client.UpdateVotesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Blocks
     * Blocks returns blocks at given interval.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.BlocksResponse> blocks(
        counters.minter.grpc.client.BlocksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrder
     * LimitOrder returns order by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.LimitOrderResponse> limitOrder(
        counters.minter.grpc.client.LimitOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrdersOfPool
     * LimitOrdersOfPool returns sell orders for a pair of coins.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.LimitOrdersOfPoolResponse> limitOrdersOfPool(
        counters.minter.grpc.client.LimitOrdersOfPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrdersOfPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrders
     * LimitOrders returns orders by IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.LimitOrdersResponse> limitOrders(
        counters.minter.grpc.client.LimitOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BestTrade
     * BestTrade returns optimal exchange route.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<counters.minter.grpc.client.BestTradeResponse> bestTrade(
        counters.minter.grpc.client.BestTradeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBestTradeMethod(), getCallOptions()), request);
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
  private static final int METHODID_FROZEN_ALL = 26;
  private static final int METHODID_WAIT_LIST = 27;
  private static final int METHODID_TEST_BLOCK = 28;
  private static final int METHODID_SWAP_POOL = 29;
  private static final int METHODID_SWAP_POOLS = 30;
  private static final int METHODID_SWAP_POOL_PROVIDER = 31;
  private static final int METHODID_PRICE_COMMISSION = 32;
  private static final int METHODID_VERSION_NETWORK = 33;
  private static final int METHODID_COMMISSION_VOTES = 34;
  private static final int METHODID_UPDATE_VOTES = 35;
  private static final int METHODID_BLOCKS = 36;
  private static final int METHODID_LIMIT_ORDER = 37;
  private static final int METHODID_LIMIT_ORDERS_OF_POOL = 38;
  private static final int METHODID_LIMIT_ORDERS = 39;
  private static final int METHODID_BEST_TRADE = 40;

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
        case METHODID_FROZEN_ALL:
          serviceImpl.frozenAll((counters.minter.grpc.client.FrozenAllRequest) request,
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
        case METHODID_SWAP_POOLS:
          serviceImpl.swapPools((counters.minter.grpc.client.SwapPoolsRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.SwapPoolsResponse>) responseObserver);
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
        case METHODID_BEST_TRADE:
          serviceImpl.bestTrade((counters.minter.grpc.client.BestTradeRequest) request,
              (io.grpc.stub.StreamObserver<counters.minter.grpc.client.BestTradeResponse>) responseObserver);
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

  private static abstract class ApiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return counters.minter.grpc.client.Api.getDescriptor();
    }

    @java.lang.Override
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

    @java.lang.Override
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
              .addMethod(getFrozenAllMethod())
              .addMethod(getWaitListMethod())
              .addMethod(getTestBlockMethod())
              .addMethod(getSwapPoolMethod())
              .addMethod(getSwapPoolsMethod())
              .addMethod(getSwapPoolProviderMethod())
              .addMethod(getPriceCommissionMethod())
              .addMethod(getVersionNetworkMethod())
              .addMethod(getCommissionVotesMethod())
              .addMethod(getUpdateVotesMethod())
              .addMethod(getBlocksMethod())
              .addMethod(getLimitOrderMethod())
              .addMethod(getLimitOrdersOfPoolMethod())
              .addMethod(getLimitOrdersMethod())
              .addMethod(getBestTradeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
