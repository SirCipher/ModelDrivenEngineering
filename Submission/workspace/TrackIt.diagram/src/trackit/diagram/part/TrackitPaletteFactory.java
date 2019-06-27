/*
 * 
 */
package trackit.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import trackit.diagram.providers.TrackitElementTypes;

/**
 * @generated
 */
public class TrackitPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createComment1CreationTool());
		paletteContainer.add(createIssue2CreationTool());
		paletteContainer.add(createMember3CreationTool());
		paletteContainer.add(createProduct4CreationTool());
		paletteContainer.add(createTeam5CreationTool());
		paletteContainer.add(createVersion6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createBlocking1CreationTool());
		paletteContainer.add(createDependencies2CreationTool());
		paletteContainer.add(createDuplicateOf3CreationTool());
		paletteContainer.add(createIssuesAssigned4CreationTool());
		paletteContainer.add(createMembers5CreationTool());
		paletteContainer.add(createVersionsAffected6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComment1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TrackitElementTypes.Comment_3002);
		types.add(TrackitElementTypes.Comment_3003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Comment1CreationTool_title,
				Messages.Comment1CreationTool_desc, types);
		entry.setId("createComment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.Comment_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIssue2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Issue2CreationTool_title,
				Messages.Issue2CreationTool_desc,
				Collections.singletonList(TrackitElementTypes.Issue_2003));
		entry.setId("createIssue2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.Issue_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMember3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Member3CreationTool_title,
				Messages.Member3CreationTool_desc,
				Collections.singletonList(TrackitElementTypes.Member_2004));
		entry.setId("createMember3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.Member_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProduct4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Product4CreationTool_title,
				Messages.Product4CreationTool_desc,
				Collections.singletonList(TrackitElementTypes.Product_2002));
		entry.setId("createProduct4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.Product_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTeam5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Team5CreationTool_title,
				Messages.Team5CreationTool_desc,
				Collections.singletonList(TrackitElementTypes.Team_2001));
		entry.setId("createTeam5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.Team_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVersion6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Version6CreationTool_title,
				Messages.Version6CreationTool_desc,
				Collections.singletonList(TrackitElementTypes.Version_3001));
		entry.setId("createVersion6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.Version_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBlocking1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Blocking1CreationTool_title,
				Messages.Blocking1CreationTool_desc,
				Collections
						.singletonList(TrackitElementTypes.IssueBlocking_4005));
		entry.setId("createBlocking1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.IssueBlocking_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencies2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Dependencies2CreationTool_title,
				Messages.Dependencies2CreationTool_desc,
				Collections
						.singletonList(TrackitElementTypes.IssueDependencies_4004));
		entry.setId("createDependencies2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.IssueDependencies_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDuplicateOf3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.DuplicateOf3CreationTool_title,
				Messages.DuplicateOf3CreationTool_desc,
				Collections
						.singletonList(TrackitElementTypes.IssueDuplicateOf_4003));
		entry.setId("createDuplicateOf3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.IssueDuplicateOf_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIssuesAssigned4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.IssuesAssigned4CreationTool_title,
				Messages.IssuesAssigned4CreationTool_desc,
				Collections
						.singletonList(TrackitElementTypes.MemberIssuesAssigned_4001));
		entry.setId("createIssuesAssigned4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.MemberIssuesAssigned_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMembers5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Members5CreationTool_title,
				Messages.Members5CreationTool_desc,
				Collections.singletonList(TrackitElementTypes.TeamMembers_4002));
		entry.setId("createMembers5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.TeamMembers_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVersionsAffected6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.VersionsAffected6CreationTool_title,
				Messages.VersionsAffected6CreationTool_desc,
				Collections
						.singletonList(TrackitElementTypes.IssueVersionsAffected_4007));
		entry.setId("createVersionsAffected6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrackitElementTypes
				.getImageDescriptor(TrackitElementTypes.IssueVersionsAffected_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
