package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@AllArgsConstructor
public class LocalService {

    private final MessageSource messageSource;

    public String getValue(String key, String ... args) {

        // TODO GET LANGUAGE CODE FROM PRINCIPLE INFORMATION
        final String lang = "ar";

        return messageSource.getMessage(key, args, Locale.forLanguageTag(lang));
    }
}
