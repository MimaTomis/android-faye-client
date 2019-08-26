package com.elirex.fayeclient.rx;

import com.elirex.fayeclient.FayeClient;

import org.json.JSONObject;

public class RxEventConnectedError extends RxEvent {
    private final JSONObject mMessage;

    public RxEventConnectedError(FayeClient client, JSONObject message) {
        super(client);
        mMessage = message;
    }

    @Override
    public String toString() {
        return "Connect to server error";
    }
}
