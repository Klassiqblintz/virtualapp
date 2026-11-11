// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/interfaces/IPackageObserver.aidl
package com.lody.virtual.server.interfaces;

import android.os.IBinder;
import android.os.IInterface;

/**
 * Stub interface for IPackageObserver.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IPackageObserver.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IPackageObserver.java {
 private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IPackageObserver.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IPackageObserver.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IPackageObserver.java) {
 return (IPackageObserver.java) iface;
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

 public static class Proxy implements IPackageObserver.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 void onPackageInstalled( String packageName); void onPackageUninstalled( String packageName); void onPackageInstalledAsUser( int userId, String packageName); void onPackageUninstalledAsUser( int userId, String packageName);
 }
 }
}