// Generated from /Users/nivanov/cosplay/modules/cosplay/src/main/scala/org/cosplay/games/mir/os/progs/mash/compiler/antlr4/CPMirMashCmd.g4 by ANTLR 4.10.1
package org.cosplay.games.mir.os.progs.mash.compiler.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPMirMashCmdParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AMP=1, PIPE_IN=2, TO_FILE=3, APPEND=4, STR=5, WS=6, ErrorChar=7;
	public static final int
		RULE_mashCmd = 0, RULE_pipeline = 1, RULE_item = 2, RULE_prg = 3, RULE_args = 4, 
		RULE_op = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"mashCmd", "pipeline", "item", "prg", "args", "op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'||'", "'>'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AMP", "PIPE_IN", "TO_FILE", "APPEND", "STR", "WS", "ErrorChar"
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

	@Override
	public String getGrammarFileName() { return "CPMirMashCmd.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPMirMashCmdParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MashCmdContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CPMirMashCmdParser.EOF, 0); }
		public MashCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mashCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).enterMashCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).exitMashCmd(this);
		}
	}

	public final MashCmdContext mashCmd() throws RecognitionException {
		MashCmdContext _localctx = new MashCmdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mashCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			pipeline(0);
			setState(13);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PipelineContext extends ParserRuleContext {
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).exitPipeline(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		return pipeline(0);
	}

	private PipelineContext pipeline(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PipelineContext _localctx = new PipelineContext(_ctx, _parentState);
		PipelineContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_pipeline, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(16);
			item();
			}
			_ctx.stop = _input.LT(-1);
			setState(24);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PipelineContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pipeline);
					setState(18);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(19);
					op();
					setState(20);
					item();
					}
					} 
				}
				setState(26);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public PrgContext prg() {
			return getRuleContext(PrgContext.class,0);
		}
		public TerminalNode AMP() { return getToken(CPMirMashCmdParser.AMP, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			prg();
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(28);
				match(AMP);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrgContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(CPMirMashCmdParser.STR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).exitPrg(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(STR);
			setState(32);
			args(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(CPMirMashCmdParser.STR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(35);
			match(STR);
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(37);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(38);
					match(STR);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode PIPE_IN() { return getToken(CPMirMashCmdParser.PIPE_IN, 0); }
		public TerminalNode TO_FILE() { return getToken(CPMirMashCmdParser.TO_FILE, 0); }
		public TerminalNode APPEND() { return getToken(CPMirMashCmdParser.APPEND, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPMirMashCmdListener ) ((CPMirMashCmdListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIPE_IN) | (1L << TO_FILE) | (1L << APPEND))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return pipeline_sempred((PipelineContext)_localctx, predIndex);
		case 4:
			return args_sempred((ArgsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pipeline_sempred(PipelineContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0007/\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0017\b\u0001\n\u0001\f\u0001\u001a\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u001e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004(\b\u0004"+
		"\n\u0004\f\u0004+\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0002"+
		"\u0002\b\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0001\u0001\u0000\u0002"+
		"\u0004+\u0000\f\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000"+
		"\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006\u001f\u0001\u0000\u0000"+
		"\u0000\b\"\u0001\u0000\u0000\u0000\n,\u0001\u0000\u0000\u0000\f\r\u0003"+
		"\u0002\u0001\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0006\u0001\uffff\uffff\u0000\u0010\u0011\u0003"+
		"\u0004\u0002\u0000\u0011\u0018\u0001\u0000\u0000\u0000\u0012\u0013\n\u0001"+
		"\u0000\u0000\u0013\u0014\u0003\n\u0005\u0000\u0014\u0015\u0003\u0004\u0002"+
		"\u0000\u0015\u0017\u0001\u0000\u0000\u0000\u0016\u0012\u0001\u0000\u0000"+
		"\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0003\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001d\u0003\u0006\u0003"+
		"\u0000\u001c\u001e\u0005\u0001\u0000\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0005\u0001\u0000\u0000"+
		"\u0000\u001f \u0005\u0005\u0000\u0000 !\u0003\b\u0004\u0000!\u0007\u0001"+
		"\u0000\u0000\u0000\"#\u0006\u0004\uffff\uffff\u0000#$\u0005\u0005\u0000"+
		"\u0000$)\u0001\u0000\u0000\u0000%&\n\u0001\u0000\u0000&(\u0005\u0005\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*\t\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,-\u0007\u0000\u0000\u0000-\u000b\u0001\u0000\u0000"+
		"\u0000\u0003\u0018\u001d)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}