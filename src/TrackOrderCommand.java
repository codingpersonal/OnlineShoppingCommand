
public class TrackOrderCommand implements IMenuCommand{
	IMenuReceiver rcv;
	@Override
	public void setReceiver(IMenuReceiver rcv) {
		this.rcv = rcv;
	}

	@Override
	public void sendCommand() {
		rcv.doAction();
	}
}
