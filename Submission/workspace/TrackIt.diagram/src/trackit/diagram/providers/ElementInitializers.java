/*
 * 
 */
package trackit.diagram.providers;

import trackit.diagram.part.TrackitDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TrackitDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			TrackitDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
