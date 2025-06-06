package com.mohammedsebaa.chain_of_responsibility.filter;

import com.mohammedsebaa.chain_of_responsibility.model.RequestData;

public class PriorityFilter implements RequestFilter {
    private RequestFilter next;

    @Override
    public RequestFilter setNext(RequestFilter next) {
        this.next = next;
        return next;
    }

    @Override
    public void processRequest(RequestData request) {
        if (request.getPriority() <= 0) {
            request.setProcessed(false);
            request.setErrorMessage("Priorité invalide. Elle doit être supérieure à 0.");
            return;
        }
        request.setProcessed(true);
        request.setErrorMessage(null);
        // Fin de la chaîne, pas d'appel à next
    }
}
