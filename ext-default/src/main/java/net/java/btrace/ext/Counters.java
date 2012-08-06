/*
 * Copyright (c) 2007, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package net.java.btrace.ext;

import net.java.btrace.api.extensions.BTraceExtension;
import net.java.btrace.api.extensions.Runtime;
import javax.annotation.Resource;

/*
 * Wraps the jvmstat counters related BTrace utility methods
 * @since 1.3
 * @author Jaroslav Bachorik
 */
@BTraceExtension
public class Counters {
    @Resource
    private static Runtime ctx;
    /**
     * accessing jvmstat (perf) int counter
     */
    public static long perfInt(String name) {
        return ctx.getPerfReader().perfInt(name);
    }

    /**
     * accessing jvmstat (perf) long counter
     */
    public static long perfLong(String name) {
        return ctx.getPerfReader().perfLong(name);
    }

    /**
     * accessing jvmstat (perf) String counter
     */
    public static String perfString(String name) {
        return ctx.getPerfReader().perfString(name);
    }
}