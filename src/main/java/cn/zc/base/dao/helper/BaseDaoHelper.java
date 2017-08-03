package cn.zc.base.dao.helper;

import cn.zc.base.dao.BaseDao;
import org.apache.ibatis.builder.annotation.ProviderSqlSource;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BaseDaoHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseDaoHelper.class);

    private Set<Class<?>> classSet = new HashSet<>();

    private void addClass(Class<?> clazz) {
        classSet.add(clazz);
        LOGGER.info(clazz.getName());
    }

    public boolean isExtendBaseDao(Class<?> clazz) {
        return BaseDao.class.isAssignableFrom(clazz);
    }

    private void setSqlSource(MappedStatement mappedStatement) {
        LOGGER.info(mappedStatement.getId());
    }

    public void registryDao(SqlSession sqlSession, Class<?> daoInterface) {
        addClass(daoInterface);

        Collection<MappedStatement> collection = sqlSession.getConfiguration().getMappedStatements();
        for(MappedStatement mappedStatement : collection) {
            if (mappedStatement.getSqlSource() instanceof ProviderSqlSource) {
                setSqlSource(mappedStatement);
            }
        }
    }

}
