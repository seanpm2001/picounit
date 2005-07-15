/*****************************************************************************
 * Copyright (C) Stacy Curl. All rights reserved.                            *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the LICENSE.txt file.                                                     *
 *****************************************************************************/
package picounit.verify;

import picounit.verify.constraint.Evaluator;

public class DefaultByteConstraints extends ExtensibleByteConstraints implements ByteConstraints {
	public DefaultByteConstraints(Evaluator evaluator) {
		super(evaluator);
	}
	
	public ByteConstraintsDeltaKnown withDelta(byte delta) {
		setDelta(new Byte(delta));

		return this;
	}
}
