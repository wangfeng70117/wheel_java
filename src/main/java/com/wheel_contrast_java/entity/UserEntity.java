package com.wheel_contrast_java.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author wangfeng
 * @version 1.0
 * @description: TODO
 * @date 2023/6/28 11:34
 */

@Setter
@Getter
@Entity
@Table(name = "user")
@ApiModel(value = "用户信息", description = "用户信息")
public class UserEntity {
    @Id
    @GenericGenerator(name = "autoId", strategy = "native")
    @GeneratedValue(generator = "autoId")
    private Integer id;

    private String userName;

    private String password;

    private String email;

    private String phone;

    private String address;

    private Integer roleId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("创建日期")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("更新日期")
    private Date updateTime;

    private Boolean isDelete;
}
