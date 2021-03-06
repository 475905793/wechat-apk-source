package com.tencent.mm.plugin.wepkg.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wepkg.model.WePkgDiffInfo;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public class f extends j<e>
{
  public static final String[] fnj;
  private static volatile f uVL;
  private final h fni;
  public final boolean hrm;

  static
  {
    AppMethodBeat.i(63417);
    fnj = new String[] { j.a(e.fjX, "WepkgVersion") };
    uVL = null;
    AppMethodBeat.o(63417);
  }

  private f(h paramh)
  {
    super(paramh, e.fjX, "WepkgVersion", e.diI);
    AppMethodBeat.i(63401);
    this.fni = paramh;
    if (paramh != null);
    for (boolean bool = true; ; bool = false)
    {
      this.hrm = bool;
      if (!this.hrm)
        ab.e("MicroMsg.Wepkg.WepkgVersionStorage", "storage can not work!!!");
      AppMethodBeat.o(63401);
      return;
    }
  }

  public static f dgp()
  {
    AppMethodBeat.i(63400);
    f localf;
    if (!g.RK())
    {
      localf = new f(null);
      AppMethodBeat.o(63400);
    }
    while (true)
    {
      return localf;
      if (uVL == null);
      try
      {
        if ((uVL == null) || (!uVL.hrm))
        {
          localf = new com/tencent/mm/plugin/wepkg/b/f;
          localf.<init>(g.RP().eJN);
          uVL = localf;
        }
        localf = uVL;
        AppMethodBeat.o(63400);
      }
      finally
      {
        AppMethodBeat.o(63400);
      }
    }
  }

  public final boolean B(String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(63411);
    if ((!this.hrm) || (bo.isNullOrNil(paramString1)))
    {
      AppMethodBeat.o(63411);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      e locale = ahF(paramString1);
      if (locale == null)
      {
        AppMethodBeat.o(63411);
        paramBoolean = bool;
      }
      else
      {
        locale.field_bigPackageReady = paramBoolean;
        locale.field_pkgPath = paramString2;
        bool = super.c(locale, new String[0]);
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateBigPackageReady pkgid:%s, pkgPath:%s, bigPackageReady:%b, ret:%s", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
        AppMethodBeat.o(63411);
        paramBoolean = bool;
      }
    }
  }

  public final boolean a(e parame, WePkgDiffInfo paramWePkgDiffInfo)
  {
    AppMethodBeat.i(63410);
    boolean bool;
    if ((!this.hrm) || (bo.isNullOrNil(parame.field_pkgId)))
    {
      AppMethodBeat.o(63410);
      bool = false;
      return bool;
    }
    Object localObject = ahF(parame.field_pkgId);
    if (localObject == null);
    for (long l = com.tencent.mm.plugin.wepkg.utils.d.aNY(); ; l = ((e)localObject).field_accessTime)
    {
      if ((paramWePkgDiffInfo != null) && (!bo.isNullOrNil(paramWePkgDiffInfo.downloadUrl)))
      {
        localObject = dgp().ahF(parame.field_pkgId);
        if ((localObject != null) && (com.tencent.mm.vfs.e.ct(((e)localObject).field_pkgPath)))
        {
          paramWePkgDiffInfo.eBS = ((e)localObject).field_pkgId;
          paramWePkgDiffInfo.uWO = ((e)localObject).field_version;
          paramWePkgDiffInfo.uWP = ((e)localObject).field_pkgPath;
          b.dgn().pI(paramWePkgDiffInfo.eBS);
          localObject = b.dgn();
          a locala = new a();
          locala.field_pkgId = paramWePkgDiffInfo.eBS;
          locala.field_oldVersion = paramWePkgDiffInfo.uWO;
          locala.field_oldPath = paramWePkgDiffInfo.uWP;
          locala.field_version = paramWePkgDiffInfo.version;
          locala.field_downloadUrl = paramWePkgDiffInfo.downloadUrl;
          locala.field_md5 = paramWePkgDiffInfo.cvZ;
          locala.field_pkgSize = paramWePkgDiffInfo.fileSize;
          locala.field_downloadNetType = paramWePkgDiffInfo.uWQ;
          ((b)localObject).b(locala);
          ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "insertDiffPkg");
        }
      }
      dgp().ahE(parame.field_pkgId);
      d.dgo().ahE(parame.field_pkgId);
      parame.field_nextCheckTime = (com.tencent.mm.plugin.wepkg.utils.d.aNY() + parame.field_checkIntervalTime);
      parame.field_createTime = com.tencent.mm.plugin.wepkg.utils.d.aNY();
      parame.field_accessTime = l;
      bool = b(parame);
      ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "insertPkgVersion pkgid:%s, version:%s, ret:%s", new Object[] { parame.field_pkgId, parame.field_version, Boolean.valueOf(bool) });
      AppMethodBeat.o(63410);
      break;
    }
  }

  public final boolean a(String paramString, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    boolean bool = false;
    AppMethodBeat.i(63409);
    if (!this.hrm)
    {
      AppMethodBeat.o(63409);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      e locale = ahF(paramString);
      if (locale == null)
      {
        AppMethodBeat.o(63409);
        paramBoolean = bool;
      }
      else
      {
        locale.field_disableWvCache = paramBoolean;
        locale.field_clearPkgTime = paramLong1;
        locale.field_nextCheckTime = (locale.field_nextCheckTime - locale.field_checkIntervalTime + paramLong2);
        locale.field_checkIntervalTime = paramLong2;
        locale.field_disable = false;
        bool = super.c(locale, new String[0]);
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateConfigInfo pkgid:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(bool) });
        AppMethodBeat.o(63409);
        paramBoolean = bool;
      }
    }
  }

  public final boolean ahE(String paramString)
  {
    AppMethodBeat.i(63407);
    boolean bool;
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(63407);
      bool = false;
    }
    while (true)
    {
      return bool;
      e locale = new e();
      locale.field_pkgId = paramString;
      bool = super.a(locale, new String[0]);
      ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
      AppMethodBeat.o(63407);
    }
  }

  public final e ahF(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(63402);
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(63402);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = rawQuery(String.format("select * from %s where %s=?", new Object[] { "WepkgVersion", "pkgId" }), new String[] { paramString });
      if (localCursor.moveToFirst())
      {
        paramString = new e();
        paramString.d(localCursor);
        localCursor.close();
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid exist record in DB, pkgid:%s, version:%s", new Object[] { paramString.field_pkgId, paramString.field_version });
        AppMethodBeat.o(63402);
      }
      else
      {
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid pkgid:%s, no record in DB", new Object[] { paramString });
        localCursor.close();
        AppMethodBeat.o(63402);
        paramString = localObject;
      }
    }
  }

  public final e ahG(String paramString)
  {
    AppMethodBeat.i(63403);
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
    {
      paramString = null;
      AppMethodBeat.o(63403);
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = rawQuery(String.format("select * from %s where %s=? and %s=0", new Object[] { "WepkgVersion", "pkgId", "disable" }), new String[] { paramString });
      if (localCursor.moveToFirst())
      {
        paramString = new e();
        paramString.d(localCursor);
        localCursor.close();
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble exist record in DB, pkgid:%s, version:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, domain:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s, disable:%s", new Object[] { paramString.field_pkgId, paramString.field_version, Boolean.valueOf(paramString.field_disableWvCache), Long.valueOf(paramString.field_clearPkgTime), Long.valueOf(paramString.field_checkIntervalTime), paramString.field_domain, Boolean.valueOf(paramString.field_bigPackageReady), Boolean.valueOf(paramString.field_preloadFilesReady), Boolean.valueOf(paramString.field_preloadFilesAtomic), Boolean.valueOf(paramString.field_disable) });
        paramString.field_accessTime = com.tencent.mm.plugin.wepkg.utils.d.aNY();
        super.c(paramString, new String[0]);
        AppMethodBeat.o(63403);
      }
      else
      {
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble pkgid:%s, no record in DB", new Object[] { paramString });
        localCursor.close();
        paramString = null;
        AppMethodBeat.o(63403);
      }
    }
  }

  public final boolean ahH(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(63408);
    if (!this.hrm)
      AppMethodBeat.o(63408);
    while (true)
    {
      return bool;
      e locale = ahF(paramString);
      if (locale == null)
      {
        AppMethodBeat.o(63408);
      }
      else
      {
        locale.field_nextCheckTime = (com.tencent.mm.plugin.wepkg.utils.d.aNY() + locale.field_checkIntervalTime);
        bool = super.c(locale, new String[0]);
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCheckTime pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
        AppMethodBeat.o(63408);
      }
    }
  }

  public final boolean ahI(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(63413);
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(63413);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(hY("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[] { "WepkgVersion", "autoDownloadCount", "autoDownloadCount", "pkgId", paramString }))) });
      AppMethodBeat.o(63413);
    }
  }

  public final boolean ahJ(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(63414);
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(63414);
      bool = false;
    }
    while (true)
    {
      return bool;
      e locale = ahF(paramString);
      if (locale == null)
      {
        AppMethodBeat.o(63414);
      }
      else
      {
        locale.field_disable = true;
        bool = super.c(locale, new String[0]);
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "setWepkgDisable pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
        AppMethodBeat.o(63414);
      }
    }
  }

  public final boolean ahK(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(63415);
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(63415);
    while (true)
    {
      return bool;
      e locale = ahF(paramString);
      if (locale == null)
      {
        AppMethodBeat.o(63415);
      }
      else
      {
        locale.field_createTime = 0L;
        bool = super.c(locale, new String[0]);
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCreateTimeToZero pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
        AppMethodBeat.o(63415);
      }
    }
  }

  public final boolean bP(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(63412);
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(63412);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      e locale = ahF(paramString);
      if (locale == null)
      {
        AppMethodBeat.o(63412);
        paramBoolean = bool;
      }
      else
      {
        locale.field_preloadFilesReady = paramBoolean;
        bool = super.c(locale, new String[0]);
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "updatePreloadFilesReady pkgid:%s, preloadFilesReady:%b, ret:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
        AppMethodBeat.o(63412);
        paramBoolean = bool;
      }
    }
  }

  public final List<String> dgq()
  {
    AppMethodBeat.i(63404);
    Object localObject;
    if (!this.hrm)
    {
      localObject = null;
      AppMethodBeat.o(63404);
    }
    while (true)
    {
      return localObject;
      Cursor localCursor = rawQuery(String.format("select %s from %s where %s < ?", new Object[] { "pkgId", "WepkgVersion", "nextCheckTime" }), new String[] { String.valueOf(com.tencent.mm.plugin.wepkg.utils.d.aNY()) });
      localObject = new ArrayList();
      if (localCursor != null)
      {
        if (localCursor.moveToFirst())
          do
          {
            String str = localCursor.getString(0);
            if (!bo.isNullOrNil(str))
              ((List)localObject).add(str);
          }
          while (localCursor.moveToNext());
        localCursor.close();
      }
      AppMethodBeat.o(63404);
    }
  }

  public final List<String> dgr()
  {
    AppMethodBeat.i(63405);
    Object localObject;
    if (!this.hrm)
    {
      localObject = null;
      AppMethodBeat.o(63405);
    }
    while (true)
    {
      return localObject;
      Cursor localCursor = rawQuery(String.format("select %s from %s order by %s asc", new Object[] { "pkgId", "WepkgVersion", "accessTime" }), new String[0]);
      localObject = new ArrayList();
      if (localCursor != null)
      {
        if (localCursor.moveToFirst())
          do
          {
            String str = localCursor.getString(0);
            if (!bo.isNullOrNil(str))
              ((List)localObject).add(str);
          }
          while (localCursor.moveToNext());
        localCursor.close();
      }
      AppMethodBeat.o(63405);
    }
  }

  public final List<WepkgVersion> dgs()
  {
    Object localObject1 = null;
    AppMethodBeat.i(63406);
    if (!this.hrm)
      AppMethodBeat.o(63406);
    while (true)
    {
      return localObject1;
      Object localObject2 = String.format("select * from %s where %s < ? - %s", new Object[] { "WepkgVersion", "accessTime", "clearPkgTime" });
      Cursor localCursor = rawQuery((String)localObject2, new String[] { String.valueOf(com.tencent.mm.plugin.wepkg.utils.d.aNY()) });
      ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "getNeedCleanRecords queryStr:%s", new Object[] { localObject2 });
      if (localCursor == null)
      {
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "cursor is null");
        AppMethodBeat.o(63406);
      }
      else if (localCursor.moveToFirst())
      {
        localObject1 = new ArrayList();
        do
        {
          WepkgVersion localWepkgVersion = new WepkgVersion();
          localObject2 = new e();
          ((e)localObject2).d(localCursor);
          localWepkgVersion.a((e)localObject2);
          ((List)localObject1).add(localWepkgVersion);
        }
        while (localCursor.moveToNext());
        localCursor.close();
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject1).size()) });
        AppMethodBeat.o(63406);
      }
      else
      {
        localCursor.close();
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "no record");
        AppMethodBeat.o(63406);
      }
    }
  }

  public final boolean dgt()
  {
    boolean bool = false;
    AppMethodBeat.i(63416);
    if (!this.hrm)
      AppMethodBeat.o(63416);
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord clearWepkg ret:%s", new Object[] { Boolean.valueOf(hY("WepkgVersion", String.format("delete from %s", new Object[] { "WepkgVersion" }))) });
      ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord clearWepkg ret:%s", new Object[] { Boolean.valueOf(hY("WepkgPreloadFiles", String.format("delete from %s", new Object[] { "WepkgPreloadFiles" }))) });
      AppMethodBeat.o(63416);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.b.f
 * JD-Core Version:    0.6.2
 */