package com.skydust.bean;

/**
 * Created by dhlzj on 2017/4/24.
 */
public class PageVO {

    /**
     * 当前页码
     */
    private Integer page_index;

    /**
     * 每页显示数量
     */
    private Integer page_size;

    public Integer getPage_index() {
        return page_index;
    }

    public void setPage_index(Integer page_index) {
        this.page_index = page_index;
    }

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }

    public Integer getOffset() {
        if (this.page_index == null) {
            return null;
        }
        return (this.page_index - 1) * this.page_size;
    }

    public Integer getLimit() {
        return this.page_size;
    }
}
