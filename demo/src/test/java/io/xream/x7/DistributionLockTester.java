package io.xream.x7;

import io.xream.x7.demo.bean.Cat;
import org.springframework.stereotype.Component;
import x7.distributed.Lock;

@Component
public class DistributionLockTester {

    @Lock(condition = "#cat.id + '_' + #cat.getType()" )
    public String test(Cat cat) {

        System.out.println(" LOCKED OK");

        return "LOCKED OK";
    }
}
