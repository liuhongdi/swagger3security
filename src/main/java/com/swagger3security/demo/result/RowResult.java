package com.swagger3security.demo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("每栏的信息")
public class RowResult<T,K> {
    @ApiModelProperty("当前栏的类型")
    private String rowType;

    @ApiModelProperty("当前栏的标题")
    private String rowTitle;

    @ApiModelProperty("内容列表:商品")
    private List<T> listGoods;

    @ApiModelProperty("内容列表:广告")
    private List<K> listAd;

    public String getRowTitle() {
        return this.rowTitle;
    }
    public void setRowTitle(String rowTitle) {
        this.rowTitle = rowTitle;
    }

    public String getRowType() {
        return this.rowType;
    }
    public void setRowType(String rowType) {
        this.rowType = rowType;
    }


    public void setListGoods(List<T> listGoods) {
        this.listGoods = listGoods;
    }
    public List<T> getListGoods() {
        return this.listGoods;
    }

    public void setListAd(List<K> listAd) {
        this.listAd = listAd;
    }
    public List<K> getListAd() {
        return this.listAd;
    }
}
