package com.bytehonor.sdk.define.spring.query;

import com.bytehonor.sdk.define.spring.constant.HttpConstants;

public class QueryPage {

    private static int LIMIT_DEF = HttpConstants.LIMIT_DEF;

    private int offset;

    private int limit;

    public QueryPage() {
        this.offset = 0;
        this.limit = LIMIT_DEF;
    }

    public static QueryPage create() {
        return new QueryPage();
    }

    public static QueryPage of(int offset, int limit) {
        QueryPage page = new QueryPage();
        page.setOffset(offset > -1 ? offset : HttpConstants.OFFSET_DEF);
        page.setLimit(limit);
        return page;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
