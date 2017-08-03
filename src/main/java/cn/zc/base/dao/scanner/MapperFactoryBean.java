package cn.zc.base.dao.scanner;

import cn.zc.base.dao.helper.BaseDaoHelper;

public class MapperFactoryBean<T> extends org.mybatis.spring.mapper.MapperFactoryBean<T> {

    private BaseDaoHelper baseDaoHelper ;

    public void setBaseDaoHelper(BaseDaoHelper baseDaoHelper) {
        this.baseDaoHelper = baseDaoHelper;
    }

    public MapperFactoryBean() {
    }

    public MapperFactoryBean(Class<T> mapperInterface) {
        super(mapperInterface);
    }

    @Override
    protected void checkDaoConfig() {
        super.checkDaoConfig();
        if (baseDaoHelper.isExtendBaseDao(getObjectType())) {
            baseDaoHelper.registryDao(getSqlSession(), getObjectType());
        }
    }

}
