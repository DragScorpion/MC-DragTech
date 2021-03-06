package de.dragtech.dragtech;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import de.dragtech.dragtech.guis.MainGuiHandler;
import de.dragtech.dragtech.items.MainItems;
import de.dragtech.dragtech.utilities.MainUtilities;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		// Init Items, Creative Tabs, TileEntities, Blocks
		MainUtilities.init();
		MainItems.init();
		//Something
	}
	
	public void init(FMLInitializationEvent e) {
		// Init Recipes, Guis
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new MainGuiHandler());
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
