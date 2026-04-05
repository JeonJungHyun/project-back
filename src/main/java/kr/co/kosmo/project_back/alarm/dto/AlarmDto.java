package kr.co.kosmo.project_back.alarm.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlarmDto {

    private Integer id;
    private Integer userId;
    private String type;
    private String message;

    private Boolean isRead;
    private LocalDateTime createdAt;
}
