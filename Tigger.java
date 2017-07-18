/* Generated By:JavaCC: Do not edit this line. Tigger.java */
import ast.*;
import java.util.*;
import java.lang.AssertionError;
import java.io.*;
import java.lang.System;



public class Tigger implements TiggerConstants {
  public static VisiteurEvaluation visiteur = new VisiteurEvaluation();
  public static VisiteurPrint printer = new VisiteurPrint();

    public static void main(String args[]) throws ParseException
    {

        try{
                if(args[0].equals("check")){
                        InputStream is = new FileInputStream("test.txt");
                        System.setIn(is);
                        Tigger parser = new Tigger(System.in);
                        int n = 0;
                        while(n<100){
                                try{
                                        Expression exp = parser.mainloop();
                                        System.out.println(exp.accepter(printer) + " = " +exp.accepter(visiteur));
                                        n=n+1;
                                } catch (Exception e){System.exit(0);}
                        }
                }
                System.exit(0);
        }
        catch (Exception e){
                System.out.println(e.getMessage());
        }

        Tigger parser = new Tigger(System.in);
        while (true) {
                try {
                        Expression exp = parser.mainloop();
                        System.out.println(exp.accepter(visiteur));
                     }
                catch (Exception e) {
                        //e.printStackTrace(); 
                        System.out.println(e.getMessage());
                        parser.ReInit(System.in);
                }
        }

    }

// Main lopp: read expressions on a line until end of file.
//     mainloop â†’ (expression <EOL>)* <EOF>
  static final public Expression mainloop() throws ParseException {
  Expression exp;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUMBER:
      case EOL:
      case PRINT:
      case LPAR:
      case IF:
      case LET:
      case WORD:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 32:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUMBER:
      case LPAR:
      case WORD:
      case 22:
      case 23:
      case 32:
        exp = expression();
                                   {if (true) return exp;}
        break;
      case LET:
        exp = letIn();
                                {if (true) return exp;}
        break;
      case IF:
        exp = ifThenElse();
                                     {if (true) return exp;}
        break;
      case PRINT:
        exp = print();
                                {if (true) return exp;}
        break;
      case 19:
        jj_consume_token(19);
        break;
      case 20:
        jj_consume_token(20);
                        System.exit(0);
        break;
      case 21:
        jj_consume_token(21);
                       {if (true) return new Help();}
        break;
      case EOL:
        jj_consume_token(EOL);
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
    throw new Error("Missing return statement in function");
  }

// Expression (the axiome).
//E -> T ( +T | -T)*
//F -> <NUM> | (E)
  static final public Expression expression() throws ParseException {
  Expression exp, a, b;
    a = term();
               exp = a;
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 22:
        jj_consume_token(22);
        b = term();
                     exp= new Addition(exp, b);
        break;
      case 23:
        jj_consume_token(23);
        b = term();
                       exp= new Soustraction(exp,b);
        break;
      case 24:
        jj_consume_token(24);
        b = expression();
                            exp= new Inf(exp,b);
        break;
      case 25:
        jj_consume_token(25);
        b = expression();
                            exp= new Sup(exp,b);
        break;
      case 26:
        jj_consume_token(26);
        b = expression();
                            exp= new Egal(exp,b);
        break;
      case 27:
        jj_consume_token(27);
        b = expression();
                             exp= new InfEgal(exp,b);
        break;
      case 28:
        jj_consume_token(28);
        b = expression();
                             exp= new SupEgal(exp,b);
        break;
      case 29:
        jj_consume_token(29);
        b = expression();
                             exp= new Different(exp,b);
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
         {if (true) return exp;}
    throw new Error("Missing return statement in function");
  }

// T -> F (*F|/F)*
  static final public Expression term() throws ParseException {
  Expression exp, a, b;
    a = factor();
                 exp = a;
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 30:
      case 31:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 30:
        jj_consume_token(30);
        b = factor();
                       exp= new Multiplication(exp,b);
        break;
      case 31:
        jj_consume_token(31);
        b = factor();
                       exp= new Division(exp,b);
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
         {if (true) return exp;}
    throw new Error("Missing return statement in function");
  }

// factor of an expression.
  static final public Expression factor() throws ParseException {
  Token t; Expression exp;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMBER:
      t = jj_consume_token(NUMBER);
                 {if (true) return new Constante(Integer.parseInt(t.toString()));}
      break;
    case 22:
      jj_consume_token(22);
      t = jj_consume_token(NUMBER);
                      {if (true) return new Plus( new Constante(Integer.parseInt(t.toString())));}
      break;
    case 23:
      jj_consume_token(23);
      t = jj_consume_token(NUMBER);
                      {if (true) return new Moins(new Constante(Integer.parseInt(t.toString())));}
      break;
    case WORD:
    case 32:
      exp = call();
                    {if (true) return exp;}
      break;
    case LPAR:
      jj_consume_token(LPAR);
      exp = expression();
      jj_consume_token(RPAR);
                                 {if (true) return exp;}
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

// call to a function or a variable
  static final public Expression call() throws ParseException {
 Token t; Expression exp; List<Expression> args= new ArrayList<Expression>();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WORD:
      t = jj_consume_token(WORD);
                        if(t.toString().equals("quit") ) {
                                System.exit(0);
                        }
                        else if (t.toString().equals("help") ) {
                                {if (true) return new Help();}
                        }
                        else{
                        exp = new VariableCall(new String(""+t)); {if (true) return exp;}
                        }
      break;
    case 32:
      jj_consume_token(32);
      t = jj_consume_token(WORD);
      jj_consume_token(LPAR);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUMBER:
        case LPAR:
        case WORD:
        case 22:
        case 23:
        case 32:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_4;
        }
        exp = expression();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 19:
          jj_consume_token(19);
          break;
        default:
          jj_la1[8] = jj_gen;
          ;
        }
                                                          args.add(exp);
      }
      jj_consume_token(RPAR);
                 exp = new FunctionCall(t.toString(), args); {if (true) return exp;}
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

// Boolean expression
  static final public Expression ifThenElse() throws ParseException {
 Expression a, b, c, exp;
    jj_consume_token(IF);
    a = mainloop();
    jj_consume_token(THEN);
    b = mainloop();
    jj_consume_token(ELSE);
    c = mainloop();
                                                                   exp = new IfThenElse(a,b,c); {if (true) return exp;}
    throw new Error("Missing return statement in function");
  }

// let in end 
  static final public Expression letIn() throws ParseException {
 Expression vd, exp; Token name; Expression fd; List<VariableDec> let; List<FunctionDec> fl; List<Expression> in;
          let = new ArrayList<VariableDec>();
          in = new ArrayList<Expression>();
          fl = new ArrayList<FunctionDec>();
    jj_consume_token(LET);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IN:
    case VAR:
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case VAR:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_5;
        }
        jj_consume_token(VAR);
        name = jj_consume_token(WORD);
        jj_consume_token(33);
        vd = mainloop();
                                                                let.add(new VariableDec(new String(""+name), vd));
      }
      jj_consume_token(IN);
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 0:
        case NUMBER:
        case EOL:
        case PRINT:
        case LPAR:
        case IF:
        case LET:
        case WORD:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 32:
          ;
          break;
        default:
          jj_la1[11] = jj_gen;
          break label_6;
        }
        exp = mainloop();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 19:
          jj_consume_token(19);
          break;
        default:
          jj_la1[12] = jj_gen;
          ;
        }
                                                                                                                                                                             in.add(exp);
      }
      jj_consume_token(END);
                                                                                                                                                                                                     exp = new LetIn(let, in); {if (true) return exp;}
      break;
    case FUNCTION:
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case FUNCTION:
          ;
          break;
        default:
          jj_la1[13] = jj_gen;
          break label_7;
        }
        fd = functionDec();
                                             fl.add( (FunctionDec) fd);
      }
      jj_consume_token(IN);
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 0:
        case NUMBER:
        case EOL:
        case PRINT:
        case LPAR:
        case IF:
        case LET:
        case WORD:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 32:
          ;
          break;
        default:
          jj_la1[14] = jj_gen;
          break label_8;
        }
        exp = mainloop();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 19:
          jj_consume_token(19);
          break;
        default:
          jj_la1[15] = jj_gen;
          ;
        }
                                                                                                        in.add(exp);
      }
      jj_consume_token(END);
                               exp = new LetInFunction(fl, in); {if (true) return exp;}
      break;
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

//function declaration 
  static final public Expression functionDec() throws ParseException {
 Expression exp, v; Token name; List<Expression> args;
          args = new ArrayList<Expression>();
    jj_consume_token(FUNCTION);
    name = jj_consume_token(WORD);
    jj_consume_token(LPAR);
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUMBER:
      case LPAR:
      case WORD:
      case 22:
      case 23:
      case 32:
        ;
        break;
      default:
        jj_la1[17] = jj_gen;
        break label_9;
      }
      exp = expression();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 19:
        jj_consume_token(19);
        break;
      default:
        jj_la1[18] = jj_gen;
        ;
      }
                                                                  args.add(exp);
    }
    jj_consume_token(RPAR);
    jj_consume_token(26);
    v = mainloop();
                          exp = new FunctionDec(name.toString(), v, args) ; {if (true) return exp;}
    throw new Error("Missing return statement in function");
  }

//primitive print
  static final public Expression print() throws ParseException {
 Expression a, exp;
    jj_consume_token(PRINT);
    jj_consume_token(LPAR);
    a = mainloop();
    jj_consume_token(RPAR);

         exp = new Print(a); {if (true) return exp;}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public TiggerTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xfc25d0,0xfc25d0,0x3fc00000,0x3fc00000,0xc0000000,0xc0000000,0xc40110,0xc40110,0x80000,0x40000,0x10000,0xfc25d1,0x80000,0x20000,0xfc25d1,0x80000,0x34000,0xc40110,0x80000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x1,0x1,0x0,0x0,0x0,0x0,0x1,0x1,0x0,0x1,0x0,0x1,0x0,0x0,0x1,0x0,0x0,0x1,0x0,};
   }

  /** Constructor with InputStream. */
  public Tigger(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Tigger(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new TiggerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Tigger(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new TiggerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Tigger(TiggerTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(TiggerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
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
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[34];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 34; i++) {
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

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
