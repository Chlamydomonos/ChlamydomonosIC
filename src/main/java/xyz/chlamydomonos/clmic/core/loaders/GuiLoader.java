package xyz.chlamydomonos.clmic.core.loaders;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xyz.chlamydomonos.clmic.core.ChlamydomonosIC;

public class GuiLoader implements IGuiHandler
{
    public GuiLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(ChlamydomonosIC.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }
}
