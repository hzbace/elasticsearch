package com.qfedu.elasticsearch.service.serviceimpl;

import com.qfedu.elasticsearch.dao.MarkDao;
import com.qfedu.elasticsearch.pojo.Mark;
import com.qfedu.elasticsearch.service.MarkService;
import com.qfedu.elasticsearch.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MarkServiceImpl implements MarkService {
    @Autowired
    private MarkDao dao;

    @Override
    public ResultVo save(Mark mark) {

        return ResultVo.setOK(dao.save(mark));
    }

    @Override
    public ResultVo saveBatch(List<Mark> list) {
        for (Mark m:list) {
            dao.save(m);
        }
        return ResultVo.setOK(null);
    }

    @Override
    public ResultVo del(String usernum) {
        List<Mark> list = dao.queryByUsernum(usernum);
        for (Mark m :list) {
            dao.delete(m);
        }



        return ResultVo.setOK(null);
    }

    @Override
    public ResultVo searchMarkByNum(String usernum) {
        List<Mark> list = dao.queryByUsernum(usernum);

        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo searchMarkByName(String username) {
        List<Mark> list = dao.queryByUsername(username);
        return ResultVo.setOK(list);
    }
}
