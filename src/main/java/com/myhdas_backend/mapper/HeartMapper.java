package com.myhdas_backend.mapper;

import com.myhdas_backend.bean.Heart;

import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/


public interface HeartMapper {
    Heart queryId(int id);

    List<Heart> queryList(int count);

    List<Integer> queryResult(int count);
}
