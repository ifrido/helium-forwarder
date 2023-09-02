// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

public interface route_skf_update_req_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.route_skf_update_req_v1)
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
   * WARNING: this will limited to 100 updates per req
   * </pre>
   *
   * <code>repeated .helium.iot_config.route_skf_update_req_v1.route_skf_update_v1 updates = 2;</code>
   */
  java.util.List<route_skf_update_req_v1.route_skf_update_v1>
      getUpdatesList();
  /**
   * <pre>
   * WARNING: this will limited to 100 updates per req
   * </pre>
   *
   * <code>repeated .helium.iot_config.route_skf_update_req_v1.route_skf_update_v1 updates = 2;</code>
   */
  route_skf_update_req_v1.route_skf_update_v1 getUpdates(int index);
  /**
   * <pre>
   * WARNING: this will limited to 100 updates per req
   * </pre>
   *
   * <code>repeated .helium.iot_config.route_skf_update_req_v1.route_skf_update_v1 updates = 2;</code>
   */
  int getUpdatesCount();
  /**
   * <pre>
   * WARNING: this will limited to 100 updates per req
   * </pre>
   *
   * <code>repeated .helium.iot_config.route_skf_update_req_v1.route_skf_update_v1 updates = 2;</code>
   */
  java.util.List<? extends route_skf_update_req_v1.route_skf_update_v1OrBuilder>
      getUpdatesOrBuilderList();
  /**
   * <pre>
   * WARNING: this will limited to 100 updates per req
   * </pre>
   *
   * <code>repeated .helium.iot_config.route_skf_update_req_v1.route_skf_update_v1 updates = 2;</code>
   */
  route_skf_update_req_v1.route_skf_update_v1OrBuilder getUpdatesOrBuilder(
      int index);

  /**
   * <pre>
   * in milliseconds since unix epoch
   * </pre>
   *
   * <code>uint64 timestamp = 3;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>bytes signature = 4;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <pre>
   * pubkey binary of the signing keypair
   * </pre>
   *
   * <code>bytes signer = 5;</code>
   * @return The signer.
   */
  com.google.protobuf.ByteString getSigner();
}
