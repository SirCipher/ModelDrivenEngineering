/*
 * 
 */
package trackit.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import trackit.diagram.part.TrackitVisualIDRegistry;

/**
 * @generated
 */
public class TrackitNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7006;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TrackitNavigatorItem) {
			TrackitNavigatorItem item = (TrackitNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return TrackitVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
