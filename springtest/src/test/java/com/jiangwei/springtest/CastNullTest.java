package com.jiangwei.springtest;

import com.jiangwei.springtest.bean.Person;
import org.junit.Test;

import java.util.Calendar;

/**
 * Created by weijiang
 * Date: 2017/3/6
 * Desc:
 */
public class CastNullTest {

    @Test
    public void castNull() {
        Person p = null;
        System.out.println((Person)p);
    }

    @Test
    public void testdate() {
        Calendar current = Calendar.getInstance();
        System.out.println(current.getTime());

        current.add(Calendar.HOUR, 24);
        System.out.println(current.getTime());
    }
}
