package com.epam.training.app;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextDictionary {
    public Map<String, Integer> dictionary(String text) {
        Map<String, Integer> result = new HashMap<>();
        String[] array = text.replaceAll("[\\pP]", " ").replaceAll("\\s+", " ").toLowerCase().split(" ");
        Set<String> words = new HashSet<>(Arrays.asList(array));
        for (String word : words) {
            int count = 0;
            Pattern pattern = Pattern.compile("\\b" + word + "\\b", Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                count++;
            }
            result.put(word, count);
        }
        return result;
    }
}
