package com.elirex.fayeclient.rx;

import com.elirex.fayeclient.FayeClient;

import org.json.JSONObject;

public class RxEventSubscribedError extends RxEvent {
    private final String mChannel;
    private final JSONObject mMessage;

    public RxEventSubscribedError(FayeClient client, String channel, JSONObject message) {
        super(client);
        this.mChannel = channel;
        this.mMessage = message;
    }

    @Override
    public String toString() {
        return "Subscribe to server error";
    }
}
