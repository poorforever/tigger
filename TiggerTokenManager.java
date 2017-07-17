/* Generated By:JavaCC: Do not edit this line. TiggerTokenManager.java */
import ast.*;
import java.util.*;
import java.lang.AssertionError;
import java.io.*;
import java.lang.System;

/** Token Manager. */
public class TiggerTokenManager implements TiggerConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x33fc80L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 0;
            return 0;
         }
         return -1;
      case 1:
         if ((active0 & 0x4400L) != 0L)
            return 0;
         if ((active0 & 0x33b880L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 1;
            return 0;
         }
         return -1;
      case 2:
         if ((active0 & 0x1a000L) != 0L)
            return 0;
         if ((active0 & 0x321880L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
            return 0;
         }
         return -1;
      case 3:
         if ((active0 & 0x1800L) != 0L)
            return 0;
         if ((active0 & 0x320080L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
            return 0;
         }
         return -1;
      case 4:
         if ((active0 & 0x80L) != 0L)
            return 0;
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 4;
            return 0;
         }
         return -1;
      case 5:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 5;
            return 0;
         }
         return -1;
      case 6:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 6;
            return 0;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 6);
      case 40:
         return jjStopAtPos(0, 8);
      case 41:
         return jjStopAtPos(0, 9);
      case 42:
         return jjStopAtPos(0, 30);
      case 43:
         return jjStopAtPos(0, 22);
      case 44:
         return jjStopAtPos(0, 19);
      case 45:
         return jjStopAtPos(0, 23);
      case 46:
         return jjStopAtPos(0, 32);
      case 47:
         return jjStopAtPos(0, 31);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 60:
         {
         jjmatchedKind = 24;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x28000000L);
      case 61:
         return jjStopAtPos(0, 26);
      case 62:
         {
         jjmatchedKind = 25;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x9000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x4400L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 113:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 62:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x202000L);
      case 102:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 10, 0);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 110:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 0);
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x120000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 0);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x100080L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 114:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 0);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 0);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 0);
         break;
      case 110:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 0);
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 112:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 0);
         break;
      case 116:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 0);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(4, 7, 0);
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(7, 17, 0);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 2;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 4;
                  jjCheckNAdd(1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  kind = 18;
                  jjCheckNAdd(0);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\12", "\160\162\151\156\164", "\50", "\51", 
"\151\146", "\164\150\145\156", "\145\154\163\145", "\154\145\164", "\151\156", 
"\145\156\144", "\166\141\162", "\146\165\156\143\164\151\157\156", null, "\54", 
"\161\165\151\164", "\150\145\154\160", "\53", "\55", "\74", "\76", "\75", "\74\75", "\76\75", 
"\74\76", "\52", "\57", "\56", "\72\75", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3fffffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[2];
static private final int[] jjstateSet = new int[4];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public TiggerTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public TiggerTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 2; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         curTokenImage = "";
      else
         curTokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      curTokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 18;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static int[] jjemptyLineNo = new int[1];
static int[] jjemptyColNo = new int[1];
static boolean[] jjbeenHere = new boolean[1];
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 4 :
         break;
      case 5 :
         break;
      case 6 :
         break;
      case 7 :
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() &&
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 21 :
         break;
      case 22 :
         break;
      case 23 :
         break;
      case 24 :
         break;
      case 25 :
         break;
      case 26 :
         break;
      case 27 :
         break;
      case 28 :
         break;
      case 29 :
         break;
      case 30 :
         break;
      case 31 :
         break;
      case 32 :
         break;
      case 33 :
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
