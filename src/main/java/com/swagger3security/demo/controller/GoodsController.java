package com.swagger3security.demo.controller;

import com.swagger3security.demo.pojo.Goods;
import com.swagger3security.demo.result.PageResult;
import com.swagger3security.demo.result.PaginationResult;
import com.swagger3security.demo.result.RestResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


//@Parameter(description = "商品id,正整数") @RequestParam(value="goodsid",required = false,defaultValue = "0") Integer goodsid
@Api(tags = "商品信息管理接口")
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Operation(summary = "商品详情,针对得到单个商品的信息")
    @GetMapping("/one")
    public RestResult<PageResult<Goods>> one() {

        //总的返回数据
        RestResult res = new RestResult();

        //一页中的商品列表
        List<Goods> resList = new ArrayList();

        Goods goodsone = new Goods();
        goodsone.setGoodsId(3L);
        goodsone.setGoodsName("电子书");
        goodsone.setSubject("学python,学ai");
        goodsone.setPrice(new BigDecimal(60));
        goodsone.setStock(10);
        resList.add(goodsone);

        Goods goodstwo = new Goods();
        goodstwo.setGoodsId(4L);
        goodstwo.setGoodsName("蓝牙音箱");
        goodstwo.setSubject("便携式音质优异");
        goodstwo.setPrice(new BigDecimal(1200.00));
        goodstwo.setStock(30);
        resList.add(goodstwo);

        PageResult<List<Goods>> pres= new PageResult();
        pres.setList(resList);

        //页数信息
        PaginationResult pares = new PaginationResult();
        pares.setTotal(15);
        pares.setCurrentPage(3);
        pares.setPerPageCount(10);

        //分页的数据
        pres.setPagination(pares);

        return res.success(pres);
    }

    @Operation(summary = "提交订单")
    @PostMapping("/order")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userid",value="用户id",dataTypeClass = Long.class, paramType = "query",example="12345"),
            @ApiImplicitParam(name="goodsid",value="商品id",dataTypeClass = Integer.class, paramType = "query",example="12345"),
            @ApiImplicitParam(name="mobile",value="手机号",dataTypeClass = String.class, paramType = "query",example="13866668888"),
            @ApiImplicitParam(name="comment",value="发货备注",dataTypeClass = String.class, paramType = "query",example="请在情人节当天送到")
    })
    public RestResult<String> order(@ApiIgnore @RequestParam Map<String,String> params) {
        System.out.println(params);
        RestResult res = new RestResult();
        return res.success("success");
    }
}