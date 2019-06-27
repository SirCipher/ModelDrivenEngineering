/*
 * 
 */
package trackit.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import trackit.diagram.edit.parts.IssueTrackerEditPart;
import trackit.diagram.edit.parts.TrackitEditPartFactory;
import trackit.diagram.part.TrackitVisualIDRegistry;

/**
 * @generated
 */
public class TrackitEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public TrackitEditPartProvider() {
		super(new TrackitEditPartFactory(),
				TrackitVisualIDRegistry.TYPED_INSTANCE,
				IssueTrackerEditPart.MODEL_ID);
	}

}
