package com.gxj.vo;

import java.util.List;

public class PageBean {

    private Integer currentPage;

    private Integer pageSize;

    private Integer totalCount;

    private Integer totalPage;

    private List data;

    private Integer startIndex;

    public Integer getStartIndex() {
        return startIndex;
    }

    public PageBean(Integer currentPage, Integer pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.startIndex=(currentPage-1)*pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;

        this.totalPage=totalCount/pageSize;

        if(totalCount%pageSize>0){
            this.totalPage+=1;
        }
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
