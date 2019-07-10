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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimResource;


public abstract class AbstractCim17Resource extends AbstractCimResource {

    public AbstractCim17Resource( URI uri ) {
        super( uri );
    }

    @Override
    protected XMLLoad createXMLLoad() {
        return new Cim17XmlLoad( createXMLHelper() );
    }

    @Override
    protected XMLSave createXMLSave() {
        return new Cim17XmlSave( createXMLHelper() );
    }

    @Override
    protected XMLHelper createXMLHelper() {
        return new Cim17XmlHelper( this );
    }

}
