/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cyberiantiger.minecraft.instances.util;

import org.apache.commons.lang.time.DurationFormatUtils;

/**
 *
 * @author antony
 */
public class TimeUtil {

    public static String format(long time) {
        return DurationFormatUtils.formatDurationHMS(time * 50);
    }

}
