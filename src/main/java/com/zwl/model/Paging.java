
package com.zwl.model;


import lombok.Data;

@Data
@SuppressWarnings("unused")
public class Paging {

    private Boolean isEnd;
    private String next;
    private String previous;

}
