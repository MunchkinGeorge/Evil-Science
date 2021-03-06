// Date: 19/10/2013 11:42:21
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package munchkingeorge.evil_science.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRobot extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Rod;
    ModelRenderer Antenia;
  
  public ModelRobot()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(0F, 0F, 0F, 8, 8, 8);
      Head.setRotationPoint(-4F, 13F, -4F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Rod = new ModelRenderer(this, 32, 0);
      Rod.addBox(0F, 0F, 0F, 1, 4, 1);
      Rod.setRotationPoint(-0.5F, 10F, 4F);
      Rod.setTextureSize(64, 32);
      Rod.mirror = true;
      setRotation(Rod, -0.418879F, 0F, 0F);
      Antenia = new ModelRenderer(this, 36, 0);
      Antenia.addBox(0F, 0F, 0F, 2, 2, 2);
      Antenia.setRotationPoint(-1F, 8F, 4.4F);
      Antenia.setTextureSize(64, 32);
      Antenia.mirror = true;
      setRotation(Antenia, -0.418879F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Rod.render(f5);
    Antenia.render(f5);
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
