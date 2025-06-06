package com.mohammedsebaa;

public interface Module {
    void setMediator(CoworkingMediator mediator);

    void receiveEvent(String event);
}
