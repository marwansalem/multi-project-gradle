package com.marwansalem.maxirail.common.utils;

import java.util.List;

public class StringUtils {
    public static String buildFromList(List<String> strings) {
        if (strings.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        strings.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}
