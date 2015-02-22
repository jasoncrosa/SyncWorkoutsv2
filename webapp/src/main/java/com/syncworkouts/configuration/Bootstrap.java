package com.syncworkouts.configuration;

import com.wordnik.swagger.jaxrs.config.BeanConfig;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

/**
 * Created by Jason on 21/02/2015.
 */
public class Bootstrap extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setBasePath("http://localhost:8080/rest");
        beanConfig.setResourcePackage("io.swagger.resources");
        //beanConfig.setScan(true);
    }

}
