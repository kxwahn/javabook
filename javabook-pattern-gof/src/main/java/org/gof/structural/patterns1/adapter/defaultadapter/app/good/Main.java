package org.gof.structural.patterns1.adapter.defaultadapter.app.good;

import org.gof.structural.patterns1.adapter.defaultadapter.listener.api.IEventListener;
import org.gof.structural.patterns1.adapter.defaultadapter.listener.impl.OnClickEventListener2;

public class Main {
    public static void main(String[] args) {
        IEventListener eventListener = new OnClickEventListener2();
    }
}
