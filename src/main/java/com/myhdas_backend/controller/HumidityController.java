package com.myhdas_backend.controller;

import com.myhdas_backend.bean.Humidity;
import com.myhdas_backend.service.HumidityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.29/2022/4/29
 **/

@Controller
@RequestMapping("/humidity")
public class HumidityController {

    @Resource
    private HumidityService humidityService;

    @RequestMapping("/queryId")
    public Humidity queryId(int id){
        return humidityService.queryId(id);
    }

    @RequestMapping("/queryList")
    public List<Humidity> queryList(int count){
        return humidityService.queryList(count);
    }

    @RequestMapping("/queryResult")
    public List<Integer> queryResult(int count){
        return humidityService.queryResult(count);
    }
}
