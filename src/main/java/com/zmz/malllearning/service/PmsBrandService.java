package com.zmz.malllearning.service;
import com.zmz.malllearning.mbg.model.PmsBrand;
import java.util.List;

/**
 * PmsBrandService
 * Created by zmz on 2019/10/17.
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}
