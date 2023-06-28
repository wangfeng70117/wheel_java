package com.wheel_contrast_java.controller;

import com.wheel_contrast_java.entity.LogEntity;
import com.wheel_contrast_java.param.LogCreateParam;
import com.wheel_contrast_java.service.inter.ILogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangfeng
 * @version 1.0
 * @description: TODO
 * @date 2023/6/28 15:29
 */
@RestController
@RequestMapping("/wheel_contrast/log")
@Api(value = "LogController", tags = "日志信息处理接口", description = "日志信息处理接口")
public class LogController {
    @Autowired
    private ILogService logService;

    @ApiOperation(value = "新增操作日志")
    @PostMapping("/createLog")
    public void createLog(@RequestBody LogCreateParam param){
        logService.createLog(param);
    }

    @ApiOperation(value = "修改操作日志")
    @PostMapping("/updateLog")
    public void updateLog(@RequestBody LogCreateParam param){
        logService.updateLog(param);
    }

    @ApiOperation(value = "查询操作日志")
    @GetMapping("/getLog")
    public List<LogEntity> getAllLog(){
        return logService.getAllLog();
    }

    @ApiOperation(value = "根据操作人id查询记录")
    @GetMapping("/getLogByUserId/{id}")
    public List<LogEntity> getAllByUserId(@PathVariable Integer id){
        return logService.getAllByUserId(id);
    }

    @ApiOperation(value = "根据记录id查询")
    @GetMapping("/getLogById/{id}")
    public LogEntity getLogById(@PathVariable Integer id){
        return logService.getLogById(id);
    }

    @ApiOperation(value = "根据记录id删除")
    @GetMapping("/deleteLog/{id}")
    public void deleteLog(@PathVariable Integer id){
        logService.deleteLog(id);
    }
}
