package com.mohammedsebaa.chain_of_responsibility.service;

import com.mohammedsebaa.chain_of_responsibility.filter.*;
import com.mohammedsebaa.chain_of_responsibility.model.RequestData;
import org.springframework.stereotype.Service;

@Service
public class FilterChainService {
    private final RequestFilter firstFilter;

    public FilterChainService() {
        this.firstFilter = new AuthenticationFilter();
        RequestFilter authz = new AuthorizationFilter();
        RequestFilter priority = new PriorityFilter();
        firstFilter.setNext(authz).setNext(priority);
    }

    public void process(RequestData request) {
        firstFilter.processRequest(request);
    }
}
