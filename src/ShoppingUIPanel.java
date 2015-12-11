
public class ShoppingUIPanel {

	public static void main(String[] args) {
		IMenuCommand shopping = new ShoppingCommand();
		IMenuCommand track = new TrackOrderCommand();
		IMenuCommand offer = new ViewOffersCommand();
		
		shopping.setReceiver(new IMenuReceiver() {
			
			@Override
			public void doAction() {
				System.out.println("Directing you to shopping link now.");
			}
		});
	
		track.setReceiver(new IMenuReceiver() {
			
			@Override
			public void doAction() {
				System.out.println("Directing you to Track Orders link now.");
				
			}
		});
		
		IMenuReceiver rcv1 = new OfferReceiver();
		IMenuReceiver rcv2 = new OfferReceiver2();
		offer.setReceiver(rcv1);
		offer.setReceiver(rcv2);
		
		
		IShoppingMenu menu = new ShoppingMenu();
		menu.setCommandToMenuItem("SHOP", shopping);
		menu.setCommandToMenuItem("TRACK", track);
		menu.setCommandToMenuItem("OFFERS",offer);
		
		menu.invoke("TRACK");
		menu.invoke("SHOP");
		menu.invoke("OFFERS");
	}

}
