package com.wheel_contrast_java.service.impl;

import com.wheel_contrast_java.entity.LogEntity;
import com.wheel_contrast_java.param.LogCreateParam;
import com.wheel_contrast_java.repository.LogRepository;
import com.wheel_contrast_java.service.inter.ILogService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * @author wangfeng
 * @version 1.0
 * @description: TODO
 * @date 2023/6/28 11:45
 */
@Service
public class LogService implements ILogService {
    @Autowired
    private LogRepository logRepository;

    @Override
    @Transactional
    public void createLog(LogCreateParam param) {
        LogEntity logEntity = new LogEntity();
        //这个方法可以将两个类中同名字段复制过去
        BeanUtils.copyProperties(param, logEntity);
        Date date = new Date();
        logEntity.setCreateTime(date);
        logEntity.setUpdateTime(date);
        logEntity.setIsDelete(false);
        logRepository.save(logEntity);
    }

    @Override
    public List<LogEntity> getAllLog() {
        return logRepository.findAll();
    }

    @Override
    public List<LogEntity> getAllByUserId(Integer userId) {
        return logRepository.findAllByUserIdAndIsDeleteFalse(userId);
    }

    @Override
    public LogEntity getLogById(Integer id) {
        return logRepository.findByIdAndIsDeleteFalse(id);
    }

    @Transactional
    @Override
    public void updateLog(LogCreateParam param) {
        LogEntity logEntity = logRepository.findByIdAndIsDeleteFalse(param.getId());
        logEntity.setLogName(param.getLogName());
        logEntity.setDescription(param.getDescription());
        logEntity.setUserName(param.getUserName());
        logEntity.setUserId(param.getUserId());
        logEntity.setUpdateTime(new Date());
    }

    @Override
    @Transactional
    public void deleteLog(Integer id) {
        logRepository.deleteLog(id);
    }
}
