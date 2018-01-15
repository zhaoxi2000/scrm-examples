package me.zhaoxi.scrm.domain;

import me.zhaoxi.scrm.domain.repo.CustomerRepo;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;


/**
 * 在两个商家直接互相转移客户, 提供导流量的服务.
 * @author zhaoxi linzuxiong1988@gmail.com
 */
public class CustomerIntroduceService {
    private static final Logger logger = LoggerFactory.getLogger(CustomerIntroduceService.class);



    CustomerRepo customerRepo = new CustomerRepo();


    public void introduce(Customer fromCustomer, Business toBusiness){
        final Customer newCustomer = new Customer();
        try {
            BeanUtils.copyProperties(newCustomer, fromCustomer);
        } catch (IllegalAccessException e) {
            logger.error("Exception", e);
        } catch (InvocationTargetException e) {
            logger.error("Exception", e);
        }
        // assert main properties new==from
        // set the identity from repo
        customerRepo.newIdentity(newCustomer);
        toBusiness.beCustomer(newCustomer);
    }

}
