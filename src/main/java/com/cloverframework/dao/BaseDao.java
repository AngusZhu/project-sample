package com.cloverframework.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Angus_Zhu on 11/24/2015.
 */
public interface BaseDao<T> {

    //  public List<T> findPage(Page page);
    public List<T> find(Map paraMap);
    public T get(Serializable id);
    public void insert(T entity);
    public void update(T entity);
    public void deleteById(Serializable id);
    public void delete(Serializable[] ids);

}
