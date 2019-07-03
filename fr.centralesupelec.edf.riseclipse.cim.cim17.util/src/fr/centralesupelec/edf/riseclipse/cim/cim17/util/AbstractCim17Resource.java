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
