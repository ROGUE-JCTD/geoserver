/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.ows;



public class MessageKvpParser extends KvpParser {
    public MessageKvpParser() {
        super("message", Message.class);
    }

    public Object parse(String value) throws Exception {
        return new Message(value);
    }
}
