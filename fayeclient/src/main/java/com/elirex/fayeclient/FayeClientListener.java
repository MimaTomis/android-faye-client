package com.elirex.fayeclient;

import org.json.JSONObject;

/**
 * @author Sheng-Yuan Wang (2015/9/7).
 */
public interface FayeClientListener {
    void onConnectedServer(FayeClient fc);
    void onDisconnectedServer(FayeClient fc);
    void onReceivedMessage(FayeClient fc, String msg);
    void onSubscribed(FayeClient client, String channel);
    void onUnsubscribed(FayeClient client, String channel);
    void onSubscribedError(FayeClient client, String channel, JSONObject message);
    void onConnectedServerError(FayeClient client, JSONObject message);
}
