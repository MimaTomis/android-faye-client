package com.elirex.fayeclient;

/**
 * @author Sheng-Yuan Wang (2015/9/7).
 */
public interface FayeClientListener {
    void onConnectedServer(FayeClient fc);
    void onDisconnectedServer(FayeClient fc);
    void onReceivedMessage(FayeClient fc, String msg);
    void onFayeConnected(FayeClient fc);
    void onFayeSubscribed(FayeClient fc, String channel);
}
