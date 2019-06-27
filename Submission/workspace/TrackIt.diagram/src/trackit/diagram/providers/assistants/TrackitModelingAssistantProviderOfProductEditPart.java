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
public class TrackitModelingAssistantProviderOfProductEditPart extends
		TrackitModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TrackitElementTypes.Version_3001);
		return types;
	}

}
