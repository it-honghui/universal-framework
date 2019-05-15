package com.framework.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.framework.common.utils.PageUtils;
import com.framework.modules.sys.entity.GoodsEntity;

import java.util.Map;

/**
 * 商品管理
 *
 * @author wanghonghui
 * @email wanghonghui@163.com
 * @date 2019-05-15 11:53:14
 */
public interface GoodsService extends IService<GoodsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

