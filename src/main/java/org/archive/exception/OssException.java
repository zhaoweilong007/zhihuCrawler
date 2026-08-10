package org.archive.exception;

import java.io.Serial;

/**
 * @author ZhaoWeiLong
 **/
public class OssException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public OssException(String msg) {
        super(msg);
    }
}
