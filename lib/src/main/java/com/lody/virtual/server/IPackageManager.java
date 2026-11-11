// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/IPackageManager.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ActivityInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ApplicationInfo;
import android.content.IntentFilter;
import android.content.pm.PermissionInfo;
import android.content.pm.PermissionGroupInfo;

/**
 * Stub interface for IPackageManager.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IPackageManager.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IPackageManager.java {
 private static final String DESCRIPTOR = "com.lody.virtual.server.IPackageManager.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IPackageManager.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IPackageManager.java) {
 return (IPackageManager.java) iface;
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

 public static class Proxy implements IPackageManager.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 int getPackageUid(String packageName, int userId);
 String[] getPackagesForUid(int vuid);
 List<String> getSharedLibraries(String pkgName);
 int checkPermission(String permName, String pkgName, int userId);
 PackageInfo getPackageInfo(String packageName, int flags, int userId);
 ActivityInfo getActivityInfo( ComponentName componentName, int flags, int userId);
 boolean activitySupportsIntent( ComponentName component, Intent intent, String resolvedType); ActivityInfo getReceiverInfo( ComponentName componentName, int flags, int userId);
 ServiceInfo getServiceInfo( ComponentName componentName, int flags, int userId);
 ProviderInfo getProviderInfo( ComponentName componentName, int flags, int userId);
 ResolveInfo resolveIntent( Intent intent, String resolvedType, int flags, int userId);
 List<ResolveInfo> queryIntentActivities( Intent intent, String resolvedType, int flags, int userId);
 List<ResolveInfo> queryIntentReceivers( Intent intent, String resolvedType, int flags, int userId);
 ResolveInfo resolveService( Intent intent, String resolvedType, int flags, int userId);
 List<ResolveInfo> queryIntentServices( Intent intent, String resolvedType, int flags, int userId);
 List<ResolveInfo> queryIntentContentProviders( Intent intent, String resolvedType, int flags, int userId);
 VParceledListSlice getInstalledPackages(int flags, int userId);
 VParceledListSlice getInstalledApplications(int flags, int userId);
 PermissionInfo getPermissionInfo( String name, int flags);
 List<PermissionInfo> queryPermissionsByGroup( String group, int flags);
 PermissionGroupInfo getPermissionGroupInfo( String name, int flags);
 List<PermissionGroupInfo> getAllPermissionGroups(int flags);
 ProviderInfo resolveContentProvider( String name, int flags, int userId);
 ApplicationInfo getApplicationInfo( String packageName, int flags, int userId);
 VParceledListSlice queryContentProviders( String processName, int vuid, int flags);
 List<String> querySharedPackages( String packageName);
 String getNameForUid(int uid);
 IPackageInstaller getPackageInstaller();
 }
 }
}