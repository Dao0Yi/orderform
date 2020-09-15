package com.graduation.orderform.model.common;

import lombok.Data;

import java.util.List;
@Data
public class PageBean<T> {
    private long total ; //所有数据的行数
    private List<T> rows ; //当前页的数据
    private long pageSize ; //当前行数
    private long pageTotal ; //总页数
    private long pageIndex ; //当前页

    public PageBean() {
    }

    public PageBean(long total, List<T> rows, long pageSize, long pageTotal, long pageIndex) {
        this.total = total;
        this.rows = rows;
        this.pageSize = pageSize;
        this.pageTotal = pageTotal;
        this.pageIndex = pageIndex;
    }
}
