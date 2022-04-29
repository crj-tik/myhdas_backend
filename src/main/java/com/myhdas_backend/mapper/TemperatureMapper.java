package com.myhdas_backend.mapper;

import com.myhdas_backend.bean.Temperature;

import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/


public interface TemperatureMapper {
    Temperature queryId(int id);

    List<Temperature> queryList(int count);

    List<Integer> queryResult(int count);
}
