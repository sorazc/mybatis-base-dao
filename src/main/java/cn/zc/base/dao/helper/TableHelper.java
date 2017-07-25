package cn.zc.base.dao.helper;

import cn.zc.base.dao.model.TableModel;
import cn.zc.base.dao.utils.ClassUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TableHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(TableHelper.class);

    private static final Map<Class<?>, TableModel> TABLE_MAP = new HashMap<>();

    public TableHelper() {
        Set<Class<?>> classSet = ClassHelper.getTableClassSet();
        LOGGER.info("===================table helper init ===================");
        LOGGER.info("===================" + classSet + "===================");
    }

}
