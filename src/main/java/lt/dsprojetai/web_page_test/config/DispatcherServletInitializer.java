package main.java.lt.dsprojetai.web_page_test.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebApplicationContextConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        // TODO Auto-generated method stub[
        return new String[] { "/app/" };
    }

}
