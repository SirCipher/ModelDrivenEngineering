/*
 * 
 */
package trackit.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import trackit.diagram.part.TrackitDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(TrackitDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
