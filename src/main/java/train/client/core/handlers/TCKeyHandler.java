package train.client.core.handlers;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
import train.common.Ctyrk4_Addon_TCCE;
import train.common.core.network.PacketKeyPress;

public class TCKeyHandler {
	public static KeyBinding horn;
	public static KeyBinding bell;
	public static KeyBinding inventory;
	public static KeyBinding up;
	public static KeyBinding down;
	public static KeyBinding idle;
	public static KeyBinding furnace;
	public TCKeyHandler() {
		horn = new KeyBinding("key.traincraft.horn", Keyboard.KEY_H, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(horn);
		inventory = new KeyBinding("key.traincraft.inventory", Keyboard.KEY_R, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(inventory);
		up = new KeyBinding("key.traincraft.up", Keyboard.KEY_Y, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(up);
		down = new KeyBinding("key.traincraft.down", Keyboard.KEY_X, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(down);
		idle = new KeyBinding("key.traincraft.idle", Keyboard.KEY_C, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(idle);
		furnace = new KeyBinding("key.traincraft.furnace", Keyboard.KEY_F, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(furnace);
		bell = new KeyBinding("key.traincraft.bell", Keyboard.KEY_B, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(bell);
	}

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (!Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()) {
			if (up.getIsKeyPressed()) {
				sendKeyControlsPacket(0);
			}
			if (down.getIsKeyPressed()) {
				sendKeyControlsPacket(2);
			}
			if (idle.getIsKeyPressed()) {
				sendKeyControlsPacket(6);
			}
			if (inventory.getIsKeyPressed()) {
				sendKeyControlsPacket(7);
			}
			if (horn.getIsKeyPressed()) {
				sendKeyControlsPacket(8);
			}
			if (furnace.getIsKeyPressed()) {
				sendKeyControlsPacket(9);
			}
			if (bell.getIsKeyPressed()) {
				sendKeyControlsPacket(10);
			}
		}

		if (FMLClientHandler.instance().getClient().gameSettings.keyBindSneak.getIsKeyPressed() && Keyboard.isKeyDown(Keyboard.KEY_F3)) {
			sendKeyControlsPacket(404);
		}
	}


	
	private static void sendKeyControlsPacket(int key)
	{
		Ctyrk4_Addon_TCCE.keyChannel.sendToServer(new PacketKeyPress(key));
	}
}