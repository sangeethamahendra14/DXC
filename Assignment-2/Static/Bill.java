package Static;


	public class Bill 
	{
		private static int counter;
		private String billId;
		private String paymentMode;
		
		static
		{
			counter=9000;
		}
		public Bill(String paymentMode)
		{
			this.billId="B"+ ++counter;
			this.paymentMode=paymentMode;
		}
		public String getBillId() {
			return billId;
		}
		public void setBillId(String billId) {
			this.billId = billId;
		}
		public String getPaymentMode() {
			return paymentMode;
		}
		public void setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
		}
		

	public static void main(String[] args)
		{
			Bill bill1= new Bill("Debit card");
			Bill bill2= new Bill("Paypal");
			
			Bill[] bills= {bill1,bill2};
			for(Bill bill:bills)
			{
				System.out.println("Bill Details");
				 System.out.println("Bill Id: " + bill.getBillId());
				 System.out.println("Payment method: " + bill.getPaymentMode());
				 System.out.println();
			}
		}
	}

