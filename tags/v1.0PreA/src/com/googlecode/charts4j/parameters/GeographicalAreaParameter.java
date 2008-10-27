/**
 *
 * The MIT License
 *
 * Copyright (c) 2008 the original author or authors.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.googlecode.charts4j.parameters;

import com.googlecode.charts4j.GeographicalArea;

/**
 * Class for building geographical parameter string for the Google Chart API.
 *
 * @author Julien Chastang (julien.c.chastang at gmail dot com)
 */
final class GeographicalAreaParameter implements Parameter {

    /** The Google Chart API geographical parameter. */
    private static final String    URL_PARAMETER_KEY = "chtm";

    /** The geographical area. */
    private final GeographicalArea geographicalArea;

    /**
     * Instantiates a new geographical area parameter.
     *
     * @param geographicalArea
     *            the geographical area
     */
    GeographicalAreaParameter(final GeographicalArea geographicalArea) {
        this.geographicalArea = geographicalArea;
    }

    /**
     * {@inheritDoc}
     */
    public String toURLParameterString() {
        return URL_PARAMETER_KEY + "=" + geographicalArea;
    }
}
