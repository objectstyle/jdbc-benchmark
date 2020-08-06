/* StubParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. StubParserTokenManager.java */
package org.apache.jdbc.benchmark.parser;

/** Token Manager. */
@SuppressWarnings ("unused")
public class StubParserTokenManager implements StubParserConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 21;
            return 77;
         }
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 21;
            return 16;
         }
         return -1;
      case 1:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 1;
            return 77;
         }
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 1;
            return 15;
         }
         return -1;
      case 2:
         if ((active0 & 0x3000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 2;
            return 77;
         }
         return -1;
      case 3:
         if ((active0 & 0x3000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 3;
            return 77;
         }
         return -1;
      case 4:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 4;
            return 77;
         }
         if ((active0 & 0x1000L) != 0L)
            return 77;
         return -1;
      case 5:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 5;
            return 77;
         }
         return -1;
      case 6:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 6;
            return 77;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 19);
      case 41:
         return jjStopAtPos(0, 20);
      case 44:
         return jjStopAtPos(0, 15);
      case 46:
         return jjStopAtPos(0, 16);
      case 61:
         return jjStopAtPos(0, 17);
      case 63:
         return jjStopAtPos(0, 18);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 85:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 80:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 82:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 77);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 84:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(7, 13, 77);
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
   jjnewStateCnt = 103;
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
               case 16:
               case 77:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 21;
                  { jjCheckNAdd(77); }
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 21;
                  { jjCheckNAdd(77); }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 21;
                  { jjCheckNAdd(77); }
                  break;
               case 45:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 87:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 86;
                  break;
               case 96:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 95;
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
               case 16:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     { jjCheckNAdd(77); }
                  }
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 15:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     { jjCheckNAdd(77); }
                  }
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     { jjCheckNAdd(77); }
                  }
                  if (curChar == 76)
                     { jjAddStates(0, 1); }
                  else if (curChar == 73)
                     { jjAddStates(2, 3); }
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 75;
                  else if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 73;
                  else if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 71;
                  else if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 67;
                  else if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 62;
                  else if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 57;
                  else if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 55;
                  else if (curChar == 106)
                     jjstateSet[jjnewStateCnt++] = 53;
                  else if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 49;
                  else if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 40;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 36;
                  else if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 32;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 28;
                  else if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 22;
                  else if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 83)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 0:
                  if (curChar == 84 && kind > 5)
                     kind = 5;
                  break;
               case 1:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 2:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar == 116 && kind > 5)
                     kind = 5;
                  break;
               case 7:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 69 && kind > 6)
                     kind = 6;
                  break;
               case 13:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 17:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 101 && kind > 6)
                     kind = 6;
                  break;
               case 19:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 116 && kind > 6)
                     kind = 6;
                  break;
               case 25:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 77 && kind > 7)
                     kind = 7;
                  break;
               case 31:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 109 && kind > 7)
                     kind = 7;
                  break;
               case 35:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 37:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 78 && kind > 8)
                     kind = 8;
                  break;
               case 39:
               case 42:
               case 84:
               case 93:
                  if (curChar == 73)
                     { jjCheckNAdd(38); }
                  break;
               case 40:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 43:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 46:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 71)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 48;
                  break;
               case 50:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 51:
                  if (curChar == 110 && kind > 8)
                     kind = 8;
                  break;
               case 52:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 53:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 52;
                  break;
               case 54:
                  if (curChar == 106)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 55:
                  if (curChar == 78 && kind > 9)
                     kind = 9;
                  break;
               case 56:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar == 110 && kind > 9)
                     kind = 9;
                  break;
               case 58:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 57;
                  break;
               case 59:
                  if (curChar == 69 && kind > 10)
                     kind = 10;
                  break;
               case 60:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 61:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 61;
                  break;
               case 63:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 62;
                  break;
               case 64:
                  if (curChar == 101 && kind > 10)
                     kind = 10;
                  break;
               case 65:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 66:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 65;
                  break;
               case 67:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 68:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if (curChar == 101 && kind > 11)
                     kind = 11;
                  break;
               case 70:
                  if (curChar == 107)
                     jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 71:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 70;
                  break;
               case 72:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 71;
                  break;
               case 73:
                  if (curChar == 83 && kind > 14)
                     kind = 14;
                  break;
               case 74:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 73;
                  break;
               case 75:
                  if (curChar == 115 && kind > 14)
                     kind = 14;
                  break;
               case 76:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 75;
                  break;
               case 77:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAdd(77); }
                  break;
               case 78:
                  if (curChar == 73)
                     { jjAddStates(2, 3); }
                  break;
               case 79:
                  if (curChar == 84 && kind > 6)
                     kind = 6;
                  break;
               case 80:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 79;
                  break;
               case 81:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 82:
                  if (curChar == 83)
                     jjstateSet[jjnewStateCnt++] = 81;
                  break;
               case 83:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 82;
                  break;
               case 85:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 84;
                  break;
               case 86:
                  if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 88:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 87;
                  break;
               case 89:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 90:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 91:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 90;
                  break;
               case 92:
                  if (curChar == 76)
                     { jjAddStates(0, 1); }
                  break;
               case 94:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 93;
                  break;
               case 95:
                  if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 94;
                  break;
               case 97:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 96;
                  break;
               case 98:
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 99:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 100:
                  if (curChar == 69 && kind > 11)
                     kind = 11;
                  break;
               case 101:
                  if (curChar == 75)
                     jjstateSet[jjnewStateCnt++] = 100;
                  break;
               case 102:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 101;
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
      if ((i = jjnewStateCnt) == (startsAt = 103 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, 
"\125\120\120\105\122", "\104\111\123\124\111\116\103\124", null, "\54", "\56", "\75", "\77", "\50", 
"\51", null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   99, 102, 83, 91, 
};

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
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
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

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
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

    /** Constructor. */
    public StubParserTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public StubParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 103; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3fffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[103];
    static private final int[] jjstateSet = new int[2 * 103];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
