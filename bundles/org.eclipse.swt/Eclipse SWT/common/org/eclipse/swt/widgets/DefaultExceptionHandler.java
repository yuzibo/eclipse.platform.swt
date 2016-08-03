/*******************************************************************************
 * Copyright (c) 2016 Google Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Stefan Xenos (Google) - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.widgets;

import java.util.function.*;

class DefaultExceptionHandler {

static final Consumer<RuntimeException> RUNTIME_EXCEPTION_HANDLER = exception -> {
	throw exception;
};

static final Consumer<Error> RUNTIME_ERROR_HANDLER = error -> {
	throw error;
};

}
