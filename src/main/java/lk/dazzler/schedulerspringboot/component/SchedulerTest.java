/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 13-Jul-2023
 * Time : 12:54 PM
 * Project Name : Scheduler-Spring-Boot
 */
package lk.dazzler.schedulerspringboot.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTest {
    int i = 0;

    @Scheduled(fixedRate = 1000)  //call runTest() every 1 second looped
    public void runTest(){
        System.out.println("Display output count : " + i);
        i++;
        if(i > 5){
            System.out.println("=========== Output greater than 5 ==========");
            i = i - 5;
        }
    }
}
