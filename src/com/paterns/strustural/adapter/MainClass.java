package com.paterns.strustural.adapter;

public class MainClass {
    public static void main(String[] args) {
        UKElectricalSocket ukSocket = new UKElectricalSocket();
        GermanPlugConnector germanPlug = new GermanPlugConnector() {
            @Override
            public void giveElectricity() {
            }
        };
        GermanToUKPlugConnectorAdapter adapter = new GermanToUKPlugConnectorAdapter(germanPlug);
        ukSocket.plugin(adapter);
    }
}
