// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

public interface gateway_region_params_req_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.gateway_region_params_req_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.helium.region region = 1;</code>
   * @return The enum numeric value on the wire for region.
   */
  int getRegionValue();
  /**
   * <code>.helium.region region = 1;</code>
   * @return The region.
   */
  region getRegion();

  /**
   * <code>bytes address = 2;</code>
   * @return The address.
   */
  com.google.protobuf.ByteString getAddress();

  /**
   * <code>bytes signature = 3;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();
}
