package com.zhang.converter;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 日期转换
 * @author thinkpad
 */
@Component
public class DateConverter implements Converter<String, LocalDate> {


    @Override
    public LocalDate convert(String source) {
        try {
            if(!StringUtils.isEmpty(source)){
                return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
