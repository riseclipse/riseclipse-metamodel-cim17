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
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.util;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimXmlHelper;

public class Cim17XmlHelper extends AbstractCimXmlHelper {

    public Cim17XmlHelper( AbstractCim17Resource abstractCim17Resource ) {
        super( abstractCim17Resource );
    }

    @Override
    public String getURI( String prefix ) {
        String uri = super.getURI( prefix );
        if( Cim17Constants.cimURISharp.equals( uri )) return Cim17Constants.cimURI;
        return uri;
    }

}
