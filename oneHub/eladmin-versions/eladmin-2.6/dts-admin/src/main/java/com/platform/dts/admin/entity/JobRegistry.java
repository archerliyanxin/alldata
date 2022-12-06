package com.platform.dts.admin.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * Created by AllDataDC
 */
@Data
public class JobRegistry {

    private int id;
    private String registryGroup;
    private String registryKey;
    private String registryValue;
    private double cpuUsage;
    private double memoryUsage;
    private double loadAverage;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}
