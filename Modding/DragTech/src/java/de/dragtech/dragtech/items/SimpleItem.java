package de.dragtech.dragtech.items;

import cpw.mods.fml.common.registry.GameRegistry;
import de.dragtech.dragtech.Main;
import de.dragtech.dragtech.utilities.MainUtilities;
import net.minecraft.item.Item;

public class SimpleItem extends Item {
	
	public SimpleItem(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(MainUtilities.tabDragTech);
		this.setMaxStackSize(1);
		
		GameRegistry.registerItem(this, unlocalizedName);
	}
}
