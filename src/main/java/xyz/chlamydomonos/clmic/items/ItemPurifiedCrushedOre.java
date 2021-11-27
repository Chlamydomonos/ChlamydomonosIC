package xyz.chlamydomonos.clmic.items;

import xyz.chlamydomonos.clmic.core.ChlamydomonosIC;

public class ItemPurifiedCrushedOre extends MultiIconItem
{

	public ItemPurifiedCrushedOre()
	{
		super(new String[]{"aluminum", "nickel", "platinum", "mithril"}, "purified_crushed_ore");
		this.setUnlocalizedName("purifiedCrushedOre");
		this.setCreativeTab(ChlamydomonosIC.tabChlamydomonosIC);
	}

}
