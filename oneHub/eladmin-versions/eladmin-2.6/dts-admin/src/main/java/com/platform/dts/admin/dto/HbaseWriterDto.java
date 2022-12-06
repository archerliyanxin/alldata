package com.platform.dts.admin.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HbaseWriterDto implements Serializable {

  private String writeNullMode;

  private String writerMode;

  private String writerRowkeyColumn;

  private VersionColumn writerVersionColumn;
}
