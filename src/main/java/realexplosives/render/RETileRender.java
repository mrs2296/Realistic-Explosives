package realexplosives.render;

import org.lwjgl.opengl.GL11;

import realexplosives.core.RealisticExplosives;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RETileRender extends TileEntitySpecialRenderer
{
	private ResourceLocation texture;
	
	public RETileRender()
	{
		texture = null; 
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f)
	{
		int metadata = tile.getBlockMetadata();
		Tessellator t = Tessellator.instance;
		
		//Depth
		double d1 = 0.1D;
		//Height
		double d2 = 0.2D;
		//Left point
		double d3 = 0.3D;
		//Width
		double d4 = 0.4D;
		
		GL11.glPushMatrix();
		GL11.glTranslated(x,y,z);
		
		//North
		if(metadata == 1)
		{
			GL11.glTranslated(0, 0, 1);
			GL11.glRotated(-90, 1, 0, 0);
		}
		
		//South
		if(metadata == 2)
		{
			GL11.glTranslated(0,1,0);
			GL11.glRotated(90, 1, 0, 0);
		}
		
		//West
		if(metadata == 3)
		{
			GL11.glRotated(90, 0, 1, 0);
			GL11.glTranslated(-1, 0, 0);
			GL11.glTranslated(0, 0, 1);
			GL11.glRotated(-90, 1, 0, 0);
		}
		
		//East
		if(metadata == 4)
		{
			GL11.glRotated(90, 0, 1, 0);
			GL11.glTranslated(-1, 0, 0);
			GL11.glTranslated(0,1,0);
			GL11.glRotated(90, 1, 0, 0);
		}
		
		//Top
		if(metadata == 5)
		{
			
		}
		
		//Top (Facing)
		t.startDrawingQuads();
		this.bindTexture(this.setTexture(new ResourceLocation(RealisticExplosives.ID, RealisticExplosives.TEXTURE_PATH + "tile_front.png")));
		t.addVertexWithUV(d3, d1, d4, 1, 0);
		t.addVertexWithUV(d3, d1, d4 + d2, 1, 1);
		t.addVertexWithUV(d3 + d4, d1, d4 + d2, 0, 1);
		t.addVertexWithUV(d3 + d4, d1, d4, 0, 0);
		t.draw();
		
		//Front (Left side)
		t.startDrawingQuads();
		t.addVertexWithUV(d3, d1, d4, 0, 0);
		t.addVertexWithUV(d3, 0.0D, d4, 0, 1);
		t.addVertexWithUV(d3, 0.0D, d4 + d2, 1, 1);
		t.addVertexWithUV(d3, d1, d4 + d2, 1, 0);
		t.draw();
		
		//Rear (Right side)
		t.startDrawingQuads();
		t.addVertexWithUV(d3 + d4, d1, d4, 0, 0);
		t.addVertexWithUV(d3 + d4, d1, d4 + d2, 1, 0);
		t.addVertexWithUV(d3 + d4, 0.0D, d4 + d2, 1, 1);
		t.addVertexWithUV(d3 + d4, 0.0D, d4, 0, 1);
		t.draw();
		
		//Left (Long edge top)
		t.startDrawingQuads();
		t.addVertexWithUV(d3, d1, d4, 0, 0);
		t.addVertexWithUV(d3 + d4, d1, d4, 1, 0);
		t.addVertexWithUV(d3 + d4, 0.0D, d4, 1, 1);
		t.addVertexWithUV(d3, 0.0D, d4, 0, 1);
		t.draw();
		
		//Right (Long edge bottom)
		t.startDrawingQuads();
		t.addVertexWithUV(d3, d1, d4 + d2, 0, 0);
		t.addVertexWithUV(d3, 0.0D, d4 + d2, 1, 0);
		t.addVertexWithUV(d3 + d4, 0.0D, d4 + d2, 1, 1);
		t.addVertexWithUV(d3 + d4, d1, d4 + d2, 0, 1);
		t.draw();
		
		//Bottom (Obscured)
		t.startDrawingQuads();
		this.bindTexture(this.setTexture(new ResourceLocation(RealisticExplosives.ID, RealisticExplosives.TEXTURE_PATH + "tile_rear.png")));
		t.addVertexWithUV(d3, 0.0D, d4, 0, 0);
		t.addVertexWithUV(d3 + d4, 0.0D, d4, 1, 0);
		t.addVertexWithUV(d3 + d4, 0.0D, d4 + d2, 1, 1);
		t.addVertexWithUV(d3, 0.0D, d4 + d2, 0, 1);
		t.draw();
		
		GL11.glPopMatrix();
		
	}
	
	public ResourceLocation setTexture(ResourceLocation texture)
	{
		this.texture = texture;
		return this.texture;
	}
}
