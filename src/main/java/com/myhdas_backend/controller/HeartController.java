package com.myhdas_backend.controller;

import com.myhdas_backend.bean.Heart;
import com.myhdas_backend.service.HeartService;
import com.myhdas_backend.service.serviceImpl.HeartServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.29/2022/4/29
 **/

@Controller
@RequestMapping("/heart")
public class HeartController {

    @Resource
    private HeartService heartService;

    @RequestMapping("/queryId")
    public Heart queryId(int id){
        return heartService.queryId(id);
    }

    @RequestMapping("/queryList")
    public List<Heart> queryList(int count){
        return heartService.queryList(count);
    }

    @RequestMapping("/queryResult")
    public List<Integer> queryResult(int count){
        return heartService.queryResult(count);
    }
}
