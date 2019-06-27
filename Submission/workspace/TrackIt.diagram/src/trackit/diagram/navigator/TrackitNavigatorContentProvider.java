/*
 * 
 */
package trackit.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import trackit.diagram.part.Messages;
import trackit.diagram.part.TrackitVisualIDRegistry;

/**
 * @generated
 */
public class TrackitNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public TrackitNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<TrackitNavigatorItem> result = new ArrayList<TrackitNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, IssueTrackerEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof TrackitNavigatorGroup) {
			TrackitNavigatorGroup group = (TrackitNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof TrackitNavigatorItem) {
			TrackitNavigatorItem navigatorItem = (TrackitNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (TrackitVisualIDRegistry.getVisualID(view)) {

		case IssueTrackerEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			TrackitNavigatorGroup links = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_IssueTracker_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(TeamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(ProductEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(IssueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(MemberEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(MemberIssuesAssignedEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(TeamMembersEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueDuplicateOfEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueDependenciesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueVersionsAffectedEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueBlockingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case TeamEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrackitNavigatorGroup outgoinglinks = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_Team_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(TeamMembersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ProductEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(ProductProductVersionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrackitVisualIDRegistry.getType(VersionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IssueEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrackitNavigatorGroup incominglinks = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_Issue_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrackitNavigatorGroup outgoinglinks = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_Issue_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueIssueCommentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrackitVisualIDRegistry.getType(CommentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(MemberIssuesAssignedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueDuplicateOfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueDuplicateOfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueDependenciesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueVersionsAffectedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueBlockingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueBlockingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MemberEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrackitNavigatorGroup outgoinglinks = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_Member_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrackitNavigatorGroup incominglinks = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_Member_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(MemberIssuesAssignedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(TeamMembersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case VersionEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrackitNavigatorGroup incominglinks = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_Version_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(IssueVersionsAffectedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CommentEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(CommentCommentRepliesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrackitVisualIDRegistry.getType(Comment2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Comment2EditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrackitVisualIDRegistry
							.getType(CommentCommentRepliesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrackitVisualIDRegistry.getType(Comment2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MemberIssuesAssignedEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrackitNavigatorGroup target = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_MemberIssuesAssigned_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrackitNavigatorGroup source = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_MemberIssuesAssigned_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(IssueEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(MemberEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TeamMembersEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrackitNavigatorGroup target = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_TeamMembers_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrackitNavigatorGroup source = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_TeamMembers_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(MemberEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(TeamEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case IssueDuplicateOfEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrackitNavigatorGroup target = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_IssueDuplicateOf_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrackitNavigatorGroup source = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_IssueDuplicateOf_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(IssueEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(IssueEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case IssueDependenciesEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrackitNavigatorGroup target = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_IssueDependencies_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrackitNavigatorGroup source = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_IssueDependencies_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(IssueEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(IssueEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case IssueBlockingEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrackitNavigatorGroup target = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_IssueBlocking_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrackitNavigatorGroup source = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_IssueBlocking_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(IssueEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(IssueEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case IssueVersionsAffectedEditPart.VISUAL_ID: {
			LinkedList<TrackitAbstractNavigatorItem> result = new LinkedList<TrackitAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrackitNavigatorGroup target = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_IssueVersionsAffected_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrackitNavigatorGroup source = new TrackitNavigatorGroup(
					Messages.NavigatorGroupName_IssueVersionsAffected_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(VersionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrackitVisualIDRegistry.getType(IssueEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return IssueTrackerEditPart.MODEL_ID.equals(TrackitVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<TrackitNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<TrackitNavigatorItem> result = new ArrayList<TrackitNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new TrackitNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<TrackitNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof TrackitAbstractNavigatorItem) {
			TrackitAbstractNavigatorItem abstractNavigatorItem = (TrackitAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
