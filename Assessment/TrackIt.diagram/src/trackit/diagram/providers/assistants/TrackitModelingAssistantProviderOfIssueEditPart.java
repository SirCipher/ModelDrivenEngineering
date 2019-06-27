/*
 * 
 */
package trackit.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import trackit.diagram.edit.parts.IssueEditPart;
import trackit.diagram.edit.parts.VersionEditPart;
import trackit.diagram.providers.TrackitElementTypes;
import trackit.diagram.providers.TrackitModelingAssistantProvider;

/**
 * @generated
 */
public class TrackitModelingAssistantProviderOfIssueEditPart extends
		TrackitModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TrackitElementTypes.Comment_3002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((IssueEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(IssueEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(TrackitElementTypes.IssueDuplicateOf_4003);
		types.add(TrackitElementTypes.IssueDependencies_4004);
		types.add(TrackitElementTypes.IssueVersionsAffected_4007);
		types.add(TrackitElementTypes.IssueBlocking_4005);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((IssueEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			IssueEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof IssueEditPart) {
			types.add(TrackitElementTypes.IssueDuplicateOf_4003);
		}
		if (targetEditPart instanceof IssueEditPart) {
			types.add(TrackitElementTypes.IssueDependencies_4004);
		}
		if (targetEditPart instanceof VersionEditPart) {
			types.add(TrackitElementTypes.IssueVersionsAffected_4007);
		}
		if (targetEditPart instanceof IssueEditPart) {
			types.add(TrackitElementTypes.IssueBlocking_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((IssueEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(IssueEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TrackitElementTypes.IssueDuplicateOf_4003) {
			types.add(TrackitElementTypes.Issue_2003);
		} else if (relationshipType == TrackitElementTypes.IssueDependencies_4004) {
			types.add(TrackitElementTypes.Issue_2003);
		} else if (relationshipType == TrackitElementTypes.IssueVersionsAffected_4007) {
			types.add(TrackitElementTypes.Version_3001);
		} else if (relationshipType == TrackitElementTypes.IssueBlocking_4005) {
			types.add(TrackitElementTypes.Issue_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((IssueEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(IssueEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(TrackitElementTypes.MemberIssuesAssigned_4001);
		types.add(TrackitElementTypes.IssueDuplicateOf_4003);
		types.add(TrackitElementTypes.IssueDependencies_4004);
		types.add(TrackitElementTypes.IssueBlocking_4005);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((IssueEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(IssueEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TrackitElementTypes.MemberIssuesAssigned_4001) {
			types.add(TrackitElementTypes.Member_2004);
		} else if (relationshipType == TrackitElementTypes.IssueDuplicateOf_4003) {
			types.add(TrackitElementTypes.Issue_2003);
		} else if (relationshipType == TrackitElementTypes.IssueDependencies_4004) {
			types.add(TrackitElementTypes.Issue_2003);
		} else if (relationshipType == TrackitElementTypes.IssueBlocking_4005) {
			types.add(TrackitElementTypes.Issue_2003);
		}
		return types;
	}

}
