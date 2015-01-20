package tr.edu.metu.ceng.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tr.edu.metu.ceng.services.XperimenterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXperimenterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'experiment'", "'{'", "'desc'", "';'", "'objective'", "'design'", "'simulation'", "'analysis'", "'visual'", "'timeout'", "'}'", "'method'", "'varlist'", "'modelFile'", "'modelType'", "'statAnalysis'", "'service'", "'inport'", "':'", "'outport'", "'variable'", "'group'", "'['", "','", "']'", "'gen'", "'COMPARATIVE'", "'SCREENING'", "'RESPSURFACE'", "'STATIC'", "'CONTINUOUS'", "'DISCRETEEVENT'", "'FACTOR'", "'RESPONSE'", "'BOOLEAN'", "'INTEGER'", "'FLOAT'", "'STRING'", "'RANDOMIZED'", "'RANDOMIZEDBLOCK'", "'FACTORIAL'", "'FRACFACTORIAL'", "'CENTRALCOMP'", "'HISTOGRAM'", "'SCATTERPLOT'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalXperimenterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXperimenterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXperimenterParser.tokenNames; }
    public String getGrammarFileName() { return "../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g"; }



     	private XperimenterGrammarAccess grammarAccess;
     	
        public InternalXperimenterParser(TokenStream input, XperimenterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected XperimenterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:80:28: ( ( (lv_elements_0_0= ruleType ) )* )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:81:1: ( (lv_elements_0_0= ruleType ) )*
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:81:1: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=16 && LA1_0<=17)||LA1_0==26||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:82:1: (lv_elements_0_0= ruleType )
            	    {
            	    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:82:1: (lv_elements_0_0= ruleType )
            	    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:83:3: lv_elements_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleModel130);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:107:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:108:2: (iv_ruleType= ruleType EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:109:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType166);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:116:1: ruleType returns [EObject current=null] : (this_Experiment_0= ruleExperiment | this_Design_1= ruleDesign | this_StatAnalysis_2= ruleStatAnalysis | this_Simulation_3= ruleSimulation | this_Variable_4= ruleVariable ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Experiment_0 = null;

        EObject this_Design_1 = null;

        EObject this_StatAnalysis_2 = null;

        EObject this_Simulation_3 = null;

        EObject this_Variable_4 = null;


         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:119:28: ( (this_Experiment_0= ruleExperiment | this_Design_1= ruleDesign | this_StatAnalysis_2= ruleStatAnalysis | this_Simulation_3= ruleSimulation | this_Variable_4= ruleVariable ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:120:1: (this_Experiment_0= ruleExperiment | this_Design_1= ruleDesign | this_StatAnalysis_2= ruleStatAnalysis | this_Simulation_3= ruleSimulation | this_Variable_4= ruleVariable )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:120:1: (this_Experiment_0= ruleExperiment | this_Design_1= ruleDesign | this_StatAnalysis_2= ruleStatAnalysis | this_Simulation_3= ruleSimulation | this_Variable_4= ruleVariable )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:121:5: this_Experiment_0= ruleExperiment
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getExperimentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExperiment_in_ruleType223);
                    this_Experiment_0=ruleExperiment();

                    state._fsp--;

                     
                            current = this_Experiment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:131:5: this_Design_1= ruleDesign
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDesignParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDesign_in_ruleType250);
                    this_Design_1=ruleDesign();

                    state._fsp--;

                     
                            current = this_Design_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:141:5: this_StatAnalysis_2= ruleStatAnalysis
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStatAnalysisParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStatAnalysis_in_ruleType277);
                    this_StatAnalysis_2=ruleStatAnalysis();

                    state._fsp--;

                     
                            current = this_StatAnalysis_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:151:5: this_Simulation_3= ruleSimulation
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimulationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSimulation_in_ruleType304);
                    this_Simulation_3=ruleSimulation();

                    state._fsp--;

                     
                            current = this_Simulation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:161:5: this_Variable_4= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getVariableParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleType331);
                    this_Variable_4=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExperiment"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:177:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:178:2: (iv_ruleExperiment= ruleExperiment EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:179:2: iv_ruleExperiment= ruleExperiment EOF
            {
             newCompositeNode(grammarAccess.getExperimentRule()); 
            pushFollow(FOLLOW_ruleExperiment_in_entryRuleExperiment366);
            iv_ruleExperiment=ruleExperiment();

            state._fsp--;

             current =iv_ruleExperiment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperiment376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExperiment"


    // $ANTLR start "ruleExperiment"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:186:1: ruleExperiment returns [EObject current=null] : (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? otherlv_6= 'objective' ( (lv_objective_7_0= ruleObjective ) ) otherlv_8= ';' otherlv_9= 'design' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'simulation' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' otherlv_15= 'analysis' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'visual' ( (lv_visualization_19_0= ruleVisualizationType ) ) otherlv_20= ';' (otherlv_21= 'timeout' ( (lv_timeout_22_0= RULE_INT ) ) otherlv_23= ';' )? otherlv_24= '}' ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_timeout_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Enumerator lv_objective_7_0 = null;

        Enumerator lv_visualization_19_0 = null;


         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:189:28: ( (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? otherlv_6= 'objective' ( (lv_objective_7_0= ruleObjective ) ) otherlv_8= ';' otherlv_9= 'design' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'simulation' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' otherlv_15= 'analysis' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'visual' ( (lv_visualization_19_0= ruleVisualizationType ) ) otherlv_20= ';' (otherlv_21= 'timeout' ( (lv_timeout_22_0= RULE_INT ) ) otherlv_23= ';' )? otherlv_24= '}' ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:190:1: (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? otherlv_6= 'objective' ( (lv_objective_7_0= ruleObjective ) ) otherlv_8= ';' otherlv_9= 'design' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'simulation' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' otherlv_15= 'analysis' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'visual' ( (lv_visualization_19_0= ruleVisualizationType ) ) otherlv_20= ';' (otherlv_21= 'timeout' ( (lv_timeout_22_0= RULE_INT ) ) otherlv_23= ';' )? otherlv_24= '}' )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:190:1: (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? otherlv_6= 'objective' ( (lv_objective_7_0= ruleObjective ) ) otherlv_8= ';' otherlv_9= 'design' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'simulation' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' otherlv_15= 'analysis' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'visual' ( (lv_visualization_19_0= ruleVisualizationType ) ) otherlv_20= ';' (otherlv_21= 'timeout' ( (lv_timeout_22_0= RULE_INT ) ) otherlv_23= ';' )? otherlv_24= '}' )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:190:3: otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? otherlv_6= 'objective' ( (lv_objective_7_0= ruleObjective ) ) otherlv_8= ';' otherlv_9= 'design' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'simulation' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' otherlv_15= 'analysis' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'visual' ( (lv_visualization_19_0= ruleVisualizationType ) ) otherlv_20= ';' (otherlv_21= 'timeout' ( (lv_timeout_22_0= RULE_INT ) ) otherlv_23= ';' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleExperiment413); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentAccess().getExperimentKeyword_0());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:194:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:195:1: (lv_name_1_0= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:195:1: (lv_name_1_0= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:196:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperiment430); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExperiment447); 

                	newLeafNode(otherlv_2, grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:216:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:216:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleExperiment460); 

                        	newLeafNode(otherlv_3, grammarAccess.getExperimentAccess().getDescKeyword_3_0());
                        
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:220:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:221:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:221:1: (lv_description_4_0= RULE_STRING )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:222:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExperiment477); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getExperimentAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleExperiment494); 

                        	newLeafNode(otherlv_5, grammarAccess.getExperimentAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleExperiment508); 

                	newLeafNode(otherlv_6, grammarAccess.getExperimentAccess().getObjectiveKeyword_4());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:246:1: ( (lv_objective_7_0= ruleObjective ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:247:1: (lv_objective_7_0= ruleObjective )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:247:1: (lv_objective_7_0= ruleObjective )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:248:3: lv_objective_7_0= ruleObjective
            {
             
            	        newCompositeNode(grammarAccess.getExperimentAccess().getObjectiveObjectiveEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleObjective_in_ruleExperiment529);
            lv_objective_7_0=ruleObjective();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentRule());
            	        }
                   		set(
                   			current, 
                   			"objective",
                    		lv_objective_7_0, 
                    		"Objective");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleExperiment541); 

                	newLeafNode(otherlv_8, grammarAccess.getExperimentAccess().getSemicolonKeyword_6());
                
            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleExperiment553); 

                	newLeafNode(otherlv_9, grammarAccess.getExperimentAccess().getDesignKeyword_7());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:272:1: ( (otherlv_10= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:273:1: (otherlv_10= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:273:1: (otherlv_10= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:274:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperiment573); 

            		newLeafNode(otherlv_10, grammarAccess.getExperimentAccess().getDesignDesignCrossReference_8_0()); 
            	

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleExperiment585); 

                	newLeafNode(otherlv_11, grammarAccess.getExperimentAccess().getSemicolonKeyword_9());
                
            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleExperiment597); 

                	newLeafNode(otherlv_12, grammarAccess.getExperimentAccess().getSimulationKeyword_10());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:293:1: ( (otherlv_13= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:294:1: (otherlv_13= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:294:1: (otherlv_13= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:295:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperiment617); 

            		newLeafNode(otherlv_13, grammarAccess.getExperimentAccess().getSimulationSimulationCrossReference_11_0()); 
            	

            }


            }

            otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleExperiment629); 

                	newLeafNode(otherlv_14, grammarAccess.getExperimentAccess().getSemicolonKeyword_12());
                
            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleExperiment641); 

                	newLeafNode(otherlv_15, grammarAccess.getExperimentAccess().getAnalysisKeyword_13());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:314:1: ( (otherlv_16= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:315:1: (otherlv_16= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:315:1: (otherlv_16= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:316:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperiment661); 

            		newLeafNode(otherlv_16, grammarAccess.getExperimentAccess().getAnalysisStatAnalysisCrossReference_14_0()); 
            	

            }


            }

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleExperiment673); 

                	newLeafNode(otherlv_17, grammarAccess.getExperimentAccess().getSemicolonKeyword_15());
                
            otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleExperiment685); 

                	newLeafNode(otherlv_18, grammarAccess.getExperimentAccess().getVisualKeyword_16());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:335:1: ( (lv_visualization_19_0= ruleVisualizationType ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:336:1: (lv_visualization_19_0= ruleVisualizationType )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:336:1: (lv_visualization_19_0= ruleVisualizationType )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:337:3: lv_visualization_19_0= ruleVisualizationType
            {
             
            	        newCompositeNode(grammarAccess.getExperimentAccess().getVisualizationVisualizationTypeEnumRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleVisualizationType_in_ruleExperiment706);
            lv_visualization_19_0=ruleVisualizationType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentRule());
            	        }
                   		set(
                   			current, 
                   			"visualization",
                    		lv_visualization_19_0, 
                    		"VisualizationType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleExperiment718); 

                	newLeafNode(otherlv_20, grammarAccess.getExperimentAccess().getSemicolonKeyword_18());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:357:1: (otherlv_21= 'timeout' ( (lv_timeout_22_0= RULE_INT ) ) otherlv_23= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:357:3: otherlv_21= 'timeout' ( (lv_timeout_22_0= RULE_INT ) ) otherlv_23= ';'
                    {
                    otherlv_21=(Token)match(input,20,FOLLOW_20_in_ruleExperiment731); 

                        	newLeafNode(otherlv_21, grammarAccess.getExperimentAccess().getTimeoutKeyword_19_0());
                        
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:361:1: ( (lv_timeout_22_0= RULE_INT ) )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:362:1: (lv_timeout_22_0= RULE_INT )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:362:1: (lv_timeout_22_0= RULE_INT )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:363:3: lv_timeout_22_0= RULE_INT
                    {
                    lv_timeout_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExperiment748); 

                    			newLeafNode(lv_timeout_22_0, grammarAccess.getExperimentAccess().getTimeoutINTTerminalRuleCall_19_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"timeout",
                            		lv_timeout_22_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,14,FOLLOW_14_in_ruleExperiment765); 

                        	newLeafNode(otherlv_23, grammarAccess.getExperimentAccess().getSemicolonKeyword_19_2());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleExperiment779); 

                	newLeafNode(otherlv_24, grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_20());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExperiment"


    // $ANTLR start "entryRuleDesign"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:395:1: entryRuleDesign returns [EObject current=null] : iv_ruleDesign= ruleDesign EOF ;
    public final EObject entryRuleDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesign = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:396:2: (iv_ruleDesign= ruleDesign EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:397:2: iv_ruleDesign= ruleDesign EOF
            {
             newCompositeNode(grammarAccess.getDesignRule()); 
            pushFollow(FOLLOW_ruleDesign_in_entryRuleDesign815);
            iv_ruleDesign=ruleDesign();

            state._fsp--;

             current =iv_ruleDesign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesign825); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesign"


    // $ANTLR start "ruleDesign"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:404:1: ruleDesign returns [EObject current=null] : (otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleSamplingMethod ) ) otherlv_5= ';' otherlv_6= 'varlist' ( (otherlv_7= RULE_ID ) )* otherlv_8= ';' otherlv_9= '}' ) ;
    public final EObject ruleDesign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_method_4_0 = null;


         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:407:28: ( (otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleSamplingMethod ) ) otherlv_5= ';' otherlv_6= 'varlist' ( (otherlv_7= RULE_ID ) )* otherlv_8= ';' otherlv_9= '}' ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:408:1: (otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleSamplingMethod ) ) otherlv_5= ';' otherlv_6= 'varlist' ( (otherlv_7= RULE_ID ) )* otherlv_8= ';' otherlv_9= '}' )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:408:1: (otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleSamplingMethod ) ) otherlv_5= ';' otherlv_6= 'varlist' ( (otherlv_7= RULE_ID ) )* otherlv_8= ';' otherlv_9= '}' )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:408:3: otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleSamplingMethod ) ) otherlv_5= ';' otherlv_6= 'varlist' ( (otherlv_7= RULE_ID ) )* otherlv_8= ';' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDesign862); 

                	newLeafNode(otherlv_0, grammarAccess.getDesignAccess().getDesignKeyword_0());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:412:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:413:1: (lv_name_1_0= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:413:1: (lv_name_1_0= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:414:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDesign879); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDesignAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDesignRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDesign896); 

                	newLeafNode(otherlv_2, grammarAccess.getDesignAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleDesign908); 

                	newLeafNode(otherlv_3, grammarAccess.getDesignAccess().getMethodKeyword_3());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:438:1: ( (lv_method_4_0= ruleSamplingMethod ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:439:1: (lv_method_4_0= ruleSamplingMethod )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:439:1: (lv_method_4_0= ruleSamplingMethod )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:440:3: lv_method_4_0= ruleSamplingMethod
            {
             
            	        newCompositeNode(grammarAccess.getDesignAccess().getMethodSamplingMethodEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSamplingMethod_in_ruleDesign929);
            lv_method_4_0=ruleSamplingMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesignRule());
            	        }
                   		set(
                   			current, 
                   			"method",
                    		lv_method_4_0, 
                    		"SamplingMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDesign941); 

                	newLeafNode(otherlv_5, grammarAccess.getDesignAccess().getSemicolonKeyword_5());
                
            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleDesign953); 

                	newLeafNode(otherlv_6, grammarAccess.getDesignAccess().getVarlistKeyword_6());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:464:1: ( (otherlv_7= RULE_ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:465:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:465:1: (otherlv_7= RULE_ID )
            	    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:466:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDesignRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDesign973); 

            	    		newLeafNode(otherlv_7, grammarAccess.getDesignAccess().getVariablesVariableCrossReference_7_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleDesign986); 

                	newLeafNode(otherlv_8, grammarAccess.getDesignAccess().getSemicolonKeyword_8());
                
            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleDesign998); 

                	newLeafNode(otherlv_9, grammarAccess.getDesignAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesign"


    // $ANTLR start "entryRuleSimulation"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:493:1: entryRuleSimulation returns [EObject current=null] : iv_ruleSimulation= ruleSimulation EOF ;
    public final EObject entryRuleSimulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulation = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:494:2: (iv_ruleSimulation= ruleSimulation EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:495:2: iv_ruleSimulation= ruleSimulation EOF
            {
             newCompositeNode(grammarAccess.getSimulationRule()); 
            pushFollow(FOLLOW_ruleSimulation_in_entryRuleSimulation1034);
            iv_ruleSimulation=ruleSimulation();

            state._fsp--;

             current =iv_ruleSimulation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimulation1044); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimulation"


    // $ANTLR start "ruleSimulation"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:502:1: ruleSimulation returns [EObject current=null] : (otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFile' ( (lv_modelFilePath_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'modelType' ( (lv_modelType_7_0= ruleSimModelType ) ) otherlv_8= ';' ) ( (lv_ports_9_0= rulePort ) )* otherlv_10= '}' ) ;
    public final EObject ruleSimulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_modelFilePath_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_modelType_7_0 = null;

        EObject lv_ports_9_0 = null;


         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:505:28: ( (otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFile' ( (lv_modelFilePath_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'modelType' ( (lv_modelType_7_0= ruleSimModelType ) ) otherlv_8= ';' ) ( (lv_ports_9_0= rulePort ) )* otherlv_10= '}' ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:506:1: (otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFile' ( (lv_modelFilePath_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'modelType' ( (lv_modelType_7_0= ruleSimModelType ) ) otherlv_8= ';' ) ( (lv_ports_9_0= rulePort ) )* otherlv_10= '}' )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:506:1: (otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFile' ( (lv_modelFilePath_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'modelType' ( (lv_modelType_7_0= ruleSimModelType ) ) otherlv_8= ';' ) ( (lv_ports_9_0= rulePort ) )* otherlv_10= '}' )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:506:3: otherlv_0= 'simulation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelFile' ( (lv_modelFilePath_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'modelType' ( (lv_modelType_7_0= ruleSimModelType ) ) otherlv_8= ';' ) ( (lv_ports_9_0= rulePort ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSimulation1081); 

                	newLeafNode(otherlv_0, grammarAccess.getSimulationAccess().getSimulationKeyword_0());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:510:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:511:1: (lv_name_1_0= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:511:1: (lv_name_1_0= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:512:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimulation1098); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimulationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimulationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSimulation1115); 

                	newLeafNode(otherlv_2, grammarAccess.getSimulationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleSimulation1127); 

                	newLeafNode(otherlv_3, grammarAccess.getSimulationAccess().getModelFileKeyword_3());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:536:1: ( (lv_modelFilePath_4_0= RULE_STRING ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:537:1: (lv_modelFilePath_4_0= RULE_STRING )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:537:1: (lv_modelFilePath_4_0= RULE_STRING )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:538:3: lv_modelFilePath_4_0= RULE_STRING
            {
            lv_modelFilePath_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimulation1144); 

            			newLeafNode(lv_modelFilePath_4_0, grammarAccess.getSimulationAccess().getModelFilePathSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimulationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"modelFilePath",
                    		lv_modelFilePath_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSimulation1161); 

                	newLeafNode(otherlv_5, grammarAccess.getSimulationAccess().getSemicolonKeyword_5());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:558:1: (otherlv_6= 'modelType' ( (lv_modelType_7_0= ruleSimModelType ) ) otherlv_8= ';' )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:558:3: otherlv_6= 'modelType' ( (lv_modelType_7_0= ruleSimModelType ) ) otherlv_8= ';'
            {
            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleSimulation1174); 

                	newLeafNode(otherlv_6, grammarAccess.getSimulationAccess().getModelTypeKeyword_6_0());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:562:1: ( (lv_modelType_7_0= ruleSimModelType ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:563:1: (lv_modelType_7_0= ruleSimModelType )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:563:1: (lv_modelType_7_0= ruleSimModelType )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:564:3: lv_modelType_7_0= ruleSimModelType
            {
             
            	        newCompositeNode(grammarAccess.getSimulationAccess().getModelTypeSimModelTypeEnumRuleCall_6_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSimModelType_in_ruleSimulation1195);
            lv_modelType_7_0=ruleSimModelType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimulationRule());
            	        }
                   		set(
                   			current, 
                   			"modelType",
                    		lv_modelType_7_0, 
                    		"SimModelType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleSimulation1207); 

                	newLeafNode(otherlv_8, grammarAccess.getSimulationAccess().getSemicolonKeyword_6_2());
                

            }

            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:584:2: ( (lv_ports_9_0= rulePort ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28||LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:585:1: (lv_ports_9_0= rulePort )
            	    {
            	    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:585:1: (lv_ports_9_0= rulePort )
            	    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:586:3: lv_ports_9_0= rulePort
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimulationAccess().getPortsPortParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleSimulation1229);
            	    lv_ports_9_0=rulePort();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimulationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ports",
            	            		lv_ports_9_0, 
            	            		"Port");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleSimulation1242); 

                	newLeafNode(otherlv_10, grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimulation"


    // $ANTLR start "entryRuleStatAnalysis"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:614:1: entryRuleStatAnalysis returns [EObject current=null] : iv_ruleStatAnalysis= ruleStatAnalysis EOF ;
    public final EObject entryRuleStatAnalysis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatAnalysis = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:615:2: (iv_ruleStatAnalysis= ruleStatAnalysis EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:616:2: iv_ruleStatAnalysis= ruleStatAnalysis EOF
            {
             newCompositeNode(grammarAccess.getStatAnalysisRule()); 
            pushFollow(FOLLOW_ruleStatAnalysis_in_entryRuleStatAnalysis1278);
            iv_ruleStatAnalysis=ruleStatAnalysis();

            state._fsp--;

             current =iv_ruleStatAnalysis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatAnalysis1288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatAnalysis"


    // $ANTLR start "ruleStatAnalysis"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:623:1: ruleStatAnalysis returns [EObject current=null] : (otherlv_0= 'statAnalysis' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'service' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ) ;
    public final EObject ruleStatAnalysis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_uri_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:626:28: ( (otherlv_0= 'statAnalysis' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'service' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:627:1: (otherlv_0= 'statAnalysis' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'service' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:627:1: (otherlv_0= 'statAnalysis' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'service' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}' )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:627:3: otherlv_0= 'statAnalysis' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'service' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleStatAnalysis1325); 

                	newLeafNode(otherlv_0, grammarAccess.getStatAnalysisAccess().getStatAnalysisKeyword_0());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:631:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:632:1: (lv_name_1_0= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:632:1: (lv_name_1_0= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:633:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatAnalysis1342); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStatAnalysisAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatAnalysisRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStatAnalysis1359); 

                	newLeafNode(otherlv_2, grammarAccess.getStatAnalysisAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleStatAnalysis1371); 

                	newLeafNode(otherlv_3, grammarAccess.getStatAnalysisAccess().getServiceKeyword_3());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:657:1: ( (lv_uri_4_0= RULE_STRING ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:658:1: (lv_uri_4_0= RULE_STRING )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:658:1: (lv_uri_4_0= RULE_STRING )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:659:3: lv_uri_4_0= RULE_STRING
            {
            lv_uri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStatAnalysis1388); 

            			newLeafNode(lv_uri_4_0, grammarAccess.getStatAnalysisAccess().getUriSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatAnalysisRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"uri",
                    		lv_uri_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStatAnalysis1405); 

                	newLeafNode(otherlv_5, grammarAccess.getStatAnalysisAccess().getSemicolonKeyword_5());
                
            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleStatAnalysis1417); 

                	newLeafNode(otherlv_6, grammarAccess.getStatAnalysisAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatAnalysis"


    // $ANTLR start "entryRulePort"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:691:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:692:2: (iv_rulePort= rulePort EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:693:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort1453);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:700:1: rulePort returns [EObject current=null] : (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_InPort_0 = null;

        EObject this_OutPort_1 = null;


         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:703:28: ( (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:704:1: (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:704:1: (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:705:5: this_InPort_0= ruleInPort
                    {
                     
                            newCompositeNode(grammarAccess.getPortAccess().getInPortParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInPort_in_rulePort1510);
                    this_InPort_0=ruleInPort();

                    state._fsp--;

                     
                            current = this_InPort_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:715:5: this_OutPort_1= ruleOutPort
                    {
                     
                            newCompositeNode(grammarAccess.getPortAccess().getOutPortParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOutPort_in_rulePort1537);
                    this_OutPort_1=ruleOutPort();

                    state._fsp--;

                     
                            current = this_OutPort_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleInPort"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:731:1: entryRuleInPort returns [EObject current=null] : iv_ruleInPort= ruleInPort EOF ;
    public final EObject entryRuleInPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPort = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:732:2: (iv_ruleInPort= ruleInPort EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:733:2: iv_ruleInPort= ruleInPort EOF
            {
             newCompositeNode(grammarAccess.getInPortRule()); 
            pushFollow(FOLLOW_ruleInPort_in_entryRuleInPort1572);
            iv_ruleInPort=ruleInPort();

            state._fsp--;

             current =iv_ruleInPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInPort1582); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInPort"


    // $ANTLR start "ruleInPort"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:740:1: ruleInPort returns [EObject current=null] : (otherlv_0= 'inport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleInPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:743:28: ( (otherlv_0= 'inport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:744:1: (otherlv_0= 'inport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:744:1: (otherlv_0= 'inport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:744:3: otherlv_0= 'inport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleInPort1619); 

                	newLeafNode(otherlv_0, grammarAccess.getInPortAccess().getInportKeyword_0());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:748:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:749:1: (lv_name_1_0= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:749:1: (lv_name_1_0= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:750:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInPort1636); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInPortAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInPort1653); 

                	newLeafNode(otherlv_2, grammarAccess.getInPortAccess().getColonKeyword_2());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:770:1: ( (otherlv_3= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:771:1: (otherlv_3= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:771:1: (otherlv_3= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:772:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInPortRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInPort1673); 

            		newLeafNode(otherlv_3, grammarAccess.getInPortAccess().getVariableVariableCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleInPort1685); 

                	newLeafNode(otherlv_4, grammarAccess.getInPortAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInPort"


    // $ANTLR start "entryRuleOutPort"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:795:1: entryRuleOutPort returns [EObject current=null] : iv_ruleOutPort= ruleOutPort EOF ;
    public final EObject entryRuleOutPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPort = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:796:2: (iv_ruleOutPort= ruleOutPort EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:797:2: iv_ruleOutPort= ruleOutPort EOF
            {
             newCompositeNode(grammarAccess.getOutPortRule()); 
            pushFollow(FOLLOW_ruleOutPort_in_entryRuleOutPort1721);
            iv_ruleOutPort=ruleOutPort();

            state._fsp--;

             current =iv_ruleOutPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutPort1731); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutPort"


    // $ANTLR start "ruleOutPort"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:804:1: ruleOutPort returns [EObject current=null] : (otherlv_0= 'outport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleOutPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:807:28: ( (otherlv_0= 'outport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:808:1: (otherlv_0= 'outport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:808:1: (otherlv_0= 'outport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:808:3: otherlv_0= 'outport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleOutPort1768); 

                	newLeafNode(otherlv_0, grammarAccess.getOutPortAccess().getOutportKeyword_0());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:812:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:813:1: (lv_name_1_0= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:813:1: (lv_name_1_0= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:814:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutPort1785); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOutPortAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleOutPort1802); 

                	newLeafNode(otherlv_2, grammarAccess.getOutPortAccess().getColonKeyword_2());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:834:1: ( (otherlv_3= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:835:1: (otherlv_3= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:835:1: (otherlv_3= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:836:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOutPortRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutPort1822); 

            		newLeafNode(otherlv_3, grammarAccess.getOutPortAccess().getVariableVariableCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleOutPort1834); 

                	newLeafNode(otherlv_4, grammarAccess.getOutPortAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutPort"


    // $ANTLR start "entryRuleVariable"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:859:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:860:2: (iv_ruleVariable= ruleVariable EOF )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:861:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1870);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:868:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_INT ) ) otherlv_10= ']' )? (otherlv_11= 'gen' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_lowValue_7_0=null;
        Token otherlv_8=null;
        Token lv_highValue_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Enumerator lv_type_3_0 = null;

        Enumerator lv_group_5_0 = null;


         enterRule(); 
            
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:871:28: ( (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_INT ) ) otherlv_10= ']' )? (otherlv_11= 'gen' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ';' ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:872:1: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_INT ) ) otherlv_10= ']' )? (otherlv_11= 'gen' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ';' )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:872:1: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_INT ) ) otherlv_10= ']' )? (otherlv_11= 'gen' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ';' )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:872:3: otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleVariableType ) ) otherlv_4= 'group' ( (lv_group_5_0= ruleVariableGroup ) ) (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_INT ) ) otherlv_10= ']' )? (otherlv_11= 'gen' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleVariable1917); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:876:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:877:1: (lv_name_1_0= RULE_ID )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:877:1: (lv_name_1_0= RULE_ID )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:878:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1934); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleVariable1951); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:898:1: ( (lv_type_3_0= ruleVariableType ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:899:1: (lv_type_3_0= ruleVariableType )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:899:1: (lv_type_3_0= ruleVariableType )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:900:3: lv_type_3_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getTypeVariableTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariable1972);
            lv_type_3_0=ruleVariableType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"VariableType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleVariable1984); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getGroupKeyword_4());
                
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:920:1: ( (lv_group_5_0= ruleVariableGroup ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:921:1: (lv_group_5_0= ruleVariableGroup )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:921:1: (lv_group_5_0= ruleVariableGroup )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:922:3: lv_group_5_0= ruleVariableGroup
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getGroupVariableGroupEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableGroup_in_ruleVariable2005);
            lv_group_5_0=ruleVariableGroup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"group",
                    		lv_group_5_0, 
                    		"VariableGroup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:938:2: (otherlv_6= '[' ( (lv_lowValue_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_INT ) ) otherlv_10= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:938:4: otherlv_6= '[' ( (lv_lowValue_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_highValue_9_0= RULE_INT ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleVariable2018); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:942:1: ( (lv_lowValue_7_0= RULE_INT ) )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:943:1: (lv_lowValue_7_0= RULE_INT )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:943:1: (lv_lowValue_7_0= RULE_INT )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:944:3: lv_lowValue_7_0= RULE_INT
                    {
                    lv_lowValue_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable2035); 

                    			newLeafNode(lv_lowValue_7_0, grammarAccess.getVariableAccess().getLowValueINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lowValue",
                            		lv_lowValue_7_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleVariable2052); 

                        	newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getCommaKeyword_6_2());
                        
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:964:1: ( (lv_highValue_9_0= RULE_INT ) )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:965:1: (lv_highValue_9_0= RULE_INT )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:965:1: (lv_highValue_9_0= RULE_INT )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:966:3: lv_highValue_9_0= RULE_INT
                    {
                    lv_highValue_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable2069); 

                    			newLeafNode(lv_highValue_9_0, grammarAccess.getVariableAccess().getHighValueINTTerminalRuleCall_6_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"highValue",
                            		lv_highValue_9_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleVariable2086); 

                        	newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:986:3: (otherlv_11= 'gen' ( (otherlv_12= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:986:5: otherlv_11= 'gen' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleVariable2101); 

                        	newLeafNode(otherlv_11, grammarAccess.getVariableAccess().getGenKeyword_7_0());
                        
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:990:1: ( (otherlv_12= RULE_ID ) )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:991:1: (otherlv_12= RULE_ID )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:991:1: (otherlv_12= RULE_ID )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:992:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2121); 

                    		newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getGeneratorNumberGeneratorCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleVariable2135); 

                	newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "ruleObjective"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1017:1: ruleObjective returns [Enumerator current=null] : ( (enumLiteral_0= 'COMPARATIVE' ) | (enumLiteral_1= 'SCREENING' ) | (enumLiteral_2= 'RESPSURFACE' ) ) ;
    public final Enumerator ruleObjective() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1019:28: ( ( (enumLiteral_0= 'COMPARATIVE' ) | (enumLiteral_1= 'SCREENING' ) | (enumLiteral_2= 'RESPSURFACE' ) ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1020:1: ( (enumLiteral_0= 'COMPARATIVE' ) | (enumLiteral_1= 'SCREENING' ) | (enumLiteral_2= 'RESPSURFACE' ) )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1020:1: ( (enumLiteral_0= 'COMPARATIVE' ) | (enumLiteral_1= 'SCREENING' ) | (enumLiteral_2= 'RESPSURFACE' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 39:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1020:2: (enumLiteral_0= 'COMPARATIVE' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1020:2: (enumLiteral_0= 'COMPARATIVE' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1020:4: enumLiteral_0= 'COMPARATIVE'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleObjective2187); 

                            current = grammarAccess.getObjectiveAccess().getCOMPARATIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getObjectiveAccess().getCOMPARATIVEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1026:6: (enumLiteral_1= 'SCREENING' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1026:6: (enumLiteral_1= 'SCREENING' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1026:8: enumLiteral_1= 'SCREENING'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleObjective2204); 

                            current = grammarAccess.getObjectiveAccess().getSCREENINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getObjectiveAccess().getSCREENINGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1032:6: (enumLiteral_2= 'RESPSURFACE' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1032:6: (enumLiteral_2= 'RESPSURFACE' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1032:8: enumLiteral_2= 'RESPSURFACE'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleObjective2221); 

                            current = grammarAccess.getObjectiveAccess().getRESPSURFACEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getObjectiveAccess().getRESPSURFACEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjective"


    // $ANTLR start "ruleSimModelType"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1042:1: ruleSimModelType returns [Enumerator current=null] : ( (enumLiteral_0= 'STATIC' ) | (enumLiteral_1= 'CONTINUOUS' ) | (enumLiteral_2= 'DISCRETEEVENT' ) ) ;
    public final Enumerator ruleSimModelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1044:28: ( ( (enumLiteral_0= 'STATIC' ) | (enumLiteral_1= 'CONTINUOUS' ) | (enumLiteral_2= 'DISCRETEEVENT' ) ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1045:1: ( (enumLiteral_0= 'STATIC' ) | (enumLiteral_1= 'CONTINUOUS' ) | (enumLiteral_2= 'DISCRETEEVENT' ) )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1045:1: ( (enumLiteral_0= 'STATIC' ) | (enumLiteral_1= 'CONTINUOUS' ) | (enumLiteral_2= 'DISCRETEEVENT' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1045:2: (enumLiteral_0= 'STATIC' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1045:2: (enumLiteral_0= 'STATIC' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1045:4: enumLiteral_0= 'STATIC'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleSimModelType2266); 

                            current = grammarAccess.getSimModelTypeAccess().getSTATICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSimModelTypeAccess().getSTATICEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1051:6: (enumLiteral_1= 'CONTINUOUS' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1051:6: (enumLiteral_1= 'CONTINUOUS' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1051:8: enumLiteral_1= 'CONTINUOUS'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleSimModelType2283); 

                            current = grammarAccess.getSimModelTypeAccess().getCONTINUOUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSimModelTypeAccess().getCONTINUOUSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1057:6: (enumLiteral_2= 'DISCRETEEVENT' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1057:6: (enumLiteral_2= 'DISCRETEEVENT' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1057:8: enumLiteral_2= 'DISCRETEEVENT'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleSimModelType2300); 

                            current = grammarAccess.getSimModelTypeAccess().getDISCRETEEVENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSimModelTypeAccess().getDISCRETEEVENTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimModelType"


    // $ANTLR start "ruleVariableGroup"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1067:1: ruleVariableGroup returns [Enumerator current=null] : ( (enumLiteral_0= 'FACTOR' ) | (enumLiteral_1= 'RESPONSE' ) ) ;
    public final Enumerator ruleVariableGroup() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1069:28: ( ( (enumLiteral_0= 'FACTOR' ) | (enumLiteral_1= 'RESPONSE' ) ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1070:1: ( (enumLiteral_0= 'FACTOR' ) | (enumLiteral_1= 'RESPONSE' ) )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1070:1: ( (enumLiteral_0= 'FACTOR' ) | (enumLiteral_1= 'RESPONSE' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            else if ( (LA12_0==44) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1070:2: (enumLiteral_0= 'FACTOR' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1070:2: (enumLiteral_0= 'FACTOR' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1070:4: enumLiteral_0= 'FACTOR'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleVariableGroup2345); 

                            current = grammarAccess.getVariableGroupAccess().getFACTOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVariableGroupAccess().getFACTOREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1076:6: (enumLiteral_1= 'RESPONSE' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1076:6: (enumLiteral_1= 'RESPONSE' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1076:8: enumLiteral_1= 'RESPONSE'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleVariableGroup2362); 

                            current = grammarAccess.getVariableGroupAccess().getRESPONSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVariableGroupAccess().getRESPONSEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableGroup"


    // $ANTLR start "ruleVariableType"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1086:1: ruleVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'STRING' ) ) ;
    public final Enumerator ruleVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1088:28: ( ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'STRING' ) ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1089:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'STRING' ) )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1089:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= 'STRING' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt13=1;
                }
                break;
            case 46:
                {
                alt13=2;
                }
                break;
            case 47:
                {
                alt13=3;
                }
                break;
            case 48:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1089:2: (enumLiteral_0= 'BOOLEAN' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1089:2: (enumLiteral_0= 'BOOLEAN' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1089:4: enumLiteral_0= 'BOOLEAN'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleVariableType2407); 

                            current = grammarAccess.getVariableTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVariableTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1095:6: (enumLiteral_1= 'INTEGER' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1095:6: (enumLiteral_1= 'INTEGER' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1095:8: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleVariableType2424); 

                            current = grammarAccess.getVariableTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVariableTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1101:6: (enumLiteral_2= 'FLOAT' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1101:6: (enumLiteral_2= 'FLOAT' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1101:8: enumLiteral_2= 'FLOAT'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_ruleVariableType2441); 

                            current = grammarAccess.getVariableTypeAccess().getFLOATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVariableTypeAccess().getFLOATEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1107:6: (enumLiteral_3= 'STRING' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1107:6: (enumLiteral_3= 'STRING' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1107:8: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_48_in_ruleVariableType2458); 

                            current = grammarAccess.getVariableTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getVariableTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "ruleSamplingMethod"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1117:1: ruleSamplingMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'RANDOMIZED' ) | (enumLiteral_1= 'RANDOMIZEDBLOCK' ) | (enumLiteral_2= 'FACTORIAL' ) | (enumLiteral_3= 'FRACFACTORIAL' ) | (enumLiteral_4= 'CENTRALCOMP' ) ) ;
    public final Enumerator ruleSamplingMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1119:28: ( ( (enumLiteral_0= 'RANDOMIZED' ) | (enumLiteral_1= 'RANDOMIZEDBLOCK' ) | (enumLiteral_2= 'FACTORIAL' ) | (enumLiteral_3= 'FRACFACTORIAL' ) | (enumLiteral_4= 'CENTRALCOMP' ) ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1120:1: ( (enumLiteral_0= 'RANDOMIZED' ) | (enumLiteral_1= 'RANDOMIZEDBLOCK' ) | (enumLiteral_2= 'FACTORIAL' ) | (enumLiteral_3= 'FRACFACTORIAL' ) | (enumLiteral_4= 'CENTRALCOMP' ) )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1120:1: ( (enumLiteral_0= 'RANDOMIZED' ) | (enumLiteral_1= 'RANDOMIZEDBLOCK' ) | (enumLiteral_2= 'FACTORIAL' ) | (enumLiteral_3= 'FRACFACTORIAL' ) | (enumLiteral_4= 'CENTRALCOMP' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt14=1;
                }
                break;
            case 50:
                {
                alt14=2;
                }
                break;
            case 51:
                {
                alt14=3;
                }
                break;
            case 52:
                {
                alt14=4;
                }
                break;
            case 53:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1120:2: (enumLiteral_0= 'RANDOMIZED' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1120:2: (enumLiteral_0= 'RANDOMIZED' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1120:4: enumLiteral_0= 'RANDOMIZED'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleSamplingMethod2503); 

                            current = grammarAccess.getSamplingMethodAccess().getRANDOMIZEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSamplingMethodAccess().getRANDOMIZEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1126:6: (enumLiteral_1= 'RANDOMIZEDBLOCK' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1126:6: (enumLiteral_1= 'RANDOMIZEDBLOCK' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1126:8: enumLiteral_1= 'RANDOMIZEDBLOCK'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleSamplingMethod2520); 

                            current = grammarAccess.getSamplingMethodAccess().getRANDOMIZEDBLOCKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSamplingMethodAccess().getRANDOMIZEDBLOCKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1132:6: (enumLiteral_2= 'FACTORIAL' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1132:6: (enumLiteral_2= 'FACTORIAL' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1132:8: enumLiteral_2= 'FACTORIAL'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_51_in_ruleSamplingMethod2537); 

                            current = grammarAccess.getSamplingMethodAccess().getFACTORIALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSamplingMethodAccess().getFACTORIALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1138:6: (enumLiteral_3= 'FRACFACTORIAL' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1138:6: (enumLiteral_3= 'FRACFACTORIAL' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1138:8: enumLiteral_3= 'FRACFACTORIAL'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_52_in_ruleSamplingMethod2554); 

                            current = grammarAccess.getSamplingMethodAccess().getFRACFACTORIALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSamplingMethodAccess().getFRACFACTORIALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1144:6: (enumLiteral_4= 'CENTRALCOMP' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1144:6: (enumLiteral_4= 'CENTRALCOMP' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1144:8: enumLiteral_4= 'CENTRALCOMP'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_53_in_ruleSamplingMethod2571); 

                            current = grammarAccess.getSamplingMethodAccess().getCENTRALCOMPEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSamplingMethodAccess().getCENTRALCOMPEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSamplingMethod"


    // $ANTLR start "ruleVisualizationType"
    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1156:1: ruleVisualizationType returns [Enumerator current=null] : ( (enumLiteral_0= 'HISTOGRAM' ) | (enumLiteral_1= 'SCATTERPLOT' ) ) ;
    public final Enumerator ruleVisualizationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1158:28: ( ( (enumLiteral_0= 'HISTOGRAM' ) | (enumLiteral_1= 'SCATTERPLOT' ) ) )
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1159:1: ( (enumLiteral_0= 'HISTOGRAM' ) | (enumLiteral_1= 'SCATTERPLOT' ) )
            {
            // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1159:1: ( (enumLiteral_0= 'HISTOGRAM' ) | (enumLiteral_1= 'SCATTERPLOT' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            else if ( (LA15_0==55) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1159:2: (enumLiteral_0= 'HISTOGRAM' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1159:2: (enumLiteral_0= 'HISTOGRAM' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1159:4: enumLiteral_0= 'HISTOGRAM'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleVisualizationType2618); 

                            current = grammarAccess.getVisualizationTypeAccess().getHISTOGRAMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisualizationTypeAccess().getHISTOGRAMEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1165:6: (enumLiteral_1= 'SCATTERPLOT' )
                    {
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1165:6: (enumLiteral_1= 'SCATTERPLOT' )
                    // ../xperimenter/src-gen/tr/edu/metu/ceng/parser/antlr/internal/InternalXperimenter.g:1165:8: enumLiteral_1= 'SCATTERPLOT'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleVisualizationType2635); 

                            current = grammarAccess.getVisualizationTypeAccess().getSCATTERPLOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisualizationTypeAccess().getSCATTERPLOTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisualizationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel130 = new BitSet(new long[]{0x0000000084030802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperiment_in_ruleType223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesign_in_ruleType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatAnalysis_in_ruleType277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimulation_in_ruleType304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleType331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperiment_in_entryRuleExperiment366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperiment376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExperiment413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperiment430 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExperiment447 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleExperiment460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperiment477 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExperiment494 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExperiment508 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_ruleObjective_in_ruleExperiment529 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExperiment541 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperiment553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperiment573 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExperiment585 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExperiment597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperiment617 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExperiment629 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExperiment641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperiment661 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExperiment673 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExperiment685 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_ruleVisualizationType_in_ruleExperiment706 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExperiment718 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleExperiment731 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExperiment748 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExperiment765 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExperiment779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesign_in_entryRuleDesign815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesign825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDesign862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDesign879 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDesign896 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDesign908 = new BitSet(new long[]{0x003E000000000000L});
    public static final BitSet FOLLOW_ruleSamplingMethod_in_ruleDesign929 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDesign941 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDesign953 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDesign973 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleDesign986 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDesign998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimulation_in_entryRuleSimulation1034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimulation1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSimulation1081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimulation1098 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSimulation1115 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSimulation1127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimulation1144 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSimulation1161 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSimulation1174 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_ruleSimModelType_in_ruleSimulation1195 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSimulation1207 = new BitSet(new long[]{0x0000000050200000L});
    public static final BitSet FOLLOW_rulePort_in_ruleSimulation1229 = new BitSet(new long[]{0x0000000050200000L});
    public static final BitSet FOLLOW_21_in_ruleSimulation1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatAnalysis_in_entryRuleStatAnalysis1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatAnalysis1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStatAnalysis1325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatAnalysis1342 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatAnalysis1359 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStatAnalysis1371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStatAnalysis1388 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStatAnalysis1405 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStatAnalysis1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInPort_in_rulePort1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutPort_in_rulePort1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInPort_in_entryRuleInPort1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInPort1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInPort1619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInPort1636 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInPort1653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInPort1673 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInPort1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutPort_in_entryRuleOutPort1721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutPort1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOutPort1768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutPort1785 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOutPort1802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutPort1822 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOutPort1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVariable1917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1934 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleVariable1951 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariable1972 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleVariable1984 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleVariable2005 = new BitSet(new long[]{0x0000001200004000L});
    public static final BitSet FOLLOW_33_in_ruleVariable2018 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable2035 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleVariable2052 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable2069 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleVariable2086 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_36_in_ruleVariable2101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2121 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVariable2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleObjective2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleObjective2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleObjective2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSimModelType2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSimModelType2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSimModelType2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVariableGroup2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVariableGroup2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVariableType2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVariableType2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVariableType2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVariableType2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSamplingMethod2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSamplingMethod2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSamplingMethod2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSamplingMethod2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSamplingMethod2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVisualizationType2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVisualizationType2635 = new BitSet(new long[]{0x0000000000000002L});

}