package com.myhdas_backend.service.serviceImpl;

import com.myhdas_backend.bean.Tilt;
import com.myhdas_backend.mapper.TiltMapper;
import com.myhdas_backend.service.TiltService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public class TiltServiceImpl implements TiltService {

    @Resource
    private TiltMapper tiltMapper;

    @Override
    public Tilt queryId(int id) {
        return tiltMapper.queryId(id);
    }

    @Override
    public List<Tilt> queryList(int count) {
        return tiltMapper.queryList(count);
    }

    @Override
    public List<Integer> queryResult(int count) {
        return tiltMapper.queryResult(count);
    }
}
