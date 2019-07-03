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

import org.eclipse.emf.ecore.xmi.XMLHelper;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimXmlSave;

public class Cim17XmlSave extends AbstractCimXmlSave {
    
    public Cim17XmlSave( XMLHelper helper ) {
        super( Cim17Constants.cimURISharp, helper );
    }

    public Cim17XmlSave( Map< ?, ? > options, XMLHelper helper, String encoding ) {
        super( Cim17Constants.cimURISharp, options, helper, encoding );
    }

    public Cim17XmlSave( Map< ?, ? > options, XMLHelper helper, String encoding, String xmlVersion ) {
        super( Cim17Constants.cimURISharp, options, helper, encoding, xmlVersion );
    }
    
}
