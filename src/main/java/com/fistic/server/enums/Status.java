package com.fistic.server.enums;

public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String serverStatus;

    Status(String serverStatus) {
        this.serverStatus = serverStatus;
    }

    public String getStatus() {
        return this.serverStatus;
    }
}
