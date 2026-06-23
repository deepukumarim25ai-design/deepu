public class Day_14 {
        static void main() {

            FeeCalculator calc = new FeeCalculator(new NoDiscount());

            System.out.println("Final Fee with No Discount: "+calc.finalFee());

            calc.setDiscountStrategy(new SummerSaleDiscount());
            System.out.println("Final Fee with SummerSale Discount: "+calc.finalFee());

        }

    }

    interface DiscountStrategy{
        void apply(double fee);
    }

    class SummerSaleDiscount implements DiscountStrategy {
        // 30%
        @Override
        public void apply(double fee){
        }
    }

    class NoDiscount implements DiscountStrategy {
        // 0%
        @Override
        public void apply(double fee){
        }
    }


    class FeeCalculator {
        // Strategy
        private DiscountStrategy discountStrategy;

        public FeeCalculator(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
        }

        void setDiscountStrategy(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
        }

        //Calculate finalFee
        double finalFee() {
            discountStrategy.apply(1000);
            return 1000;
        }


    }