/* 
 * Copyright (c) 2015, Matthew Lohbihler
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.brickhouse.json;

import org.brickhouse.datatype.HReference;
import org.brickhouse.datatype.HValue;

import com.serotonin.json.JsonException;

public class HReferenceDBConverter extends HValueConverter {
    public static final char CODE = 'r';

    @Override
    protected char getTypeCode() {
        return CODE;
    }

    @Override
    protected String toString(Object value) {
        return ((HReference) value).getId();
    }

    @Override
    protected HValue fromString(String value) throws JsonException {
        return new HReference(value);
    }
}
