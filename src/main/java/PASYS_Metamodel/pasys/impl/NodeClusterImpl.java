/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PasysTables;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.ProcessingNode;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NodeClusterImpl extends ResourceClusterImpl implements NodeCluster {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.NODE_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ProcessingNode> getNodes() {
		EList<ProcessingNode> nodes = new BasicEList<ProcessingNode>();
		for (PlatformResource rsrc:getResources()) {
			ProcessingNode node = (ProcessingNode) rsrc;
			nodes.add(node);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean allNodes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "NodeCluster::allNodes";
		try {
			/**
			 *
			 * inv allNodes:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = resources->forAll(r |
			 *           r.oclIsKindOf(ProcessingNode))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, PasysPackage.Literals.NODE_CLUSTER___ALL_NODES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, PasysTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<PlatformResource> resources = this.getResources();
				final /*@NonInvalid*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(PasysTables.ORD_CLSSid_PlatformResource, resources);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_r = BOXED_resources.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_r.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ PlatformResource r = (PlatformResource)ITERATOR_r.next();
					/**
					 * r.oclIsKindOf(ProcessingNode)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_PASYS_Metamodel_c_c_pasys_c_c_ProcessingNode = idResolver.getClass(PasysTables.CLSSid_ProcessingNode, null);
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, r, TYP_PASYS_Metamodel_c_c_pasys_c_c_ProcessingNode).booleanValue();
					//
					if (!oclIsKindOf) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (oclIsKindOf) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, PasysTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PasysPackage.NODE_CLUSTER___GET_NODES:
				return getNodes();
			case PasysPackage.NODE_CLUSTER___ALL_NODES__DIAGNOSTICCHAIN_MAP:
				return allNodes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NodeClusterImpl
