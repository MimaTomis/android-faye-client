package com.elirex.fayeclient;

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
    public void onFayeConnected(FayeClient fc) {

    }

    @Override
    public void onFayeSubscribed(FayeClient fc, String channel) {

    }
}
