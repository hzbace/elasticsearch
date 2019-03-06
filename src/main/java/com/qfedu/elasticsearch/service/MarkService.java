package com.qfedu.elasticsearch.service;

import com.qfedu.elasticsearch.pojo.Mark;
import com.qfedu.elasticsearch.vo.ResultVo;

import java.util.List;

public interface MarkService {
    //添加一条
    ResultVo save(Mark mark);
    //批量添加
    ResultVo saveBatch(List<Mark> list);
    //删除一个学生的全部成绩
    ResultVo del(String usernum);
    //通过学号查询成绩
    ResultVo searchMarkByNum(String usernum);
    //通过用户真实姓名查询成绩
    ResultVo searchMarkByName(String username);


}
