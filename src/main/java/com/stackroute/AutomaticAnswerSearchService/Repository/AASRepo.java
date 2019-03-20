package com.stackroute.AutomaticAnswerSearchService.Repository;

import com.stackroute.AutomaticAnswerSearchService.model.Question;

import java.util.List;

public interface AASRepo {

    void save(List<Question> question);

    List<Question> findAll();

    List<Question> findById(long question_id);



}
