package com.wheel_contrast_java.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author wangfeng
 * @version 1.0
 * @description: TODO
 * @date 2023/6/28 11:29
 */

@Setter
@Getter
@Entity
@Table(name = "role")
@ApiModel(value = "角色信息", description = "角色信息")
public class RoleEntity {
    @Id
    @GenericGenerator(name = "autoId", strategy = "native")
    @GeneratedValue(generator = "autoId")
    private Integer id;

    @ApiModelProperty("角色名")
    private String roleName;
}
