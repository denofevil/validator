/*
 * Copyright (c) 2006 Henri Sivonen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
 * DEALINGS IN THE SOFTWARE.
 */

package nu.validator.datatype;

import java.util.regex.Pattern;

/**
 * This datatype shall accept strings that conform to the format specified for
 * <a href='http://whatwg.org/specs/web-forms/current-work/#datetime-local'><code>datetime-local</code></a>
 * inputs in Web Forms 2.0.
 * <p>
 * This datatype must not accept the empty string.
 * 
 * @version $Id$
 * @author hsivonen
 */
public final class DatetimeLocal extends AbstractDatetime {
    
    /**
     * The singleton instance.
     */
    public static final DatetimeLocal THE_INSTANCE = new DatetimeLocal();
    
    /**
     * The rexexp for this datatype.
     */
    private static final Pattern THE_PATTERN = Pattern.compile("^([0-9]{4,})-([0-9]{2})-([0-9]{2})[T ]([0-9]{2}):([0-9]{2})(?::([0-9]{2})(?:\\.[0-9]{1,3})?)?$");

    /**
     * Constructor.
     */
    private DatetimeLocal() {
        super();
    }
    
    /**
     * Returns the regexp for this datatype.
     * 
     * @return the regexp for this datatype
     * @see nu.validator.datatype.AbstractDatetime#getPattern()
     */
    protected Pattern getPattern() {
        return THE_PATTERN;
    }

    @Override
    public String getName() {
        return "local datetime";
    }
}
