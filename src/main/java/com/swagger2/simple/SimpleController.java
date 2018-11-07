package com.swagger2.simple;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 64960 on 2018.10.22.
 */
@RestController
@RequestMapping("/simple")
@Api("Simple Controller for simple class demo")
public class SimpleController {

    @ApiOperation(value = "saySimple method for simple method demo")
    @RequestMapping(value = "/saySimple",method = RequestMethod.POST)
    public String saySimple(@ApiParam(name="simpleId",value = "simple value description",required=true)
                            @RequestParam("simpleId") String simpleId){
        return "saySimple...";
    }
}
