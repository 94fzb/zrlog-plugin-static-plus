package com.zrlog.plugin.staticplus;

import com.zrlog.plugin.IOSession;
import com.zrlog.plugin.api.IPluginAction;
import com.zrlog.plugin.data.codec.HttpRequestInfo;
import com.zrlog.plugin.data.codec.MsgPacket;
import com.zrlog.plugin.staticplus.controller.StaticPlusController;

public class StaticPlusPluginAction implements IPluginAction {
    @Override
    public void start(IOSession ioSession, MsgPacket msgPacket) {

    }

    @Override
    public void stop(IOSession ioSession, MsgPacket msgPacket) {

    }

    @Override
    public void install(IOSession ioSession, MsgPacket msgPacket, HttpRequestInfo httpRequestInfo) {
        new StaticPlusController(ioSession, msgPacket, httpRequestInfo).index();
    }

    @Override
    public void uninstall(IOSession ioSession, MsgPacket msgPacket) {

    }
}
