package unknownSweetPotato;

import net.minecraft.item.ItemHoe;

public class ItemAnnoHoe extends ItemHoe {

	public ItemAnnoHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(UnknownSweetPotatoMod.tabSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
	}

}
