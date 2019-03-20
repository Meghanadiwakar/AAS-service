package com.stackroute.AutomaticAnswerSearchService.Repository;


import com.stackroute.AutomaticAnswerSearchService.model.Items;
import com.stackroute.AutomaticAnswerSearchService.model.Question;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AASRepoImpl implements AASRepo {

    private RedisTemplate<List<Items>, Items> redisTemplate;


    private HashOperations hashOperations;

    public AASRepoImpl(RedisTemplate<List<Items>, Items> redisTemplate) {
        this.redisTemplate = redisTemplate;

        hashOperations = redisTemplate.opsForHash();
    }


    @Override
    public void save(List<Question> question) {


        hashOperations.put("APPLE", question, question);


    }


    @Override
    public List<Question> findAll() {
        return hashOperations.values("APPLE");
    }


    @Override
    public List<Question> findById(long question_id) {
        return (List<Question>) hashOperations.get("ITEMS", question_id);
    }





}
