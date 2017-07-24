package cn.zc.test.dao;

import cn.zc.base.dao.BaseDao;
import cn.zc.test.entity.User;

public interface UserDao extends BaseDao<User, String> {

    Integer count();

}
