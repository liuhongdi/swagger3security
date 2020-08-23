package com.swagger3security.demo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
        "pagination": {
            "total": 100,
            "currentPage": 1,
            "prePageCount": 10
        }
*
*/
@ApiModel("分页信息")
public class PaginationResult {

    @ApiModelProperty("总页数")
    private int total;

    @ApiModelProperty("当前第几页")
    private int currentPage;

    @ApiModelProperty("每页共多少个元素")
    private int perPageCount;

    public int getTotal() {
        return this.total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPerPageCount() {
        return this.perPageCount;
    }
    public void setPerPageCount(int perPageCount) {
        this.perPageCount = perPageCount;
    }
}
