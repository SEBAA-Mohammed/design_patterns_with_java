package com.mohammedsebaa;

public class UpperCaseDecorator implements MessageSender {
    private MessageSender wrappee;

    public UpperCaseDecorator(MessageSender wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String decorate(String message) {
        return wrappee.decorate(message).toUpperCase();
    }
}
