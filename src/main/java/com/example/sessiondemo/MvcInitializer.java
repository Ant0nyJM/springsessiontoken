package com.example.sessiondemo;

import com.example.sessiondemo.HttpSessionConfig;
import com.example.sessiondemo.SecurityConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Rob Winch
 */
public class MvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // tag::config[]
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SecurityConfig.class, HttpSessionConfig.class };
    }
    // end::config[]

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { MvcConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
