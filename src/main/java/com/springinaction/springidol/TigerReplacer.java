package com.springinaction.springidol;

/**
 * Created by Vitek on 31.05.2015.
 */

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class TigerReplacer implements MethodReplacer
{

    public Object reimplement(Object target, Method method, // Подмена
                              Object[] args) throws Throwable
    { // метода
        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}

