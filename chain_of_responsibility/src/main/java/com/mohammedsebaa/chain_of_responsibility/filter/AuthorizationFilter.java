package com.mohammedsebaa.chain_of_responsibility.filter;

import com.mohammedsebaa.chain_of_responsibility.model.RequestData;

public class AuthorizationFilter implements RequestFilter {
    private RequestFilter next;

    @Override
    public RequestFilter setNext(RequestFilter next) {
        this.next = next;
        return next;
    }

    @Override
    public void processRequest(RequestData request) {
        // Pour la démo, on autorise seulement l'action "READ" sur la ressource "users"
        if (!("users".equals(request.getResource()) && "READ".equals(request.getAction()))) {
            request.setProcessed(false);
            request.setErrorMessage("Action ou ressource non autorisée.");
            return;
        }
        if (next != null)
            next.processRequest(request);
    }
}
