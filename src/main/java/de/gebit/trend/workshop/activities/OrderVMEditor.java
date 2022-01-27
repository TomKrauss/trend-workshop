//
// OrderVMEditor.java
//
// Copyright (C) 2022
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.trend.workshop.activities;

import de.gebit.trend.model.annotations.*;


/**
 * This BOEditor component provides services for editing 
 * business objects with the type de.gebit.trend.workshop.activities.OrderVM.
 * It was generated initially. If you change the business objects class, edit it to update
 * the changes. Check for all places with a comment named @bo-related.
 */
@Stereotype("BusinessObjectEditor")
@DomainClass(de.gebit.trend.workshop.activities.OrderVM.class)
public class OrderVMEditor extends de.gebit.trend.gui.boeditor.GBOEditor {
    //{{DECLARE_CONTROLS
    /** Constant definition for model reference 'payment' */
    static public final String PAYMENT = 
            constant(de.gebit.trend.workshop.activities.OrderVM.PAYMENT_FIELD);
    /** Constant definition for model reference 'products' */
    static public final String PRODUCTS = 
            constant(de.gebit.trend.workshop.activities.OrderVM.PRODUCTS_FIELD);
    /** Constant definition for model reference 'shippingInfo' */
    static public final String SHIPPING_INFO = 
            constant(de.gebit.trend.workshop.activities.OrderVM.SHIPPING_INFO_FIELD);
    private final de.gebit.trend.gui.generic.boeditor.GenericBOEditor cShippingInfo = new de.gebit.trend.gui.generic.boeditor.GenericBOEditor();
    private final de.gebit.trend.gui.generic.boeditor.GenericBOEditor cPayment = new de.gebit.trend.gui.generic.boeditor.GenericBOEditor();
    private final de.gebit.trend.gui.GLabel cProductsLabel = new de.gebit.trend.gui.GLabel();
    private final de.gebit.trend.gui.generic.list.GenericTableControl cProducts = new de.gebit.trend.gui.generic.list.GenericTableControl();
    //}}
    public OrderVMEditor() {
        initialize();
        initializeBOEditor();
    }
    //{{INIT_CONTROLS
    /**
     * This generated method creates the visual components of this user interface class.
     * You may change the code, but all formatting changes or comments added manually
     * will be lost, the next time this user interface is edited and the code is re-generated.
     */
    private void initialize() {

        java.awt.GridBagConstraints tempGBC;

        this.setBounds(0, 0, 560, 282);
        this.setLayout(new java.awt.GridBagLayout());
        cShippingInfo.setName(SHIPPING_INFO);
        cShippingInfo.setModelLink(new de.gebit.trend.gui.generic.GenericComponentModelLink(de.gebit.trend.workshop.activities.ShippingInfoVM.class, null));
        tempGBC = new java.awt.GridBagConstraints();
        tempGBC.anchor = java.awt.GridBagConstraints.WEST;
        tempGBC.fill = java.awt.GridBagConstraints.HORIZONTAL;
        tempGBC.gridwidth = 2;
        tempGBC.gridx = 0;
        tempGBC.gridy = 0;
        tempGBC.insets = new java.awt.Insets(2,3,1,3);
        tempGBC.weightx = 1.0;
        this.add(cShippingInfo, tempGBC);
        cPayment.setName(PAYMENT);
        cPayment.setModelLink(new de.gebit.trend.gui.generic.GenericComponentModelLink(de.gebit.trend.workshop.activities.PaymentVM.class, null));
        tempGBC = new java.awt.GridBagConstraints();
        tempGBC.anchor = java.awt.GridBagConstraints.WEST;
        tempGBC.fill = java.awt.GridBagConstraints.HORIZONTAL;
        tempGBC.gridwidth = 2;
        tempGBC.gridx = 0;
        tempGBC.gridy = 1;
        tempGBC.insets = new java.awt.Insets(2,3,1,3);
        tempGBC.weightx = 1.0;
        this.add(cPayment, tempGBC);
        cProductsLabel.setName("productsLabel");
        cProductsLabel.setDisplayMnemonics(true);
        cProductsLabel.setLabelFor(cProducts);
        cProductsLabel.setOpaque(false);
        cProductsLabel.setText("Products:");
        tempGBC = new java.awt.GridBagConstraints();
        tempGBC.anchor = java.awt.GridBagConstraints.EAST;
        tempGBC.gridx = 0;
        tempGBC.gridy = 2;
        tempGBC.insets = new java.awt.Insets(2,3,1,3);
        this.add(cProductsLabel, tempGBC);
        cProducts.setName(PRODUCTS);
        cProducts.setModelLink(new de.gebit.trend.gui.generic.GenericComponentModelLink(de.gebit.trend.workshop.activities.ProductVM.class, null));
        tempGBC = new java.awt.GridBagConstraints();
        tempGBC.anchor = java.awt.GridBagConstraints.WEST;
        tempGBC.fill = java.awt.GridBagConstraints.BOTH;
        tempGBC.gridheight = 2;
        tempGBC.gridwidth = 3;
        tempGBC.gridx = 0;
        tempGBC.gridy = 3;
        tempGBC.insets = new java.awt.Insets(2,3,1,3);
        tempGBC.weightx = 1.0;
        tempGBC.weighty = 1.0;
        this.add(cProducts, tempGBC);
    }
    //}}
    /**
     * This method is overwritten to propagate inner actions to action listeners 
     * of the receiver. It is called from initializeBOEditor(). 
     */
    @Override
    protected void propagateActionTriggers() {

//{{PROPAGATE_ACTION_TRIGGERS

//}}
    }


}
