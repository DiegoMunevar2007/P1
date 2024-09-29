/* RobotTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. RobotTokenManager.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import uniandes.lym.robot.view.Console;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

/** Token Manager. */
@SuppressWarnings ("unused")
public class RobotTokenManager implements RobotConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 3;
         return jjMoveNfa_0(0, 0);
      case 10:
         jjmatchedKind = 4;
         return jjMoveNfa_0(0, 0);
      case 13:
         jjmatchedKind = 2;
         return jjMoveNfa_0(0, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(0, 0);
      case 40:
         jjmatchedKind = 9;
         return jjMoveNfa_0(0, 0);
      case 41:
         jjmatchedKind = 10;
         return jjMoveNfa_0(0, 0);
      case 44:
         jjmatchedKind = 66;
         return jjMoveNfa_0(0, 0);
      case 59:
         jjmatchedKind = 11;
         return jjMoveNfa_0(0, 0);
      case 61:
         jjmatchedKind = 12;
         return jjMoveNfa_0(0, 0);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4040080000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x8000100000000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40080000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x100400020000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x24000000000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x200080L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x608000000L);
      case 74:
      case 106:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x10000000400000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x2078001000020L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x80801002000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x900040L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x8200080000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x400004004000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x110018000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x200000000020000L);
      case 90:
      case 122:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 123:
         jjmatchedKind = 13;
         return jjMoveNfa_0(0, 0);
      case 125:
         jjmatchedKind = 14;
         return jjMoveNfa_0(0, 0);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 0);
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4143080004020000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x210800880400000L);
      case 70:
      case 102:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 1;
         }
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000100010000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x8004100100000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 79:
      case 111:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x484201003800120L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000280000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x600000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x58040L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x78000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 1);
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x40200000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x42020000100000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x400010000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000404000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000100000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000080000020000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x100040000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x20200000080000L);
      case 80:
      case 112:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
         }
         break;
      case 82:
      case 114:
         if ((active0 & 0x1000000000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x84000800018000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x300000020000000L);
      case 84:
      case 116:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000000L);
      case 86:
      case 118:
         if ((active0 & 0x20L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 87:
      case 119:
         if ((active0 & 0x800000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 2;
         }
         break;
      case 88:
      case 120:
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 2;
         }
         break;
      case 89:
      case 121:
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
         }
         break;
      case 90:
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 2);
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x40400000000L);
      case 66:
      case 98:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 3;
         }
         break;
      case 67:
      case 99:
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 3;
         }
         break;
      case 69:
      case 101:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x105000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x8020000000000L);
      case 75:
      case 107:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 3;
         }
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000080200000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000L);
      case 78:
      case 110:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000018000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 80:
      case 112:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x8000100000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000000L);
      case 84:
      case 116:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x100000000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x200000000000000L) != 0L)
         {
            jjmatchedKind = 57;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x480000000000000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 3);
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 4;
         }
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000000L);
      case 72:
      case 104:
         if ((active0 & 0x80000000000000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x400000000000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 4;
         }
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000L);
      case 79:
      case 111:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x2000000000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x4000080200000000L);
      case 83:
      case 115:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x8000000000000000L) != 0L)
         {
            jjmatchedKind = 63;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000000L);
      case 84:
      case 116:
         if ((active0 & 0x8000000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x20000000000000L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x18000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 4);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 4);
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000280000018000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000000L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 5);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 5);
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x4000000000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 6;
         }
         break;
      case 69:
      case 101:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x100000000000L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000080400000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000000L);
      case 83:
      case 115:
         if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 6;
         }
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 6);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 6);
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x100000000000L);
      case 83:
      case 115:
         if ((active0 & 0x4000000000000000L) != 0L)
         {
            jjmatchedKind = 62;
            jjmatchedPos = 7;
         }
         return jjMoveStringLiteralDfa8_0(active0, 0x80000000000L);
      case 89:
      case 121:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 7;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 7);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 7);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 7);
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 8;
         }
         break;
      case 68:
      case 100:
         return jjMoveStringLiteralDfa9_0(active0, 0x200000000L);
      case 69:
      case 101:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 8;
         }
         else if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 8;
         }
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa9_0(active0, 0x280000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 8);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 8);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 8);
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 9;
         }
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x80000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa10_0(active0, 0x200000000000L);
      case 83:
      case 115:
         if ((active0 & 0x40000000000L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 9;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 9);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 9);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 9);
   }
   switch(curChar)
   {
      case 80:
      case 112:
         return jjMoveStringLiteralDfa11_0(active0, 0x200000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa11_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 10);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 10);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 10);
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 11;
         }
         break;
      case 83:
      case 115:
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 11;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 11);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 8;
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
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     { jjCheckNAddTwoStates(6, 7); }
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 61)
                        kind = 61;
                     { jjCheckNAdd(4); }
                  }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 61)
                     kind = 61;
                  { jjCheckNAdd(4); }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  { jjCheckNAdd(6); }
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 64)
                     kind = 64;
                  { jjCheckNAdd(7); }
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
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 61)
                        kind = 61;
                     { jjCheckNAdd(4); }
                  }
                  if ((0x24000000240L & l) != 0L)
                  {
                     if (kind > 59)
                        kind = 59;
                  }
                  else if ((0x1000000010000L & l) != 0L)
                  {
                     if (kind > 60)
                        kind = 60;
                  }
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 1:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
                  if ((0x20000000200L & l) != 0L && kind > 59)
                     kind = 59;
                  break;
               case 3:
                  if ((0x1000000010000L & l) != 0L && kind > 60)
                     kind = 60;
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 61)
                     kind = 61;
                  { jjCheckNAdd(4); }
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
      if ((i = jjnewStateCnt) == (startsAt = 8 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\50", "\51", "\73", 
"\75", "\173", "\175", null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, "\54", };
protected Token jjFillToken()
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
static final int[] jjnextStates = {0
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
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

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public RobotTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public RobotTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 8; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
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
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffffffffffffffe1L, 0x5L, 
};
static final long[] jjtoSkip = {
   0x1eL, 0x0L, 
};
static final long[] jjtoSpecial = {
   0x0L, 0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[8];
    private final int[] jjstateSet = new int[2 * 8];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
