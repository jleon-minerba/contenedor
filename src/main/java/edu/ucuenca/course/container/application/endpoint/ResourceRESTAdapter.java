package edu.ucuenca.course.container.application.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@RequestMapping("ucuenca/rest")
public class ResourceRESTAdapter {
    
   @Autowired
   protected HttpServletRequest request;
}
