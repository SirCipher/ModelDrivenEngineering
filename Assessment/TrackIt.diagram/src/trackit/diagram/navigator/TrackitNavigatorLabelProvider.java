/*
 * 
 */
package trackit.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import trackit.IssueTracker;
import trackit.diagram.edit.parts.Comment2EditPart;
import trackit.diagram.edit.parts.CommentEditPart;
import trackit.diagram.edit.parts.CommentText2EditPart;
import trackit.diagram.edit.parts.CommentTextEditPart;
import trackit.diagram.edit.parts.IssueBlockingEditPart;
import trackit.diagram.edit.parts.IssueDependenciesEditPart;
import trackit.diagram.edit.parts.IssueDuplicateOfEditPart;
import trackit.diagram.edit.parts.IssueEditPart;
import trackit.diagram.edit.parts.IssueTitleEditPart;
import trackit.diagram.edit.parts.IssueTrackerEditPart;
import trackit.diagram.edit.parts.IssueVersionsAffectedEditPart;
import trackit.diagram.edit.parts.MemberEditPart;
import trackit.diagram.edit.parts.MemberFullNameEditPart;
import trackit.diagram.edit.parts.MemberIssuesAssignedEditPart;
import trackit.diagram.edit.parts.ProductEditPart;
import trackit.diagram.edit.parts.ProductNameEditPart;
import trackit.diagram.edit.parts.TeamEditPart;
import trackit.diagram.edit.parts.TeamMembersEditPart;
import trackit.diagram.edit.parts.TeamTeamNameEditPart;
import trackit.diagram.edit.parts.VersionEditPart;
import trackit.diagram.edit.parts.VersionNameEditPart;
import trackit.diagram.part.TrackitDiagramEditorPlugin;
import trackit.diagram.part.TrackitVisualIDRegistry;
import trackit.diagram.providers.TrackitElementTypes;
import trackit.diagram.providers.TrackitParserProvider;

/**
 * @generated
 */
public class TrackitNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TrackitDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TrackitDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TrackitNavigatorItem
				&& !isOwnView(((TrackitNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TrackitNavigatorGroup) {
			TrackitNavigatorGroup group = (TrackitNavigatorGroup) element;
			return TrackitDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof TrackitNavigatorItem) {
			TrackitNavigatorItem navigatorItem = (TrackitNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (TrackitVisualIDRegistry.getVisualID(view)) {
		case IssueTrackerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?trackit?IssueTracker", TrackitElementTypes.IssueTracker_1000); //$NON-NLS-1$
		case TeamEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?trackit?Team", TrackitElementTypes.Team_2001); //$NON-NLS-1$
		case ProductEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?trackit?Product", TrackitElementTypes.Product_2002); //$NON-NLS-1$
		case IssueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?trackit?Issue", TrackitElementTypes.Issue_2003); //$NON-NLS-1$
		case MemberEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?trackit?Member", TrackitElementTypes.Member_2004); //$NON-NLS-1$
		case VersionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?trackit?Version", TrackitElementTypes.Version_3001); //$NON-NLS-1$
		case CommentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?trackit?Comment", TrackitElementTypes.Comment_3002); //$NON-NLS-1$
		case Comment2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?trackit?Comment", TrackitElementTypes.Comment_3003); //$NON-NLS-1$
		case MemberIssuesAssignedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?trackit?Member?issuesAssigned", TrackitElementTypes.MemberIssuesAssigned_4001); //$NON-NLS-1$
		case TeamMembersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?trackit?Team?members", TrackitElementTypes.TeamMembers_4002); //$NON-NLS-1$
		case IssueDuplicateOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?trackit?Issue?duplicateOf", TrackitElementTypes.IssueDuplicateOf_4003); //$NON-NLS-1$
		case IssueDependenciesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?trackit?Issue?dependencies", TrackitElementTypes.IssueDependencies_4004); //$NON-NLS-1$
		case IssueBlockingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?trackit?Issue?blocking", TrackitElementTypes.IssueBlocking_4005); //$NON-NLS-1$
		case IssueVersionsAffectedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?trackit?Issue?versionsAffected", TrackitElementTypes.IssueVersionsAffected_4007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TrackitDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TrackitElementTypes.isKnownElementType(elementType)) {
			image = TrackitElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof TrackitNavigatorGroup) {
			TrackitNavigatorGroup group = (TrackitNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TrackitNavigatorItem) {
			TrackitNavigatorItem navigatorItem = (TrackitNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (TrackitVisualIDRegistry.getVisualID(view)) {
		case IssueTrackerEditPart.VISUAL_ID:
			return getIssueTracker_1000Text(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_2001Text(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2002Text(view);
		case IssueEditPart.VISUAL_ID:
			return getIssue_2003Text(view);
		case MemberEditPart.VISUAL_ID:
			return getMember_2004Text(view);
		case VersionEditPart.VISUAL_ID:
			return getVersion_3001Text(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_3002Text(view);
		case Comment2EditPart.VISUAL_ID:
			return getComment_3003Text(view);
		case MemberIssuesAssignedEditPart.VISUAL_ID:
			return getMemberIssuesAssigned_4001Text(view);
		case TeamMembersEditPart.VISUAL_ID:
			return getTeamMembers_4002Text(view);
		case IssueDuplicateOfEditPart.VISUAL_ID:
			return getIssueDuplicateOf_4003Text(view);
		case IssueDependenciesEditPart.VISUAL_ID:
			return getIssueDependencies_4004Text(view);
		case IssueBlockingEditPart.VISUAL_ID:
			return getIssueBlocking_4005Text(view);
		case IssueVersionsAffectedEditPart.VISUAL_ID:
			return getIssueVersionsAffected_4007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getIssueTracker_1000Text(View view) {
		IssueTracker domainModelElement = (IssueTracker) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getProjectName();
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTeam_2001Text(View view) {
		IParser parser = TrackitParserProvider
				.getParser(TrackitElementTypes.Team_2001,
						view.getElement() != null ? view.getElement() : view,
						TrackitVisualIDRegistry
								.getType(TeamTeamNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduct_2002Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.Product_2002,
				view.getElement() != null ? view.getElement() : view,
				TrackitVisualIDRegistry.getType(ProductNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIssue_2003Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.Issue_2003,
				view.getElement() != null ? view.getElement() : view,
				TrackitVisualIDRegistry.getType(IssueTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMember_2004Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.Member_2004,
				view.getElement() != null ? view.getElement() : view,
				TrackitVisualIDRegistry
						.getType(MemberFullNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVersion_3001Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.Version_3001,
				view.getElement() != null ? view.getElement() : view,
				TrackitVisualIDRegistry.getType(VersionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComment_3002Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.Comment_3002,
				view.getElement() != null ? view.getElement() : view,
				TrackitVisualIDRegistry.getType(CommentTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComment_3003Text(View view) {
		IParser parser = TrackitParserProvider
				.getParser(TrackitElementTypes.Comment_3003,
						view.getElement() != null ? view.getElement() : view,
						TrackitVisualIDRegistry
								.getType(CommentText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMemberIssuesAssigned_4001Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.MemberIssuesAssigned_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTeamMembers_4002Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.TeamMembers_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIssueDuplicateOf_4003Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.IssueDuplicateOf_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIssueDependencies_4004Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.IssueDependencies_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIssueBlocking_4005Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.IssueBlocking_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIssueVersionsAffected_4007Text(View view) {
		IParser parser = TrackitParserProvider.getParser(
				TrackitElementTypes.IssueVersionsAffected_4007,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrackitDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return IssueTrackerEditPart.MODEL_ID.equals(TrackitVisualIDRegistry
				.getModelID(view));
	}

}
