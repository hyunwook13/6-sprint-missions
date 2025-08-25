package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.Channel;

import java.util.List;
import java.util.UUID;

public interface ChannelRepository {
    Channel save(Channel channel);
    Channel findById(UUID id);
    List<Channel> findAll();
    boolean deleteById(UUID id);
    boolean existsById(UUID id);
    long count();
}