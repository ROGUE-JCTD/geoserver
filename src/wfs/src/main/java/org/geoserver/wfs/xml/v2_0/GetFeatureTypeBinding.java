/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.wfs.xml.v2_0;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import net.opengis.wfs20.Wfs20Factory;
import org.geoserver.wfs.xml.SqlViewParamsExtractor;
import org.geotools.xml.ElementInstance;
import org.geotools.xml.Node;
import org.geotools.wfs.v2_0.WFS;
import org.geotools.xml.ComplexEMFBinding;

/**
 * Custom binding class to support viewParams attribute in GetFeatureType requests
 */
public class GetFeatureTypeBinding extends ComplexEMFBinding {

    NamespaceContext namespaceContext;

    public GetFeatureTypeBinding(NamespaceContext namespaceContext) {
        super(Wfs20Factory.eINSTANCE, WFS.QueryType);
        this.namespaceContext = namespaceContext;
    }

    public QName getTarget() {
        return WFS.GetFeatureType;
    }

    public Object parse(ElementInstance instance, Node node, Object value) throws Exception {
        SqlViewParamsExtractor.fixNodeObject(node);
        return super.parse(instance, node, value);
    }
}
