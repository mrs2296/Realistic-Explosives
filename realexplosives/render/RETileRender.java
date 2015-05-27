package realexplosives.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RETileRender extends TileEntitySpecialRenderer
{
	public RETileRender()
	{
		
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f)
	{
		Tessellator t = Tessellator.instance;
		
		double d1 = 0.1D;
		double d2 = 0.2D;
		double d3 = 0.3D;
		double d4 = 0.4D;
		
		GL11.glPushMatrix();
		
		//Rear face
		t.addVertexWithUV(d3, y + 1.0D, d4, p_78374_7_, p_78374_9_);
		t.addVertexWithUV(d3 + d4, y + 1.0D, d4, p_78374_7_, p_78374_9_);
		t.addVertexWithUV(d3 + d4, y + 1.0D, d4 + d2, p1, p2);
		t.addVertexWithUV(d3, y + 1.0D, d4 + d2, p1, p2);
		
		
		
	}
}
