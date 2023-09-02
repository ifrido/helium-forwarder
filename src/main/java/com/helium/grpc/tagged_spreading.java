// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blockchain_region_param_v1.proto

package com.helium.grpc;

/**
 * Protobuf type {@code helium.tagged_spreading}
 */
public final class tagged_spreading extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helium.tagged_spreading)
    tagged_spreadingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use tagged_spreading.newBuilder() to construct.
  private tagged_spreading(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private tagged_spreading() {
    regionSpreading_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new tagged_spreading();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return regionparam.internal_static_helium_tagged_spreading_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return regionparam.internal_static_helium_tagged_spreading_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tagged_spreading.class, Builder.class);
  }

  public static final int REGION_SPREADING_FIELD_NUMBER = 1;
  private int regionSpreading_ = 0;
  /**
   * <code>.helium.RegionSpreading region_spreading = 1;</code>
   * @return The enum numeric value on the wire for regionSpreading.
   */
  @Override public int getRegionSpreadingValue() {
    return regionSpreading_;
  }
  /**
   * <code>.helium.RegionSpreading region_spreading = 1;</code>
   * @return The regionSpreading.
   */
  @Override public RegionSpreading getRegionSpreading() {
    RegionSpreading result = RegionSpreading.forNumber(regionSpreading_);
    return result == null ? RegionSpreading.UNRECOGNIZED : result;
  }

  public static final int MAX_PACKET_SIZE_FIELD_NUMBER = 2;
  private int maxPacketSize_ = 0;
  /**
   * <code>uint32 max_packet_size = 2;</code>
   * @return The maxPacketSize.
   */
  @Override
  public int getMaxPacketSize() {
    return maxPacketSize_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (regionSpreading_ != RegionSpreading.SF_INVALID.getNumber()) {
      output.writeEnum(1, regionSpreading_);
    }
    if (maxPacketSize_ != 0) {
      output.writeUInt32(2, maxPacketSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (regionSpreading_ != RegionSpreading.SF_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, regionSpreading_);
    }
    if (maxPacketSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, maxPacketSize_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof tagged_spreading)) {
      return super.equals(obj);
    }
    tagged_spreading other = (tagged_spreading) obj;

    if (regionSpreading_ != other.regionSpreading_) return false;
    if (getMaxPacketSize()
        != other.getMaxPacketSize()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REGION_SPREADING_FIELD_NUMBER;
    hash = (53 * hash) + regionSpreading_;
    hash = (37 * hash) + MAX_PACKET_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxPacketSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tagged_spreading parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tagged_spreading parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tagged_spreading parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tagged_spreading parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tagged_spreading parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tagged_spreading parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tagged_spreading parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tagged_spreading parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tagged_spreading parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tagged_spreading parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tagged_spreading parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tagged_spreading parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(tagged_spreading prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code helium.tagged_spreading}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helium.tagged_spreading)
      tagged_spreadingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return regionparam.internal_static_helium_tagged_spreading_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return regionparam.internal_static_helium_tagged_spreading_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tagged_spreading.class, Builder.class);
    }

    // Construct using com.helium.grpc.tagged_spreading.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      regionSpreading_ = 0;
      maxPacketSize_ = 0;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return regionparam.internal_static_helium_tagged_spreading_descriptor;
    }

    @Override
    public tagged_spreading getDefaultInstanceForType() {
      return tagged_spreading.getDefaultInstance();
    }

    @Override
    public tagged_spreading build() {
      tagged_spreading result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public tagged_spreading buildPartial() {
      tagged_spreading result = new tagged_spreading(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tagged_spreading result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.regionSpreading_ = regionSpreading_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxPacketSize_ = maxPacketSize_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof tagged_spreading) {
        return mergeFrom((tagged_spreading)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tagged_spreading other) {
      if (other == tagged_spreading.getDefaultInstance()) return this;
      if (other.regionSpreading_ != 0) {
        setRegionSpreadingValue(other.getRegionSpreadingValue());
      }
      if (other.getMaxPacketSize() != 0) {
        setMaxPacketSize(other.getMaxPacketSize());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              regionSpreading_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              maxPacketSize_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int regionSpreading_ = 0;
    /**
     * <code>.helium.RegionSpreading region_spreading = 1;</code>
     * @return The enum numeric value on the wire for regionSpreading.
     */
    @Override public int getRegionSpreadingValue() {
      return regionSpreading_;
    }
    /**
     * <code>.helium.RegionSpreading region_spreading = 1;</code>
     * @param value The enum numeric value on the wire for regionSpreading to set.
     * @return This builder for chaining.
     */
    public Builder setRegionSpreadingValue(int value) {
      regionSpreading_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.RegionSpreading region_spreading = 1;</code>
     * @return The regionSpreading.
     */
    @Override
    public RegionSpreading getRegionSpreading() {
      RegionSpreading result = RegionSpreading.forNumber(regionSpreading_);
      return result == null ? RegionSpreading.UNRECOGNIZED : result;
    }
    /**
     * <code>.helium.RegionSpreading region_spreading = 1;</code>
     * @param value The regionSpreading to set.
     * @return This builder for chaining.
     */
    public Builder setRegionSpreading(RegionSpreading value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      regionSpreading_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.helium.RegionSpreading region_spreading = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionSpreading() {
      bitField0_ = (bitField0_ & ~0x00000001);
      regionSpreading_ = 0;
      onChanged();
      return this;
    }

    private int maxPacketSize_ ;
    /**
     * <code>uint32 max_packet_size = 2;</code>
     * @return The maxPacketSize.
     */
    @Override
    public int getMaxPacketSize() {
      return maxPacketSize_;
    }
    /**
     * <code>uint32 max_packet_size = 2;</code>
     * @param value The maxPacketSize to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPacketSize(int value) {

      maxPacketSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 max_packet_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxPacketSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxPacketSize_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:helium.tagged_spreading)
  }

  // @@protoc_insertion_point(class_scope:helium.tagged_spreading)
  private static final tagged_spreading DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tagged_spreading();
  }

  public static tagged_spreading getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<tagged_spreading>
      PARSER = new com.google.protobuf.AbstractParser<tagged_spreading>() {
    @Override
    public tagged_spreading parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<tagged_spreading> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<tagged_spreading> getParserForType() {
    return PARSER;
  }

  @Override
  public tagged_spreading getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

