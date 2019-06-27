/*
 * 
 */
package trackit.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import trackit.TrackitPackage;
import trackit.diagram.edit.parts.CommentText2EditPart;
import trackit.diagram.edit.parts.CommentTextEditPart;
import trackit.diagram.edit.parts.IssueTitleEditPart;
import trackit.diagram.edit.parts.MemberFullNameEditPart;
import trackit.diagram.edit.parts.ProductNameEditPart;
import trackit.diagram.edit.parts.TeamTeamNameEditPart;
import trackit.diagram.edit.parts.VersionNameEditPart;
import trackit.diagram.parsers.MessageFormatParser;
import trackit.diagram.part.TrackitVisualIDRegistry;

/**
 * @generated
 */
public class TrackitParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser teamTeamName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTeamTeamName_5001Parser() {
		if (teamTeamName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TrackitPackage.eINSTANCE
					.getTeam_TeamName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			teamTeamName_5001Parser = parser;
		}
		return teamTeamName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser productName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getProductName_5003Parser() {
		if (productName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TrackitPackage.eINSTANCE
					.getProduct_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productName_5003Parser = parser;
		}
		return productName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser issueTitle_5006Parser;

	/**
	 * @generated
	 */
	private IParser getIssueTitle_5006Parser() {
		if (issueTitle_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { TrackitPackage.eINSTANCE
					.getIssue_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			issueTitle_5006Parser = parser;
		}
		return issueTitle_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser memberFullName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getMemberFullName_5007Parser() {
		if (memberFullName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { TrackitPackage.eINSTANCE
					.getMember_FullName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			memberFullName_5007Parser = parser;
		}
		return memberFullName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser versionName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getVersionName_5002Parser() {
		if (versionName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TrackitPackage.eINSTANCE
					.getVersion_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			versionName_5002Parser = parser;
		}
		return versionName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser commentText_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCommentText_5005Parser() {
		if (commentText_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { TrackitPackage.eINSTANCE
					.getComment_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commentText_5005Parser = parser;
		}
		return commentText_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser commentText_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCommentText_5004Parser() {
		if (commentText_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { TrackitPackage.eINSTANCE
					.getComment_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commentText_5004Parser = parser;
		}
		return commentText_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TeamTeamNameEditPart.VISUAL_ID:
			return getTeamTeamName_5001Parser();
		case ProductNameEditPart.VISUAL_ID:
			return getProductName_5003Parser();
		case IssueTitleEditPart.VISUAL_ID:
			return getIssueTitle_5006Parser();
		case MemberFullNameEditPart.VISUAL_ID:
			return getMemberFullName_5007Parser();
		case VersionNameEditPart.VISUAL_ID:
			return getVersionName_5002Parser();
		case CommentTextEditPart.VISUAL_ID:
			return getCommentText_5005Parser();
		case CommentText2EditPart.VISUAL_ID:
			return getCommentText_5004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(TrackitVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TrackitVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TrackitElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
