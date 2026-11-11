// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/IVirtualStorageService.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;

/**
 * Stub interface for IVirtualStorageService.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IVirtualStorageService.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IVirtualStorageService.java {
 private static final String DESCRIPTOR = "com.lody.virtual.server.IVirtualStorageService.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IVirtualStorageService.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IVirtualStorageService.java) {
 return (IVirtualStorageService.java) iface;
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

 public static class Proxy implements IVirtualStorageService.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 void setVirtualStorage( String packageName, int userId, String vsPath);
 String getVirtualStorage( String packageName, int userId);
 void setVirtualStorageState( String packageName, int userId, boolean enable);
 boolean isVirtualStorageEnable( String packageName, int userId);
 }
 }
}