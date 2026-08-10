package org.archive.model;

import lombok.Builder;
import lombok.Data;

/**
 * 上传返回体
 *
 * @author ZhaoWeiLong
 **/
@Data
@Builder
public class UploadResult {
    /**
     * 文件路径
     */
    private String url;

    /**
     * 文件名
     */
    private String filename;
}
