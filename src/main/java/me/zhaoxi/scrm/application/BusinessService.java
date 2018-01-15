package me.zhaoxi.scrm.application;

import me.zhaoxi.scrm.domain.businessside.Business;
import me.zhaoxi.scrm.domain.businessside.BusinessFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoxi linzuxiong1988@gmail.com
 */
public class BusinessService {
    private static final Logger logger = LoggerFactory.getLogger(BusinessService.class);


    public Business query() {
//        return new Business();
        return (new BusinessFactory()).get(100L);
    }

    /**
     *
     * @return 商家的identity
     */
    public long getBusinessIdentity() {
        return 100L;
    }


}
