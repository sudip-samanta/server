package com.fistic.server.service;

import com.fistic.server.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    public Server create(Server server);
    public Server pingServer(String ipAddress) throws IOException;
    public Collection<Server> listOfServers(int limit);
    public Server getServer(Long id);
    public Server updateServer(Server server);
    public Boolean deleteServer(Long id);
}
