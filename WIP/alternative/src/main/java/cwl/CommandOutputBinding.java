package cwl;

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** Describes how to generate an output parameter based on the files produced
by a CommandLineTool.

The output parameter is generated by applying these operations in
the following order:

  - glob
  - loadContents
  - outputEval
 */
@org.apache.avro.specific.AvroGenerated
public class CommandOutputBinding extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandOutputBinding\",\"doc\":\"Describes how to generate an output parameter based on the files produced\\nby a CommandLineTool.\\n\\nThe output parameter is generated by applying these operations in\\nthe following order:\\n\\n  - glob\\n  - loadContents\\n  - outputEval\\n\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for manipulation by expressions.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"],\"docAfter\":\"https://w3id.org/cwl/cwl#ExpressionTool\"},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only applies when `type` is `File`.  Describes files that must be\\nincluded alongside the primary file.\\n\\nIf the value is an expression, the context of the expression is the input\\nor output File parameter to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"glob\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Find files relative to the output directory, using POSIX glob(3)\\npathname matching.  If provided an array, find files that match any\\npattern in the array.  If provided an expression, the expression must\\nreturn a string or an array of strings, which will then be evaluated as\\none or more glob patterns.  Only files which actually exist will be\\nmatched and returned.\\n\"},{\"name\":\"outputEval\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"Evaluate an expression to generate the output value.  If `glob` was\\nspecified, the script `context` will be an array containing any files that were\\nmatched.  Additionally, if `loadContents` is `true`, the File objects\\nwill include up to the first 64 KiB of file contents in the `contents` field.\\n\"}],\"docParent\":\"https://w3id.org/cwl/cwl#CommandOutputParameter\",\"extends\":\"https://w3id.org/cwl/cwl#Binding\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the
"contents" field of the file object for manipulation by expressions.
 */
  @Deprecated public Boolean loadContents;
  /** Only applies when `type` is `File`.  Describes files that must be
included alongside the primary file.

If the value is an expression, the context of the expression is the input
or output File parameter to which this binding applies.

If the value is a string, it specifies that the following pattern
should be applied to the primary file:

  1. If string begins with one or more caret `^` characters, for each
    caret, remove the last file extension from the path (the last
    period `.` and all following characters).  If there are no file
    extensions, the path is unchanged.
  2. Append the remainder of the string to the end of the file path.
 */
  @Deprecated public Object secondaryFiles;
  /** Find files relative to the output directory, using POSIX glob(3)
pathname matching.  If provided an array, find files that match any
pattern in the array.  If provided an expression, the expression must
return a string or an array of strings, which will then be evaluated as
one or more glob patterns.  Only files which actually exist will be
matched and returned.
 */
  @Deprecated public Object glob;
  /** Evaluate an expression to generate the output value.  If `glob` was
specified, the script `context` will be an array containing any files that were
matched.  Additionally, if `loadContents` is `true`, the File objects
will include up to the first 64 KiB of file contents in the `contents` field.
 */
  @Deprecated public Object outputEval;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CommandOutputBinding() {}

  /**
   * All-args constructor.
   */
  public CommandOutputBinding(Boolean loadContents, Object secondaryFiles, Object glob, Object outputEval) {
    this.loadContents = loadContents;
    this.secondaryFiles = secondaryFiles;
    this.glob = glob;
    this.outputEval = outputEval;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return loadContents;
    case 1: return secondaryFiles;
    case 2: return glob;
    case 3: return outputEval;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: loadContents = (Boolean)value$; break;
    case 1: secondaryFiles = (Object)value$; break;
    case 2: glob = (Object)value$; break;
    case 3: outputEval = (Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'loadContents' field.
   * Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the
"contents" field of the file object for manipulation by expressions.
   */
  public Boolean getLoadContents() {
    return loadContents;
  }

  /**
   * Sets the value of the 'loadContents' field.
   * Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the
"contents" field of the file object for manipulation by expressions.
   * @param value the value to set.
   */
  public void setLoadContents(Boolean value) {
    this.loadContents = value;
  }

  /**
   * Gets the value of the 'secondaryFiles' field.
   * Only applies when `type` is `File`.  Describes files that must be
included alongside the primary file.

If the value is an expression, the context of the expression is the input
or output File parameter to which this binding applies.

If the value is a string, it specifies that the following pattern
should be applied to the primary file:

  1. If string begins with one or more caret `^` characters, for each
    caret, remove the last file extension from the path (the last
    period `.` and all following characters).  If there are no file
    extensions, the path is unchanged.
  2. Append the remainder of the string to the end of the file path.
   */
  public Object getSecondaryFiles() {
    return secondaryFiles;
  }

  /**
   * Sets the value of the 'secondaryFiles' field.
   * Only applies when `type` is `File`.  Describes files that must be
included alongside the primary file.

If the value is an expression, the context of the expression is the input
or output File parameter to which this binding applies.

If the value is a string, it specifies that the following pattern
should be applied to the primary file:

  1. If string begins with one or more caret `^` characters, for each
    caret, remove the last file extension from the path (the last
    period `.` and all following characters).  If there are no file
    extensions, the path is unchanged.
  2. Append the remainder of the string to the end of the file path.
   * @param value the value to set.
   */
  public void setSecondaryFiles(Object value) {
    this.secondaryFiles = value;
  }

  /**
   * Gets the value of the 'glob' field.
   * Find files relative to the output directory, using POSIX glob(3)
pathname matching.  If provided an array, find files that match any
pattern in the array.  If provided an expression, the expression must
return a string or an array of strings, which will then be evaluated as
one or more glob patterns.  Only files which actually exist will be
matched and returned.
   */
  public Object getGlob() {
    return glob;
  }

  /**
   * Sets the value of the 'glob' field.
   * Find files relative to the output directory, using POSIX glob(3)
pathname matching.  If provided an array, find files that match any
pattern in the array.  If provided an expression, the expression must
return a string or an array of strings, which will then be evaluated as
one or more glob patterns.  Only files which actually exist will be
matched and returned.
   * @param value the value to set.
   */
  public void setGlob(Object value) {
    this.glob = value;
  }

  /**
   * Gets the value of the 'outputEval' field.
   * Evaluate an expression to generate the output value.  If `glob` was
specified, the script `context` will be an array containing any files that were
matched.  Additionally, if `loadContents` is `true`, the File objects
will include up to the first 64 KiB of file contents in the `contents` field.
   */
  public Object getOutputEval() {
    return outputEval;
  }

  /**
   * Sets the value of the 'outputEval' field.
   * Evaluate an expression to generate the output value.  If `glob` was
specified, the script `context` will be an array containing any files that were
matched.  Additionally, if `loadContents` is `true`, the File objects
will include up to the first 64 KiB of file contents in the `contents` field.
   * @param value the value to set.
   */
  public void setOutputEval(Object value) {
    this.outputEval = value;
  }

  /** Creates a new CommandOutputBinding RecordBuilder */
  public static CommandOutputBinding.Builder newBuilder() {
    return new CommandOutputBinding.Builder();
  }

  /** Creates a new CommandOutputBinding RecordBuilder by copying an existing Builder */
  public static CommandOutputBinding.Builder newBuilder(CommandOutputBinding.Builder other) {
    return new CommandOutputBinding.Builder(other);
  }

  /** Creates a new CommandOutputBinding RecordBuilder by copying an existing CommandOutputBinding instance */
  public static CommandOutputBinding.Builder newBuilder(CommandOutputBinding other) {
    return new CommandOutputBinding.Builder(other);
  }

  /**
   * RecordBuilder for CommandOutputBinding instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandOutputBinding>
    implements org.apache.avro.data.RecordBuilder<CommandOutputBinding> {

    private Boolean loadContents;
    private Object secondaryFiles;
    private Object glob;
    private Object outputEval;

    /** Creates a new Builder */
    private Builder() {
      super(CommandOutputBinding.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(CommandOutputBinding.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.loadContents)) {
        this.loadContents = data().deepCopy(fields()[0].schema(), other.loadContents);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.secondaryFiles)) {
        this.secondaryFiles = data().deepCopy(fields()[1].schema(), other.secondaryFiles);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.glob)) {
        this.glob = data().deepCopy(fields()[2].schema(), other.glob);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.outputEval)) {
        this.outputEval = data().deepCopy(fields()[3].schema(), other.outputEval);
        fieldSetFlags()[3] = true;
      }
    }

    /** Creates a Builder by copying an existing CommandOutputBinding instance */
    private Builder(CommandOutputBinding other) {
            super(CommandOutputBinding.SCHEMA$);
      if (isValidValue(fields()[0], other.loadContents)) {
        this.loadContents = data().deepCopy(fields()[0].schema(), other.loadContents);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.secondaryFiles)) {
        this.secondaryFiles = data().deepCopy(fields()[1].schema(), other.secondaryFiles);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.glob)) {
        this.glob = data().deepCopy(fields()[2].schema(), other.glob);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.outputEval)) {
        this.outputEval = data().deepCopy(fields()[3].schema(), other.outputEval);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'loadContents' field */
    public Boolean getLoadContents() {
      return loadContents;
    }

    /** Sets the value of the 'loadContents' field */
    public CommandOutputBinding.Builder setLoadContents(Boolean value) {
      validate(fields()[0], value);
      this.loadContents = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'loadContents' field has been set */
    public boolean hasLoadContents() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'loadContents' field */
    public CommandOutputBinding.Builder clearLoadContents() {
      loadContents = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'secondaryFiles' field */
    public Object getSecondaryFiles() {
      return secondaryFiles;
    }

    /** Sets the value of the 'secondaryFiles' field */
    public CommandOutputBinding.Builder setSecondaryFiles(Object value) {
      validate(fields()[1], value);
      this.secondaryFiles = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'secondaryFiles' field has been set */
    public boolean hasSecondaryFiles() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'secondaryFiles' field */
    public CommandOutputBinding.Builder clearSecondaryFiles() {
      secondaryFiles = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'glob' field */
    public Object getGlob() {
      return glob;
    }

    /** Sets the value of the 'glob' field */
    public CommandOutputBinding.Builder setGlob(Object value) {
      validate(fields()[2], value);
      this.glob = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'glob' field has been set */
    public boolean hasGlob() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'glob' field */
    public CommandOutputBinding.Builder clearGlob() {
      glob = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'outputEval' field */
    public Object getOutputEval() {
      return outputEval;
    }

    /** Sets the value of the 'outputEval' field */
    public CommandOutputBinding.Builder setOutputEval(Object value) {
      validate(fields()[3], value);
      this.outputEval = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /** Checks whether the 'outputEval' field has been set */
    public boolean hasOutputEval() {
      return fieldSetFlags()[3];
    }

    /** Clears the value of the 'outputEval' field */
    public CommandOutputBinding.Builder clearOutputEval() {
      outputEval = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public CommandOutputBinding build() {
      try {
        CommandOutputBinding record = new CommandOutputBinding();
        record.loadContents = fieldSetFlags()[0] ? this.loadContents : (Boolean) defaultValue(fields()[0]);
        record.secondaryFiles = fieldSetFlags()[1] ? this.secondaryFiles : (Object) defaultValue(fields()[1]);
        record.glob = fieldSetFlags()[2] ? this.glob : (Object) defaultValue(fields()[2]);
        record.outputEval = fieldSetFlags()[3] ? this.outputEval : (Object) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
