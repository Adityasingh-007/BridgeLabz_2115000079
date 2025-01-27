public class Program4 {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}

public class VolumeEarth{
public static void main(String[]args){
double rkm=6378;
double rtm=0.621371;
double rmi=rkm*rtm;
double volkm=(4.0/3.0)*Math.PI*Math.pow(rkm, 3);
double volmi=(4.0/3.0)*Math.PI*Math.pow(rmi, 3);
System.out.println("The volume of earth in cubic kilometers is "+volkm+" and cubic miles is "+volmi);

}
}