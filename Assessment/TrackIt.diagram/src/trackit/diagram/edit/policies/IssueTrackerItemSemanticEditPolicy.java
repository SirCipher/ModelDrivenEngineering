/*
 * 
 */
package trackit.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import trackit.diagram.edit.commands.IssueCreateCommand;
import trackit.diagram.edit.commands.MemberCreateCommand;
import trackit.diagram.edit.commands.ProductCreateCommand;
import trackit.diagram.edit.commands.TeamCreateCommand;
import trackit.diagram.providers.TrackitElementTypes;

/**
 * @generated
 */
public class IssueTrackerItemSemanticEditPolicy extends
		TrackitBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IssueTrackerItemSemanticEditPolicy() {
		super(TrackitElementTypes.IssueTracker_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TrackitElementTypes.Team_2001 == req.getElementType()) {
			return getGEFWrapper(new TeamCreateCommand(req));
		}
		if (TrackitElementTypes.Product_2002 == req.getElementType()) {
			return getGEFWrapper(new ProductCreateCommand(req));
		}
		if (TrackitElementTypes.Issue_2003 == req.getElementType()) {
			return getGEFWrapper(new IssueCreateCommand(req));
		}
		if (TrackitElementTypes.Member_2004 == req.getElementType()) {
			return getGEFWrapper(new MemberCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
