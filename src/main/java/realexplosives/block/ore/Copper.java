package realexplosives.block.ore;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class Copper extends Block {

public Copper(Material material) {
super(material);
this.setHardness(3.0F);
this.setResistance(5.0F);
this.setStepSound(soundTypeStone);
this.setCreativeTab(getCreativeTabToDisplayOn().tabBlock);
setHarvestLevel("pickaxe",2);

}
@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister iconRegister) {
this.blockIcon = iconRegister.registerIcon(null);
}
}

