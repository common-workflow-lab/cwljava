package cwl;

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OutputArraySchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OutputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"doc\":\"Salad data types are based on Avro schema declarations.  Refer to the\\n[Avro schema declaration documentation](https://avro.apache.org/docs/current/spec.html#schemas) for\\ndetailed information.\\n\\n## Simple types\\n\\n* **null**: no value\\n* **boolean**: a binary value\\n* **int**: 32-bit signed integer\\n* **long**: 64-bit signed integer\\n* **float**: single precision (32-bit) IEEE 754 floating-point number\\n* **double**: double precision (64-bit) IEEE 754 floating-point number\\n* **string**: Unicode character sequence\\n\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},{\"type\":\"record\",\"name\":\"OutputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OutputRecordField\",\"fields\":[{\"name\":\"type\",\"type\":\"Record_symbol\",\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RecordField\",\"doc\":\"A field of a record.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\"},{\"name\":\"type\",\"type\":[\"PrimitiveType\",{\"type\":\"record\",\"name\":\"RecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Record_symbol\",\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"RecordField\"}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\"}]},{\"type\":\"record\",\"name\":\"EnumSchema\",\"doc\":\"Define an enumerated type.\\n\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true}}]},{\"type\":\"record\",\"name\":\"ArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Array_symbol\",\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"}}]},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"outputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Binding\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for manipulation by expressions.\\n\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"],\"docAfter\":\"https://w3id.org/cwl/cwl#ExpressionTool\"},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only applies when `type` is `File`.  Describes files that must be\\nincluded alongside the primary file.\\n\\nIf the value is an expression, the context of the expression is the input\\nor output File parameter to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\"}],\"docParent\":\"https://w3id.org/cwl/cwl#Parameter\"}],\"jsonldPredicate\":\"cwl:outputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputRecordField\"}]},{\"type\":\"record\",\"name\":\"OutputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Enum_symbol\",\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"Binding\"],\"jsonldPredicate\":\"cwl:outputBinding\"}],\"extends\":\"https://w3id.org/cwl/salad#EnumSchema\",\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\"},\"OutputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"OutputRecordSchema\",\"OutputEnumSchema\",\"OutputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"Binding\"],\"jsonldPredicate\":\"cwl:outputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Must be `array` */
  @Deprecated public Array_symbol type;
  /** Defines the type of the array elements. */
  @Deprecated public Object items;
  @Deprecated public Binding outputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OutputArraySchema() {}

  /**
   * All-args constructor.
   */
  public OutputArraySchema(Array_symbol type, Object items, Binding outputBinding) {
    this.type = type;
    this.items = items;
    this.outputBinding = outputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return items;
    case 2: return outputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: type = (Array_symbol)value$; break;
    case 1: items = (Object)value$; break;
    case 2: outputBinding = (Binding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * Must be `array`   */
  public Array_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `array`   * @param value the value to set.
   */
  public void setType(Array_symbol value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'items' field.
   * Defines the type of the array elements.   */
  public Object getItems() {
    return items;
  }

  /**
   * Sets the value of the 'items' field.
   * Defines the type of the array elements.   * @param value the value to set.
   */
  public void setItems(Object value) {
    this.items = value;
  }

  /**
   * Gets the value of the 'outputBinding' field.
   */
  public Binding getOutputBinding() {
    return outputBinding;
  }

  /**
   * Sets the value of the 'outputBinding' field.
   * @param value the value to set.
   */
  public void setOutputBinding(Binding value) {
    this.outputBinding = value;
  }

  /** Creates a new OutputArraySchema RecordBuilder */
  public static OutputArraySchema.Builder newBuilder() {
    return new OutputArraySchema.Builder();
  }

  /** Creates a new OutputArraySchema RecordBuilder by copying an existing Builder */
  public static OutputArraySchema.Builder newBuilder(OutputArraySchema.Builder other) {
    return new OutputArraySchema.Builder(other);
  }

  /** Creates a new OutputArraySchema RecordBuilder by copying an existing OutputArraySchema instance */
  public static OutputArraySchema.Builder newBuilder(OutputArraySchema other) {
    return new OutputArraySchema.Builder(other);
  }

  /**
   * RecordBuilder for OutputArraySchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OutputArraySchema>
    implements org.apache.avro.data.RecordBuilder<OutputArraySchema> {

    private Array_symbol type;
    private Object items;
    private Binding outputBinding;

    /** Creates a new Builder */
    private Builder() {
      super(OutputArraySchema.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(OutputArraySchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[2].schema(), other.outputBinding);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing OutputArraySchema instance */
    private Builder(OutputArraySchema other) {
            super(OutputArraySchema.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[2].schema(), other.outputBinding);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public Array_symbol getType() {
      return type;
    }

    /** Sets the value of the 'type' field */
    public OutputArraySchema.Builder setType(Array_symbol value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'type' field */
    public OutputArraySchema.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'items' field */
    public Object getItems() {
      return items;
    }

    /** Sets the value of the 'items' field */
    public OutputArraySchema.Builder setItems(Object value) {
      validate(fields()[1], value);
      this.items = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'items' field has been set */
    public boolean hasItems() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'items' field */
    public OutputArraySchema.Builder clearItems() {
      items = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'outputBinding' field */
    public Binding getOutputBinding() {
      return outputBinding;
    }

    /** Sets the value of the 'outputBinding' field */
    public OutputArraySchema.Builder setOutputBinding(Binding value) {
      validate(fields()[2], value);
      this.outputBinding = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'outputBinding' field has been set */
    public boolean hasOutputBinding() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'outputBinding' field */
    public OutputArraySchema.Builder clearOutputBinding() {
      outputBinding = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public OutputArraySchema build() {
      try {
        OutputArraySchema record = new OutputArraySchema();
        record.type = fieldSetFlags()[0] ? this.type : (Array_symbol) defaultValue(fields()[0]);
        record.items = fieldSetFlags()[1] ? this.items : (Object) defaultValue(fields()[1]);
        record.outputBinding = fieldSetFlags()[2] ? this.outputBinding : (Binding) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
