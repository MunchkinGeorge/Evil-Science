package munchkingeorge.evil_science.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class StandModel extends ModelBase
{
	//fields
    ModelRenderer Base;
    ModelRenderer Stand;
    ModelRenderer BookPageLeft;
    ModelRenderer BookPageRight;
    ModelRenderer BookMiddle;
  
  public StandModel()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 16, 10, 16);
      Base.setRotationPoint(-8F, 14F, -8F);
      Base.setTextureSize(128, 64);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Stand = new ModelRenderer(this, 64, 0);
      Stand.addBox(0F, 0F, 0F, 12, 10, 1);
      Stand.setRotationPoint(-6F, 6F, 4F);
      Stand.setTextureSize(128, 64);
      Stand.mirror = true;
      setRotation(Stand, -0.4886922F, 0F, 0F);
      BookPageLeft = new ModelRenderer(this, 64, 11);
      BookPageLeft.addBox(0F, 0F, 0F, 5, 6, 1);
      BookPageLeft.setRotationPoint(-5F, 7F, 1F);
      BookPageLeft.setTextureSize(128, 64);
      BookPageLeft.mirror = true;
      setRotation(BookPageLeft, -0.4886922F, -0.2030365F, 0F);
      BookPageRight = new ModelRenderer(this, 76, 11);
      BookPageRight.addBox(0F, 0F, 0F, 5, 6, 1);
      BookPageRight.setRotationPoint(0F, 7F, 2F);
      BookPageRight.setTextureSize(128, 64);
      BookPageRight.mirror = true;
      setRotation(BookPageRight, -0.4886922F, 0.1978728F, 0F);
      BookMiddle = new ModelRenderer(this, 64, 18);
      BookMiddle.addBox(0F, 0F, 0F, 2, 7, 2);
      BookMiddle.setRotationPoint(-1F, 6.5F, 2F);
      BookMiddle.setTextureSize(128, 64);
      BookMiddle.mirror = true;
      setRotation(BookMiddle, -0.4886922F, 0F, 0F);
  }

	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Base.render(f5);
	    Stand.render(f5);
	    BookPageLeft.render(f5);
	    BookPageRight.render(f5);
	    BookMiddle.render(f5);
	  }



	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	  {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  }

	}
