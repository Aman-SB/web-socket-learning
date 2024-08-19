package com.aman.chat_web_socket_learning.Chat;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatNotification {

    private String id;
    private String senderId;
    private String recipientId;
    private String content;

}
