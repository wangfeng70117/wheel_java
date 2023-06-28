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
 * @date 2023/6/28 10:53
 */

@Setter
@Getter
@Entity
@Table(name = "module")
@ApiModel(value = "模型信息", description = "模型信息")
public class ModuleEntity {
    @Id
    @GenericGenerator(name = "autoId", strategy = "native")
    @GeneratedValue(generator = "autoId")
    private Integer id;

    private String objId;

    @ApiModelProperty("轮径")
    private Double diameter;

    @ApiModelProperty("轮宽")
    private Double width;

    @ApiModelProperty("铸造工艺")
    private String craft;

    @ApiModelProperty("偏距")
    private Double et;

    @ApiModelProperty("螺栓孔数")
    private Integer bhq;

    @ApiModelProperty("PCD")
    private Double pcd;

    @ApiModelProperty("重量")
    private Double weight;

    @ApiModelProperty("载荷")
    private Double load;

    @ApiModelProperty("轮胎型号")
    private String tyreType;

    @ApiModelProperty("轮辐条数")
    private Integer SpokeNumber;

    @ApiModelProperty("轮井厚度A")
    private Double thicknessA;

    @ApiModelProperty("轮辋中断厚度B")
    private Double thicknessB;

    @ApiModelProperty("轮辋内侧厚度C")
    private Double thicknessC;

    @ApiModelProperty("轮辋内侧厚度C")
    private String surfaceStatus;

    @ApiModelProperty("3D文件位置")
    private String pathThree;

    @ApiModelProperty("2D文件位置")
    private String pathTwo;

    @ApiModelProperty("客户名称")
    private String customerName;

    @ApiModelProperty("客户市场")
    private String market;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("客户id")
    private Integer customerId;

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
