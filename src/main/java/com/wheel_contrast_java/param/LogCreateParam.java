package com.wheel_contrast_java.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wangfeng
 * @version 1.0
 * @description: TODO
 * @date 2023/6/28 15:05
 */
@Getter
@Setter
public class LogCreateParam {
    private Integer id;
    @ApiModelProperty(value = "进行的操作")
    private String logName;
    @ApiModelProperty(value = "日志描述")
    private String description;
    private Integer userId;
    private String userName;
    private String userMac;
}
