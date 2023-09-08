package main.simple;

/**
 * @author HJ
 * @date 2023/9/8 22:13
 * @description 2651. 计算列车到站时间
 */
public class CalculateDelayedArrivalTime {

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

}
