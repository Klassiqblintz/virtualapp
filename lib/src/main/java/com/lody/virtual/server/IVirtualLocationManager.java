// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/IVirtualLocationManager.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/**
 * Stub interface for IVirtualLocationManager.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IVirtualLocationManager.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IVirtualLocationManager.java {
 private static final String DESCRIPTOR = "com.lody.virtual.server.IVirtualLocationManager.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IVirtualLocationManager.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IVirtualLocationManager.java) {
 return (IVirtualLocationManager.java) iface;
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

 public static class Proxy implements IVirtualLocationManager.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 int getMode(int userId, String pkg); void setMode(int userId, String pkg, int mode);
 void setCell( int userId, String pkg, VCell cell); void setAllCell( int userId, String pkg, List<VCell> cell); void setNeighboringCell( int userId, String pkg, List<VCell> cell);
 void setGlobalCell( VCell cell); void setGlobalAllCell( List<VCell> cell); void setGlobalNeighboringCell( List<VCell> cell);
 VCell getCell( int userId, String pkg); List<VCell> getAllCell( int userId, String pkg); List<VCell> getNeighboringCell( int userId, String pkg);
 void setLocation( int userId, String pkg, VLocation loc); VLocation getLocation( int userId, String pkg);
 void setGlobalLocation( VLocation loc); VLocation getGlobalLocation();
 }
 }
}