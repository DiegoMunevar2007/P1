/* Robot.java */
/* Generated By:JavaCC: Do not edit this line. Robot.java */
package uniandes.lym.robot.control;

import uniandes.lym.robot.kernel.*;
import uniandes.lym.robot.view.Console;

import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;

@SuppressWarnings("serial")
public class Robot implements RobotConstants {


        private RobotWorldDec world;


        void setWorld(RobotWorld w) {
                world = (RobotWorldDec) w;
        }

        String salida=new String();

  final public void inicial() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case EXEC:{
      exec();
      break;
      }
    case NEW:{
      jj_consume_token(NEW);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ELEMENTO:{
        var();
        break;
        }
      case MACRO:{
        macro();
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void exec() throws ParseException {
    jj_consume_token(EXEC);
    bloque();
}

  final public void var() throws ParseException {
    jj_consume_token(ELEMENTO);
    jj_consume_token(58);
    jj_consume_token(ELEMENTO);
}

  final public void macro() throws ParseException {
    jj_consume_token(MACRO);
}

  final public void bloque() throws ParseException {
    jj_consume_token(59);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TURNTOMY:
      case TURNTOTHE:
      case WALK:
      case JUMP:
      case DROP:
      case PICK:
      case GRAB:
      case LETGO:
      case POP:
      case MOVES:
      case NOP:
      case SAFEEXE:
      case IF:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_1;
      }
      comando();
    }
    jj_consume_token(60);
}

  final public void comando() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case WALK:{
      walk();
      break;
      }
    case JUMP:{
      jump();
      break;
      }
    case DROP:{
      drop();
      break;
      }
    case PICK:{
      pick();
      break;
      }
    case GRAB:{
      grab();
      break;
      }
    case LETGO:{
      letgo();
      break;
      }
    case POP:{
      pop();
      break;
      }
    case TURNTOMY:{
      turntomy();
      break;
      }
    case TURNTOTHE:{
      turntothe();
      break;
      }
    case MOVES:{
      moves();
      break;
      }
    case IF:{
      condicional();
      break;
      }
    case NOP:{
      nop();
      break;
      }
    case SAFEEXE:{
      safeexe();
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void turntomy() throws ParseException {
    jj_consume_token(TURNTOMY);
    jj_consume_token(61);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case RIGHT:{
      jj_consume_token(RIGHT);
if (world.facingNorth())
                                          { world.turnRight(); }
                                          else if (world.facingWest())
                                          { world.turnRight(); world.turnRight(); }
                                          else if (world.facingSouth())
                                          { world.turnRight(); world.turnRight(); world.turnRight(); }
      break;
      }
    case LEFT:{
      jj_consume_token(LEFT);
if (world.facingNorth())
                                  { world.turnRight(); world.turnRight(); world.turnRight(); }
                                  else if (world.facingEast())
                                  { world.turnRight(); world.turnRight(); }
                                  else if (world.facingSouth())
                                  { world.turnRight(); }
      break;
      }
    case BACK:{
      jj_consume_token(BACK);
if (world.facingNorth())
                                { world.turnRight(); world.turnRight();  }
                                else if (world.facingEast())
                                { world.turnRight(); }
                                else if (world.facingWest())
                                { world.turnRight(); world.turnRight(); world.turnRight();  }
      break;
      }
    case FRONT:{
      jj_consume_token(FRONT);
if (world.facingEast())
                                {world.turnRight(); world.turnRight(); world.turnRight(); }
                                else if (world.facingSouth())
                                {world.turnRight(); world.turnRight(); }
                                else if (world.facingWest())
                                { world.turnRight();}
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public void turntothe() throws ParseException {
    jj_consume_token(TURNTOTHE);
    jj_consume_token(61);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NORTH:{
      jj_consume_token(NORTH);
if (world.facingWest())
                        { world.turnRight(); }
                        else if (world.facingSouth())
                        { world.turnRight(); world.turnRight();  }
                        else if (world.facingEast())
                        {world.turnRight(); world.turnRight(); world.turnRight(); }
      break;
      }
    case SOUTH:{
      jj_consume_token(SOUTH);
if (world.facingNorth())
                                {world.turnRight(); world.turnRight(); }
                        else if (world.facingEast())
                                { world.turnRight();}
                        else if (world.facingWest())
                                { world.turnRight();world.turnRight();world.turnRight();}
      break;
      }
    case EAST:{
      jj_consume_token(EAST);
if (world.facingNorth())
                                {world.turnRight(); }
                        else if (world.facingWest())
                                {world.turnRight();world.turnRight(); }
                        else if (world.facingSouth())
                                {world.turnRight();world.turnRight();world.turnRight(); }
      break;
      }
    case WEST:{
      jj_consume_token(WEST);
if (world.facingNorth())
                        { world.turnRight();world.turnRight();world.turnRight();}
                        else if (world.facingEast())
                        {world.turnRight();world.turnRight();}
                        else if (world.facingSouth())
                        {world.turnRight();}
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public int valor() throws ParseException {int numero= 0;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VALOR:{
      jj_consume_token(VALOR);
numero= Integer.parseInt(token.image); {if ("" != null) return numero;}
      break;
      }
    case SIZE:{
      jj_consume_token(SIZE);
numero = world.getN(); {if ("" != null) return numero;}
      break;
      }
    case MYX:{
      jj_consume_token(MYX);
numero = (int)world.getPosition().getX(); {if ("" != null) return numero;}
      break;
      }
    case MYY:{
      jj_consume_token(MYY);
numero = (int)world.getPosition().getY(); {if ("" != null) return numero;}
      break;
      }
    case MYCHIPS:{
      jj_consume_token(MYCHIPS);
numero = world.getMyChips(); {if ("" != null) return numero;}
      break;
      }
    case MYBALLOONS:{
      jj_consume_token(MYBALLOONS);
numero = world.getMyBalloons(); {if ("" != null) return numero;}
      break;
      }
    case BALLOONSHERE:{
      jj_consume_token(BALLOONSHERE);
numero = world.countBalloons(); {if ("" != null) return numero;}
      break;
      }
    case CHIPSHERE:{
      jj_consume_token(CHIPSHERE);

      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  final public void nop() throws ParseException {
    jj_consume_token(NOP);
    jj_consume_token(63);
}

  final public void moves() throws ParseException {int perspectiva= world.getFacing();
    jj_consume_token(MOVES);
    jj_consume_token(61);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FORWARD:{
      jj_consume_token(FORWARD);
if (world.facingNorth())
                                                                 {world.up(); }
                                                                 else if (world.facingEast())
                                                                 {world.right(); }
                                                                 else if (world.facingSouth())
                                                                 {world.down(); }
                                                                 else if (world.facingWest())
                                                                 {world.left(); }
      break;
      }
    case RIGHT:{
      jj_consume_token(RIGHT);
if (world.facingNorth())
                                  {world.right(); }
                                  else if (world.facingEast())
                                  {world.down(); }
                                  else if (world.facingSouth())
                                  {world.left(); }
                                  else if (world.facingWest())
                                  {world.up(); }
      break;
      }
    case LEFT:{
      jj_consume_token(LEFT);
if (world.facingNorth())
                                  {world.left(); }
                                  else if (world.facingEast())
                                  {world.up(); }
                                  else if (world.facingSouth())
                                  {world.right(); }
                                  else if (world.facingWest())
                                  {world.down(); }
      break;
      }
    case BACK:{
      jj_consume_token(BACK);
if (world.facingNorth())
                                  {world.down(); }
                                  else if (world.facingEast())
                                  {world.left(); }
                                  else if (world.facingSouth())
                                  {world.up(); }
                                  else if (world.facingWest())
                                  {world.right(); }
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 64:{
        ;
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        break label_2;
      }
      jj_consume_token(64);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FORWARD:{
        jj_consume_token(FORWARD);
if (world.facingNorth())
                                                                 {world.up(); }
                                                                 else if (world.facingEast())
                                                                 {world.right(); }
                                                                 else if (world.facingSouth())
                                                                 {world.down(); }
                                                                 else if (world.facingWest())
                                                                 {world.left(); }
        break;
        }
      case RIGHT:{
        jj_consume_token(RIGHT);
if (world.facingNorth())
                                  {world.right(); }
                                  else if (world.facingEast())
                                  {world.down(); }
                                  else if (world.facingSouth())
                                  {world.left(); }
                                  else if (world.facingWest())
                                  {world.up(); }
        break;
        }
      case LEFT:{
        jj_consume_token(LEFT);
if (world.facingNorth())
                                  {world.left(); }
                                  else if (world.facingEast())
                                  {world.up(); }
                                  else if (world.facingSouth())
                                  {world.right(); }
                                  else if (world.facingWest())
                                  {world.down(); }
        break;
        }
      case BACK:{
        jj_consume_token(BACK);
if (world.facingNorth())
                                  {world.down(); }
                                  else if (world.facingEast())
                                  {world.left(); }
                                  else if (world.facingSouth())
                                  {world.up(); }
                                  else if (world.facingWest())
                                  {world.right(); }
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public boolean isblocked() throws ParseException {Point pos = world.getPosition();
 pos.clone();
    jj_consume_token(ISBLOCKED);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 61:{
      jj_consume_token(61);
      jj_consume_token(LEFT);
pos.move((int)pos.getX()-1, (int)pos.getY());
  System.out.println("si");
                                                                {if ("" != null) return world.isBlocked(pos);}
      break;
      }
    case RIGHT:{
      jj_consume_token(RIGHT);
pos.move((int)pos.getX()+1, (int)pos.getY());
                                                                {if ("" != null) return world.isBlocked(pos);}
      break;
      }
    case FRONT:{
      jj_consume_token(FRONT);
pos.move((int)pos.getX(), (int)pos.getY()+1);
                                                                {if ("" != null) return world.isBlocked(pos);}
      break;
      }
    case BACK:{
      jj_consume_token(BACK);
pos.move((int)pos.getX(), (int)pos.getY()-1);
                                                                {if ("" != null) return world.isBlocked(pos);}
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(62);
    throw new Error("Missing return statement in function");
}

  final public boolean isfacing() throws ParseException {boolean resp =false;
    jj_consume_token(ISFACING);
    jj_consume_token(61);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NORTH:{
      jj_consume_token(NORTH);
resp= world.facingNorth();
      break;
      }
    case SOUTH:{
      jj_consume_token(SOUTH);
resp = world.facingNorth();
      break;
      }
    case EAST:{
      jj_consume_token(EAST);
resp = world.facingNorth();
      break;
      }
    case WEST:{
      jj_consume_token(WEST);
resp = world.facingNorth();
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(62);
{if ("" != null) return resp;}
    throw new Error("Missing return statement in function");
}

  final public boolean zero() throws ParseException {
    jj_consume_token(ZERO);
    jj_consume_token(61);
{if ("" != null) return valor()==0;}
    jj_consume_token(62);
    throw new Error("Missing return statement in function");
}

  final public void safeexe() throws ParseException {
    jj_consume_token(SAFEEXE);
    jj_consume_token(61);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case WALK:{
      walk();
      break;
      }
    case JUMP:{
      jump();
      break;
      }
    case DROP:{
      drop();
      break;
      }
    case PICK:{
      pick();
      break;
      }
    case GRAB:{
      grab();
      break;
      }
    case LETGO:{
      letgo();
      break;
      }
    case POP:{
      pop();
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public boolean condicion() throws ParseException {boolean resp = false;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ISBLOCKED:{
      resp = isblocked();
      break;
      }
    case ISFACING:{
      resp = isfacing();
      break;
      }
    case ZERO:{
      resp = zero();
      break;
      }
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return resp;}
    throw new Error("Missing return statement in function");
}

  final public boolean not() throws ParseException {boolean resp = false;
    jj_consume_token(NOT);
    jj_consume_token(61);
resp = condicion();
    jj_consume_token(62);
{if ("" != null) return !resp;}
    throw new Error("Missing return statement in function");
}

  final public void condicional() throws ParseException {boolean resp= false;
    jj_consume_token(IF);
    jj_consume_token(61);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NOT:{
      resp = not();
      break;
      }
    case ISBLOCKED:
    case ISFACING:
    case ZERO:{
      resp = condicion();
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(62);
    jj_consume_token(THEN);
if (resp==true) { bloque(); }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ELSE:{
      jj_consume_token(ELSE);
if (resp==false) { bloque(); }
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      ;
    }
    jj_consume_token(FI);
}

  final public void walk() throws ParseException {int numero;
    jj_consume_token(WALK);
    jj_consume_token(61);
numero = valor(); world.moveForward(numero, false); salida = "Command: WALK";
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public void jump() throws ParseException {int numero;
    jj_consume_token(JUMP);
    jj_consume_token(61);
numero = valor(); world.moveForward(numero, false); salida = "Command: JUMP";
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public void drop() throws ParseException {int numero;
    jj_consume_token(DROP);
    jj_consume_token(61);
numero = valor(); world.putChips(numero);
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public void pick() throws ParseException {int numero;
    jj_consume_token(PICK);
    jj_consume_token(61);
numero = valor(); world.pickChips(numero);
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public void grab() throws ParseException {int numero;
    jj_consume_token(GRAB);
    jj_consume_token(61);
numero = valor(); world.grabBalloons(numero);
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public void letgo() throws ParseException {int numero;
    jj_consume_token(LETGO);
    jj_consume_token(61);
numero = valor(); world.putBalloons(numero);
    jj_consume_token(62);
    jj_consume_token(63);
}

  final public void pop() throws ParseException {int numero;
    jj_consume_token(POP);
    jj_consume_token(61);
numero = valor(); world.popBalloons(numero);
    jj_consume_token(62);
    jj_consume_token(63);
}

//boolean command(uniandes.lym.robot.view.Console sistema) :
  final public         boolean command(Console sistema) throws ParseException {int x,y;
                salida=new String();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MOV:
    case PUT:
    case GO:
    case HOP:
    case PICK:
    case POP:
    case EXEC:
    case NEW:
    case RIGHT:{
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case EXEC:
        case NEW:{
          inicial();
          break;
          }
        case RIGHT:{
          jj_consume_token(RIGHT);
          jj_consume_token(61);
          jj_consume_token(62);
world.turnRight();salida = "Command: Turnright";
          break;
          }
        case MOV:{
          jj_consume_token(MOV);
          jj_consume_token(61);
          x = num();
          jj_consume_token(62);
world.moveForward(x,false);salida = "Command: Moveforward ";
          break;
          }
        case HOP:{
          jj_consume_token(HOP);
          jj_consume_token(61);
          x = num();
          jj_consume_token(62);
world.moveForward(x,true);salida = "Command:Jumpforward ";
          break;
          }
        case GO:{
          jj_consume_token(GO);
          jj_consume_token(61);
          x = num();
          jj_consume_token(64);
          y = num();
          jj_consume_token(62);
world.setPostion(x,y);salida = "Command:GO ";
          break;
          }
        case PUT:{
          jj_consume_token(PUT);
          jj_consume_token(61);
          put();
          jj_consume_token(62);
          break;
          }
        case PICK:{
          jj_consume_token(PICK);
          jj_consume_token(61);
          get();
          jj_consume_token(62);
          break;
          }
        case POP:{
          jj_consume_token(POP);
          jj_consume_token(61);
          x = num();
          jj_consume_token(62);
world.popBalloons(x); salida = "Comando:  Pop";
          break;
          }
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(63);
try {
                                 Thread.sleep(900);
                    } catch (InterruptedException e) {
                                        System.err.format("IOException: %s%n", e);
                            }

                        sistema.printOutput(salida);
                        {if ("" != null) return true;}
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MOV:
        case PUT:
        case GO:
        case HOP:
        case PICK:
        case POP:
        case EXEC:
        case NEW:
        case RIGHT:{
          ;
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          break label_3;
        }
      }
      break;
      }
    case 0:{
      jj_consume_token(0);
{if ("" != null) return false;}
      break;
      }
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  final public void put() throws ParseException {int f=1;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CHIPS:{
      jj_consume_token(CHIPS);
      jj_consume_token(64);
      f = num();
world.putChips(f); salida = "Command:  Put Chips";
      break;
      }
    case BALLOONS:{
      jj_consume_token(BALLOONS);
      jj_consume_token(64);
      f = num();
world.putBalloons(f); salida = "Command:  Put Balloons";
      break;
      }
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void get() throws ParseException {int f=1;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CHIPS:{
      jj_consume_token(CHIPS);
      jj_consume_token(64);
      f = num();
world.pickChips(f);salida = "Command:  Pick chips";
      break;
      }
    case BALLOONS:{
      jj_consume_token(BALLOONS);
      jj_consume_token(64);
      f = num();
world.grabBalloons(f);salida="Command:  Pick balloons";
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

/**
	 * Unsigned decimal number
	 * @return the corresponding value of the string
	 * @error  corresponding value is too large
	 */
  final public 
        int num() throws ParseException, Error {int total=1;
    jj_consume_token(NUM);
try
                        {
                        }
                        catch (NumberFormatException ee)
                        {
                                {if (true) throw new Error("Number out of bounds: "+token.image+" !!");}
                        }
                        {if ("" != null) return total;}
    throw new Error("Missing return statement in function");
}

  /** Generated Token Manager. */
  public RobotTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[21];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	   jj_la1_init_2();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x0,0x0,0x3ffe00,0x3ffe00,0x0,0x0,0x80000000,0x0,0x0,0x0,0x0,0x0,0x3f800,0x38000000,0x78000000,0x800000,0x241e0,0x241e0,0x241e1,0x0,0x0,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x200400,0x300,0x0,0x0,0xf000,0xf0000,0x7f,0xb800,0x0,0xb800,0x2000d000,0xf0000,0x0,0x0,0x0,0x0,0x1300,0x1300,0x1300,0xc00000,0xc00000,};
	}
	private static void jj_la1_init_2() {
	   jj_la1_2 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
	}

  /** Constructor with InputStream. */
  public Robot(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Robot(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new RobotTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Robot(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new RobotTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new RobotTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Robot(RobotTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(RobotTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[65];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 21; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		   if ((jj_la1_2[i] & (1<<j)) != 0) {
			 la1tokens[64+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 65; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
