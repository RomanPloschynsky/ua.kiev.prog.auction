import java.util.LinkedList;

public class Auction {
    public int id;
    public long dateStart;
    public long dateEnd;
    public Product product;
    public int ownerId;
    public double actualPrice;
    public LinkedList<Rate> rates;

    public Auction(long dateEnd, Product product, int ownerId) {
        this.id = (ownerId + "_" + product.getName() + "_" + dateStart).hashCode();
        this.dateStart = System.currentTimeMillis();
        if(dateEnd <= (this.dateStart + 1000*60*60*24)) {
            System.out.println("incorrect dateEnd. date should be >= date start + 1 day"); //// TODO: rewrite with exception 
        } else {
        this.dateEnd = dateEnd;
        }
        this.product = product;
        this.actualPrice = product.getPrice();
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "Auction{" + id +
                "{dateStart:" + dateStart +
                "},{dateEnd:" + dateEnd +
                "},{product:" + product +
                "},{actualPrice:" + actualPrice +
                "},{ownerId:" + ownerId +
                "}}";
    }

    class Rate {
        int id;
        int auctionId;
        int userId;
        double rateValue;
        long rateDate;

        public Rate(int auctionId, double rateValue) {
            this.id = id;
            this.auctionId = auctionId;
            this.userId = userId;
            this.rateValue = rateValue;
            this.rateDate = rateDate;

        }
    }



    public void setRate(Rate rate) {
        if(rate.rateValue <= this.actualPrice) {
            System.out.println("Don't be such a miser. Make normal rate. Rate should be more then actualPrice");
        } else {
            this.rates.add(rate);
            this.actualPrice = rate.rateValue;
            System.out.println("Rate excepted");
            //todo: send message for the previous rateMaker, that he should give us more money
        }
    }
}
