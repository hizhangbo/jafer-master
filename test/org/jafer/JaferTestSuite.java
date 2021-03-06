/**
 * JAFER Toolkit Project. Copyright (C) 2002, JAFER Toolkit Project, Oxford
 * University. This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the License,
 * or (at your option) any later version. This library is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See
 * the GNU Lesser General Public License for more details. You should have
 * received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.jafer;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.jafer.databeans.JaferDataBeansTestSuite;
import org.jafer.query.QueryBuilderTest;
import org.jafer.query.converter.CQLQueryConverterTest;
import org.jafer.query.converter.JaferQueryConverterTest;
import org.jafer.query.converter.RPNQueryConverterTest;
import org.jafer.registry.uddi.UDDITestSuite;
import org.jafer.sru.SRUroSRWBridgeTestSuite;
import org.jafer.zclient.ZClientTestSuite;

/**
 * This class runs the entire JAFER test suite.
 */
public class JaferTestSuite
{

    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(JaferTestSuite.suite());
    }

    public static Test suite()
    {

        TestSuite suite = new TestSuite("Test for org.jafer");
        //$JUnit-BEGIN$
        suite.addTestSuite(QueryBuilderTest.class);
        suite.addTestSuite(JaferQueryConverterTest.class);
        suite.addTestSuite(CQLQueryConverterTest.class);
        suite.addTestSuite(RPNQueryConverterTest.class);
        suite.addTestSuite(ZClientTestSuite.class);
        suite.addTestSuite(SRUroSRWBridgeTestSuite.class);
        suite.addTestSuite(UDDITestSuite.class);
        suite.addTestSuite(JaferDataBeansTestSuite.class);
        //$JUnit-END$
        return suite;
    }
}

/**
 * Tests the FUNC_TESTED functionality by:
 * <UL>
 * <li>
 * <li>
 * <li>
 * <li>
 * <li>
 * <li>
 * </UL>
 */
