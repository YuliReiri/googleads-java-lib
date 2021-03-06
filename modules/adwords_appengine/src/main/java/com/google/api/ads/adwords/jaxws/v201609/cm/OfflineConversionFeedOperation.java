// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201609.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Operation for uploading {@link OfflineConversionFeed}.
 *             See {@link OfflineConversionFeedService#mutate}
 *           
 * 
 * <p>Java class for OfflineConversionFeedOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineConversionFeedOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201609}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201609}OfflineConversionFeed" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineConversionFeedOperation", propOrder = {
    "operand"
})
public class OfflineConversionFeedOperation
    extends Operation
{

    protected OfflineConversionFeed operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineConversionFeed }
     *     
     */
    public OfflineConversionFeed getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineConversionFeed }
     *     
     */
    public void setOperand(OfflineConversionFeed value) {
        this.operand = value;
    }

}
