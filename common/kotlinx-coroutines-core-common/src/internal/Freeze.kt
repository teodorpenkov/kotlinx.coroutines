/*
 * Copyright 2016-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.internal

internal expect fun Any.ensureNeverFrozen()
internal expect fun <T> T.freeze(): T