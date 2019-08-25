package com.elirex.fayeclient.rx;

import com.elirex.fayeclient.FayeClient;

public class RxEventFayeSubscribed extends RxEvent {
    private final String mChannel;

    public RxEventFayeSubscribed(FayeClient client, String channel) {
        super(client);
        mChannel = channel;
    }

    @Override
    public String toString() {
        return "Faye client is subscribed to channel";
    }
}
