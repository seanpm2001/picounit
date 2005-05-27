/*****************************************************************************
 * Copyright (C) Stacy Curl. All rights reserved.                            *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the LICENSE.txt file.                                                     *
 *****************************************************************************/
package picounit.kissing;

public class Girl {
	private final Kissable kissable;

	public Girl(Kissable kissable) {
		this.kissable = kissable;
	}
	
	public String kiss() {
		return kissable.kiss();
//		return "not kissed";
	}
}
