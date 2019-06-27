/*
 * 
 */
package trackit.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import trackit.TrackitPackage;
import trackit.diagram.edit.parts.Comment2EditPart;
import trackit.diagram.edit.parts.CommentEditPart;
import trackit.diagram.edit.parts.IssueBlockingEditPart;
import trackit.diagram.edit.parts.IssueDependenciesEditPart;
import trackit.diagram.edit.parts.IssueDuplicateOfEditPart;
import trackit.diagram.edit.parts.IssueEditPart;
import trackit.diagram.edit.parts.IssueTrackerEditPart;
import trackit.diagram.edit.parts.IssueVersionsAffectedEditPart;
import trackit.diagram.edit.parts.MemberEditPart;
import trackit.diagram.edit.parts.MemberIssuesAssignedEditPart;
import trackit.diagram.edit.parts.ProductEditPart;
import trackit.diagram.edit.parts.TeamEditPart;
import trackit.diagram.edit.parts.TeamMembersEditPart;
import trackit.diagram.edit.parts.VersionEditPart;
import trackit.diagram.part.TrackitDiagramEditorPlugin;

/**
 * @generated
 */
public class TrackitElementTypes {

	/**
	 * @generated
	 */
	private TrackitElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			TrackitDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType IssueTracker_1000 = getElementType("TrackIt.diagram.IssueTracker_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Team_2001 = getElementType("TrackIt.diagram.Team_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Product_2002 = getElementType("TrackIt.diagram.Product_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Issue_2003 = getElementType("TrackIt.diagram.Issue_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Member_2004 = getElementType("TrackIt.diagram.Member_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Version_3001 = getElementType("TrackIt.diagram.Version_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Comment_3002 = getElementType("TrackIt.diagram.Comment_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Comment_3003 = getElementType("TrackIt.diagram.Comment_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MemberIssuesAssigned_4001 = getElementType("TrackIt.diagram.MemberIssuesAssigned_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TeamMembers_4002 = getElementType("TrackIt.diagram.TeamMembers_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IssueDuplicateOf_4003 = getElementType("TrackIt.diagram.IssueDuplicateOf_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IssueDependencies_4004 = getElementType("TrackIt.diagram.IssueDependencies_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IssueVersionsAffected_4007 = getElementType("TrackIt.diagram.IssueVersionsAffected_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IssueBlocking_4005 = getElementType("TrackIt.diagram.IssueBlocking_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(IssueTracker_1000,
					TrackitPackage.eINSTANCE.getIssueTracker());

			elements.put(Team_2001, TrackitPackage.eINSTANCE.getTeam());

			elements.put(Product_2002, TrackitPackage.eINSTANCE.getProduct());

			elements.put(Issue_2003, TrackitPackage.eINSTANCE.getIssue());

			elements.put(Member_2004, TrackitPackage.eINSTANCE.getMember());

			elements.put(Version_3001, TrackitPackage.eINSTANCE.getVersion());

			elements.put(Comment_3002, TrackitPackage.eINSTANCE.getComment());

			elements.put(Comment_3003, TrackitPackage.eINSTANCE.getComment());

			elements.put(MemberIssuesAssigned_4001,
					TrackitPackage.eINSTANCE.getMember_IssuesAssigned());

			elements.put(TeamMembers_4002,
					TrackitPackage.eINSTANCE.getTeam_Members());

			elements.put(IssueDuplicateOf_4003,
					TrackitPackage.eINSTANCE.getIssue_DuplicateOf());

			elements.put(IssueDependencies_4004,
					TrackitPackage.eINSTANCE.getIssue_Dependencies());

			elements.put(IssueVersionsAffected_4007,
					TrackitPackage.eINSTANCE.getIssue_VersionsAffected());

			elements.put(IssueBlocking_4005,
					TrackitPackage.eINSTANCE.getIssue_Blocking());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(IssueTracker_1000);
			KNOWN_ELEMENT_TYPES.add(Team_2001);
			KNOWN_ELEMENT_TYPES.add(Product_2002);
			KNOWN_ELEMENT_TYPES.add(Issue_2003);
			KNOWN_ELEMENT_TYPES.add(Member_2004);
			KNOWN_ELEMENT_TYPES.add(Version_3001);
			KNOWN_ELEMENT_TYPES.add(Comment_3002);
			KNOWN_ELEMENT_TYPES.add(Comment_3003);
			KNOWN_ELEMENT_TYPES.add(MemberIssuesAssigned_4001);
			KNOWN_ELEMENT_TYPES.add(TeamMembers_4002);
			KNOWN_ELEMENT_TYPES.add(IssueDuplicateOf_4003);
			KNOWN_ELEMENT_TYPES.add(IssueDependencies_4004);
			KNOWN_ELEMENT_TYPES.add(IssueVersionsAffected_4007);
			KNOWN_ELEMENT_TYPES.add(IssueBlocking_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case IssueTrackerEditPart.VISUAL_ID:
			return IssueTracker_1000;
		case TeamEditPart.VISUAL_ID:
			return Team_2001;
		case ProductEditPart.VISUAL_ID:
			return Product_2002;
		case IssueEditPart.VISUAL_ID:
			return Issue_2003;
		case MemberEditPart.VISUAL_ID:
			return Member_2004;
		case VersionEditPart.VISUAL_ID:
			return Version_3001;
		case CommentEditPart.VISUAL_ID:
			return Comment_3002;
		case Comment2EditPart.VISUAL_ID:
			return Comment_3003;
		case MemberIssuesAssignedEditPart.VISUAL_ID:
			return MemberIssuesAssigned_4001;
		case TeamMembersEditPart.VISUAL_ID:
			return TeamMembers_4002;
		case IssueDuplicateOfEditPart.VISUAL_ID:
			return IssueDuplicateOf_4003;
		case IssueDependenciesEditPart.VISUAL_ID:
			return IssueDependencies_4004;
		case IssueVersionsAffectedEditPart.VISUAL_ID:
			return IssueVersionsAffected_4007;
		case IssueBlockingEditPart.VISUAL_ID:
			return IssueBlocking_4005;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return trackit.diagram.providers.TrackitElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return trackit.diagram.providers.TrackitElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return trackit.diagram.providers.TrackitElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
