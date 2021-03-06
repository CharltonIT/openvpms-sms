/*
 *  Version: 1.0
 *
 *  The contents of this file are subject to the OpenVPMS License Version
 *  1.0 (the 'License'); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *  http://www.openvpms.org/license/
 *
 *  Software distributed under the License is distributed on an 'AS IS' basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 *  for the specific language governing rights and limitations under the
 *  License.
 *
 *  Copyright 2011 (C) OpenVPMS Ltd. All Rights Reserved.
 *
 *  $Id: $
 */

package org.openvpms.sms.mail;

import org.openvpms.archetype.test.ArchetypeServiceTest;
import org.openvpms.component.business.domain.im.common.Entity;
import org.openvpms.component.business.service.archetype.helper.IMObjectBean;

/**
 * Base class for SMS tests requiring the archetype service.
 *
 * @author <a href="mailto:support@openvpms.org">OpenVPMS Team</a>
 * @version $LastChangedDate: $
 */
public abstract class AbstractSMSTest extends ArchetypeServiceTest {

    /**
     * Creates an <em>entity.SMSConfigEmailGeneric</em>.
     *
     * @param from           the from address
     * @param fromExpression the 'from' address expression
     * @param to             the 'to' address
     * @param toExpression   the 'to' address expression
     * @param textExpression the text expression
     * @return a new configuration
     */
    protected Entity createConfig(String from, String fromExpression, String to, String toExpression,
                                  String textExpression) {
        Entity entity = (Entity) create(SMSArchetypes.GENERIC_SMS_EMAIL_CONFIG);
        IMObjectBean bean = new IMObjectBean(entity);
        bean.setValue("name", "Test");
        bean.setValue("from", from);
        bean.setValue("fromExpression", fromExpression);
        bean.setValue("to", to);
        bean.setValue("toExpression", toExpression);
        bean.setValue("textExpression", textExpression);
        return entity;
    }

}
