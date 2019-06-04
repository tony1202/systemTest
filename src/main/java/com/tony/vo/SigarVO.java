package com.tony.vo;

/**
 * @Description:
 * @Auther: tony
 * @Date: 2019/5/14
 */
public class SigarVO {
    /**
     * 当前时间(HH:mm:ss)
     */
    private String nowTime;

    /**
     * cpu利用率
     */
    private Integer ratioCPU;

    /**
     * 当前总内存(G)
     */
    private double totalMemory;
    /**
     * 已使用内存(G)
     */
    private double useMemory;

    /**
     * 剩余内存(G)
     */
    private double freeMemory;

    /**
     * 内存使用率
     */
    private Integer ratioMemory;


    public String getNowTime() {
        return nowTime;
    }

    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }

    public Integer getRatioCPU() {
        return ratioCPU;
    }

    public void setRatioCPU(Integer ratioCPU) {
        this.ratioCPU = ratioCPU;
    }

    public double getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(double totalMemory) {
        this.totalMemory = totalMemory;
    }

    public double getUseMemory() {
        return useMemory;
    }

    public void setUseMemory(double useMemory) {
        this.useMemory = useMemory;
    }

    public double getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(double freeMemory) {
        this.freeMemory = freeMemory;
    }

    public Integer getRatioMemory() {
        return ratioMemory;
    }

    public void setRatioMemory(Integer ratioMemory) {
        this.ratioMemory = ratioMemory;
    }

    @Override
    public String toString() {
        return "SigarVO{" +
                "nowTime='" + nowTime + '\'' +
                ", ratioCPU=" + ratioCPU +
                ", totalMemory=" + totalMemory +
                ", useMemory=" + useMemory +
                ", freeMemory=" + freeMemory +
                ", ratioMemory=" + ratioMemory +
                '}';
    }

}
