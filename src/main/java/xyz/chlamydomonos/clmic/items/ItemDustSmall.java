package xyz.chlamydomonos.clmic.items;

import xyz.chlamydomonos.clmic.core.ChlamydomonosIC;

public class ItemDustSmall extends MultiIconItem
{
	public ItemDustSmall()
	{
		super(new String[]{"aluminum", "nickel", "platinum", "mithril"}, "dust_small");
		this.setUnlocalizedName("dustSmall");
		this.setCreativeTab(ChlamydomonosIC.tabChlamydomonosIC);
	}
}
