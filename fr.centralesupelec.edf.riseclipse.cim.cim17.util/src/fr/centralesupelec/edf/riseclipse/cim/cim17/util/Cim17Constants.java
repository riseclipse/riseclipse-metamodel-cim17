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

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimConstants;

public class Cim17Constants extends AbstractCimConstants {

    // CimPackage is specific to each concrete Cim17 metamodel, so we cannot get it here,
    // but we prefer to have a generic Cim17 package
    //public static final String cimURI = CimPackage.eNS_URI;
    public static final String cimURI = "http://iec.ch/TC57/2016/CIM-schema-cim17";
    public static final String cimURISharp = cimURI + "#";
}
