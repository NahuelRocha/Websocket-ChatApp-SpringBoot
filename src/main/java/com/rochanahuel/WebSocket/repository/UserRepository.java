package com.rochanahuel.WebSocket.repository;

import com.rochanahuel.WebSocket.model.User;
import com.rochanahuel.WebSocket.utils.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    List<User> findAllByStatus(Status status);
}
