/*
 * 
 */
package trackit.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import trackit.diagram.providers.TrackitElementTypes;
import trackit.diagram.providers.TrackitModelingAssistantProvider;

/**
 * @generated
 */
public class TrackitModelingAssistantProviderOfIssueTrackerEditPart extends
		TrackitModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(TrackitElementTypes.Team_2001);
		types.add(TrackitElementTypes.Product_2002);
		types.add(TrackitElementTypes.Issue_2003);
		types.add(TrackitElementTypes.Member_2004);
		return types;
	}

}
