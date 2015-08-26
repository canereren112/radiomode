package com.eren.radiomode.service.util;

import java.lang.reflect.Method;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.aop.ThrowsAdvice;

public final class LogThrowsAdvice implements ThrowsAdvice {

    private Log logger = LogFactory.getLog(this.getClass());

    public void afterThrowing(Method method, Object[] args,
            Object target, Exception ex) throws Throwable {
        logger.error("Intercepted exception of type ["
                + ex.getClass().getName()
                + "] thrown by target class ["
                + target.getClass().getName()
                + "] and method [" + method.toString() + "]");

        logger.error(getStackTrace(ex));

        // Rethrow the exception in case something else downstream can
        // handle it.
        throw ex;
    }

    private String getStackTrace(Exception ex) {
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);

            return sw.toString();
        } catch (Exception e) {
            return e.toString();
        }
    }
}
