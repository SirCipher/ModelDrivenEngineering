/*
 * 
 */
package trackit.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import trackit.diagram.edit.commands.CommentCreateCommand;
import trackit.diagram.providers.TrackitElementTypes;

/**
 * @generated
 */
public class IssueIssueCommentsCompartmentItemSemanticEditPolicy extends
		TrackitBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IssueIssueCommentsCompartmentItemSemanticEditPolicy() {
		super(TrackitElementTypes.Issue_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TrackitElementTypes.Comment_3002 == req.getElementType()) {
			return getGEFWrapper(new CommentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
