package com.lzj.controller;

import com.lzj.ControllerApplication;
import com.lzj.entity.Person;
import com.lzj.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: dell
 * @Date： 2019/12/4 17:43
 */

@Slf4j
@Controller
public class PersonController {

    @Reference
    IPersonService personService;

    @ResponseBody
    @GetMapping("/person")
    public Person getPersonService() {
        return personService.getPerson();
    }
}
