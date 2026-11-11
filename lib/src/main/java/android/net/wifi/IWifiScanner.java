// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/net/wifi/IWifiScanner.aidl
package android.net.wifi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Bundle;

/**
 * Stub interface for IWifiScanner.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface  extends IInterface {
 public static abstract class Stub extends android.os.Binder implements  {
 private static final String DESCRIPTOR = "android.net.wifi.";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IWifiScanner.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof ) {
 return (IWifiScanner) iface;
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

 public static class Proxy implements  {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 Messenger getMessenger();
 Bundle getAvailableChannels(int band);
 }
 }
}