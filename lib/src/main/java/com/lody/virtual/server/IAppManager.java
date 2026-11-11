// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/IAppManager.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/**
 * Stub interface for IAppManager.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IAppManager.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IAppManager.java {
 private static final String DESCRIPTOR = "com.lody.virtual.server.IAppManager.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IAppManager.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IAppManager.java) {
 return (IAppManager.java) iface;
 }
 return new Proxy(obj);
 }

 @Override
 public IBinder asBinder() { return this; }

 @Override
 public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
 switch (code) {
 case android.os.IBinder.INTERFACE_TRANSACTION:
 reply.writeString(DESCRIPTOR);
 return true;
 default:
 return super.onTransact(code, data, reply, flags);
 }
 }

 public static class Proxy implements IAppManager.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 int[] getPackageInstalledUsers(String packageName); void scanApps(); void addVisibleOutsidePackage(String pkg); void removeVisibleOutsidePackage(String pkg); boolean isOutsidePackageVisible(String pkg); InstalledAppInfo getInstalledAppInfo(String pkg, int flags); InstallResult installPackage(String path, int flags); boolean isPackageLaunched(int userId, String packageName); void setPackageHidden(int userId, String packageName, boolean hidden); boolean installPackageAsUser(int userId, String packageName); boolean uninstallPackageAsUser(String packageName, int userId); boolean uninstallPackage(String packageName); boolean clearPackageAsUser(int userId, String packageName); boolean clearPackage(String packageName); List<InstalledAppInfo> getInstalledApps(int flags); List<InstalledAppInfo> getInstalledAppsAsUser(int userId, int flags); int getInstalledAppCount(); boolean isAppInstalled(String packageName); boolean isAppInstalledAsUser(int userId, String packageName);
 void registerObserver(IPackageObserver observer); void unregisterObserver(IPackageObserver observer);
 void setAppRequestListener(IAppRequestListener listener); void clearAppRequestListener(); IAppRequestListener getAppRequestListener();
 }
 }
}