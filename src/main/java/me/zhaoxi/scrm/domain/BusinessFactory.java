package me.zhaoxi.scrm.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoxi linzuxiong1988@gmail.com
 */
public class BusinessFactory {
    private static final Logger logger = LoggerFactory.getLogger(BusinessFactory.class);


    public void createBusiness(Business business) {

    }

    public Business get(long identity) {
        return new Business();
    }
}
