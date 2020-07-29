package me.nilme.exercise.java.base;

import org.apache.commons.lang3.time.DateFormatUtils;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author: 一令
 * @date: 2020-06-09 20:26
 */
public class DateTest {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a", Locale.ENGLISH);
        String format = sdf.format(new Date());

        System.out.println(format);
    }
}
