package com.example.switchlist.data;

/**
 * Created by liaodongming on 2016/9/6.
 */

public class DetailItem {
    /**
     *  sku required parameters
     */
    private String name;
    private int multiply;

    /**
     * sku options parameters -- 标准产品肯定有
     */
    private NormalCell fenXiaoNum;
    private NormalCell fenXiaoPrice;
    private NormalCell danPinNum;
    private NormalCell gift;
    private NormalCell giftNum;

    /**
     * sku options parameters -- 保留
     */
    private NormalCell reserve1;
    private NormalCell reserve2;
    private NormalCell reserve3;
    private NormalCell reserve4;

    private SpinnerCell reserveSpinner1;
    private SpinnerCell reserveSpinner2;

    public DetailItem(DetailItemBuilder builder) {
        this.name = builder.name;
        this.multiply = builder.multiply;

        this.fenXiaoNum = builder.fenXiaoNum;
        this.fenXiaoPrice = builder.fenXiaoPrice;
        this.danPinNum = builder.danPinNum;
        this.gift = builder.gift;
        this.giftNum = builder.giftNum;

        this.reserve1 = builder.reserve1;
        this.reserve2 = builder.reserve2;
        this.reserve3 = builder.reserve3;
        this.reserve4 = builder.reserve4;

        this.reserveSpinner1 = builder.reserveSpinner1;
        this.reserveSpinner2 = builder.reserveSpinner2;
    }

    public static class DetailItemBuilder {
        /** require parameter*/
        private String name;
        private int multiply;

        /** options parameter */
        private NormalCell fenXiaoNum;
        private NormalCell fenXiaoPrice;
        private NormalCell danPinNum;
        private NormalCell gift;
        private NormalCell giftNum;

        /**
         * sku options parameters -- 保留
         */
        private NormalCell reserve1;
        private NormalCell reserve2;
        private NormalCell reserve3;
        private NormalCell reserve4;

        private SpinnerCell reserveSpinner1;
        private SpinnerCell reserveSpinner2;

        public DetailItemBuilder(String name, int multiply) {
            this.name = name;
            this.multiply = multiply;
        }

        public DetailItemBuilder fenXiaoNum(NormalCell fenXiaoNum) {
            this.fenXiaoNum = fenXiaoNum;
            return this;
        }

        public DetailItemBuilder fenXiaoPrice(NormalCell fenXiaoPrice) {
            this.fenXiaoPrice = fenXiaoPrice;
            return this;
        }

        public DetailItemBuilder danPinNum(NormalCell danPinNum) {
            this.danPinNum = danPinNum;
            return this;
        }

        public DetailItemBuilder gift(NormalCell gift) {
            this.gift = gift;
            return this;
        }

        public DetailItemBuilder giftNum(NormalCell giftNum) {
            this.giftNum = giftNum;
            return this;
        }

        public DetailItemBuilder reserve1(NormalCell reserve1) {
            this.reserve1 = reserve1;
            return this;
        }

        public DetailItemBuilder reserve2(NormalCell reserve2) {
            this.reserve2 = reserve2;
            return this;
        }

        public DetailItemBuilder reserve3(NormalCell reserve3) {
            this.reserve3 = reserve3;
            return this;
        }

        public DetailItemBuilder reserve4(NormalCell reserve4) {
            this.reserve4 = reserve4;
            return this;
        }

        public DetailItemBuilder reserveSpinner1(SpinnerCell reserveSpinner1) {
            this.reserveSpinner1 = reserveSpinner1;
            return this;
        }

        public DetailItemBuilder reserveSpinner2(SpinnerCell reserveSpinner2) {
            this.reserveSpinner2 = reserveSpinner2;
            return this;
        }

        public DetailItem build() {
            return new DetailItem(this);
        }
    }
}
