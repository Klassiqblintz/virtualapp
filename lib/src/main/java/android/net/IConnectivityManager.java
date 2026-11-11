// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/net/IConnectivityManager.aidl
package android.net;

import android.os.IBinder;
import android.os.IInterface;
import android.net.NetworkInfo;
import android.net.LinkProperties;

/**
 * Stub interface for IConnectivityManager.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IConnectivityManager.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IConnectivityManager.java {
 private static final String DESCRIPTOR = "android.net.IConnectivityManager.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IConnectivityManager.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IConnectivityManager.java) {
 return (IConnectivityManager.java) iface;
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

 public static class Proxy implements IConnectivityManager.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 NetworkInfo getActiveNetworkInfo(); NetworkInfo getActiveNetworkInfoForUid(int uid, boolean ignoreBlocked);
 NetworkInfo getNetworkInfo(int networkType); NetworkInfo[] getAllNetworkInfo(); boolean isActiveNetworkMetered(); boolean requestRouteToHostAddress(int networkType, int address); LinkProperties getActiveLinkProperties(); LinkProperties getLinkProperties(int networkType);
 }
 }
}