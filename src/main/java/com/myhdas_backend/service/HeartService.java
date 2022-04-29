package com.myhdas_backend.service;

import com.myhdas_backend.bean.Heart;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CRJHeartService
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public interface HeartService {

    Heart queryId(int id);

    List<Heart> queryList(int count);

    List<Integer> queryResult(int count);
}
