/*
* generated by Xtext
*/
package tr.edu.metu.ceng.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import tr.edu.metu.ceng.services.XperimenterGrammarAccess;

public class XperimenterParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XperimenterGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected tr.edu.metu.ceng.parser.antlr.internal.InternalXperimenterParser createParser(XtextTokenStream stream) {
		return new tr.edu.metu.ceng.parser.antlr.internal.InternalXperimenterParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public XperimenterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XperimenterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
