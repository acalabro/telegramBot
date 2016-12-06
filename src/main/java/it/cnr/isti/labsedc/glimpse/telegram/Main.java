package it.cnr.isti.labsedc.glimpse.telegram;

import io.github.nixtabyte.telegram.jtelebot.server.impl.DefaultCommandDispatcher;
import io.github.nixtabyte.telegram.jtelebot.server.impl.DefaultCommandQueue;
import io.github.nixtabyte.telegram.jtelebot.server.impl.DefaultCommandWatcher;

public class Main {
	public static void main(String[] args) {
		DefaultCommandDispatcher commandDispatcher = new DefaultCommandDispatcher(10, 100, new DefaultCommandQueue());
		commandDispatcher.startUp();
		
		DefaultCommandWatcher commandWatcher = new DefaultCommandWatcher(2000, 100, "TOKEN HERE",
				commandDispatcher, new MessageManagerCommandFactory());
		commandWatcher.startUp();
	}
}