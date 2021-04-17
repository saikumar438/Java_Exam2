package Question7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public enum Phone {

		GOOGLE_PIXEL(500),IPHONE_12(1000),LUMIA_950(200);
	
		public int price;

		
		private Phone(int price) {
			this.price = price;
		}


		public int getPrice() {
			return price;
		}

		
	
}

