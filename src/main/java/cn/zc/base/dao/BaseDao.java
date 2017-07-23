package cn.zc.base.dao;

import java.util.List;

/**
 * Created by zc on 2017/7/23.
 */
public interface BaseDao<T, PK> {

    Integer save(T t);

    Integer saveBatch(List<T> list);

    Integer update(T t);

    Integer delete(T t);



}
