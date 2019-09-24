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

public class Recursive implements TBase<Recursive, Recursive._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Recursive");

  private static final TField ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
  private static final TField REC_REQUEST_FIELD_DESC = new TField("recRequest", TType.STRUCT, (short)2);


  private long id;
  private Request recRequest;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ID((short)1, "id"),
    REC_REQUEST((short)2, "recRequest");
  
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
        case 1: // ID
          return ID;
        case 2: // REC_REQUEST
          return REC_REQUEST;
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
  private static final int __ID_ISSET_ID = 0;
  private final BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new FieldMetaData("id", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.REC_REQUEST, new FieldMetaData("recRequest", TFieldRequirementType.OPTIONAL,
      new StructMetaData(TType.STRUCT, Request.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Recursive.class, metaDataMap);
  }


  public Recursive() {
  }

  public Recursive(
      Long id,
      Request recRequest
  ) {
    this();
    if(id != null) {
      this.id = id;
      __isset_bit_vector.set(__ID_ISSET_ID, true);

    }
    if(recRequest != null) {
      this.recRequest = recRequest;
    }
  }


  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Recursive(Recursive other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.id = other.id;
    if (other.isSet(_Fields.REC_REQUEST)) {
      this.recRequest = new Request(other.recRequest);
    }
  }

  public static List<String> validateNewInstance(Recursive item) {
    final List<String> buf = new ArrayList<String>();
    if (item.isSet(_Fields.REC_REQUEST)) {
      Request _recRequest = item.recRequest;
      buf.addAll(com.twitter.scrooge.test.gold.thriftandroid.Request.validateNewInstance(_recRequest));
    }

    return buf;
  }

  public Recursive deepCopy() {
    return new Recursive(this);
  }

  @java.lang.Override
  public void clear() {
    __isset_bit_vector.set(__ID_ISSET_ID, false);
    this.id = 0;
    this.recRequest = null;
  }



  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        __isset_bit_vector.clear(__ID_ISSET_ID);
      } else {
        this.id = (Long) value;
        __isset_bit_vector.set(__ID_ISSET_ID, true);
      }
      break;
    case REC_REQUEST:
      if (value == null) {
        this.recRequest = null;
      } else {
        this.recRequest = (Request) value;
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return new Long(this.id);
    case REC_REQUEST:
      return this.recRequest;
    }
    throw new IllegalStateException();
  }

  @SuppressWarnings("unchecked")
  public <Any> Any get(_Fields field) {
    switch(field) {
      case ID:
          Any rval_id = (Any)((Long) getFieldValue(field));
          return rval_id;
      case REC_REQUEST:
          Any rval_recRequest = (Any)((Request) getFieldValue(field));
          return rval_recRequest;
      default:
        throw new IllegalStateException("Invalid field type");
    }
  }

  /** Returns true if field corresponding to field is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case ID:
        return __isset_bit_vector.get(__ID_ISSET_ID);
    case REC_REQUEST:
        return recRequest != null;
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Recursive)
      return this.equals((Recursive)that);
    return false;
  }

  public boolean equals(Recursive that) {
    if (that == null)
      return false;
    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }
    boolean this_present_recRequest = true && this.isSet(_Fields.REC_REQUEST);
    boolean that_present_recRequest = true && that.isSet(_Fields.REC_REQUEST);
    if (this_present_recRequest || that_present_recRequest) {
      if (!(this_present_recRequest && that_present_recRequest))
        return false;
      if (!this.recRequest.equals(that.recRequest))
        return false;
    }

    return true;
  }

  @java.lang.Override
  @SuppressWarnings("unchecked")
  public int hashCode() {
    int hashCode = 1;
    if (true) {
        hashCode = 31 * hashCode + ((Long)id).hashCode();
    }
    if (true && (isSet(_Fields.REC_REQUEST))) {
        hashCode = 31 * hashCode + recRequest.hashCode();
    }
    return hashCode;
  }

  public int compareTo(Recursive other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Recursive typedOther = (Recursive)other;

    lastComparison = Boolean.valueOf(isSet(_Fields.ID)).compareTo(typedOther.isSet(_Fields.ID));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.ID)) {
      lastComparison = TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet(_Fields.REC_REQUEST)).compareTo(typedOther.isSet(_Fields.REC_REQUEST));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.REC_REQUEST)) {
      lastComparison = TBaseHelper.compareTo(this.recRequest, typedOther.recRequest);
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
        case 1: // ID
          if (field.type == TType.I64) {
            this.id = iprot.readI64();
            __isset_bit_vector.set(__ID_ISSET_ID, true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // REC_REQUEST
          if (field.type == TType.STRUCT) {
            this.recRequest = new Request();
            this.recRequest.read(iprot);
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
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();
    
    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI64(this.id);
    oprot.writeFieldEnd();
    if (this.recRequest != null) {
      if (isSet(_Fields.REC_REQUEST)) {
        oprot.writeFieldBegin(REC_REQUEST_FIELD_DESC);
        this.recRequest.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @java.lang.Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Recursive(");
    boolean first = true;
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (isSet(_Fields.REC_REQUEST)) {
      if (!first) sb.append(", ");
      sb.append("recRequest:");
      if (this.recRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.recRequest);
      }
      first = false;
      }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

  public static final _Fields ID = _Fields.ID;
  public static final _Fields REC_REQUEST = _Fields.REC_REQUEST;

  public static class Builder {
    private Long id;
    private Request recRequest;
  @SuppressWarnings("unchecked")
  public Builder set (_Fields field, Object value) {
    switch(field) {
      case ID: {
        if (value != null) {
          this.id = (Long) value;
        }
        break;
      }
      case REC_REQUEST: {
        if (value != null) {
          this.recRequest = (Request) value;
        }
        break;
      }
      default: {
        break;
      }
    }
    return this;
  }
  public Recursive build() {
    // check for required fields
    return new Recursive(id,recRequest);
    }
  }
}

