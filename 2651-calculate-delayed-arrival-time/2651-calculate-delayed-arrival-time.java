class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time = arrivalTime + delayedTime;
        int t = time % 24;
        return ((time < 24) ? time : t);
    }
}