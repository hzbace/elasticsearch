package com.qfedu.elasticsearch.Controller;

import com.qfedu.elasticsearch.pojo.Mark;
import com.qfedu.elasticsearch.service.MarkService;
import com.qfedu.elasticsearch.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "成绩的搜索",tags = "主页搜索相关操作")
public class MarkController {
    @Autowired
    private MarkService service;

    @PostMapping("addMark.do")
    @CrossOrigin
    @ApiOperation(value = "添加分数")
    public ResultVo addMark(Mark mark){
        return service.save(mark);
    }

    @PostMapping("addMarkBatch.do")
    @CrossOrigin
    @ApiOperation(value = "批量添加分数")
    public ResultVo addMarkBatch(List<Mark> list){
        return service.saveBatch(list);
    }

    @PostMapping("del.do")
    @CrossOrigin
    @ApiOperation(value = "删除一个学生的全部成绩，传入学生学号")
    public ResultVo delMark(String usernum){
        return service.del(usernum);
    }

    @PostMapping("selectByUsernum.do")
    @CrossOrigin
    @ApiOperation(value = "通过学号查询学生成绩，传入学生学号")
    public ResultVo selectStudentByUsernum(String usernum){
        return service.searchMarkByNum(usernum);
    }

    @PostMapping("selectByUsername.do")
    @CrossOrigin
    @ApiOperation(value = "通过用户真实姓名查询学生成绩，传入学生姓名")
    public ResultVo selectStudentByUsername(String username){
        return service.searchMarkByName(username);
    }

}
