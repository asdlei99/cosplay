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
		COLON=9, DOT=10, INT=11, REAL=12, EXP=13, USR_ID=14, SYS_ID=15, COMMENT=16, 
		WS=17, ErrorChar=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INSRT_NAME", "DQSTRING", "NULL", "DQUOTE", "SCOLOR", "COMMA", "NL", 
			"DOLLAR", "COLON", "DOT", "INT", "REAL", "EXP", "USR_ID", "SYS_ID", "COMMENT", 
			"WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'null'", "'\"'", "';'", "','", "'\\n'", "'$'", "':'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INSRT_NAME", "DQSTRING", "NULL", "DQUOTE", "SCOLOR", "COMMA", 
			"NL", "DOLLAR", "COLON", "DOT", "INT", "REAL", "EXP", "USR_ID", "SYS_ID", 
			"COMMENT", "WS", "ErrorChar"
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
		"\u0004\u0000\u0012\u00de\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
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
		"\u0001\u0000\u0001\u0000\u0003\u0000\u0088\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u008e\b\u0001\n\u0001\f\u0001\u0091"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00ab\b\n\n"+
		"\n\f\n\u00ae\t\n\u0003\n\u00b0\b\n\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u00b4\b\u000b\u000b\u000b\f\u000b\u00b5\u0001\f\u0001\f\u0003\f\u00ba"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0004\r\u00bf\b\r\u000b\r\f\r\u00c0\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00c8"+
		"\b\u000f\n\u000f\f\u000f\u00cb\t\u000f\u0001\u000f\u0003\u000f\u00ce\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d2\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0004\u0010\u00d7\b\u0010\u000b\u0010\f\u0010\u00d8"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\t\u0001\u0000\"\"\u0001\u0000"+
		"19\u0002\u000009__\u0001\u000009\u0002\u0000EEee\u0002\u0000++--\u0004"+
		"\u000009AZ__az\u0002\u0000\n\n\r\r\u0003\u0000\t\t\f\r  \u0103\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0001\u0087\u0001\u0000\u0000\u0000"+
		"\u0003\u0089\u0001\u0000\u0000\u0000\u0005\u0094\u0001\u0000\u0000\u0000"+
		"\u0007\u0099\u0001\u0000\u0000\u0000\t\u009b\u0001\u0000\u0000\u0000\u000b"+
		"\u009d\u0001\u0000\u0000\u0000\r\u009f\u0001\u0000\u0000\u0000\u000f\u00a1"+
		"\u0001\u0000\u0000\u0000\u0011\u00a3\u0001\u0000\u0000\u0000\u0013\u00a5"+
		"\u0001\u0000\u0000\u0000\u0015\u00af\u0001\u0000\u0000\u0000\u0017\u00b1"+
		"\u0001\u0000\u0000\u0000\u0019\u00b7\u0001\u0000\u0000\u0000\u001b\u00be"+
		"\u0001\u0000\u0000\u0000\u001d\u00c2\u0001\u0000\u0000\u0000\u001f\u00c5"+
		"\u0001\u0000\u0000\u0000!\u00d6\u0001\u0000\u0000\u0000#\u00dc\u0001\u0000"+
		"\u0000\u0000%&\u0005m\u0000\u0000&\'\u0005o\u0000\u0000\'\u0088\u0005"+
		"v\u0000\u0000()\u0005e\u0000\u0000)\u0088\u0005q\u0000\u0000*+\u0005n"+
		"\u0000\u0000+,\u0005e\u0000\u0000,\u0088\u0005q\u0000\u0000-.\u0005e\u0000"+
		"\u0000./\u0005q\u0000\u0000/\u0088\u0005v\u0000\u000001\u0005n\u0000\u0000"+
		"12\u0005e\u0000\u000023\u0005q\u0000\u00003\u0088\u0005v\u0000\u00004"+
		"5\u0005b\u0000\u000056\u0005r\u0000\u00006\u0088\u0005k\u0000\u000078"+
		"\u0005c\u0000\u000089\u0005b\u0000\u00009:\u0005r\u0000\u0000:\u0088\u0005"+
		"k\u0000\u0000;<\u0005c\u0000\u0000<=\u0005b\u0000\u0000=>\u0005r\u0000"+
		"\u0000>?\u0005k\u0000\u0000?\u0088\u0005v\u0000\u0000@A\u0005p\u0000\u0000"+
		"AB\u0005u\u0000\u0000BC\u0005s\u0000\u0000C\u0088\u0005h\u0000\u0000D"+
		"E\u0005p\u0000\u0000EF\u0005o\u0000\u0000F\u0088\u0005p\u0000\u0000GH"+
		"\u0005a\u0000\u0000HI\u0005d\u0000\u0000I\u0088\u0005d\u0000\u0000JK\u0005"+
		"m\u0000\u0000KL\u0005u\u0000\u0000L\u0088\u0005l\u0000\u0000MN\u0005d"+
		"\u0000\u0000NO\u0005i\u0000\u0000O\u0088\u0005v\u0000\u0000PQ\u0005s\u0000"+
		"\u0000QR\u0005u\u0000\u0000R\u0088\u0005b\u0000\u0000ST\u0005a\u0000\u0000"+
		"TU\u0005d\u0000\u0000UV\u0005d\u0000\u0000V\u0088\u0005v\u0000\u0000W"+
		"X\u0005s\u0000\u0000XY\u0005u\u0000\u0000YZ\u0005b\u0000\u0000Z\u0088"+
		"\u0005v\u0000\u0000[\\\u0005c\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005"+
		"l\u0000\u0000^_\u0005l\u0000\u0000_\u0088\u0005n\u0000\u0000`a\u0005c"+
		"\u0000\u0000ab\u0005a\u0000\u0000bc\u0005l\u0000\u0000c\u0088\u0005l\u0000"+
		"\u0000de\u0005j\u0000\u0000ef\u0005m\u0000\u0000f\u0088\u0005p\u0000\u0000"+
		"gh\u0005c\u0000\u0000hi\u0005j\u0000\u0000ij\u0005m\u0000\u0000j\u0088"+
		"\u0005p\u0000\u0000kl\u0005c\u0000\u0000lm\u0005j\u0000\u0000mn\u0005"+
		"m\u0000\u0000no\u0005p\u0000\u0000o\u0088\u0005v\u0000\u0000pq\u0005i"+
		"\u0000\u0000qr\u0005n\u0000\u0000r\u0088\u0005c\u0000\u0000st\u0005i\u0000"+
		"\u0000tu\u0005n\u0000\u0000uv\u0005c\u0000\u0000v\u0088\u0005v\u0000\u0000"+
		"wx\u0005d\u0000\u0000xy\u0005e\u0000\u0000y\u0088\u0005c\u0000\u0000z"+
		"{\u0005d\u0000\u0000{|\u0005e\u0000\u0000|}\u0005c\u0000\u0000}\u0088"+
		"\u0005v\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f\u0080\u0005e\u0000"+
		"\u0000\u0080\u0088\u0005t\u0000\u0000\u0081\u0082\u0005l\u0000\u0000\u0082"+
		"\u0083\u0005e\u0000\u0000\u0083\u0088\u0005t\u0000\u0000\u0084\u0085\u0005"+
		"d\u0000\u0000\u0085\u0086\u0005u\u0000\u0000\u0086\u0088\u0005p\u0000"+
		"\u0000\u0087%\u0001\u0000\u0000\u0000\u0087(\u0001\u0000\u0000\u0000\u0087"+
		"*\u0001\u0000\u0000\u0000\u0087-\u0001\u0000\u0000\u0000\u00870\u0001"+
		"\u0000\u0000\u0000\u00874\u0001\u0000\u0000\u0000\u00877\u0001\u0000\u0000"+
		"\u0000\u0087;\u0001\u0000\u0000\u0000\u0087@\u0001\u0000\u0000\u0000\u0087"+
		"D\u0001\u0000\u0000\u0000\u0087G\u0001\u0000\u0000\u0000\u0087J\u0001"+
		"\u0000\u0000\u0000\u0087M\u0001\u0000\u0000\u0000\u0087P\u0001\u0000\u0000"+
		"\u0000\u0087S\u0001\u0000\u0000\u0000\u0087W\u0001\u0000\u0000\u0000\u0087"+
		"[\u0001\u0000\u0000\u0000\u0087`\u0001\u0000\u0000\u0000\u0087d\u0001"+
		"\u0000\u0000\u0000\u0087g\u0001\u0000\u0000\u0000\u0087k\u0001\u0000\u0000"+
		"\u0000\u0087p\u0001\u0000\u0000\u0000\u0087s\u0001\u0000\u0000\u0000\u0087"+
		"w\u0001\u0000\u0000\u0000\u0087z\u0001\u0000\u0000\u0000\u0087~\u0001"+
		"\u0000\u0000\u0000\u0087\u0081\u0001\u0000\u0000\u0000\u0087\u0084\u0001"+
		"\u0000\u0000\u0000\u0088\u0002\u0001\u0000\u0000\u0000\u0089\u008f\u0003"+
		"\u0007\u0003\u0000\u008a\u008e\b\u0000\u0000\u0000\u008b\u008c\u0005\\"+
		"\u0000\u0000\u008c\u008e\u0005\"\u0000\u0000\u008d\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0003\u0007\u0003\u0000\u0093\u0004\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005n\u0000\u0000\u0095\u0096\u0005u\u0000\u0000\u0096"+
		"\u0097\u0005l\u0000\u0000\u0097\u0098\u0005l\u0000\u0000\u0098\u0006\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\"\u0000\u0000\u009a\b\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005;\u0000\u0000\u009c\n\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005,\u0000\u0000\u009e\f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\n\u0000\u0000\u00a0\u000e\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005$\u0000\u0000\u00a2\u0010\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005:\u0000\u0000\u00a4\u0012\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		".\u0000\u0000\u00a6\u0014\u0001\u0000\u0000\u0000\u00a7\u00b0\u00050\u0000"+
		"\u0000\u00a8\u00ac\u0007\u0001\u0000\u0000\u00a9\u00ab\u0007\u0002\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00af\u00a7\u0001\u0000\u0000\u0000\u00af\u00a8\u0001\u0000\u0000"+
		"\u0000\u00b0\u0016\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003\u0013\t\u0000"+
		"\u00b2\u00b4\u0007\u0003\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u0018\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0007\u0004\u0000\u0000\u00b8\u00ba\u0007\u0005\u0000\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u0015\n\u0000\u00bc"+
		"\u001a\u0001\u0000\u0000\u0000\u00bd\u00bf\u0007\u0006\u0000\u0000\u00be"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u001c\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005$\u0000\u0000\u00c3\u00c4"+
		"\u0003\u001b\r\u0000\u00c4\u001e\u0001\u0000\u0000\u0000\u00c5\u00c9\u0003"+
		"\t\u0004\u0000\u00c6\u00c8\b\u0007\u0000\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\r\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00d2\u0003\r\u0006\u0000"+
		"\u00d0\u00d2\u0005\u0000\u0000\u0001\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0006\u000f\u0000\u0000\u00d4 \u0001\u0000\u0000\u0000\u00d5"+
		"\u00d7\u0007\b\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0006\u0010\u0000\u0000\u00db\"\u0001\u0000\u0000\u0000\u00dc\u00dd\t"+
		"\u0000\u0000\u0000\u00dd$\u0001\u0000\u0000\u0000\r\u0000\u0087\u008d"+
		"\u008f\u00ac\u00af\u00b5\u00b9\u00c0\u00c9\u00cd\u00d1\u00d8\u0001\u0006"+
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