package com.rochanahuel.WebSocket.service;

import com.rochanahuel.WebSocket.model.User;
import com.rochanahuel.WebSocket.repository.UserRepository;
import com.rochanahuel.WebSocket.utils.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void saveUser(User user){
        user.setStatus(Status.ONLINE);
        repository.save(user);
    }

    public void disconnect(User user){
        var storedUser = repository.findById(user.getNickName())
                .orElse(null);
        if (storedUser != null){
            storedUser.setStatus(Status.OFFLINE);
            repository.save(storedUser);
        }
    }

    public List<User> findConnectUsers(){
        return repository.findAllByStatus(Status.ONLINE);
    }
}
