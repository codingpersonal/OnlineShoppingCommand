import java.util.ArrayList;

public class ViewOffersCommand implements IMenuCommand{

	ArrayList<IMenuReceiver> list = new ArrayList<>();
	
	@Override
	public void setReceiver(IMenuReceiver rcv) {
		list.add(rcv);
	}

	@Override
	public void sendCommand() {
		for(int i = 0; i < list.size(); i++) {
			list.get(i).doAction();
		}
	}
}
