import java.util.HashMap;

public class ShoppingMenu implements IShoppingMenu
{
	HashMap<String, IMenuCommand> map = new HashMap<>();

	@Override
	public void setCommandToMenuItem(String command, IMenuCommand cmd) {
		map.put(command, cmd);
	}

	@Override
	public void invoke(String name) {
		IMenuCommand mc;
		if(map.containsKey(name)) {
			mc = map.get(name);
			mc.sendCommand();
		}
	}

}
