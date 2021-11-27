package xyz.chlamydomonos.clmic.items;

import xyz.chlamydomonos.clmic.core.ChlamydomonosIC;

public class ItemDust extends MultiIconItem
{
	public ItemDust()
	{
		super(new String[]{"aluminum", "nickel", "platinum", "mithril"}, "dust");
		this.setUnlocalizedName("dust");
		this.setCreativeTab(ChlamydomonosIC.tabChlamydomonosIC);
	}
}
