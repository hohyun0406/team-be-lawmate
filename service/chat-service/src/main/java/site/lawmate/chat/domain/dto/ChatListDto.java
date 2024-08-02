package site.lawmate.chat.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatListDto {
    private Long chattingRoomId;
    private String chatName;
    private LocalDateTime recentChat;
    private LocalDateTime oldestChatDate;
}