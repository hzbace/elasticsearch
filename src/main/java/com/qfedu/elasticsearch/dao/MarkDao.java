package com.qfedu.elasticsearch.dao;

import com.qfedu.elasticsearch.pojo.Mark;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.List;

public interface MarkDao extends ElasticsearchCrudRepository<Mark,Integer> {
    List<Mark> queryByUsernum(String usernum);
    List<Mark> queryByUsername(String username);
}
