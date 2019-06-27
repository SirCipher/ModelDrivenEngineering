/*
 * 
 */
package trackit.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import trackit.diagram.edit.commands.VersionCreateCommand;
import trackit.diagram.providers.TrackitElementTypes;

/**
 * @generated
 */
public class ProductProductVersionCompartmentItemSemanticEditPolicy extends
		TrackitBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProductProductVersionCompartmentItemSemanticEditPolicy() {
		super(TrackitElementTypes.Product_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TrackitElementTypes.Version_3001 == req.getElementType()) {
			return getGEFWrapper(new VersionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
