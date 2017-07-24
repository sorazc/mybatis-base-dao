package cn.zc.base.dao;

import org.apache.ibatis.annotations.SelectProvider;
import cn.zc.base.dao.provider.SqlProvider;

import java.util.List;

/**
 * Created by zc on 2017/7/23.
 */
public interface BaseDao<T, PK> {

    Integer save(T t);

    Integer saveBatch(List<T> list);

    Integer update(T t);

    Integer delete(T t);

    @SelectProvider(type = SqlProvider.class, method = "queryById")
    T queryById(String id);

}
