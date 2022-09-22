// Generated from /Users/nivanov/cosplay/modules/cosplay/src/main/scala/org/cosplay/games/mir/os/progs/asm/compiler/antlr4/MirAsm.g4 by ANTLR 4.10.1
package org.cosplay.games.mir.os.progs.asm.compiler.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MirAsmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INSRT_NAME=1, DQSTRING=2, NULL=3, DQUOTE=4, SCOLOR=5, COMMA=6, NL=7, DOLLAR=8, 
		COLON=9, DOT=10, AT=11, INT=12, REAL=13, EXP=14, ID=15, COMMENT=16, WS=17, 
		ErrorChar=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INSRT_NAME", "DQSTRING", "NULL", "DQUOTE", "SCOLOR", "COMMA", "NL", 
			"DOLLAR", "COLON", "DOT", "AT", "INT", "REAL", "EXP", "ID", "COMMENT", 
			"WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'null'", "'\"'", "';'", "','", "'\\n'", "'$'", "':'", 
			"'.'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INSRT_NAME", "DQSTRING", "NULL", "DQUOTE", "SCOLOR", "COMMA", 
			"NL", "DOLLAR", "COLON", "DOT", "AT", "INT", "REAL", "EXP", "ID", "COMMENT", 
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


	public MirAsmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MirAsm.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u0117\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00bf\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00c5\b\u0001\n\u0001"+
		"\f\u0001\u00c8\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00e3\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00e7\b\u000b\n\u000b\f\u000b\u00ea\t\u000b\u0003\u000b\u00ec\b\u000b"+
		"\u0001\f\u0001\f\u0004\f\u00f0\b\f\u000b\f\f\f\u00f1\u0001\r\u0001\r\u0003"+
		"\r\u00f6\b\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e\u00fb\b\u000e\u000b"+
		"\u000e\f\u000e\u00fc\u0001\u000f\u0001\u000f\u0005\u000f\u0101\b\u000f"+
		"\n\u000f\f\u000f\u0104\t\u000f\u0001\u000f\u0003\u000f\u0107\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u010b\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0004\u0010\u0110\b\u0010\u000b\u0010\f\u0010\u0111\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012\u0001\u0000\t\u0001\u0000\"\"\u0001\u000019\u0002\u0000"+
		"09__\u0001\u000009\u0002\u0000EEee\u0002\u0000++--\u0004\u000009AZ__a"+
		"z\u0002\u0000\n\n\r\r\u0003\u0000\t\t\f\r  \u014e\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0001\u00be\u0001\u0000\u0000\u0000\u0003\u00c0"+
		"\u0001\u0000\u0000\u0000\u0005\u00cb\u0001\u0000\u0000\u0000\u0007\u00d0"+
		"\u0001\u0000\u0000\u0000\t\u00d2\u0001\u0000\u0000\u0000\u000b\u00d4\u0001"+
		"\u0000\u0000\u0000\r\u00d6\u0001\u0000\u0000\u0000\u000f\u00d8\u0001\u0000"+
		"\u0000\u0000\u0011\u00da\u0001\u0000\u0000\u0000\u0013\u00dc\u0001\u0000"+
		"\u0000\u0000\u0015\u00de\u0001\u0000\u0000\u0000\u0017\u00eb\u0001\u0000"+
		"\u0000\u0000\u0019\u00ed\u0001\u0000\u0000\u0000\u001b\u00f3\u0001\u0000"+
		"\u0000\u0000\u001d\u00fa\u0001\u0000\u0000\u0000\u001f\u00fe\u0001\u0000"+
		"\u0000\u0000!\u010f\u0001\u0000\u0000\u0000#\u0115\u0001\u0000\u0000\u0000"+
		"%&\u0005m\u0000\u0000&\'\u0005u\u0000\u0000\'(\u0005l\u0000\u0000(\u00bf"+
		"\u0005v\u0000\u0000)*\u0005a\u0000\u0000*+\u0005n\u0000\u0000+\u00bf\u0005"+
		"d\u0000\u0000,-\u0005o\u0000\u0000-\u00bf\u0005r\u0000\u0000./\u0005m"+
		"\u0000\u0000/0\u0005o\u0000\u00000\u00bf\u0005d\u0000\u000012\u0005d\u0000"+
		"\u000023\u0005i\u0000\u000034\u0005v\u0000\u00004\u00bf\u0005v\u0000\u0000"+
		"56\u0005m\u0000\u000067\u0005u\u0000\u00007\u00bf\u0005l\u0000\u00008"+
		"9\u0005d\u0000\u00009:\u0005i\u0000\u0000:\u00bf\u0005v\u0000\u0000;<"+
		"\u0005e\u0000\u0000<\u00bf\u0005q\u0000\u0000=>\u0005n\u0000\u0000>?\u0005"+
		"e\u0000\u0000?\u00bf\u0005q\u0000\u0000@A\u0005e\u0000\u0000AB\u0005q"+
		"\u0000\u0000B\u00bf\u0005v\u0000\u0000CD\u0005n\u0000\u0000DE\u0005e\u0000"+
		"\u0000EF\u0005q\u0000\u0000F\u00bf\u0005v\u0000\u0000GH\u0005l\u0000\u0000"+
		"H\u00bf\u0005t\u0000\u0000IJ\u0005l\u0000\u0000JK\u0005t\u0000\u0000K"+
		"\u00bf\u0005e\u0000\u0000LM\u0005g\u0000\u0000M\u00bf\u0005t\u0000\u0000"+
		"NO\u0005g\u0000\u0000OP\u0005t\u0000\u0000P\u00bf\u0005e\u0000\u0000Q"+
		"R\u0005l\u0000\u0000RS\u0005t\u0000\u0000S\u00bf\u0005v\u0000\u0000TU"+
		"\u0005l\u0000\u0000UV\u0005t\u0000\u0000VW\u0005e\u0000\u0000W\u00bf\u0005"+
		"v\u0000\u0000XY\u0005g\u0000\u0000YZ\u0005t\u0000\u0000Z\u00bf\u0005v"+
		"\u0000\u0000[\\\u0005g\u0000\u0000\\]\u0005t\u0000\u0000]^\u0005e\u0000"+
		"\u0000^\u00bf\u0005v\u0000\u0000_`\u0005b\u0000\u0000`a\u0005r\u0000\u0000"+
		"a\u00bf\u0005k\u0000\u0000bc\u0005c\u0000\u0000cd\u0005b\u0000\u0000d"+
		"e\u0005r\u0000\u0000e\u00bf\u0005k\u0000\u0000fg\u0005c\u0000\u0000gh"+
		"\u0005b\u0000\u0000hi\u0005r\u0000\u0000ij\u0005k\u0000\u0000j\u00bf\u0005"+
		"v\u0000\u0000kl\u0005p\u0000\u0000lm\u0005u\u0000\u0000mn\u0005s\u0000"+
		"\u0000n\u00bf\u0005h\u0000\u0000op\u0005p\u0000\u0000pq\u0005o\u0000\u0000"+
		"q\u00bf\u0005p\u0000\u0000rs\u0005a\u0000\u0000st\u0005d\u0000\u0000t"+
		"\u00bf\u0005d\u0000\u0000uv\u0005s\u0000\u0000vw\u0005u\u0000\u0000w\u00bf"+
		"\u0005b\u0000\u0000xy\u0005a\u0000\u0000yz\u0005d\u0000\u0000z{\u0005"+
		"d\u0000\u0000{\u00bf\u0005v\u0000\u0000|}\u0005s\u0000\u0000}~\u0005u"+
		"\u0000\u0000~\u007f\u0005b\u0000\u0000\u007f\u00bf\u0005v\u0000\u0000"+
		"\u0080\u0081\u0005c\u0000\u0000\u0081\u0082\u0005a\u0000\u0000\u0082\u0083"+
		"\u0005l\u0000\u0000\u0083\u0084\u0005l\u0000\u0000\u0084\u00bf\u0005n"+
		"\u0000\u0000\u0085\u0086\u0005c\u0000\u0000\u0086\u0087\u0005a\u0000\u0000"+
		"\u0087\u0088\u0005l\u0000\u0000\u0088\u00bf\u0005l\u0000\u0000\u0089\u008a"+
		"\u0005j\u0000\u0000\u008a\u008b\u0005m\u0000\u0000\u008b\u00bf\u0005p"+
		"\u0000\u0000\u008c\u008d\u0005c\u0000\u0000\u008d\u008e\u0005j\u0000\u0000"+
		"\u008e\u008f\u0005m\u0000\u0000\u008f\u00bf\u0005p\u0000\u0000\u0090\u0091"+
		"\u0005c\u0000\u0000\u0091\u0092\u0005j\u0000\u0000\u0092\u0093\u0005m"+
		"\u0000\u0000\u0093\u0094\u0005p\u0000\u0000\u0094\u00bf\u0005v\u0000\u0000"+
		"\u0095\u0096\u0005i\u0000\u0000\u0096\u0097\u0005n\u0000\u0000\u0097\u00bf"+
		"\u0005c\u0000\u0000\u0098\u0099\u0005i\u0000\u0000\u0099\u009a\u0005n"+
		"\u0000\u0000\u009a\u009b\u0005c\u0000\u0000\u009b\u00bf\u0005v\u0000\u0000"+
		"\u009c\u009d\u0005d\u0000\u0000\u009d\u009e\u0005e\u0000\u0000\u009e\u00bf"+
		"\u0005c\u0000\u0000\u009f\u00a0\u0005d\u0000\u0000\u00a0\u00a1\u0005e"+
		"\u0000\u0000\u00a1\u00a2\u0005c\u0000\u0000\u00a2\u00bf\u0005v\u0000\u0000"+
		"\u00a3\u00a4\u0005r\u0000\u0000\u00a4\u00a5\u0005e\u0000\u0000\u00a5\u00bf"+
		"\u0005t\u0000\u0000\u00a6\u00a7\u0005l\u0000\u0000\u00a7\u00a8\u0005e"+
		"\u0000\u0000\u00a8\u00bf\u0005t\u0000\u0000\u00a9\u00aa\u0005d\u0000\u0000"+
		"\u00aa\u00ab\u0005u\u0000\u0000\u00ab\u00bf\u0005p\u0000\u0000\u00ac\u00ad"+
		"\u0005n\u0000\u0000\u00ad\u00ae\u0005o\u0000\u0000\u00ae\u00bf\u0005t"+
		"\u0000\u0000\u00af\u00b0\u0005n\u0000\u0000\u00b0\u00b1\u0005o\u0000\u0000"+
		"\u00b1\u00b2\u0005t\u0000\u0000\u00b2\u00bf\u0005v\u0000\u0000\u00b3\u00b4"+
		"\u0005n\u0000\u0000\u00b4\u00b5\u0005e\u0000\u0000\u00b5\u00bf\u0005g"+
		"\u0000\u0000\u00b6\u00b7\u0005n\u0000\u0000\u00b7\u00b8\u0005e\u0000\u0000"+
		"\u00b8\u00b9\u0005g\u0000\u0000\u00b9\u00bf\u0005v\u0000\u0000\u00ba\u00bb"+
		"\u0005e\u0000\u0000\u00bb\u00bc\u0005x\u0000\u0000\u00bc\u00bd\u0005i"+
		"\u0000\u0000\u00bd\u00bf\u0005t\u0000\u0000\u00be%\u0001\u0000\u0000\u0000"+
		"\u00be)\u0001\u0000\u0000\u0000\u00be,\u0001\u0000\u0000\u0000\u00be."+
		"\u0001\u0000\u0000\u0000\u00be1\u0001\u0000\u0000\u0000\u00be5\u0001\u0000"+
		"\u0000\u0000\u00be8\u0001\u0000\u0000\u0000\u00be;\u0001\u0000\u0000\u0000"+
		"\u00be=\u0001\u0000\u0000\u0000\u00be@\u0001\u0000\u0000\u0000\u00beC"+
		"\u0001\u0000\u0000\u0000\u00beG\u0001\u0000\u0000\u0000\u00beI\u0001\u0000"+
		"\u0000\u0000\u00beL\u0001\u0000\u0000\u0000\u00beN\u0001\u0000\u0000\u0000"+
		"\u00beQ\u0001\u0000\u0000\u0000\u00beT\u0001\u0000\u0000\u0000\u00beX"+
		"\u0001\u0000\u0000\u0000\u00be[\u0001\u0000\u0000\u0000\u00be_\u0001\u0000"+
		"\u0000\u0000\u00beb\u0001\u0000\u0000\u0000\u00bef\u0001\u0000\u0000\u0000"+
		"\u00bek\u0001\u0000\u0000\u0000\u00beo\u0001\u0000\u0000\u0000\u00ber"+
		"\u0001\u0000\u0000\u0000\u00beu\u0001\u0000\u0000\u0000\u00bex\u0001\u0000"+
		"\u0000\u0000\u00be|\u0001\u0000\u0000\u0000\u00be\u0080\u0001\u0000\u0000"+
		"\u0000\u00be\u0085\u0001\u0000\u0000\u0000\u00be\u0089\u0001\u0000\u0000"+
		"\u0000\u00be\u008c\u0001\u0000\u0000\u0000\u00be\u0090\u0001\u0000\u0000"+
		"\u0000\u00be\u0095\u0001\u0000\u0000\u0000\u00be\u0098\u0001\u0000\u0000"+
		"\u0000\u00be\u009c\u0001\u0000\u0000\u0000\u00be\u009f\u0001\u0000\u0000"+
		"\u0000\u00be\u00a3\u0001\u0000\u0000\u0000\u00be\u00a6\u0001\u0000\u0000"+
		"\u0000\u00be\u00a9\u0001\u0000\u0000\u0000\u00be\u00ac\u0001\u0000\u0000"+
		"\u0000\u00be\u00af\u0001\u0000\u0000\u0000\u00be\u00b3\u0001\u0000\u0000"+
		"\u0000\u00be\u00b6\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bf\u0002\u0001\u0000\u0000\u0000\u00c0\u00c6\u0003\u0007\u0003"+
		"\u0000\u00c1\u00c5\b\u0000\u0000\u0000\u00c2\u00c3\u0005\\\u0000\u0000"+
		"\u00c3\u00c5\u0005\"\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0003\u0007\u0003\u0000\u00ca\u0004\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005n\u0000\u0000\u00cc\u00cd\u0005u\u0000\u0000\u00cd\u00ce\u0005"+
		"l\u0000\u0000\u00ce\u00cf\u0005l\u0000\u0000\u00cf\u0006\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005\"\u0000\u0000\u00d1\b\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005;\u0000\u0000\u00d3\n\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005,\u0000\u0000\u00d5\f\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005\n\u0000\u0000\u00d7\u000e\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005"+
		"$\u0000\u0000\u00d9\u0010\u0001\u0000\u0000\u0000\u00da\u00db\u0005:\u0000"+
		"\u0000\u00db\u0012\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005.\u0000\u0000"+
		"\u00dd\u0014\u0001\u0000\u0000\u0000\u00de\u00df\u0005@\u0000\u0000\u00df"+
		"\u0016\u0001\u0000\u0000\u0000\u00e0\u00ec\u00050\u0000\u0000\u00e1\u00e3"+
		"\u0005-\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e8\u0007"+
		"\u0001\u0000\u0000\u00e5\u00e7\u0007\u0002\u0000\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e0\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e2\u0001\u0000\u0000\u0000\u00ec\u0018\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0003\u0013\t\u0000\u00ee\u00f0\u0007\u0003"+
		"\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u001a\u0001\u0000\u0000\u0000\u00f3\u00f5\u0007\u0004"+
		"\u0000\u0000\u00f4\u00f6\u0007\u0005\u0000\u0000\u00f5\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0003\u0017\u000b\u0000\u00f8\u001c\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fb\u0007\u0006\u0000\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u001e\u0001\u0000"+
		"\u0000\u0000\u00fe\u0102\u0003\t\u0004\u0000\u00ff\u0101\b\u0007\u0000"+
		"\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u0107\u0005\r\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000"+
		"\u0108\u010b\u0003\r\u0006\u0000\u0109\u010b\u0005\u0000\u0000\u0001\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0006\u000f\u0000\u0000\u010d"+
		" \u0001\u0000\u0000\u0000\u010e\u0110\u0007\b\u0000\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0006\u0010\u0000\u0000\u0114\"\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\t\u0000\u0000\u0000\u0116$\u0001\u0000"+
		"\u0000\u0000\u000e\u0000\u00be\u00c4\u00c6\u00e2\u00e8\u00eb\u00f1\u00f5"+
		"\u00fc\u0102\u0106\u010a\u0111\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}