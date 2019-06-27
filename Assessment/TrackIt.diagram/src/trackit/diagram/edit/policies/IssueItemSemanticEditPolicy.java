/*
 * 
 */
package trackit.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import trackit.diagram.edit.commands.IssueBlockingCreateCommand;
import trackit.diagram.edit.commands.IssueBlockingReorientCommand;
import trackit.diagram.edit.commands.IssueDependenciesCreateCommand;
import trackit.diagram.edit.commands.IssueDependenciesReorientCommand;
import trackit.diagram.edit.commands.IssueDuplicateOfCreateCommand;
import trackit.diagram.edit.commands.IssueDuplicateOfReorientCommand;
import trackit.diagram.edit.commands.IssueVersionsAffectedCreateCommand;
import trackit.diagram.edit.commands.IssueVersionsAffectedReorientCommand;
import trackit.diagram.edit.commands.MemberIssuesAssignedCreateCommand;
import trackit.diagram.edit.commands.MemberIssuesAssignedReorientCommand;
import trackit.diagram.edit.parts.CommentEditPart;
import trackit.diagram.edit.parts.IssueBlockingEditPart;
import trackit.diagram.edit.parts.IssueDependenciesEditPart;
import trackit.diagram.edit.parts.IssueDuplicateOfEditPart;
import trackit.diagram.edit.parts.IssueIssueCommentsCompartmentEditPart;
import trackit.diagram.edit.parts.IssueVersionsAffectedEditPart;
import trackit.diagram.edit.parts.MemberIssuesAssignedEditPart;
import trackit.diagram.part.TrackitVisualIDRegistry;
import trackit.diagram.providers.TrackitElementTypes;

/**
 * @generated
 */
public class IssueItemSemanticEditPolicy extends
		TrackitBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IssueItemSemanticEditPolicy() {
		super(TrackitElementTypes.Issue_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (TrackitVisualIDRegistry.getVisualID(incomingLink) == MemberIssuesAssignedEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrackitVisualIDRegistry.getVisualID(incomingLink) == IssueDuplicateOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrackitVisualIDRegistry.getVisualID(incomingLink) == IssueDependenciesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrackitVisualIDRegistry.getVisualID(incomingLink) == IssueBlockingEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (TrackitVisualIDRegistry.getVisualID(outgoingLink) == IssueDuplicateOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TrackitVisualIDRegistry.getVisualID(outgoingLink) == IssueDependenciesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TrackitVisualIDRegistry.getVisualID(outgoingLink) == IssueVersionsAffectedEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TrackitVisualIDRegistry.getVisualID(outgoingLink) == IssueBlockingEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (TrackitVisualIDRegistry.getVisualID(node)) {
			case IssueIssueCommentsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (TrackitVisualIDRegistry.getVisualID(cnode)) {
					case CommentEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TrackitElementTypes.MemberIssuesAssigned_4001 == req
				.getElementType()) {
			return null;
		}
		if (TrackitElementTypes.IssueDuplicateOf_4003 == req.getElementType()) {
			return getGEFWrapper(new IssueDuplicateOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrackitElementTypes.IssueDependencies_4004 == req.getElementType()) {
			return getGEFWrapper(new IssueDependenciesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrackitElementTypes.IssueVersionsAffected_4007 == req
				.getElementType()) {
			return getGEFWrapper(new IssueVersionsAffectedCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrackitElementTypes.IssueBlocking_4005 == req.getElementType()) {
			return getGEFWrapper(new IssueBlockingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TrackitElementTypes.MemberIssuesAssigned_4001 == req
				.getElementType()) {
			return getGEFWrapper(new MemberIssuesAssignedCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrackitElementTypes.IssueDuplicateOf_4003 == req.getElementType()) {
			return getGEFWrapper(new IssueDuplicateOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrackitElementTypes.IssueDependencies_4004 == req.getElementType()) {
			return getGEFWrapper(new IssueDependenciesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrackitElementTypes.IssueVersionsAffected_4007 == req
				.getElementType()) {
			return null;
		}
		if (TrackitElementTypes.IssueBlocking_4005 == req.getElementType()) {
			return getGEFWrapper(new IssueBlockingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MemberIssuesAssignedEditPart.VISUAL_ID:
			return getGEFWrapper(new MemberIssuesAssignedReorientCommand(req));
		case IssueDuplicateOfEditPart.VISUAL_ID:
			return getGEFWrapper(new IssueDuplicateOfReorientCommand(req));
		case IssueDependenciesEditPart.VISUAL_ID:
			return getGEFWrapper(new IssueDependenciesReorientCommand(req));
		case IssueVersionsAffectedEditPart.VISUAL_ID:
			return getGEFWrapper(new IssueVersionsAffectedReorientCommand(req));
		case IssueBlockingEditPart.VISUAL_ID:
			return getGEFWrapper(new IssueBlockingReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
