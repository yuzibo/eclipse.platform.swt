/*******************************************************************************
 * Copyright (c) 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.browser;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.events.*;

/**
 * A <code>ProgressEvent</code> is sent by a {@link Browser} to
 * {@link ProgressListener}'s when a progress is made during the
 * loading of the current URL or when the loading of the current
 * URL has been completed.
 * 
 * @since 3.0
 */
public class ProgressEvent extends TypedEvent {
	/** current value */
	public int current;
	/** total value */
	public int total;

ProgressEvent(Widget w) {
	super(w);
}
}