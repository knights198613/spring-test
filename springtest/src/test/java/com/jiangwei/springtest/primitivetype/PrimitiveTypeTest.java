package com.jiangwei.springtest.primitivetype;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Franco on 2017/5/15.
 * 原始类型测试类
 */
public class PrimitiveTypeTest {

    @Test
    public void testPrimitiveType() {

        System.out.println(String[].class);
        System.out.println(int[].class);
        System.out.println(Integer[].class);
        System.out.println(int.class);
        System.out.println(short[].class);

        List<Class<?>> classesList = Arrays.asList(new Class<?>[] {
                boolean[].class, byte[].class, char[].class, double[].class,
                float[].class, int[].class, long[].class, short[].class});

        for(Class<?> clazz : classesList) {
            System.out.println("xunhuan:"+clazz);
        }

        final Map<String, Class<?>> primitiveTypeNameMap = new HashMap<String, Class<?>>(32);
        final Map<Class<?>, Class<?>> primitiveWrapperTypeMap = new HashMap<Class<?>, Class<?>>(8);
        final Map<Class<?>, Class<?>> primitiveTypeToWrapperMap = new HashMap<Class<?>, Class<?>>(8);

        primitiveWrapperTypeMap.put(Boolean.class, boolean.class);
        primitiveWrapperTypeMap.put(Byte.class, byte.class);
        primitiveWrapperTypeMap.put(Character.class, char.class);
        primitiveWrapperTypeMap.put(Double.class, double.class);
        primitiveWrapperTypeMap.put(Float.class, float.class);
        primitiveWrapperTypeMap.put(Integer.class, int.class);
        primitiveWrapperTypeMap.put(Long.class, long.class);
        primitiveWrapperTypeMap.put(Short.class, short.class);




    }
}
