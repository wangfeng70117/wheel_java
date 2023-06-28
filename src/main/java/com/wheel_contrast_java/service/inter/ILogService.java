package com.wheel_contrast_java.service.inter;

import com.wheel_contrast_java.entity.LogEntity;
import com.wheel_contrast_java.param.LogCreateParam;

import java.util.List;

/**
 * @author wangfeng
 * @version 1.0
 * @description: TODO
 * @date 2023/6/28 11:45
 */
public interface ILogService {
    //添加操作日志
    void createLog(LogCreateParam param);

    List<LogEntity> getAllLog();

    List<LogEntity> getAllByUserId(Integer userId);

    LogEntity getLogById(Integer id);

    void updateLog(LogCreateParam param);

    void deleteLog(Integer id);
}
