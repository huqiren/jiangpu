package com.huboot.business.common.cache;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/8 0008.
 */
@Component
public class CacheDataProxy {

   /* @Autowired
    private UserFeignClient userFeignClient;
    @Autowired
    private AreaFeignClient areaFeignClient;
    @Autowired
    private CompanyFeignClient companyFeignClient;
    @Autowired
    private ShopFeignClient shopFeignClient;

    @Cacheable(value = RedisHashName.USER_DETAIL_INFO, keyGenerator = "keyGenerator", cacheManager = "redisCacheManager", unless = "#result == null")
    public UserDetailInfo getUserDetailInfo(Long userId) {
        return userFeignClient.getUserDetailInfo(userId);
    }

    @Cacheable(value = RedisHashName.AREA_INFO, keyGenerator = "keyGenerator", cacheManager = "redisCacheManager", unless = "#result == null")
    public AreaDTO getAreaInfo(Long areaId) {
        return areaFeignClient.get(areaId);
    }

    @Cacheable(value = RedisHashName.COMPANY_INFO, keyGenerator = "keyGenerator", cacheManager = "redisCacheManager", unless = "#result == null")
    public CompanyDetailInfo getCompanyInfo(Long companyId) {
        return companyFeignClient.get(companyId);
    }

    @Cacheable(value = RedisHashName.SHOP_INFO, keyGenerator = "keyGenerator", cacheManager = "redisCacheManager", unless = "#result == null")
    public ShopDetaiInfo getShopInfo(Long shopId) {
        return shopFeignClient.get(shopId);
    }*/

}
