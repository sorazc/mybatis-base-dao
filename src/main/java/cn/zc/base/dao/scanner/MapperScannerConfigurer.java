package cn.zc.base.dao.scanner;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class MapperScannerConfigurer extends org.mybatis.spring.mapper.MapperScannerConfigurer {

    @Override
    public void setMarkerInterface(Class<?> superClass) {
        super.setMarkerInterface(superClass);
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) {
        super.postProcessBeanDefinitionRegistry(registry);
        String[] names = registry.getBeanDefinitionNames();
        GenericBeanDefinition definition;
        for (String name : names) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(name);
            if (beanDefinition instanceof GenericBeanDefinition) {
                definition = (GenericBeanDefinition) beanDefinition;
                if (StringUtils.isNotEmpty(definition.getBeanClassName())
                        && definition.getBeanClassName().equals("org.mybatis.spring.mapper.MapperFactoryBean")) {
                    definition.setBeanClass(MapperFactoryBean.class);
                    //definition.getPropertyValues().add("mapperHelper", this.mapperHelper);
                }
            }
        }
    }
}
