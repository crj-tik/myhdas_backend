package com.myhdas_backend.controller;

import com.myhdas_backend.bean.Tilt;
import com.myhdas_backend.service.TiltService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.29/2022/4/29
 **/

@Controller
@RequestMapping("/tilt")
public class TiltController {

    @Resource
    private TiltService tiltService;

    @RequestMapping("/queryId")
    public Tilt queryId(int id){
        return tiltService.queryId(id);
    }

    @RequestMapping("/queryList")
    public List<Tilt> queryList(int count){
        return tiltService.queryList(count);
    }

    @RequestMapping("/queryResult")
    public List<Integer> queryResult(int count){
        return tiltService.queryResult(count);
    }
}
