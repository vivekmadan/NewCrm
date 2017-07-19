package com.ibm.newcrm.controller;

import com.ibm.newcrm.entity.CircleMapping;
import com.ibm.newcrm.repository.CircleMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VivekMadan on 20-06-2017.
 */
@RestController
public class CircleMappingController {

    @Autowired
    private CircleMappingRepository circleMappingRepository;

    @RequestMapping("/circleMapping")
    public @ResponseBody Iterable<CircleMapping> getAllCircleMapping()
    {
        return circleMappingRepository.findAll();
    }
}
