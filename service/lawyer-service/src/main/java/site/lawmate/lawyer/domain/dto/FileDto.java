package site.lawmate.lawyer.domain.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FileDto {
    private String id;
    private String filename;
    private String contentType;
    private byte[] data;
    private String lawyerId;
    LocalDateTime createdDate;
    LocalDateTime modifiedDate;
}
