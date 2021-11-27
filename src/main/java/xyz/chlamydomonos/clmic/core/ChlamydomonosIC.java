package xyz.chlamydomonos.clmic.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import xyz.chlamydomonos.clmic.core.loaders.ItemLoader;
import xyz.chlamydomonos.clmic.core.proxy.CommonProxy;

@Mod(modid = ChlamydomonosIC.MODID, name = ChlamydomonosIC.NAME, version = ChlamydomonosIC.VERSION, acceptedMinecraftVersions = "1.7.10", dependencies = "required-after:IC2@[2.2.828,)")
public class ChlamydomonosIC
{
	public static final String MODID = "clmic";
	public static final String NAME = "ChlamydomonosIC";
	public static final String VERSION = "2.0.0";
	
	public static CreativeTabs tabChlamydomonosIC = new CreativeTabs("clmic") {
		public net.minecraft.item.Item getTabIconItem() 
		{
			return ItemLoader.CRUSHED_ORE;
		};
	};
	
	@Instance(ChlamydomonosIC.MODID)
	public static ChlamydomonosIC instance;
	
	@SidedProxy(clientSide = "xyz.chlamydomonos.clmic.core.proxy.ClientProxy", serverSide = "xyz.chlamydomonos.clmic.core.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}
