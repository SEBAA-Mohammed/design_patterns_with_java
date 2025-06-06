package com.mohammedsebaa.chain_of_responsibility.filter;

import com.mohammedsebaa.chain_of_responsibility.model.RequestData;

public class AuthenticationFilter implements RequestFilter {
    private RequestFilter next;

    @Override
    public RequestFilter setNext(RequestFilter next) {
        this.next = next;
        return next;
    }

    @Override
    public void processRequest(RequestData request) {
        if (!request.isAuthenticated()) {
            request.setProcessed(false);
            request.setErrorMessage("Utilisateur non authentifié.");
            return;
        }
        if (next != null)
            next.processRequest(request);
    }
}
