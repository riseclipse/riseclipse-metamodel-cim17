/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;

public abstract class CimXMLHandler extends fr.centralesupelec.edf.riseclipse.cim.util.cimxml.CimXMLHandler {

    public CimXMLHandler( XMLResource xmiResource, XMLHelper helper, Map< ?, ? > options ) {
        super( CimConstants.cimURI, xmiResource, helper, options );
    }

    @Override
    protected boolean setEnumValue( EObject object, EStructuralFeature feature, String resource ) {
        if( resource.startsWith( CimConstants.cimURISharp ) ) {
            int enumNameLength = feature.getEType().getName().length();
            // do not call fr.centralesupelec.riseclipse.cim.util.cimxml.CimXMLHandler.setFeatureValue to avoid infinite recursion
            // call instead org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler.setFeatureValue
            // We use the fact that SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object ) call
            // SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object, -1 )
            super.setFeatureValue( object, feature,
                  resource.substring( CimConstants.cimURISharp.length() + enumNameLength + 1 ), -1 );
            return true;
        }
        return false;
    }

}
