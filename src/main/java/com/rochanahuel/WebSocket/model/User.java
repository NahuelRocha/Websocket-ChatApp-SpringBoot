package com.rochanahuel.WebSocket.model;

import com.rochanahuel.WebSocket.utils.Status;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@Document
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;
}
