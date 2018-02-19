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

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.xml.sax.helpers.DefaultHandler;

public class CimXMLLoadImpl extends fr.centralesupelec.edf.riseclipse.cim.util.cimxml.CimXMLLoadImpl {

    public CimXMLLoadImpl( XMLHelper helper ) {
        super( helper );
    }

    @Override
    protected DefaultHandler makeDefaultHandler() {
        return new CimXMLHandler( resource, helper, options );
    }

}
