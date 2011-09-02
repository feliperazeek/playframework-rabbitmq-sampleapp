/** 
 * Copyright 2011 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author Felipe Oliveira (http://mashup.fm)
 * 
 */
package models;

import java.io.Serializable;

/**
 * The Class SampleMessage.
 * 
 * @author Felipe Oliveira (http://geeks.aretotally.in)
 */
public class SampleMessage implements Serializable {

	/** The field1. */
	private String field1;

	/** The field2. */
	private String field2;

	/**
	 * Instantiates a new sample message.
	 */
	public SampleMessage() {

	}

	/**
	 * Instantiates a new sample message.
	 * 
	 * @param field1
	 *            the field1
	 * @param field2
	 *            the field2
	 */
	public SampleMessage(String field1, String field2) {
		super();
		this.field1 = field1;
		this.field2 = field2;
	}

	/**
	 * Gets the field1.
	 * 
	 * @return the field1
	 */
	public String getField1() {
		return this.field1;
	}

	/**
	 * Sets the field1.
	 * 
	 * @param field1
	 *            the new field1
	 */
	public void setField1(String field1) {
		this.field1 = field1;
	}

	/**
	 * Gets the field2.
	 * 
	 * @return the field2
	 */
	public String getField2() {
		return this.field2;
	}

	/**
	 * Sets the field2.
	 * 
	 * @param field2
	 *            the new field2
	 */
	public void setField2(String field2) {
		this.field2 = field2;
	}

	/**
	 * To String
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SampleMessage [field1=" + this.field1 + ", field2=" + this.field2 + "]";
	}

}
