package com.groupbuy.test.infrastructure.dao;

import com.alibaba.fastjson.JSON;
import com.groupbuy.infrastructure.dao.IGroupBuyActivityDao;
import com.groupbuy.infrastructure.dao.po.GroupBuyActivity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupBuyActivityDaoTest {
    @Resource
    private IGroupBuyActivityDao groupBuyActivityDao;

    @Test
    public void test_queryGroupBuyActivityList() {
        List<GroupBuyActivity> groupBuyActivityList = groupBuyActivityDao.queryGroupBuyActivityList();
        log.info("测试结果: {}", JSON.toJSONString(groupBuyActivityList));
    }
}
