package com.tencent.ttpic.util;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.PTFaceAttr.PTFace;
import com.tencent.ttpic.baseutils.BaseUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PTFaceUtil
{
  public static List<float[]> getAllFaceAngles(List<PTFaceAttr.PTFace> paramList)
  {
    AppMethodBeat.i(83940);
    ArrayList localArrayList = new ArrayList();
    if (BaseUtils.isEmpty(paramList))
      AppMethodBeat.o(83940);
    while (true)
    {
      return localArrayList;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localArrayList.add(((PTFaceAttr.PTFace)paramList.next()).getFaceAngle());
      AppMethodBeat.o(83940);
    }
  }

  public static List<List<PointF>> getAllFaces(List<PTFaceAttr.PTFace> paramList)
  {
    AppMethodBeat.i(83939);
    ArrayList localArrayList = new ArrayList();
    if (BaseUtils.isEmpty(paramList))
      AppMethodBeat.o(83939);
    while (true)
    {
      return localArrayList;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localArrayList.add(((PTFaceAttr.PTFace)paramList.next()).getFacePoints());
      AppMethodBeat.o(83939);
    }
  }

  public static Set<Integer> getTriggeredExpression(Map<PTFaceAttr.PTExpression, Boolean> paramMap)
  {
    AppMethodBeat.i(83938);
    HashSet localHashSet = new HashSet();
    if (paramMap == null)
      AppMethodBeat.o(83938);
    while (true)
    {
      return localHashSet;
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (((Boolean)localEntry.getValue()).booleanValue())
          localHashSet.add(Integer.valueOf(((PTFaceAttr.PTExpression)localEntry.getKey()).value));
      }
      AppMethodBeat.o(83938);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PTFaceUtil
 * JD-Core Version:    0.6.2
 */