/*
 * Copyright 2015 Bill Davidson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kopitubruk.util.json;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * MBean interface for JSONConfigDefaults to expose its methods to view and
 * modify the defaults at run time when this library is used with a MBean
 * server.
 *
 * @author Bill Davidson
 */
public interface JSONConfigDefaultsMBean
{
    /**
     * Reset all defaults to their original unmodified values.  This
     * overrides JNDI and previous MBean changes.
     */
    public void setCodeDefaults();

    /**
     * Set the default locale for new JSONConfig objects to use.
     *
     * @param loc A language tag suitable for use by {@link Locale#forLanguageTag(String)}.
     */
    public void setLocale( String loc );

    /**
     * Clear any default number formats.
     */
    public void clearNumberFormats();

    /**
     * Set the date format used for date string generation.
     *
     * @param fmtStr passed to the constructor for {@link SimpleDateFormat#SimpleDateFormat(String)}
     * @return The format that is created.
     */
    public DateFormat setDateGenFormat( String fmtStr );

    /**
     * Clear date generation format.
     */
    public void clearDateGenFormat();

    /**
     * Add a date parsing format to the list of date parsing formats.
     *
     * @param fmt Passed to {@link SimpleDateFormat#SimpleDateFormat(String,Locale)}.
     * @return The format that gets created.
     */
    public DateFormat addDateParseFormat( String fmt );

    /**
     * Clear any date parse formats.
     */
    public void clearDateParseFormats();

    /**
     * Get the default validate property names policy.
     *
     * @return The default validate property names policy.
     */
    public boolean isValidatePropertyNames();

    /**
     * Set the default flag for validation of property names.
     * This will affect all new JSONConfig objects created after this call
     * within the same class loader.
     *
     * @param dflt If true, then property names will be validated by default.
     */
    public void setValidatePropertyNames( boolean dflt );

    /**
     * Get the default detect data structure loops policy.
     *
     * @return The default detect data structure loops policy.
     */
    public boolean isDetectDataStructureLoops();

    /**
     * Set the default flag for forcing quotes on identifiers.
     * This will affect all new JSONConfig objects created after this call
     * within the same class loader.
     *
     * @param dflt If true, then all identifiers will be quoted.
     */
    public void setDetectDataStructureLoops( boolean dflt );

    /**
     * Get the default escape bad identifier code points policy.
     *
     * @return The default escape bad identifier code points policy.
     */
    public boolean isEscapeBadIdentifierCodePoints();

    /**
     * If true, then any bad code points in identifiers will be quoted.
     * Default is false.
     *
     * @param dflt the escapeBadIdentifierCodePoints to set
     */
    public void setEscapeBadIdentifierCodePoints( boolean dflt );

    /**
     * Get the default encode numeric strings as numbers policy.
     *
     * @return The default encode numeric strings as numbers policy.
     */
    public boolean isEncodeNumericStringsAsNumbers();

    /**
     * Set the default flag for encoding of numeric strings as numbers.
     * This will affect all new JSONConfig objects created after this call
     * within the same class loader.
     *
     * @param dflt If true, then strings that look like numbers will be encoded
     * as numbers.
     */
    public void setEncodeNumericStringsAsNumbers( boolean dflt );

    /**
     * Get the default quote non-ASCII policy.
     *
     * @return The default quote non-ASCII policy.
     */
    public boolean isEscapeNonAscii();

    /**
     * Set the default flag for forcing escaping of non-ASCII characters.
     * This will affect all new JSONConfig objects created after this call
     * within the same class loader.
     *
     * @param dflt If true, then all non-ASCII will be Unicode escaped.
     */
    public void setEscapeNonAscii( boolean dflt );

    /**
     * The default unEscape policy.
     *
     * @return the unEscape policy.
     */
    public boolean isUnEscapeWherePossible();

    /**
     * Set default flag for undoing inline escapes in strings.
     *
     * @param dflt If true then where possible, undo inline escapes in strings.
     */
    public void setUnEscapeWherePossible( boolean dflt );

    /**
     * @return the s_defaultEscapeSurrogates
     */
    public boolean isEscapeSurrogates();

    /**
     * @param dflt the defaultEscapeSurrogates to set
     */
    public void setEscapeSurrogates( boolean dflt );

    /**
     * Get the encode dates as strings policy.
     *
     * @return the encodeDatesAsStrings policy.
     */
    public boolean isEncodeDatesAsStrings();

    /**
     * If true, then {@link Date} objects will be encoded as
     * ISO 8601 date strings.
     *
     * @param dflt the encodeDatesAsStrings to set
     */
    public void setEncodeDatesAsStrings( boolean dflt );

    /**
     * Get the default quote identifier policy.
     *
     * @return The default quote identifier policy.
     */
    public boolean isQuoteIdentifier();

    /**
     * Set the default flag for forcing quotes on identifiers.
     * This will affect all new JSONConfig objects created after this call
     * within the same class loader.
     *
     * @param dflt If true, then all identifiers will be quoted.
     */
    public void setQuoteIdentifier( boolean dflt );

    /**
     * Get the default escape ECMAScript 6 policy.
     *
     * @return The default escape ECMAScript 6 policy.
     */
    public boolean isUseECMA6();

    /**
     * Set the default flag for using ECMAScript 6 code points to encode
     * Unicode escapes and allowing letter numbers in identifiers.
     *
     * @param dflt if true then ECMAScript 6 code points
     * will be used to encode Unicode escapes as needed and letter
     * numbers will be allowed in ID's.
     */
    public void setUseECMA6( boolean dflt );

    /**
     * Get the default for allowing reserved words in identifiers.
     *
     * @return the defaultAllowReservedWordsInIdentifiers
     */
    public boolean isAllowReservedWordsInIdentifiers();

    /**
     * Set default flag for allowing reserved words in identifiers.
     *
     * @param dflt the defaultAllowReservedWordsInIdentifiers to set
     */
    public void setAllowReservedWordsInIdentifiers( boolean dflt );

    /**
     * Get the encode dates policy.
     *
     * @return the encodeDatesAsObjects policy.
     */
    public boolean isEncodeDatesAsObjects();

    /**
     * If true, then {@link Date} objects will be encoded as
     * Javascript dates, using new Date().
     *
     * @param dflt the encodeDatesAsObjects to set
     */
    public void setEncodeDatesAsObjects( boolean dflt );
}
