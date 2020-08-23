package com.swagger3security.demo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*

        "list": [],
        "pagination": {
            "total": 100,
            "currentPage": 1,
            "prePageCount": 10
        }
*/

@ApiModel("分页返回数据")
public class PageResult<T> {

    @ApiModelProperty("列表，分页中的数据")
    private List<T> list;

    @ApiModelProperty("页数信息")
    private PaginationResult pagination;

    public PageResult() {
    }

    public void setList(List list) {
        this.list = list;
    }
    public List<T> getList() {
        return this.list;
    }

    public void setPagination(PaginationResult pagination) {
        this.pagination = pagination;
    }
    public PaginationResult getPagination() {
        return this.pagination;
    }
}
