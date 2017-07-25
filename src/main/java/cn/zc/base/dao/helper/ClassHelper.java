package cn.zc.base.dao.helper;

import cn.zc.base.dao.annotation.Table;
import cn.zc.base.dao.utils.ClassUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zc on 2017/6/21.
 */
public final class ClassHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassHelper.class);

    /**
     * all class under base package
     */
    private static final Set<Class<?>> CLASS_SET = new HashSet<>();

    public ClassHelper(String basePackage) {
        LOGGER.info("===================class helper init ===================");
        ClassUtil.getClassSet(basePackage, CLASS_SET);
    }

    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    /**
     * @return set of table class
     */
    public static Set<Class<?>> getTableClassSet() {
        return getClassSetFromAnnotation(Table.class);
    }

    /**
     * get class set from annotation
     * @param clazz  annotation class
     * @return class set
     */
    public static Set<Class<?>> getClassSetFromAnnotation(Class clazz) {
        Set<Class<?>> classSet = new HashSet<>();
        for (Class<?> cls : CLASS_SET) {
            if (cls.isAnnotationPresent(clazz)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

}
