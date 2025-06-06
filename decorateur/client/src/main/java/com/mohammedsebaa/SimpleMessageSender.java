package com.mohammedsebaa;

public class SimpleMessageSender implements MessageSender {
    @Override
    public String decorate(String message) {
        return message;
    }
}
