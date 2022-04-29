package com.myhdas_backend.service;

import com.myhdas_backend.bean.Light;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CRJLightService
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public interface LightService {

    Light queryId(int id);

    List<Light> queryList(int count);

    List<Integer> queryResult(int count);
}
