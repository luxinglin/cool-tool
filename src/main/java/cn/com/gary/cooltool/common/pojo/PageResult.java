package cn.com.gary.cooltool.common.pojo;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-14 22:40
 */
public class PageResult<T> extends BaseResult {

    TableData<T> data;

    public PageResult(long total, List<T> rows) {
        this.data = new TableData<T>(total, rows);
    }

    public PageResult() {
        this.data = new TableData<T>();
    }

    PageResult<T> total(int total) {
        this.data.setTotal(total);
        return this;
    }

    PageResult<T> total(List<T> rows) {
        this.data.setRows(rows);
        return this;
    }

    public TableData<T> getData() {
        return data;
    }

    public void setData(TableData<T> data) {
        this.data = data;
    }

    class TableData<T> {
        long total;
        List<T> rows;

        public TableData(long total, List<T> rows) {
            this.total = total;
            this.rows = rows;
        }

        public TableData() {
        }

        public long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        public List<T> getRows() {
            return rows;
        }

        public void setRows(List<T> rows) {
            this.rows = rows;
        }
    }
}
