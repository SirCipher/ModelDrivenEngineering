/*
 * 
 */
package trackit.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import trackit.diagram.part.TrackitVisualIDRegistry;

/**
 * @generated
 */
public class TrackitEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TrackitVisualIDRegistry.getVisualID(view)) {

			case IssueTrackerEditPart.VISUAL_ID:
				return new IssueTrackerEditPart(view);

			case TeamEditPart.VISUAL_ID:
				return new TeamEditPart(view);

			case TeamTeamNameEditPart.VISUAL_ID:
				return new TeamTeamNameEditPart(view);

			case ProductEditPart.VISUAL_ID:
				return new ProductEditPart(view);

			case ProductNameEditPart.VISUAL_ID:
				return new ProductNameEditPart(view);

			case IssueEditPart.VISUAL_ID:
				return new IssueEditPart(view);

			case IssueTitleEditPart.VISUAL_ID:
				return new IssueTitleEditPart(view);

			case MemberEditPart.VISUAL_ID:
				return new MemberEditPart(view);

			case MemberFullNameEditPart.VISUAL_ID:
				return new MemberFullNameEditPart(view);

			case VersionEditPart.VISUAL_ID:
				return new VersionEditPart(view);

			case VersionNameEditPart.VISUAL_ID:
				return new VersionNameEditPart(view);

			case CommentEditPart.VISUAL_ID:
				return new CommentEditPart(view);

			case CommentTextEditPart.VISUAL_ID:
				return new CommentTextEditPart(view);

			case Comment2EditPart.VISUAL_ID:
				return new Comment2EditPart(view);

			case CommentText2EditPart.VISUAL_ID:
				return new CommentText2EditPart(view);

			case ProductProductVersionCompartmentEditPart.VISUAL_ID:
				return new ProductProductVersionCompartmentEditPart(view);

			case IssueIssueCommentsCompartmentEditPart.VISUAL_ID:
				return new IssueIssueCommentsCompartmentEditPart(view);

			case CommentCommentRepliesCompartmentEditPart.VISUAL_ID:
				return new CommentCommentRepliesCompartmentEditPart(view);

			case CommentCommentRepliesCompartment2EditPart.VISUAL_ID:
				return new CommentCommentRepliesCompartment2EditPart(view);

			case MemberIssuesAssignedEditPart.VISUAL_ID:
				return new MemberIssuesAssignedEditPart(view);

			case MemberIssuesAssignedExternalLabelEditPart.VISUAL_ID:
				return new MemberIssuesAssignedExternalLabelEditPart(view);

			case TeamMembersEditPart.VISUAL_ID:
				return new TeamMembersEditPart(view);

			case TeamMembersExternalLabelEditPart.VISUAL_ID:
				return new TeamMembersExternalLabelEditPart(view);

			case IssueDuplicateOfEditPart.VISUAL_ID:
				return new IssueDuplicateOfEditPart(view);

			case IssueDuplicateOfExternalLabelEditPart.VISUAL_ID:
				return new IssueDuplicateOfExternalLabelEditPart(view);

			case IssueDependenciesEditPart.VISUAL_ID:
				return new IssueDependenciesEditPart(view);

			case IssueDependenciesExternalLabelEditPart.VISUAL_ID:
				return new IssueDependenciesExternalLabelEditPart(view);

			case IssueVersionsAffectedEditPart.VISUAL_ID:
				return new IssueVersionsAffectedEditPart(view);

			case IssueVersionsAffectedExternalLabelEditPart.VISUAL_ID:
				return new IssueVersionsAffectedExternalLabelEditPart(view);

			case IssueBlockingEditPart.VISUAL_ID:
				return new IssueBlockingEditPart(view);

			case IssueBlockingExternalLabelEditPart.VISUAL_ID:
				return new IssueBlockingExternalLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
