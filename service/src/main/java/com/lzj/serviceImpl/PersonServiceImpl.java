package com.lzj.serviceImpl;

import com.lzj.entity.Person;
import com.lzj.service.IPersonService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Description:
 * @Author: dell
 * @Date： 2019/12/4 17:41
 */

@Service
public class PersonServiceImpl implements IPersonService {

    @Override
    public Person getPerson() {
        return new Person("LIZIJIAN",28);
    }
}
