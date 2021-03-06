package com.tencent.ttpic.computeshader;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.particle.ParticleUtil;
import com.tencent.ttpic.particle.Vector2;
import com.tencent.ttpic.particle.Vector4;
import java.util.Random;

public class ComputeParticleCPU
{
  private static final int PARTICLE_COUNT = 131072;
  private static float frameTimer = 0.033F;
  private Particle[] particles;
  private float timer;
  private UBO ubo;

  public ComputeParticleCPU()
  {
    AppMethodBeat.i(81851);
    this.particles = new Particle[131072];
    Random localRandom = new Random(System.currentTimeMillis());
    for (int i = 0; i < 131072; i++)
    {
      Particle localParticle = new Particle();
      localParticle.pos = new Vector2(localRandom.nextFloat() * 2.0F - 1.0F, localRandom.nextFloat() * 2.0F - 1.0F);
      localParticle.vel = new Vector2(0.0F, 0.0F);
      localParticle.gradientPos = new Vector4();
      localParticle.gradientPos.r = (localParticle.pos.x / 2.0F);
      this.particles[i] = localParticle;
    }
    updateUniformBuffer();
    AppMethodBeat.o(81851);
  }

  private Vector2 attraction(Vector2 paramVector21, Vector2 paramVector22)
  {
    AppMethodBeat.i(81854);
    paramVector21 = ParticleUtil.vectorSubtract(paramVector22, paramVector21);
    float f = (float)(1.0D / Math.sqrt(ParticleUtil.dot(paramVector21, paramVector21) + 0.5F));
    paramVector21 = ParticleUtil.vectorMultiplyScalar(paramVector21, f * (f * f) * 0.0035F);
    AppMethodBeat.o(81854);
    return paramVector21;
  }

  private void updateUniformBuffer()
  {
    AppMethodBeat.i(81852);
    this.ubo = new UBO();
    this.ubo.deltaT = (frameTimer * 2.5F);
    this.ubo.destX = ((float)(Math.sin(Math.toRadians(this.timer * 360.0F)) * 0.75D));
    this.ubo.destY = 0.0F;
    this.ubo.particleCount = 131072;
    AppMethodBeat.o(81852);
  }

  public void compute()
  {
    AppMethodBeat.i(81853);
    int i = 0;
    if (i < 131072)
    {
      Vector2 localVector21 = this.particles[i].vel;
      Vector2 localVector22 = this.particles[i].pos;
      Vector2 localVector23 = new Vector2(this.ubo.destX, this.ubo.destY);
      Object localObject = ParticleUtil.vectorSubtract(localVector23, localVector22);
      Math.sqrt(ParticleUtil.dot((Vector2)localObject, (Vector2)localObject));
      localObject = ParticleUtil.vectorAdd(localVector21, ParticleUtil.vectorMultiplyScalar(repulsion(localVector22, localVector23), 0.05F));
      localVector22 = ParticleUtil.vectorAdd(localVector22, ParticleUtil.vectorMultiplyScalar((Vector2)localObject, this.ubo.deltaT));
      if ((localVector22.x < -1.0D) || (localVector22.x > 1.0D) || (localVector22.y < -1.0D) || (localVector22.y > 1.0D))
        localObject = ParticleUtil.vectorAdd(ParticleUtil.vectorMultiplyScalar(ParticleUtil.revert((Vector2)localObject), 0.1F), ParticleUtil.vectorMultiplyScalar(attraction(localVector22, localVector23), 12.0F));
      while (true)
      {
        this.particles[i].vel = ((Vector2)localObject);
        localObject = this.particles[i].gradientPos;
        ((Vector4)localObject).r = ((float)(((Vector4)localObject).r + 0.02D * this.ubo.deltaT));
        if (this.particles[i].gradientPos.r > 1.0D)
        {
          localObject = this.particles[i].gradientPos;
          ((Vector4)localObject).r = ((float)(((Vector4)localObject).r - 1.0D));
        }
        i++;
        break;
        this.particles[i].pos = localVector22;
      }
    }
    this.timer += frameTimer * 0.04F;
    if (this.timer > 1.0F)
      this.timer = 0.0F;
    AppMethodBeat.o(81853);
  }

  Vector2 repulsion(Vector2 paramVector21, Vector2 paramVector22)
  {
    AppMethodBeat.i(81855);
    paramVector21 = ParticleUtil.vectorSubtract(paramVector22, paramVector21);
    float f = (float)Math.sqrt(ParticleUtil.dot(paramVector21, paramVector21));
    paramVector21 = ParticleUtil.vectorMultiplyScalar(paramVector21, 1.0F / (f * (f * f)) * -3.5E-005F);
    AppMethodBeat.o(81855);
    return paramVector21;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.computeshader.ComputeParticleCPU
 * JD-Core Version:    0.6.2
 */