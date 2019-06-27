/*
 * 
 */
package trackit.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import trackit.diagram.edit.commands.Comment2CreateCommand;
import trackit.diagram.providers.TrackitElementTypes;

/**
 * @generated
 */
public class CommentCommentRepliesCompartment2ItemSemanticEditPolicy extends
		TrackitBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CommentCommentRepliesCompartment2ItemSemanticEditPolicy() {
		super(TrackitElementTypes.Comment_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TrackitElementTypes.Comment_3003 == req.getElementType()) {
			return getGEFWrapper(new Comment2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
