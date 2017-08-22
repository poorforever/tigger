/* Generated By:JavaCC: Do not edit this line. TiggerConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface TiggerConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int NUMBER = 4;
  /** RegularExpression Id. */
  int DIGIT = 5;
  /** RegularExpression Id. */
  int EOL = 6;
  /** RegularExpression Id. */
  int PRINT = 7;
  /** RegularExpression Id. */
  int LPAR = 8;
  /** RegularExpression Id. */
  int RPAR = 9;
  /** RegularExpression Id. */
  int COMMA = 10;
  /** RegularExpression Id. */
  int IF = 11;
  /** RegularExpression Id. */
  int THEN = 12;
  /** RegularExpression Id. */
  int ELSE = 13;
  /** RegularExpression Id. */
  int LET = 14;
  /** RegularExpression Id. */
  int IN = 15;
  /** RegularExpression Id. */
  int END = 16;
  /** RegularExpression Id. */
  int VAR = 17;
  /** RegularExpression Id. */
  int FUNCTION = 18;
  /** RegularExpression Id. */
  int WORD = 19;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "<NUMBER>",
    "<DIGIT>",
    "\"\\n\"",
    "\"print\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\"if\"",
    "\"then\"",
    "\"else\"",
    "\"let\"",
    "\"in\"",
    "\"end\"",
    "\"var\"",
    "\"function\"",
    "<WORD>",
    "\"+\"",
    "\"-\"",
    "\"<\"",
    "\">\"",
    "\"=\"",
    "\"<=\"",
    "\">=\"",
    "\"<>\"",
    "\"*\"",
    "\"/\"",
    "\".\"",
    "\":=\"",
  };

}
