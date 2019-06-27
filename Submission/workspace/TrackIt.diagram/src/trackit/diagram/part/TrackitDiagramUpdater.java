/*
 * 
 */
package trackit.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import trackit.Comment;
import trackit.Issue;
import trackit.IssueTracker;
import trackit.Member;
import trackit.Product;
import trackit.Team;
import trackit.TrackitPackage;
import trackit.Version;
import trackit.diagram.edit.parts.Comment2EditPart;
import trackit.diagram.edit.parts.CommentCommentRepliesCompartment2EditPart;
import trackit.diagram.edit.parts.CommentCommentRepliesCompartmentEditPart;
import trackit.diagram.edit.parts.CommentEditPart;
import trackit.diagram.edit.parts.IssueBlockingEditPart;
import trackit.diagram.edit.parts.IssueDependenciesEditPart;
import trackit.diagram.edit.parts.IssueDuplicateOfEditPart;
import trackit.diagram.edit.parts.IssueEditPart;
import trackit.diagram.edit.parts.IssueIssueCommentsCompartmentEditPart;
import trackit.diagram.edit.parts.IssueTrackerEditPart;
import trackit.diagram.edit.parts.IssueVersionsAffectedEditPart;
import trackit.diagram.edit.parts.MemberEditPart;
import trackit.diagram.edit.parts.MemberIssuesAssignedEditPart;
import trackit.diagram.edit.parts.ProductEditPart;
import trackit.diagram.edit.parts.ProductProductVersionCompartmentEditPart;
import trackit.diagram.edit.parts.TeamEditPart;
import trackit.diagram.edit.parts.TeamMembersEditPart;
import trackit.diagram.edit.parts.VersionEditPart;
import trackit.diagram.providers.TrackitElementTypes;

/**
 * @generated
 */
public class TrackitDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<TrackitNodeDescriptor> getSemanticChildren(View view) {
		switch (TrackitVisualIDRegistry.getVisualID(view)) {
		case IssueTrackerEditPart.VISUAL_ID:
			return getIssueTracker_1000SemanticChildren(view);
		case ProductProductVersionCompartmentEditPart.VISUAL_ID:
			return getProductProductVersionCompartment_7001SemanticChildren(view);
		case IssueIssueCommentsCompartmentEditPart.VISUAL_ID:
			return getIssueIssueCommentsCompartment_7002SemanticChildren(view);
		case CommentCommentRepliesCompartmentEditPart.VISUAL_ID:
			return getCommentCommentRepliesCompartment_7003SemanticChildren(view);
		case CommentCommentRepliesCompartment2EditPart.VISUAL_ID:
			return getCommentCommentRepliesCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitNodeDescriptor> getIssueTracker_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		IssueTracker modelElement = (IssueTracker) view.getElement();
		LinkedList<TrackitNodeDescriptor> result = new LinkedList<TrackitNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTeams().iterator(); it.hasNext();) {
			Team childElement = (Team) it.next();
			int visualID = TrackitVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TeamEditPart.VISUAL_ID) {
				result.add(new TrackitNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProducts().iterator(); it
				.hasNext();) {
			Product childElement = (Product) it.next();
			int visualID = TrackitVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProductEditPart.VISUAL_ID) {
				result.add(new TrackitNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIssues().iterator(); it.hasNext();) {
			Issue childElement = (Issue) it.next();
			int visualID = TrackitVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IssueEditPart.VISUAL_ID) {
				result.add(new TrackitNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMembers().iterator(); it
				.hasNext();) {
			Member childElement = (Member) it.next();
			int visualID = TrackitVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MemberEditPart.VISUAL_ID) {
				result.add(new TrackitNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitNodeDescriptor> getProductProductVersionCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Product modelElement = (Product) containerView.getElement();
		LinkedList<TrackitNodeDescriptor> result = new LinkedList<TrackitNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVersion().iterator(); it
				.hasNext();) {
			Version childElement = (Version) it.next();
			int visualID = TrackitVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == VersionEditPart.VISUAL_ID) {
				result.add(new TrackitNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitNodeDescriptor> getIssueIssueCommentsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Issue modelElement = (Issue) containerView.getElement();
		LinkedList<TrackitNodeDescriptor> result = new LinkedList<TrackitNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComments().iterator(); it
				.hasNext();) {
			Comment childElement = (Comment) it.next();
			int visualID = TrackitVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CommentEditPart.VISUAL_ID) {
				result.add(new TrackitNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitNodeDescriptor> getCommentCommentRepliesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Comment modelElement = (Comment) containerView.getElement();
		LinkedList<TrackitNodeDescriptor> result = new LinkedList<TrackitNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReplies().iterator(); it
				.hasNext();) {
			Comment childElement = (Comment) it.next();
			int visualID = TrackitVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Comment2EditPart.VISUAL_ID) {
				result.add(new TrackitNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitNodeDescriptor> getCommentCommentRepliesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Comment modelElement = (Comment) containerView.getElement();
		LinkedList<TrackitNodeDescriptor> result = new LinkedList<TrackitNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReplies().iterator(); it
				.hasNext();) {
			Comment childElement = (Comment) it.next();
			int visualID = TrackitVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Comment2EditPart.VISUAL_ID) {
				result.add(new TrackitNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getContainedLinks(View view) {
		switch (TrackitVisualIDRegistry.getVisualID(view)) {
		case IssueTrackerEditPart.VISUAL_ID:
			return getIssueTracker_1000ContainedLinks(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_2001ContainedLinks(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2002ContainedLinks(view);
		case IssueEditPart.VISUAL_ID:
			return getIssue_2003ContainedLinks(view);
		case MemberEditPart.VISUAL_ID:
			return getMember_2004ContainedLinks(view);
		case VersionEditPart.VISUAL_ID:
			return getVersion_3001ContainedLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_3002ContainedLinks(view);
		case Comment2EditPart.VISUAL_ID:
			return getComment_3003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getIncomingLinks(View view) {
		switch (TrackitVisualIDRegistry.getVisualID(view)) {
		case TeamEditPart.VISUAL_ID:
			return getTeam_2001IncomingLinks(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2002IncomingLinks(view);
		case IssueEditPart.VISUAL_ID:
			return getIssue_2003IncomingLinks(view);
		case MemberEditPart.VISUAL_ID:
			return getMember_2004IncomingLinks(view);
		case VersionEditPart.VISUAL_ID:
			return getVersion_3001IncomingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_3002IncomingLinks(view);
		case Comment2EditPart.VISUAL_ID:
			return getComment_3003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getOutgoingLinks(View view) {
		switch (TrackitVisualIDRegistry.getVisualID(view)) {
		case TeamEditPart.VISUAL_ID:
			return getTeam_2001OutgoingLinks(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2002OutgoingLinks(view);
		case IssueEditPart.VISUAL_ID:
			return getIssue_2003OutgoingLinks(view);
		case MemberEditPart.VISUAL_ID:
			return getMember_2004OutgoingLinks(view);
		case VersionEditPart.VISUAL_ID:
			return getVersion_3001OutgoingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_3002OutgoingLinks(view);
		case Comment2EditPart.VISUAL_ID:
			return getComment_3003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getIssueTracker_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getTeam_2001ContainedLinks(
			View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Team_Members_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getProduct_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getIssue_2003ContainedLinks(
			View view) {
		Issue modelElement = (Issue) view.getElement();
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Issue_DuplicateOf_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Issue_Dependencies_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Issue_VersionsAffected_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Issue_Blocking_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getMember_2004ContainedLinks(
			View view) {
		Member modelElement = (Member) view.getElement();
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Member_IssuesAssigned_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getVersion_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getComment_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getComment_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getTeam_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getProduct_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getIssue_2003IncomingLinks(
			View view) {
		Issue modelElement = (Issue) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Member_IssuesAssigned_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Issue_DuplicateOf_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Issue_Dependencies_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Issue_Blocking_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getMember_2004IncomingLinks(
			View view) {
		Member modelElement = (Member) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Team_Members_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getVersion_3001IncomingLinks(
			View view) {
		Version modelElement = (Version) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Issue_VersionsAffected_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getComment_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getComment_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getTeam_2001OutgoingLinks(
			View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Team_Members_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getProduct_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getIssue_2003OutgoingLinks(
			View view) {
		Issue modelElement = (Issue) view.getElement();
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Issue_DuplicateOf_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Issue_Dependencies_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Issue_VersionsAffected_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Issue_Blocking_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getMember_2004OutgoingLinks(
			View view) {
		Member modelElement = (Member) view.getElement();
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Member_IssuesAssigned_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getVersion_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getComment_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrackitLinkDescriptor> getComment_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getIncomingFeatureModelFacetLinks_Member_IssuesAssigned_4001(
			Issue target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TrackitPackage.eINSTANCE
					.getMember_IssuesAssigned()) {
				result.add(new TrackitLinkDescriptor(setting.getEObject(),
						target, TrackitElementTypes.MemberIssuesAssigned_4001,
						MemberIssuesAssignedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getIncomingFeatureModelFacetLinks_Team_Members_4002(
			Member target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TrackitPackage.eINSTANCE
					.getTeam_Members()) {
				result.add(new TrackitLinkDescriptor(setting.getEObject(),
						target, TrackitElementTypes.TeamMembers_4002,
						TeamMembersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getIncomingFeatureModelFacetLinks_Issue_DuplicateOf_4003(
			Issue target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TrackitPackage.eINSTANCE
					.getIssue_DuplicateOf()) {
				result.add(new TrackitLinkDescriptor(setting.getEObject(),
						target, TrackitElementTypes.IssueDuplicateOf_4003,
						IssueDuplicateOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getIncomingFeatureModelFacetLinks_Issue_Dependencies_4004(
			Issue target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TrackitPackage.eINSTANCE
					.getIssue_Dependencies()) {
				result.add(new TrackitLinkDescriptor(setting.getEObject(),
						target, TrackitElementTypes.IssueDependencies_4004,
						IssueDependenciesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getIncomingFeatureModelFacetLinks_Issue_VersionsAffected_4007(
			Version target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TrackitPackage.eINSTANCE
					.getIssue_VersionsAffected()) {
				result.add(new TrackitLinkDescriptor(setting.getEObject(),
						target, TrackitElementTypes.IssueVersionsAffected_4007,
						IssueVersionsAffectedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getIncomingFeatureModelFacetLinks_Issue_Blocking_4005(
			Issue target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TrackitPackage.eINSTANCE
					.getIssue_Blocking()) {
				result.add(new TrackitLinkDescriptor(setting.getEObject(),
						target, TrackitElementTypes.IssueBlocking_4005,
						IssueBlockingEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getOutgoingFeatureModelFacetLinks_Member_IssuesAssigned_4001(
			Member source) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		for (Iterator<?> destinations = source.getIssuesAssigned().iterator(); destinations
				.hasNext();) {
			Issue destination = (Issue) destinations.next();
			result.add(new TrackitLinkDescriptor(source, destination,
					TrackitElementTypes.MemberIssuesAssigned_4001,
					MemberIssuesAssignedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getOutgoingFeatureModelFacetLinks_Team_Members_4002(
			Team source) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		for (Iterator<?> destinations = source.getMembers().iterator(); destinations
				.hasNext();) {
			Member destination = (Member) destinations.next();
			result.add(new TrackitLinkDescriptor(source, destination,
					TrackitElementTypes.TeamMembers_4002,
					TeamMembersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getOutgoingFeatureModelFacetLinks_Issue_DuplicateOf_4003(
			Issue source) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		for (Iterator<?> destinations = source.getDuplicateOf().iterator(); destinations
				.hasNext();) {
			Issue destination = (Issue) destinations.next();
			result.add(new TrackitLinkDescriptor(source, destination,
					TrackitElementTypes.IssueDuplicateOf_4003,
					IssueDuplicateOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getOutgoingFeatureModelFacetLinks_Issue_Dependencies_4004(
			Issue source) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		for (Iterator<?> destinations = source.getDependencies().iterator(); destinations
				.hasNext();) {
			Issue destination = (Issue) destinations.next();
			result.add(new TrackitLinkDescriptor(source, destination,
					TrackitElementTypes.IssueDependencies_4004,
					IssueDependenciesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getOutgoingFeatureModelFacetLinks_Issue_VersionsAffected_4007(
			Issue source) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		for (Iterator<?> destinations = source.getVersionsAffected().iterator(); destinations
				.hasNext();) {
			Version destination = (Version) destinations.next();
			result.add(new TrackitLinkDescriptor(source, destination,
					TrackitElementTypes.IssueVersionsAffected_4007,
					IssueVersionsAffectedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrackitLinkDescriptor> getOutgoingFeatureModelFacetLinks_Issue_Blocking_4005(
			Issue source) {
		LinkedList<TrackitLinkDescriptor> result = new LinkedList<TrackitLinkDescriptor>();
		for (Iterator<?> destinations = source.getBlocking().iterator(); destinations
				.hasNext();) {
			Issue destination = (Issue) destinations.next();
			result.add(new TrackitLinkDescriptor(source, destination,
					TrackitElementTypes.IssueBlocking_4005,
					IssueBlockingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<TrackitNodeDescriptor> getSemanticChildren(View view) {
			return TrackitDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TrackitLinkDescriptor> getContainedLinks(View view) {
			return TrackitDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TrackitLinkDescriptor> getIncomingLinks(View view) {
			return TrackitDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TrackitLinkDescriptor> getOutgoingLinks(View view) {
			return TrackitDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
