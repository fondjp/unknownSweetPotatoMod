package unknownSweetPotato;

import net.minecraft.item.Item;

public class ItemMagicSugar extends Item {

	public ItemMagicSugar(String unlocalizedName) {
		this.setCreativeTab(UnknownSweetPotatoMod.tabUnknownSweetPotatoMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("unknownsweetpotato:" + unlocalizedName);
	}

}