/**
 * Autogenerated by Scrooge
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.scrooge.test.gold.thriftandroid;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class CollectionId implements TBase<CollectionId, CollectionId._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("CollectionId");

  private static final TField COLLECTION_LONG_ID_FIELD_DESC = new TField("collectionLongId", TType.I64, (short)1);


  private long collectionLongId;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    COLLECTION_LONG_ID((short)1, "collectionLongId");
  
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
  
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COLLECTION_LONG_ID
          return COLLECTION_LONG_ID;
        default:
          return null;
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
  
    private final short _thriftId;
    private final String _fieldName;
  
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
  
    public short getThriftFieldId() {
      return _thriftId;
    }
  
    public String getFieldName() {
      return _fieldName;
    }
  }


  // isset id assignments
  private static final int __COLLECTIONLONGID_ISSET_ID = 0;
  private final BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLLECTION_LONG_ID, new FieldMetaData("collectionLongId", TFieldRequirementType.REQUIRED,
      new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(CollectionId.class, metaDataMap);
  }


  public CollectionId() {
  }

  public CollectionId(
      Long collectionLongId
  ) {
    this();
    if(collectionLongId != null) {
      this.collectionLongId = collectionLongId;
      __isset_bit_vector.set(__COLLECTIONLONGID_ISSET_ID, true);

    }
  }


  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CollectionId(CollectionId other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.collectionLongId = other.collectionLongId;
  }

  public static List<String> validateNewInstance(CollectionId item) {
    final List<String> buf = new ArrayList<String>();
    if (!item.isSet(_Fields.COLLECTION_LONG_ID)) {
       buf.add("Required field 'collectionLongId' in type 'CollectionId' was not present.");
    }

    return buf;
  }

  public CollectionId deepCopy() {
    return new CollectionId(this);
  }

  @java.lang.Override
  public void clear() {
    __isset_bit_vector.set(__COLLECTIONLONGID_ISSET_ID, false);
    this.collectionLongId = 0;
  }



  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COLLECTION_LONG_ID:
      if (value == null) {
        __isset_bit_vector.clear(__COLLECTIONLONGID_ISSET_ID);
      } else {
        this.collectionLongId = (Long) value;
        __isset_bit_vector.set(__COLLECTIONLONGID_ISSET_ID, true);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COLLECTION_LONG_ID:
      return new Long(this.collectionLongId);
    }
    throw new IllegalStateException();
  }

  @SuppressWarnings("unchecked")
  public <Any> Any get(_Fields field) {
    switch(field) {
      case COLLECTION_LONG_ID:
          Any rval_collectionLongId = (Any)((Long) getFieldValue(field));
          return rval_collectionLongId;
      default:
        throw new IllegalStateException("Invalid field type");
    }
  }

  /** Returns true if field corresponding to field is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case COLLECTION_LONG_ID:
        return __isset_bit_vector.get(__COLLECTIONLONGID_ISSET_ID);
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CollectionId)
      return this.equals((CollectionId)that);
    return false;
  }

  public boolean equals(CollectionId that) {
    if (that == null)
      return false;
    boolean this_present_collectionLongId = true;
    boolean that_present_collectionLongId = true;
    if (this_present_collectionLongId || that_present_collectionLongId) {
      if (!(this_present_collectionLongId && that_present_collectionLongId))
        return false;
      if (this.collectionLongId != that.collectionLongId)
        return false;
    }

    return true;
  }

  @java.lang.Override
  @SuppressWarnings("unchecked")
  public int hashCode() {
    int hashCode = 1;
    if (true) {
        hashCode = 31 * hashCode + ((Long)collectionLongId).hashCode();
    }
    return hashCode;
  }

  public int compareTo(CollectionId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CollectionId typedOther = (CollectionId)other;

    lastComparison = Boolean.valueOf(isSet(_Fields.COLLECTION_LONG_ID)).compareTo(typedOther.isSet(_Fields.COLLECTION_LONG_ID));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.COLLECTION_LONG_ID)) {
      lastComparison = TBaseHelper.compareTo(this.collectionLongId, typedOther.collectionLongId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // COLLECTION_LONG_ID
          if (field.type == TType.I64) {
            this.collectionLongId = iprot.readI64();
            __isset_bit_vector.set(__COLLECTIONLONGID_ISSET_ID, true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSet(_Fields.COLLECTION_LONG_ID)) {
      throw new TProtocolException("Required field 'collectionLongId' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();
    
    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(COLLECTION_LONG_ID_FIELD_DESC);
    oprot.writeI64(this.collectionLongId);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @java.lang.Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CollectionId(");
    boolean first = true;
    sb.append("collectionLongId:");
    sb.append(this.collectionLongId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'collectionLongId' because it's a primitive and you chose the non-beans generator.
  }

  public static final _Fields COLLECTION_LONG_ID = _Fields.COLLECTION_LONG_ID;

  public static class Builder {
    private Long collectionLongId;
  @SuppressWarnings("unchecked")
  public Builder set (_Fields field, Object value) {
    switch(field) {
      case COLLECTION_LONG_ID: {
        if (value != null) {
          this.collectionLongId = (Long) value;
        }
        break;
      }
      default: {
        break;
      }
    }
    return this;
  }
  public CollectionId build() {
    // check for required fields
    if (this.collectionLongId == null) {
      throw new IllegalArgumentException("Required field 'collectionLongId' was not present! Struct: " + toString());
    }
    return new CollectionId(collectionLongId);
    }
  }
}

