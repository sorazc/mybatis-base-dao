package cn.zc.base.dao.scanner;

public class MapperFactoryBean<T> extends org.mybatis.spring.mapper.MapperFactoryBean<T> {

    @Override
    protected void checkDaoConfig() {
        super.checkDaoConfig();
    }
}
