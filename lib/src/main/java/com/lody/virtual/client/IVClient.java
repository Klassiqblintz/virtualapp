// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/client/IVClient.aidl
package com.lody.virtual.client;

import android.os.IBinder;
import android.os.IInterface;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;

/**
 * Stub interface for IVClient.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IVClient.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IVClient.java {
 private static final String DESCRIPTOR = "com.lody.virtual.client.IVClient.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IVClient.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IVClient.java) {
 return (IVClient.java) iface;
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

 public static class Proxy implements IVClient.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 void scheduleReceiver( String processName, ComponentName component, Intent intent, PendingResultData resultData); void scheduleNewIntent( String creator, IBinder token, Intent intent); void finishActivity( IBinder token); IBinder createProxyService( ComponentName component, IBinder binder); IBinder acquireProviderClient( ProviderInfo info); IBinder getAppThread(); IBinder getToken(); String getDebugInfo();
 }
 }
}