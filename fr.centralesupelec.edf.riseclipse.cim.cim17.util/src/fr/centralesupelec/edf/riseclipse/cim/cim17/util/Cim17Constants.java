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

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimConstants;

public class Cim17Constants extends AbstractCimConstants {

    // CimPackage is specific to each concrete Cim17 metamodel, so we cannot get it here,
    // but we prefer to have a generic Cim17 package
    //public static final String cimURI = CimPackage.eNS_URI;
    public static final String cimURI = "http://iec.ch/TC57/2016/CIM-schema-cim17";
    public static final String cimURISharp = cimURI + "#";
}
