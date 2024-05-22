package com.fistic.server.repo;

import com.fistic.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepo extends JpaRepository<Server, Long> {
    @Query(value = "select s from Server s where s.ipAddress= :ipAddress")
    Server findByIPAddress(@Param(value = "ipAddress") String ipAddress);
}
