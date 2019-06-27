/**
 */
package trackit.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import trackit.Issue;
import trackit.IssueType;
import trackit.TrackitFactory;
import trackit.TrackitPackage;
import trackit.impl.IssueImpl;

/**
 * This is the item provider adapter for a {@link trackit.Issue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IssueItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTitlePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDateCreatedPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addIssueTypePropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addBlockersPropertyDescriptor(object);
			addAssignedToPropertyDescriptor(object);
			addDuplicateOfPropertyDescriptor(object);
			addDependenciesPropertyDescriptor(object);
			addVersionsAffectedPropertyDescriptor(object);
			addBlockingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_title_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_description_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_status_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Issue Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssueTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_issueType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_issueType_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__ISSUE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Created feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateCreatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_dateCreated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_dateCreated_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__DATE_CREATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duplicate Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDuplicateOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_duplicateOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_duplicateOf_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__DUPLICATE_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependenciesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_dependencies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_dependencies_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__DEPENDENCIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_author_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__AUTHOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assigned To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_assignedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_assignedTo_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__ASSIGNED_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Versions Affected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionsAffectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_versionsAffected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_versionsAffected_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__VERSIONS_AFFECTED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Blocking feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_blocking_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_blocking_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__BLOCKING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Blockers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_blockers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_blockers_feature", "_UI_Issue_type"),
				 TrackitPackage.Literals.ISSUE__BLOCKERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TrackitPackage.Literals.ISSUE__COMMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the correct image based on the issue type if one is assigned. Else, returns the default issue icon
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		IssueImpl issue = ((IssueImpl) object);
		List<IssueType> it = issue.getIssueType();
		
		if (it == null || it.size() == 0) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Issue"));
		} else {
			IssueType primary = it.get(0);			
			return overlayImage(object, getResourceLocator().getImage("full/obj16/" + primary.getLiteral().toLowerCase()));
		}
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * If the title is empty then the UUID is returned. If this is also empty then the default text is returned
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Issue issue = ((Issue)object);
		EList<IssueType> types = issue.getIssueType();	
		String text =  issue.getTitle();
		
		if (text == null || text.trim().length() == 0) {
			text = issue.getUuid();
		}
		
		if (types != null && types.size() > 0) {
			IssueType issueType = types.get(0);
			text = issueType.getLiteral() + ": " + text;
		}
		
		return text == null || text.length() == 0 ?
			getString("_UI_Issue_type") :
			getString("_UI_Issue_type") + " "  + text;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Issue.class)) {
			case TrackitPackage.ISSUE__TITLE:
			case TrackitPackage.ISSUE__DESCRIPTION:
			case TrackitPackage.ISSUE__DATE_CREATED:
			case TrackitPackage.ISSUE__STATUS:
			case TrackitPackage.ISSUE__ISSUE_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TrackitPackage.ISSUE__COMMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TrackitPackage.Literals.ISSUE__COMMENTS,
				 TrackitFactory.eINSTANCE.createComment()));
	}

}
