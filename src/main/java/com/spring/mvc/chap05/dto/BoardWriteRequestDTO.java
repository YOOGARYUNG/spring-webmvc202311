package com.spring.mvc.chap05.dto;

import lombok.*;
import org.springframework.stereotype.Service;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
public class BoardWriteRequestDTO {

    private String title;
    private String content;
}
