package xyz.chlamydomonos.clmic.items;

import xyz.chlamydomonos.clmic.core.ChlamydomonosIC;

public class ItemCrushedOre extends MultiIconItem
{
	public ItemCrushedOre()
	{
		super(new String[]{"aluminum", "nickel", "platinum", "mithril"}, "crushed_ore");
		this.setUnlocalizedName("crushedOre");
		this.setCreativeTab(ChlamydomonosIC.tabChlamydomonosIC);
	}
}
