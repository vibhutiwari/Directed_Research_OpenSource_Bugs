/**
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */
package org.apache.kerby.kerberos.kerb.type;

import org.apache.kerby.asn1.type.Asn1Integer;

import java.util.ArrayList;
import java.util.List;

public class KrbIntegers extends KrbSequenceOfType<Asn1Integer> {

    public KrbIntegers() {
        super();
    }

    public KrbIntegers(List<Integer> values) {
        super();
        setValues(values);
    }

    public void setValues(List<Integer> values) {
        clear();
        if (values != null) {
            for (Integer value : values) {
                addElement(new Asn1Integer(value));
            }
        }
    }

    public List<Integer> getValues() {
        List<Integer> results = new ArrayList<Integer>();
        for (Asn1Integer value : getElements()) {
            results.add(value.getValue().intValue());
        }
        return results;
    }
}
