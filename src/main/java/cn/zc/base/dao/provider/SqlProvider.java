package cn.zc.base.dao.provider;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by zc on 2017/7/23.
 */
public class SqlProvider {

    public String queryById(final String id){
        return new SQL(){{
            SELECT("*");
            FROM("user");
            WHERE("id = #{id}");
        }}.toString();
    }

}
