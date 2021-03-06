/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.lang.core.psi.ext

import org.rust.lang.core.psi.RsRefLikeType
import org.rust.lang.core.types.ty.Mutability

val RsRefLikeType.mutability: Mutability get() = Mutability.valueOf(greenStub?.isMut ?: (mut != null))
val RsRefLikeType.isRef: Boolean get() = greenStub?.isRef ?: (and != null)
val RsRefLikeType.isPointer: Boolean get() = greenStub?.isPointer ?: (mul != null)
