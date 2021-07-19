package github.wyt.gateway.zuul.enhance.filters;

import com.alibaba.csp.sentinel.Entry;

public class EntryHolder extends com.alibaba.csp.sentinel.adapter.gateway.zuul.filters.EntryHolder {

  public EntryHolder(Entry entry, Object[] params) {
    super(entry, params);
  }
}
