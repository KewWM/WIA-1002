
package S2_2019.Q2;

public class SalesList 
{
    protected String[] region;
    protected Integer[] sale;
    protected String[] name;

    public SalesList() {
    }

    public SalesList(String[] region, Integer[] sale, String[] name) {
        this.region = region;
        this.sale = sale;
        this.name = name;
    }

    public String[] getRegion() {
        return region;
    }

    public void setRegion(String[] region) {
        this.region = region;
    }

    public Integer[] getSale() {
        return sale;
    }

    public void setSale(Integer[] sale) {
        this.sale = sale;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < name.length; i++)
        {
            str += String.format("%-10s%-4d%-7s\n", region[i], sale[i], name[i]);
        }
        return str;
    }
    
}
