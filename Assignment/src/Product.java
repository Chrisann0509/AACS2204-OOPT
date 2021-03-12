public class Product {
    private String prodID;
    private String prodName;
    private int quantity;
    private double price;
    private static int numProd;
    private int productSalesQty;
    
    public Product(){
        
    }

    public Product(String prodID, String prodName, int quantity, double price) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(String prodName, int quantity, double price) {
        numProd++;
        int id=1000+numProd;
        this.prodID = "P" + Integer.toString(id);
        this.prodName = prodName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNumProd() {
        return numProd;
    }
      
    public boolean increaseProductQty(int quantity){
        if(quantity > 0){
            this.quantity+=quantity;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean quantityValidation(int quantity){
        if(quantity > 0 && quantity <= this.quantity){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean decreaseProductQty(int quantity){
        if(quantityValidation(quantity)){
            this.quantity-=quantity;
            return true;
        }
        else{
           return false;
        }
    }
    
    public boolean updatePrice(double price){
        if(price <= 0){
             return false;
        }else{
            this.price=price;
            return true;
        }
    }

    public int getProductSalesQty() {
        return productSalesQty;
    }
   
    public void updateProductSales(int qty){
        productSalesQty+=qty;
    }
    
    public int getUpdateProductSales(){
        return  productSalesQty;
    }
    
    public String toString(){
        return prodID+"\t\t"+
               prodName+"\t\t"+
               quantity+"\t\t"+
               price;
    }
}
