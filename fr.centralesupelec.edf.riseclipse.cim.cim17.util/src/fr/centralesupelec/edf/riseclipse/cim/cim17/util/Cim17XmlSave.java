/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
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
