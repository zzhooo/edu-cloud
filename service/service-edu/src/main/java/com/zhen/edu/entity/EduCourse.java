package com.zhen.edu.entity;

import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhen
 * @since 2023-02-09 16:50:26
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("edu_course")
public class EduCourse  {
    //课程ID    
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    //课程讲师ID
    private String teacherId;
    //课程专业ID
    private String subjectId;
    //课程专业父级ID
    private String subjectParentId;
    //课程标题
    private String title;
    //课程销售价格，设置为0则可免费观看
    private BigDecimal price;
    //总课时
    private Integer lessonNum;
    //课程封面图片路径
    private String cover;
    //销售数量
    private Long buyCount;
    //浏览数量
    private Long viewCount;
    //乐观锁
    private Long version;
    //课程状态 Draft未发布  Normal已发布
    private String status;
    //逻辑删除 1（true）已删除， 0（false）未删除
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer isDeleted;
    //创建时间
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;
    //更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;



}

