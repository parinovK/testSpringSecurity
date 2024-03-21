package ru.parinov.testSpringSecurity.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApplicationEntity {
    private Long id;
    private String name;
    private String author;
    private String version;
}
