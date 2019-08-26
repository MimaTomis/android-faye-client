package com.elirex.fayeclient;

import org.json.JSONObject;

public interface FayeClientErrorListener {
    /**
     * Subscribe to channel error
     *
     * @param client
     * @param channel
     * @param message
     */
    void onSubscribedError(FayeClient client, String channel, JSONObject message);

    /**
     * Connect to server error
     *
     * @param client
     * @param message
     */
    void onConnectedServerError(FayeClient client, JSONObject message);
}
