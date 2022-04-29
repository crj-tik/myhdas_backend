package com.myhdas_backend.service.serviceImpl;

import com.myhdas_backend.bean.Humidity;
import com.myhdas_backend.mapper.HumidityMapper;
import com.myhdas_backend.service.HumidityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public class HumidityServiceImpl implements HumidityService {

    @Resource
    private HumidityMapper humidityMapper;

    @Override
    public Humidity queryId(int id) {
        return humidityMapper.queryId(id);
    }

    @Override
    public List<Humidity> queryList(int count) {
        return humidityMapper.queryList(count);
    }

    @Override
    public List<Integer> queryResult(int count) {
        return humidityMapper.queryResult(count);
    }
}
