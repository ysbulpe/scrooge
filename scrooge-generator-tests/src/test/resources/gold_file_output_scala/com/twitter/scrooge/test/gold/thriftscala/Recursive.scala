/**
 * Generated by Scrooge
 *   version: ?
 *   rev: ?
 *   built at: ?
 */
package com.twitter.scrooge.test.gold.thriftscala

import com.twitter.io.Buf
import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob,
  ThriftException,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUtil,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import com.twitter.scrooge.adapt.{AccessRecorder, AdaptTProtocol, Decoder}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport, TIOStreamTransport}
import java.io.ByteArrayInputStream
import java.nio.ByteBuffer
import java.util.Arrays
import java.util.concurrent.atomic.AtomicInteger
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object Recursive extends ValidatingThriftStructCodec3[Recursive] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("Recursive")
  val IdField = new TField("id", TType.I64, 1)
  val IdFieldManifest = implicitly[Manifest[Long]]
  val RecRequestField = new TField("recRequest", TType.STRUCT, 2)
  val RecRequestFieldManifest = implicitly[Manifest[com.twitter.scrooge.test.gold.thriftscala.Request]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      IdField,
      false,
      false,
      IdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      RecRequestField,
      true,
      false,
      RecRequestFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: Recursive): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: Recursive): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.id)
    buf ++= validateField(item.recRequest)
    buf.toList
  }

  def withoutPassthroughFields(original: Recursive): Recursive =
    new Immutable(
      id =
        {
          val field = original.id
          field
        },
      recRequest =
        {
          val field = original.recRequest
          field.map { field =>
            com.twitter.scrooge.test.gold.thriftscala.Request.withoutPassthroughFields(field)
          }
        }
    )

  override def encode(_item: Recursive, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  @volatile private[this] var adaptiveDecoder: Decoder[Recursive] = _

  private[this] val accessRecordingDecoderBuilder: AccessRecorder => Decoder[Recursive] = { accessRecorder =>
    new Decoder[Recursive] {
      def apply(prot: AdaptTProtocol): Recursive = new AccessRecordingWrapper(lazyDecode(prot), accessRecorder)
    }
  }
  private[this] val fallbackDecoder = new Decoder[Recursive] {
    def apply(prot: AdaptTProtocol): Recursive = lazyDecode(prot)
  }
  private[this] def adaptiveDecode(_iprot: AdaptTProtocol): Recursive = {
    val adaptContext = _iprot.adaptContext
    val reloadRequired = adaptContext.shouldReloadDecoder
    synchronized {
      if (adaptiveDecoder == null || reloadRequired) {
        adaptiveDecoder = adaptContext.buildDecoder(this, fallbackDecoder, accessRecordingDecoderBuilder)
      }
    }
    adaptiveDecoder(_iprot)
  }

  /**
   * AccessRecordingWrapper keeps track of fields that are accessed while
   * delegating to underlying struct.
   */
  private[this] class AccessRecordingWrapper(underlying: Recursive, accessRecorder: AccessRecorder) extends Recursive {
    override def id: Long = {
      accessRecorder.fieldAccessed(1)
      underlying.id
    }
    override def recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = {
      accessRecorder.fieldAccessed(2)
      underlying.recRequest
    }
    override def write(_oprot: TProtocol): Unit = underlying.write(_oprot)

    override def _passthroughFields = underlying._passthroughFields
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): Recursive = {

    var id: Long = 0L
    var recRequest: Option[com.twitter.scrooge.test.gold.thriftscala.Request] = None

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.I64 =>
    
                id = readIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                recRequest = Some(readRecRequestValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'recRequest' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      id,
      recRequest,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): Recursive =
    _iprot match {
      case i: AdaptTProtocol => adaptiveDecode(i)
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[thriftscala] def eagerDecode(_iprot: TProtocol): Recursive = {
    var id: Long = 0L
    var recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.I64 =>
                id = readIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
                recRequest = _root_.scala.Some(readRecRequestValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'recRequest' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      id,
      recRequest,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    id: Long,
    recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = _root_.scala.None
  ): Recursive =
    new Immutable(
      id,
      recRequest
    )

  def unapply(_item: Recursive): _root_.scala.Option[_root_.scala.Tuple2[Long, Option[com.twitter.scrooge.test.gold.thriftscala.Request]]] = _root_.scala.Some(_item.toTuple)


  @inline private[thriftscala] def readIdValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeIdField(id_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(IdField)
    writeIdValue(id_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeIdValue(id_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(id_item)
  }

  @inline private[thriftscala] def readRecRequestValue(_iprot: TProtocol): com.twitter.scrooge.test.gold.thriftscala.Request = {
    com.twitter.scrooge.test.gold.thriftscala.Request.decode(_iprot)
  }

  @inline private def writeRecRequestField(recRequest_item: com.twitter.scrooge.test.gold.thriftscala.Request, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(RecRequestField)
    writeRecRequestValue(recRequest_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeRecRequestValue(recRequest_item: com.twitter.scrooge.test.gold.thriftscala.Request, _oprot: TProtocol): Unit = {
    recRequest_item.write(_oprot)
  }


  object Immutable extends ThriftStructCodec3[Recursive] {
    override def encode(_item: Recursive, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): Recursive = Recursive.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[Recursive] = Recursive.metaData
  }

  /**
   * The default read-only implementation of Recursive.  You typically should not need to
   * directly reference this class; instead, use the Recursive.apply method to construct
   * new instances.
   */
  class Immutable(
      val id: Long,
      val recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends Recursive {
    def this(
      id: Long,
      recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = _root_.scala.None
    ) = this(
      id,
      recRequest,
      Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val id: Long,
      val recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends Recursive {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }


    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the Recursive trait with additional state or
   * behavior and implement the read-only methods from Recursive using an underlying
   * instance.
   */
  trait Proxy extends Recursive {
    protected def _underlying_Recursive: Recursive
    override def id: Long = _underlying_Recursive.id
    override def recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = _underlying_Recursive.recRequest
    override def _passthroughFields = _underlying_Recursive._passthroughFields
  }
}

/**
 * Prefer the companion object's [[com.twitter.scrooge.test.gold.thriftscala.Recursive.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait Recursive
  extends ThriftStruct
  with _root_.scala.Product2[Long, Option[com.twitter.scrooge.test.gold.thriftscala.Request]]
  with ValidatingThriftStruct[Recursive]
  with java.io.Serializable
{
  import Recursive._

  def id: Long
  def recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = id
  def _2 = recRequest

  def toTuple: _root_.scala.Tuple2[Long, Option[com.twitter.scrooge.test.gold.thriftscala.Request]] = {
    (
      id,
      recRequest
    )
  }


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (true) {
                writeIdValue(id, _oprot)
                _root_.scala.Some(Recursive.IdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (recRequest.isDefined) {
                writeRecRequestValue(recRequest.get, _oprot)
                _root_.scala.Some(Recursive.RecRequestField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            _root_.scala.Some(TFieldBlob(_field, Buf.ByteArray.Owned(_buff.getArray())))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): Recursive = {
    var id: Long = this.id
    var recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = this.recRequest
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        id = readIdValue(_blob.read)
      case 2 =>
        recRequest = _root_.scala.Some(readRecRequestValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      id,
      recRequest,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): Recursive = {
    var id: Long = this.id
    var recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = this.recRequest

    _fieldId match {
      case 1 =>
        id = 0L
      case 2 =>
        recRequest = _root_.scala.None
      case _ =>
    }
    new Immutable(
      id,
      recRequest,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetId: Recursive = unsetField(1)

  def unsetRecRequest: Recursive = unsetField(2)


  override def write(_oprot: TProtocol): Unit = {
    Recursive.validate(this)
    _oprot.writeStructBegin(Struct)
    writeIdField(id, _oprot)
    if (recRequest.isDefined) writeRecRequestField(recRequest.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    id: Long = this.id,
    recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = this.recRequest,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): Recursive =
    new Immutable(
      id,
      recRequest,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[Recursive]

  private def _equals(x: Recursive, y: Recursive): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator)

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[Recursive]) &&
      _passthroughFields == other.asInstanceOf[Recursive]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => this.id
    case 1 => this.recRequest
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "Recursive"

  def _codec: ValidatingThriftStructCodec3[Recursive] = Recursive
}

private class Recursive$$AdaptDecoder {

  def decode(_iprot: AdaptTProtocol): Recursive = {
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    val adapt = new Recursive$$Adapt(
      _iprot,
      _iprot.buffer,
      _start_offset)

    AdaptTProtocol.usedStartMarker(1)
    var id: Long = 0L
    AdaptTProtocol.usedEndMarker(1)

    AdaptTProtocol.usedStartMarker(2)
    var recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = _root_.scala.None

    adapt.set_recRequest(recRequest)
    AdaptTProtocol.usedEndMarker(2)

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 => {
            _field.`type` match {
              case TType.I64 =>
                AdaptTProtocol.usedStartMarker(1)
                id = Recursive.readIdValue(_iprot)
                AdaptTProtocol.usedEndMarker(1)
                AdaptTProtocol.unusedStartMarker(1)
                _iprot.offsetSkipI64()
                AdaptTProtocol.unusedEndMarker(1)
              case _actualType =>
                val _expectedType = TType.I64
                throw AdaptTProtocol.unexpectedTypeException(_expectedType, _actualType, "id")
            }
            AdaptTProtocol.usedStartMarker(1)
            adapt.set_id(id)
            AdaptTProtocol.usedEndMarker(1)
          }
          case 2 => {
            _field.`type` match {
              case TType.STRUCT =>
                AdaptTProtocol.usedStartMarker(2)
                recRequest = _root_.scala.Some(Recursive.readRecRequestValue(_iprot))
                AdaptTProtocol.usedEndMarker(2)
                AdaptTProtocol.unusedStartMarker(2)
                _iprot.offsetSkipStruct()
                AdaptTProtocol.unusedEndMarker(2)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw AdaptTProtocol.unexpectedTypeException(_expectedType, _actualType, "recRequest")
            }
            AdaptTProtocol.usedStartMarker(2)
            adapt.set_recRequest(recRequest)
            AdaptTProtocol.usedEndMarker(2)
          }

          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    adapt.set__endOffset(_iprot.offset)
    if (_passthroughFields != null) {
      adapt.set__passthroughFields(_passthroughFields.result())
    }
    adapt
  }
}

/**
 * This is the base template for Adaptive decoding. This class gets pruned and
 * reloaded at runtime.
 */
private class Recursive$$Adapt(
    _proto: AdaptTProtocol,
    _buf: Array[Byte],
    _start_offset: Int) extends Recursive {

  /**
   * In case any unexpected field is accessed, fallback to eager decoding.
   */
  private[this] lazy val delegate: Recursive = {
    val bytes = Arrays.copyOfRange(_buf, _start_offset, _end_offset)
    val proto = _proto.withBytes(bytes)
    Recursive.eagerDecode(proto)
  }

  private[this] var m_id: Long = _
  def set_id(id: Long): Unit = m_id = id
  // This will be removed by ASM if field is unused.
  def id: Long = m_id
  // This will be removed by ASM if field is used otherwise renamed to id.
  def delegated_id: Long = delegate.id

  private[this] var m_recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = _
  def set_recRequest(recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request]): Unit = m_recRequest = recRequest
  // This will be removed by ASM if field is unused.
  def recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = m_recRequest
  // This will be removed by ASM if field is used otherwise renamed to recRequest.
  def delegated_recRequest: _root_.scala.Option[com.twitter.scrooge.test.gold.thriftscala.Request] = delegate.recRequest


  private[this] var _end_offset: Int = _
  def set__endOffset(offset: Int) = _end_offset = offset

  private[this] var __passthroughFields: immutable$Map[Short, TFieldBlob] = Recursive.NoPassthroughFields
  def set__passthroughFields(passthroughFields: immutable$Map[Short, TFieldBlob]): Unit =
    __passthroughFields = passthroughFields

  override def _passthroughFields: immutable$Map[Short, TFieldBlob] = __passthroughFields

  /*
  Override the super hash code to make it a lazy val rather than def.

  Calculating the hash code can be expensive, caching it where possible
  can provide significant performance wins. (Key in a hash map for instance)
  Usually not safe since the normal constructor will accept a mutable map or
  set as an arg
  Here however we control how the class is generated from serialized data.
  With the class private and the contract that we throw away our mutable references
  having the hash code lazy here is safe.
  */
  override lazy val hashCode: Int = super.hashCode

  override def write(_oprot: TProtocol): Unit = {
    _oprot match {
      case i: AdaptTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
      case _ => super.write(_oprot)
    }
  }
}
