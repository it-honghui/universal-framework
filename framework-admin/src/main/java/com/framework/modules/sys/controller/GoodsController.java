package com.framework.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import com.framework.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.framework.modules.sys.entity.GoodsEntity;
import com.framework.modules.sys.service.GoodsService;
import com.framework.common.utils.PageUtils;
import com.framework.common.utils.R;



/**
 * 商品管理
 *
 * @author wanghonghui
 * @email wanghonghui@163.com
 * @date 2019-05-15 11:53:14
 */
@RestController
@RequestMapping("sys/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:goods:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = goodsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{goodsId}")
    @RequiresPermissions("sys:goods:info")
    public R info(@PathVariable("goodsId") Long goodsId){
        GoodsEntity goods = goodsService.selectById(goodsId);

        return R.ok().put("goods", goods);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:goods:save")
    public R save(@RequestBody GoodsEntity goods){
        goodsService.insert(goods);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:goods:update")
    public R update(@RequestBody GoodsEntity goods){
        ValidatorUtils.validateEntity(goods);
        goodsService.updateAllColumnById(goods);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:goods:delete")
    public R delete(@RequestBody Long[] goodsIds){
        goodsService.deleteBatchIds(Arrays.asList(goodsIds));

        return R.ok();
    }

}
