package com.spring.mvc.chap05.dto.request;

import lombok.*;

import java.time.LocalDateTime;

@Setter @Getter @ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutoLoginDTO {

    private String sessionId;
    private LocalDateTime limitTime;
    private String account;
}
