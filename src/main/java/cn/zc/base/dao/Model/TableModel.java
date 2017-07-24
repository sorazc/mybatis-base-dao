package cn.zc.base.dao.Model;

import java.util.Set;

/**
 * 表信息
 */
public class TableModel {

    private String name;

    private ColumnModel pk;

    private Set<ColumnModel> columns;

    private Set<ColumnModel> columnsWithoutPk;
}
