package com.stackroute.AutomaticAnswerSearchService.Repository;

import java.util.List;

public interface AASRepo {

    void save(List<com.stackroute.StackOverflowAdaptor.domain.Items> items);

    List<com.stackroute.StackOverflowAdaptor.domain.Items> findAll();


}
