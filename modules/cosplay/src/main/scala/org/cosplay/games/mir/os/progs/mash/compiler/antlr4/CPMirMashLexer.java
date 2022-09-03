// Generated from /Users/nivanov/cosplay/modules/cosplay/src/main/scala/org/cosplay/games/mir/os/progs/mash/compiler/antlr4/CPMirMash.g4 by ANTLR 4.10.1
package org.cosplay.games.mir.os.progs.mash.compiler.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPMirMashLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALIAS=1, CMD_ARGS_NUM=2, LAST_EXIT_STATUS=3, LAST_PID=4, LAST_BG_PID=5, 
		CMD_ARGS_LIST=6, LET=7, DEF=8, ANON_DEF=9, ASSOC=10, NATIVE=11, IF=12, 
		THEN=13, ELSE=14, WHILE=15, DO=16, YIELD=17, FOR=18, IN=19, PATH_STR=20, 
		SQSTRING=21, DQSTRING=22, BOOL=23, NULL=24, EQ=25, NEQ=26, GTEQ=27, LTEQ=28, 
		GT=29, LT=30, AND=31, AMP=32, APPEND_FILE=33, OR=34, VERT=35, NOT=36, 
		LPAR=37, RPAR=38, LBRACE=39, RBRACE=40, SQUOTE=41, DQUOTE=42, BQUOTE=43, 
		TILDA=44, LBR=45, RBR=46, POUND=47, COMMA=48, MINUS=49, DOT=50, UNDERSCORE=51, 
		ASSIGN=52, PLUS=53, QUESTION=54, MULT=55, DIV=56, MOD=57, DOLLAR=58, INT=59, 
		REAL=60, EXP=61, IDENT=62, COMMENT=63, WS=64, ErrorChar=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALIAS", "CMD_ARGS_NUM", "LAST_EXIT_STATUS", "LAST_PID", "LAST_BG_PID", 
			"CMD_ARGS_LIST", "LET", "DEF", "ANON_DEF", "ASSOC", "NATIVE", "IF", "THEN", 
			"ELSE", "WHILE", "DO", "YIELD", "FOR", "IN", "PATH_STR", "SQSTRING", 
			"DQSTRING", "BOOL", "NULL", "EQ", "NEQ", "GTEQ", "LTEQ", "GT", "LT", 
			"AND", "AMP", "APPEND_FILE", "OR", "VERT", "NOT", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "SQUOTE", "DQUOTE", "BQUOTE", "TILDA", "LBR", "RBR", "POUND", 
			"COMMA", "MINUS", "DOT", "UNDERSCORE", "ASSIGN", "PLUS", "QUESTION", 
			"MULT", "DIV", "MOD", "DOLLAR", "INT", "REAL", "EXP", "LETTER", "IDENT", 
			"COMMENT", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'alias'", "'$#'", "'$?'", "'$$'", "'$!'", "'$@'", "'let'", "'def'", 
			"'=>'", "'->'", "'native'", "'if'", "'then'", "'else'", "'while'", "'do'", 
			"'yield'", "'for'", "'<-'", null, null, null, null, "'null'", "'=='", 
			"'!='", "'>='", "'<='", "'>'", "'<'", "'&&'", "'&'", "'>>'", "'||'", 
			"'|'", "'!'", "'('", "')'", "'{'", "'}'", "'''", "'\"'", "'`'", "'~'", 
			"'['", "']'", "'#'", "','", "'-'", "'.'", "'_'", "'='", "'+'", "'?'", 
			"'*'", "'/'", "'%'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALIAS", "CMD_ARGS_NUM", "LAST_EXIT_STATUS", "LAST_PID", "LAST_BG_PID", 
			"CMD_ARGS_LIST", "LET", "DEF", "ANON_DEF", "ASSOC", "NATIVE", "IF", "THEN", 
			"ELSE", "WHILE", "DO", "YIELD", "FOR", "IN", "PATH_STR", "SQSTRING", 
			"DQSTRING", "BOOL", "NULL", "EQ", "NEQ", "GTEQ", "LTEQ", "GT", "LT", 
			"AND", "AMP", "APPEND_FILE", "OR", "VERT", "NOT", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "SQUOTE", "DQUOTE", "BQUOTE", "TILDA", "LBR", "RBR", "POUND", 
			"COMMA", "MINUS", "DOT", "UNDERSCORE", "ASSIGN", "PLUS", "QUESTION", 
			"MULT", "DIV", "MOD", "DOLLAR", "INT", "REAL", "EXP", "IDENT", "COMMENT", 
			"WS", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CPMirMashLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CPMirMash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return PATH_STR_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean PATH_STR_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getText().equals("bin/sh");
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000A\u0195\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0004\u0013\u00d4\b\u0013\u000b\u0013\f\u0013\u00d5\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u00dc\b\u0014\n\u0014"+
		"\f\u0014\u00df\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u00e7\b\u0015\n\u0015\f\u0015\u00ea"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00f7\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001"+
		"/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u00014\u0001"+
		"4\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0005:\u014c\b:\n:\f:\u014f\t:\u0003:\u0151\b:"+
		"\u0001;\u0001;\u0004;\u0155\b;\u000b;\f;\u0156\u0001<\u0001<\u0003<\u015b"+
		"\b<\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0004>\u0163\b>\u000b>\f"+
		">\u0164\u0001>\u0001>\u0001>\u0005>\u016a\b>\n>\f>\u016d\t>\u0001?\u0001"+
		"?\u0001?\u0001?\u0005?\u0173\b?\n?\f?\u0176\t?\u0001?\u0003?\u0179\b?"+
		"\u0001?\u0003?\u017c\b?\u0001?\u0001?\u0001?\u0001?\u0005?\u0182\b?\n"+
		"?\f?\u0185\t?\u0001?\u0001?\u0003?\u0189\b?\u0001?\u0001?\u0001@\u0004"+
		"@\u018e\b@\u000b@\f@\u018f\u0001@\u0001@\u0001A\u0001A\u0001\u0183\u0000"+
		"B\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={\u0000}>\u007f?\u0081"+
		"@\u0083A\u0001\u0000\f\u0006\u0000$$-9AZ__a{}}\u0001\u0000\'\'\u0001\u0000"+
		"\"\"\u0001\u000019\u0002\u000009__\u0001\u000009\u0002\u0000EEee\u0002"+
		"\u0000++--\u0002\u0000AZaz\u0002\u0000\n\n\r\r\u0001\u0001\n\n\u0003\u0000"+
		"\t\n\f\r  \u01a6\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
		"]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001"+
		"\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000"+
		"\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000"+
		"k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001"+
		"\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000"+
		"\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000"+
		"y\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001"+
		"\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001"+
		"\u0000\u0000\u0000\u0001\u0085\u0001\u0000\u0000\u0000\u0003\u008b\u0001"+
		"\u0000\u0000\u0000\u0005\u008e\u0001\u0000\u0000\u0000\u0007\u0091\u0001"+
		"\u0000\u0000\u0000\t\u0094\u0001\u0000\u0000\u0000\u000b\u0097\u0001\u0000"+
		"\u0000\u0000\r\u009a\u0001\u0000\u0000\u0000\u000f\u009e\u0001\u0000\u0000"+
		"\u0000\u0011\u00a2\u0001\u0000\u0000\u0000\u0013\u00a5\u0001\u0000\u0000"+
		"\u0000\u0015\u00a8\u0001\u0000\u0000\u0000\u0017\u00af\u0001\u0000\u0000"+
		"\u0000\u0019\u00b2\u0001\u0000\u0000\u0000\u001b\u00b7\u0001\u0000\u0000"+
		"\u0000\u001d\u00bc\u0001\u0000\u0000\u0000\u001f\u00c2\u0001\u0000\u0000"+
		"\u0000!\u00c5\u0001\u0000\u0000\u0000#\u00cb\u0001\u0000\u0000\u0000%"+
		"\u00cf\u0001\u0000\u0000\u0000\'\u00d3\u0001\u0000\u0000\u0000)\u00d9"+
		"\u0001\u0000\u0000\u0000+\u00e2\u0001\u0000\u0000\u0000-\u00f6\u0001\u0000"+
		"\u0000\u0000/\u00f8\u0001\u0000\u0000\u00001\u00fd\u0001\u0000\u0000\u0000"+
		"3\u0100\u0001\u0000\u0000\u00005\u0103\u0001\u0000\u0000\u00007\u0106"+
		"\u0001\u0000\u0000\u00009\u0109\u0001\u0000\u0000\u0000;\u010b\u0001\u0000"+
		"\u0000\u0000=\u010d\u0001\u0000\u0000\u0000?\u0110\u0001\u0000\u0000\u0000"+
		"A\u0112\u0001\u0000\u0000\u0000C\u0115\u0001\u0000\u0000\u0000E\u0118"+
		"\u0001\u0000\u0000\u0000G\u011a\u0001\u0000\u0000\u0000I\u011c\u0001\u0000"+
		"\u0000\u0000K\u011e\u0001\u0000\u0000\u0000M\u0120\u0001\u0000\u0000\u0000"+
		"O\u0122\u0001\u0000\u0000\u0000Q\u0124\u0001\u0000\u0000\u0000S\u0126"+
		"\u0001\u0000\u0000\u0000U\u0128\u0001\u0000\u0000\u0000W\u012a\u0001\u0000"+
		"\u0000\u0000Y\u012c\u0001\u0000\u0000\u0000[\u012e\u0001\u0000\u0000\u0000"+
		"]\u0130\u0001\u0000\u0000\u0000_\u0132\u0001\u0000\u0000\u0000a\u0134"+
		"\u0001\u0000\u0000\u0000c\u0136\u0001\u0000\u0000\u0000e\u0138\u0001\u0000"+
		"\u0000\u0000g\u013a\u0001\u0000\u0000\u0000i\u013c\u0001\u0000\u0000\u0000"+
		"k\u013e\u0001\u0000\u0000\u0000m\u0140\u0001\u0000\u0000\u0000o\u0142"+
		"\u0001\u0000\u0000\u0000q\u0144\u0001\u0000\u0000\u0000s\u0146\u0001\u0000"+
		"\u0000\u0000u\u0150\u0001\u0000\u0000\u0000w\u0152\u0001\u0000\u0000\u0000"+
		"y\u0158\u0001\u0000\u0000\u0000{\u015e\u0001\u0000\u0000\u0000}\u0162"+
		"\u0001\u0000\u0000\u0000\u007f\u0188\u0001\u0000\u0000\u0000\u0081\u018d"+
		"\u0001\u0000\u0000\u0000\u0083\u0193\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005a\u0000\u0000\u0086\u0087\u0005l\u0000\u0000\u0087\u0088\u0005i"+
		"\u0000\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005s\u0000\u0000"+
		"\u008a\u0002\u0001\u0000\u0000\u0000\u008b\u008c\u0005$\u0000\u0000\u008c"+
		"\u008d\u0005#\u0000\u0000\u008d\u0004\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005$\u0000\u0000\u008f\u0090\u0005?\u0000\u0000\u0090\u0006\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005$\u0000\u0000\u0092\u0093\u0005$\u0000\u0000"+
		"\u0093\b\u0001\u0000\u0000\u0000\u0094\u0095\u0005$\u0000\u0000\u0095"+
		"\u0096\u0005!\u0000\u0000\u0096\n\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005$\u0000\u0000\u0098\u0099\u0005@\u0000\u0000\u0099\f\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005l\u0000\u0000\u009b\u009c\u0005e\u0000\u0000"+
		"\u009c\u009d\u0005t\u0000\u0000\u009d\u000e\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005d\u0000\u0000\u009f\u00a0\u0005e\u0000\u0000\u00a0\u00a1\u0005"+
		"f\u0000\u0000\u00a1\u0010\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005=\u0000"+
		"\u0000\u00a3\u00a4\u0005>\u0000\u0000\u00a4\u0012\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005-\u0000\u0000\u00a6\u00a7\u0005>\u0000\u0000\u00a7\u0014"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005n\u0000\u0000\u00a9\u00aa\u0005"+
		"a\u0000\u0000\u00aa\u00ab\u0005t\u0000\u0000\u00ab\u00ac\u0005i\u0000"+
		"\u0000\u00ac\u00ad\u0005v\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae"+
		"\u0016\u0001\u0000\u0000\u0000\u00af\u00b0\u0005i\u0000\u0000\u00b0\u00b1"+
		"\u0005f\u0000\u0000\u00b1\u0018\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"t\u0000\u0000\u00b3\u00b4\u0005h\u0000\u0000\u00b4\u00b5\u0005e\u0000"+
		"\u0000\u00b5\u00b6\u0005n\u0000\u0000\u00b6\u001a\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005e\u0000\u0000\u00b8\u00b9\u0005l\u0000\u0000\u00b9\u00ba"+
		"\u0005s\u0000\u0000\u00ba\u00bb\u0005e\u0000\u0000\u00bb\u001c\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005w\u0000\u0000\u00bd\u00be\u0005h\u0000\u0000"+
		"\u00be\u00bf\u0005i\u0000\u0000\u00bf\u00c0\u0005l\u0000\u0000\u00c0\u00c1"+
		"\u0005e\u0000\u0000\u00c1\u001e\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"d\u0000\u0000\u00c3\u00c4\u0005o\u0000\u0000\u00c4 \u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005y\u0000\u0000\u00c6\u00c7\u0005i\u0000\u0000\u00c7"+
		"\u00c8\u0005e\u0000\u0000\u00c8\u00c9\u0005l\u0000\u0000\u00c9\u00ca\u0005"+
		"d\u0000\u0000\u00ca\"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005f\u0000"+
		"\u0000\u00cc\u00cd\u0005o\u0000\u0000\u00cd\u00ce\u0005r\u0000\u0000\u00ce"+
		"$\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005<\u0000\u0000\u00d0\u00d1\u0005"+
		"-\u0000\u0000\u00d1&\u0001\u0000\u0000\u0000\u00d2\u00d4\u0007\u0000\u0000"+
		"\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0004\u0013\u0000"+
		"\u0000\u00d8(\u0001\u0000\u0000\u0000\u00d9\u00dd\u0003Q(\u0000\u00da"+
		"\u00dc\b\u0001\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003Q(\u0000\u00e1*\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e8\u0003S)\u0000\u00e3\u00e7\b\u0002\u0000\u0000"+
		"\u00e4\u00e5\u0005\\\u0000\u0000\u00e5\u00e7\u0005\"\u0000\u0000\u00e6"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003S)\u0000\u00ec,\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005t\u0000\u0000\u00ee\u00ef\u0005r\u0000"+
		"\u0000\u00ef\u00f0\u0005u\u0000\u0000\u00f0\u00f7\u0005e\u0000\u0000\u00f1"+
		"\u00f2\u0005f\u0000\u0000\u00f2\u00f3\u0005a\u0000\u0000\u00f3\u00f4\u0005"+
		"l\u0000\u0000\u00f4\u00f5\u0005s\u0000\u0000\u00f5\u00f7\u0005e\u0000"+
		"\u0000\u00f6\u00ed\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f7.\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005n\u0000\u0000\u00f9"+
		"\u00fa\u0005u\u0000\u0000\u00fa\u00fb\u0005l\u0000\u0000\u00fb\u00fc\u0005"+
		"l\u0000\u0000\u00fc0\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005=\u0000"+
		"\u0000\u00fe\u00ff\u0005=\u0000\u0000\u00ff2\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005!\u0000\u0000\u0101\u0102\u0005=\u0000\u0000\u01024\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0005>\u0000\u0000\u0104\u0105\u0005=\u0000"+
		"\u0000\u01056\u0001\u0000\u0000\u0000\u0106\u0107\u0005<\u0000\u0000\u0107"+
		"\u0108\u0005=\u0000\u0000\u01088\u0001\u0000\u0000\u0000\u0109\u010a\u0005"+
		">\u0000\u0000\u010a:\u0001\u0000\u0000\u0000\u010b\u010c\u0005<\u0000"+
		"\u0000\u010c<\u0001\u0000\u0000\u0000\u010d\u010e\u0005&\u0000\u0000\u010e"+
		"\u010f\u0005&\u0000\u0000\u010f>\u0001\u0000\u0000\u0000\u0110\u0111\u0005"+
		"&\u0000\u0000\u0111@\u0001\u0000\u0000\u0000\u0112\u0113\u0005>\u0000"+
		"\u0000\u0113\u0114\u0005>\u0000\u0000\u0114B\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005|\u0000\u0000\u0116\u0117\u0005|\u0000\u0000\u0117D\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005|\u0000\u0000\u0119F\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0005!\u0000\u0000\u011bH\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005(\u0000\u0000\u011dJ\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		")\u0000\u0000\u011fL\u0001\u0000\u0000\u0000\u0120\u0121\u0005{\u0000"+
		"\u0000\u0121N\u0001\u0000\u0000\u0000\u0122\u0123\u0005}\u0000\u0000\u0123"+
		"P\u0001\u0000\u0000\u0000\u0124\u0125\u0005\'\u0000\u0000\u0125R\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005\"\u0000\u0000\u0127T\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0005`\u0000\u0000\u0129V\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0005~\u0000\u0000\u012bX\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0005[\u0000\u0000\u012dZ\u0001\u0000\u0000\u0000\u012e\u012f\u0005]"+
		"\u0000\u0000\u012f\\\u0001\u0000\u0000\u0000\u0130\u0131\u0005#\u0000"+
		"\u0000\u0131^\u0001\u0000\u0000\u0000\u0132\u0133\u0005,\u0000\u0000\u0133"+
		"`\u0001\u0000\u0000\u0000\u0134\u0135\u0005-\u0000\u0000\u0135b\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005.\u0000\u0000\u0137d\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005_\u0000\u0000\u0139f\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005=\u0000\u0000\u013bh\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"+\u0000\u0000\u013dj\u0001\u0000\u0000\u0000\u013e\u013f\u0005?\u0000"+
		"\u0000\u013fl\u0001\u0000\u0000\u0000\u0140\u0141\u0005*\u0000\u0000\u0141"+
		"n\u0001\u0000\u0000\u0000\u0142\u0143\u0005/\u0000\u0000\u0143p\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0005%\u0000\u0000\u0145r\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0005$\u0000\u0000\u0147t\u0001\u0000\u0000\u0000\u0148"+
		"\u0151\u00050\u0000\u0000\u0149\u014d\u0007\u0003\u0000\u0000\u014a\u014c"+
		"\u0007\u0004\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014f"+
		"\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u0150\u0148\u0001\u0000\u0000\u0000\u0150\u0149"+
		"\u0001\u0000\u0000\u0000\u0151v\u0001\u0000\u0000\u0000\u0152\u0154\u0003"+
		"c1\u0000\u0153\u0155\u0007\u0005\u0000\u0000\u0154\u0153\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157x\u0001\u0000\u0000\u0000"+
		"\u0158\u015a\u0007\u0006\u0000\u0000\u0159\u015b\u0007\u0007\u0000\u0000"+
		"\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0003u:\u0000\u015dz"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0007\b\u0000\u0000\u015f|\u0001"+
		"\u0000\u0000\u0000\u0160\u0163\u0003e2\u0000\u0161\u0163\u0003{=\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u016b\u0001\u0000\u0000\u0000"+
		"\u0166\u016a\u0003e2\u0000\u0167\u016a\u0003{=\u0000\u0168\u016a\u0007"+
		"\u0005\u0000\u0000\u0169\u0166\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016d\u0001"+
		"\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016c~\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005/\u0000\u0000\u016f\u0170\u0005/\u0000\u0000"+
		"\u0170\u0174\u0001\u0000\u0000\u0000\u0171\u0173\b\t\u0000\u0000\u0172"+
		"\u0171\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177"+
		"\u0179\u0005\r\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0001\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u017c"+
		"\u0007\n\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c\u0189\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0005/\u0000\u0000\u017e\u017f\u0005*\u0000"+
		"\u0000\u017f\u0183\u0001\u0000\u0000\u0000\u0180\u0182\t\u0000\u0000\u0000"+
		"\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0005*\u0000\u0000\u0187\u0189\u0005/\u0000\u0000\u0188\u016e"+
		"\u0001\u0000\u0000\u0000\u0188\u017d\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0006?\u0000\u0000\u018b\u0080\u0001"+
		"\u0000\u0000\u0000\u018c\u018e\u0007\u000b\u0000\u0000\u018d\u018c\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u018d\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0006@\u0000\u0000\u0192\u0082\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\t\u0000\u0000\u0000\u0194\u0084\u0001\u0000\u0000"+
		"\u0000\u0014\u0000\u00d5\u00dd\u00e6\u00e8\u00f6\u014d\u0150\u0156\u015a"+
		"\u0162\u0164\u0169\u016b\u0174\u0178\u017b\u0183\u0188\u018f\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}