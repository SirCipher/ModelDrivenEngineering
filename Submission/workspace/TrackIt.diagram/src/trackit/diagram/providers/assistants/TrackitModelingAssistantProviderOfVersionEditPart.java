/*
 * 
 */
package trackit.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import trackit.diagram.edit.parts.VersionEditPart;
import trackit.diagram.providers.TrackitElementTypes;
import trackit.diagram.providers.TrackitModelingAssistantProvider;

/**
 * @generated
 */
public class TrackitModelingAssistantProviderOfVersionEditPart extends
		TrackitModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((VersionEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(VersionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TrackitElementTypes.IssueVersionsAffected_4007);
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
		return doGetTypesForSource((VersionEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(VersionEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TrackitElementTypes.IssueVersionsAffected_4007) {
			types.add(TrackitElementTypes.Issue_2003);
		}
		return types;
	}

}
