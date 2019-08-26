package com.elirex.fayeclient;

/**
 * @author Sheng-Yuan Wang (2015/9/7).
 */
public interface FayeServiceListener {
    void onMessageReceived(FayeClient fc, String msg);
    void onConnectedToServer(FayeClient fc);
}
