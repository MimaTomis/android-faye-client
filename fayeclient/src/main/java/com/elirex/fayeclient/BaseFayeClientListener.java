package com.elirex.fayeclient;

import org.json.JSONObject;

abstract public class BaseFayeClientListener implements FayeClientListener {
    @Override
    public void onConnectedServer(FayeClient fc) {

    }

    @Override
    public void onDisconnectedServer(FayeClient fc) {

    }

    @Override
    public void onReceivedMessage(FayeClient fc, String msg) {

    }

    @Override
    public void onSubscribedError(FayeClient client, String channel, JSONObject message) {

    }

    @Override
    public void onConnectedServerError(FayeClient client, JSONObject message) {

    }
}
