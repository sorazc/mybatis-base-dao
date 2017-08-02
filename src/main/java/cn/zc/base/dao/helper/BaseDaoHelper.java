package cn.zc.base.dao.helper;

import cn.zc.base.dao.BaseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class BaseDaoHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseDaoHelper.class);

    private Set<Class<?>> classSet = new HashSet<>();

    public void addClass(Class<?> clazz) {
        LOGGER.info(clazz.getName());
        if (clazz.isAssignableFrom(BaseDao.class)) {
            classSet.add(clazz);
            LOGGER.info(clazz.getName());
        }
    }

}
