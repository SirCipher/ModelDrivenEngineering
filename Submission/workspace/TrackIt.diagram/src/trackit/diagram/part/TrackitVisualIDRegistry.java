/*
 * 
 */
package trackit.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import trackit.IssueTracker;
import trackit.TrackitPackage;
import trackit.diagram.edit.parts.Comment2EditPart;
import trackit.diagram.edit.parts.CommentCommentRepliesCompartment2EditPart;
import trackit.diagram.edit.parts.CommentCommentRepliesCompartmentEditPart;
import trackit.diagram.edit.parts.CommentEditPart;
import trackit.diagram.edit.parts.CommentText2EditPart;
import trackit.diagram.edit.parts.CommentTextEditPart;
import trackit.diagram.edit.parts.IssueBlockingEditPart;
import trackit.diagram.edit.parts.IssueBlockingExternalLabelEditPart;
import trackit.diagram.edit.parts.IssueDependenciesEditPart;
import trackit.diagram.edit.parts.IssueDependenciesExternalLabelEditPart;
import trackit.diagram.edit.parts.IssueDuplicateOfEditPart;
import trackit.diagram.edit.parts.IssueDuplicateOfExternalLabelEditPart;
import trackit.diagram.edit.parts.IssueEditPart;
import trackit.diagram.edit.parts.IssueIssueCommentsCompartmentEditPart;
import trackit.diagram.edit.parts.IssueTitleEditPart;
import trackit.diagram.edit.parts.IssueTrackerEditPart;
import trackit.diagram.edit.parts.IssueVersionsAffectedEditPart;
import trackit.diagram.edit.parts.IssueVersionsAffectedExternalLabelEditPart;
import trackit.diagram.edit.parts.MemberEditPart;
import trackit.diagram.edit.parts.MemberFullNameEditPart;
import trackit.diagram.edit.parts.MemberIssuesAssignedEditPart;
import trackit.diagram.edit.parts.MemberIssuesAssignedExternalLabelEditPart;
import trackit.diagram.edit.parts.ProductEditPart;
import trackit.diagram.edit.parts.ProductNameEditPart;
import trackit.diagram.edit.parts.ProductProductVersionCompartmentEditPart;
import trackit.diagram.edit.parts.TeamEditPart;
import trackit.diagram.edit.parts.TeamMembersEditPart;
import trackit.diagram.edit.parts.TeamMembersExternalLabelEditPart;
import trackit.diagram.edit.parts.TeamTeamNameEditPart;
import trackit.diagram.edit.parts.VersionEditPart;
import trackit.diagram.edit.parts.VersionNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TrackitVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "TrackIt.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (IssueTrackerEditPart.MODEL_ID.equals(view.getType())) {
				return IssueTrackerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return trackit.diagram.part.TrackitVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				TrackitDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TrackitPackage.eINSTANCE.getIssueTracker().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((IssueTracker) domainElement)) {
			return IssueTrackerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = trackit.diagram.part.TrackitVisualIDRegistry
				.getModelID(containerView);
		if (!IssueTrackerEditPart.MODEL_ID.equals(containerModelID)
				&& !"trackit".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (IssueTrackerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = trackit.diagram.part.TrackitVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = IssueTrackerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case IssueTrackerEditPart.VISUAL_ID:
			if (TrackitPackage.eINSTANCE.getTeam().isSuperTypeOf(
					domainElement.eClass())) {
				return TeamEditPart.VISUAL_ID;
			}
			if (TrackitPackage.eINSTANCE.getProduct().isSuperTypeOf(
					domainElement.eClass())) {
				return ProductEditPart.VISUAL_ID;
			}
			if (TrackitPackage.eINSTANCE.getIssue().isSuperTypeOf(
					domainElement.eClass())) {
				return IssueEditPart.VISUAL_ID;
			}
			if (TrackitPackage.eINSTANCE.getMember().isSuperTypeOf(
					domainElement.eClass())) {
				return MemberEditPart.VISUAL_ID;
			}
			break;
		case ProductProductVersionCompartmentEditPart.VISUAL_ID:
			if (TrackitPackage.eINSTANCE.getVersion().isSuperTypeOf(
					domainElement.eClass())) {
				return VersionEditPart.VISUAL_ID;
			}
			break;
		case IssueIssueCommentsCompartmentEditPart.VISUAL_ID:
			if (TrackitPackage.eINSTANCE.getComment().isSuperTypeOf(
					domainElement.eClass())) {
				return CommentEditPart.VISUAL_ID;
			}
			break;
		case CommentCommentRepliesCompartmentEditPart.VISUAL_ID:
			if (TrackitPackage.eINSTANCE.getComment().isSuperTypeOf(
					domainElement.eClass())) {
				return Comment2EditPart.VISUAL_ID;
			}
			break;
		case CommentCommentRepliesCompartment2EditPart.VISUAL_ID:
			if (TrackitPackage.eINSTANCE.getComment().isSuperTypeOf(
					domainElement.eClass())) {
				return Comment2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = trackit.diagram.part.TrackitVisualIDRegistry
				.getModelID(containerView);
		if (!IssueTrackerEditPart.MODEL_ID.equals(containerModelID)
				&& !"trackit".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (IssueTrackerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = trackit.diagram.part.TrackitVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = IssueTrackerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case IssueTrackerEditPart.VISUAL_ID:
			if (TeamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IssueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MemberEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TeamEditPart.VISUAL_ID:
			if (TeamTeamNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductEditPart.VISUAL_ID:
			if (ProductNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductProductVersionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IssueEditPart.VISUAL_ID:
			if (IssueTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IssueIssueCommentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MemberEditPart.VISUAL_ID:
			if (MemberFullNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VersionEditPart.VISUAL_ID:
			if (VersionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommentEditPart.VISUAL_ID:
			if (CommentTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommentCommentRepliesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Comment2EditPart.VISUAL_ID:
			if (CommentText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommentCommentRepliesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductProductVersionCompartmentEditPart.VISUAL_ID:
			if (VersionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IssueIssueCommentsCompartmentEditPart.VISUAL_ID:
			if (CommentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommentCommentRepliesCompartmentEditPart.VISUAL_ID:
			if (Comment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommentCommentRepliesCompartment2EditPart.VISUAL_ID:
			if (Comment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MemberIssuesAssignedEditPart.VISUAL_ID:
			if (MemberIssuesAssignedExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TeamMembersEditPart.VISUAL_ID:
			if (TeamMembersExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IssueDuplicateOfEditPart.VISUAL_ID:
			if (IssueDuplicateOfExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IssueDependenciesEditPart.VISUAL_ID:
			if (IssueDependenciesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IssueVersionsAffectedEditPart.VISUAL_ID:
			if (IssueVersionsAffectedExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IssueBlockingEditPart.VISUAL_ID:
			if (IssueBlockingExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(IssueTracker element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ProductProductVersionCompartmentEditPart.VISUAL_ID:
		case IssueIssueCommentsCompartmentEditPart.VISUAL_ID:
		case CommentCommentRepliesCompartmentEditPart.VISUAL_ID:
		case CommentCommentRepliesCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case IssueTrackerEditPart.VISUAL_ID:
			return false;
		case TeamEditPart.VISUAL_ID:
		case MemberEditPart.VISUAL_ID:
		case VersionEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return trackit.diagram.part.TrackitVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return trackit.diagram.part.TrackitVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return trackit.diagram.part.TrackitVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return trackit.diagram.part.TrackitVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return trackit.diagram.part.TrackitVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return trackit.diagram.part.TrackitVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
