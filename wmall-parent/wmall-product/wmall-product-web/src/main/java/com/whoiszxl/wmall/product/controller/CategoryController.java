package com.whoiszxl.wmall.product.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.whoiszxl.wmall.product.entity.CategoryEntity;
import com.whoiszxl.wmall.product.service.CategoryService;
import com.whoiszxl.common.utils.R;



/**
 * 商品三级分类
 *
 * @author whoiszxl
 * @email whoiszxl@gmail.com
 * @date 2020-05-27 23:10:00
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @PostMapping("/list/tree")
    public R list(){
        return R.ok().put("data", categoryService.listWithTree());
    }


    /**
     * 信息
     */
    @PostMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);
        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody CategoryEntity category){
        categoryService.updateCascade(category);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
        categoryService.removeMenuByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
