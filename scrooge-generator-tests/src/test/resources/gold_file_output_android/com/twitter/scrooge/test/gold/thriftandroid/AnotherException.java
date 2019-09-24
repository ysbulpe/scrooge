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

public class AnotherException extends Exception implements TBase<AnotherException, AnotherException._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("AnotherException");

  private static final TField ERROR_CODE_FIELD_DESC = new TField("errorCode", TType.I32, (short)1);


  private int errorCode;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ERROR_CODE((short)1, "errorCode");
  
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
        case 1: // ERROR_CODE
          return ERROR_CODE;
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
  private static final int __ERRORCODE_ISSET_ID = 0;
  private final BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new FieldMetaData("errorCode", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(AnotherException.class, metaDataMap);
  }


  public AnotherException() {
  }

  public AnotherException(
      Integer errorCode
  ) {
    this();
    if(errorCode != null) {
      this.errorCode = errorCode;
      __isset_bit_vector.set(__ERRORCODE_ISSET_ID, true);

    }
  }


  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnotherException(AnotherException other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.errorCode = other.errorCode;
  }

  public static List<String> validateNewInstance(AnotherException item) {
    final List<String> buf = new ArrayList<String>();
    return buf;
  }

  public AnotherException deepCopy() {
    return new AnotherException(this);
  }

  @java.lang.Override
  public void clear() {
    __isset_bit_vector.set(__ERRORCODE_ISSET_ID, false);
    this.errorCode = 0;
  }



  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        __isset_bit_vector.clear(__ERRORCODE_ISSET_ID);
      } else {
        this.errorCode = (Integer) value;
        __isset_bit_vector.set(__ERRORCODE_ISSET_ID, true);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return new Integer(this.errorCode);
    }
    throw new IllegalStateException();
  }

  @SuppressWarnings("unchecked")
  public <Any> Any get(_Fields field) {
    switch(field) {
      case ERROR_CODE:
          Any rval_errorCode = (Any)((Integer) getFieldValue(field));
          return rval_errorCode;
      default:
        throw new IllegalStateException("Invalid field type");
    }
  }

  /** Returns true if field corresponding to field is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case ERROR_CODE:
        return __isset_bit_vector.get(__ERRORCODE_ISSET_ID);
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AnotherException)
      return this.equals((AnotherException)that);
    return false;
  }

  public boolean equals(AnotherException that) {
    if (that == null)
      return false;
    boolean this_present_errorCode = true;
    boolean that_present_errorCode = true;
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    return true;
  }

  @java.lang.Override
  @SuppressWarnings("unchecked")
  public int hashCode() {
    int hashCode = 1;
    if (true) {
        hashCode = 31 * hashCode + ((Integer)errorCode).hashCode();
    }
    return hashCode;
  }

  public int compareTo(AnotherException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AnotherException typedOther = (AnotherException)other;

    lastComparison = Boolean.valueOf(isSet(_Fields.ERROR_CODE)).compareTo(typedOther.isSet(_Fields.ERROR_CODE));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.ERROR_CODE)) {
      lastComparison = TBaseHelper.compareTo(this.errorCode, typedOther.errorCode);
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
        case 1: // ERROR_CODE
          if (field.type == TType.I32) {
            this.errorCode = iprot.readI32();
            __isset_bit_vector.set(__ERRORCODE_ISSET_ID, true);
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
    oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
    oprot.writeI32(this.errorCode);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @java.lang.Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AnotherException(");
    boolean first = true;
    sb.append("errorCode:");
    sb.append(this.errorCode);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

  public static final _Fields ERROR_CODE = _Fields.ERROR_CODE;

  public static class Builder {
    private Integer errorCode;
  @SuppressWarnings("unchecked")
  public Builder set (_Fields field, Object value) {
    switch(field) {
      case ERROR_CODE: {
        if (value != null) {
          this.errorCode = (Integer) value;
        }
        break;
      }
      default: {
        break;
      }
    }
    return this;
  }
  public AnotherException build() {
    // check for required fields
    return new AnotherException(errorCode);
    }
  }
}

