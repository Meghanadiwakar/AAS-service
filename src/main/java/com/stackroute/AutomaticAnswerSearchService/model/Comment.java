package com.stackroute.AutomaticAnswerSearchService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Comment implements Serializable {
    User user;
    List<Replies> replies;
    private String comment;
    private long timestamp;
    private long likes;
}
