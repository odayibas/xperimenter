package tr.edu.metu.ceng.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import tr.edu.metu.ceng.services.XperimenterGrammarAccess;
import tr.edu.metu.ceng.xperimenter.Design;
import tr.edu.metu.ceng.xperimenter.Experiment;
import tr.edu.metu.ceng.xperimenter.InPort;
import tr.edu.metu.ceng.xperimenter.Model;
import tr.edu.metu.ceng.xperimenter.NumberGenerator;
import tr.edu.metu.ceng.xperimenter.OutPort;
import tr.edu.metu.ceng.xperimenter.Simulation;
import tr.edu.metu.ceng.xperimenter.StatAnalysis;
import tr.edu.metu.ceng.xperimenter.Variable;
import tr.edu.metu.ceng.xperimenter.XperimenterPackage;

@SuppressWarnings("all")
public class XperimenterSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XperimenterGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XperimenterPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XperimenterPackage.DESIGN:
				if(context == grammarAccess.getDesignRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Design(context, (Design) semanticObject); 
					return; 
				}
				else break;
			case XperimenterPackage.EXPERIMENT:
				if(context == grammarAccess.getExperimentRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Experiment(context, (Experiment) semanticObject); 
					return; 
				}
				else break;
			case XperimenterPackage.IN_PORT:
				if(context == grammarAccess.getInPortRule() ||
				   context == grammarAccess.getPortRule()) {
					sequence_InPort(context, (InPort) semanticObject); 
					return; 
				}
				else break;
			case XperimenterPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case XperimenterPackage.NUMBER_GENERATOR:
				if(context == grammarAccess.getNumberGeneratorRule()) {
					sequence_NumberGenerator(context, (NumberGenerator) semanticObject); 
					return; 
				}
				else break;
			case XperimenterPackage.OUT_PORT:
				if(context == grammarAccess.getOutPortRule() ||
				   context == grammarAccess.getPortRule()) {
					sequence_OutPort(context, (OutPort) semanticObject); 
					return; 
				}
				else break;
			case XperimenterPackage.SIMULATION:
				if(context == grammarAccess.getSimulationRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Simulation(context, (Simulation) semanticObject); 
					return; 
				}
				else break;
			case XperimenterPackage.STAT_ANALYSIS:
				if(context == grammarAccess.getStatAnalysisRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_StatAnalysis(context, (StatAnalysis) semanticObject); 
					return; 
				}
				else break;
			case XperimenterPackage.VARIABLE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID method=SamplingMethod variables+=[Variable|ID]*)
	 */
	protected void sequence_Design(EObject context, Design semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         objective=Objective 
	 *         design=[Design|ID] 
	 *         simulation=[Simulation|ID] 
	 *         analysis=[StatAnalysis|ID] 
	 *         visualization=VisualizationType 
	 *         timeout=INT?
	 *     )
	 */
	protected void sequence_Experiment(EObject context, Experiment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variable=[Variable|ID])
	 */
	protected void sequence_InPort(EObject context, InPort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XperimenterPackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XperimenterPackage.Literals.PORT__NAME));
			if(transientValues.isValueTransient(semanticObject, XperimenterPackage.Literals.PORT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XperimenterPackage.Literals.PORT__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInPortAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInPortAccess().getVariableVariableIDTerminalRuleCall_3_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Type*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID uri=STRING seed=INT?)
	 */
	protected void sequence_NumberGenerator(EObject context, NumberGenerator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variable=[Variable|ID])
	 */
	protected void sequence_OutPort(EObject context, OutPort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XperimenterPackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XperimenterPackage.Literals.PORT__NAME));
			if(transientValues.isValueTransient(semanticObject, XperimenterPackage.Literals.PORT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XperimenterPackage.Literals.PORT__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOutPortAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOutPortAccess().getVariableVariableIDTerminalRuleCall_3_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID modelFilePath=STRING modelType=SimModelType ports+=Port*)
	 */
	protected void sequence_Simulation(EObject context, Simulation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID uri=STRING)
	 */
	protected void sequence_StatAnalysis(EObject context, StatAnalysis semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XperimenterPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XperimenterPackage.Literals.TYPE__NAME));
			if(transientValues.isValueTransient(semanticObject, XperimenterPackage.Literals.STAT_ANALYSIS__URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XperimenterPackage.Literals.STAT_ANALYSIS__URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatAnalysisAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStatAnalysisAccess().getUriSTRINGTerminalRuleCall_4_0(), semanticObject.getUri());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=VariableType group=VariableGroup (lowValue=INT highValue=INT)? generator=[NumberGenerator|ID]?)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
