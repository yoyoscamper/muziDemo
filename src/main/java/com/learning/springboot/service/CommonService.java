package com.learning.springboot.service;

import java.util.List;

/**
 * 所有的service接口都需要继承这个接口，提供了5个基础方法
 * @author sunmj
 *
 * @param <T>
 */
public interface CommonService<T> {

    /**
     * 保存
     * @param record
     * @return
     */
    int save(T record);
    
    /**
     * 逻辑删除
     * @param primaryKey
     * @return
     */
    int deleteLogically(String primaryKey);
    
    /**
     * 物理删除
     * @param primaryKey
     * @return
     */
    int deletePhysically(String primaryKey);
    
    /**
     * 查询基础列表
     * @param t
     * @param sort
     * @return
     */
    List<T> queryList(T t, String sort);
    
    /**
     * 查询单个记录
     * @param primaryKey
     * @return
     */
    T queryById(String primaryKey);

}
