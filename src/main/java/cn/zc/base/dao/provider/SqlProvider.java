package cn.zc.base.dao.provider;

import cn.zc.base.dao.helper.ClassHelper;
import org.apache.ibatis.jdbc.SQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by zc on 2017/7/23.
 */
public class SqlProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(SqlProvider.class);

    public String queryById(final String id){
        LOGGER.info("================= sqlRrovider");
        return new SQL(){{
            SELECT("*");
            FROM("user");
            WHERE("id = #{id}");
        }}.toString();
    }

}
