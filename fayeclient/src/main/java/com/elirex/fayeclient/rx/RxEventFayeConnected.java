package com.elirex.fayeclient.rx;

import com.elirex.fayeclient.FayeClient;

public class RxEventFayeConnected extends RxEvent {
    public RxEventFayeConnected(FayeClient client) {
        super(client);
    }

    @Override
    public String toString() {
        return "Faye client is connected";
    }
}
