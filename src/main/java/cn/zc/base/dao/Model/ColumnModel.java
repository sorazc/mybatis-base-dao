package cn.zc.base.dao.Model;

/**
 * 列信息
 */
public class ColumnModel {

    private String name;

    private boolean isPk;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPk() {
        return isPk;
    }

    public void setPk(boolean pk) {
        isPk = pk;
    }


}
