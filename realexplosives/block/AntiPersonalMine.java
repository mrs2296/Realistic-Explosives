package realexplosives.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class AntiPersonalMine extends Block {

public AntiPersonalMine(Material material) {
super(material);
this.setHardness(3.0F);
this.setResistance(5.0F);
this.setStepSound(soundTypeStone);
this.setCreativeTab(getCreativeTabToDisplayOn().tabBlock);

}
@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister iconRegister) {
this.blockIcon = iconRegister.registerIcon(null);
}
}



