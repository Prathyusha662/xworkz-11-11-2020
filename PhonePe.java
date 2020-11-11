class PhonePe{
public static void phonePay(long mobileNumber){
System.out.println("your phonePay bill paid" +mobileNumber);
}
public static void phonePay(long mobileNumber,String DTH){
System.out.println("your phonePay bill paid from" +mobileNumber+"DTH bill paid sucessfully"+DTH);
}
public static void phonePay(long mobileNumber,int id,int amount,String name){
System.out.println("your phonePay bill paid from" +mobileNumber+"elctric bill paid sucessfully"+id+"of amount"+amount+"by the name"+name);
}
public static void phonePay(long mobileNumber,int creditCard,int amount){
System.out.println("your phonePay bill paid from" +mobileNumber+"credit number is"+creditCard+"of amount sucessfully"+amount);
}



public static void main(String args[]){
PhonePe.phonePay(8310766231L,19045201,4000);
}
}