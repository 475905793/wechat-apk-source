package com.tencent.ttpic.facedetect;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class FaceStatus
{
  public float[] denseFaceModel;
  public int illumination_score;
  public float pitch;
  public float roll;
  public float scale;
  public float[] transform;
  public float tx;
  public float ty;
  public float[] xys;
  public float yaw;

  public FaceStatus()
  {
    AppMethodBeat.i(49936);
    this.xys = new float['¼'];
    AppMethodBeat.o(49936);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.facedetect.FaceStatus
 * JD-Core Version:    0.6.2
 */