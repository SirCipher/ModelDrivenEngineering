/*
 * 
 */
package trackit.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import trackit.diagram.providers.TrackitElementTypes;

/**
 * @generated
 */
public class MemberIssuesAssignedItemSemanticEditPolicy extends
		TrackitBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MemberIssuesAssignedItemSemanticEditPolicy() {
		super(TrackitElementTypes.MemberIssuesAssigned_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
