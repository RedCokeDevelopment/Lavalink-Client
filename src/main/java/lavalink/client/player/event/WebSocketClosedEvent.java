package lavalink.client.player.event;

import lavalink.client.player.IPlayer;

public class WebSocketClosedEvent extends PlayerEvent{
    private final int code;
    private final String reason;
    private final boolean remote;

    public WebSocketClosedEvent(IPlayer player, int code, String reason, boolean remote){
        super(player);
        this.code = code;
        this.reason = reason;
        this.remote = remote;
    }

    public int getCode() {
        return code;
    }

    public String getReason() {
        return reason;
    }

    public boolean isRemote() {
        return remote;
    }
}
