package com.lonikan.campgenie.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
@Component
public class FirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("FirstFilter");
        log.info("Request Local Name {}", request.getLocalName());
        log.info("Response Content Type {}", response.getContentType());
        chain.doFilter(request, response);
    }
}
