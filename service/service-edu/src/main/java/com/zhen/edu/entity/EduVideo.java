package com.zhen.edu.entity;

import java.util.Date;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhen
 * @since 2023-02-09 16:57:30
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("edu_video")
public class EduVideo  {
    //视频ID    
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    //课程ID
    private String courseId;
    //章节ID
    private String chapterId;
    //节点名称
    private String title;
    //云端视频资源
    private String videoSourceId;
    //原始文件名称
    private String videoOriginalName;
    //排序字段
    private Integer sort;
    //播放次数
    private Long playCount;
    //是否可以试听：0收费 1免费
    private Boolean isFree;
    //视频时长（秒）
    private Float duration;
    //Empty未上传 Transcoding转码中  Normal正常
    private String status;
    //视频源文件大小（字节）
    private Long size;
    //乐观锁
    private Long version;
    //创建时间
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;
    //更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;



}

