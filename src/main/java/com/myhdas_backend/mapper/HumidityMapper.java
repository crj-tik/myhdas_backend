package com.myhdas_backend.mapper;

import com.myhdas_backend.bean.Humidity;

import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/


public interface HumidityMapper {
    Humidity queryId(int id);

    List<Humidity> queryList(int count);

    List<Integer> queryResult(int count);
}
