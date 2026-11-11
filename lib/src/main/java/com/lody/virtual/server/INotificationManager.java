// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/INotificationManager.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;
import android.app.Notification;

/**
 * Stub interface for INotificationManager.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface INotificationManager.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements INotificationManager.java {
 private static final String DESCRIPTOR = "com.lody.virtual.server.INotificationManager.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static INotificationManager.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof INotificationManager.java) {
 return (INotificationManager.java) iface;
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

 public static class Proxy implements INotificationManager.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 int dealNotificationId(int id, String packageName, String tag, int userId); String dealNotificationTag(int id, String packageName, String tag, int userId); boolean areNotificationsEnabledForPackage(String packageName, int userId); void setNotificationsEnabledForPackage(String packageName, boolean enable, int userId); void addNotification(int id, String tag, String packageName, int userId); void cancelAllNotification(String packageName, int userId);
 }
 }
}