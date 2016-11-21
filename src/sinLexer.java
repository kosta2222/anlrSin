// Generated from sin.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sinLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ID=3, LCURBR=4, RCURBR=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'sin'", "WS", "ID", "'('", "')'"
	};
	public static final String[] ruleNames = {
		"T__0", "WS", "ID", "LCURBR", "RCURBR"
	};


	public sinLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sin.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7\37\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\6\3\23\n\3\r\3\16"+
		"\3\24\3\4\6\4\30\n\4\r\4\16\4\31\3\5\3\5\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6"+
		"\13\7\3\2\4\5\2\13\f\17\17\"\"\3\2\62; \2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\22\3\2\2\2\7\27\3\2\2\2"+
		"\t\33\3\2\2\2\13\35\3\2\2\2\r\16\7u\2\2\16\17\7k\2\2\17\20\7p\2\2\20\4"+
		"\3\2\2\2\21\23\t\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25"+
		"\3\2\2\2\25\6\3\2\2\2\26\30\t\3\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\b\3\2\2\2\33\34\7*\2\2\34\n\3\2\2\2\35\36\7"+
		"+\2\2\36\f\3\2\2\2\5\2\24\31\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}