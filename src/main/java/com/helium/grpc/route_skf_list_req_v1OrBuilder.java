// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

public interface route_skf_list_req_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.route_skf_list_req_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string route_id = 1;</code>
   * @return The routeId.
   */
  String getRouteId();
  /**
   * <code>string route_id = 1;</code>
   * @return The bytes for routeId.
   */
  com.google.protobuf.ByteString
      getRouteIdBytes();

  /**
   * <pre>
   * in milliseconds since unix epoch
   * </pre>
   *
   * <code>uint64 timestamp = 2;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>bytes signature = 3;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <pre>
   * pubkey binary of the signing keypair
   * </pre>
   *
   * <code>bytes signer = 4;</code>
   * @return The signer.
   */
  com.google.protobuf.ByteString getSigner();
}
