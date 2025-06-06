package com.mohammedsebaa.chain_of_responsibility.filter;

import com.mohammedsebaa.chain_of_responsibility.model.RequestData;

public interface RequestFilter {
    RequestFilter setNext(RequestFilter next);

    void processRequest(RequestData request);
}
