package com.p.Service;

import com.p.Model.Good;

import java.awt.print.Pageable;
import java.util.List;

public interface GoodService {
    List<Good> getGoods(int page,int ab);
    int getMaxPage(int ab);

}
